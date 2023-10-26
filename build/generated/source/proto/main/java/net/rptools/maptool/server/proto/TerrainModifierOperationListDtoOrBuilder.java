// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

public interface TerrainModifierOperationListDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.TerrainModifierOperationListDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .maptool.TerrainModifierOperationDto modifiers = 1;</code>
   * @return A list containing the modifiers.
   */
  java.util.List<net.rptools.maptool.server.proto.TerrainModifierOperationDto> getModifiersList();
  /**
   * <code>repeated .maptool.TerrainModifierOperationDto modifiers = 1;</code>
   * @return The count of modifiers.
   */
  int getModifiersCount();
  /**
   * <code>repeated .maptool.TerrainModifierOperationDto modifiers = 1;</code>
   * @param index The index of the element to return.
   * @return The modifiers at the given index.
   */
  net.rptools.maptool.server.proto.TerrainModifierOperationDto getModifiers(int index);
  /**
   * <code>repeated .maptool.TerrainModifierOperationDto modifiers = 1;</code>
   * @return A list containing the enum numeric values on the wire for modifiers.
   */
  java.util.List<java.lang.Integer>
  getModifiersValueList();
  /**
   * <code>repeated .maptool.TerrainModifierOperationDto modifiers = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of modifiers at the given index.
   */
  int getModifiersValue(int index);
}
