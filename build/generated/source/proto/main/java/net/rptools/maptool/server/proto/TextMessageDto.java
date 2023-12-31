// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf type {@code maptool.TextMessageDto}
 */
public final class TextMessageDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.TextMessageDto)
    TextMessageDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TextMessageDto.newBuilder() to construct.
  private TextMessageDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextMessageDto() {
    message_ = "";
    source_ = "";
    transform_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TextMessageDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TextMessageDto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            channel_ = input.readInt32();
            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (target_ != null) {
              subBuilder = target_.toBuilder();
            }
            target_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(target_);
              target_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            source_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              transform_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            transform_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        transform_ = transform_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TextMessageDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TextMessageDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.TextMessageDto.class, net.rptools.maptool.server.proto.TextMessageDto.Builder.class);
  }

  public static final int CHANNEL_FIELD_NUMBER = 1;
  private int channel_;
  /**
   * <code>int32 channel = 1;</code>
   * @return The channel.
   */
  @java.lang.Override
  public int getChannel() {
    return channel_;
  }

  public static final int TARGET_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue target_;
  /**
   * <code>.google.protobuf.StringValue target = 2;</code>
   * @return Whether the target field is set.
   */
  @java.lang.Override
  public boolean hasTarget() {
    return target_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue target = 2;</code>
   * @return The target.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getTarget() {
    return target_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : target_;
  }
  /**
   * <code>.google.protobuf.StringValue target = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getTargetOrBuilder() {
    return getTarget();
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 3;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 3;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_FIELD_NUMBER = 4;
  private volatile java.lang.Object source_;
  /**
   * <code>string source = 4;</code>
   * @return The source.
   */
  @java.lang.Override
  public java.lang.String getSource() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      source_ = s;
      return s;
    }
  }
  /**
   * <code>string source = 4;</code>
   * @return The bytes for source.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceBytes() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      source_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRANSFORM_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList transform_;
  /**
   * <code>repeated string transform = 5;</code>
   * @return A list containing the transform.
   */
  public com.google.protobuf.ProtocolStringList
      getTransformList() {
    return transform_;
  }
  /**
   * <code>repeated string transform = 5;</code>
   * @return The count of transform.
   */
  public int getTransformCount() {
    return transform_.size();
  }
  /**
   * <code>repeated string transform = 5;</code>
   * @param index The index of the element to return.
   * @return The transform at the given index.
   */
  public java.lang.String getTransform(int index) {
    return transform_.get(index);
  }
  /**
   * <code>repeated string transform = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the transform at the given index.
   */
  public com.google.protobuf.ByteString
      getTransformBytes(int index) {
    return transform_.getByteString(index);
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
    if (channel_ != 0) {
      output.writeInt32(1, channel_);
    }
    if (target_ != null) {
      output.writeMessage(2, getTarget());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(source_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, source_);
    }
    for (int i = 0; i < transform_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, transform_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (channel_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, channel_);
    }
    if (target_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTarget());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(source_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, source_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < transform_.size(); i++) {
        dataSize += computeStringSizeNoTag(transform_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTransformList().size();
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
    if (!(obj instanceof net.rptools.maptool.server.proto.TextMessageDto)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.TextMessageDto other = (net.rptools.maptool.server.proto.TextMessageDto) obj;

    if (getChannel()
        != other.getChannel()) return false;
    if (hasTarget() != other.hasTarget()) return false;
    if (hasTarget()) {
      if (!getTarget()
          .equals(other.getTarget())) return false;
    }
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getSource()
        .equals(other.getSource())) return false;
    if (!getTransformList()
        .equals(other.getTransformList())) return false;
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
    hash = (37 * hash) + CHANNEL_FIELD_NUMBER;
    hash = (53 * hash) + getChannel();
    if (hasTarget()) {
      hash = (37 * hash) + TARGET_FIELD_NUMBER;
      hash = (53 * hash) + getTarget().hashCode();
    }
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getSource().hashCode();
    if (getTransformCount() > 0) {
      hash = (37 * hash) + TRANSFORM_FIELD_NUMBER;
      hash = (53 * hash) + getTransformList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.TextMessageDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.TextMessageDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TextMessageDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.TextMessageDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TextMessageDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.TextMessageDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TextMessageDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.TextMessageDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TextMessageDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.TextMessageDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TextMessageDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.TextMessageDto parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.TextMessageDto prototype) {
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
   * Protobuf type {@code maptool.TextMessageDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.TextMessageDto)
      net.rptools.maptool.server.proto.TextMessageDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TextMessageDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TextMessageDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.TextMessageDto.class, net.rptools.maptool.server.proto.TextMessageDto.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.TextMessageDto.newBuilder()
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
      channel_ = 0;

      if (targetBuilder_ == null) {
        target_ = null;
      } else {
        target_ = null;
        targetBuilder_ = null;
      }
      message_ = "";

      source_ = "";

      transform_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TextMessageDto_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.TextMessageDto getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.TextMessageDto.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.TextMessageDto build() {
      net.rptools.maptool.server.proto.TextMessageDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.TextMessageDto buildPartial() {
      net.rptools.maptool.server.proto.TextMessageDto result = new net.rptools.maptool.server.proto.TextMessageDto(this);
      int from_bitField0_ = bitField0_;
      result.channel_ = channel_;
      if (targetBuilder_ == null) {
        result.target_ = target_;
      } else {
        result.target_ = targetBuilder_.build();
      }
      result.message_ = message_;
      result.source_ = source_;
      if (((bitField0_ & 0x00000001) != 0)) {
        transform_ = transform_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.transform_ = transform_;
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
      if (other instanceof net.rptools.maptool.server.proto.TextMessageDto) {
        return mergeFrom((net.rptools.maptool.server.proto.TextMessageDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.TextMessageDto other) {
      if (other == net.rptools.maptool.server.proto.TextMessageDto.getDefaultInstance()) return this;
      if (other.getChannel() != 0) {
        setChannel(other.getChannel());
      }
      if (other.hasTarget()) {
        mergeTarget(other.getTarget());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (!other.getSource().isEmpty()) {
        source_ = other.source_;
        onChanged();
      }
      if (!other.transform_.isEmpty()) {
        if (transform_.isEmpty()) {
          transform_ = other.transform_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTransformIsMutable();
          transform_.addAll(other.transform_);
        }
        onChanged();
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
      net.rptools.maptool.server.proto.TextMessageDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.TextMessageDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int channel_ ;
    /**
     * <code>int32 channel = 1;</code>
     * @return The channel.
     */
    @java.lang.Override
    public int getChannel() {
      return channel_;
    }
    /**
     * <code>int32 channel = 1;</code>
     * @param value The channel to set.
     * @return This builder for chaining.
     */
    public Builder setChannel(int value) {
      
      channel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 channel = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChannel() {
      
      channel_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue target_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> targetBuilder_;
    /**
     * <code>.google.protobuf.StringValue target = 2;</code>
     * @return Whether the target field is set.
     */
    public boolean hasTarget() {
      return targetBuilder_ != null || target_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue target = 2;</code>
     * @return The target.
     */
    public com.google.protobuf.StringValue getTarget() {
      if (targetBuilder_ == null) {
        return target_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : target_;
      } else {
        return targetBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue target = 2;</code>
     */
    public Builder setTarget(com.google.protobuf.StringValue value) {
      if (targetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        target_ = value;
        onChanged();
      } else {
        targetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue target = 2;</code>
     */
    public Builder setTarget(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (targetBuilder_ == null) {
        target_ = builderForValue.build();
        onChanged();
      } else {
        targetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue target = 2;</code>
     */
    public Builder mergeTarget(com.google.protobuf.StringValue value) {
      if (targetBuilder_ == null) {
        if (target_ != null) {
          target_ =
            com.google.protobuf.StringValue.newBuilder(target_).mergeFrom(value).buildPartial();
        } else {
          target_ = value;
        }
        onChanged();
      } else {
        targetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue target = 2;</code>
     */
    public Builder clearTarget() {
      if (targetBuilder_ == null) {
        target_ = null;
        onChanged();
      } else {
        target_ = null;
        targetBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue target = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getTargetBuilder() {
      
      onChanged();
      return getTargetFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue target = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getTargetOrBuilder() {
      if (targetBuilder_ != null) {
        return targetBuilder_.getMessageOrBuilder();
      } else {
        return target_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : target_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue target = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getTargetFieldBuilder() {
      if (targetBuilder_ == null) {
        targetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getTarget(),
                getParentForChildren(),
                isClean());
        target_ = null;
      }
      return targetBuilder_;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 3;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 3;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 3;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 3;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object source_ = "";
    /**
     * <code>string source = 4;</code>
     * @return The source.
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        source_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string source = 4;</code>
     * @return The bytes for source.
     */
    public com.google.protobuf.ByteString
        getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string source = 4;</code>
     * @param value The source to set.
     * @return This builder for chaining.
     */
    public Builder setSource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string source = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSource() {
      
      source_ = getDefaultInstance().getSource();
      onChanged();
      return this;
    }
    /**
     * <code>string source = 4;</code>
     * @param value The bytes for source to set.
     * @return This builder for chaining.
     */
    public Builder setSourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      source_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList transform_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTransformIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        transform_ = new com.google.protobuf.LazyStringArrayList(transform_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string transform = 5;</code>
     * @return A list containing the transform.
     */
    public com.google.protobuf.ProtocolStringList
        getTransformList() {
      return transform_.getUnmodifiableView();
    }
    /**
     * <code>repeated string transform = 5;</code>
     * @return The count of transform.
     */
    public int getTransformCount() {
      return transform_.size();
    }
    /**
     * <code>repeated string transform = 5;</code>
     * @param index The index of the element to return.
     * @return The transform at the given index.
     */
    public java.lang.String getTransform(int index) {
      return transform_.get(index);
    }
    /**
     * <code>repeated string transform = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the transform at the given index.
     */
    public com.google.protobuf.ByteString
        getTransformBytes(int index) {
      return transform_.getByteString(index);
    }
    /**
     * <code>repeated string transform = 5;</code>
     * @param index The index to set the value at.
     * @param value The transform to set.
     * @return This builder for chaining.
     */
    public Builder setTransform(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTransformIsMutable();
      transform_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string transform = 5;</code>
     * @param value The transform to add.
     * @return This builder for chaining.
     */
    public Builder addTransform(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTransformIsMutable();
      transform_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string transform = 5;</code>
     * @param values The transform to add.
     * @return This builder for chaining.
     */
    public Builder addAllTransform(
        java.lang.Iterable<java.lang.String> values) {
      ensureTransformIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, transform_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string transform = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTransform() {
      transform_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string transform = 5;</code>
     * @param value The bytes of the transform to add.
     * @return This builder for chaining.
     */
    public Builder addTransformBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTransformIsMutable();
      transform_.add(value);
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


    // @@protoc_insertion_point(builder_scope:maptool.TextMessageDto)
  }

  // @@protoc_insertion_point(class_scope:maptool.TextMessageDto)
  private static final net.rptools.maptool.server.proto.TextMessageDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.TextMessageDto();
  }

  public static net.rptools.maptool.server.proto.TextMessageDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextMessageDto>
      PARSER = new com.google.protobuf.AbstractParser<TextMessageDto>() {
    @java.lang.Override
    public TextMessageDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TextMessageDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TextMessageDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TextMessageDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.TextMessageDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

