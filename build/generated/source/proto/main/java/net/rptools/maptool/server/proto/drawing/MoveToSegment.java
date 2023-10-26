// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: drawing_dto.proto

package net.rptools.maptool.server.proto.drawing;

/**
 * Protobuf type {@code maptool.MoveToSegment}
 */
public final class MoveToSegment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.MoveToSegment)
    MoveToSegmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MoveToSegment.newBuilder() to construct.
  private MoveToSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MoveToSegment() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MoveToSegment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MoveToSegment(
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
    return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_MoveToSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_MoveToSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.drawing.MoveToSegment.class, net.rptools.maptool.server.proto.drawing.MoveToSegment.Builder.class);
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof net.rptools.maptool.server.proto.drawing.MoveToSegment)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.drawing.MoveToSegment other = (net.rptools.maptool.server.proto.drawing.MoveToSegment) obj;

    if (hasPoint0() != other.hasPoint0()) return false;
    if (hasPoint0()) {
      if (!getPoint0()
          .equals(other.getPoint0())) return false;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.drawing.MoveToSegment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.MoveToSegment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.MoveToSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.MoveToSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.MoveToSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.MoveToSegment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.MoveToSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.MoveToSegment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.MoveToSegment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.MoveToSegment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.MoveToSegment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.MoveToSegment parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.drawing.MoveToSegment prototype) {
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
   * Protobuf type {@code maptool.MoveToSegment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.MoveToSegment)
      net.rptools.maptool.server.proto.drawing.MoveToSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_MoveToSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_MoveToSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.drawing.MoveToSegment.class, net.rptools.maptool.server.proto.drawing.MoveToSegment.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.drawing.MoveToSegment.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_MoveToSegment_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.MoveToSegment getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.drawing.MoveToSegment.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.MoveToSegment build() {
      net.rptools.maptool.server.proto.drawing.MoveToSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.MoveToSegment buildPartial() {
      net.rptools.maptool.server.proto.drawing.MoveToSegment result = new net.rptools.maptool.server.proto.drawing.MoveToSegment(this);
      if (point0Builder_ == null) {
        result.point0_ = point0_;
      } else {
        result.point0_ = point0Builder_.build();
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
      if (other instanceof net.rptools.maptool.server.proto.drawing.MoveToSegment) {
        return mergeFrom((net.rptools.maptool.server.proto.drawing.MoveToSegment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.drawing.MoveToSegment other) {
      if (other == net.rptools.maptool.server.proto.drawing.MoveToSegment.getDefaultInstance()) return this;
      if (other.hasPoint0()) {
        mergePoint0(other.getPoint0());
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
      net.rptools.maptool.server.proto.drawing.MoveToSegment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.drawing.MoveToSegment) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:maptool.MoveToSegment)
  }

  // @@protoc_insertion_point(class_scope:maptool.MoveToSegment)
  private static final net.rptools.maptool.server.proto.drawing.MoveToSegment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.drawing.MoveToSegment();
  }

  public static net.rptools.maptool.server.proto.drawing.MoveToSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MoveToSegment>
      PARSER = new com.google.protobuf.AbstractParser<MoveToSegment>() {
    @java.lang.Override
    public MoveToSegment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MoveToSegment(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MoveToSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MoveToSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.MoveToSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
