// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

public interface InvolvedCompanyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.InvolvedCompany)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>.proto.Company company = 2;</code>
   */
  boolean hasCompany();
  /**
   * <code>.proto.Company company = 2;</code>
   */
  proto.Company getCompany();
  /**
   * <code>.proto.Company company = 2;</code>
   */
  proto.CompanyOrBuilder getCompanyOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp createdAt = 3;</code>
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 3;</code>
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>bool developer = 4;</code>
   */
  boolean getDeveloper();

  /**
   * <code>.proto.Game game = 5;</code>
   */
  boolean hasGame();
  /**
   * <code>.proto.Game game = 5;</code>
   */
  proto.Game getGame();
  /**
   * <code>.proto.Game game = 5;</code>
   */
  proto.GameOrBuilder getGameOrBuilder();

  /**
   * <code>bool porting = 6;</code>
   */
  boolean getPorting();

  /**
   * <code>bool publisher = 7;</code>
   */
  boolean getPublisher();

  /**
   * <code>bool supporting = 8;</code>
   */
  boolean getSupporting();

  /**
   * <code>.google.protobuf.Timestamp updatedAt = 9;</code>
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updatedAt = 9;</code>
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updatedAt = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();
}