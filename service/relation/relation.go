package relation

import (
	"context"

	"github.com/emirpasic/gods/sets/hashset"
	relationapi "github.com/heimonsy/micro/gen/proto/go/apis/relation"
	userapi "github.com/heimonsy/micro/gen/proto/go/apis/user"
	"github.com/heimonsy/micro/tools/clix"
)

// relationService implements the PetStoreService API.
type relationService struct {
	UserCli userapi.UserServiceClient

	following map[uint64]*hashset.Set
	follower  map[uint64]*hashset.Set
}

func NewRelationService() (relationapi.RelationServiceServer, error) {
	userCli, err := clix.NewUserClient()
	if err != nil {
		return nil, err
	}

	return &relationService{
		UserCli:   userCli,
		following: make(map[uint64]*hashset.Set),
		follower:  make(map[uint64]*hashset.Set),
	}, nil
}

func (s *relationService) getFollowingSet(userID uint64) *hashset.Set {
	following := s.following[userID]
	if following == nil {
		following = hashset.New()
		s.following[userID] = following
	}
	return following
}

func (s *relationService) getFollowerSet(userID uint64) *hashset.Set {
	follower := s.follower[userID]
	if follower == nil {
		follower = hashset.New()
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
	var followers []uint64
	for _, v := range s.getFollowerSet(req.GetUserId()).Values() {
		followers = append(followers, v.(uint64))
	}
	return &relationapi.GetFollowersResponse{
		Followers: followers,
	}, nil
}

// GetFollowings
func (s *relationService) GetFollowings(
	ctx context.Context,
	req *relationapi.GetFollowingsRequest,
) (*relationapi.GetFollowingsResponse, error) {
	var followings []uint64
	for _, v := range s.getFollowingSet(req.GetUserId()).Values() {
		followings = append(followings, v.(uint64))
	}
	return &relationapi.GetFollowingsResponse{
		Followings: followings,
	}, nil
}
