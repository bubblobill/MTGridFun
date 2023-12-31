// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: handshake.proto

package net.rptools.maptool.server.proto;

/**
 * Protobuf enum {@code maptool.AuthTypeEnum}
 */
public enum AuthTypeEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SHARED_PASSWORD = 0;</code>
   */
  SHARED_PASSWORD(0),
  /**
   * <code>ASYMMETRIC_KEY = 1;</code>
   */
  ASYMMETRIC_KEY(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SHARED_PASSWORD = 0;</code>
   */
  public static final int SHARED_PASSWORD_VALUE = 0;
  /**
   * <code>ASYMMETRIC_KEY = 1;</code>
   */
  public static final int ASYMMETRIC_KEY_VALUE = 1;


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
  public static AuthTypeEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AuthTypeEnum forNumber(int value) {
    switch (value) {
      case 0: return SHARED_PASSWORD;
      case 1: return ASYMMETRIC_KEY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AuthTypeEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AuthTypeEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AuthTypeEnum>() {
          public AuthTypeEnum findValueByNumber(int number) {
            return AuthTypeEnum.forNumber(number);
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
    return net.rptools.maptool.server.proto.HandshakeProtos.getDescriptor().getEnumTypes().get(1);
  }

  private static final AuthTypeEnum[] VALUES = values();

  public static AuthTypeEnum valueOf(
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

  private AuthTypeEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:maptool.AuthTypeEnum)
}

