package user

import (
	"context"

	userapi "github.com/heimonsy/micro/gen/proto/go/apis/user"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/status"
	// This import path is based on the name declaration in the go.mod,
	// and the gen/proto/go output location in the buf.gen.yaml.
)

// UserService implements the PetStoreService API.
type UserService struct {
}

func (s *UserService) Register(context.Context, *userapi.RegisterRequest) (*userapi.RegisterResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Register not implemented")
}

func (s *UserService) GetUser(context.Context, *userapi.GetUserRequest) (*userapi.GetUserResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetUser not implemented")
}

func (s *UserService) Push(*userapi.PushRequest, userapi.UserService_PushServer) error {
	return status.Errorf(codes.Unimplemented, "method Push not implemented")
}
