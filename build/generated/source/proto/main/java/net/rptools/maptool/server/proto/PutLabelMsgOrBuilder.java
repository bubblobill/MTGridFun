// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message_types.proto

package net.rptools.maptool.server.proto;

public interface PutLabelMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.PutLabelMsg)
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
   * <code>.maptool.LabelDto label = 2;</code>
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   * <code>.maptool.LabelDto label = 2;</code>
   * @return The label.
   */
  net.rptools.maptool.server.proto.LabelDto getLabel();
  /**
   * <code>.maptool.LabelDto label = 2;</code>
   */
  net.rptools.maptool.server.proto.LabelDtoOrBuilder getLabelOrBuilder();
}
