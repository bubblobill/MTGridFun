// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gamedata.proto

package net.rptools.maptool.model.gamedata.proto;

/**
 * Protobuf type {@code maptool.GameDataDto}
 */
public final class GameDataDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.GameDataDto)
    GameDataDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameDataDto.newBuilder() to construct.
  private GameDataDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameDataDto() {
    type_ = "";
    namespace_ = "";
    values_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GameDataDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GameDataDto(
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

            type_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            namespace_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              values_ = new java.util.ArrayList<net.rptools.maptool.model.gamedata.proto.GameDataValueDto>();
              mutable_bitField0_ |= 0x00000001;
            }
            values_.add(
                input.readMessage(net.rptools.maptool.model.gamedata.proto.GameDataValueDto.parser(), extensionRegistry));
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
        values_ = java.util.Collections.unmodifiableList(values_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rptools.maptool.model.gamedata.proto.GameDataProtos.internal_static_maptool_GameDataDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.model.gamedata.proto.GameDataProtos.internal_static_maptool_GameDataDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.model.gamedata.proto.GameDataDto.class, net.rptools.maptool.model.gamedata.proto.GameDataDto.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object type_;
  /**
   * <code>string type = 1;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAMESPACE_FIELD_NUMBER = 2;
  private volatile java.lang.Object namespace_;
  /**
   * <code>string namespace = 2;</code>
   * @return The namespace.
   */
  @java.lang.Override
  public java.lang.String getNamespace() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      namespace_ = s;
      return s;
    }
  }
  /**
   * <code>string namespace = 2;</code>
   * @return The bytes for namespace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNamespaceBytes() {
    java.lang.Object ref = namespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      namespace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUES_FIELD_NUMBER = 3;
  private java.util.List<net.rptools.maptool.model.gamedata.proto.GameDataValueDto> values_;
  /**
   * <code>repeated .maptool.GameDataValueDto values = 3;</code>
   */
  @java.lang.Override
  public java.util.List<net.rptools.maptool.model.gamedata.proto.GameDataValueDto> getValuesList() {
    return values_;
  }
  /**
   * <code>repeated .maptool.GameDataValueDto values = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends net.rptools.maptool.model.gamedata.proto.GameDataValueDtoOrBuilder> 
      getValuesOrBuilderList() {
    return values_;
  }
  /**
   * <code>repeated .maptool.GameDataValueDto values = 3;</code>
   */
  @java.lang.Override
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <code>repeated .maptool.GameDataValueDto values = 3;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.model.gamedata.proto.GameDataValueDto getValues(int index) {
    return values_.get(index);
  }
  /**
   * <code>repeated .maptool.GameDataValueDto values = 3;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.model.gamedata.proto.GameDataValueDtoOrBuilder getValuesOrBuilder(
      int index) {
    return values_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(namespace_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, namespace_);
    }
    for (int i = 0; i < values_.size(); i++) {
      output.writeMessage(3, values_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(namespace_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, namespace_);
    }
    for (int i = 0; i < values_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, values_.get(i));
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
    if (!(obj instanceof net.rptools.maptool.model.gamedata.proto.GameDataDto)) {
      return super.equals(obj);
    }
    net.rptools.maptool.model.gamedata.proto.GameDataDto other = (net.rptools.maptool.model.gamedata.proto.GameDataDto) obj;

    if (!getType()
        .equals(other.getType())) return false;
    if (!getNamespace()
        .equals(other.getNamespace())) return false;
    if (!getValuesList()
        .equals(other.getValuesList())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getNamespace().hashCode();
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.model.gamedata.proto.GameDataDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.model.gamedata.proto.GameDataDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.model.gamedata.proto.GameDataDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.model.gamedata.proto.GameDataDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.model.gamedata.proto.GameDataDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.model.gamedata.proto.GameDataDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.model.gamedata.proto.GameDataDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.model.gamedata.proto.GameDataDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.model.gamedata.proto.GameDataDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.model.gamedata.proto.GameDataDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.model.gamedata.proto.GameDataDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.model.gamedata.proto.GameDataDto parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.model.gamedata.proto.GameDataDto prototype) {
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
   * Protobuf type {@code maptool.GameDataDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.GameDataDto)
      net.rptools.maptool.model.gamedata.proto.GameDataDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.model.gamedata.proto.GameDataProtos.internal_static_maptool_GameDataDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.model.gamedata.proto.GameDataProtos.internal_static_maptool_GameDataDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.model.gamedata.proto.GameDataDto.class, net.rptools.maptool.model.gamedata.proto.GameDataDto.Builder.class);
    }

    // Construct using net.rptools.maptool.model.gamedata.proto.GameDataDto.newBuilder()
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
        getValuesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = "";

      namespace_ = "";

      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.model.gamedata.proto.GameDataProtos.internal_static_maptool_GameDataDto_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.model.gamedata.proto.GameDataDto getDefaultInstanceForType() {
      return net.rptools.maptool.model.gamedata.proto.GameDataDto.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.model.gamedata.proto.GameDataDto build() {
      net.rptools.maptool.model.gamedata.proto.GameDataDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.model.gamedata.proto.GameDataDto buildPartial() {
      net.rptools.maptool.model.gamedata.proto.GameDataDto result = new net.rptools.maptool.model.gamedata.proto.GameDataDto(this);
      int from_bitField0_ = bitField0_;
      result.type_ = type_;
      result.namespace_ = namespace_;
      if (valuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          values_ = java.util.Collections.unmodifiableList(values_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.values_ = values_;
      } else {
        result.values_ = valuesBuilder_.build();
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
      if (other instanceof net.rptools.maptool.model.gamedata.proto.GameDataDto) {
        return mergeFrom((net.rptools.maptool.model.gamedata.proto.GameDataDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.model.gamedata.proto.GameDataDto other) {
      if (other == net.rptools.maptool.model.gamedata.proto.GameDataDto.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
      }
      if (!other.getNamespace().isEmpty()) {
        namespace_ = other.namespace_;
        onChanged();
      }
      if (valuesBuilder_ == null) {
        if (!other.values_.isEmpty()) {
          if (values_.isEmpty()) {
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValuesIsMutable();
            values_.addAll(other.values_);
          }
          onChanged();
        }
      } else {
        if (!other.values_.isEmpty()) {
          if (valuesBuilder_.isEmpty()) {
            valuesBuilder_.dispose();
            valuesBuilder_ = null;
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
            valuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValuesFieldBuilder() : null;
          } else {
            valuesBuilder_.addAllMessages(other.values_);
          }
        }
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
      net.rptools.maptool.model.gamedata.proto.GameDataDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.model.gamedata.proto.GameDataDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 1;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object namespace_ = "";
    /**
     * <code>string namespace = 2;</code>
     * @return The namespace.
     */
    public java.lang.String getNamespace() {
      java.lang.Object ref = namespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        namespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string namespace = 2;</code>
     * @return The bytes for namespace.
     */
    public com.google.protobuf.ByteString
        getNamespaceBytes() {
      java.lang.Object ref = namespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        namespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string namespace = 2;</code>
     * @param value The namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespace(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      namespace_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string namespace = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNamespace() {
      
      namespace_ = getDefaultInstance().getNamespace();
      onChanged();
      return this;
    }
    /**
     * <code>string namespace = 2;</code>
     * @param value The bytes for namespace to set.
     * @return This builder for chaining.
     */
    public Builder setNamespaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      namespace_ = value;
      onChanged();
      return this;
    }

    private java.util.List<net.rptools.maptool.model.gamedata.proto.GameDataValueDto> values_ =
      java.util.Collections.emptyList();
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = new java.util.ArrayList<net.rptools.maptool.model.gamedata.proto.GameDataValueDto>(values_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rptools.maptool.model.gamedata.proto.GameDataValueDto, net.rptools.maptool.model.gamedata.proto.GameDataValueDto.Builder, net.rptools.maptool.model.gamedata.proto.GameDataValueDtoOrBuilder> valuesBuilder_;

    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public java.util.List<net.rptools.maptool.model.gamedata.proto.GameDataValueDto> getValuesList() {
      if (valuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(values_);
      } else {
        return valuesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public int getValuesCount() {
      if (valuesBuilder_ == null) {
        return values_.size();
      } else {
        return valuesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public net.rptools.maptool.model.gamedata.proto.GameDataValueDto getValues(int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);
      } else {
        return valuesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public Builder setValues(
        int index, net.rptools.maptool.model.gamedata.proto.GameDataValueDto value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.set(index, value);
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public Builder setValues(
        int index, net.rptools.maptool.model.gamedata.proto.GameDataValueDto.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.set(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public Builder addValues(net.rptools.maptool.model.gamedata.proto.GameDataValueDto value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public Builder addValues(
        int index, net.rptools.maptool.model.gamedata.proto.GameDataValueDto value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(index, value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public Builder addValues(
        net.rptools.maptool.model.gamedata.proto.GameDataValueDto.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public Builder addValues(
        int index, net.rptools.maptool.model.gamedata.proto.GameDataValueDto.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends net.rptools.maptool.model.gamedata.proto.GameDataValueDto> values) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, values_);
        onChanged();
      } else {
        valuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public Builder removeValues(int index) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.remove(index);
        onChanged();
      } else {
        valuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public net.rptools.maptool.model.gamedata.proto.GameDataValueDto.Builder getValuesBuilder(
        int index) {
      return getValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public net.rptools.maptool.model.gamedata.proto.GameDataValueDtoOrBuilder getValuesOrBuilder(
        int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);  } else {
        return valuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public java.util.List<? extends net.rptools.maptool.model.gamedata.proto.GameDataValueDtoOrBuilder> 
         getValuesOrBuilderList() {
      if (valuesBuilder_ != null) {
        return valuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(values_);
      }
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public net.rptools.maptool.model.gamedata.proto.GameDataValueDto.Builder addValuesBuilder() {
      return getValuesFieldBuilder().addBuilder(
          net.rptools.maptool.model.gamedata.proto.GameDataValueDto.getDefaultInstance());
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public net.rptools.maptool.model.gamedata.proto.GameDataValueDto.Builder addValuesBuilder(
        int index) {
      return getValuesFieldBuilder().addBuilder(
          index, net.rptools.maptool.model.gamedata.proto.GameDataValueDto.getDefaultInstance());
    }
    /**
     * <code>repeated .maptool.GameDataValueDto values = 3;</code>
     */
    public java.util.List<net.rptools.maptool.model.gamedata.proto.GameDataValueDto.Builder> 
         getValuesBuilderList() {
      return getValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rptools.maptool.model.gamedata.proto.GameDataValueDto, net.rptools.maptool.model.gamedata.proto.GameDataValueDto.Builder, net.rptools.maptool.model.gamedata.proto.GameDataValueDtoOrBuilder> 
        getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        valuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            net.rptools.maptool.model.gamedata.proto.GameDataValueDto, net.rptools.maptool.model.gamedata.proto.GameDataValueDto.Builder, net.rptools.maptool.model.gamedata.proto.GameDataValueDtoOrBuilder>(
                values_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        values_ = null;
      }
      return valuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:maptool.GameDataDto)
  }

  // @@protoc_insertion_point(class_scope:maptool.GameDataDto)
  private static final net.rptools.maptool.model.gamedata.proto.GameDataDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.model.gamedata.proto.GameDataDto();
  }

  public static net.rptools.maptool.model.gamedata.proto.GameDataDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameDataDto>
      PARSER = new com.google.protobuf.AbstractParser<GameDataDto>() {
    @java.lang.Override
    public GameDataDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GameDataDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GameDataDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameDataDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.model.gamedata.proto.GameDataDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

