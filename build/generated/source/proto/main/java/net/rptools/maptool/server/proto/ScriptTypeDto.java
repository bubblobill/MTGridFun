// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf type {@code maptool.ScriptTypeDto}
 */
public final class ScriptTypeDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.ScriptTypeDto)
    ScriptTypeDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScriptTypeDto.newBuilder() to construct.
  private ScriptTypeDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScriptTypeDto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScriptTypeDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ScriptTypeDto(
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
          case 9: {
            type_ = input.readDouble();
            typeCase_ = 1;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            typeCase_ = 2;
            type_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            typeCase_ = 3;
            type_ = s;
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
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_ScriptTypeDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_ScriptTypeDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.ScriptTypeDto.class, net.rptools.maptool.server.proto.ScriptTypeDto.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    DOUBLE_VAL(1),
    STRING_VAL(2),
    JSON_VAL(3),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 1: return DOUBLE_VAL;
        case 2: return STRING_VAL;
        case 3: return JSON_VAL;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int DOUBLE_VAL_FIELD_NUMBER = 1;
  /**
   * <code>double double_val = 1;</code>
   * @return Whether the doubleVal field is set.
   */
  @java.lang.Override
  public boolean hasDoubleVal() {
    return typeCase_ == 1;
  }
  /**
   * <code>double double_val = 1;</code>
   * @return The doubleVal.
   */
  @java.lang.Override
  public double getDoubleVal() {
    if (typeCase_ == 1) {
      return (java.lang.Double) type_;
    }
    return 0D;
  }

  public static final int STRING_VAL_FIELD_NUMBER = 2;
  /**
   * <code>string string_val = 2;</code>
   * @return Whether the stringVal field is set.
   */
  public boolean hasStringVal() {
    return typeCase_ == 2;
  }
  /**
   * <code>string string_val = 2;</code>
   * @return The stringVal.
   */
  public java.lang.String getStringVal() {
    java.lang.Object ref = "";
    if (typeCase_ == 2) {
      ref = type_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (typeCase_ == 2) {
        type_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string string_val = 2;</code>
   * @return The bytes for stringVal.
   */
  public com.google.protobuf.ByteString
      getStringValBytes() {
    java.lang.Object ref = "";
    if (typeCase_ == 2) {
      ref = type_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (typeCase_ == 2) {
        type_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JSON_VAL_FIELD_NUMBER = 3;
  /**
   * <code>string json_val = 3;</code>
   * @return Whether the jsonVal field is set.
   */
  public boolean hasJsonVal() {
    return typeCase_ == 3;
  }
  /**
   * <code>string json_val = 3;</code>
   * @return The jsonVal.
   */
  public java.lang.String getJsonVal() {
    java.lang.Object ref = "";
    if (typeCase_ == 3) {
      ref = type_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (typeCase_ == 3) {
        type_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string json_val = 3;</code>
   * @return The bytes for jsonVal.
   */
  public com.google.protobuf.ByteString
      getJsonValBytes() {
    java.lang.Object ref = "";
    if (typeCase_ == 3) {
      ref = type_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (typeCase_ == 3) {
        type_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (typeCase_ == 1) {
      output.writeDouble(
          1, (double)((java.lang.Double) type_));
    }
    if (typeCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    if (typeCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(
            1, (double)((java.lang.Double) type_));
    }
    if (typeCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    if (typeCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
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
    if (!(obj instanceof net.rptools.maptool.server.proto.ScriptTypeDto)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.ScriptTypeDto other = (net.rptools.maptool.server.proto.ScriptTypeDto) obj;

    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 1:
        if (java.lang.Double.doubleToLongBits(getDoubleVal())
            != java.lang.Double.doubleToLongBits(
                other.getDoubleVal())) return false;
        break;
      case 2:
        if (!getStringVal()
            .equals(other.getStringVal())) return false;
        break;
      case 3:
        if (!getJsonVal()
            .equals(other.getJsonVal())) return false;
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
    switch (typeCase_) {
      case 1:
        hash = (37 * hash) + DOUBLE_VAL_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            java.lang.Double.doubleToLongBits(getDoubleVal()));
        break;
      case 2:
        hash = (37 * hash) + STRING_VAL_FIELD_NUMBER;
        hash = (53 * hash) + getStringVal().hashCode();
        break;
      case 3:
        hash = (37 * hash) + JSON_VAL_FIELD_NUMBER;
        hash = (53 * hash) + getJsonVal().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.ScriptTypeDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.ScriptTypeDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.ScriptTypeDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.ScriptTypeDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.ScriptTypeDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.ScriptTypeDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.ScriptTypeDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.ScriptTypeDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.ScriptTypeDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.ScriptTypeDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.ScriptTypeDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.ScriptTypeDto parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.ScriptTypeDto prototype) {
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
   * Protobuf type {@code maptool.ScriptTypeDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.ScriptTypeDto)
      net.rptools.maptool.server.proto.ScriptTypeDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_ScriptTypeDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_ScriptTypeDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.ScriptTypeDto.class, net.rptools.maptool.server.proto.ScriptTypeDto.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.ScriptTypeDto.newBuilder()
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
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_ScriptTypeDto_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.ScriptTypeDto getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.ScriptTypeDto.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.ScriptTypeDto build() {
      net.rptools.maptool.server.proto.ScriptTypeDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.ScriptTypeDto buildPartial() {
      net.rptools.maptool.server.proto.ScriptTypeDto result = new net.rptools.maptool.server.proto.ScriptTypeDto(this);
      if (typeCase_ == 1) {
        result.type_ = type_;
      }
      if (typeCase_ == 2) {
        result.type_ = type_;
      }
      if (typeCase_ == 3) {
        result.type_ = type_;
      }
      result.typeCase_ = typeCase_;
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
      if (other instanceof net.rptools.maptool.server.proto.ScriptTypeDto) {
        return mergeFrom((net.rptools.maptool.server.proto.ScriptTypeDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.ScriptTypeDto other) {
      if (other == net.rptools.maptool.server.proto.ScriptTypeDto.getDefaultInstance()) return this;
      switch (other.getTypeCase()) {
        case DOUBLE_VAL: {
          setDoubleVal(other.getDoubleVal());
          break;
        }
        case STRING_VAL: {
          typeCase_ = 2;
          type_ = other.type_;
          onChanged();
          break;
        }
        case JSON_VAL: {
          typeCase_ = 3;
          type_ = other.type_;
          onChanged();
          break;
        }
        case TYPE_NOT_SET: {
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
      net.rptools.maptool.server.proto.ScriptTypeDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.ScriptTypeDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>double double_val = 1;</code>
     * @return Whether the doubleVal field is set.
     */
    public boolean hasDoubleVal() {
      return typeCase_ == 1;
    }
    /**
     * <code>double double_val = 1;</code>
     * @return The doubleVal.
     */
    public double getDoubleVal() {
      if (typeCase_ == 1) {
        return (java.lang.Double) type_;
      }
      return 0D;
    }
    /**
     * <code>double double_val = 1;</code>
     * @param value The doubleVal to set.
     * @return This builder for chaining.
     */
    public Builder setDoubleVal(double value) {
      typeCase_ = 1;
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double double_val = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoubleVal() {
      if (typeCase_ == 1) {
        typeCase_ = 0;
        type_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>string string_val = 2;</code>
     * @return Whether the stringVal field is set.
     */
    @java.lang.Override
    public boolean hasStringVal() {
      return typeCase_ == 2;
    }
    /**
     * <code>string string_val = 2;</code>
     * @return The stringVal.
     */
    @java.lang.Override
    public java.lang.String getStringVal() {
      java.lang.Object ref = "";
      if (typeCase_ == 2) {
        ref = type_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (typeCase_ == 2) {
          type_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string string_val = 2;</code>
     * @return The bytes for stringVal.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getStringValBytes() {
      java.lang.Object ref = "";
      if (typeCase_ == 2) {
        ref = type_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (typeCase_ == 2) {
          type_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string string_val = 2;</code>
     * @param value The stringVal to set.
     * @return This builder for chaining.
     */
    public Builder setStringVal(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  typeCase_ = 2;
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string string_val = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStringVal() {
      if (typeCase_ == 2) {
        typeCase_ = 0;
        type_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string string_val = 2;</code>
     * @param value The bytes for stringVal to set.
     * @return This builder for chaining.
     */
    public Builder setStringValBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      typeCase_ = 2;
      type_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string json_val = 3;</code>
     * @return Whether the jsonVal field is set.
     */
    @java.lang.Override
    public boolean hasJsonVal() {
      return typeCase_ == 3;
    }
    /**
     * <code>string json_val = 3;</code>
     * @return The jsonVal.
     */
    @java.lang.Override
    public java.lang.String getJsonVal() {
      java.lang.Object ref = "";
      if (typeCase_ == 3) {
        ref = type_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (typeCase_ == 3) {
          type_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string json_val = 3;</code>
     * @return The bytes for jsonVal.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getJsonValBytes() {
      java.lang.Object ref = "";
      if (typeCase_ == 3) {
        ref = type_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (typeCase_ == 3) {
          type_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string json_val = 3;</code>
     * @param value The jsonVal to set.
     * @return This builder for chaining.
     */
    public Builder setJsonVal(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  typeCase_ = 3;
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string json_val = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearJsonVal() {
      if (typeCase_ == 3) {
        typeCase_ = 0;
        type_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string json_val = 3;</code>
     * @param value The bytes for jsonVal to set.
     * @return This builder for chaining.
     */
    public Builder setJsonValBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      typeCase_ = 3;
      type_ = value;
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


    // @@protoc_insertion_point(builder_scope:maptool.ScriptTypeDto)
  }

  // @@protoc_insertion_point(class_scope:maptool.ScriptTypeDto)
  private static final net.rptools.maptool.server.proto.ScriptTypeDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.ScriptTypeDto();
  }

  public static net.rptools.maptool.server.proto.ScriptTypeDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScriptTypeDto>
      PARSER = new com.google.protobuf.AbstractParser<ScriptTypeDto>() {
    @java.lang.Override
    public ScriptTypeDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ScriptTypeDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ScriptTypeDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScriptTypeDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.ScriptTypeDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

