// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

public interface StrokeDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.StrokeDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float width = 1;</code>
   * @return The width.
   */
  float getWidth();

  /**
   * <code>.maptool.StrokeDto.CapDto cap = 2;</code>
   * @return The enum numeric value on the wire for cap.
   */
  int getCapValue();
  /**
   * <code>.maptool.StrokeDto.CapDto cap = 2;</code>
   * @return The cap.
   */
  net.rptools.maptool.server.proto.StrokeDto.CapDto getCap();

  /**
   * <code>.maptool.StrokeDto.JoinDto join = 3;</code>
   * @return The enum numeric value on the wire for join.
   */
  int getJoinValue();
  /**
   * <code>.maptool.StrokeDto.JoinDto join = 3;</code>
   * @return The join.
   */
  net.rptools.maptool.server.proto.StrokeDto.JoinDto getJoin();
}
