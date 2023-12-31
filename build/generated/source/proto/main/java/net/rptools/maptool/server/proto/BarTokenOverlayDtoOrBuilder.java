// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

public interface BarTokenOverlayDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.BarTokenOverlayDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.maptool.TokenOverlayDto common = 1;</code>
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   * <code>.maptool.TokenOverlayDto common = 1;</code>
   * @return The common.
   */
  net.rptools.maptool.server.proto.TokenOverlayDto getCommon();
  /**
   * <code>.maptool.TokenOverlayDto common = 1;</code>
   */
  net.rptools.maptool.server.proto.TokenOverlayDtoOrBuilder getCommonOrBuilder();

  /**
   * <code>int32 increments = 2;</code>
   * @return The increments.
   */
  int getIncrements();

  /**
   * <code>.maptool.BarTokenOverlayDto.SideDto side = 3;</code>
   * @return The enum numeric value on the wire for side.
   */
  int getSideValue();
  /**
   * <code>.maptool.BarTokenOverlayDto.SideDto side = 3;</code>
   * @return The side.
   */
  net.rptools.maptool.server.proto.BarTokenOverlayDto.SideDto getSide();

  /**
   * <code>repeated string asset_ids = 4;</code>
   * @return A list containing the assetIds.
   */
  java.util.List<java.lang.String>
      getAssetIdsList();
  /**
   * <code>repeated string asset_ids = 4;</code>
   * @return The count of assetIds.
   */
  int getAssetIdsCount();
  /**
   * <code>repeated string asset_ids = 4;</code>
   * @param index The index of the element to return.
   * @return The assetIds at the given index.
   */
  java.lang.String getAssetIds(int index);
  /**
   * <code>repeated string asset_ids = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the assetIds at the given index.
   */
  com.google.protobuf.ByteString
      getAssetIdsBytes(int index);

  /**
   * <code>int32 color = 5;</code>
   * @return The color.
   */
  int getColor();

  /**
   * <code>int32 bg_color = 6;</code>
   * @return The bgColor.
   */
  int getBgColor();

  /**
   * <code>int32 thickness = 7;</code>
   * @return The thickness.
   */
  int getThickness();

  /**
   * <code>.maptool.BarTokenOverlayDto.BarTokenOverlayTypeDto type = 8;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.maptool.BarTokenOverlayDto.BarTokenOverlayTypeDto type = 8;</code>
   * @return The type.
   */
  net.rptools.maptool.server.proto.BarTokenOverlayDto.BarTokenOverlayTypeDto getType();
}
