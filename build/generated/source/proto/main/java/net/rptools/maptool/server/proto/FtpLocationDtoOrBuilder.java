// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

public interface FtpLocationDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.FtpLocationDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_name = 1;</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <code>string user_name = 1;</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>string host_name = 2;</code>
   * @return The hostName.
   */
  java.lang.String getHostName();
  /**
   * <code>string host_name = 2;</code>
   * @return The bytes for hostName.
   */
  com.google.protobuf.ByteString
      getHostNameBytes();

  /**
   * <code>string path = 3;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <code>string path = 3;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <code>bool binary = 4;</code>
   * @return The binary.
   */
  boolean getBinary();
}
