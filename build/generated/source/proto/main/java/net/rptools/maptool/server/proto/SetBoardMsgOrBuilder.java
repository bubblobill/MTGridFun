// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message_types.proto

package net.rptools.maptool.server.proto;

public interface SetBoardMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.SetBoardMsg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string zone_guid = 1;</code>
   * @return The zoneGuid.
   */
  java.lang.String getZoneGuid();
  /**
   * <code>string zone_guid = 1;</code>
   * @return The bytes for zoneGuid.
   */
  com.google.protobuf.ByteString
      getZoneGuidBytes();

  /**
   * <code>.maptool.IntPointDto point = 2;</code>
   * @return Whether the point field is set.
   */
  boolean hasPoint();
  /**
   * <code>.maptool.IntPointDto point = 2;</code>
   * @return The point.
   */
  net.rptools.maptool.server.proto.drawing.IntPointDto getPoint();
  /**
   * <code>.maptool.IntPointDto point = 2;</code>
   */
  net.rptools.maptool.server.proto.drawing.IntPointDtoOrBuilder getPointOrBuilder();

  /**
   * <code>string asset_id = 3;</code>
   * @return The assetId.
   */
  java.lang.String getAssetId();
  /**
   * <code>string asset_id = 3;</code>
   * @return The bytes for assetId.
   */
  com.google.protobuf.ByteString
      getAssetIdBytes();
}
