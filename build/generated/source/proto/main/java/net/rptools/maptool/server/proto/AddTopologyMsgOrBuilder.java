// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message_types.proto

package net.rptools.maptool.server.proto;

public interface AddTopologyMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.AddTopologyMsg)
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
   * <code>.maptool.AreaDto area = 2;</code>
   * @return Whether the area field is set.
   */
  boolean hasArea();
  /**
   * <code>.maptool.AreaDto area = 2;</code>
   * @return The area.
   */
  net.rptools.maptool.server.proto.drawing.AreaDto getArea();
  /**
   * <code>.maptool.AreaDto area = 2;</code>
   */
  net.rptools.maptool.server.proto.drawing.AreaDtoOrBuilder getAreaOrBuilder();

  /**
   * <code>.maptool.TopologyTypeDto type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.maptool.TopologyTypeDto type = 3;</code>
   * @return The type.
   */
  net.rptools.maptool.server.proto.TopologyTypeDto getType();
}
