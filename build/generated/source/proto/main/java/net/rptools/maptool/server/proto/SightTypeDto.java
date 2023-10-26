// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf type {@code maptool.SightTypeDto}
 */
public final class SightTypeDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.SightTypeDto)
    SightTypeDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SightTypeDto.newBuilder() to construct.
  private SightTypeDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SightTypeDto() {
    name_ = "";
    shape_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SightTypeDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SightTypeDto(
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

            name_ = s;
            break;
          }
          case 17: {

            multiplier_ = input.readDouble();
            break;
          }
          case 26: {
            net.rptools.maptool.server.proto.LightSourceDto.Builder subBuilder = null;
            if (personalLightSource_ != null) {
              subBuilder = personalLightSource_.toBuilder();
            }
            personalLightSource_ = input.readMessage(net.rptools.maptool.server.proto.LightSourceDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(personalLightSource_);
              personalLightSource_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            shape_ = rawValue;
            break;
          }
          case 40: {

            arc_ = input.readInt32();
            break;
          }
          case 53: {

            distance_ = input.readFloat();
            break;
          }
          case 56: {

            offset_ = input.readInt32();
            break;
          }
          case 64: {

            scaleWithToken_ = input.readBool();
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
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_SightTypeDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_SightTypeDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.SightTypeDto.class, net.rptools.maptool.server.proto.SightTypeDto.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
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
   * <code>string name = 1;</code>
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

  public static final int MULTIPLIER_FIELD_NUMBER = 2;
  private double multiplier_;
  /**
   * <code>double multiplier = 2;</code>
   * @return The multiplier.
   */
  @java.lang.Override
  public double getMultiplier() {
    return multiplier_;
  }

  public static final int PERSONAL_LIGHT_SOURCE_FIELD_NUMBER = 3;
  private net.rptools.maptool.server.proto.LightSourceDto personalLightSource_;
  /**
   * <code>.maptool.LightSourceDto personal_light_source = 3;</code>
   * @return Whether the personalLightSource field is set.
   */
  @java.lang.Override
  public boolean hasPersonalLightSource() {
    return personalLightSource_ != null;
  }
  /**
   * <code>.maptool.LightSourceDto personal_light_source = 3;</code>
   * @return The personalLightSource.
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.LightSourceDto getPersonalLightSource() {
    return personalLightSource_ == null ? net.rptools.maptool.server.proto.LightSourceDto.getDefaultInstance() : personalLightSource_;
  }
  /**
   * <code>.maptool.LightSourceDto personal_light_source = 3;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.LightSourceDtoOrBuilder getPersonalLightSourceOrBuilder() {
    return getPersonalLightSource();
  }

  public static final int SHAPE_FIELD_NUMBER = 4;
  private int shape_;
  /**
   * <code>.maptool.ShapeTypeDto shape = 4;</code>
   * @return The enum numeric value on the wire for shape.
   */
  @java.lang.Override public int getShapeValue() {
    return shape_;
  }
  /**
   * <code>.maptool.ShapeTypeDto shape = 4;</code>
   * @return The shape.
   */
  @java.lang.Override public net.rptools.maptool.server.proto.ShapeTypeDto getShape() {
    @SuppressWarnings("deprecation")
    net.rptools.maptool.server.proto.ShapeTypeDto result = net.rptools.maptool.server.proto.ShapeTypeDto.valueOf(shape_);
    return result == null ? net.rptools.maptool.server.proto.ShapeTypeDto.UNRECOGNIZED : result;
  }

  public static final int ARC_FIELD_NUMBER = 5;
  private int arc_;
  /**
   * <code>int32 arc = 5;</code>
   * @return The arc.
   */
  @java.lang.Override
  public int getArc() {
    return arc_;
  }

  public static final int DISTANCE_FIELD_NUMBER = 6;
  private float distance_;
  /**
   * <code>float distance = 6;</code>
   * @return The distance.
   */
  @java.lang.Override
  public float getDistance() {
    return distance_;
  }

  public static final int OFFSET_FIELD_NUMBER = 7;
  private int offset_;
  /**
   * <code>int32 offset = 7;</code>
   * @return The offset.
   */
  @java.lang.Override
  public int getOffset() {
    return offset_;
  }

  public static final int SCALE_WITH_TOKEN_FIELD_NUMBER = 8;
  private boolean scaleWithToken_;
  /**
   * <code>bool scale_with_token = 8;</code>
   * @return The scaleWithToken.
   */
  @java.lang.Override
  public boolean getScaleWithToken() {
    return scaleWithToken_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (java.lang.Double.doubleToRawLongBits(multiplier_) != 0) {
      output.writeDouble(2, multiplier_);
    }
    if (personalLightSource_ != null) {
      output.writeMessage(3, getPersonalLightSource());
    }
    if (shape_ != net.rptools.maptool.server.proto.ShapeTypeDto.SQUARE.getNumber()) {
      output.writeEnum(4, shape_);
    }
    if (arc_ != 0) {
      output.writeInt32(5, arc_);
    }
    if (java.lang.Float.floatToRawIntBits(distance_) != 0) {
      output.writeFloat(6, distance_);
    }
    if (offset_ != 0) {
      output.writeInt32(7, offset_);
    }
    if (scaleWithToken_ != false) {
      output.writeBool(8, scaleWithToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (java.lang.Double.doubleToRawLongBits(multiplier_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, multiplier_);
    }
    if (personalLightSource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPersonalLightSource());
    }
    if (shape_ != net.rptools.maptool.server.proto.ShapeTypeDto.SQUARE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, shape_);
    }
    if (arc_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, arc_);
    }
    if (java.lang.Float.floatToRawIntBits(distance_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(6, distance_);
    }
    if (offset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, offset_);
    }
    if (scaleWithToken_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, scaleWithToken_);
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
    if (!(obj instanceof net.rptools.maptool.server.proto.SightTypeDto)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.SightTypeDto other = (net.rptools.maptool.server.proto.SightTypeDto) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (java.lang.Double.doubleToLongBits(getMultiplier())
        != java.lang.Double.doubleToLongBits(
            other.getMultiplier())) return false;
    if (hasPersonalLightSource() != other.hasPersonalLightSource()) return false;
    if (hasPersonalLightSource()) {
      if (!getPersonalLightSource()
          .equals(other.getPersonalLightSource())) return false;
    }
    if (shape_ != other.shape_) return false;
    if (getArc()
        != other.getArc()) return false;
    if (java.lang.Float.floatToIntBits(getDistance())
        != java.lang.Float.floatToIntBits(
            other.getDistance())) return false;
    if (getOffset()
        != other.getOffset()) return false;
    if (getScaleWithToken()
        != other.getScaleWithToken()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + MULTIPLIER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMultiplier()));
    if (hasPersonalLightSource()) {
      hash = (37 * hash) + PERSONAL_LIGHT_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getPersonalLightSource().hashCode();
    }
    hash = (37 * hash) + SHAPE_FIELD_NUMBER;
    hash = (53 * hash) + shape_;
    hash = (37 * hash) + ARC_FIELD_NUMBER;
    hash = (53 * hash) + getArc();
    hash = (37 * hash) + DISTANCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getDistance());
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset();
    hash = (37 * hash) + SCALE_WITH_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getScaleWithToken());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.SightTypeDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.SightTypeDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SightTypeDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.SightTypeDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SightTypeDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.SightTypeDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SightTypeDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.SightTypeDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SightTypeDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.SightTypeDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.SightTypeDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.SightTypeDto parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.SightTypeDto prototype) {
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
   * Protobuf type {@code maptool.SightTypeDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.SightTypeDto)
      net.rptools.maptool.server.proto.SightTypeDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_SightTypeDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_SightTypeDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.SightTypeDto.class, net.rptools.maptool.server.proto.SightTypeDto.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.SightTypeDto.newBuilder()
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
      name_ = "";

      multiplier_ = 0D;

      if (personalLightSourceBuilder_ == null) {
        personalLightSource_ = null;
      } else {
        personalLightSource_ = null;
        personalLightSourceBuilder_ = null;
      }
      shape_ = 0;

      arc_ = 0;

      distance_ = 0F;

      offset_ = 0;

      scaleWithToken_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_SightTypeDto_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.SightTypeDto getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.SightTypeDto.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.SightTypeDto build() {
      net.rptools.maptool.server.proto.SightTypeDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.SightTypeDto buildPartial() {
      net.rptools.maptool.server.proto.SightTypeDto result = new net.rptools.maptool.server.proto.SightTypeDto(this);
      result.name_ = name_;
      result.multiplier_ = multiplier_;
      if (personalLightSourceBuilder_ == null) {
        result.personalLightSource_ = personalLightSource_;
      } else {
        result.personalLightSource_ = personalLightSourceBuilder_.build();
      }
      result.shape_ = shape_;
      result.arc_ = arc_;
      result.distance_ = distance_;
      result.offset_ = offset_;
      result.scaleWithToken_ = scaleWithToken_;
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
      if (other instanceof net.rptools.maptool.server.proto.SightTypeDto) {
        return mergeFrom((net.rptools.maptool.server.proto.SightTypeDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.SightTypeDto other) {
      if (other == net.rptools.maptool.server.proto.SightTypeDto.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getMultiplier() != 0D) {
        setMultiplier(other.getMultiplier());
      }
      if (other.hasPersonalLightSource()) {
        mergePersonalLightSource(other.getPersonalLightSource());
      }
      if (other.shape_ != 0) {
        setShapeValue(other.getShapeValue());
      }
      if (other.getArc() != 0) {
        setArc(other.getArc());
      }
      if (other.getDistance() != 0F) {
        setDistance(other.getDistance());
      }
      if (other.getOffset() != 0) {
        setOffset(other.getOffset());
      }
      if (other.getScaleWithToken() != false) {
        setScaleWithToken(other.getScaleWithToken());
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
      net.rptools.maptool.server.proto.SightTypeDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.SightTypeDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
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
     * <code>string name = 1;</code>
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
     * <code>string name = 1;</code>
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
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
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

    private double multiplier_ ;
    /**
     * <code>double multiplier = 2;</code>
     * @return The multiplier.
     */
    @java.lang.Override
    public double getMultiplier() {
      return multiplier_;
    }
    /**
     * <code>double multiplier = 2;</code>
     * @param value The multiplier to set.
     * @return This builder for chaining.
     */
    public Builder setMultiplier(double value) {
      
      multiplier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double multiplier = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMultiplier() {
      
      multiplier_ = 0D;
      onChanged();
      return this;
    }

    private net.rptools.maptool.server.proto.LightSourceDto personalLightSource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.LightSourceDto, net.rptools.maptool.server.proto.LightSourceDto.Builder, net.rptools.maptool.server.proto.LightSourceDtoOrBuilder> personalLightSourceBuilder_;
    /**
     * <code>.maptool.LightSourceDto personal_light_source = 3;</code>
     * @return Whether the personalLightSource field is set.
     */
    public boolean hasPersonalLightSource() {
      return personalLightSourceBuilder_ != null || personalLightSource_ != null;
    }
    /**
     * <code>.maptool.LightSourceDto personal_light_source = 3;</code>
     * @return The personalLightSource.
     */
    public net.rptools.maptool.server.proto.LightSourceDto getPersonalLightSource() {
      if (personalLightSourceBuilder_ == null) {
        return personalLightSource_ == null ? net.rptools.maptool.server.proto.LightSourceDto.getDefaultInstance() : personalLightSource_;
      } else {
        return personalLightSourceBuilder_.getMessage();
      }
    }
    /**
     * <code>.maptool.LightSourceDto personal_light_source = 3;</code>
     */
    public Builder setPersonalLightSource(net.rptools.maptool.server.proto.LightSourceDto value) {
      if (personalLightSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        personalLightSource_ = value;
        onChanged();
      } else {
        personalLightSourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.maptool.LightSourceDto personal_light_source = 3;</code>
     */
    public Builder setPersonalLightSource(
        net.rptools.maptool.server.proto.LightSourceDto.Builder builderForValue) {
      if (personalLightSourceBuilder_ == null) {
        personalLightSource_ = builderForValue.build();
        onChanged();
      } else {
        personalLightSourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.maptool.LightSourceDto personal_light_source = 3;</code>
     */
    public Builder mergePersonalLightSource(net.rptools.maptool.server.proto.LightSourceDto value) {
      if (personalLightSourceBuilder_ == null) {
        if (personalLightSource_ != null) {
          personalLightSource_ =
            net.rptools.maptool.server.proto.LightSourceDto.newBuilder(personalLightSource_).mergeFrom(value).buildPartial();
        } else {
          personalLightSource_ = value;
        }
        onChanged();
      } else {
        personalLightSourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.maptool.LightSourceDto personal_light_source = 3;</code>
     */
    public Builder clearPersonalLightSource() {
      if (personalLightSourceBuilder_ == null) {
        personalLightSource_ = null;
        onChanged();
      } else {
        personalLightSource_ = null;
        personalLightSourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.maptool.LightSourceDto personal_light_source = 3;</code>
     */
    public net.rptools.maptool.server.proto.LightSourceDto.Builder getPersonalLightSourceBuilder() {
      
      onChanged();
      return getPersonalLightSourceFieldBuilder().getBuilder();
    }
    /**
     * <code>.maptool.LightSourceDto personal_light_source = 3;</code>
     */
    public net.rptools.maptool.server.proto.LightSourceDtoOrBuilder getPersonalLightSourceOrBuilder() {
      if (personalLightSourceBuilder_ != null) {
        return personalLightSourceBuilder_.getMessageOrBuilder();
      } else {
        return personalLightSource_ == null ?
            net.rptools.maptool.server.proto.LightSourceDto.getDefaultInstance() : personalLightSource_;
      }
    }
    /**
     * <code>.maptool.LightSourceDto personal_light_source = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.LightSourceDto, net.rptools.maptool.server.proto.LightSourceDto.Builder, net.rptools.maptool.server.proto.LightSourceDtoOrBuilder> 
        getPersonalLightSourceFieldBuilder() {
      if (personalLightSourceBuilder_ == null) {
        personalLightSourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rptools.maptool.server.proto.LightSourceDto, net.rptools.maptool.server.proto.LightSourceDto.Builder, net.rptools.maptool.server.proto.LightSourceDtoOrBuilder>(
                getPersonalLightSource(),
                getParentForChildren(),
                isClean());
        personalLightSource_ = null;
      }
      return personalLightSourceBuilder_;
    }

    private int shape_ = 0;
    /**
     * <code>.maptool.ShapeTypeDto shape = 4;</code>
     * @return The enum numeric value on the wire for shape.
     */
    @java.lang.Override public int getShapeValue() {
      return shape_;
    }
    /**
     * <code>.maptool.ShapeTypeDto shape = 4;</code>
     * @param value The enum numeric value on the wire for shape to set.
     * @return This builder for chaining.
     */
    public Builder setShapeValue(int value) {
      
      shape_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.maptool.ShapeTypeDto shape = 4;</code>
     * @return The shape.
     */
    @java.lang.Override
    public net.rptools.maptool.server.proto.ShapeTypeDto getShape() {
      @SuppressWarnings("deprecation")
      net.rptools.maptool.server.proto.ShapeTypeDto result = net.rptools.maptool.server.proto.ShapeTypeDto.valueOf(shape_);
      return result == null ? net.rptools.maptool.server.proto.ShapeTypeDto.UNRECOGNIZED : result;
    }
    /**
     * <code>.maptool.ShapeTypeDto shape = 4;</code>
     * @param value The shape to set.
     * @return This builder for chaining.
     */
    public Builder setShape(net.rptools.maptool.server.proto.ShapeTypeDto value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      shape_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.maptool.ShapeTypeDto shape = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearShape() {
      
      shape_ = 0;
      onChanged();
      return this;
    }

    private int arc_ ;
    /**
     * <code>int32 arc = 5;</code>
     * @return The arc.
     */
    @java.lang.Override
    public int getArc() {
      return arc_;
    }
    /**
     * <code>int32 arc = 5;</code>
     * @param value The arc to set.
     * @return This builder for chaining.
     */
    public Builder setArc(int value) {
      
      arc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 arc = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearArc() {
      
      arc_ = 0;
      onChanged();
      return this;
    }

    private float distance_ ;
    /**
     * <code>float distance = 6;</code>
     * @return The distance.
     */
    @java.lang.Override
    public float getDistance() {
      return distance_;
    }
    /**
     * <code>float distance = 6;</code>
     * @param value The distance to set.
     * @return This builder for chaining.
     */
    public Builder setDistance(float value) {
      
      distance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float distance = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDistance() {
      
      distance_ = 0F;
      onChanged();
      return this;
    }

    private int offset_ ;
    /**
     * <code>int32 offset = 7;</code>
     * @return The offset.
     */
    @java.lang.Override
    public int getOffset() {
      return offset_;
    }
    /**
     * <code>int32 offset = 7;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(int value) {
      
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 offset = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      
      offset_ = 0;
      onChanged();
      return this;
    }

    private boolean scaleWithToken_ ;
    /**
     * <code>bool scale_with_token = 8;</code>
     * @return The scaleWithToken.
     */
    @java.lang.Override
    public boolean getScaleWithToken() {
      return scaleWithToken_;
    }
    /**
     * <code>bool scale_with_token = 8;</code>
     * @param value The scaleWithToken to set.
     * @return This builder for chaining.
     */
    public Builder setScaleWithToken(boolean value) {
      
      scaleWithToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool scale_with_token = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearScaleWithToken() {
      
      scaleWithToken_ = false;
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


    // @@protoc_insertion_point(builder_scope:maptool.SightTypeDto)
  }

  // @@protoc_insertion_point(class_scope:maptool.SightTypeDto)
  private static final net.rptools.maptool.server.proto.SightTypeDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.SightTypeDto();
  }

  public static net.rptools.maptool.server.proto.SightTypeDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SightTypeDto>
      PARSER = new com.google.protobuf.AbstractParser<SightTypeDto>() {
    @java.lang.Override
    public SightTypeDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SightTypeDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SightTypeDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SightTypeDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.SightTypeDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

