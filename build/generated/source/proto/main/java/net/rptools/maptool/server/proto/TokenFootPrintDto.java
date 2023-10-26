// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf type {@code maptool.TokenFootPrintDto}
 */
public final class TokenFootPrintDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.TokenFootPrintDto)
    TokenFootPrintDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TokenFootPrintDto.newBuilder() to construct.
  private TokenFootPrintDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TokenFootPrintDto() {
    cellSet_ = java.util.Collections.emptyList();
    name_ = "";
    id_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TokenFootPrintDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TokenFootPrintDto(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              cellSet_ = new java.util.ArrayList<net.rptools.maptool.server.proto.drawing.IntPointDto>();
              mutable_bitField0_ |= 0x00000001;
            }
            cellSet_.add(
                input.readMessage(net.rptools.maptool.server.proto.drawing.IntPointDto.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 32: {

            isDefault_ = input.readBool();
            break;
          }
          case 41: {

            scale_ = input.readDouble();
            break;
          }
          case 48: {

            localizeName_ = input.readBool();
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
        cellSet_ = java.util.Collections.unmodifiableList(cellSet_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TokenFootPrintDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TokenFootPrintDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.TokenFootPrintDto.class, net.rptools.maptool.server.proto.TokenFootPrintDto.Builder.class);
  }

  public static final int CELL_SET_FIELD_NUMBER = 1;
  private java.util.List<net.rptools.maptool.server.proto.drawing.IntPointDto> cellSet_;
  /**
   * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
   */
  @java.lang.Override
  public java.util.List<net.rptools.maptool.server.proto.drawing.IntPointDto> getCellSetList() {
    return cellSet_;
  }
  /**
   * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends net.rptools.maptool.server.proto.drawing.IntPointDtoOrBuilder> 
      getCellSetOrBuilderList() {
    return cellSet_;
  }
  /**
   * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
   */
  @java.lang.Override
  public int getCellSetCount() {
    return cellSet_.size();
  }
  /**
   * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.IntPointDto getCellSet(int index) {
    return cellSet_.get(index);
  }
  /**
   * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.IntPointDtoOrBuilder getCellSetOrBuilder(
      int index) {
    return cellSet_.get(index);
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 3;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 3;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IS_DEFAULT_FIELD_NUMBER = 4;
  private boolean isDefault_;
  /**
   * <code>bool is_default = 4;</code>
   * @return The isDefault.
   */
  @java.lang.Override
  public boolean getIsDefault() {
    return isDefault_;
  }

  public static final int SCALE_FIELD_NUMBER = 5;
  private double scale_;
  /**
   * <code>double scale = 5;</code>
   * @return The scale.
   */
  @java.lang.Override
  public double getScale() {
    return scale_;
  }

  public static final int LOCALIZE_NAME_FIELD_NUMBER = 6;
  private boolean localizeName_;
  /**
   * <code>bool localize_name = 6;</code>
   * @return The localizeName.
   */
  @java.lang.Override
  public boolean getLocalizeName() {
    return localizeName_;
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
    for (int i = 0; i < cellSet_.size(); i++) {
      output.writeMessage(1, cellSet_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, id_);
    }
    if (isDefault_ != false) {
      output.writeBool(4, isDefault_);
    }
    if (java.lang.Double.doubleToRawLongBits(scale_) != 0) {
      output.writeDouble(5, scale_);
    }
    if (localizeName_ != false) {
      output.writeBool(6, localizeName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < cellSet_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, cellSet_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, id_);
    }
    if (isDefault_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isDefault_);
    }
    if (java.lang.Double.doubleToRawLongBits(scale_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, scale_);
    }
    if (localizeName_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, localizeName_);
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
    if (!(obj instanceof net.rptools.maptool.server.proto.TokenFootPrintDto)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.TokenFootPrintDto other = (net.rptools.maptool.server.proto.TokenFootPrintDto) obj;

    if (!getCellSetList()
        .equals(other.getCellSetList())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getId()
        .equals(other.getId())) return false;
    if (getIsDefault()
        != other.getIsDefault()) return false;
    if (java.lang.Double.doubleToLongBits(getScale())
        != java.lang.Double.doubleToLongBits(
            other.getScale())) return false;
    if (getLocalizeName()
        != other.getLocalizeName()) return false;
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
    if (getCellSetCount() > 0) {
      hash = (37 * hash) + CELL_SET_FIELD_NUMBER;
      hash = (53 * hash) + getCellSetList().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + IS_DEFAULT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsDefault());
    hash = (37 * hash) + SCALE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getScale()));
    hash = (37 * hash) + LOCALIZE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLocalizeName());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.TokenFootPrintDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.TokenFootPrintDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TokenFootPrintDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.TokenFootPrintDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TokenFootPrintDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.TokenFootPrintDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TokenFootPrintDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.TokenFootPrintDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TokenFootPrintDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.TokenFootPrintDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.TokenFootPrintDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.TokenFootPrintDto parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.TokenFootPrintDto prototype) {
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
   * Protobuf type {@code maptool.TokenFootPrintDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.TokenFootPrintDto)
      net.rptools.maptool.server.proto.TokenFootPrintDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TokenFootPrintDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TokenFootPrintDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.TokenFootPrintDto.class, net.rptools.maptool.server.proto.TokenFootPrintDto.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.TokenFootPrintDto.newBuilder()
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
        getCellSetFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (cellSetBuilder_ == null) {
        cellSet_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        cellSetBuilder_.clear();
      }
      name_ = "";

      id_ = "";

      isDefault_ = false;

      scale_ = 0D;

      localizeName_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_TokenFootPrintDto_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.TokenFootPrintDto getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.TokenFootPrintDto.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.TokenFootPrintDto build() {
      net.rptools.maptool.server.proto.TokenFootPrintDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.TokenFootPrintDto buildPartial() {
      net.rptools.maptool.server.proto.TokenFootPrintDto result = new net.rptools.maptool.server.proto.TokenFootPrintDto(this);
      int from_bitField0_ = bitField0_;
      if (cellSetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cellSet_ = java.util.Collections.unmodifiableList(cellSet_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cellSet_ = cellSet_;
      } else {
        result.cellSet_ = cellSetBuilder_.build();
      }
      result.name_ = name_;
      result.id_ = id_;
      result.isDefault_ = isDefault_;
      result.scale_ = scale_;
      result.localizeName_ = localizeName_;
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
      if (other instanceof net.rptools.maptool.server.proto.TokenFootPrintDto) {
        return mergeFrom((net.rptools.maptool.server.proto.TokenFootPrintDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.TokenFootPrintDto other) {
      if (other == net.rptools.maptool.server.proto.TokenFootPrintDto.getDefaultInstance()) return this;
      if (cellSetBuilder_ == null) {
        if (!other.cellSet_.isEmpty()) {
          if (cellSet_.isEmpty()) {
            cellSet_ = other.cellSet_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCellSetIsMutable();
            cellSet_.addAll(other.cellSet_);
          }
          onChanged();
        }
      } else {
        if (!other.cellSet_.isEmpty()) {
          if (cellSetBuilder_.isEmpty()) {
            cellSetBuilder_.dispose();
            cellSetBuilder_ = null;
            cellSet_ = other.cellSet_;
            bitField0_ = (bitField0_ & ~0x00000001);
            cellSetBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCellSetFieldBuilder() : null;
          } else {
            cellSetBuilder_.addAllMessages(other.cellSet_);
          }
        }
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (other.getIsDefault() != false) {
        setIsDefault(other.getIsDefault());
      }
      if (other.getScale() != 0D) {
        setScale(other.getScale());
      }
      if (other.getLocalizeName() != false) {
        setLocalizeName(other.getLocalizeName());
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
      net.rptools.maptool.server.proto.TokenFootPrintDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.TokenFootPrintDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<net.rptools.maptool.server.proto.drawing.IntPointDto> cellSet_ =
      java.util.Collections.emptyList();
    private void ensureCellSetIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cellSet_ = new java.util.ArrayList<net.rptools.maptool.server.proto.drawing.IntPointDto>(cellSet_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.IntPointDto, net.rptools.maptool.server.proto.drawing.IntPointDto.Builder, net.rptools.maptool.server.proto.drawing.IntPointDtoOrBuilder> cellSetBuilder_;

    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public java.util.List<net.rptools.maptool.server.proto.drawing.IntPointDto> getCellSetList() {
      if (cellSetBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cellSet_);
      } else {
        return cellSetBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public int getCellSetCount() {
      if (cellSetBuilder_ == null) {
        return cellSet_.size();
      } else {
        return cellSetBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public net.rptools.maptool.server.proto.drawing.IntPointDto getCellSet(int index) {
      if (cellSetBuilder_ == null) {
        return cellSet_.get(index);
      } else {
        return cellSetBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public Builder setCellSet(
        int index, net.rptools.maptool.server.proto.drawing.IntPointDto value) {
      if (cellSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCellSetIsMutable();
        cellSet_.set(index, value);
        onChanged();
      } else {
        cellSetBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public Builder setCellSet(
        int index, net.rptools.maptool.server.proto.drawing.IntPointDto.Builder builderForValue) {
      if (cellSetBuilder_ == null) {
        ensureCellSetIsMutable();
        cellSet_.set(index, builderForValue.build());
        onChanged();
      } else {
        cellSetBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public Builder addCellSet(net.rptools.maptool.server.proto.drawing.IntPointDto value) {
      if (cellSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCellSetIsMutable();
        cellSet_.add(value);
        onChanged();
      } else {
        cellSetBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public Builder addCellSet(
        int index, net.rptools.maptool.server.proto.drawing.IntPointDto value) {
      if (cellSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCellSetIsMutable();
        cellSet_.add(index, value);
        onChanged();
      } else {
        cellSetBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public Builder addCellSet(
        net.rptools.maptool.server.proto.drawing.IntPointDto.Builder builderForValue) {
      if (cellSetBuilder_ == null) {
        ensureCellSetIsMutable();
        cellSet_.add(builderForValue.build());
        onChanged();
      } else {
        cellSetBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public Builder addCellSet(
        int index, net.rptools.maptool.server.proto.drawing.IntPointDto.Builder builderForValue) {
      if (cellSetBuilder_ == null) {
        ensureCellSetIsMutable();
        cellSet_.add(index, builderForValue.build());
        onChanged();
      } else {
        cellSetBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public Builder addAllCellSet(
        java.lang.Iterable<? extends net.rptools.maptool.server.proto.drawing.IntPointDto> values) {
      if (cellSetBuilder_ == null) {
        ensureCellSetIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cellSet_);
        onChanged();
      } else {
        cellSetBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public Builder clearCellSet() {
      if (cellSetBuilder_ == null) {
        cellSet_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        cellSetBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public Builder removeCellSet(int index) {
      if (cellSetBuilder_ == null) {
        ensureCellSetIsMutable();
        cellSet_.remove(index);
        onChanged();
      } else {
        cellSetBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public net.rptools.maptool.server.proto.drawing.IntPointDto.Builder getCellSetBuilder(
        int index) {
      return getCellSetFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public net.rptools.maptool.server.proto.drawing.IntPointDtoOrBuilder getCellSetOrBuilder(
        int index) {
      if (cellSetBuilder_ == null) {
        return cellSet_.get(index);  } else {
        return cellSetBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public java.util.List<? extends net.rptools.maptool.server.proto.drawing.IntPointDtoOrBuilder> 
         getCellSetOrBuilderList() {
      if (cellSetBuilder_ != null) {
        return cellSetBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cellSet_);
      }
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public net.rptools.maptool.server.proto.drawing.IntPointDto.Builder addCellSetBuilder() {
      return getCellSetFieldBuilder().addBuilder(
          net.rptools.maptool.server.proto.drawing.IntPointDto.getDefaultInstance());
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public net.rptools.maptool.server.proto.drawing.IntPointDto.Builder addCellSetBuilder(
        int index) {
      return getCellSetFieldBuilder().addBuilder(
          index, net.rptools.maptool.server.proto.drawing.IntPointDto.getDefaultInstance());
    }
    /**
     * <code>repeated .maptool.IntPointDto cell_set = 1;</code>
     */
    public java.util.List<net.rptools.maptool.server.proto.drawing.IntPointDto.Builder> 
         getCellSetBuilderList() {
      return getCellSetFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.IntPointDto, net.rptools.maptool.server.proto.drawing.IntPointDto.Builder, net.rptools.maptool.server.proto.drawing.IntPointDtoOrBuilder> 
        getCellSetFieldBuilder() {
      if (cellSetBuilder_ == null) {
        cellSetBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            net.rptools.maptool.server.proto.drawing.IntPointDto, net.rptools.maptool.server.proto.drawing.IntPointDto.Builder, net.rptools.maptool.server.proto.drawing.IntPointDtoOrBuilder>(
                cellSet_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        cellSet_ = null;
      }
      return cellSetBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 3;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 3;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 3;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 3;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private boolean isDefault_ ;
    /**
     * <code>bool is_default = 4;</code>
     * @return The isDefault.
     */
    @java.lang.Override
    public boolean getIsDefault() {
      return isDefault_;
    }
    /**
     * <code>bool is_default = 4;</code>
     * @param value The isDefault to set.
     * @return This builder for chaining.
     */
    public Builder setIsDefault(boolean value) {
      
      isDefault_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_default = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsDefault() {
      
      isDefault_ = false;
      onChanged();
      return this;
    }

    private double scale_ ;
    /**
     * <code>double scale = 5;</code>
     * @return The scale.
     */
    @java.lang.Override
    public double getScale() {
      return scale_;
    }
    /**
     * <code>double scale = 5;</code>
     * @param value The scale to set.
     * @return This builder for chaining.
     */
    public Builder setScale(double value) {
      
      scale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double scale = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearScale() {
      
      scale_ = 0D;
      onChanged();
      return this;
    }

    private boolean localizeName_ ;
    /**
     * <code>bool localize_name = 6;</code>
     * @return The localizeName.
     */
    @java.lang.Override
    public boolean getLocalizeName() {
      return localizeName_;
    }
    /**
     * <code>bool localize_name = 6;</code>
     * @param value The localizeName to set.
     * @return This builder for chaining.
     */
    public Builder setLocalizeName(boolean value) {
      
      localizeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool localize_name = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocalizeName() {
      
      localizeName_ = false;
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


    // @@protoc_insertion_point(builder_scope:maptool.TokenFootPrintDto)
  }

  // @@protoc_insertion_point(class_scope:maptool.TokenFootPrintDto)
  private static final net.rptools.maptool.server.proto.TokenFootPrintDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.TokenFootPrintDto();
  }

  public static net.rptools.maptool.server.proto.TokenFootPrintDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TokenFootPrintDto>
      PARSER = new com.google.protobuf.AbstractParser<TokenFootPrintDto>() {
    @java.lang.Override
    public TokenFootPrintDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TokenFootPrintDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TokenFootPrintDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TokenFootPrintDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.TokenFootPrintDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

