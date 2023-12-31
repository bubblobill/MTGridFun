// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf enum {@code maptool.TerrainModifierOperationDto}
 */
public enum TerrainModifierOperationDto
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NONE = 0;</code>
   */
  NONE(0),
  /**
   * <code>MULTIPLY = 1;</code>
   */
  MULTIPLY(1),
  /**
   * <code>ADD = 2;</code>
   */
  ADD(2),
  /**
   * <code>BLOCK = 3;</code>
   */
  BLOCK(3),
  /**
   * <code>FREE = 4;</code>
   */
  FREE(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NONE = 0;</code>
   */
  public static final int NONE_VALUE = 0;
  /**
   * <code>MULTIPLY = 1;</code>
   */
  public static final int MULTIPLY_VALUE = 1;
  /**
   * <code>ADD = 2;</code>
   */
  public static final int ADD_VALUE = 2;
  /**
   * <code>BLOCK = 3;</code>
   */
  public static final int BLOCK_VALUE = 3;
  /**
   * <code>FREE = 4;</code>
   */
  public static final int FREE_VALUE = 4;


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
  public static TerrainModifierOperationDto valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TerrainModifierOperationDto forNumber(int value) {
    switch (value) {
      case 0: return NONE;
      case 1: return MULTIPLY;
      case 2: return ADD;
      case 3: return BLOCK;
      case 4: return FREE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TerrainModifierOperationDto>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TerrainModifierOperationDto> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TerrainModifierOperationDto>() {
          public TerrainModifierOperationDto findValueByNumber(int number) {
            return TerrainModifierOperationDto.forNumber(number);
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
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.getDescriptor().getEnumTypes().get(6);
  }

  private static final TerrainModifierOperationDto[] VALUES = values();

  public static TerrainModifierOperationDto valueOf(
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

  private TerrainModifierOperationDto(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:maptool.TerrainModifierOperationDto)
}

