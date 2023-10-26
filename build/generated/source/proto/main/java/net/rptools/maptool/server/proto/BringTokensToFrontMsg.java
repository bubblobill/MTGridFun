// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message_types.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf type {@code maptool.BringTokensToFrontMsg}
 */
public final class BringTokensToFrontMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.BringTokensToFrontMsg)
    BringTokensToFrontMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BringTokensToFrontMsg.newBuilder() to construct.
  private BringTokensToFrontMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BringTokensToFrontMsg() {
    zoneGuid_ = "";
    tokenGuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BringTokensToFrontMsg();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BringTokensToFrontMsg(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            zoneGuid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tokenGuids_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            tokenGuids_.add(s);
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
        tokenGuids_ = tokenGuids_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_BringTokensToFrontMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_BringTokensToFrontMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.BringTokensToFrontMsg.class, net.rptools.maptool.server.proto.BringTokensToFrontMsg.Builder.class);
  }

  public static final int ZONE_GUID_FIELD_NUMBER = 1;
  private volatile java.lang.Object zoneGuid_;
  /**
   * <code>string zone_guid = 1;</code>
   * @return The zoneGuid.
   */
  @java.lang.Override
  public java.lang.String getZoneGuid() {
    java.lang.Object ref = zoneGuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zoneGuid_ = s;
      return s;
    }
  }
  /**
   * <code>string zone_guid = 1;</code>
   * @return The bytes for zoneGuid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getZoneGuidBytes() {
    java.lang.Object ref = zoneGuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zoneGuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN_GUIDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList tokenGuids_;
  /**
   * <code>repeated string token_guids = 2;</code>
   * @return A list containing the tokenGuids.
   */
  public com.google.protobuf.ProtocolStringList
      getTokenGuidsList() {
    return tokenGuids_;
  }
  /**
   * <code>repeated string token_guids = 2;</code>
   * @return The count of tokenGuids.
   */
  public int getTokenGuidsCount() {
    return tokenGuids_.size();
  }
  /**
   * <code>repeated string token_guids = 2;</code>
   * @param index The index of the element to return.
   * @return The tokenGuids at the given index.
   */
  public java.lang.String getTokenGuids(int index) {
    return tokenGuids_.get(index);
  }
  /**
   * <code>repeated string token_guids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tokenGuids at the given index.
   */
  public com.google.protobuf.ByteString
      getTokenGuidsBytes(int index) {
    return tokenGuids_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zoneGuid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, zoneGuid_);
    }
    for (int i = 0; i < tokenGuids_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tokenGuids_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zoneGuid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, zoneGuid_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < tokenGuids_.size(); i++) {
        dataSize += computeStringSizeNoTag(tokenGuids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTokenGuidsList().size();
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
    if (!(obj instanceof net.rptools.maptool.server.proto.BringTokensToFrontMsg)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.BringTokensToFrontMsg other = (net.rptools.maptool.server.proto.BringTokensToFrontMsg) obj;

    if (!getZoneGuid()
        .equals(other.getZoneGuid())) return false;
    if (!getTokenGuidsList()
        .equals(other.getTokenGuidsList())) return false;
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
    hash = (37 * hash) + ZONE_GUID_FIELD_NUMBER;
    hash = (53 * hash) + getZoneGuid().hashCode();
    if (getTokenGuidsCount() > 0) {
      hash = (37 * hash) + TOKEN_GUIDS_FIELD_NUMBER;
      hash = (53 * hash) + getTokenGuidsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.BringTokensToFrontMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.BringTokensToFrontMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.BringTokensToFrontMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.BringTokensToFrontMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.BringTokensToFrontMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.BringTokensToFrontMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.BringTokensToFrontMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.BringTokensToFrontMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.BringTokensToFrontMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.BringTokensToFrontMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.BringTokensToFrontMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.BringTokensToFrontMsg parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.BringTokensToFrontMsg prototype) {
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
   * Protobuf type {@code maptool.BringTokensToFrontMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.BringTokensToFrontMsg)
      net.rptools.maptool.server.proto.BringTokensToFrontMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_BringTokensToFrontMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_BringTokensToFrontMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.BringTokensToFrontMsg.class, net.rptools.maptool.server.proto.BringTokensToFrontMsg.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.BringTokensToFrontMsg.newBuilder()
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
      zoneGuid_ = "";

      tokenGuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_BringTokensToFrontMsg_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.BringTokensToFrontMsg getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.BringTokensToFrontMsg.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.BringTokensToFrontMsg build() {
      net.rptools.maptool.server.proto.BringTokensToFrontMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.BringTokensToFrontMsg buildPartial() {
      net.rptools.maptool.server.proto.BringTokensToFrontMsg result = new net.rptools.maptool.server.proto.BringTokensToFrontMsg(this);
      int from_bitField0_ = bitField0_;
      result.zoneGuid_ = zoneGuid_;
      if (((bitField0_ & 0x00000001) != 0)) {
        tokenGuids_ = tokenGuids_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.tokenGuids_ = tokenGuids_;
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
      if (other instanceof net.rptools.maptool.server.proto.BringTokensToFrontMsg) {
        return mergeFrom((net.rptools.maptool.server.proto.BringTokensToFrontMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.BringTokensToFrontMsg other) {
      if (other == net.rptools.maptool.server.proto.BringTokensToFrontMsg.getDefaultInstance()) return this;
      if (!other.getZoneGuid().isEmpty()) {
        zoneGuid_ = other.zoneGuid_;
        onChanged();
      }
      if (!other.tokenGuids_.isEmpty()) {
        if (tokenGuids_.isEmpty()) {
          tokenGuids_ = other.tokenGuids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTokenGuidsIsMutable();
          tokenGuids_.addAll(other.tokenGuids_);
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
      net.rptools.maptool.server.proto.BringTokensToFrontMsg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.BringTokensToFrontMsg) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object zoneGuid_ = "";
    /**
     * <code>string zone_guid = 1;</code>
     * @return The zoneGuid.
     */
    public java.lang.String getZoneGuid() {
      java.lang.Object ref = zoneGuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zoneGuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string zone_guid = 1;</code>
     * @return The bytes for zoneGuid.
     */
    public com.google.protobuf.ByteString
        getZoneGuidBytes() {
      java.lang.Object ref = zoneGuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zoneGuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string zone_guid = 1;</code>
     * @param value The zoneGuid to set.
     * @return This builder for chaining.
     */
    public Builder setZoneGuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      zoneGuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string zone_guid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearZoneGuid() {
      
      zoneGuid_ = getDefaultInstance().getZoneGuid();
      onChanged();
      return this;
    }
    /**
     * <code>string zone_guid = 1;</code>
     * @param value The bytes for zoneGuid to set.
     * @return This builder for chaining.
     */
    public Builder setZoneGuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      zoneGuid_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList tokenGuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTokenGuidsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tokenGuids_ = new com.google.protobuf.LazyStringArrayList(tokenGuids_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string token_guids = 2;</code>
     * @return A list containing the tokenGuids.
     */
    public com.google.protobuf.ProtocolStringList
        getTokenGuidsList() {
      return tokenGuids_.getUnmodifiableView();
    }
    /**
     * <code>repeated string token_guids = 2;</code>
     * @return The count of tokenGuids.
     */
    public int getTokenGuidsCount() {
      return tokenGuids_.size();
    }
    /**
     * <code>repeated string token_guids = 2;</code>
     * @param index The index of the element to return.
     * @return The tokenGuids at the given index.
     */
    public java.lang.String getTokenGuids(int index) {
      return tokenGuids_.get(index);
    }
    /**
     * <code>repeated string token_guids = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the tokenGuids at the given index.
     */
    public com.google.protobuf.ByteString
        getTokenGuidsBytes(int index) {
      return tokenGuids_.getByteString(index);
    }
    /**
     * <code>repeated string token_guids = 2;</code>
     * @param index The index to set the value at.
     * @param value The tokenGuids to set.
     * @return This builder for chaining.
     */
    public Builder setTokenGuids(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTokenGuidsIsMutable();
      tokenGuids_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string token_guids = 2;</code>
     * @param value The tokenGuids to add.
     * @return This builder for chaining.
     */
    public Builder addTokenGuids(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTokenGuidsIsMutable();
      tokenGuids_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string token_guids = 2;</code>
     * @param values The tokenGuids to add.
     * @return This builder for chaining.
     */
    public Builder addAllTokenGuids(
        java.lang.Iterable<java.lang.String> values) {
      ensureTokenGuidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, tokenGuids_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string token_guids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTokenGuids() {
      tokenGuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string token_guids = 2;</code>
     * @param value The bytes of the tokenGuids to add.
     * @return This builder for chaining.
     */
    public Builder addTokenGuidsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTokenGuidsIsMutable();
      tokenGuids_.add(value);
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


    // @@protoc_insertion_point(builder_scope:maptool.BringTokensToFrontMsg)
  }

  // @@protoc_insertion_point(class_scope:maptool.BringTokensToFrontMsg)
  private static final net.rptools.maptool.server.proto.BringTokensToFrontMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.BringTokensToFrontMsg();
  }

  public static net.rptools.maptool.server.proto.BringTokensToFrontMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BringTokensToFrontMsg>
      PARSER = new com.google.protobuf.AbstractParser<BringTokensToFrontMsg>() {
    @java.lang.Override
    public BringTokensToFrontMsg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BringTokensToFrontMsg(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BringTokensToFrontMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BringTokensToFrontMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.BringTokensToFrontMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

