// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

public interface LightSourceListDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.LightSourceListDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .maptool.LightSourceDto light_sources = 1;</code>
   */
  java.util.List<net.rptools.maptool.server.proto.LightSourceDto> 
      getLightSourcesList();
  /**
   * <code>repeated .maptool.LightSourceDto light_sources = 1;</code>
   */
  net.rptools.maptool.server.proto.LightSourceDto getLightSources(int index);
  /**
   * <code>repeated .maptool.LightSourceDto light_sources = 1;</code>
   */
  int getLightSourcesCount();
  /**
   * <code>repeated .maptool.LightSourceDto light_sources = 1;</code>
   */
  java.util.List<? extends net.rptools.maptool.server.proto.LightSourceDtoOrBuilder> 
      getLightSourcesOrBuilderList();
  /**
   * <code>repeated .maptool.LightSourceDto light_sources = 1;</code>
   */
  net.rptools.maptool.server.proto.LightSourceDtoOrBuilder getLightSourcesOrBuilder(
      int index);
}