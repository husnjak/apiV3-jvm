// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface MultiplayerModeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.MultiplayerMode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>bool campaigncoop = 2;</code>
   */
  boolean getCampaigncoop();

  /**
   * <code>bool dropin = 3;</code>
   */
  boolean getDropin();

  /**
   * <code>bool lancoop = 4;</code>
   */
  boolean getLancoop();

  /**
   * <code>bool offlinecoop = 5;</code>
   */
  boolean getOfflinecoop();

  /**
   * <code>int32 offlinecoopmax = 6;</code>
   */
  int getOfflinecoopmax();

  /**
   * <code>int32 offlinemax = 7;</code>
   */
  int getOfflinemax();

  /**
   * <code>bool onlinecoop = 8;</code>
   */
  boolean getOnlinecoop();

  /**
   * <code>int32 onlinecoopmax = 9;</code>
   */
  int getOnlinecoopmax();

  /**
   * <code>int32 onlinemax = 10;</code>
   */
  int getOnlinemax();

  /**
   * <code>.proto.Platform platform = 11;</code>
   */
  boolean hasPlatform();
  /**
   * <code>.proto.Platform platform = 11;</code>
   */
  proto.Platform getPlatform();
  /**
   * <code>.proto.Platform platform = 11;</code>
   */
  proto.PlatformOrBuilder getPlatformOrBuilder();

  /**
   * <code>bool splitscreen = 12;</code>
   */
  boolean getSplitscreen();

  /**
   * <code>bool splitscreenonline = 13;</code>
   */
  boolean getSplitscreenonline();
}