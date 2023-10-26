// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message_types.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf type {@code maptool.UpdateInitiativeMsg}
 */
public final class UpdateInitiativeMsg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:maptool.UpdateInitiativeMsg)
    UpdateInitiativeMsgOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateInitiativeMsg.newBuilder() to construct.
  private UpdateInitiativeMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateInitiativeMsg() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateInitiativeMsg();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateInitiativeMsg(
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
            net.rptools.maptool.server.proto.InitiativeListDto.Builder subBuilder = null;
            if (list_ != null) {
              subBuilder = list_.toBuilder();
            }
            list_ = input.readMessage(net.rptools.maptool.server.proto.InitiativeListDto.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(list_);
              list_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.BoolValue.Builder subBuilder = null;
            if (ownerPermission_ != null) {
              subBuilder = ownerPermission_.toBuilder();
            }
            ownerPermission_ = input.readMessage(com.google.protobuf.BoolValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(ownerPermission_);
              ownerPermission_ = subBuilder.buildPartial();
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
    return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateInitiativeMsg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateInitiativeMsg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.rptools.maptool.server.proto.UpdateInitiativeMsg.class, net.rptools.maptool.server.proto.UpdateInitiativeMsg.Builder.class);
  }

  public static final int LIST_FIELD_NUMBER = 1;
  private net.rptools.maptool.server.proto.InitiativeListDto list_;
  /**
   * <code>.maptool.InitiativeListDto list = 1;</code>
   * @return Whether the list field is set.
   */
  @java.lang.Override
  public boolean hasList() {
    return list_ != null;
  }
  /**
   * <code>.maptool.InitiativeListDto list = 1;</code>
   * @return The list.
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.InitiativeListDto getList() {
    return list_ == null ? net.rptools.maptool.server.proto.InitiativeListDto.getDefaultInstance() : list_;
  }
  /**
   * <code>.maptool.InitiativeListDto list = 1;</code>
   */
  @java.lang.Override
  public net.rptools.maptool.server.proto.InitiativeListDtoOrBuilder getListOrBuilder() {
    return getList();
  }

  public static final int OWNER_PERMISSION_FIELD_NUMBER = 2;
  private com.google.protobuf.BoolValue ownerPermission_;
  /**
   * <code>.google.protobuf.BoolValue owner_permission = 2;</code>
   * @return Whether the ownerPermission field is set.
   */
  @java.lang.Override
  public boolean hasOwnerPermission() {
    return ownerPermission_ != null;
  }
  /**
   * <code>.google.protobuf.BoolValue owner_permission = 2;</code>
   * @return The ownerPermission.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getOwnerPermission() {
    return ownerPermission_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : ownerPermission_;
  }
  /**
   * <code>.google.protobuf.BoolValue owner_permission = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getOwnerPermissionOrBuilder() {
    return getOwnerPermission();
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
    if (list_ != null) {
      output.writeMessage(1, getList());
    }
    if (ownerPermission_ != null) {
      output.writeMessage(2, getOwnerPermission());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (list_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getList());
    }
    if (ownerPermission_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOwnerPermission());
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
    if (!(obj instanceof net.rptools.maptool.server.proto.UpdateInitiativeMsg)) {
      return super.equals(obj);
    }
    net.rptools.maptool.server.proto.UpdateInitiativeMsg other = (net.rptools.maptool.server.proto.UpdateInitiativeMsg) obj;

    if (hasList() != other.hasList()) return false;
    if (hasList()) {
      if (!getList()
          .equals(other.getList())) return false;
    }
    if (hasOwnerPermission() != other.hasOwnerPermission()) return false;
    if (hasOwnerPermission()) {
      if (!getOwnerPermission()
          .equals(other.getOwnerPermission())) return false;
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
    if (hasList()) {
      hash = (37 * hash) + LIST_FIELD_NUMBER;
      hash = (53 * hash) + getList().hashCode();
    }
    if (hasOwnerPermission()) {
      hash = (37 * hash) + OWNER_PERMISSION_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerPermission().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.rptools.maptool.server.proto.UpdateInitiativeMsg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.UpdateInitiativeMsg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateInitiativeMsg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.UpdateInitiativeMsg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateInitiativeMsg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.rptools.maptool.server.proto.UpdateInitiativeMsg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateInitiativeMsg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.UpdateInitiativeMsg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateInitiativeMsg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.UpdateInitiativeMsg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.rptools.maptool.server.proto.UpdateInitiativeMsg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.rptools.maptool.server.proto.UpdateInitiativeMsg parseFrom(
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
  public static Builder newBuilder(net.rptools.maptool.server.proto.UpdateInitiativeMsg prototype) {
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
   * Protobuf type {@code maptool.UpdateInitiativeMsg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:maptool.UpdateInitiativeMsg)
      net.rptools.maptool.server.proto.UpdateInitiativeMsgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateInitiativeMsg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateInitiativeMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.rptools.maptool.server.proto.UpdateInitiativeMsg.class, net.rptools.maptool.server.proto.UpdateInitiativeMsg.Builder.class);
    }

    // Construct using net.rptools.maptool.server.proto.UpdateInitiativeMsg.newBuilder()
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
      if (listBuilder_ == null) {
        list_ = null;
      } else {
        list_ = null;
        listBuilder_ = null;
      }
      if (ownerPermissionBuilder_ == null) {
        ownerPermission_ = null;
      } else {
        ownerPermission_ = null;
        ownerPermissionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.rptools.maptool.server.proto.MessageTypeProtos.internal_static_maptool_UpdateInitiativeMsg_descriptor;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.UpdateInitiativeMsg getDefaultInstanceForType() {
      return net.rptools.maptool.server.proto.UpdateInitiativeMsg.getDefaultInstance();
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.UpdateInitiativeMsg build() {
      net.rptools.maptool.server.proto.UpdateInitiativeMsg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public net.rptools.maptool.server.proto.UpdateInitiativeMsg buildPartial() {
      net.rptools.maptool.server.proto.UpdateInitiativeMsg result = new net.rptools.maptool.server.proto.UpdateInitiativeMsg(this);
      if (listBuilder_ == null) {
        result.list_ = list_;
      } else {
        result.list_ = listBuilder_.build();
      }
      if (ownerPermissionBuilder_ == null) {
        result.ownerPermission_ = ownerPermission_;
      } else {
        result.ownerPermission_ = ownerPermissionBuilder_.build();
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
      if (other instanceof net.rptools.maptool.server.proto.UpdateInitiativeMsg) {
        return mergeFrom((net.rptools.maptool.server.proto.UpdateInitiativeMsg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.rptools.maptool.server.proto.UpdateInitiativeMsg other) {
      if (other == net.rptools.maptool.server.proto.UpdateInitiativeMsg.getDefaultInstance()) return this;
      if (other.hasList()) {
        mergeList(other.getList());
      }
      if (other.hasOwnerPermission()) {
        mergeOwnerPermission(other.getOwnerPermission());
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
      net.rptools.maptool.server.proto.UpdateInitiativeMsg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.rptools.maptool.server.proto.UpdateInitiativeMsg) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private net.rptools.maptool.server.proto.InitiativeListDto list_;
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.InitiativeListDto, net.rptools.maptool.server.proto.InitiativeListDto.Builder, net.rptools.maptool.server.proto.InitiativeListDtoOrBuilder> listBuilder_;
    /**
     * <code>.maptool.InitiativeListDto list = 1;</code>
     * @return Whether the list field is set.
     */
    public boolean hasList() {
      return listBuilder_ != null || list_ != null;
    }
    /**
     * <code>.maptool.InitiativeListDto list = 1;</code>
     * @return The list.
     */
    public net.rptools.maptool.server.proto.InitiativeListDto getList() {
      if (listBuilder_ == null) {
        return list_ == null ? net.rptools.maptool.server.proto.InitiativeListDto.getDefaultInstance() : list_;
      } else {
        return listBuilder_.getMessage();
      }
    }
    /**
     * <code>.maptool.InitiativeListDto list = 1;</code>
     */
    public Builder setList(net.rptools.maptool.server.proto.InitiativeListDto value) {
      if (listBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        list_ = value;
        onChanged();
      } else {
        listBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.maptool.InitiativeListDto list = 1;</code>
     */
    public Builder setList(
        net.rptools.maptool.server.proto.InitiativeListDto.Builder builderForValue) {
      if (listBuilder_ == null) {
        list_ = builderForValue.build();
        onChanged();
      } else {
        listBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.maptool.InitiativeListDto list = 1;</code>
     */
    public Builder mergeList(net.rptools.maptool.server.proto.InitiativeListDto value) {
      if (listBuilder_ == null) {
        if (list_ != null) {
          list_ =
            net.rptools.maptool.server.proto.InitiativeListDto.newBuilder(list_).mergeFrom(value).buildPartial();
        } else {
          list_ = value;
        }
        onChanged();
      } else {
        listBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.maptool.InitiativeListDto list = 1;</code>
     */
    public Builder clearList() {
      if (listBuilder_ == null) {
        list_ = null;
        onChanged();
      } else {
        list_ = null;
        listBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.maptool.InitiativeListDto list = 1;</code>
     */
    public net.rptools.maptool.server.proto.InitiativeListDto.Builder getListBuilder() {
      
      onChanged();
      return getListFieldBuilder().getBuilder();
    }
    /**
     * <code>.maptool.InitiativeListDto list = 1;</code>
     */
    public net.rptools.maptool.server.proto.InitiativeListDtoOrBuilder getListOrBuilder() {
      if (listBuilder_ != null) {
        return listBuilder_.getMessageOrBuilder();
      } else {
        return list_ == null ?
            net.rptools.maptool.server.proto.InitiativeListDto.getDefaultInstance() : list_;
      }
    }
    /**
     * <code>.maptool.InitiativeListDto list = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        net.rptools.maptool.server.proto.InitiativeListDto, net.rptools.maptool.server.proto.InitiativeListDto.Builder, net.rptools.maptool.server.proto.InitiativeListDtoOrBuilder> 
        getListFieldBuilder() {
      if (listBuilder_ == null) {
        listBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            net.rptools.maptool.server.proto.InitiativeListDto, net.rptools.maptool.server.proto.InitiativeListDto.Builder, net.rptools.maptool.server.proto.InitiativeListDtoOrBuilder>(
                getList(),
                getParentForChildren(),
                isClean());
        list_ = null;
      }
      return listBuilder_;
    }

    private com.google.protobuf.BoolValue ownerPermission_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> ownerPermissionBuilder_;
    /**
     * <code>.google.protobuf.BoolValue owner_permission = 2;</code>
     * @return Whether the ownerPermission field is set.
     */
    public boolean hasOwnerPermission() {
      return ownerPermissionBuilder_ != null || ownerPermission_ != null;
    }
    /**
     * <code>.google.protobuf.BoolValue owner_permission = 2;</code>
     * @return The ownerPermission.
     */
    public com.google.protobuf.BoolValue getOwnerPermission() {
      if (ownerPermissionBuilder_ == null) {
        return ownerPermission_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : ownerPermission_;
      } else {
        return ownerPermissionBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.BoolValue owner_permission = 2;</code>
     */
    public Builder setOwnerPermission(com.google.protobuf.BoolValue value) {
      if (ownerPermissionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ownerPermission_ = value;
        onChanged();
      } else {
        ownerPermissionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.BoolValue owner_permission = 2;</code>
     */
    public Builder setOwnerPermission(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (ownerPermissionBuilder_ == null) {
        ownerPermission_ = builderForValue.build();
        onChanged();
      } else {
        ownerPermissionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.BoolValue owner_permission = 2;</code>
     */
    public Builder mergeOwnerPermission(com.google.protobuf.BoolValue value) {
      if (ownerPermissionBuilder_ == null) {
        if (ownerPermission_ != null) {
          ownerPermission_ =
            com.google.protobuf.BoolValue.newBuilder(ownerPermission_).mergeFrom(value).buildPartial();
        } else {
          ownerPermission_ = value;
        }
        onChanged();
      } else {
        ownerPermissionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.BoolValue owner_permission = 2;</code>
     */
    public Builder clearOwnerPermission() {
      if (ownerPermissionBuilder_ == null) {
        ownerPermission_ = null;
        onChanged();
      } else {
        ownerPermission_ = null;
        ownerPermissionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.BoolValue owner_permission = 2;</code>
     */
    public com.google.protobuf.BoolValue.Builder getOwnerPermissionBuilder() {
      
      onChanged();
      return getOwnerPermissionFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.BoolValue owner_permission = 2;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getOwnerPermissionOrBuilder() {
      if (ownerPermissionBuilder_ != null) {
        return ownerPermissionBuilder_.getMessageOrBuilder();
      } else {
        return ownerPermission_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : ownerPermission_;
      }
    }
    /**
     * <code>.google.protobuf.BoolValue owner_permission = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> 
        getOwnerPermissionFieldBuilder() {
      if (ownerPermissionBuilder_ == null) {
        ownerPermissionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getOwnerPermission(),
                getParentForChildren(),
                isClean());
        ownerPermission_ = null;
      }
      return ownerPermissionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:maptool.UpdateInitiativeMsg)
  }

  // @@protoc_insertion_point(class_scope:maptool.UpdateInitiativeMsg)
  private static final net.rptools.maptool.server.proto.UpdateInitiativeMsg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.rptools.maptool.server.proto.UpdateInitiativeMsg();
  }

  public static net.rptools.maptool.server.proto.UpdateInitiativeMsg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateInitiativeMsg>
      PARSER = new com.google.protobuf.AbstractParser<UpdateInitiativeMsg>() {
    @java.lang.Override
    public UpdateInitiativeMsg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateInitiativeMsg(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateInitiativeMsg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateInitiativeMsg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public net.rptools.maptool.server.proto.UpdateInitiativeMsg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
