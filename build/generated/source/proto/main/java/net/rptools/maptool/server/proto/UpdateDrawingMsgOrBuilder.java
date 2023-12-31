// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message_types.proto

package net.rptools.maptool.server.proto;

public interface UpdateDrawingMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.UpdateDrawingMsg)
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
   * <code>.maptool.PenDto pen = 2;</code>
   * @return Whether the pen field is set.
   */
  boolean hasPen();
  /**
   * <code>.maptool.PenDto pen = 2;</code>
   * @return The pen.
   */
  net.rptools.maptool.server.proto.drawing.PenDto getPen();
  /**
   * <code>.maptool.PenDto pen = 2;</code>
   */
  net.rptools.maptool.server.proto.drawing.PenDtoOrBuilder getPenOrBuilder();

  /**
   * <code>.maptool.DrawnElementDto drawing = 3;</code>
   * @return Whether the drawing field is set.
   */
  boolean hasDrawing();
  /**
   * <code>.maptool.DrawnElementDto drawing = 3;</code>
   * @return The drawing.
   */
  net.rptools.maptool.server.proto.drawing.DrawnElementDto getDrawing();
  /**
   * <code>.maptool.DrawnElementDto drawing = 3;</code>
   */
  net.rptools.maptool.server.proto.drawing.DrawnElementDtoOrBuilder getDrawingOrBuilder();
}
