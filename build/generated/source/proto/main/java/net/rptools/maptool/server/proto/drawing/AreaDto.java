// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: drawing_dto.proto

package net.rptools.maptool.server.proto.drawing;

/**
 * Protobuf type {@code maptool.AreaDto}
 */
public final class AreaDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.AreaDto)
    AreaDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AreaDto.newBuilder() to construct.
  private AreaDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AreaDto() {
    winding_ = 0;
    segments_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AreaDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AreaDto(
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
          case 8: {
            int rawValue = input.readEnum();

            winding_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              segments_ = new java.util.ArrayList<net.rptools.maptool.server.proto.drawing.SegmentDto>();
              mutable_bitField0_ |= 0x00000001;
            }
            segments_.add(
                input.readMessage(net.rptools.maptool.server.proto.drawing.SegmentDto.parser(), extensionRegistry));
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
        segments_ = java.util.Collections.unmodifiableList(segments_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_AreaDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_AreaDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.drawing.AreaDto.class, net.rptools.maptool.server.proto.drawing.AreaDto.Builder.class);
  }

  /**
   * Protobuf enum {@code maptool.AreaDto.WindingRule}
   */
  public enum WindingRule
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EVEN_ODD = 0;</code>
     */
    EVEN_ODD(0),
    /**
     * <code>NON_ZERO = 1;</code>
     */
    NON_ZERO(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>EVEN_ODD = 0;</code>
     */
    public static final int EVEN_ODD_VALUE = 0;
    /**
     * <code>NON_ZERO = 1;</code>
     */
    public static final int NON_ZERO_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static WindingRule valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static WindingRule forNumber(int value) {
      switch (value) {
        case 0: return EVEN_ODD;
        case 1: return NON_ZERO;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WindingRule>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        WindingRule> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<WindingRule>() {
            public WindingRule findValueByNumber(int number) {
              return WindingRule.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.drawing.AreaDto.getDescriptor().getEnumTypes().get(0);
    }

    private static final WindingRule[] VALUES = values();

    public static WindingRule valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private WindingRule(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:maptool.AreaDto.WindingRule)
  }

  public static final int WINDING_FIELD_NUMBER = 1;
  private int winding_;
  /**
   * <code>.maptool.AreaDto.WindingRule winding = 1;</code>
   * @return The enum numeric value on the wire for winding.
   */
  @java.lang.Override public int getWindingValue() {
    return winding_;
  }
  /**
   * <code>.maptool.AreaDto.WindingRule winding = 1;</code>
   * @return The winding.
   */
  @java.lang.Override public net.rptools.maptool.server.proto.drawing.AreaDto.WindingRule getWinding() {
    @SuppressWarnings("deprecation")
    net.rptools.maptool.server.proto.drawing.AreaDto.WindingRule result = net.rptools.maptool.server.proto.drawing.AreaDto.WindingRule.valueOf(winding_);
    return result == null ? net.rptools.maptool.server.proto.drawing.AreaDto.WindingRule.UNRECOGNIZED : result;
  }

  public static final int SEGMENTS_FIELD_NUMBER = 2;
  private java.util.List<net.rptools.maptool.server.proto.drawing.SegmentDto> segments_;
  /**
   * <code>repeated .maptool.SegmentDto segments = 2;</code>
   */
  @java.lang.Override
  public java.util.List<net.rptools.maptool.server.proto.drawing.SegmentDto> getSegmentsList() {
    return segments_;
  }
  /**
   * <code>repeated .maptool.SegmentDto segments = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends net.rptools.maptool.server.proto.drawing.SegmentDtoOrBuilder> 
      getSegmentsOrBuilderList() {
    return segments_;
  }
  /**
   * <code>repeated .maptool.SegmentDto segments = 2;</code>
   */
  @java.lang.Override
  public int getSegmentsCount() {
    return segments_.size();
  }
  /**
   * <code>repeated .maptool.SegmentDto segments = 2;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.SegmentDto getSegments(int index) {
    return segments_.get(index);
  }
  /**
   * <code>repeated .maptool.SegmentDto segments = 2;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.SegmentDtoOrBuilder getSegmentsOrBuilder(
      int index) {
    return segments_.get(index);
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
    if (winding_ != net.rptools.maptool.server.proto.drawing.AreaDto.WindingRule.EVEN_ODD.getNumber()) {
      output.writeEnum(1, winding_);
    }
    for (int i = 0; i < segments_.size(); i++) {
      output.writeMessage(2, segments_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (winding_ != net.rptools.maptool.server.proto.drawing.AreaDto.WindingRule.EVEN_ODD.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, winding_);
    }
    for (int i = 0; i < segments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, segments_.get(i));
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
    if (!(obj instanceof net.rptools.maptool.server.proto.drawing.AreaDto)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.drawing.AreaDto other = (net.rptools.maptool.server.proto.drawing.AreaDto) obj;

    if (winding_ != other.winding_) return false;
    if (!getSegmentsList()
        .equals(other.getSegmentsList())) return false;
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
    hash = (37 * hash) + WINDING_FIELD_NUMBER;
    hash = (53 * hash) + winding_;
    if (getSegmentsCount() > 0) {
      hash = (37 * hash) + SEGMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getSegmentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.drawing.AreaDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.AreaDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.AreaDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.AreaDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.AreaDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.drawing.AreaDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.AreaDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.AreaDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.AreaDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.AreaDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.drawing.AreaDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.drawing.AreaDto parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.drawing.AreaDto prototype) {
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
   * Protobuf type {@code maptool.AreaDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.AreaDto)
      net.rptools.maptool.server.proto.drawing.AreaDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_AreaDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_AreaDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.drawing.AreaDto.class, net.rptools.maptool.server.proto.drawing.AreaDto.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.drawing.AreaDto.newBuilder()
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
        getSegmentsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      winding_ = 0;

      if (segmentsBuilder_ == null) {
        segments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        segmentsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.drawing.DrawingDtoProtos.internal_static_maptool_AreaDto_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.AreaDto getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.drawing.AreaDto.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.AreaDto build() {
      net.rptools.maptool.server.proto.drawing.AreaDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.AreaDto buildPartial() {
      net.rptools.maptool.server.proto.drawing.AreaDto result = new net.rptools.maptool.server.proto.drawing.AreaDto(this);
      int from_bitField0_ = bitField0_;
      result.winding_ = winding_;
      if (segmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          segments_ = java.util.Collections.unmodifiableList(segments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.segments_ = segments_;
      } else {
        result.segments_ = segmentsBuilder_.build();
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
      if (other instanceof net.rptools.maptool.server.proto.drawing.AreaDto) {
        return mergeFrom((net.rptools.maptool.server.proto.drawing.AreaDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.drawing.AreaDto other) {
      if (other == net.rptools.maptool.server.proto.drawing.AreaDto.getDefaultInstance()) return this;
      if (other.winding_ != 0) {
        setWindingValue(other.getWindingValue());
      }
      if (segmentsBuilder_ == null) {
        if (!other.segments_.isEmpty()) {
          if (segments_.isEmpty()) {
            segments_ = other.segments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSegmentsIsMutable();
            segments_.addAll(other.segments_);
          }
          onChanged();
        }
      } else {
        if (!other.segments_.isEmpty()) {
          if (segmentsBuilder_.isEmpty()) {
            segmentsBuilder_.dispose();
            segmentsBuilder_ = null;
            segments_ = other.segments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            segmentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSegmentsFieldBuilder() : null;
          } else {
            segmentsBuilder_.addAllMessages(other.segments_);
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
      net.rptools.maptool.server.proto.drawing.AreaDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.drawing.AreaDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int winding_ = 0;
    /**
     * <code>.maptool.AreaDto.WindingRule winding = 1;</code>
     * @return The enum numeric value on the wire for winding.
     */
    @java.lang.Override public int getWindingValue() {
      return winding_;
    }
    /**
     * <code>.maptool.AreaDto.WindingRule winding = 1;</code>
     * @param value The enum numeric value on the wire for winding to set.
     * @return This builder for chaining.
     */
    public Builder setWindingValue(int value) {
      
      winding_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.maptool.AreaDto.WindingRule winding = 1;</code>
     * @return The winding.
     */
    @java.lang.Override
    public net.rptools.maptool.server.proto.drawing.AreaDto.WindingRule getWinding() {
      @SuppressWarnings("deprecation")
      net.rptools.maptool.server.proto.drawing.AreaDto.WindingRule result = net.rptools.maptool.server.proto.drawing.AreaDto.WindingRule.valueOf(winding_);
      return result == null ? net.rptools.maptool.server.proto.drawing.AreaDto.WindingRule.UNRECOGNIZED : result;
    }
    /**
     * <code>.maptool.AreaDto.WindingRule winding = 1;</code>
     * @param value The winding to set.
     * @return This builder for chaining.
     */
    public Builder setWinding(net.rptools.maptool.server.proto.drawing.AreaDto.WindingRule value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      winding_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.maptool.AreaDto.WindingRule winding = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWinding() {
      
      winding_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<net.rptools.maptool.server.proto.drawing.SegmentDto> segments_ =
      java.util.Collections.emptyList();
    private void ensureSegmentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        segments_ = new java.util.ArrayList<net.rptools.maptool.server.proto.drawing.SegmentDto>(segments_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.SegmentDto, net.rptools.maptool.server.proto.drawing.SegmentDto.Builder, net.rptools.maptool.server.proto.drawing.SegmentDtoOrBuilder> segmentsBuilder_;

    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public java.util.List<net.rptools.maptool.server.proto.drawing.SegmentDto> getSegmentsList() {
      if (segmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(segments_);
      } else {
        return segmentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public int getSegmentsCount() {
      if (segmentsBuilder_ == null) {
        return segments_.size();
      } else {
        return segmentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public net.rptools.maptool.server.proto.drawing.SegmentDto getSegments(int index) {
      if (segmentsBuilder_ == null) {
        return segments_.get(index);
      } else {
        return segmentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public Builder setSegments(
        int index, net.rptools.maptool.server.proto.drawing.SegmentDto value) {
      if (segmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentsIsMutable();
        segments_.set(index, value);
        onChanged();
      } else {
        segmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public Builder setSegments(
        int index, net.rptools.maptool.server.proto.drawing.SegmentDto.Builder builderForValue) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.set(index, builderForValue.build());
        onChanged();
      } else {
        segmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public Builder addSegments(net.rptools.maptool.server.proto.drawing.SegmentDto value) {
      if (segmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentsIsMutable();
        segments_.add(value);
        onChanged();
      } else {
        segmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public Builder addSegments(
        int index, net.rptools.maptool.server.proto.drawing.SegmentDto value) {
      if (segmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSegmentsIsMutable();
        segments_.add(index, value);
        onChanged();
      } else {
        segmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public Builder addSegments(
        net.rptools.maptool.server.proto.drawing.SegmentDto.Builder builderForValue) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.add(builderForValue.build());
        onChanged();
      } else {
        segmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public Builder addSegments(
        int index, net.rptools.maptool.server.proto.drawing.SegmentDto.Builder builderForValue) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.add(index, builderForValue.build());
        onChanged();
      } else {
        segmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public Builder addAllSegments(
        java.lang.Iterable<? extends net.rptools.maptool.server.proto.drawing.SegmentDto> values) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, segments_);
        onChanged();
      } else {
        segmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public Builder clearSegments() {
      if (segmentsBuilder_ == null) {
        segments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        segmentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public Builder removeSegments(int index) {
      if (segmentsBuilder_ == null) {
        ensureSegmentsIsMutable();
        segments_.remove(index);
        onChanged();
      } else {
        segmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public net.rptools.maptool.server.proto.drawing.SegmentDto.Builder getSegmentsBuilder(
        int index) {
      return getSegmentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public net.rptools.maptool.server.proto.drawing.SegmentDtoOrBuilder getSegmentsOrBuilder(
        int index) {
      if (segmentsBuilder_ == null) {
        return segments_.get(index);  } else {
        return segmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public java.util.List<? extends net.rptools.maptool.server.proto.drawing.SegmentDtoOrBuilder> 
         getSegmentsOrBuilderList() {
      if (segmentsBuilder_ != null) {
        return segmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(segments_);
      }
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public net.rptools.maptool.server.proto.drawing.SegmentDto.Builder addSegmentsBuilder() {
      return getSegmentsFieldBuilder().addBuilder(
          net.rptools.maptool.server.proto.drawing.SegmentDto.getDefaultInstance());
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public net.rptools.maptool.server.proto.drawing.SegmentDto.Builder addSegmentsBuilder(
        int index) {
      return getSegmentsFieldBuilder().addBuilder(
          index, net.rptools.maptool.server.proto.drawing.SegmentDto.getDefaultInstance());
    }
    /**
     * <code>repeated .maptool.SegmentDto segments = 2;</code>
     */
    public java.util.List<net.rptools.maptool.server.proto.drawing.SegmentDto.Builder> 
         getSegmentsBuilderList() {
      return getSegmentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.rptools.maptool.server.proto.drawing.SegmentDto, net.rptools.maptool.server.proto.drawing.SegmentDto.Builder, net.rptools.maptool.server.proto.drawing.SegmentDtoOrBuilder> 
        getSegmentsFieldBuilder() {
      if (segmentsBuilder_ == null) {
        segmentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            net.rptools.maptool.server.proto.drawing.SegmentDto, net.rptools.maptool.server.proto.drawing.SegmentDto.Builder, net.rptools.maptool.server.proto.drawing.SegmentDtoOrBuilder>(
                segments_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        segments_ = null;
      }
      return segmentsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:maptool.AreaDto)
  }

  // @@protoc_insertion_point(class_scope:maptool.AreaDto)
  private static final net.rptools.maptool.server.proto.drawing.AreaDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.drawing.AreaDto();
  }

  public static net.rptools.maptool.server.proto.drawing.AreaDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AreaDto>
      PARSER = new com.google.protobuf.AbstractParser<AreaDto>() {
    @java.lang.Override
    public AreaDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AreaDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AreaDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AreaDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.drawing.AreaDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

