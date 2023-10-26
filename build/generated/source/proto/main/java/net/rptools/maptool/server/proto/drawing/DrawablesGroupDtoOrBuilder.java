// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: drawing_dto.proto

package net.rptools.maptool.server.proto.drawing;

public interface DrawablesGroupDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.DrawablesGroupDto)
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
   * <code>repeated .maptool.DrawnElementDto drawn_elements = 4;</code>
   */
  java.util.List<net.rptools.maptool.server.proto.drawing.DrawnElementDto> 
      getDrawnElementsList();
  /**
   * <code>repeated .maptool.DrawnElementDto drawn_elements = 4;</code>
   */
  net.rptools.maptool.server.proto.drawing.DrawnElementDto getDrawnElements(int index);
  /**
   * <code>repeated .maptool.DrawnElementDto drawn_elements = 4;</code>
   */
  int getDrawnElementsCount();
  /**
   * <code>repeated .maptool.DrawnElementDto drawn_elements = 4;</code>
   */
  java.util.List<? extends net.rptools.maptool.server.proto.drawing.DrawnElementDtoOrBuilder> 
      getDrawnElementsOrBuilderList();
  /**
   * <code>repeated .maptool.DrawnElementDto drawn_elements = 4;</code>
   */
  net.rptools.maptool.server.proto.drawing.DrawnElementDtoOrBuilder getDrawnElementsOrBuilder(
      int index);
}