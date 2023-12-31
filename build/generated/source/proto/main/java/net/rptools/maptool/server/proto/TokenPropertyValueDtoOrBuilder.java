// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

public interface TokenPropertyValueDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.TokenPropertyValueDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 int_value = 1;</code>
   * @return Whether the intValue field is set.
   */
  boolean hasIntValue();
  /**
   * <code>int32 int_value = 1;</code>
   * @return The intValue.
   */
  int getIntValue();

  /**
   * <code>bool bool_value = 2;</code>
   * @return Whether the boolValue field is set.
   */
  boolean hasBoolValue();
  /**
   * <code>bool bool_value = 2;</code>
   * @return The boolValue.
   */
  boolean getBoolValue();

  /**
   * <code>string string_value = 3;</code>
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   * <code>string string_value = 3;</code>
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   * <code>string string_value = 3;</code>
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <code>double double_value = 4;</code>
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();
  /**
   * <code>double double_value = 4;</code>
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   * <code>.maptool.MacroButtonPropertiesListDto macros = 5;</code>
   * @return Whether the macros field is set.
   */
  boolean hasMacros();
  /**
   * <code>.maptool.MacroButtonPropertiesListDto macros = 5;</code>
   * @return The macros.
   */
  net.rptools.maptool.server.proto.MacroButtonPropertiesListDto getMacros();
  /**
   * <code>.maptool.MacroButtonPropertiesListDto macros = 5;</code>
   */
  net.rptools.maptool.server.proto.MacroButtonPropertiesListDtoOrBuilder getMacrosOrBuilder();

  /**
   * <code>.maptool.LightSourceDto light_source = 6;</code>
   * @return Whether the lightSource field is set.
   */
  boolean hasLightSource();
  /**
   * <code>.maptool.LightSourceDto light_source = 6;</code>
   * @return The lightSource.
   */
  net.rptools.maptool.server.proto.LightSourceDto getLightSource();
  /**
   * <code>.maptool.LightSourceDto light_source = 6;</code>
   */
  net.rptools.maptool.server.proto.LightSourceDtoOrBuilder getLightSourceOrBuilder();

  /**
   * <code>.maptool.AreaDto area = 7;</code>
   * @return Whether the area field is set.
   */
  boolean hasArea();
  /**
   * <code>.maptool.AreaDto area = 7;</code>
   * @return The area.
   */
  net.rptools.maptool.server.proto.drawing.AreaDto getArea();
  /**
   * <code>.maptool.AreaDto area = 7;</code>
   */
  net.rptools.maptool.server.proto.drawing.AreaDtoOrBuilder getAreaOrBuilder();

  /**
   * <code>.maptool.StringListDto string_values = 8;</code>
   * @return Whether the stringValues field is set.
   */
  boolean hasStringValues();
  /**
   * <code>.maptool.StringListDto string_values = 8;</code>
   * @return The stringValues.
   */
  net.rptools.maptool.server.proto.StringListDto getStringValues();
  /**
   * <code>.maptool.StringListDto string_values = 8;</code>
   */
  net.rptools.maptool.server.proto.StringListDtoOrBuilder getStringValuesOrBuilder();

  /**
   * <code>.maptool.GridDto grid = 9;</code>
   * @return Whether the grid field is set.
   */
  boolean hasGrid();
  /**
   * <code>.maptool.GridDto grid = 9;</code>
   * @return The grid.
   */
  net.rptools.maptool.server.proto.GridDto getGrid();
  /**
   * <code>.maptool.GridDto grid = 9;</code>
   */
  net.rptools.maptool.server.proto.GridDtoOrBuilder getGridOrBuilder();

  /**
   * <code>.maptool.TokenFootPrintDto token_foot_print = 10;</code>
   * @return Whether the tokenFootPrint field is set.
   */
  boolean hasTokenFootPrint();
  /**
   * <code>.maptool.TokenFootPrintDto token_foot_print = 10;</code>
   * @return The tokenFootPrint.
   */
  net.rptools.maptool.server.proto.TokenFootPrintDto getTokenFootPrint();
  /**
   * <code>.maptool.TokenFootPrintDto token_foot_print = 10;</code>
   */
  net.rptools.maptool.server.proto.TokenFootPrintDtoOrBuilder getTokenFootPrintOrBuilder();

  /**
   * <code>string topology_type = 11;</code>
   * @return Whether the topologyType field is set.
   */
  boolean hasTopologyType();
  /**
   * <code>string topology_type = 11;</code>
   * @return The topologyType.
   */
  java.lang.String getTopologyType();
  /**
   * <code>string topology_type = 11;</code>
   * @return The bytes for topologyType.
   */
  com.google.protobuf.ByteString
      getTopologyTypeBytes();

  public net.rptools.maptool.server.proto.TokenPropertyValueDto.ValueTypeCase getValueTypeCase();
}
