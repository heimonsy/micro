// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: relation/relation.proto

package com.github.heimonsy.micro.apis.relation;

/**
 * Protobuf type {@code relation.FollowUserRequest}
 */
public final class FollowUserRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:relation.FollowUserRequest)
    FollowUserRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FollowUserRequest.newBuilder() to construct.
  private FollowUserRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FollowUserRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FollowUserRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FollowUserRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            userId_ = input.readUInt64();
            break;
          }
          case 16: {

            followUserId_ = input.readUInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.heimonsy.micro.apis.relation.RelationProto.internal_static_relation_FollowUserRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.heimonsy.micro.apis.relation.RelationProto.internal_static_relation_FollowUserRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.heimonsy.micro.apis.relation.FollowUserRequest.class, com.github.heimonsy.micro.apis.relation.FollowUserRequest.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private long userId_;
  /**
   * <code>uint64 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public long getUserId() {
    return userId_;
  }

  public static final int FOLLOW_USER_ID_FIELD_NUMBER = 2;
  private long followUserId_;
  /**
   * <code>uint64 follow_user_id = 2 [json_name = "followUserId"];</code>
   * @return The followUserId.
   */
  @java.lang.Override
  public long getFollowUserId() {
    return followUserId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (userId_ != 0L) {
      output.writeUInt64(1, userId_);
    }
    if (followUserId_ != 0L) {
      output.writeUInt64(2, followUserId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, userId_);
    }
    if (followUserId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, followUserId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.heimonsy.micro.apis.relation.FollowUserRequest)) {
      return super.equals(obj);
    }
    com.github.heimonsy.micro.apis.relation.FollowUserRequest other = (com.github.heimonsy.micro.apis.relation.FollowUserRequest) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (getFollowUserId()
        != other.getFollowUserId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUserId());
    hash = (37 * hash) + FOLLOW_USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFollowUserId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.heimonsy.micro.apis.relation.FollowUserRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.heimonsy.micro.apis.relation.FollowUserRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.heimonsy.micro.apis.relation.FollowUserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.heimonsy.micro.apis.relation.FollowUserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.heimonsy.micro.apis.relation.FollowUserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.heimonsy.micro.apis.relation.FollowUserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.heimonsy.micro.apis.relation.FollowUserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.heimonsy.micro.apis.relation.FollowUserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.heimonsy.micro.apis.relation.FollowUserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.heimonsy.micro.apis.relation.FollowUserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.heimonsy.micro.apis.relation.FollowUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.heimonsy.micro.apis.relation.FollowUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.heimonsy.micro.apis.relation.FollowUserRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code relation.FollowUserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:relation.FollowUserRequest)
      com.github.heimonsy.micro.apis.relation.FollowUserRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.heimonsy.micro.apis.relation.RelationProto.internal_static_relation_FollowUserRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.heimonsy.micro.apis.relation.RelationProto.internal_static_relation_FollowUserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.heimonsy.micro.apis.relation.FollowUserRequest.class, com.github.heimonsy.micro.apis.relation.FollowUserRequest.Builder.class);
    }

    // Construct using com.github.heimonsy.micro.apis.relation.FollowUserRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userId_ = 0L;

      followUserId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.heimonsy.micro.apis.relation.RelationProto.internal_static_relation_FollowUserRequest_descriptor;
    }

    @java.lang.Override
    public com.github.heimonsy.micro.apis.relation.FollowUserRequest getDefaultInstanceForType() {
      return com.github.heimonsy.micro.apis.relation.FollowUserRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.heimonsy.micro.apis.relation.FollowUserRequest build() {
      com.github.heimonsy.micro.apis.relation.FollowUserRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.heimonsy.micro.apis.relation.FollowUserRequest buildPartial() {
      com.github.heimonsy.micro.apis.relation.FollowUserRequest result = new com.github.heimonsy.micro.apis.relation.FollowUserRequest(this);
      result.userId_ = userId_;
      result.followUserId_ = followUserId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.heimonsy.micro.apis.relation.FollowUserRequest) {
        return mergeFrom((com.github.heimonsy.micro.apis.relation.FollowUserRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.heimonsy.micro.apis.relation.FollowUserRequest other) {
      if (other == com.github.heimonsy.micro.apis.relation.FollowUserRequest.getDefaultInstance()) return this;
      if (other.getUserId() != 0L) {
        setUserId(other.getUserId());
      }
      if (other.getFollowUserId() != 0L) {
        setFollowUserId(other.getFollowUserId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.heimonsy.micro.apis.relation.FollowUserRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.heimonsy.micro.apis.relation.FollowUserRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long userId_ ;
    /**
     * <code>uint64 user_id = 1 [json_name = "userId"];</code>
     * @return The userId.
     */
    @java.lang.Override
    public long getUserId() {
      return userId_;
    }
    /**
     * <code>uint64 user_id = 1 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(long value) {
      
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 user_id = 1 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = 0L;
      onChanged();
      return this;
    }

    private long followUserId_ ;
    /**
     * <code>uint64 follow_user_id = 2 [json_name = "followUserId"];</code>
     * @return The followUserId.
     */
    @java.lang.Override
    public long getFollowUserId() {
      return followUserId_;
    }
    /**
     * <code>uint64 follow_user_id = 2 [json_name = "followUserId"];</code>
     * @param value The followUserId to set.
     * @return This builder for chaining.
     */
    public Builder setFollowUserId(long value) {
      
      followUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 follow_user_id = 2 [json_name = "followUserId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFollowUserId() {
      
      followUserId_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:relation.FollowUserRequest)
  }

  // @@protoc_insertion_point(class_scope:relation.FollowUserRequest)
  private static final com.github.heimonsy.micro.apis.relation.FollowUserRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.heimonsy.micro.apis.relation.FollowUserRequest();
  }

  public static com.github.heimonsy.micro.apis.relation.FollowUserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FollowUserRequest>
      PARSER = new com.google.protobuf.AbstractParser<FollowUserRequest>() {
    @java.lang.Override
    public FollowUserRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FollowUserRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FollowUserRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FollowUserRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.heimonsy.micro.apis.relation.FollowUserRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
