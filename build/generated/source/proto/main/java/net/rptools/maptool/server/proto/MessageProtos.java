// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package net.rptools.maptool.server.proto;

public final class MessageProtos {
  private MessageProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_maptool_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maptool_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmessage.proto\022\007maptool\032\023message_types." +
      "proto\"\375!\n\007Message\0223\n\020add_topology_msg\030\001 " +
      "\001(\0132\027.maptool.AddTopologyMsgH\000\0221\n\017boot_p" +
      "layer_msg\030\002 \001(\0132\026.maptool.BootPlayerMsgH" +
      "\000\022C\n\031bring_tokens_to_front_msg\030\003 \001(\0132\036.m" +
      "aptool.BringTokensToFrontMsgH\000\022I\n\034change" +
      "_zone_display_name_msg\030\004 \001(\0132!.maptool.C" +
      "hangeZoneDisplayNameMsgH\000\022>\n\026clear_all_d" +
      "rawings_msg\030\005 \001(\0132\034.maptool.ClearAllDraw" +
      "ingsMsgH\000\022>\n\026clear_exposed_area_msg\030\006 \001(" +
      "\0132\034.maptool.ClearExposedAreaMsgH\000\022$\n\010dra" +
      "w_msg\030\007 \001(\0132\020.maptool.DrawMsgH\000\022/\n\016edit_" +
      "token_msg\030\010 \001(\0132\025.maptool.EditTokenMsgH\000" +
      "\022C\n\030enforce_notification_msg\030\t \001(\0132\037.map" +
      "tool.EnforceNotificationMsgH\000\0223\n\020enforce" +
      "_zone_msg\030\n \001(\0132\027.maptool.EnforceZoneMsg" +
      "H\000\022<\n\025enforce_zone_view_msg\030\013 \001(\0132\033.mapt" +
      "ool.EnforceZoneViewMsgH\000\0225\n\021exec_functio" +
      "n_msg\030\014 \001(\0132\030.maptool.ExecFunctionMsgH\000\022" +
      "-\n\rexec_link_msg\030\r \001(\0132\024.maptool.ExecLin" +
      "kMsgH\000\022/\n\016expose_fow_msg\030\016 \001(\0132\025.maptool" +
      ".ExposeFowMsgH\000\0226\n\022expose_pc_area_msg\030\017 " +
      "\001(\0132\030.maptool.ExposePcAreaMsgH\000\022-\n\rget_a" +
      "sset_msg\030\020 \001(\0132\024.maptool.GetAssetMsgH\000\022+" +
      "\n\014get_zone_msg\030\021 \001(\0132\023.maptool.GetZoneMs" +
      "gH\000\022.\n\rheartbeat_msg\030\022 \001(\0132\025.maptool.Hea" +
      "rtbeatMsgH\000\022+\n\014hide_fow_msg\030\023 \001(\0132\023.mapt" +
      "ool.HideFowMsgH\000\0223\n\020hide_pointer_msg\030\024 \001" +
      "(\0132\027.maptool.HidePointerMsgH\000\022*\n\013message" +
      "_msg\030\025 \001(\0132\023.maptool.MessageMsgH\000\0223\n\020mov" +
      "e_pointer_msg\030\026 \001(\0132\027.maptool.MovePointe" +
      "rMsgH\000\022;\n\024player_connected_msg\030\027 \001(\0132\033.m" +
      "aptool.PlayerConnectedMsgH\000\022A\n\027player_di" +
      "sconnected_msg\030\030 \001(\0132\036.maptool.PlayerDis" +
      "connectedMsgH\000\022-\n\rput_asset_msg\030\031 \001(\0132\024." +
      "maptool.PutAssetMsgH\000\022-\n\rput_label_msg\030\032" +
      " \001(\0132\024.maptool.PutLabelMsgH\000\022-\n\rput_toke" +
      "n_msg\030\033 \001(\0132\024.maptool.PutTokenMsgH\000\022+\n\014p" +
      "ut_zone_msg\030\034 \001(\0132\023.maptool.PutZoneMsgH\000" +
      "\0223\n\020remove_asset_msg\030\035 \001(\0132\027.maptool.Rem" +
      "oveAssetMsgH\000\0223\n\020remove_label_msg\030\036 \001(\0132" +
      "\027.maptool.RemoveLabelMsgH\000\0223\n\020remove_tok" +
      "en_msg\030\037 \001(\0132\027.maptool.RemoveTokenMsgH\000\022" +
      "5\n\021remove_tokens_msg\030  \001(\0132\030.maptool.Rem" +
      "oveTokensMsgH\000\0229\n\023remove_topology_msg\030! " +
      "\001(\0132\032.maptool.RemoveTopologyMsgH\000\0221\n\017rem" +
      "ove_zone_msg\030\" \001(\0132\026.maptool.RemoveZoneM" +
      "sgH\000\0221\n\017rename_zone_msg\030# \001(\0132\026.maptool." +
      "RenameZoneMsgH\000\022<\n\025restore_zone_view_msg" +
      "\030$ \001(\0132\033.maptool.RestoreZoneViewMsgH\000\022?\n" +
      "\027send_tokens_to_back_msg\030% \001(\0132\034.maptool" +
      ".SendTokensToBackMsgH\000\022-\n\rset_board_msg\030" +
      "& \001(\0132\024.maptool.SetBoardMsgH\000\0223\n\020set_cam" +
      "paign_msg\030\' \001(\0132\027.maptool.SetCampaignMsg" +
      "H\000\022<\n\025set_campaign_name_msg\030( \001(\0132\033.mapt" +
      "ool.SetCampaignNameMsgH\000\022)\n\013set_fow_msg\030" +
      ") \001(\0132\022.maptool.SetFowMsgH\000\022C\n\031set_live_" +
      "typing_label_msg\030* \001(\0132\036.maptool.SetLive" +
      "TypingLabelMsgH\000\022>\n\026set_token_location_m" +
      "sg\030+ \001(\0132\034.maptool.SetTokenLocationMsgH\000" +
      "\022<\n\025set_server_policy_msg\030, \001(\0132\033.maptoo" +
      "l.SetServerPolicyMsgH\000\0228\n\023set_vision_typ" +
      "e_msg\030- \001(\0132\031.maptool.SetVisionTypeMsgH\000" +
      "\022=\n\026set_zone_grid_size_msg\030. \001(\0132\033.mapto" +
      "ol.SetZoneGridSizeMsgH\000\0229\n\024set_zone_has_" +
      "fow_msg\030/ \001(\0132\031.maptool.SetZoneHasFowMsg" +
      "H\000\022@\n\027set_zone_visibility_msg\0300 \001(\0132\035.ma" +
      "ptool.SetZoneVisibilityMsgH\000\0223\n\020show_poi" +
      "nter_msg\0301 \001(\0132\027.maptool.ShowPointerMsgH" +
      "\000\022B\n\030start_asset_transfer_msg\0302 \001(\0132\036.ma" +
      "ptool.StartAssetTransferMsgH\000\022:\n\024start_t" +
      "oken_move_msg\0303 \001(\0132\032.maptool.StartToken" +
      "MoveMsgH\000\0228\n\023stop_token_move_msg\0304 \001(\0132\031" +
      ".maptool.StopTokenMoveMsgH\000\022M\n\036toggle_to" +
      "ken_move_waypoint_msg\0305 \001(\0132#.maptool.To" +
      "ggleTokenMoveWaypointMsgH\000\022-\n\rundo_draw_" +
      "msg\0306 \001(\0132\024.maptool.UndoDrawMsgH\000\022D\n\031upd" +
      "ate_asset_transfer_msg\0307 \001(\0132\037.maptool.U" +
      "pdateAssetTransferMsgH\000\0229\n\023update_campai" +
      "gn_msg\0308 \001(\0132\032.maptool.UpdateCampaignMsg" +
      "H\000\022F\n\032update_campaign_macros_msg\0309 \001(\0132 " +
      ".maptool.UpdateCampaignMacrosMsgH\000\0227\n\022up" +
      "date_drawing_msg\030: \001(\0132\031.maptool.UpdateD" +
      "rawingMsgH\000\022I\n\034update_exposed_area_meta_" +
      "msg\030; \001(\0132!.maptool.UpdateExposedAreaMet" +
      "aMsgH\000\022:\n\024update_gm_macros_msg\030< \001(\0132\032.m" +
      "aptool.UpdateGmMacrosMsgH\000\022=\n\025update_ini" +
      "tiative_msg\030= \001(\0132\034.maptool.UpdateInitia" +
      "tiveMsgH\000\022H\n\033update_token_initiative_msg" +
      "\030> \001(\0132!.maptool.UpdateTokenInitiativeMs" +
      "gH\000\022<\n\025update_token_move_msg\030? \001(\0132\033.map" +
      "tool.UpdateTokenMoveMsgH\000\022D\n\031update_toke" +
      "n_property_msg\030@ \001(\0132\037.maptool.UpdateTok" +
      "enPropertyMsgH\000\022C\n\031remove_add_on_library" +
      "_msg\030A \001(\0132\036.maptool.RemoveAddOnLibraryM" +
      "sgH\000\022N\n\037remove_all_add_on_libraries_msg\030" +
      "B \001(\0132#.maptool.RemoveAllAddOnLibrariesM" +
      "sgH\000\022=\n\026add_add_on_library_msg\030C \001(\0132\033.m" +
      "aptool.AddAddOnLibraryMsgH\000\022<\n\025update_da" +
      "ta_store_msg\030D \001(\0132\033.maptool.UpdateDataS" +
      "toreMsgH\000\0221\n\017update_data_msg\030E \001(\0132\026.map" +
      "tool.UpdateDataMsgH\000\022D\n\031update_data_name" +
      "space_msg\030F \001(\0132\037.maptool.UpdateDataName" +
      "spaceMsgH\000\022<\n\025remove_data_store_msg\030G \001(" +
      "\0132\033.maptool.RemoveDataStoreMsgH\000\022D\n\031remo" +
      "ve_data_namespace_msg\030H \001(\0132\037.maptool.Re" +
      "moveDataNamespaceMsgH\000\0221\n\017remove_data_ms" +
      "g\030I \001(\0132\026.maptool.RemoveDataMsgH\000\022B\n\030upd" +
      "ate_player_status_msg\030J \001(\0132\036.maptool.Up" +
      "datePlayerStatusMsgH\000B\016\n\014message_typeB3\n" +
      " net.rptools.maptool.server.protoB\rMessa" +
      "geProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          net.rptools.maptool.server.proto.MessageTypeProtos.getDescriptor(),
        });
    internal_static_maptool_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_maptool_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_maptool_Message_descriptor,
        new java.lang.String[] { "AddTopologyMsg", "BootPlayerMsg", "BringTokensToFrontMsg", "ChangeZoneDisplayNameMsg", "ClearAllDrawingsMsg", "ClearExposedAreaMsg", "DrawMsg", "EditTokenMsg", "EnforceNotificationMsg", "EnforceZoneMsg", "EnforceZoneViewMsg", "ExecFunctionMsg", "ExecLinkMsg", "ExposeFowMsg", "ExposePcAreaMsg", "GetAssetMsg", "GetZoneMsg", "HeartbeatMsg", "HideFowMsg", "HidePointerMsg", "MessageMsg", "MovePointerMsg", "PlayerConnectedMsg", "PlayerDisconnectedMsg", "PutAssetMsg", "PutLabelMsg", "PutTokenMsg", "PutZoneMsg", "RemoveAssetMsg", "RemoveLabelMsg", "RemoveTokenMsg", "RemoveTokensMsg", "RemoveTopologyMsg", "RemoveZoneMsg", "RenameZoneMsg", "RestoreZoneViewMsg", "SendTokensToBackMsg", "SetBoardMsg", "SetCampaignMsg", "SetCampaignNameMsg", "SetFowMsg", "SetLiveTypingLabelMsg", "SetTokenLocationMsg", "SetServerPolicyMsg", "SetVisionTypeMsg", "SetZoneGridSizeMsg", "SetZoneHasFowMsg", "SetZoneVisibilityMsg", "ShowPointerMsg", "StartAssetTransferMsg", "StartTokenMoveMsg", "StopTokenMoveMsg", "ToggleTokenMoveWaypointMsg", "UndoDrawMsg", "UpdateAssetTransferMsg", "UpdateCampaignMsg", "UpdateCampaignMacrosMsg", "UpdateDrawingMsg", "UpdateExposedAreaMetaMsg", "UpdateGmMacrosMsg", "UpdateInitiativeMsg", "UpdateTokenInitiativeMsg", "UpdateTokenMoveMsg", "UpdateTokenPropertyMsg", "RemoveAddOnLibraryMsg", "RemoveAllAddOnLibrariesMsg", "AddAddOnLibraryMsg", "UpdateDataStoreMsg", "UpdateDataMsg", "UpdateDataNamespaceMsg", "RemoveDataStoreMsg", "RemoveDataNamespaceMsg", "RemoveDataMsg", "UpdatePlayerStatusMsg", "MessageType", });
    net.rptools.maptool.server.proto.MessageTypeProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
