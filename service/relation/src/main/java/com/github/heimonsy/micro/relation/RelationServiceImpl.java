package com.github.heimonsy.micro.relation;

import com.github.heimonsy.micro.apis.relation.RelationService;
import com.google.protobuf.RpcController;
import com.github.heimonsy.micro.apis.relation.FollowUserRequest;
import com.google.protobuf.RpcCallback;

public class RelationServiceImpl extends RelationService {

	@Override
    public void followUser( RpcController controller, FollowUserRequest request, RpcCallback<FollowUserResponse> done) {
	}

	@Override
    public void getFollowers( RpcController controller, GetFollowersRequest request, RpcCallback<GetFollowersResponse> done) {
	}


	@Override
    public void getFollowings( RpcController controller, GetFollowingsRequest request, RpcCallback<GetFollowingsResponse> done) {
	}

}
