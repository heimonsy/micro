// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: relation/relation.proto

package com.github.heimonsy.micro.apis.relation;

public interface FollowUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:relation.FollowUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>uint64 follow_user_id = 2 [json_name = "followUserId"];</code>
   * @return The followUserId.
   */
  long getFollowUserId();
}