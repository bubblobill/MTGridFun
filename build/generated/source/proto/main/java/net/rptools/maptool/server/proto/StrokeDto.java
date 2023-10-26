// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf type {@code maptool.StrokeDto}
 */
public final class StrokeDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.StrokeDto)
    StrokeDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StrokeDto.newBuilder() to construct.
  private StrokeDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StrokeDto() {
    cap_ = 0;
    join_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StrokeDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StrokeDto(
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
          case 13: {

            width_ = input.readFloat();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            cap_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            join_ = rawValue;
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
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_StrokeDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_StrokeDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.StrokeDto.class, net.rptools.maptool.server.proto.StrokeDto.Builder.class);
  }

  /**
   * Protobuf enum {@code maptool.StrokeDto.CapDto}
   */
  public enum CapDto
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CAP_BUTT = 0;</code>
     */
    CAP_BUTT(0),
    /**
     * <code>CAP_ROUND = 1;</code>
     */
    CAP_ROUND(1),
    /**
     * <code>CAP_SQUARE = 2;</code>
     */
    CAP_SQUARE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CAP_BUTT = 0;</code>
     */
    public static final int CAP_BUTT_VALUE = 0;
    /**
     * <code>CAP_ROUND = 1;</code>
     */
    public static final int CAP_ROUND_VALUE = 1;
    /**
     * <code>CAP_SQUARE = 2;</code>
     */
    public static final int CAP_SQUARE_VALUE = 2;


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
    public static CapDto valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CapDto forNumber(int value) {
      switch (value) {
        case 0: return CAP_BUTT;
        case 1: return CAP_ROUND;
        case 2: return CAP_SQUARE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CapDto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CapDto> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CapDto>() {
            public CapDto findValueByNumber(int number) {
              return CapDto.forNumber(number);
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
      return net.rptools.maptool.server.proto.StrokeDto.getDescriptor().getEnumTypes().get(0);
    }

    private static final CapDto[] VALUES = values();

    public static CapDto valueOf(
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

    private CapDto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:maptool.StrokeDto.CapDto)
  }

  /**
   * Protobuf enum {@code maptool.StrokeDto.JoinDto}
   */
  public enum JoinDto
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>JOIN_MITER = 0;</code>
     */
    JOIN_MITER(0),
    /**
     * <code>JOIN_ROUND = 1;</code>
     */
    JOIN_ROUND(1),
    /**
     * <code>JOIN_BEVEL = 2;</code>
     */
    JOIN_BEVEL(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>JOIN_MITER = 0;</code>
     */
    public static final int JOIN_MITER_VALUE = 0;
    /**
     * <code>JOIN_ROUND = 1;</code>
     */
    public static final int JOIN_ROUND_VALUE = 1;
    /**
     * <code>JOIN_BEVEL = 2;</code>
     */
    public static final int JOIN_BEVEL_VALUE = 2;


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
    public static JoinDto valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static JoinDto forNumber(int value) {
      switch (value) {
        case 0: return JOIN_MITER;
        case 1: return JOIN_ROUND;
        case 2: return JOIN_BEVEL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<JoinDto>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        JoinDto> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<JoinDto>() {
            public JoinDto findValueByNumber(int number) {
              return JoinDto.forNumber(number);
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
      return net.rptools.maptool.server.proto.StrokeDto.getDescriptor().getEnumTypes().get(1);
    }

    private static final JoinDto[] VALUES = values();

    public static JoinDto valueOf(
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

    private JoinDto(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:maptool.StrokeDto.JoinDto)
  }

  public static final int WIDTH_FIELD_NUMBER = 1;
  private float width_;
  /**
   * <code>float width = 1;</code>
   * @return The width.
   */
  @java.lang.Override
  public float getWidth() {
    return width_;
  }

  public static final int CAP_FIELD_NUMBER = 2;
  private int cap_;
  /**
   * <code>.maptool.StrokeDto.CapDto cap = 2;</code>
   * @return The enum numeric value on the wire for cap.
   */
  @java.lang.Override public int getCapValue() {
    return cap_;
  }
  /**
   * <code>.maptool.StrokeDto.CapDto cap = 2;</code>
   * @return The cap.
   */
  @java.lang.Override public net.rptools.maptool.server.proto.StrokeDto.CapDto getCap() {
    @SuppressWarnings("deprecation")
    net.rptools.maptool.server.proto.StrokeDto.CapDto result = net.rptools.maptool.server.proto.StrokeDto.CapDto.valueOf(cap_);
    return result == null ? net.rptools.maptool.server.proto.StrokeDto.CapDto.UNRECOGNIZED : result;
  }

  public static final int JOIN_FIELD_NUMBER = 3;
  private int join_;
  /**
   * <code>.maptool.StrokeDto.JoinDto join = 3;</code>
   * @return The enum numeric value on the wire for join.
   */
  @java.lang.Override public int getJoinValue() {
    return join_;
  }
  /**
   * <code>.maptool.StrokeDto.JoinDto join = 3;</code>
   * @return The join.
   */
  @java.lang.Override public net.rptools.maptool.server.proto.StrokeDto.JoinDto getJoin() {
    @SuppressWarnings("deprecation")
    net.rptools.maptool.server.proto.StrokeDto.JoinDto result = net.rptools.maptool.server.proto.StrokeDto.JoinDto.valueOf(join_);
    return result == null ? net.rptools.maptool.server.proto.StrokeDto.JoinDto.UNRECOGNIZED : result;
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
    if (java.lang.Float.floatToRawIntBits(width_) != 0) {
      output.writeFloat(1, width_);
    }
    if (cap_ != net.rptools.maptool.server.proto.StrokeDto.CapDto.CAP_BUTT.getNumber()) {
      output.writeEnum(2, cap_);
    }
    if (join_ != net.rptools.maptool.server.proto.StrokeDto.JoinDto.JOIN_MITER.getNumber()) {
      output.writeEnum(3, join_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(width_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, width_);
    }
    if (cap_ != net.rptools.maptool.server.proto.StrokeDto.CapDto.CAP_BUTT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, cap_);
    }
    if (join_ != net.rptools.maptool.server.proto.StrokeDto.JoinDto.JOIN_MITER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, join_);
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
    if (!(obj instanceof net.rptools.maptool.server.proto.StrokeDto)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.StrokeDto other = (net.rptools.maptool.server.proto.StrokeDto) obj;

    if (java.lang.Float.floatToIntBits(getWidth())
        != java.lang.Float.floatToIntBits(
            other.getWidth())) return false;
    if (cap_ != other.cap_) return false;
    if (join_ != other.join_) return false;
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
    hash = (37 * hash) + WIDTH_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getWidth());
    hash = (37 * hash) + CAP_FIELD_NUMBER;
    hash = (53 * hash) + cap_;
    hash = (37 * hash) + JOIN_FIELD_NUMBER;
    hash = (53 * hash) + join_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.StrokeDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.StrokeDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.StrokeDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.StrokeDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.StrokeDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.StrokeDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.StrokeDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.StrokeDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.StrokeDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.StrokeDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.StrokeDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.StrokeDto parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.StrokeDto prototype) {
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
   * Protobuf type {@code maptool.StrokeDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.StrokeDto)
      net.rptools.maptool.server.proto.StrokeDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_StrokeDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_StrokeDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.StrokeDto.class, net.rptools.maptool.server.proto.StrokeDto.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.StrokeDto.newBuilder()
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
      width_ = 0F;

      cap_ = 0;

      join_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_StrokeDto_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.StrokeDto getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.StrokeDto.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.StrokeDto build() {
      net.rptools.maptool.server.proto.StrokeDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.StrokeDto buildPartial() {
      net.rptools.maptool.server.proto.StrokeDto result = new net.rptools.maptool.server.proto.StrokeDto(this);
      result.width_ = width_;
      result.cap_ = cap_;
      result.join_ = join_;
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
      if (other instanceof net.rptools.maptool.server.proto.StrokeDto) {
        return mergeFrom((net.rptools.maptool.server.proto.StrokeDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.StrokeDto other) {
      if (other == net.rptools.maptool.server.proto.StrokeDto.getDefaultInstance()) return this;
      if (other.getWidth() != 0F) {
        setWidth(other.getWidth());
      }
      if (other.cap_ != 0) {
        setCapValue(other.getCapValue());
      }
      if (other.join_ != 0) {
        setJoinValue(other.getJoinValue());
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
      net.rptools.maptool.server.proto.StrokeDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.StrokeDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float width_ ;
    /**
     * <code>float width = 1;</code>
     * @return The width.
     */
    @java.lang.Override
    public float getWidth() {
      return width_;
    }
    /**
     * <code>float width = 1;</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(float value) {
      
      width_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float width = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      
      width_ = 0F;
      onChanged();
      return this;
    }

    private int cap_ = 0;
    /**
     * <code>.maptool.StrokeDto.CapDto cap = 2;</code>
     * @return The enum numeric value on the wire for cap.
     */
    @java.lang.Override public int getCapValue() {
      return cap_;
    }
    /**
     * <code>.maptool.StrokeDto.CapDto cap = 2;</code>
     * @param value The enum numeric value on the wire for cap to set.
     * @return This builder for chaining.
     */
    public Builder setCapValue(int value) {
      
      cap_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.maptool.StrokeDto.CapDto cap = 2;</code>
     * @return The cap.
     */
    @java.lang.Override
    public net.rptools.maptool.server.proto.StrokeDto.CapDto getCap() {
      @SuppressWarnings("deprecation")
      net.rptools.maptool.server.proto.StrokeDto.CapDto result = net.rptools.maptool.server.proto.StrokeDto.CapDto.valueOf(cap_);
      return result == null ? net.rptools.maptool.server.proto.StrokeDto.CapDto.UNRECOGNIZED : result;
    }
    /**
     * <code>.maptool.StrokeDto.CapDto cap = 2;</code>
     * @param value The cap to set.
     * @return This builder for chaining.
     */
    public Builder setCap(net.rptools.maptool.server.proto.StrokeDto.CapDto value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      cap_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.maptool.StrokeDto.CapDto cap = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCap() {
      
      cap_ = 0;
      onChanged();
      return this;
    }

    private int join_ = 0;
    /**
     * <code>.maptool.StrokeDto.JoinDto join = 3;</code>
     * @return The enum numeric value on the wire for join.
     */
    @java.lang.Override public int getJoinValue() {
      return join_;
    }
    /**
     * <code>.maptool.StrokeDto.JoinDto join = 3;</code>
     * @param value The enum numeric value on the wire for join to set.
     * @return This builder for chaining.
     */
    public Builder setJoinValue(int value) {
      
      join_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.maptool.StrokeDto.JoinDto join = 3;</code>
     * @return The join.
     */
    @java.lang.Override
    public net.rptools.maptool.server.proto.StrokeDto.JoinDto getJoin() {
      @SuppressWarnings("deprecation")
      net.rptools.maptool.server.proto.StrokeDto.JoinDto result = net.rptools.maptool.server.proto.StrokeDto.JoinDto.valueOf(join_);
      return result == null ? net.rptools.maptool.server.proto.StrokeDto.JoinDto.UNRECOGNIZED : result;
    }
    /**
     * <code>.maptool.StrokeDto.JoinDto join = 3;</code>
     * @param value The join to set.
     * @return This builder for chaining.
     */
    public Builder setJoin(net.rptools.maptool.server.proto.StrokeDto.JoinDto value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      join_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.maptool.StrokeDto.JoinDto join = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJoin() {
      
      join_ = 0;
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


    // @@protoc_insertion_point(builder_scope:maptool.StrokeDto)
  }

  // @@protoc_insertion_point(class_scope:maptool.StrokeDto)
  private static final net.rptools.maptool.server.proto.StrokeDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.StrokeDto();
  }

  public static net.rptools.maptool.server.proto.StrokeDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StrokeDto>
      PARSER = new com.google.protobuf.AbstractParser<StrokeDto>() {
    @java.lang.Override
    public StrokeDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StrokeDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StrokeDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StrokeDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.StrokeDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

