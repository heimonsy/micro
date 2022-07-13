package md

import (
	"context"
	"log"

	"google.golang.org/grpc"
)

func MakeStreamServerInterceptor() grpc.StreamServerInterceptor {
	return func(srv interface{}, ss grpc.ServerStream, info *grpc.StreamServerInfo, handler grpc.StreamHandler) error {
		log.Printf("new stream request: %s", info.FullMethod)
		return handler(srv, ss)
	}
}

func MakeUnaryServerInterceptor() grpc.UnaryServerInterceptor {
	return func(
		ctx context.Context,
		req interface{},
		info *grpc.UnaryServerInfo,
		handler grpc.UnaryHandler,
	) (resp interface{}, err error) {
		log.Printf("new unary request: %s", info.FullMethod)
		return handler(ctx, req)
	}
}
