// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf enum {@code maptool.ShapeTypeDto}
 */
public enum ShapeTypeDto
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SQUARE = 0;</code>
   */
  SQUARE(0),
  /**
   * <code>CIRCLE = 1;</code>
   */
  CIRCLE(1),
  /**
   * <code>CONE = 2;</code>
   */
  CONE(2),
  /**
   * <code>HEX = 3;</code>
   */
  HEX(3),
  /**
   * <code>GRID = 4;</code>
   */
  GRID(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SQUARE = 0;</code>
   */
  public static final int SQUARE_VALUE = 0;
  /**
   * <code>CIRCLE = 1;</code>
   */
  public static final int CIRCLE_VALUE = 1;
  /**
   * <code>CONE = 2;</code>
   */
  public static final int CONE_VALUE = 2;
  /**
   * <code>HEX = 3;</code>
   */
  public static final int HEX_VALUE = 3;
  /**
   * <code>GRID = 4;</code>
   */
  public static final int GRID_VALUE = 4;


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
  public static ShapeTypeDto valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ShapeTypeDto forNumber(int value) {
    switch (value) {
      case 0: return SQUARE;
      case 1: return CIRCLE;
      case 2: return CONE;
      case 3: return HEX;
      case 4: return GRID;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ShapeTypeDto>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ShapeTypeDto> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ShapeTypeDto>() {
          public ShapeTypeDto findValueByNumber(int number) {
            return ShapeTypeDto.forNumber(number);
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
    return net.rptools.maptool.server.proto.DataTranferObjectProtos.getDescriptor().getEnumTypes().get(0);
  }

  private static final ShapeTypeDto[] VALUES = values();

  public static ShapeTypeDto valueOf(
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

  private ShapeTypeDto(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:maptool.ShapeTypeDto)
}
