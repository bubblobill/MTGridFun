// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: drawing_dto.proto

package net.rptools.maptool.server.proto.drawing;

/**
 * Protobuf type {@code maptool.CubicToSegment}
 */
public final class CubicToSegment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.CubicToSegment)
    CubicToSegmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CubicToSegment.newBuilder() to construct.
  private CubicToSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CubicToSegment() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CubicToSegment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CubicToSegment(
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
            net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder subBuilder = null;
            if (point0_ != null) {
              subBuilder = point0_.toBuilder();
            }
            point0_ = input.readMessage(net.rptools.maptool.server.proto.drawing.DoublePointDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(point0_);
              point0_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder subBuilder = null;
            if (point1_ != null) {
              subBuilder = point1_.toBuilder();
            }
            point1_ = input.readMessage(net.rptools.maptool.server.proto.drawing.DoublePointDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(point1_);
              point1_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder subBuilder = null;
            if (point2_ != null) {
              subBuilder = point2_.toBuilder();
            }
            point2_ = input.readMessage(net.rptools.maptool.server.proto.drawing.DoublePointDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(point2_);
              point2_ = subBuilder.buildPartial();
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
    return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_CubicToSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_CubicToSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.drawing.CubicToSegment.class, net.rptools.maptool.server.proto.drawing.CubicToSegment.Builder.class);
  }

  public static final int POINT_0_FIELD_NUMBER = 1;
  private net.rptools.maptool.server.proto.drawing.DoublePointDto point0_;
  /**
   * <code>.maptool.DoublePointDto point_0 = 1;</code>
   * @return Whether the point0 field is set.
   */
  @java.lang.Override
  public boolean hasPoint0() {
    return point0_ != null;
  }
  /**
   * <code>.maptool.DoublePointDto point_0 = 1;</code>
   * @return The point0.
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.DoublePointDto getPoint0() {
    return point0_ == null ? net.rptools.maptool.server.proto.drawing.DoublePointDto.getDefaultInstance() : point0_;
  }
  /**
   * <code>.maptool.DoublePointDto point_0 = 1;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder getPoint0OrBuilder() {
    return getPoint0();
  }

  public static final int POINT_1_FIELD_NUMBER = 2;
  private net.rptools.maptool.server.proto.drawing.DoublePointDto point1_;
  /**
   * <code>.maptool.DoublePointDto point_1 = 2;</code>
   * @return Whether the point1 field is set.
   */
  @java.lang.Override
  public boolean hasPoint1() {
    return point1_ != null;
  }
  /**
   * <code>.maptool.DoublePointDto point_1 = 2;</code>
   * @return The point1.
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.DoublePointDto getPoint1() {
    return point1_ == null ? net.rptools.maptool.server.proto.drawing.DoublePointDto.getDefaultInstance() : point1_;
  }
  /**
   * <code>.maptool.DoublePointDto point_1 = 2;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder getPoint1OrBuilder() {
    return getPoint1();
  }

  public static final int POINT_2_FIELD_NUMBER = 3;
  private net.rptools.maptool.server.proto.drawing.DoublePointDto point2_;
  /**
   * <code>.maptool.DoublePointDto point_2 = 3;</code>
   * @return Whether the point2 field is set.
   */
  @java.lang.Override
  public boolean hasPoint2() {
    return point2_ != null;
  }
  /**
   * <code>.maptool.DoublePointDto point_2 = 3;</code>
   * @return The point2.
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.DoublePointDto getPoint2() {
    return point2_ == null ? net.rptools.maptool.server.proto.drawing.DoublePointDto.getDefaultInstance() : point2_;
  }
  /**
   * <code>.maptool.DoublePointDto point_2 = 3;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder getPoint2OrBuilder() {
    return getPoint2();
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
    if (point0_ != null) {
      output.writeMessage(1, getPoint0());
    }
    if (point1_ != null) {
      output.writeMessage(2, getPoint1());
    }
    if (point2_ != null) {
      output.writeMessage(3, getPoint2());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (point0_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPoint0());
    }
    if (point1_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPoint1());
    }
    if (point2_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPoint2());
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
    if (!(obj instanceof net.rptools.maptool.server.proto.drawing.CubicToSegment)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.drawing.CubicToSegment other = (net.rptools.maptool.server.proto.drawing.CubicToSegment) obj;

    if (hasPoint0() != other.hasPoint0()) return false;
    if (hasPoint0()) {
      if (!getPoint0()
          .equals(other.getPoint0())) return false;
    }
    if (hasPoint1() != other.hasPoint1()) return false;
    if (hasPoint1()) {
      if (!getPoint1()
          .equals(other.getPoint1())) return false;
    }
    if (hasPoint2() != other.hasPoint2()) return false;
    if (hasPoint2()) {
      if (!getPoint2()
          .equals(other.getPoint2())) return false;
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
    if (hasPoint0()) {
      hash = (37 * hash) + POINT_0_FIELD_NUMBER;
      hash = (53 * hash) + getPoint0().hashCode();
    }
    if (hasPoint1()) {
      hash = (37 * hash) + POINT_1_FIELD_NUMBER;
      hash = (53 * hash) + getPoint1().hashCode();
    }
    if (hasPoint2()) {
      hash = (37 * hash) + POINT_2_FIELD_NUMBER;
      hash = (53 * hash) + getPoint2().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.drawing.CubicToSegment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.CubicToSegment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.CubicToSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.CubicToSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.CubicToSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.CubicToSegment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.CubicToSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.CubicToSegment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.CubicToSegment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.CubicToSegment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.CubicToSegment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.CubicToSegment parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.drawing.CubicToSegment prototype) {
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
   * Protobuf type {@code maptool.CubicToSegment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.CubicToSegment)
      net.rptools.maptool.server.proto.drawing.CubicToSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_CubicToSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_CubicToSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.drawing.CubicToSegment.class, net.rptools.maptool.server.proto.drawing.CubicToSegment.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.drawing.CubicToSegment.newBuilder()
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
      if (point0Builder_ == null) {
        point0_ = null;
      } else {
        point0_ = null;
        point0Builder_ = null;
      }
      if (point1Builder_ == null) {
        point1_ = null;
      } else {
        point1_ = null;
        point1Builder_ = null;
      }
      if (point2Builder_ == null) {
        point2_ = null;
      } else {
        point2_ = null;
        point2Builder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_CubicToSegment_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.CubicToSegment getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.drawing.CubicToSegment.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.CubicToSegment build() {
      net.rptools.maptool.server.proto.drawing.CubicToSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.CubicToSegment buildPartial() {
      net.rptools.maptool.server.proto.drawing.CubicToSegment result = new net.rptools.maptool.server.proto.drawing.CubicToSegment(this);
      if (point0Builder_ == null) {
        result.point0_ = point0_;
      } else {
        result.point0_ = point0Builder_.build();
      }
      if (point1Builder_ == null) {
        result.point1_ = point1_;
      } else {
        result.point1_ = point1Builder_.build();
      }
      if (point2Builder_ == null) {
        result.point2_ = point2_;
      } else {
        result.point2_ = point2Builder_.build();
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
      if (other instanceof net.rptools.maptool.server.proto.drawing.CubicToSegment) {
        return mergeFrom((net.rptools.maptool.server.proto.drawing.CubicToSegment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.drawing.CubicToSegment other) {
      if (other == net.rptools.maptool.server.proto.drawing.CubicToSegment.getDefaultInstance()) return this;
      if (other.hasPoint0()) {
        mergePoint0(other.getPoint0());
      }
      if (other.hasPoint1()) {
        mergePoint1(other.getPoint1());
      }
      if (other.hasPoint2()) {
        mergePoint2(other.getPoint2());
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
      net.rptools.maptool.server.proto.drawing.CubicToSegment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.drawing.CubicToSegment) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private net.rptools.maptool.server.proto.drawing.DoublePointDto point0_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.DoublePointDto, net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder, net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder> point0Builder_;
    /**
     * <code>.maptool.DoublePointDto point_0 = 1;</code>
     * @return Whether the point0 field is set.
     */
    public boolean hasPoint0() {
      return point0Builder_ != null || point0_ != null;
    }
    /**
     * <code>.maptool.DoublePointDto point_0 = 1;</code>
     * @return The point0.
     */
    public net.rptools.maptool.server.proto.drawing.DoublePointDto getPoint0() {
      if (point0Builder_ == null) {
        return point0_ == null ? net.rptools.maptool.server.proto.drawing.DoublePointDto.getDefaultInstance() : point0_;
      } else {
        return point0Builder_.getMessage();
      }
    }
    /**
     * <code>.maptool.DoublePointDto point_0 = 1;</code>
     */
    public Builder setPoint0(net.rptools.maptool.server.proto.drawing.DoublePointDto value) {
      if (point0Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        point0_ = value;
        onChanged();
      } else {
        point0Builder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.maptool.DoublePointDto point_0 = 1;</code>
     */
    public Builder setPoint0(
        net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder builderForValue) {
      if (point0Builder_ == null) {
        point0_ = builderForValue.build();
        onChanged();
      } else {
        point0Builder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.maptool.DoublePointDto point_0 = 1;</code>
     */
    public Builder mergePoint0(net.rptools.maptool.server.proto.drawing.DoublePointDto value) {
      if (point0Builder_ == null) {
        if (point0_ != null) {
          point0_ =
            net.rptools.maptool.server.proto.drawing.DoublePointDto.newBuilder(point0_).mergeFrom(value).buildPartial();
        } else {
          point0_ = value;
        }
        onChanged();
      } else {
        point0Builder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.maptool.DoublePointDto point_0 = 1;</code>
     */
    public Builder clearPoint0() {
      if (point0Builder_ == null) {
        point0_ = null;
        onChanged();
      } else {
        point0_ = null;
        point0Builder_ = null;
      }

      return this;
    }
    /**
     * <code>.maptool.DoublePointDto point_0 = 1;</code>
     */
    public net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder getPoint0Builder() {
      
      onChanged();
      return getPoint0FieldBuilder().getBuilder();
    }
    /**
     * <code>.maptool.DoublePointDto point_0 = 1;</code>
     */
    public net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder getPoint0OrBuilder() {
      if (point0Builder_ != null) {
        return point0Builder_.getMessageOrBuilder();
      } else {
        return point0_ == null ?
            net.rptools.maptool.server.proto.drawing.DoublePointDto.getDefaultInstance() : point0_;
      }
    }
    /**
     * <code>.maptool.DoublePointDto point_0 = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.DoublePointDto, net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder, net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder> 
        getPoint0FieldBuilder() {
      if (point0Builder_ == null) {
        point0Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rptools.maptool.server.proto.drawing.DoublePointDto, net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder, net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder>(
                getPoint0(),
                getParentForChildren(),
                isClean());
        point0_ = null;
      }
      return point0Builder_;
    }

    private net.rptools.maptool.server.proto.drawing.DoublePointDto point1_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.DoublePointDto, net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder, net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder> point1Builder_;
    /**
     * <code>.maptool.DoublePointDto point_1 = 2;</code>
     * @return Whether the point1 field is set.
     */
    public boolean hasPoint1() {
      return point1Builder_ != null || point1_ != null;
    }
    /**
     * <code>.maptool.DoublePointDto point_1 = 2;</code>
     * @return The point1.
     */
    public net.rptools.maptool.server.proto.drawing.DoublePointDto getPoint1() {
      if (point1Builder_ == null) {
        return point1_ == null ? net.rptools.maptool.server.proto.drawing.DoublePointDto.getDefaultInstance() : point1_;
      } else {
        return point1Builder_.getMessage();
      }
    }
    /**
     * <code>.maptool.DoublePointDto point_1 = 2;</code>
     */
    public Builder setPoint1(net.rptools.maptool.server.proto.drawing.DoublePointDto value) {
      if (point1Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        point1_ = value;
        onChanged();
      } else {
        point1Builder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.maptool.DoublePointDto point_1 = 2;</code>
     */
    public Builder setPoint1(
        net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder builderForValue) {
      if (point1Builder_ == null) {
        point1_ = builderForValue.build();
        onChanged();
      } else {
        point1Builder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.maptool.DoublePointDto point_1 = 2;</code>
     */
    public Builder mergePoint1(net.rptools.maptool.server.proto.drawing.DoublePointDto value) {
      if (point1Builder_ == null) {
        if (point1_ != null) {
          point1_ =
            net.rptools.maptool.server.proto.drawing.DoublePointDto.newBuilder(point1_).mergeFrom(value).buildPartial();
        } else {
          point1_ = value;
        }
        onChanged();
      } else {
        point1Builder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.maptool.DoublePointDto point_1 = 2;</code>
     */
    public Builder clearPoint1() {
      if (point1Builder_ == null) {
        point1_ = null;
        onChanged();
      } else {
        point1_ = null;
        point1Builder_ = null;
      }

      return this;
    }
    /**
     * <code>.maptool.DoublePointDto point_1 = 2;</code>
     */
    public net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder getPoint1Builder() {
      
      onChanged();
      return getPoint1FieldBuilder().getBuilder();
    }
    /**
     * <code>.maptool.DoublePointDto point_1 = 2;</code>
     */
    public net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder getPoint1OrBuilder() {
      if (point1Builder_ != null) {
        return point1Builder_.getMessageOrBuilder();
      } else {
        return point1_ == null ?
            net.rptools.maptool.server.proto.drawing.DoublePointDto.getDefaultInstance() : point1_;
      }
    }
    /**
     * <code>.maptool.DoublePointDto point_1 = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.DoublePointDto, net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder, net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder> 
        getPoint1FieldBuilder() {
      if (point1Builder_ == null) {
        point1Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rptools.maptool.server.proto.drawing.DoublePointDto, net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder, net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder>(
                getPoint1(),
                getParentForChildren(),
                isClean());
        point1_ = null;
      }
      return point1Builder_;
    }

    private net.rptools.maptool.server.proto.drawing.DoublePointDto point2_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.DoublePointDto, net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder, net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder> point2Builder_;
    /**
     * <code>.maptool.DoublePointDto point_2 = 3;</code>
     * @return Whether the point2 field is set.
     */
    public boolean hasPoint2() {
      return point2Builder_ != null || point2_ != null;
    }
    /**
     * <code>.maptool.DoublePointDto point_2 = 3;</code>
     * @return The point2.
     */
    public net.rptools.maptool.server.proto.drawing.DoublePointDto getPoint2() {
      if (point2Builder_ == null) {
        return point2_ == null ? net.rptools.maptool.server.proto.drawing.DoublePointDto.getDefaultInstance() : point2_;
      } else {
        return point2Builder_.getMessage();
      }
    }
    /**
     * <code>.maptool.DoublePointDto point_2 = 3;</code>
     */
    public Builder setPoint2(net.rptools.maptool.server.proto.drawing.DoublePointDto value) {
      if (point2Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        point2_ = value;
        onChanged();
      } else {
        point2Builder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.maptool.DoublePointDto point_2 = 3;</code>
     */
    public Builder setPoint2(
        net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder builderForValue) {
      if (point2Builder_ == null) {
        point2_ = builderForValue.build();
        onChanged();
      } else {
        point2Builder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.maptool.DoublePointDto point_2 = 3;</code>
     */
    public Builder mergePoint2(net.rptools.maptool.server.proto.drawing.DoublePointDto value) {
      if (point2Builder_ == null) {
        if (point2_ != null) {
          point2_ =
            net.rptools.maptool.server.proto.drawing.DoublePointDto.newBuilder(point2_).mergeFrom(value).buildPartial();
        } else {
          point2_ = value;
        }
        onChanged();
      } else {
        point2Builder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.maptool.DoublePointDto point_2 = 3;</code>
     */
    public Builder clearPoint2() {
      if (point2Builder_ == null) {
        point2_ = null;
        onChanged();
      } else {
        point2_ = null;
        point2Builder_ = null;
      }

      return this;
    }
    /**
     * <code>.maptool.DoublePointDto point_2 = 3;</code>
     */
    public net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder getPoint2Builder() {
      
      onChanged();
      return getPoint2FieldBuilder().getBuilder();
    }
    /**
     * <code>.maptool.DoublePointDto point_2 = 3;</code>
     */
    public net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder getPoint2OrBuilder() {
      if (point2Builder_ != null) {
        return point2Builder_.getMessageOrBuilder();
      } else {
        return point2_ == null ?
            net.rptools.maptool.server.proto.drawing.DoublePointDto.getDefaultInstance() : point2_;
      }
    }
    /**
     * <code>.maptool.DoublePointDto point_2 = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.DoublePointDto, net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder, net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder> 
        getPoint2FieldBuilder() {
      if (point2Builder_ == null) {
        point2Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rptools.maptool.server.proto.drawing.DoublePointDto, net.rptools.maptool.server.proto.drawing.DoublePointDto.Builder, net.rptools.maptool.server.proto.drawing.DoublePointDtoOrBuilder>(
                getPoint2(),
                getParentForChildren(),
                isClean());
        point2_ = null;
      }
      return point2Builder_;
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


    // @@protoc_insertion_point(builder_scope:maptool.CubicToSegment)
  }

  // @@protoc_insertion_point(class_scope:maptool.CubicToSegment)
  private static final net.rptools.maptool.server.proto.drawing.CubicToSegment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.drawing.CubicToSegment();
  }

  public static net.rptools.maptool.server.proto.drawing.CubicToSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CubicToSegment>
      PARSER = new com.google.protobuf.AbstractParser<CubicToSegment>() {
    @java.lang.Override
    public CubicToSegment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CubicToSegment(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CubicToSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CubicToSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.CubicToSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
