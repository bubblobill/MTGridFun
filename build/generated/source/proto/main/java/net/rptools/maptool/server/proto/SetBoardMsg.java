// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message_types.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf type {@code maptool.SetBoardMsg}
 */
public final class SetBoardMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.SetBoardMsg)
    SetBoardMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetBoardMsg.newBuilder() to construct.
  private SetBoardMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetBoardMsg() {
    zoneGuid_ = "";
    assetId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetBoardMsg();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetBoardMsg(
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

            zoneGuid_ = s;
            break;
          }
          case 18: {
            net.rptools.maptool.server.proto.drawing.IntPointDto.Builder subBuilder = null;
            if (point_ != null) {
              subBuilder = point_.toBuilder();
            }
            point_ = input.readMessage(net.rptools.maptool.server.proto.drawing.IntPointDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(point_);
              point_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            assetId_ = s;
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
    return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_SetBoardMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_SetBoardMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.SetBoardMsg.class, net.rptools.maptool.server.proto.SetBoardMsg.Builder.class);
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

  public static final int POINT_FIELD_NUMBER = 2;
  private net.rptools.maptool.server.proto.drawing.IntPointDto point_;
  /**
   * <code>.maptool.IntPointDto point = 2;</code>
   * @return Whether the point field is set.
   */
  @java.lang.Override
  public boolean hasPoint() {
    return point_ != null;
  }
  /**
   * <code>.maptool.IntPointDto point = 2;</code>
   * @return The point.
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.IntPointDto getPoint() {
    return point_ == null ? net.rptools.maptool.server.proto.drawing.IntPointDto.getDefaultInstance() : point_;
  }
  /**
   * <code>.maptool.IntPointDto point = 2;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.IntPointDtoOrBuilder getPointOrBuilder() {
    return getPoint();
  }

  public static final int ASSET_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object assetId_;
  /**
   * <code>string asset_id = 3;</code>
   * @return The assetId.
   */
  @java.lang.Override
  public java.lang.String getAssetId() {
    java.lang.Object ref = assetId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetId_ = s;
      return s;
    }
  }
  /**
   * <code>string asset_id = 3;</code>
   * @return The bytes for assetId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssetIdBytes() {
    java.lang.Object ref = assetId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assetId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (point_ != null) {
      output.writeMessage(2, getPoint());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, assetId_);
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
    if (point_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPoint());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, assetId_);
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
    if (!(obj instanceof net.rptools.maptool.server.proto.SetBoardMsg)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.SetBoardMsg other = (net.rptools.maptool.server.proto.SetBoardMsg) obj;

    if (!getZoneGuid()
        .equals(other.getZoneGuid())) return false;
    if (hasPoint() != other.hasPoint()) return false;
    if (hasPoint()) {
      if (!getPoint()
          .equals(other.getPoint())) return false;
    }
    if (!getAssetId()
        .equals(other.getAssetId())) return false;
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
    if (hasPoint()) {
      hash = (37 * hash) + POINT_FIELD_NUMBER;
      hash = (53 * hash) + getPoint().hashCode();
    }
    hash = (37 * hash) + ASSET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getAssetId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.SetBoardMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.SetBoardMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SetBoardMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.SetBoardMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SetBoardMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.SetBoardMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SetBoardMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.SetBoardMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SetBoardMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.SetBoardMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SetBoardMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.SetBoardMsg parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.SetBoardMsg prototype) {
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
   * Protobuf type {@code maptool.SetBoardMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.SetBoardMsg)
      net.rptools.maptool.server.proto.SetBoardMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_SetBoardMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_SetBoardMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.SetBoardMsg.class, net.rptools.maptool.server.proto.SetBoardMsg.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.SetBoardMsg.newBuilder()
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

      if (pointBuilder_ == null) {
        point_ = null;
      } else {
        point_ = null;
        pointBuilder_ = null;
      }
      assetId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_SetBoardMsg_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.SetBoardMsg getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.SetBoardMsg.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.SetBoardMsg build() {
      net.rptools.maptool.server.proto.SetBoardMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.SetBoardMsg buildPartial() {
      net.rptools.maptool.server.proto.SetBoardMsg result = new net.rptools.maptool.server.proto.SetBoardMsg(this);
      result.zoneGuid_ = zoneGuid_;
      if (pointBuilder_ == null) {
        result.point_ = point_;
      } else {
        result.point_ = pointBuilder_.build();
      }
      result.assetId_ = assetId_;
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
      if (other instanceof net.rptools.maptool.server.proto.SetBoardMsg) {
        return mergeFrom((net.rptools.maptool.server.proto.SetBoardMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.SetBoardMsg other) {
      if (other == net.rptools.maptool.server.proto.SetBoardMsg.getDefaultInstance()) return this;
      if (!other.getZoneGuid().isEmpty()) {
        zoneGuid_ = other.zoneGuid_;
        onChanged();
      }
      if (other.hasPoint()) {
        mergePoint(other.getPoint());
      }
      if (!other.getAssetId().isEmpty()) {
        assetId_ = other.assetId_;
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
      net.rptools.maptool.server.proto.SetBoardMsg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.SetBoardMsg) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private net.rptools.maptool.server.proto.drawing.IntPointDto point_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.IntPointDto, net.rptools.maptool.server.proto.drawing.IntPointDto.Builder, net.rptools.maptool.server.proto.drawing.IntPointDtoOrBuilder> pointBuilder_;
    /**
     * <code>.maptool.IntPointDto point = 2;</code>
     * @return Whether the point field is set.
     */
    public boolean hasPoint() {
      return pointBuilder_ != null || point_ != null;
    }
    /**
     * <code>.maptool.IntPointDto point = 2;</code>
     * @return The point.
     */
    public net.rptools.maptool.server.proto.drawing.IntPointDto getPoint() {
      if (pointBuilder_ == null) {
        return point_ == null ? net.rptools.maptool.server.proto.drawing.IntPointDto.getDefaultInstance() : point_;
      } else {
        return pointBuilder_.getMessage();
      }
    }
    /**
     * <code>.maptool.IntPointDto point = 2;</code>
     */
    public Builder setPoint(net.rptools.maptool.server.proto.drawing.IntPointDto value) {
      if (pointBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        point_ = value;
        onChanged();
      } else {
        pointBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.maptool.IntPointDto point = 2;</code>
     */
    public Builder setPoint(
        net.rptools.maptool.server.proto.drawing.IntPointDto.Builder builderForValue) {
      if (pointBuilder_ == null) {
        point_ = builderForValue.build();
        onChanged();
      } else {
        pointBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.maptool.IntPointDto point = 2;</code>
     */
    public Builder mergePoint(net.rptools.maptool.server.proto.drawing.IntPointDto value) {
      if (pointBuilder_ == null) {
        if (point_ != null) {
          point_ =
            net.rptools.maptool.server.proto.drawing.IntPointDto.newBuilder(point_).mergeFrom(value).buildPartial();
        } else {
          point_ = value;
        }
        onChanged();
      } else {
        pointBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.maptool.IntPointDto point = 2;</code>
     */
    public Builder clearPoint() {
      if (pointBuilder_ == null) {
        point_ = null;
        onChanged();
      } else {
        point_ = null;
        pointBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.maptool.IntPointDto point = 2;</code>
     */
    public net.rptools.maptool.server.proto.drawing.IntPointDto.Builder getPointBuilder() {
      
      onChanged();
      return getPointFieldBuilder().getBuilder();
    }
    /**
     * <code>.maptool.IntPointDto point = 2;</code>
     */
    public net.rptools.maptool.server.proto.drawing.IntPointDtoOrBuilder getPointOrBuilder() {
      if (pointBuilder_ != null) {
        return pointBuilder_.getMessageOrBuilder();
      } else {
        return point_ == null ?
            net.rptools.maptool.server.proto.drawing.IntPointDto.getDefaultInstance() : point_;
      }
    }
    /**
     * <code>.maptool.IntPointDto point = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.IntPointDto, net.rptools.maptool.server.proto.drawing.IntPointDto.Builder, net.rptools.maptool.server.proto.drawing.IntPointDtoOrBuilder> 
        getPointFieldBuilder() {
      if (pointBuilder_ == null) {
        pointBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rptools.maptool.server.proto.drawing.IntPointDto, net.rptools.maptool.server.proto.drawing.IntPointDto.Builder, net.rptools.maptool.server.proto.drawing.IntPointDtoOrBuilder>(
                getPoint(),
                getParentForChildren(),
                isClean());
        point_ = null;
      }
      return pointBuilder_;
    }

    private java.lang.Object assetId_ = "";
    /**
     * <code>string asset_id = 3;</code>
     * @return The assetId.
     */
    public java.lang.String getAssetId() {
      java.lang.Object ref = assetId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string asset_id = 3;</code>
     * @return The bytes for assetId.
     */
    public com.google.protobuf.ByteString
        getAssetIdBytes() {
      java.lang.Object ref = assetId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assetId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string asset_id = 3;</code>
     * @param value The assetId to set.
     * @return This builder for chaining.
     */
    public Builder setAssetId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      assetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string asset_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetId() {
      
      assetId_ = getDefaultInstance().getAssetId();
      onChanged();
      return this;
    }
    /**
     * <code>string asset_id = 3;</code>
     * @param value The bytes for assetId to set.
     * @return This builder for chaining.
     */
    public Builder setAssetIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      assetId_ = value;
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


    // @@protoc_insertion_point(builder_scope:maptool.SetBoardMsg)
  }

  // @@protoc_insertion_point(class_scope:maptool.SetBoardMsg)
  private static final net.rptools.maptool.server.proto.SetBoardMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.SetBoardMsg();
  }

  public static net.rptools.maptool.server.proto.SetBoardMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetBoardMsg>
      PARSER = new com.google.protobuf.AbstractParser<SetBoardMsg>() {
    @java.lang.Override
    public SetBoardMsg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetBoardMsg(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetBoardMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetBoardMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.SetBoardMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
