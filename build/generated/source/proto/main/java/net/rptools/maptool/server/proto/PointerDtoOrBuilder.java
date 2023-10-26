// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

public interface PointerDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.PointerDto)
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
   * <code>double direction = 3;</code>
   * @return The direction.
   */
  double getDirection();

  /**
   * <code>string type = 4;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 4;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}