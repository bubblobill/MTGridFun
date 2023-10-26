// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf type {@code maptool.TokenInitiativeDto}
 */
public final class TokenInitiativeDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.TokenInitiativeDto)
    TokenInitiativeDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TokenInitiativeDto.newBuilder() to construct.
  private TokenInitiativeDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TokenInitiativeDto() {
    tokenId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TokenInitiativeDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TokenInitiativeDto(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            tokenId_ = s;
            break;
          }
          case 16: {

            holding_ = input.readBool();
            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (state_ != null) {
              subBuilder = state_.toBuilder();
            }
            state_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(state_);
              state_ = subBuilder.buildPartial();
            }

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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TokenInitiativeDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TokenInitiativeDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.TokenInitiativeDto.class, net.rptools.maptool.server.proto.TokenInitiativeDto.Builder.class);
  }

  public static final int TOKEN_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object tokenId_;
  /**
   * <code>string token_id = 1;</code>
   * @return The tokenId.
   */
  @java.lang.Override
  public java.lang.String getTokenId() {
    java.lang.Object ref = tokenId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tokenId_ = s;
      return s;
    }
  }
  /**
   * <code>string token_id = 1;</code>
   * @return The bytes for tokenId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTokenIdBytes() {
    java.lang.Object ref = tokenId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tokenId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOLDING_FIELD_NUMBER = 2;
  private boolean holding_;
  /**
   * <code>bool holding = 2;</code>
   * @return The holding.
   */
  @java.lang.Override
  public boolean getHolding() {
    return holding_;
  }

  public static final int STATE_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue state_;
  /**
   * <code>.google.protobuf.StringValue state = 3;</code>
   * @return Whether the state field is set.
   */
  @java.lang.Override
  public boolean hasState() {
    return state_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue state = 3;</code>
   * @return The state.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getState() {
    return state_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : state_;
  }
  /**
   * <code>.google.protobuf.StringValue state = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getStateOrBuilder() {
    return getState();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tokenId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tokenId_);
    }
    if (holding_ != false) {
      output.writeBool(2, holding_);
    }
    if (state_ != null) {
      output.writeMessage(3, getState());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tokenId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tokenId_);
    }
    if (holding_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, holding_);
    }
    if (state_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getState());
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
    if (!(obj instanceof net.rptools.maptool.server.proto.TokenInitiativeDto)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.TokenInitiativeDto other = (net.rptools.maptool.server.proto.TokenInitiativeDto) obj;

    if (!getTokenId()
        .equals(other.getTokenId())) return false;
    if (getHolding()
        != other.getHolding()) return false;
    if (hasState() != other.hasState()) return false;
    if (hasState()) {
      if (!getState()
          .equals(other.getState())) return false;
    }
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
    hash = (37 * hash) + TOKEN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTokenId().hashCode();
    hash = (37 * hash) + HOLDING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHolding());
    if (hasState()) {
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + getState().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.TokenInitiativeDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.TokenInitiativeDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TokenInitiativeDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.TokenInitiativeDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TokenInitiativeDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.TokenInitiativeDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TokenInitiativeDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.TokenInitiativeDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TokenInitiativeDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.TokenInitiativeDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TokenInitiativeDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.TokenInitiativeDto parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.TokenInitiativeDto prototype) {
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
   * Protobuf type {@code maptool.TokenInitiativeDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.TokenInitiativeDto)
      net.rptools.maptool.server.proto.TokenInitiativeDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TokenInitiativeDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TokenInitiativeDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.TokenInitiativeDto.class, net.rptools.maptool.server.proto.TokenInitiativeDto.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.TokenInitiativeDto.newBuilder()
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
      tokenId_ = "";

      holding_ = false;

      if (stateBuilder_ == null) {
        state_ = null;
      } else {
        state_ = null;
        stateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TokenInitiativeDto_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.TokenInitiativeDto getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.TokenInitiativeDto.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.TokenInitiativeDto build() {
      net.rptools.maptool.server.proto.TokenInitiativeDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.TokenInitiativeDto buildPartial() {
      net.rptools.maptool.server.proto.TokenInitiativeDto result = new net.rptools.maptool.server.proto.TokenInitiativeDto(this);
      result.tokenId_ = tokenId_;
      result.holding_ = holding_;
      if (stateBuilder_ == null) {
        result.state_ = state_;
      } else {
        result.state_ = stateBuilder_.build();
      }
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
      if (other instanceof net.rptools.maptool.server.proto.TokenInitiativeDto) {
        return mergeFrom((net.rptools.maptool.server.proto.TokenInitiativeDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.TokenInitiativeDto other) {
      if (other == net.rptools.maptool.server.proto.TokenInitiativeDto.getDefaultInstance()) return this;
      if (!other.getTokenId().isEmpty()) {
        tokenId_ = other.tokenId_;
        onChanged();
      }
      if (other.getHolding() != false) {
        setHolding(other.getHolding());
      }
      if (other.hasState()) {
        mergeState(other.getState());
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
      net.rptools.maptool.server.proto.TokenInitiativeDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.TokenInitiativeDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object tokenId_ = "";
    /**
     * <code>string token_id = 1;</code>
     * @return The tokenId.
     */
    public java.lang.String getTokenId() {
      java.lang.Object ref = tokenId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tokenId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string token_id = 1;</code>
     * @return The bytes for tokenId.
     */
    public com.google.protobuf.ByteString
        getTokenIdBytes() {
      java.lang.Object ref = tokenId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tokenId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token_id = 1;</code>
     * @param value The tokenId to set.
     * @return This builder for chaining.
     */
    public Builder setTokenId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tokenId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string token_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTokenId() {
      
      tokenId_ = getDefaultInstance().getTokenId();
      onChanged();
      return this;
    }
    /**
     * <code>string token_id = 1;</code>
     * @param value The bytes for tokenId to set.
     * @return This builder for chaining.
     */
    public Builder setTokenIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tokenId_ = value;
      onChanged();
      return this;
    }

    private boolean holding_ ;
    /**
     * <code>bool holding = 2;</code>
     * @return The holding.
     */
    @java.lang.Override
    public boolean getHolding() {
      return holding_;
    }
    /**
     * <code>bool holding = 2;</code>
     * @param value The holding to set.
     * @return This builder for chaining.
     */
    public Builder setHolding(boolean value) {
      
      holding_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool holding = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHolding() {
      
      holding_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue state_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> stateBuilder_;
    /**
     * <code>.google.protobuf.StringValue state = 3;</code>
     * @return Whether the state field is set.
     */
    public boolean hasState() {
      return stateBuilder_ != null || state_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue state = 3;</code>
     * @return The state.
     */
    public com.google.protobuf.StringValue getState() {
      if (stateBuilder_ == null) {
        return state_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : state_;
      } else {
        return stateBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue state = 3;</code>
     */
    public Builder setState(com.google.protobuf.StringValue value) {
      if (stateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        state_ = value;
        onChanged();
      } else {
        stateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue state = 3;</code>
     */
    public Builder setState(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (stateBuilder_ == null) {
        state_ = builderForValue.build();
        onChanged();
      } else {
        stateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue state = 3;</code>
     */
    public Builder mergeState(com.google.protobuf.StringValue value) {
      if (stateBuilder_ == null) {
        if (state_ != null) {
          state_ =
            com.google.protobuf.StringValue.newBuilder(state_).mergeFrom(value).buildPartial();
        } else {
          state_ = value;
        }
        onChanged();
      } else {
        stateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue state = 3;</code>
     */
    public Builder clearState() {
      if (stateBuilder_ == null) {
        state_ = null;
        onChanged();
      } else {
        state_ = null;
        stateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue state = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getStateBuilder() {
      
      onChanged();
      return getStateFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue state = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getStateOrBuilder() {
      if (stateBuilder_ != null) {
        return stateBuilder_.getMessageOrBuilder();
      } else {
        return state_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : state_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue state = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getStateFieldBuilder() {
      if (stateBuilder_ == null) {
        stateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getState(),
                getParentForChildren(),
                isClean());
        state_ = null;
      }
      return stateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:maptool.TokenInitiativeDto)
  }

  // @@protoc_insertion_point(class_scope:maptool.TokenInitiativeDto)
  private static final net.rptools.maptool.server.proto.TokenInitiativeDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.TokenInitiativeDto();
  }

  public static net.rptools.maptool.server.proto.TokenInitiativeDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TokenInitiativeDto>
      PARSER = new com.google.protobuf.AbstractParser<TokenInitiativeDto>() {
    @java.lang.Override
    public TokenInitiativeDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TokenInitiativeDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TokenInitiativeDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TokenInitiativeDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.TokenInitiativeDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
