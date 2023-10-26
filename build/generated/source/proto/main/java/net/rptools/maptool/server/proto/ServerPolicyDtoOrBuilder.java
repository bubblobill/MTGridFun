// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data_transfer_objects.proto

package net.rptools.maptool.server.proto;

public interface ServerPolicyDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.ServerPolicyDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool use_strict_token_management = 1;</code>
   * @return The useStrictTokenManagement.
   */
  boolean getUseStrictTokenManagement();

  /**
   * <code>bool is_movement_locked = 2;</code>
   * @return The isMovementLocked.
   */
  boolean getIsMovementLocked();

  /**
   * <code>bool is_token_editor_locked = 3;</code>
   * @return The isTokenEditorLocked.
   */
  boolean getIsTokenEditorLocked();

  /**
   * <code>bool players_can_reveal_vision = 4;</code>
   * @return The playersCanRevealVision.
   */
  boolean getPlayersCanRevealVision();

  /**
   * <code>bool gm_reveals_vision_for_unowned_tokens = 5;</code>
   * @return The gmRevealsVisionForUnownedTokens.
   */
  boolean getGmRevealsVisionForUnownedTokens();

  /**
   * <code>bool use_individual_views = 6;</code>
   * @return The useIndividualViews.
   */
  boolean getUseIndividualViews();

  /**
   * <code>bool restricted_impersonation = 7;</code>
   * @return The restrictedImpersonation.
   */
  boolean getRestrictedImpersonation();

  /**
   * <code>bool players_receive_campaign_macros = 8;</code>
   * @return The playersReceiveCampaignMacros.
   */
  boolean getPlayersReceiveCampaignMacros();

  /**
   * <code>bool use_tool_tips_for_default_roll_format = 9;</code>
   * @return The useToolTipsForDefaultRollFormat.
   */
  boolean getUseToolTipsForDefaultRollFormat();

  /**
   * <code>bool use_individual_FOW = 10;</code>
   * @return The useIndividualFOW.
   */
  boolean getUseIndividualFOW();

  /**
   * <code>bool is_auto_reveal_on_movement = 11;</code>
   * @return The isAutoRevealOnMovement.
   */
  boolean getIsAutoRevealOnMovement();

  /**
   * <code>bool include_owned_NPCs = 12;</code>
   * @return The includeOwnedNPCs.
   */
  boolean getIncludeOwnedNPCs();

  /**
   * <code>.maptool.WalkerMetricDto movement_metric = 13;</code>
   * @return The enum numeric value on the wire for movementMetric.
   */
  int getMovementMetricValue();
  /**
   * <code>.maptool.WalkerMetricDto movement_metric = 13;</code>
   * @return The movementMetric.
   */
  net.rptools.maptool.server.proto.WalkerMetricDto getMovementMetric();

  /**
   * <code>bool using_astar_pathfinding = 14;</code>
   * @return The usingAstarPathfinding.
   */
  boolean getUsingAstarPathfinding();

  /**
   * <code>bool vbl_blocks_move = 15;</code>
   * @return The vblBlocksMove.
   */
  boolean getVblBlocksMove();

  /**
   * <code>bool hide_map_select_ui = 16;</code>
   * @return The hideMapSelectUi.
   */
  boolean getHideMapSelectUi();

  /**
   * <code>bool lock_player_library = 17;</code>
   * @return The lockPlayerLibrary.
   */
  boolean getLockPlayerLibrary();
}
