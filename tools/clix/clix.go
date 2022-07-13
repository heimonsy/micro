package clix

import (
	"context"

	"github.com/heimonsy/micro/gen/proto/go/apis/relation"
	"github.com/heimonsy/micro/gen/proto/go/apis/user"
	"google.golang.org/grpc"
)

func NewUserClient() (user.UserServiceClient, error) {
	cli, err := grpc.DialContext(
		context.Background(),
		"dns:///micro-user-headless:8080",
		grpc.WithInsecure(),
		grpc.WithDefaultServiceConfig(`{"loadBalancingPolicy":"round_robin"}`),
	)
	if err != nil {
		return nil, err
	}
	return user.NewUserServiceClient(cli), nil
}

func NewRelationClient() (relation.RelationServiceClient, error) {
	cli, err := grpc.DialContext(
		context.Background(),
		"dns:///micro-relation-headless:8080",
		grpc.WithInsecure(),
		grpc.WithDefaultServiceConfig(`{"loadBalancingPolicy":"round_robin"}`),
	)
	if err != nil {
		return nil, err
	}
	return relation.NewRelationServiceClient(cli), nil
}
