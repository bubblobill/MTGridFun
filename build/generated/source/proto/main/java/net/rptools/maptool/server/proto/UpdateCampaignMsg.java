// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message_types.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf type {@code maptool.UpdateCampaignMsg}
 */
public final class UpdateCampaignMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.UpdateCampaignMsg)
    UpdateCampaignMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateCampaignMsg.newBuilder() to construct.
  private UpdateCampaignMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateCampaignMsg() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateCampaignMsg();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateCampaignMsg(
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
            net.rptools.maptool.server.proto.CampaignPropertiesDto.Builder subBuilder = null;
            if (properties_ != null) {
              subBuilder = properties_.toBuilder();
            }
            properties_ = input.readMessage(net.rptools.maptool.server.proto.CampaignPropertiesDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(properties_);
              properties_ = subBuilder.buildPartial();
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
    return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateCampaignMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateCampaignMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.UpdateCampaignMsg.class, net.rptools.maptool.server.proto.UpdateCampaignMsg.Builder.class);
  }

  public static final int PROPERTIES_FIELD_NUMBER = 1;
  private net.rptools.maptool.server.proto.CampaignPropertiesDto properties_;
  /**
   * <code>.maptool.CampaignPropertiesDto properties = 1;</code>
   * @return Whether the properties field is set.
   */
  @java.lang.Override
  public boolean hasProperties() {
    return properties_ != null;
  }
  /**
   * <code>.maptool.CampaignPropertiesDto properties = 1;</code>
   * @return The properties.
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.CampaignPropertiesDto getProperties() {
    return properties_ == null ? net.rptools.maptool.server.proto.CampaignPropertiesDto.getDefaultInstance() : properties_;
  }
  /**
   * <code>.maptool.CampaignPropertiesDto properties = 1;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.CampaignPropertiesDtoOrBuilder getPropertiesOrBuilder() {
    return getProperties();
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
    if (properties_ != null) {
      output.writeMessage(1, getProperties());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (properties_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProperties());
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
    if (!(obj instanceof net.rptools.maptool.server.proto.UpdateCampaignMsg)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.UpdateCampaignMsg other = (net.rptools.maptool.server.proto.UpdateCampaignMsg) obj;

    if (hasProperties() != other.hasProperties()) return false;
    if (hasProperties()) {
      if (!getProperties()
          .equals(other.getProperties())) return false;
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
    if (hasProperties()) {
      hash = (37 * hash) + PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + getProperties().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.UpdateCampaignMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.UpdateCampaignMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateCampaignMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.UpdateCampaignMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateCampaignMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.UpdateCampaignMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateCampaignMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.UpdateCampaignMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateCampaignMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.UpdateCampaignMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateCampaignMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.UpdateCampaignMsg parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.UpdateCampaignMsg prototype) {
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
   * Protobuf type {@code maptool.UpdateCampaignMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.UpdateCampaignMsg)
      net.rptools.maptool.server.proto.UpdateCampaignMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateCampaignMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateCampaignMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.UpdateCampaignMsg.class, net.rptools.maptool.server.proto.UpdateCampaignMsg.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.UpdateCampaignMsg.newBuilder()
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
      if (propertiesBuilder_ == null) {
        properties_ = null;
      } else {
        properties_ = null;
        propertiesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateCampaignMsg_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.UpdateCampaignMsg getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.UpdateCampaignMsg.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.UpdateCampaignMsg build() {
      net.rptools.maptool.server.proto.UpdateCampaignMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.UpdateCampaignMsg buildPartial() {
      net.rptools.maptool.server.proto.UpdateCampaignMsg result = new net.rptools.maptool.server.proto.UpdateCampaignMsg(this);
      if (propertiesBuilder_ == null) {
        result.properties_ = properties_;
      } else {
        result.properties_ = propertiesBuilder_.build();
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
      if (other instanceof net.rptools.maptool.server.proto.UpdateCampaignMsg) {
        return mergeFrom((net.rptools.maptool.server.proto.UpdateCampaignMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.UpdateCampaignMsg other) {
      if (other == net.rptools.maptool.server.proto.UpdateCampaignMsg.getDefaultInstance()) return this;
      if (other.hasProperties()) {
        mergeProperties(other.getProperties());
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
      net.rptools.maptool.server.proto.UpdateCampaignMsg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.UpdateCampaignMsg) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private net.rptools.maptool.server.proto.CampaignPropertiesDto properties_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.CampaignPropertiesDto, net.rptools.maptool.server.proto.CampaignPropertiesDto.Builder, net.rptools.maptool.server.proto.CampaignPropertiesDtoOrBuilder> propertiesBuilder_;
    /**
     * <code>.maptool.CampaignPropertiesDto properties = 1;</code>
     * @return Whether the properties field is set.
     */
    public boolean hasProperties() {
      return propertiesBuilder_ != null || properties_ != null;
    }
    /**
     * <code>.maptool.CampaignPropertiesDto properties = 1;</code>
     * @return The properties.
     */
    public net.rptools.maptool.server.proto.CampaignPropertiesDto getProperties() {
      if (propertiesBuilder_ == null) {
        return properties_ == null ? net.rptools.maptool.server.proto.CampaignPropertiesDto.getDefaultInstance() : properties_;
      } else {
        return propertiesBuilder_.getMessage();
      }
    }
    /**
     * <code>.maptool.CampaignPropertiesDto properties = 1;</code>
     */
    public Builder setProperties(net.rptools.maptool.server.proto.CampaignPropertiesDto value) {
      if (propertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        properties_ = value;
        onChanged();
      } else {
        propertiesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.maptool.CampaignPropertiesDto properties = 1;</code>
     */
    public Builder setProperties(
        net.rptools.maptool.server.proto.CampaignPropertiesDto.Builder builderForValue) {
      if (propertiesBuilder_ == null) {
        properties_ = builderForValue.build();
        onChanged();
      } else {
        propertiesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.maptool.CampaignPropertiesDto properties = 1;</code>
     */
    public Builder mergeProperties(net.rptools.maptool.server.proto.CampaignPropertiesDto value) {
      if (propertiesBuilder_ == null) {
        if (properties_ != null) {
          properties_ =
            net.rptools.maptool.server.proto.CampaignPropertiesDto.newBuilder(properties_).mergeFrom(value).buildPartial();
        } else {
          properties_ = value;
        }
        onChanged();
      } else {
        propertiesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.maptool.CampaignPropertiesDto properties = 1;</code>
     */
    public Builder clearProperties() {
      if (propertiesBuilder_ == null) {
        properties_ = null;
        onChanged();
      } else {
        properties_ = null;
        propertiesBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.maptool.CampaignPropertiesDto properties = 1;</code>
     */
    public net.rptools.maptool.server.proto.CampaignPropertiesDto.Builder getPropertiesBuilder() {
      
      onChanged();
      return getPropertiesFieldBuilder().getBuilder();
    }
    /**
     * <code>.maptool.CampaignPropertiesDto properties = 1;</code>
     */
    public net.rptools.maptool.server.proto.CampaignPropertiesDtoOrBuilder getPropertiesOrBuilder() {
      if (propertiesBuilder_ != null) {
        return propertiesBuilder_.getMessageOrBuilder();
      } else {
        return properties_ == null ?
            net.rptools.maptool.server.proto.CampaignPropertiesDto.getDefaultInstance() : properties_;
      }
    }
    /**
     * <code>.maptool.CampaignPropertiesDto properties = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.CampaignPropertiesDto, net.rptools.maptool.server.proto.CampaignPropertiesDto.Builder, net.rptools.maptool.server.proto.CampaignPropertiesDtoOrBuilder> 
        getPropertiesFieldBuilder() {
      if (propertiesBuilder_ == null) {
        propertiesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rptools.maptool.server.proto.CampaignPropertiesDto, net.rptools.maptool.server.proto.CampaignPropertiesDto.Builder, net.rptools.maptool.server.proto.CampaignPropertiesDtoOrBuilder>(
                getProperties(),
                getParentForChildren(),
                isClean());
        properties_ = null;
      }
      return propertiesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:maptool.UpdateCampaignMsg)
  }

  // @@protoc_insertion_point(class_scope:maptool.UpdateCampaignMsg)
  private static final net.rptools.maptool.server.proto.UpdateCampaignMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.UpdateCampaignMsg();
  }

  public static net.rptools.maptool.server.proto.UpdateCampaignMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCampaignMsg>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCampaignMsg>() {
    @java.lang.Override
    public UpdateCampaignMsg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateCampaignMsg(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateCampaignMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCampaignMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.UpdateCampaignMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

