package relation

import (
	"context"

	relationapi "github.com/heimonsy/micro/gen/proto/go/apis/relation"
	userapi "github.com/heimonsy/micro/gen/proto/go/apis/user"
	"github.com/heimonsy/micro/tools"
	"github.com/heimonsy/micro/tools/clix"
)

// relationService implements the PetStoreService API.
type relationService struct {
	UserCli userapi.UserServiceClient

	following map[uint64]tools.Set[uint64]
	follower  map[uint64]tools.Set[uint64]
}

func NewRelationService() (relationapi.RelationServiceServer, error) {
	userCli, err := clix.NewUserClient()
	if err != nil {
		return nil, err
	}

	return &relationService{
		UserCli:   userCli,
		following: make(map[uint64]tools.Set[uint64]),
		follower:  make(map[uint64]tools.Set[uint64]),
	}, nil
}

func (s *relationService) getFollowingSet(userID uint64) tools.Set[uint64] {
	following := s.following[userID]
	if following == nil {
		following = tools.NewConcurrentSafeMapSet[uint64]()
		s.following[userID] = following
	}
	return following
}

func (s *relationService) getFollowerSet(userID uint64) tools.Set[uint64] {
	follower := s.follower[userID]
	if follower == nil {
		follower = tools.NewConcurrentSafeMapSet[uint64]()
		s.follower[userID] = follower
	}
	return follower
}

// FollowUser
func (s *relationService) FollowUser(
	ctx context.Context,
	req *relationapi.FollowUserRequest,
) (*relationapi.FollowUserResponse, error) {
	userResp, err := s.UserCli.GetUser(ctx, &userapi.GetUserRequest{
		By: &userapi.GetUserRequest_UserId{
			UserId: req.GetUserId(),
		},
	})
	if err != nil {
		return nil, err
	}

	followUserResp, err := s.UserCli.GetUser(ctx, &userapi.GetUserRequest{
		By: &userapi.GetUserRequest_UserId{
			UserId: req.GetFollowUserId(),
		},
	})
	if err != nil {
		return nil, err
	}
	s.getFollowingSet(userResp.UserId).Add(followUserResp.UserId)
	s.getFollowerSet(followUserResp.UserId).Add(userResp.UserId)

	return &relationapi.FollowUserResponse{}, nil
}

// GetFollowers
func (s *relationService) GetFollowers(
	ctx context.Context,
	req *relationapi.GetFollowersRequest,
) (*relationapi.GetFollowersResponse, error) {
	return &relationapi.GetFollowersResponse{
		Followers: s.getFollowerSet(req.GetUserId()).Values(),
	}, nil
}

// GetFollowings
func (s *relationService) GetFollowings(
	ctx context.Context,
	req *relationapi.GetFollowingsRequest,
) (*relationapi.GetFollowingsResponse, error) {
	return &relationapi.GetFollowingsResponse{
		Followings: s.getFollowingSet(req.GetUserId()).Values(),
	}, nil
}
