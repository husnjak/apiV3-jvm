// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

public interface AlternativeNameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.AlternativeName)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string comment = 2;</code>
   * @return The comment.
   */
  java.lang.String getComment();
  /**
   * <code>string comment = 2;</code>
   * @return The bytes for comment.
   */
  com.google.protobuf.ByteString
      getCommentBytes();

  /**
   * <code>.proto.Game game = 3;</code>
   * @return Whether the game field is set.
   */
  boolean hasGame();
  /**
   * <code>.proto.Game game = 3;</code>
   * @return The game.
   */
  proto.Game getGame();
  /**
   * <code>.proto.Game game = 3;</code>
   */
  proto.GameOrBuilder getGameOrBuilder();

  /**
   * <code>string name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string checksum = 5;</code>
   * @return The checksum.
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 5;</code>
   * @return The bytes for checksum.
   */
  com.google.protobuf.ByteString
      getChecksumBytes();
}
