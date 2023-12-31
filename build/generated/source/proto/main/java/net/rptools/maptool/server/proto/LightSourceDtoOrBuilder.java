// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

public interface LightSourceDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.LightSourceDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .maptool.LightDto lights = 1;</code>
   */
  java.util.List<net.rptools.maptool.server.proto.LightDto> 
      getLightsList();
  /**
   * <code>repeated .maptool.LightDto lights = 1;</code>
   */
  net.rptools.maptool.server.proto.LightDto getLights(int index);
  /**
   * <code>repeated .maptool.LightDto lights = 1;</code>
   */
  int getLightsCount();
  /**
   * <code>repeated .maptool.LightDto lights = 1;</code>
   */
  java.util.List<? extends net.rptools.maptool.server.proto.LightDtoOrBuilder> 
      getLightsOrBuilderList();
  /**
   * <code>repeated .maptool.LightDto lights = 1;</code>
   */
  net.rptools.maptool.server.proto.LightDtoOrBuilder getLightsOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.StringValue name = 2;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>.google.protobuf.StringValue name = 2;</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <code>.google.protobuf.StringValue name = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <code>.google.protobuf.StringValue id = 3;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.google.protobuf.StringValue id = 3;</code>
   * @return The id.
   */
  com.google.protobuf.StringValue getId();
  /**
   * <code>.google.protobuf.StringValue id = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getIdOrBuilder();

  /**
   * <code>.maptool.LightSourceDto.LightTypeDto type = 4;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.maptool.LightSourceDto.LightTypeDto type = 4;</code>
   * @return The type.
   */
  net.rptools.maptool.server.proto.LightSourceDto.LightTypeDto getType();

  /**
   * <code>bool scale_with_token = 5;</code>
   * @return The scaleWithToken.
   */
  boolean getScaleWithToken();
}
