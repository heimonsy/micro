package relation

import (
	"context"

	relationapi "github.com/heimonsy/micro/gen/proto/go/apis/relation"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/status"
)

// RelationService implements the PetStoreService API.
type RelationService struct {
}

func (s *RelationService) FollowUser(context.Context, *relationapi.FollowUserRequest) (*relationapi.FollowUserResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method FollowUser not implemented")
}

func (s *RelationService) GetFollowers(context.Context, *relationapi.GetFollowersRequest) (*relationapi.GetFollowersResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetFollowers not implemented")
}

func (s *RelationService) GetFollowings(context.Context, *relationapi.GetFollowingsRequest) (*relationapi.GetFollowingsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetFollowings not implemented")
}
