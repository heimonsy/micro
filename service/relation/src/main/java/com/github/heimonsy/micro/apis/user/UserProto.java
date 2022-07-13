// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user/user.proto

package com.github.heimonsy.micro.apis.user;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_RegisterRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_RegisterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_RegisterResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_RegisterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_GetUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_GetUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_GetUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_GetUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_PushRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_PushRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_PushResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_PushResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017user/user.proto\022\004user\"o\n\017RegisterReque" +
      "st\022\032\n\010username\030\001 \001(\tR\010username\022\032\n\010nickna" +
      "me\030\002 \001(\tR\010nickname\022$\n\006gender\030\003 \001(\0162\014.use" +
      "r.GenderR\006gender\"+\n\020RegisterResponse\022\027\n\007" +
      "user_id\030\001 \001(\004R\006userId\"O\n\016GetUserRequest\022" +
      "\031\n\007user_id\030\001 \001(\004H\000R\006userId\022\034\n\010username\030\002" +
      " \001(\tH\000R\010usernameB\004\n\002by\"\210\001\n\017GetUserRespon" +
      "se\022\027\n\007user_id\030\001 \001(\004R\006userId\022\032\n\010username\030" +
      "\002 \001(\tR\010username\022\032\n\010nickname\030\003 \001(\tR\010nickn" +
      "ame\022$\n\006gender\030\004 \001(\0162\014.user.GenderR\006gende" +
      "r\"&\n\013PushRequest\022\027\n\007user_id\030\001 \001(\004R\006userI" +
      "d\")\n\005Event\022\016\n\002id\030\001 \001(\tR\002id\022\020\n\003msg\030\002 \001(\tR" +
      "\003msg\"1\n\014PushResponse\022!\n\005event\030\001 \001(\0132\013.us" +
      "er.EventR\005event*W\n\006Gender\022\026\n\022GENDER_UNSP" +
      "ECIFIED\020\000\022\017\n\013GENDER_MALE\020\001\022\021\n\rGENDER_FEM" +
      "ALE\020\002\022\021\n\rGENDER_OTHERS\020\0032\261\001\n\013UserService" +
      "\0229\n\010Register\022\025.user.RegisterRequest\032\026.us" +
      "er.RegisterResponse\0226\n\007GetUser\022\024.user.Ge" +
      "tUserRequest\032\025.user.GetUserResponse\022/\n\004P" +
      "ush\022\021.user.PushRequest\032\022.user.PushRespon" +
      "se0\001B\222\001\n#com.github.heimonsy.micro.apis." +
      "userB\tUserProtoP\001Z0github.com/heimonsy/m" +
      "icro/gen/proto/go/apis/user\242\002\003UXX\252\002\004User" +
      "\312\002\004User\342\002\020User\\GPBMetadata\352\002\004Userb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_user_RegisterRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_user_RegisterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_RegisterRequest_descriptor,
        new java.lang.String[] { "Username", "Nickname", "Gender", });
    internal_static_user_RegisterResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_user_RegisterResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_RegisterResponse_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_user_GetUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_user_GetUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_GetUserRequest_descriptor,
        new java.lang.String[] { "UserId", "Username", "By", });
    internal_static_user_GetUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_user_GetUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_GetUserResponse_descriptor,
        new java.lang.String[] { "UserId", "Username", "Nickname", "Gender", });
    internal_static_user_PushRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_user_PushRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_PushRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_user_Event_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_user_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_Event_descriptor,
        new java.lang.String[] { "Id", "Msg", });
    internal_static_user_PushResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_user_PushResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_PushResponse_descriptor,
        new java.lang.String[] { "Event", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
