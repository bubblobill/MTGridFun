// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: handshake.proto

package net.rptools.maptool.server.proto;

public interface HandshakeMsgOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maptool.HandshakeMsg)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Client Initiated
   * </pre>
   *
   * <code>.maptool.ClientInitMsg client_init_msg = 1;</code>
   * @return Whether the clientInitMsg field is set.
   */
  boolean hasClientInitMsg();
  /**
   * <pre>
   * Client Initiated
   * </pre>
   *
   * <code>.maptool.ClientInitMsg client_init_msg = 1;</code>
   * @return The clientInitMsg.
   */
  net.rptools.maptool.server.proto.ClientInitMsg getClientInitMsg();
  /**
   * <pre>
   * Client Initiated
   * </pre>
   *
   * <code>.maptool.ClientInitMsg client_init_msg = 1;</code>
   */
  net.rptools.maptool.server.proto.ClientInitMsgOrBuilder getClientInitMsgOrBuilder();

  /**
   * <pre>
   * Client Initiated
   * </pre>
   *
   * <code>.maptool.ClientAuthMsg client_auth_message = 3;</code>
   * @return Whether the clientAuthMessage field is set.
   */
  boolean hasClientAuthMessage();
  /**
   * <pre>
   * Client Initiated
   * </pre>
   *
   * <code>.maptool.ClientAuthMsg client_auth_message = 3;</code>
   * @return The clientAuthMessage.
   */
  net.rptools.maptool.server.proto.ClientAuthMsg getClientAuthMessage();
  /**
   * <pre>
   * Client Initiated
   * </pre>
   *
   * <code>.maptool.ClientAuthMsg client_auth_message = 3;</code>
   */
  net.rptools.maptool.server.proto.ClientAuthMsgOrBuilder getClientAuthMessageOrBuilder();

  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.UseAuthTypeMsg use_auth_type_msg = 2;</code>
   * @return Whether the useAuthTypeMsg field is set.
   */
  boolean hasUseAuthTypeMsg();
  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.UseAuthTypeMsg use_auth_type_msg = 2;</code>
   * @return The useAuthTypeMsg.
   */
  net.rptools.maptool.server.proto.UseAuthTypeMsg getUseAuthTypeMsg();
  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.UseAuthTypeMsg use_auth_type_msg = 2;</code>
   */
  net.rptools.maptool.server.proto.UseAuthTypeMsgOrBuilder getUseAuthTypeMsgOrBuilder();

  /**
   * <pre>
   * Either
   * </pre>
   *
   * <code>.maptool.HandshakeResponseCodeMsg handshake_response_code_msg = 4;</code>
   * @return Whether the handshakeResponseCodeMsg field is set.
   */
  boolean hasHandshakeResponseCodeMsg();
  /**
   * <pre>
   * Either
   * </pre>
   *
   * <code>.maptool.HandshakeResponseCodeMsg handshake_response_code_msg = 4;</code>
   * @return The enum numeric value on the wire for handshakeResponseCodeMsg.
   */
  int getHandshakeResponseCodeMsgValue();
  /**
   * <pre>
   * Either
   * </pre>
   *
   * <code>.maptool.HandshakeResponseCodeMsg handshake_response_code_msg = 4;</code>
   * @return The handshakeResponseCodeMsg.
   */
  net.rptools.maptool.server.proto.HandshakeResponseCodeMsg getHandshakeResponseCodeMsg();

  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.ConnectionSuccessfulMsg connection_successful_msg = 5;</code>
   * @return Whether the connectionSuccessfulMsg field is set.
   */
  boolean hasConnectionSuccessfulMsg();
  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.ConnectionSuccessfulMsg connection_successful_msg = 5;</code>
   * @return The connectionSuccessfulMsg.
   */
  net.rptools.maptool.server.proto.ConnectionSuccessfulMsg getConnectionSuccessfulMsg();
  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.ConnectionSuccessfulMsg connection_successful_msg = 5;</code>
   */
  net.rptools.maptool.server.proto.ConnectionSuccessfulMsgOrBuilder getConnectionSuccessfulMsgOrBuilder();

  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.PlayerBlockedMsg player_blocked_msg = 6;</code>
   * @return Whether the playerBlockedMsg field is set.
   */
  boolean hasPlayerBlockedMsg();
  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.PlayerBlockedMsg player_blocked_msg = 6;</code>
   * @return The playerBlockedMsg.
   */
  net.rptools.maptool.server.proto.PlayerBlockedMsg getPlayerBlockedMsg();
  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.PlayerBlockedMsg player_blocked_msg = 6;</code>
   */
  net.rptools.maptool.server.proto.PlayerBlockedMsgOrBuilder getPlayerBlockedMsgOrBuilder();

  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.RequestPublicKeyMsg request_public_key_msg = 7;</code>
   * @return Whether the requestPublicKeyMsg field is set.
   */
  boolean hasRequestPublicKeyMsg();
  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.RequestPublicKeyMsg request_public_key_msg = 7;</code>
   * @return The requestPublicKeyMsg.
   */
  net.rptools.maptool.server.proto.RequestPublicKeyMsg getRequestPublicKeyMsg();
  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.RequestPublicKeyMsg request_public_key_msg = 7;</code>
   */
  net.rptools.maptool.server.proto.RequestPublicKeyMsgOrBuilder getRequestPublicKeyMsgOrBuilder();

  /**
   * <pre>
   * Client initiated
   * </pre>
   *
   * <code>.maptool.PublicKeyUploadMsg public_key_upload_msg = 8;</code>
   * @return Whether the publicKeyUploadMsg field is set.
   */
  boolean hasPublicKeyUploadMsg();
  /**
   * <pre>
   * Client initiated
   * </pre>
   *
   * <code>.maptool.PublicKeyUploadMsg public_key_upload_msg = 8;</code>
   * @return The publicKeyUploadMsg.
   */
  net.rptools.maptool.server.proto.PublicKeyUploadMsg getPublicKeyUploadMsg();
  /**
   * <pre>
   * Client initiated
   * </pre>
   *
   * <code>.maptool.PublicKeyUploadMsg public_key_upload_msg = 8;</code>
   */
  net.rptools.maptool.server.proto.PublicKeyUploadMsgOrBuilder getPublicKeyUploadMsgOrBuilder();

  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.PublicKeyAddedMsg public_key_added_msg = 9;</code>
   * @return Whether the publicKeyAddedMsg field is set.
   */
  boolean hasPublicKeyAddedMsg();
  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.PublicKeyAddedMsg public_key_added_msg = 9;</code>
   * @return The publicKeyAddedMsg.
   */
  net.rptools.maptool.server.proto.PublicKeyAddedMsg getPublicKeyAddedMsg();
  /**
   * <pre>
   * Server initiated
   * </pre>
   *
   * <code>.maptool.PublicKeyAddedMsg public_key_added_msg = 9;</code>
   */
  net.rptools.maptool.server.proto.PublicKeyAddedMsgOrBuilder getPublicKeyAddedMsgOrBuilder();

  public net.rptools.maptool.server.proto.HandshakeMsg.MessageTypeCase getMessageTypeCase();
}
