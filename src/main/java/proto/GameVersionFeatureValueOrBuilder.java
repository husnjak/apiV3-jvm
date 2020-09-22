// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

public interface GameVersionFeatureValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.GameVersionFeatureValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.proto.Game game = 2;</code>
   * @return Whether the game field is set.
   */
  boolean hasGame();
  /**
   * <code>.proto.Game game = 2;</code>
   * @return The game.
   */
  proto.Game getGame();
  /**
   * <code>.proto.Game game = 2;</code>
   */
  proto.GameOrBuilder getGameOrBuilder();

  /**
   * <code>.proto.GameVersionFeature game_feature = 3;</code>
   * @return Whether the gameFeature field is set.
   */
  boolean hasGameFeature();
  /**
   * <code>.proto.GameVersionFeature game_feature = 3;</code>
   * @return The gameFeature.
   */
  proto.GameVersionFeature getGameFeature();
  /**
   * <code>.proto.GameVersionFeature game_feature = 3;</code>
   */
  proto.GameVersionFeatureOrBuilder getGameFeatureOrBuilder();

  /**
   * <code>.proto.GameVersionFeatureValueIncludedFeatureEnum included_feature = 4;</code>
   * @return The enum numeric value on the wire for includedFeature.
   */
  int getIncludedFeatureValue();
  /**
   * <code>.proto.GameVersionFeatureValueIncludedFeatureEnum included_feature = 4;</code>
   * @return The includedFeature.
   */
  proto.GameVersionFeatureValueIncludedFeatureEnum getIncludedFeature();

  /**
   * <code>string note = 5;</code>
   * @return The note.
   */
  java.lang.String getNote();
  /**
   * <code>string note = 5;</code>
   * @return The bytes for note.
   */
  com.google.protobuf.ByteString
      getNoteBytes();

  /**
   * <code>string checksum = 6;</code>
   * @return The checksum.
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 6;</code>
   * @return The bytes for checksum.
   */
  com.google.protobuf.ByteString
      getChecksumBytes();
}
