// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message_types.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf type {@code maptool.UpdateExposedAreaMetaMsg}
 */
public final class UpdateExposedAreaMetaMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.UpdateExposedAreaMetaMsg)
    UpdateExposedAreaMetaMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateExposedAreaMetaMsg.newBuilder() to construct.
  private UpdateExposedAreaMetaMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateExposedAreaMetaMsg() {
    zoneGuid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateExposedAreaMetaMsg();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateExposedAreaMetaMsg(
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
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (tokenGuid_ != null) {
              subBuilder = tokenGuid_.toBuilder();
            }
            tokenGuid_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tokenGuid_);
              tokenGuid_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            net.rptools.maptool.server.proto.drawing.AreaDto.Builder subBuilder = null;
            if (area_ != null) {
              subBuilder = area_.toBuilder();
            }
            area_ = input.readMessage(net.rptools.maptool.server.proto.drawing.AreaDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(area_);
              area_ = subBuilder.buildPartial();
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
    return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateExposedAreaMetaMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateExposedAreaMetaMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg.class, net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg.Builder.class);
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

  public static final int TOKEN_GUID_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue tokenGuid_;
  /**
   * <code>.google.protobuf.StringValue token_guid = 2;</code>
   * @return Whether the tokenGuid field is set.
   */
  @java.lang.Override
  public boolean hasTokenGuid() {
    return tokenGuid_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue token_guid = 2;</code>
   * @return The tokenGuid.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getTokenGuid() {
    return tokenGuid_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : tokenGuid_;
  }
  /**
   * <code>.google.protobuf.StringValue token_guid = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getTokenGuidOrBuilder() {
    return getTokenGuid();
  }

  public static final int AREA_FIELD_NUMBER = 3;
  private net.rptools.maptool.server.proto.drawing.AreaDto area_;
  /**
   * <code>.maptool.AreaDto area = 3;</code>
   * @return Whether the area field is set.
   */
  @java.lang.Override
  public boolean hasArea() {
    return area_ != null;
  }
  /**
   * <code>.maptool.AreaDto area = 3;</code>
   * @return The area.
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.AreaDto getArea() {
    return area_ == null ? net.rptools.maptool.server.proto.drawing.AreaDto.getDefaultInstance() : area_;
  }
  /**
   * <code>.maptool.AreaDto area = 3;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.AreaDtoOrBuilder getAreaOrBuilder() {
    return getArea();
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
    if (tokenGuid_ != null) {
      output.writeMessage(2, getTokenGuid());
    }
    if (area_ != null) {
      output.writeMessage(3, getArea());
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
    if (tokenGuid_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTokenGuid());
    }
    if (area_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getArea());
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
    if (!(obj instanceof net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg other = (net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg) obj;

    if (!getZoneGuid()
        .equals(other.getZoneGuid())) return false;
    if (hasTokenGuid() != other.hasTokenGuid()) return false;
    if (hasTokenGuid()) {
      if (!getTokenGuid()
          .equals(other.getTokenGuid())) return false;
    }
    if (hasArea() != other.hasArea()) return false;
    if (hasArea()) {
      if (!getArea()
          .equals(other.getArea())) return false;
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
    hash = (37 * hash) + ZONE_GUID_FIELD_NUMBER;
    hash = (53 * hash) + getZoneGuid().hashCode();
    if (hasTokenGuid()) {
      hash = (37 * hash) + TOKEN_GUID_FIELD_NUMBER;
      hash = (53 * hash) + getTokenGuid().hashCode();
    }
    if (hasArea()) {
      hash = (37 * hash) + AREA_FIELD_NUMBER;
      hash = (53 * hash) + getArea().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg prototype) {
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
   * Protobuf type {@code maptool.UpdateExposedAreaMetaMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.UpdateExposedAreaMetaMsg)
      net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateExposedAreaMetaMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateExposedAreaMetaMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg.class, net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg.newBuilder()
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

      if (tokenGuidBuilder_ == null) {
        tokenGuid_ = null;
      } else {
        tokenGuid_ = null;
        tokenGuidBuilder_ = null;
      }
      if (areaBuilder_ == null) {
        area_ = null;
      } else {
        area_ = null;
        areaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateExposedAreaMetaMsg_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg build() {
      net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg buildPartial() {
      net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg result = new net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg(this);
      result.zoneGuid_ = zoneGuid_;
      if (tokenGuidBuilder_ == null) {
        result.tokenGuid_ = tokenGuid_;
      } else {
        result.tokenGuid_ = tokenGuidBuilder_.build();
      }
      if (areaBuilder_ == null) {
        result.area_ = area_;
      } else {
        result.area_ = areaBuilder_.build();
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
      if (other instanceof net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg) {
        return mergeFrom((net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg other) {
      if (other == net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg.getDefaultInstance()) return this;
      if (!other.getZoneGuid().isEmpty()) {
        zoneGuid_ = other.zoneGuid_;
        onChanged();
      }
      if (other.hasTokenGuid()) {
        mergeTokenGuid(other.getTokenGuid());
      }
      if (other.hasArea()) {
        mergeArea(other.getArea());
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
      net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg) e.getUnfinishedMessage();
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

    private com.google.protobuf.StringValue tokenGuid_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> tokenGuidBuilder_;
    /**
     * <code>.google.protobuf.StringValue token_guid = 2;</code>
     * @return Whether the tokenGuid field is set.
     */
    public boolean hasTokenGuid() {
      return tokenGuidBuilder_ != null || tokenGuid_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue token_guid = 2;</code>
     * @return The tokenGuid.
     */
    public com.google.protobuf.StringValue getTokenGuid() {
      if (tokenGuidBuilder_ == null) {
        return tokenGuid_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : tokenGuid_;
      } else {
        return tokenGuidBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue token_guid = 2;</code>
     */
    public Builder setTokenGuid(com.google.protobuf.StringValue value) {
      if (tokenGuidBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tokenGuid_ = value;
        onChanged();
      } else {
        tokenGuidBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue token_guid = 2;</code>
     */
    public Builder setTokenGuid(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (tokenGuidBuilder_ == null) {
        tokenGuid_ = builderForValue.build();
        onChanged();
      } else {
        tokenGuidBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue token_guid = 2;</code>
     */
    public Builder mergeTokenGuid(com.google.protobuf.StringValue value) {
      if (tokenGuidBuilder_ == null) {
        if (tokenGuid_ != null) {
          tokenGuid_ =
            com.google.protobuf.StringValue.newBuilder(tokenGuid_).mergeFrom(value).buildPartial();
        } else {
          tokenGuid_ = value;
        }
        onChanged();
      } else {
        tokenGuidBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue token_guid = 2;</code>
     */
    public Builder clearTokenGuid() {
      if (tokenGuidBuilder_ == null) {
        tokenGuid_ = null;
        onChanged();
      } else {
        tokenGuid_ = null;
        tokenGuidBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue token_guid = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getTokenGuidBuilder() {
      
      onChanged();
      return getTokenGuidFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue token_guid = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getTokenGuidOrBuilder() {
      if (tokenGuidBuilder_ != null) {
        return tokenGuidBuilder_.getMessageOrBuilder();
      } else {
        return tokenGuid_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : tokenGuid_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue token_guid = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getTokenGuidFieldBuilder() {
      if (tokenGuidBuilder_ == null) {
        tokenGuidBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getTokenGuid(),
                getParentForChildren(),
                isClean());
        tokenGuid_ = null;
      }
      return tokenGuidBuilder_;
    }

    private net.rptools.maptool.server.proto.drawing.AreaDto area_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.AreaDto, net.rptools.maptool.server.proto.drawing.AreaDto.Builder, net.rptools.maptool.server.proto.drawing.AreaDtoOrBuilder> areaBuilder_;
    /**
     * <code>.maptool.AreaDto area = 3;</code>
     * @return Whether the area field is set.
     */
    public boolean hasArea() {
      return areaBuilder_ != null || area_ != null;
    }
    /**
     * <code>.maptool.AreaDto area = 3;</code>
     * @return The area.
     */
    public net.rptools.maptool.server.proto.drawing.AreaDto getArea() {
      if (areaBuilder_ == null) {
        return area_ == null ? net.rptools.maptool.server.proto.drawing.AreaDto.getDefaultInstance() : area_;
      } else {
        return areaBuilder_.getMessage();
      }
    }
    /**
     * <code>.maptool.AreaDto area = 3;</code>
     */
    public Builder setArea(net.rptools.maptool.server.proto.drawing.AreaDto value) {
      if (areaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        area_ = value;
        onChanged();
      } else {
        areaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.maptool.AreaDto area = 3;</code>
     */
    public Builder setArea(
        net.rptools.maptool.server.proto.drawing.AreaDto.Builder builderForValue) {
      if (areaBuilder_ == null) {
        area_ = builderForValue.build();
        onChanged();
      } else {
        areaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.maptool.AreaDto area = 3;</code>
     */
    public Builder mergeArea(net.rptools.maptool.server.proto.drawing.AreaDto value) {
      if (areaBuilder_ == null) {
        if (area_ != null) {
          area_ =
            net.rptools.maptool.server.proto.drawing.AreaDto.newBuilder(area_).mergeFrom(value).buildPartial();
        } else {
          area_ = value;
        }
        onChanged();
      } else {
        areaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.maptool.AreaDto area = 3;</code>
     */
    public Builder clearArea() {
      if (areaBuilder_ == null) {
        area_ = null;
        onChanged();
      } else {
        area_ = null;
        areaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.maptool.AreaDto area = 3;</code>
     */
    public net.rptools.maptool.server.proto.drawing.AreaDto.Builder getAreaBuilder() {
      
      onChanged();
      return getAreaFieldBuilder().getBuilder();
    }
    /**
     * <code>.maptool.AreaDto area = 3;</code>
     */
    public net.rptools.maptool.server.proto.drawing.AreaDtoOrBuilder getAreaOrBuilder() {
      if (areaBuilder_ != null) {
        return areaBuilder_.getMessageOrBuilder();
      } else {
        return area_ == null ?
            net.rptools.maptool.server.proto.drawing.AreaDto.getDefaultInstance() : area_;
      }
    }
    /**
     * <code>.maptool.AreaDto area = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.AreaDto, net.rptools.maptool.server.proto.drawing.AreaDto.Builder, net.rptools.maptool.server.proto.drawing.AreaDtoOrBuilder> 
        getAreaFieldBuilder() {
      if (areaBuilder_ == null) {
        areaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rptools.maptool.server.proto.drawing.AreaDto, net.rptools.maptool.server.proto.drawing.AreaDto.Builder, net.rptools.maptool.server.proto.drawing.AreaDtoOrBuilder>(
                getArea(),
                getParentForChildren(),
                isClean());
        area_ = null;
      }
      return areaBuilder_;
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


    // @@protoc_insertion_point(builder_scope:maptool.UpdateExposedAreaMetaMsg)
  }

  // @@protoc_insertion_point(class_scope:maptool.UpdateExposedAreaMetaMsg)
  private static final net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg();
  }

  public static net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateExposedAreaMetaMsg>
      PARSER = new com.google.protobuf.AbstractParser<UpdateExposedAreaMetaMsg>() {
    @java.lang.Override
    public UpdateExposedAreaMetaMsg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateExposedAreaMetaMsg(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateExposedAreaMetaMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateExposedAreaMetaMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.UpdateExposedAreaMetaMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

