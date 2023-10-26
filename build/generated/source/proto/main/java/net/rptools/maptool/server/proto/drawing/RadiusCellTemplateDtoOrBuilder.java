// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: drawing_dto.proto

package net.rptools.maptool.server.proto.drawing;

public interface RadiusCellTemplateDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.RadiusCellTemplateDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string layer = 2;</code>
   * @return The layer.
   */
  java.lang.String getLayer();
  /**
   * <code>string layer = 2;</code>
   * @return The bytes for layer.
   */
  com.google.protobuf.ByteString
      getLayerBytes();

  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <code>string zoneId = 4;</code>
   * @return The zoneId.
   */
  java.lang.String getZoneId();
  /**
   * <code>string zoneId = 4;</code>
   * @return The bytes for zoneId.
   */
  com.google.protobuf.ByteString
      getZoneIdBytes();

  /**
   * <code>.maptool.IntPointDto vertex = 5;</code>
   * @return Whether the vertex field is set.
   */
  boolean hasVertex();
  /**
   * <code>.maptool.IntPointDto vertex = 5;</code>
   * @return The vertex.
   */
  net.rptools.maptool.server.proto.drawing.IntPointDto getVertex();
  /**
   * <code>.maptool.IntPointDto vertex = 5;</code>
   */
  net.rptools.maptool.server.proto.drawing.IntPointDtoOrBuilder getVertexOrBuilder();

  /**
   * <code>int32 radius = 6;</code>
   * @return The radius.
   */
  int getRadius();
}
