package user

import (
	"context"
	"sync/atomic"

	userapi "github.com/heimonsy/micro/gen/proto/go/apis/user"
	"google.golang.org/grpc/codes"
	"google.golang.org/grpc/status"
	// This import path is based on the name declaration in the go.mod,
	// and the gen/proto/go output location in the buf.gen.yaml.
)

type User struct {
	UserID   uint64
	Username string
	Nickname string
	Gender   userapi.Gender
}

// UserService implements the PetStoreService API.
type UserService struct {
	increaseID  uint64
	uidMap      map[uint64]*User
	usernameMap map[string]*User
}

func (s *UserService) Register(ctx context.Context, req *userapi.RegisterRequest) (*userapi.RegisterResponse, error) {
	if len(req.Username) <= 0 {
		return nil, status.Errorf(codes.InvalidArgument, "username can't be empty")
	}
	if _, exists := s.usernameMap[req.GetUsername()]; exists {
		return nil, status.Errorf(codes.InvalidArgument, "username already exists")
	}

	user := &User{
		UserID:   atomic.AddUint64(&s.increaseID, 1),
		Username: req.GetUsername(),
		Nickname: req.GetNickname(),
		Gender:   req.GetGender(),
	}
	s.uidMap[user.UserID] = user
	s.usernameMap[user.Username] = user

	return &userapi.RegisterResponse{}, nil
}

func (s *UserService) GetUser(ctx context.Context, req *userapi.GetUserRequest) (*userapi.GetUserResponse, error) {
	var user *User
	switch v := req.By.(type) {
	case *userapi.GetUserRequest_UserId:
		user = s.uidMap[v.UserId]
	case *userapi.GetUserRequest_Username:
		user = s.usernameMap[v.Username]
	default:
		return nil, status.Errorf(codes.Unimplemented, "implemented get user by %v", req.By)
	}
	if user == nil {
		return nil, status.Errorf(codes.NotFound, "user %v not found", req.By)
	}

	return &userapi.GetUserResponse{
		UserId:   user.UserID,
		Nickname: user.Nickname,
		Gender:   userapi.Gender_GENDER_MALE,
	}, nil
}

func (s *UserService) Push(*userapi.PushRequest, userapi.UserService_PushServer) error {
	return status.Errorf(codes.Unimplemented, "method Push not implemented")
}
