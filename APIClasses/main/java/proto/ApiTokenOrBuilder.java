// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface ApiTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.ApiToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>.google.protobuf.Timestamp createdAt = 2;</code>
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 2;</code>
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>int32 expiresIn = 3;</code>
   */
  int getExpiresIn();

  /**
   * <code>string token = 4;</code>
   */
  java.lang.String getToken();
  /**
   * <code>string token = 4;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <code>int32 user = 5;</code>
   */
  int getUser();
}