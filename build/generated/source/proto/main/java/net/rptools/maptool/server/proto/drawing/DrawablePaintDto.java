// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: drawing_dto.proto

package net.rptools.maptool.server.proto.drawing;

/**
 * Protobuf type {@code maptool.DrawablePaintDto}
 */
public final class DrawablePaintDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.DrawablePaintDto)
    DrawablePaintDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DrawablePaintDto.newBuilder() to construct.
  private DrawablePaintDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DrawablePaintDto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DrawablePaintDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DrawablePaintDto(
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
            net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.Builder subBuilder = null;
            if (paintTypeCase_ == 1) {
              subBuilder = ((net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto) paintType_).toBuilder();
            }
            paintType_ =
                input.readMessage(net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto) paintType_);
              paintType_ = subBuilder.buildPartial();
            }
            paintTypeCase_ = 1;
            break;
          }
          case 18: {
            net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.Builder subBuilder = null;
            if (paintTypeCase_ == 2) {
              subBuilder = ((net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto) paintType_).toBuilder();
            }
            paintType_ =
                input.readMessage(net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto) paintType_);
              paintType_ = subBuilder.buildPartial();
            }
            paintTypeCase_ = 2;
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
    return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_DrawablePaintDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_DrawablePaintDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.drawing.DrawablePaintDto.class, net.rptools.maptool.server.proto.drawing.DrawablePaintDto.Builder.class);
  }

  private int paintTypeCase_ = 0;
  private java.lang.Object paintType_;
  public enum PaintTypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    COLOR_PAINT(1),
    TEXTURE_PAINT(2),
    PAINTTYPE_NOT_SET(0);
    private final int value;
    private PaintTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PaintTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static PaintTypeCase forNumber(int value) {
      switch (value) {
        case 1: return COLOR_PAINT;
        case 2: return TEXTURE_PAINT;
        case 0: return PAINTTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public PaintTypeCase
  getPaintTypeCase() {
    return PaintTypeCase.forNumber(
        paintTypeCase_);
  }

  public static final int COLOR_PAINT_FIELD_NUMBER = 1;
  /**
   * <code>.maptool.DrawableColorPaintDto color_paint = 1;</code>
   * @return Whether the colorPaint field is set.
   */
  @java.lang.Override
  public boolean hasColorPaint() {
    return paintTypeCase_ == 1;
  }
  /**
   * <code>.maptool.DrawableColorPaintDto color_paint = 1;</code>
   * @return The colorPaint.
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto getColorPaint() {
    if (paintTypeCase_ == 1) {
       return (net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto) paintType_;
    }
    return net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.getDefaultInstance();
  }
  /**
   * <code>.maptool.DrawableColorPaintDto color_paint = 1;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.DrawableColorPaintDtoOrBuilder getColorPaintOrBuilder() {
    if (paintTypeCase_ == 1) {
       return (net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto) paintType_;
    }
    return net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.getDefaultInstance();
  }

  public static final int TEXTURE_PAINT_FIELD_NUMBER = 2;
  /**
   * <code>.maptool.DrawableTexturePaintDto texture_paint = 2;</code>
   * @return Whether the texturePaint field is set.
   */
  @java.lang.Override
  public boolean hasTexturePaint() {
    return paintTypeCase_ == 2;
  }
  /**
   * <code>.maptool.DrawableTexturePaintDto texture_paint = 2;</code>
   * @return The texturePaint.
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto getTexturePaint() {
    if (paintTypeCase_ == 2) {
       return (net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto) paintType_;
    }
    return net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.getDefaultInstance();
  }
  /**
   * <code>.maptool.DrawableTexturePaintDto texture_paint = 2;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDtoOrBuilder getTexturePaintOrBuilder() {
    if (paintTypeCase_ == 2) {
       return (net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto) paintType_;
    }
    return net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.getDefaultInstance();
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
    if (paintTypeCase_ == 1) {
      output.writeMessage(1, (net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto) paintType_);
    }
    if (paintTypeCase_ == 2) {
      output.writeMessage(2, (net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto) paintType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (paintTypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto) paintType_);
    }
    if (paintTypeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto) paintType_);
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
    if (!(obj instanceof net.rptools.maptool.server.proto.drawing.DrawablePaintDto)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.drawing.DrawablePaintDto other = (net.rptools.maptool.server.proto.drawing.DrawablePaintDto) obj;

    if (!getPaintTypeCase().equals(other.getPaintTypeCase())) return false;
    switch (paintTypeCase_) {
      case 1:
        if (!getColorPaint()
            .equals(other.getColorPaint())) return false;
        break;
      case 2:
        if (!getTexturePaint()
            .equals(other.getTexturePaint())) return false;
        break;
      case 0:
      default:
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
    switch (paintTypeCase_) {
      case 1:
        hash = (37 * hash) + COLOR_PAINT_FIELD_NUMBER;
        hash = (53 * hash) + getColorPaint().hashCode();
        break;
      case 2:
        hash = (37 * hash) + TEXTURE_PAINT_FIELD_NUMBER;
        hash = (53 * hash) + getTexturePaint().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.drawing.DrawablePaintDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.DrawablePaintDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.DrawablePaintDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.DrawablePaintDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.DrawablePaintDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.DrawablePaintDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.DrawablePaintDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.DrawablePaintDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.DrawablePaintDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.DrawablePaintDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.DrawablePaintDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.DrawablePaintDto parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.drawing.DrawablePaintDto prototype) {
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
   * Protobuf type {@code maptool.DrawablePaintDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.DrawablePaintDto)
      net.rptools.maptool.server.proto.drawing.DrawablePaintDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_DrawablePaintDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_DrawablePaintDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.drawing.DrawablePaintDto.class, net.rptools.maptool.server.proto.drawing.DrawablePaintDto.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.drawing.DrawablePaintDto.newBuilder()
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
      paintTypeCase_ = 0;
      paintType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_DrawablePaintDto_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.DrawablePaintDto getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.drawing.DrawablePaintDto.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.DrawablePaintDto build() {
      net.rptools.maptool.server.proto.drawing.DrawablePaintDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.DrawablePaintDto buildPartial() {
      net.rptools.maptool.server.proto.drawing.DrawablePaintDto result = new net.rptools.maptool.server.proto.drawing.DrawablePaintDto(this);
      if (paintTypeCase_ == 1) {
        if (colorPaintBuilder_ == null) {
          result.paintType_ = paintType_;
        } else {
          result.paintType_ = colorPaintBuilder_.build();
        }
      }
      if (paintTypeCase_ == 2) {
        if (texturePaintBuilder_ == null) {
          result.paintType_ = paintType_;
        } else {
          result.paintType_ = texturePaintBuilder_.build();
        }
      }
      result.paintTypeCase_ = paintTypeCase_;
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
      if (other instanceof net.rptools.maptool.server.proto.drawing.DrawablePaintDto) {
        return mergeFrom((net.rptools.maptool.server.proto.drawing.DrawablePaintDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.drawing.DrawablePaintDto other) {
      if (other == net.rptools.maptool.server.proto.drawing.DrawablePaintDto.getDefaultInstance()) return this;
      switch (other.getPaintTypeCase()) {
        case COLOR_PAINT: {
          mergeColorPaint(other.getColorPaint());
          break;
        }
        case TEXTURE_PAINT: {
          mergeTexturePaint(other.getTexturePaint());
          break;
        }
        case PAINTTYPE_NOT_SET: {
          break;
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
      net.rptools.maptool.server.proto.drawing.DrawablePaintDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.drawing.DrawablePaintDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int paintTypeCase_ = 0;
    private java.lang.Object paintType_;
    public PaintTypeCase
        getPaintTypeCase() {
      return PaintTypeCase.forNumber(
          paintTypeCase_);
    }

    public Builder clearPaintType() {
      paintTypeCase_ = 0;
      paintType_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto, net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.Builder, net.rptools.maptool.server.proto.drawing.DrawableColorPaintDtoOrBuilder> colorPaintBuilder_;
    /**
     * <code>.maptool.DrawableColorPaintDto color_paint = 1;</code>
     * @return Whether the colorPaint field is set.
     */
    @java.lang.Override
    public boolean hasColorPaint() {
      return paintTypeCase_ == 1;
    }
    /**
     * <code>.maptool.DrawableColorPaintDto color_paint = 1;</code>
     * @return The colorPaint.
     */
    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto getColorPaint() {
      if (colorPaintBuilder_ == null) {
        if (paintTypeCase_ == 1) {
          return (net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto) paintType_;
        }
        return net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.getDefaultInstance();
      } else {
        if (paintTypeCase_ == 1) {
          return colorPaintBuilder_.getMessage();
        }
        return net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.getDefaultInstance();
      }
    }
    /**
     * <code>.maptool.DrawableColorPaintDto color_paint = 1;</code>
     */
    public Builder setColorPaint(net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto value) {
      if (colorPaintBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        paintType_ = value;
        onChanged();
      } else {
        colorPaintBuilder_.setMessage(value);
      }
      paintTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.maptool.DrawableColorPaintDto color_paint = 1;</code>
     */
    public Builder setColorPaint(
        net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.Builder builderForValue) {
      if (colorPaintBuilder_ == null) {
        paintType_ = builderForValue.build();
        onChanged();
      } else {
        colorPaintBuilder_.setMessage(builderForValue.build());
      }
      paintTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.maptool.DrawableColorPaintDto color_paint = 1;</code>
     */
    public Builder mergeColorPaint(net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto value) {
      if (colorPaintBuilder_ == null) {
        if (paintTypeCase_ == 1 &&
            paintType_ != net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.getDefaultInstance()) {
          paintType_ = net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.newBuilder((net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto) paintType_)
              .mergeFrom(value).buildPartial();
        } else {
          paintType_ = value;
        }
        onChanged();
      } else {
        if (paintTypeCase_ == 1) {
          colorPaintBuilder_.mergeFrom(value);
        } else {
          colorPaintBuilder_.setMessage(value);
        }
      }
      paintTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.maptool.DrawableColorPaintDto color_paint = 1;</code>
     */
    public Builder clearColorPaint() {
      if (colorPaintBuilder_ == null) {
        if (paintTypeCase_ == 1) {
          paintTypeCase_ = 0;
          paintType_ = null;
          onChanged();
        }
      } else {
        if (paintTypeCase_ == 1) {
          paintTypeCase_ = 0;
          paintType_ = null;
        }
        colorPaintBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.maptool.DrawableColorPaintDto color_paint = 1;</code>
     */
    public net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.Builder getColorPaintBuilder() {
      return getColorPaintFieldBuilder().getBuilder();
    }
    /**
     * <code>.maptool.DrawableColorPaintDto color_paint = 1;</code>
     */
    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.DrawableColorPaintDtoOrBuilder getColorPaintOrBuilder() {
      if ((paintTypeCase_ == 1) && (colorPaintBuilder_ != null)) {
        return colorPaintBuilder_.getMessageOrBuilder();
      } else {
        if (paintTypeCase_ == 1) {
          return (net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto) paintType_;
        }
        return net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.getDefaultInstance();
      }
    }
    /**
     * <code>.maptool.DrawableColorPaintDto color_paint = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto, net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.Builder, net.rptools.maptool.server.proto.drawing.DrawableColorPaintDtoOrBuilder> 
        getColorPaintFieldBuilder() {
      if (colorPaintBuilder_ == null) {
        if (!(paintTypeCase_ == 1)) {
          paintType_ = net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.getDefaultInstance();
        }
        colorPaintBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto, net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto.Builder, net.rptools.maptool.server.proto.drawing.DrawableColorPaintDtoOrBuilder>(
                (net.rptools.maptool.server.proto.drawing.DrawableColorPaintDto) paintType_,
                getParentForChildren(),
                isClean());
        paintType_ = null;
      }
      paintTypeCase_ = 1;
      onChanged();;
      return colorPaintBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto, net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.Builder, net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDtoOrBuilder> texturePaintBuilder_;
    /**
     * <code>.maptool.DrawableTexturePaintDto texture_paint = 2;</code>
     * @return Whether the texturePaint field is set.
     */
    @java.lang.Override
    public boolean hasTexturePaint() {
      return paintTypeCase_ == 2;
    }
    /**
     * <code>.maptool.DrawableTexturePaintDto texture_paint = 2;</code>
     * @return The texturePaint.
     */
    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto getTexturePaint() {
      if (texturePaintBuilder_ == null) {
        if (paintTypeCase_ == 2) {
          return (net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto) paintType_;
        }
        return net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.getDefaultInstance();
      } else {
        if (paintTypeCase_ == 2) {
          return texturePaintBuilder_.getMessage();
        }
        return net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.getDefaultInstance();
      }
    }
    /**
     * <code>.maptool.DrawableTexturePaintDto texture_paint = 2;</code>
     */
    public Builder setTexturePaint(net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto value) {
      if (texturePaintBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        paintType_ = value;
        onChanged();
      } else {
        texturePaintBuilder_.setMessage(value);
      }
      paintTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.maptool.DrawableTexturePaintDto texture_paint = 2;</code>
     */
    public Builder setTexturePaint(
        net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.Builder builderForValue) {
      if (texturePaintBuilder_ == null) {
        paintType_ = builderForValue.build();
        onChanged();
      } else {
        texturePaintBuilder_.setMessage(builderForValue.build());
      }
      paintTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.maptool.DrawableTexturePaintDto texture_paint = 2;</code>
     */
    public Builder mergeTexturePaint(net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto value) {
      if (texturePaintBuilder_ == null) {
        if (paintTypeCase_ == 2 &&
            paintType_ != net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.getDefaultInstance()) {
          paintType_ = net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.newBuilder((net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto) paintType_)
              .mergeFrom(value).buildPartial();
        } else {
          paintType_ = value;
        }
        onChanged();
      } else {
        if (paintTypeCase_ == 2) {
          texturePaintBuilder_.mergeFrom(value);
        } else {
          texturePaintBuilder_.setMessage(value);
        }
      }
      paintTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.maptool.DrawableTexturePaintDto texture_paint = 2;</code>
     */
    public Builder clearTexturePaint() {
      if (texturePaintBuilder_ == null) {
        if (paintTypeCase_ == 2) {
          paintTypeCase_ = 0;
          paintType_ = null;
          onChanged();
        }
      } else {
        if (paintTypeCase_ == 2) {
          paintTypeCase_ = 0;
          paintType_ = null;
        }
        texturePaintBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.maptool.DrawableTexturePaintDto texture_paint = 2;</code>
     */
    public net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.Builder getTexturePaintBuilder() {
      return getTexturePaintFieldBuilder().getBuilder();
    }
    /**
     * <code>.maptool.DrawableTexturePaintDto texture_paint = 2;</code>
     */
    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDtoOrBuilder getTexturePaintOrBuilder() {
      if ((paintTypeCase_ == 2) && (texturePaintBuilder_ != null)) {
        return texturePaintBuilder_.getMessageOrBuilder();
      } else {
        if (paintTypeCase_ == 2) {
          return (net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto) paintType_;
        }
        return net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.getDefaultInstance();
      }
    }
    /**
     * <code>.maptool.DrawableTexturePaintDto texture_paint = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto, net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.Builder, net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDtoOrBuilder> 
        getTexturePaintFieldBuilder() {
      if (texturePaintBuilder_ == null) {
        if (!(paintTypeCase_ == 2)) {
          paintType_ = net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.getDefaultInstance();
        }
        texturePaintBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto, net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto.Builder, net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDtoOrBuilder>(
                (net.rptools.maptool.server.proto.drawing.DrawableTexturePaintDto) paintType_,
                getParentForChildren(),
                isClean());
        paintType_ = null;
      }
      paintTypeCase_ = 2;
      onChanged();;
      return texturePaintBuilder_;
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


    // @@protoc_insertion_point(builder_scope:maptool.DrawablePaintDto)
  }

  // @@protoc_insertion_point(class_scope:maptool.DrawablePaintDto)
  private static final net.rptools.maptool.server.proto.drawing.DrawablePaintDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.drawing.DrawablePaintDto();
  }

  public static net.rptools.maptool.server.proto.drawing.DrawablePaintDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DrawablePaintDto>
      PARSER = new com.google.protobuf.AbstractParser<DrawablePaintDto>() {
    @java.lang.Override
    public DrawablePaintDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DrawablePaintDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DrawablePaintDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DrawablePaintDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.DrawablePaintDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

