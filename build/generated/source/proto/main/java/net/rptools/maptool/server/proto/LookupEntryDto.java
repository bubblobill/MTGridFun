// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf type {@code maptool.LookupEntryDto}
 */
public final class LookupEntryDto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.LookupEntryDto)
    LookupEntryDtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LookupEntryDto.newBuilder() to construct.
  private LookupEntryDto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LookupEntryDto() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LookupEntryDto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LookupEntryDto(
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
          case 8: {

            min_ = input.readInt32();
            break;
          }
          case 16: {

            max_ = input.readInt32();
            break;
          }
          case 24: {

            picked_ = input.readBool();
            break;
          }
          case 34: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (value_ != null) {
              subBuilder = value_.toBuilder();
            }
            value_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(value_);
              value_ = subBuilder.buildPartial();
            }

            break;
          }
          case 42: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (imageId_ != null) {
              subBuilder = imageId_.toBuilder();
            }
            imageId_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(imageId_);
              imageId_ = subBuilder.buildPartial();
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
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_LookupEntryDto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_LookupEntryDto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.LookupEntryDto.class, net.rptools.maptool.server.proto.LookupEntryDto.Builder.class);
  }

  public static final int MIN_FIELD_NUMBER = 1;
  private int min_;
  /**
   * <code>int32 min = 1;</code>
   * @return The min.
   */
  @java.lang.Override
  public int getMin() {
    return min_;
  }

  public static final int MAX_FIELD_NUMBER = 2;
  private int max_;
  /**
   * <code>int32 max = 2;</code>
   * @return The max.
   */
  @java.lang.Override
  public int getMax() {
    return max_;
  }

  public static final int PICKED_FIELD_NUMBER = 3;
  private boolean picked_;
  /**
   * <code>bool picked = 3;</code>
   * @return The picked.
   */
  @java.lang.Override
  public boolean getPicked() {
    return picked_;
  }

  public static final int VALUE_FIELD_NUMBER = 4;
  private com.google.protobuf.StringValue value_;
  /**
   * <code>.google.protobuf.StringValue value = 4;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue value = 4;</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getValue() {
    return value_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : value_;
  }
  /**
   * <code>.google.protobuf.StringValue value = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getValueOrBuilder() {
    return getValue();
  }

  public static final int IMAGE_ID_FIELD_NUMBER = 5;
  private com.google.protobuf.StringValue imageId_;
  /**
   * <code>.google.protobuf.StringValue image_id = 5;</code>
   * @return Whether the imageId field is set.
   */
  @java.lang.Override
  public boolean hasImageId() {
    return imageId_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue image_id = 5;</code>
   * @return The imageId.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getImageId() {
    return imageId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : imageId_;
  }
  /**
   * <code>.google.protobuf.StringValue image_id = 5;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getImageIdOrBuilder() {
    return getImageId();
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
    if (min_ != 0) {
      output.writeInt32(1, min_);
    }
    if (max_ != 0) {
      output.writeInt32(2, max_);
    }
    if (picked_ != false) {
      output.writeBool(3, picked_);
    }
    if (value_ != null) {
      output.writeMessage(4, getValue());
    }
    if (imageId_ != null) {
      output.writeMessage(5, getImageId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (min_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, min_);
    }
    if (max_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, max_);
    }
    if (picked_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, picked_);
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getValue());
    }
    if (imageId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getImageId());
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
    if (!(obj instanceof net.rptools.maptool.server.proto.LookupEntryDto)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.LookupEntryDto other = (net.rptools.maptool.server.proto.LookupEntryDto) obj;

    if (getMin()
        != other.getMin()) return false;
    if (getMax()
        != other.getMax()) return false;
    if (getPicked()
        != other.getPicked()) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
    if (hasImageId() != other.hasImageId()) return false;
    if (hasImageId()) {
      if (!getImageId()
          .equals(other.getImageId())) return false;
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
    hash = (37 * hash) + MIN_FIELD_NUMBER;
    hash = (53 * hash) + getMin();
    hash = (37 * hash) + MAX_FIELD_NUMBER;
    hash = (53 * hash) + getMax();
    hash = (37 * hash) + PICKED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPicked());
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    if (hasImageId()) {
      hash = (37 * hash) + IMAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getImageId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.LookupEntryDto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.LookupEntryDto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.LookupEntryDto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.LookupEntryDto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.LookupEntryDto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.LookupEntryDto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.LookupEntryDto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.LookupEntryDto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.LookupEntryDto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.LookupEntryDto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.LookupEntryDto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.LookupEntryDto parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.LookupEntryDto prototype) {
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
   * Protobuf type {@code maptool.LookupEntryDto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.LookupEntryDto)
      net.rptools.maptool.server.proto.LookupEntryDtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_LookupEntryDto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_LookupEntryDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.LookupEntryDto.class, net.rptools.maptool.server.proto.LookupEntryDto.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.LookupEntryDto.newBuilder()
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
      min_ = 0;

      max_ = 0;

      picked_ = false;

      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        value_ = null;
        valueBuilder_ = null;
      }
      if (imageIdBuilder_ == null) {
        imageId_ = null;
      } else {
        imageId_ = null;
        imageIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.DataTranferObjectProtos.internal_static_maptool_LookupEntryDto_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.LookupEntryDto getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.LookupEntryDto.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.LookupEntryDto build() {
      net.rptools.maptool.server.proto.LookupEntryDto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.LookupEntryDto buildPartial() {
      net.rptools.maptool.server.proto.LookupEntryDto result = new net.rptools.maptool.server.proto.LookupEntryDto(this);
      result.min_ = min_;
      result.max_ = max_;
      result.picked_ = picked_;
      if (valueBuilder_ == null) {
        result.value_ = value_;
      } else {
        result.value_ = valueBuilder_.build();
      }
      if (imageIdBuilder_ == null) {
        result.imageId_ = imageId_;
      } else {
        result.imageId_ = imageIdBuilder_.build();
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
      if (other instanceof net.rptools.maptool.server.proto.LookupEntryDto) {
        return mergeFrom((net.rptools.maptool.server.proto.LookupEntryDto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.LookupEntryDto other) {
      if (other == net.rptools.maptool.server.proto.LookupEntryDto.getDefaultInstance()) return this;
      if (other.getMin() != 0) {
        setMin(other.getMin());
      }
      if (other.getMax() != 0) {
        setMax(other.getMax());
      }
      if (other.getPicked() != false) {
        setPicked(other.getPicked());
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
      }
      if (other.hasImageId()) {
        mergeImageId(other.getImageId());
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
      net.rptools.maptool.server.proto.LookupEntryDto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.LookupEntryDto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int min_ ;
    /**
     * <code>int32 min = 1;</code>
     * @return The min.
     */
    @java.lang.Override
    public int getMin() {
      return min_;
    }
    /**
     * <code>int32 min = 1;</code>
     * @param value The min to set.
     * @return This builder for chaining.
     */
    public Builder setMin(int value) {
      
      min_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 min = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMin() {
      
      min_ = 0;
      onChanged();
      return this;
    }

    private int max_ ;
    /**
     * <code>int32 max = 2;</code>
     * @return The max.
     */
    @java.lang.Override
    public int getMax() {
      return max_;
    }
    /**
     * <code>int32 max = 2;</code>
     * @param value The max to set.
     * @return This builder for chaining.
     */
    public Builder setMax(int value) {
      
      max_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMax() {
      
      max_ = 0;
      onChanged();
      return this;
    }

    private boolean picked_ ;
    /**
     * <code>bool picked = 3;</code>
     * @return The picked.
     */
    @java.lang.Override
    public boolean getPicked() {
      return picked_;
    }
    /**
     * <code>bool picked = 3;</code>
     * @param value The picked to set.
     * @return This builder for chaining.
     */
    public Builder setPicked(boolean value) {
      
      picked_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool picked = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPicked() {
      
      picked_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.StringValue value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> valueBuilder_;
    /**
     * <code>.google.protobuf.StringValue value = 4;</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return valueBuilder_ != null || value_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue value = 4;</code>
     * @return The value.
     */
    public com.google.protobuf.StringValue getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue value = 4;</code>
     */
    public Builder setValue(com.google.protobuf.StringValue value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue value = 4;</code>
     */
    public Builder setValue(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue value = 4;</code>
     */
    public Builder mergeValue(com.google.protobuf.StringValue value) {
      if (valueBuilder_ == null) {
        if (value_ != null) {
          value_ =
            com.google.protobuf.StringValue.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue value = 4;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        value_ = null;
        valueBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue value = 4;</code>
     */
    public com.google.protobuf.StringValue.Builder getValueBuilder() {
      
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue value = 4;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : value_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue value = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
    }

    private com.google.protobuf.StringValue imageId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> imageIdBuilder_;
    /**
     * <code>.google.protobuf.StringValue image_id = 5;</code>
     * @return Whether the imageId field is set.
     */
    public boolean hasImageId() {
      return imageIdBuilder_ != null || imageId_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue image_id = 5;</code>
     * @return The imageId.
     */
    public com.google.protobuf.StringValue getImageId() {
      if (imageIdBuilder_ == null) {
        return imageId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : imageId_;
      } else {
        return imageIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue image_id = 5;</code>
     */
    public Builder setImageId(com.google.protobuf.StringValue value) {
      if (imageIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        imageId_ = value;
        onChanged();
      } else {
        imageIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue image_id = 5;</code>
     */
    public Builder setImageId(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (imageIdBuilder_ == null) {
        imageId_ = builderForValue.build();
        onChanged();
      } else {
        imageIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue image_id = 5;</code>
     */
    public Builder mergeImageId(com.google.protobuf.StringValue value) {
      if (imageIdBuilder_ == null) {
        if (imageId_ != null) {
          imageId_ =
            com.google.protobuf.StringValue.newBuilder(imageId_).mergeFrom(value).buildPartial();
        } else {
          imageId_ = value;
        }
        onChanged();
      } else {
        imageIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue image_id = 5;</code>
     */
    public Builder clearImageId() {
      if (imageIdBuilder_ == null) {
        imageId_ = null;
        onChanged();
      } else {
        imageId_ = null;
        imageIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue image_id = 5;</code>
     */
    public com.google.protobuf.StringValue.Builder getImageIdBuilder() {
      
      onChanged();
      return getImageIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue image_id = 5;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getImageIdOrBuilder() {
      if (imageIdBuilder_ != null) {
        return imageIdBuilder_.getMessageOrBuilder();
      } else {
        return imageId_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : imageId_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue image_id = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getImageIdFieldBuilder() {
      if (imageIdBuilder_ == null) {
        imageIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getImageId(),
                getParentForChildren(),
                isClean());
        imageId_ = null;
      }
      return imageIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:maptool.LookupEntryDto)
  }

  // @@protoc_insertion_point(class_scope:maptool.LookupEntryDto)
  private static final net.rptools.maptool.server.proto.LookupEntryDto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.LookupEntryDto();
  }

  public static net.rptools.maptool.server.proto.LookupEntryDto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LookupEntryDto>
      PARSER = new com.google.protobuf.AbstractParser<LookupEntryDto>() {
    @java.lang.Override
    public LookupEntryDto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LookupEntryDto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LookupEntryDto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LookupEntryDto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.LookupEntryDto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

