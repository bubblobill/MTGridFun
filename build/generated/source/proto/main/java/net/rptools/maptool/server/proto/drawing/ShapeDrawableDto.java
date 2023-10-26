// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: drawing_dto.proto

package net.rptools.maptool.server.proto.drawing;

/**
 * Protobuf type {@code maptool.ShapeDrawableDto}
 */
public final class ShapeDrawableDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.ShapeDrawableDto)
    ShapeDrawableDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShapeDrawableDto.newBuilder() to construct.
  private ShapeDrawableDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShapeDrawableDto() {
    id_ = "";
    layer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShapeDrawableDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ShapeDrawableDto(
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

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            layer_ = s;
            break;
          }
          case 26: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (name_ != null) {
              subBuilder = name_.toBuilder();
            }
            name_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(name_);
              name_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            net.rptools.maptool.server.proto.drawing.ShapeDto.Builder subBuilder = null;
            if (shape_ != null) {
              subBuilder = shape_.toBuilder();
            }
            shape_ = input.readMessage(net.rptools.maptool.server.proto.drawing.ShapeDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(shape_);
              shape_ = subBuilder.buildPartial();
            }

            break;
          }
          case 40: {

            useAntiAliasing_ = input.readBool();
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
    return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_ShapeDrawableDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_ShapeDrawableDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.drawing.ShapeDrawableDto.class, net.rptools.maptool.server.proto.drawing.ShapeDrawableDto.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
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
   * <code>string id = 1;</code>
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

  public static final int LAYER_FIELD_NUMBER = 2;
  private volatile java.lang.Object layer_;
  /**
   * <code>string layer = 2;</code>
   * @return The layer.
   */
  @java.lang.Override
  public java.lang.String getLayer() {
    java.lang.Object ref = layer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      layer_ = s;
      return s;
    }
  }
  /**
   * <code>string layer = 2;</code>
   * @return The bytes for layer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLayerBytes() {
    java.lang.Object ref = layer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      layer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue name_;
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return name_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   * @return The name.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getName() {
    return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
  }
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
    return getName();
  }

  public static final int SHAPE_FIELD_NUMBER = 4;
  private net.rptools.maptool.server.proto.drawing.ShapeDto shape_;
  /**
   * <code>.maptool.ShapeDto shape = 4;</code>
   * @return Whether the shape field is set.
   */
  @java.lang.Override
  public boolean hasShape() {
    return shape_ != null;
  }
  /**
   * <code>.maptool.ShapeDto shape = 4;</code>
   * @return The shape.
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.ShapeDto getShape() {
    return shape_ == null ? net.rptools.maptool.server.proto.drawing.ShapeDto.getDefaultInstance() : shape_;
  }
  /**
   * <code>.maptool.ShapeDto shape = 4;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.ShapeDtoOrBuilder getShapeOrBuilder() {
    return getShape();
  }

  public static final int USE_ANTI_ALIASING_FIELD_NUMBER = 5;
  private boolean useAntiAliasing_;
  /**
   * <code>bool use_anti_aliasing = 5;</code>
   * @return The useAntiAliasing.
   */
  @java.lang.Override
  public boolean getUseAntiAliasing() {
    return useAntiAliasing_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(layer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, layer_);
    }
    if (name_ != null) {
      output.writeMessage(3, getName());
    }
    if (shape_ != null) {
      output.writeMessage(4, getShape());
    }
    if (useAntiAliasing_ != false) {
      output.writeBool(5, useAntiAliasing_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(layer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, layer_);
    }
    if (name_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getName());
    }
    if (shape_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getShape());
    }
    if (useAntiAliasing_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, useAntiAliasing_);
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
    if (!(obj instanceof net.rptools.maptool.server.proto.drawing.ShapeDrawableDto)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.drawing.ShapeDrawableDto other = (net.rptools.maptool.server.proto.drawing.ShapeDrawableDto) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getLayer()
        .equals(other.getLayer())) return false;
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (hasShape() != other.hasShape()) return false;
    if (hasShape()) {
      if (!getShape()
          .equals(other.getShape())) return false;
    }
    if (getUseAntiAliasing()
        != other.getUseAntiAliasing()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + LAYER_FIELD_NUMBER;
    hash = (53 * hash) + getLayer().hashCode();
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasShape()) {
      hash = (37 * hash) + SHAPE_FIELD_NUMBER;
      hash = (53 * hash) + getShape().hashCode();
    }
    hash = (37 * hash) + USE_ANTI_ALIASING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUseAntiAliasing());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.drawing.ShapeDrawableDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.ShapeDrawableDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.ShapeDrawableDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.ShapeDrawableDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.ShapeDrawableDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.ShapeDrawableDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.ShapeDrawableDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.ShapeDrawableDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.ShapeDrawableDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.ShapeDrawableDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.ShapeDrawableDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.ShapeDrawableDto parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.drawing.ShapeDrawableDto prototype) {
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
   * Protobuf type {@code maptool.ShapeDrawableDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.ShapeDrawableDto)
      net.rptools.maptool.server.proto.drawing.ShapeDrawableDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_ShapeDrawableDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_ShapeDrawableDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.drawing.ShapeDrawableDto.class, net.rptools.maptool.server.proto.drawing.ShapeDrawableDto.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.drawing.ShapeDrawableDto.newBuilder()
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
      id_ = "";

      layer_ = "";

      if (nameBuilder_ == null) {
        name_ = null;
      } else {
        name_ = null;
        nameBuilder_ = null;
      }
      if (shapeBuilder_ == null) {
        shape_ = null;
      } else {
        shape_ = null;
        shapeBuilder_ = null;
      }
      useAntiAliasing_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_ShapeDrawableDto_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.ShapeDrawableDto getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.drawing.ShapeDrawableDto.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.ShapeDrawableDto build() {
      net.rptools.maptool.server.proto.drawing.ShapeDrawableDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.ShapeDrawableDto buildPartial() {
      net.rptools.maptool.server.proto.drawing.ShapeDrawableDto result = new net.rptools.maptool.server.proto.drawing.ShapeDrawableDto(this);
      result.id_ = id_;
      result.layer_ = layer_;
      if (nameBuilder_ == null) {
        result.name_ = name_;
      } else {
        result.name_ = nameBuilder_.build();
      }
      if (shapeBuilder_ == null) {
        result.shape_ = shape_;
      } else {
        result.shape_ = shapeBuilder_.build();
      }
      result.useAntiAliasing_ = useAntiAliasing_;
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
      if (other instanceof net.rptools.maptool.server.proto.drawing.ShapeDrawableDto) {
        return mergeFrom((net.rptools.maptool.server.proto.drawing.ShapeDrawableDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.drawing.ShapeDrawableDto other) {
      if (other == net.rptools.maptool.server.proto.drawing.ShapeDrawableDto.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getLayer().isEmpty()) {
        layer_ = other.layer_;
        onChanged();
      }
      if (other.hasName()) {
        mergeName(other.getName());
      }
      if (other.hasShape()) {
        mergeShape(other.getShape());
      }
      if (other.getUseAntiAliasing() != false) {
        setUseAntiAliasing(other.getUseAntiAliasing());
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
      net.rptools.maptool.server.proto.drawing.ShapeDrawableDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.drawing.ShapeDrawableDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
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
     * <code>string id = 1;</code>
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
     * <code>string id = 1;</code>
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
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
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

    private java.lang.Object layer_ = "";
    /**
     * <code>string layer = 2;</code>
     * @return The layer.
     */
    public java.lang.String getLayer() {
      java.lang.Object ref = layer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        layer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string layer = 2;</code>
     * @return The bytes for layer.
     */
    public com.google.protobuf.ByteString
        getLayerBytes() {
      java.lang.Object ref = layer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        layer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string layer = 2;</code>
     * @param value The layer to set.
     * @return This builder for chaining.
     */
    public Builder setLayer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      layer_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string layer = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLayer() {
      
      layer_ = getDefaultInstance().getLayer();
      onChanged();
      return this;
    }
    /**
     * <code>string layer = 2;</code>
     * @param value The bytes for layer to set.
     * @return This builder for chaining.
     */
    public Builder setLayerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      layer_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue name_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> nameBuilder_;
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return nameBuilder_ != null || name_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     * @return The name.
     */
    public com.google.protobuf.StringValue getName() {
      if (nameBuilder_ == null) {
        return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
      } else {
        return nameBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder setName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
        onChanged();
      } else {
        nameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder setName(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (nameBuilder_ == null) {
        name_ = builderForValue.build();
        onChanged();
      } else {
        nameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder mergeName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (name_ != null) {
          name_ =
            com.google.protobuf.StringValue.newBuilder(name_).mergeFrom(value).buildPartial();
        } else {
          name_ = value;
        }
        onChanged();
      } else {
        nameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public Builder clearName() {
      if (nameBuilder_ == null) {
        name_ = null;
        onChanged();
      } else {
        name_ = null;
        nameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getNameBuilder() {
      
      onChanged();
      return getNameFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
      if (nameBuilder_ != null) {
        return nameBuilder_.getMessageOrBuilder();
      } else {
        return name_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : name_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue name = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getNameFieldBuilder() {
      if (nameBuilder_ == null) {
        nameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getName(),
                getParentForChildren(),
                isClean());
        name_ = null;
      }
      return nameBuilder_;
    }

    private net.rptools.maptool.server.proto.drawing.ShapeDto shape_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.ShapeDto, net.rptools.maptool.server.proto.drawing.ShapeDto.Builder, net.rptools.maptool.server.proto.drawing.ShapeDtoOrBuilder> shapeBuilder_;
    /**
     * <code>.maptool.ShapeDto shape = 4;</code>
     * @return Whether the shape field is set.
     */
    public boolean hasShape() {
      return shapeBuilder_ != null || shape_ != null;
    }
    /**
     * <code>.maptool.ShapeDto shape = 4;</code>
     * @return The shape.
     */
    public net.rptools.maptool.server.proto.drawing.ShapeDto getShape() {
      if (shapeBuilder_ == null) {
        return shape_ == null ? net.rptools.maptool.server.proto.drawing.ShapeDto.getDefaultInstance() : shape_;
      } else {
        return shapeBuilder_.getMessage();
      }
    }
    /**
     * <code>.maptool.ShapeDto shape = 4;</code>
     */
    public Builder setShape(net.rptools.maptool.server.proto.drawing.ShapeDto value) {
      if (shapeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        shape_ = value;
        onChanged();
      } else {
        shapeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.maptool.ShapeDto shape = 4;</code>
     */
    public Builder setShape(
        net.rptools.maptool.server.proto.drawing.ShapeDto.Builder builderForValue) {
      if (shapeBuilder_ == null) {
        shape_ = builderForValue.build();
        onChanged();
      } else {
        shapeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.maptool.ShapeDto shape = 4;</code>
     */
    public Builder mergeShape(net.rptools.maptool.server.proto.drawing.ShapeDto value) {
      if (shapeBuilder_ == null) {
        if (shape_ != null) {
          shape_ =
            net.rptools.maptool.server.proto.drawing.ShapeDto.newBuilder(shape_).mergeFrom(value).buildPartial();
        } else {
          shape_ = value;
        }
        onChanged();
      } else {
        shapeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.maptool.ShapeDto shape = 4;</code>
     */
    public Builder clearShape() {
      if (shapeBuilder_ == null) {
        shape_ = null;
        onChanged();
      } else {
        shape_ = null;
        shapeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.maptool.ShapeDto shape = 4;</code>
     */
    public net.rptools.maptool.server.proto.drawing.ShapeDto.Builder getShapeBuilder() {
      
      onChanged();
      return getShapeFieldBuilder().getBuilder();
    }
    /**
     * <code>.maptool.ShapeDto shape = 4;</code>
     */
    public net.rptools.maptool.server.proto.drawing.ShapeDtoOrBuilder getShapeOrBuilder() {
      if (shapeBuilder_ != null) {
        return shapeBuilder_.getMessageOrBuilder();
      } else {
        return shape_ == null ?
            net.rptools.maptool.server.proto.drawing.ShapeDto.getDefaultInstance() : shape_;
      }
    }
    /**
     * <code>.maptool.ShapeDto shape = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.ShapeDto, net.rptools.maptool.server.proto.drawing.ShapeDto.Builder, net.rptools.maptool.server.proto.drawing.ShapeDtoOrBuilder> 
        getShapeFieldBuilder() {
      if (shapeBuilder_ == null) {
        shapeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rptools.maptool.server.proto.drawing.ShapeDto, net.rptools.maptool.server.proto.drawing.ShapeDto.Builder, net.rptools.maptool.server.proto.drawing.ShapeDtoOrBuilder>(
                getShape(),
                getParentForChildren(),
                isClean());
        shape_ = null;
      }
      return shapeBuilder_;
    }

    private boolean useAntiAliasing_ ;
    /**
     * <code>bool use_anti_aliasing = 5;</code>
     * @return The useAntiAliasing.
     */
    @java.lang.Override
    public boolean getUseAntiAliasing() {
      return useAntiAliasing_;
    }
    /**
     * <code>bool use_anti_aliasing = 5;</code>
     * @param value The useAntiAliasing to set.
     * @return This builder for chaining.
     */
    public Builder setUseAntiAliasing(boolean value) {
      
      useAntiAliasing_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool use_anti_aliasing = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearUseAntiAliasing() {
      
      useAntiAliasing_ = false;
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


    // @@protoc_insertion_point(builder_scope:maptool.ShapeDrawableDto)
  }

  // @@protoc_insertion_point(class_scope:maptool.ShapeDrawableDto)
  private static final net.rptools.maptool.server.proto.drawing.ShapeDrawableDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.drawing.ShapeDrawableDto();
  }

  public static net.rptools.maptool.server.proto.drawing.ShapeDrawableDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShapeDrawableDto>
      PARSER = new com.google.protobuf.AbstractParser<ShapeDrawableDto>() {
    @java.lang.Override
    public ShapeDrawableDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ShapeDrawableDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ShapeDrawableDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShapeDrawableDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.ShapeDrawableDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
