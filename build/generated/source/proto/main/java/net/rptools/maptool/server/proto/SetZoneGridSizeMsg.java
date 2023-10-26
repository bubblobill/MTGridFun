// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message_types.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf type {@code maptool.SetZoneGridSizeMsg}
 */
public final class SetZoneGridSizeMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.SetZoneGridSizeMsg)
    SetZoneGridSizeMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetZoneGridSizeMsg.newBuilder() to construct.
  private SetZoneGridSizeMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetZoneGridSizeMsg() {
    zoneGuid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SetZoneGridSizeMsg();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetZoneGridSizeMsg(
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
          case 16: {

            xOffset_ = input.readInt32();
            break;
          }
          case 24: {

            yOffset_ = input.readInt32();
            break;
          }
          case 32: {

            size_ = input.readInt32();
            break;
          }
          case 40: {

            color_ = input.readInt32();
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
    return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_SetZoneGridSizeMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_SetZoneGridSizeMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.SetZoneGridSizeMsg.class, net.rptools.maptool.server.proto.SetZoneGridSizeMsg.Builder.class);
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

  public static final int X_OFFSET_FIELD_NUMBER = 2;
  private int xOffset_;
  /**
   * <code>int32 x_offset = 2;</code>
   * @return The xOffset.
   */
  @java.lang.Override
  public int getXOffset() {
    return xOffset_;
  }

  public static final int Y_OFFSET_FIELD_NUMBER = 3;
  private int yOffset_;
  /**
   * <code>int32 y_offset = 3;</code>
   * @return The yOffset.
   */
  @java.lang.Override
  public int getYOffset() {
    return yOffset_;
  }

  public static final int SIZE_FIELD_NUMBER = 4;
  private int size_;
  /**
   * <code>int32 size = 4;</code>
   * @return The size.
   */
  @java.lang.Override
  public int getSize() {
    return size_;
  }

  public static final int COLOR_FIELD_NUMBER = 5;
  private int color_;
  /**
   * <code>int32 color = 5;</code>
   * @return The color.
   */
  @java.lang.Override
  public int getColor() {
    return color_;
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
    if (xOffset_ != 0) {
      output.writeInt32(2, xOffset_);
    }
    if (yOffset_ != 0) {
      output.writeInt32(3, yOffset_);
    }
    if (size_ != 0) {
      output.writeInt32(4, size_);
    }
    if (color_ != 0) {
      output.writeInt32(5, color_);
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
    if (xOffset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, xOffset_);
    }
    if (yOffset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, yOffset_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, size_);
    }
    if (color_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, color_);
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
    if (!(obj instanceof net.rptools.maptool.server.proto.SetZoneGridSizeMsg)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.SetZoneGridSizeMsg other = (net.rptools.maptool.server.proto.SetZoneGridSizeMsg) obj;

    if (!getZoneGuid()
        .equals(other.getZoneGuid())) return false;
    if (getXOffset()
        != other.getXOffset()) return false;
    if (getYOffset()
        != other.getYOffset()) return false;
    if (getSize()
        != other.getSize()) return false;
    if (getColor()
        != other.getColor()) return false;
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
    hash = (37 * hash) + X_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getXOffset();
    hash = (37 * hash) + Y_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getYOffset();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (37 * hash) + COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getColor();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.SetZoneGridSizeMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.SetZoneGridSizeMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SetZoneGridSizeMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.SetZoneGridSizeMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SetZoneGridSizeMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.SetZoneGridSizeMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SetZoneGridSizeMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.SetZoneGridSizeMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SetZoneGridSizeMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.SetZoneGridSizeMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SetZoneGridSizeMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.SetZoneGridSizeMsg parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.SetZoneGridSizeMsg prototype) {
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
   * Protobuf type {@code maptool.SetZoneGridSizeMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.SetZoneGridSizeMsg)
      net.rptools.maptool.server.proto.SetZoneGridSizeMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_SetZoneGridSizeMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_SetZoneGridSizeMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.SetZoneGridSizeMsg.class, net.rptools.maptool.server.proto.SetZoneGridSizeMsg.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.SetZoneGridSizeMsg.newBuilder()
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

      xOffset_ = 0;

      yOffset_ = 0;

      size_ = 0;

      color_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_SetZoneGridSizeMsg_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.SetZoneGridSizeMsg getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.SetZoneGridSizeMsg.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.SetZoneGridSizeMsg build() {
      net.rptools.maptool.server.proto.SetZoneGridSizeMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.SetZoneGridSizeMsg buildPartial() {
      net.rptools.maptool.server.proto.SetZoneGridSizeMsg result = new net.rptools.maptool.server.proto.SetZoneGridSizeMsg(this);
      result.zoneGuid_ = zoneGuid_;
      result.xOffset_ = xOffset_;
      result.yOffset_ = yOffset_;
      result.size_ = size_;
      result.color_ = color_;
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
      if (other instanceof net.rptools.maptool.server.proto.SetZoneGridSizeMsg) {
        return mergeFrom((net.rptools.maptool.server.proto.SetZoneGridSizeMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.SetZoneGridSizeMsg other) {
      if (other == net.rptools.maptool.server.proto.SetZoneGridSizeMsg.getDefaultInstance()) return this;
      if (!other.getZoneGuid().isEmpty()) {
        zoneGuid_ = other.zoneGuid_;
        onChanged();
      }
      if (other.getXOffset() != 0) {
        setXOffset(other.getXOffset());
      }
      if (other.getYOffset() != 0) {
        setYOffset(other.getYOffset());
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
      }
      if (other.getColor() != 0) {
        setColor(other.getColor());
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
      net.rptools.maptool.server.proto.SetZoneGridSizeMsg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.SetZoneGridSizeMsg) e.getUnfinishedMessage();
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

    private int xOffset_ ;
    /**
     * <code>int32 x_offset = 2;</code>
     * @return The xOffset.
     */
    @java.lang.Override
    public int getXOffset() {
      return xOffset_;
    }
    /**
     * <code>int32 x_offset = 2;</code>
     * @param value The xOffset to set.
     * @return This builder for chaining.
     */
    public Builder setXOffset(int value) {
      
      xOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 x_offset = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearXOffset() {
      
      xOffset_ = 0;
      onChanged();
      return this;
    }

    private int yOffset_ ;
    /**
     * <code>int32 y_offset = 3;</code>
     * @return The yOffset.
     */
    @java.lang.Override
    public int getYOffset() {
      return yOffset_;
    }
    /**
     * <code>int32 y_offset = 3;</code>
     * @param value The yOffset to set.
     * @return This builder for chaining.
     */
    public Builder setYOffset(int value) {
      
      yOffset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 y_offset = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearYOffset() {
      
      yOffset_ = 0;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <code>int32 size = 4;</code>
     * @return The size.
     */
    @java.lang.Override
    public int getSize() {
      return size_;
    }
    /**
     * <code>int32 size = 4;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 size = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      
      size_ = 0;
      onChanged();
      return this;
    }

    private int color_ ;
    /**
     * <code>int32 color = 5;</code>
     * @return The color.
     */
    @java.lang.Override
    public int getColor() {
      return color_;
    }
    /**
     * <code>int32 color = 5;</code>
     * @param value The color to set.
     * @return This builder for chaining.
     */
    public Builder setColor(int value) {
      
      color_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 color = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearColor() {
      
      color_ = 0;
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


    // @@protoc_insertion_point(builder_scope:maptool.SetZoneGridSizeMsg)
  }

  // @@protoc_insertion_point(class_scope:maptool.SetZoneGridSizeMsg)
  private static final net.rptools.maptool.server.proto.SetZoneGridSizeMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.SetZoneGridSizeMsg();
  }

  public static net.rptools.maptool.server.proto.SetZoneGridSizeMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetZoneGridSizeMsg>
      PARSER = new com.google.protobuf.AbstractParser<SetZoneGridSizeMsg>() {
    @java.lang.Override
    public SetZoneGridSizeMsg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetZoneGridSizeMsg(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetZoneGridSizeMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetZoneGridSizeMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.SetZoneGridSizeMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

