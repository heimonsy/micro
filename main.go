package main

import (
	"fmt"
	"log"
	"net"
	"os"

	relationapi "github.com/heimonsy/micro/gen/proto/go/apis/relation"
	userapi "github.com/heimonsy/micro/gen/proto/go/apis/user"
	"github.com/heimonsy/micro/service/relation"
	"github.com/heimonsy/micro/service/user"
	"github.com/heimonsy/micro/tools/md"
	"github.com/spf13/cobra"
	"google.golang.org/grpc"
)

func main() {
	if err := rootCmd.Execute(); err != nil {
		fmt.Println(err)
		os.Exit(1)
	}
}

var rootCmd = &cobra.Command{
	Use:   "micro [service name]",
	Short: "micro is a micro service scaffold",
	Args:  cobra.MinimumNArgs(1),
	Run: func(cmd *cobra.Command, args []string) {
		listenOn := listen
		listener, err := net.Listen("tcp", listenOn)
		if err != nil {
			log.Fatalf("failed to listen on %s: %v", listenOn, err)
		}

		server := grpc.NewServer(
			grpc.ChainUnaryInterceptor([]grpc.UnaryServerInterceptor{
				md.MakeUnaryServerInterceptor(),
			}...),
			grpc.ChainStreamInterceptor([]grpc.StreamServerInterceptor{
				md.MakeStreamServerInterceptor(),
			}...),
		)
		switch args[0] {
		case "user":
			userapi.RegisterUserServiceServer(server, &user.UserService{})
		case "relation":
			service, err := relation.NewRelationService()
			if err != nil {
				log.Fatalf("new relation service error: %v", err)
			}
			relationapi.RegisterRelationServiceServer(server, service)
		default:
			log.Fatalf("invalid service: %s", args[0])
		}
		log.Printf("service [%s] listening on %s", args[0], listenOn)
		if err := server.Serve(listener); err != nil {
			log.Fatalf("failed to serve gRPC server: %v", err)
		}
	},
}

var (
	cfgFile string
	listen  string
)

func init() {
	rootCmd.PersistentFlags().StringVar(&cfgFile, "config", "", "config file (default is $HOME/.cobra.yaml)")
	rootCmd.PersistentFlags().StringVar(&listen, "listen", "127.0.0.1:8080", "listen address")
}
