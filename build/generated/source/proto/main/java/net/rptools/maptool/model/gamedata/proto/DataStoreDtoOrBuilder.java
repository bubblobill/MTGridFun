// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gamedata.proto

package net.rptools.maptool.model.gamedata.proto;

public interface DataStoreDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.DataStoreDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string data_store_type = 1;</code>
   * @return The dataStoreType.
   */
  java.lang.String getDataStoreType();
  /**
   * <code>string data_store_type = 1;</code>
   * @return The bytes for dataStoreType.
   */
  com.google.protobuf.ByteString
      getDataStoreTypeBytes();

  /**
   * <code>repeated .maptool.GameDataDto data = 2;</code>
   */
  java.util.List<net.rptools.maptool.model.gamedata.proto.GameDataDto> 
      getDataList();
  /**
   * <code>repeated .maptool.GameDataDto data = 2;</code>
   */
  net.rptools.maptool.model.gamedata.proto.GameDataDto getData(int index);
  /**
   * <code>repeated .maptool.GameDataDto data = 2;</code>
   */
  int getDataCount();
  /**
   * <code>repeated .maptool.GameDataDto data = 2;</code>
   */
  java.util.List<? extends net.rptools.maptool.model.gamedata.proto.GameDataDtoOrBuilder> 
      getDataOrBuilderList();
  /**
   * <code>repeated .maptool.GameDataDto data = 2;</code>
   */
  net.rptools.maptool.model.gamedata.proto.GameDataDtoOrBuilder getDataOrBuilder(
      int index);
}