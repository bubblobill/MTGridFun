// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

public interface HeroLabDataDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.HeroLabDataDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.StringValue hero_lab_statblock_asset_id = 1;</code>
   * @return Whether the heroLabStatblockAssetId field is set.
   */
  boolean hasHeroLabStatblockAssetId();
  /**
   * <code>.google.protobuf.StringValue hero_lab_statblock_asset_id = 1;</code>
   * @return The heroLabStatblockAssetId.
   */
  com.google.protobuf.StringValue getHeroLabStatblockAssetId();
  /**
   * <code>.google.protobuf.StringValue hero_lab_statblock_asset_id = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getHeroLabStatblockAssetIdOrBuilder();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.google.protobuf.StringValue summary = 3;</code>
   * @return Whether the summary field is set.
   */
  boolean hasSummary();
  /**
   * <code>.google.protobuf.StringValue summary = 3;</code>
   * @return The summary.
   */
  com.google.protobuf.StringValue getSummary();
  /**
   * <code>.google.protobuf.StringValue summary = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getSummaryOrBuilder();

  /**
   * <code>.google.protobuf.StringValue player_name = 4;</code>
   * @return Whether the playerName field is set.
   */
  boolean hasPlayerName();
  /**
   * <code>.google.protobuf.StringValue player_name = 4;</code>
   * @return The playerName.
   */
  com.google.protobuf.StringValue getPlayerName();
  /**
   * <code>.google.protobuf.StringValue player_name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPlayerNameOrBuilder();

  /**
   * <code>.google.protobuf.StringValue game_system = 5;</code>
   * @return Whether the gameSystem field is set.
   */
  boolean hasGameSystem();
  /**
   * <code>.google.protobuf.StringValue game_system = 5;</code>
   * @return The gameSystem.
   */
  com.google.protobuf.StringValue getGameSystem();
  /**
   * <code>.google.protobuf.StringValue game_system = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getGameSystemOrBuilder();

  /**
   * <code>.google.protobuf.StringValue hero_lab_index = 6;</code>
   * @return Whether the heroLabIndex field is set.
   */
  boolean hasHeroLabIndex();
  /**
   * <code>.google.protobuf.StringValue hero_lab_index = 6;</code>
   * @return The heroLabIndex.
   */
  com.google.protobuf.StringValue getHeroLabIndex();
  /**
   * <code>.google.protobuf.StringValue hero_lab_index = 6;</code>
   */
  com.google.protobuf.StringValueOrBuilder getHeroLabIndexOrBuilder();

  /**
   * <code>.google.protobuf.StringValue minion_master_index = 7;</code>
   * @return Whether the minionMasterIndex field is set.
   */
  boolean hasMinionMasterIndex();
  /**
   * <code>.google.protobuf.StringValue minion_master_index = 7;</code>
   * @return The minionMasterIndex.
   */
  com.google.protobuf.StringValue getMinionMasterIndex();
  /**
   * <code>.google.protobuf.StringValue minion_master_index = 7;</code>
   */
  com.google.protobuf.StringValueOrBuilder getMinionMasterIndexOrBuilder();

  /**
   * <code>.google.protobuf.StringValue minion_master_name = 8;</code>
   * @return Whether the minionMasterName field is set.
   */
  boolean hasMinionMasterName();
  /**
   * <code>.google.protobuf.StringValue minion_master_name = 8;</code>
   * @return The minionMasterName.
   */
  com.google.protobuf.StringValue getMinionMasterName();
  /**
   * <code>.google.protobuf.StringValue minion_master_name = 8;</code>
   */
  com.google.protobuf.StringValueOrBuilder getMinionMasterNameOrBuilder();

  /**
   * <code>bool is_ally = 9;</code>
   * @return The isAlly.
   */
  boolean getIsAlly();

  /**
   * <code>bool is_dirty = 10;</code>
   * @return The isDirty.
   */
  boolean getIsDirty();

  /**
   * <code>bool is_minion = 11;</code>
   * @return The isMinion.
   */
  boolean getIsMinion();

  /**
   * <code>.google.protobuf.StringValue portfolio_path = 12;</code>
   * @return Whether the portfolioPath field is set.
   */
  boolean hasPortfolioPath();
  /**
   * <code>.google.protobuf.StringValue portfolio_path = 12;</code>
   * @return The portfolioPath.
   */
  com.google.protobuf.StringValue getPortfolioPath();
  /**
   * <code>.google.protobuf.StringValue portfolio_path = 12;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPortfolioPathOrBuilder();

  /**
   * <code>map&lt;string, string&gt; hero_image_assets = 13;</code>
   */
  int getHeroImageAssetsCount();
  /**
   * <code>map&lt;string, string&gt; hero_image_assets = 13;</code>
   */
  boolean containsHeroImageAssets(
      java.lang.String key);
  /**
   * Use {@link #getHeroImageAssetsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getHeroImageAssets();
  /**
   * <code>map&lt;string, string&gt; hero_image_assets = 13;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getHeroImageAssetsMap();
  /**
   * <code>map&lt;string, string&gt; hero_image_assets = 13;</code>
   */

  /* nullable */
java.lang.String getHeroImageAssetsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; hero_image_assets = 13;</code>
   */

  java.lang.String getHeroImageAssetsOrThrow(
      java.lang.String key);

  /**
   * <code>.google.protobuf.StringValue portfolio_file = 14;</code>
   * @return Whether the portfolioFile field is set.
   */
  boolean hasPortfolioFile();
  /**
   * <code>.google.protobuf.StringValue portfolio_file = 14;</code>
   * @return The portfolioFile.
   */
  com.google.protobuf.StringValue getPortfolioFile();
  /**
   * <code>.google.protobuf.StringValue portfolio_file = 14;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPortfolioFileOrBuilder();
}
