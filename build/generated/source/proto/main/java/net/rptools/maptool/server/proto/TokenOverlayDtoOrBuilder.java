// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

public interface TokenOverlayDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.TokenOverlayDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 order = 2;</code>
   * @return The order.
   */
  int getOrder();

  /**
   * <code>.google.protobuf.StringValue group = 3;</code>
   * @return Whether the group field is set.
   */
  boolean hasGroup();
  /**
   * <code>.google.protobuf.StringValue group = 3;</code>
   * @return The group.
   */
  com.google.protobuf.StringValue getGroup();
  /**
   * <code>.google.protobuf.StringValue group = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getGroupOrBuilder();

  /**
   * <code>bool mouse_over = 4;</code>
   * @return The mouseOver.
   */
  boolean getMouseOver();

  /**
   * <code>int32 opacity = 5;</code>
   * @return The opacity.
   */
  int getOpacity();

  /**
   * <code>bool show_gm = 6;</code>
   * @return The showGm.
   */
  boolean getShowGm();

  /**
   * <code>bool show_owner = 7;</code>
   * @return The showOwner.
   */
  boolean getShowOwner();

  /**
   * <code>bool show_others = 8;</code>
   * @return The showOthers.
   */
  boolean getShowOthers();
}