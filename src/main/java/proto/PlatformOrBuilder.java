// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

public interface PlatformOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.Platform)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string abbreviation = 2;</code>
   * @return The abbreviation.
   */
  java.lang.String getAbbreviation();
  /**
   * <code>string abbreviation = 2;</code>
   * @return The bytes for abbreviation.
   */
  com.google.protobuf.ByteString
      getAbbreviationBytes();

  /**
   * <code>string alternative_name = 3;</code>
   * @return The alternativeName.
   */
  java.lang.String getAlternativeName();
  /**
   * <code>string alternative_name = 3;</code>
   * @return The bytes for alternativeName.
   */
  com.google.protobuf.ByteString
      getAlternativeNameBytes();

  /**
   * <code>.proto.PlatformCategoryEnum category = 4;</code>
   * @return The enum numeric value on the wire for category.
   */
  int getCategoryValue();
  /**
   * <code>.proto.PlatformCategoryEnum category = 4;</code>
   * @return The category.
   */
  proto.PlatformCategoryEnum getCategory();

  /**
   * <code>.google.protobuf.Timestamp created_at = 5;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 5;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp created_at = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>int32 generation = 6;</code>
   * @return The generation.
   */
  int getGeneration();

  /**
   * <code>string name = 7;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 7;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.proto.PlatformLogo platform_logo = 8;</code>
   * @return Whether the platformLogo field is set.
   */
  boolean hasPlatformLogo();
  /**
   * <code>.proto.PlatformLogo platform_logo = 8;</code>
   * @return The platformLogo.
   */
  proto.PlatformLogo getPlatformLogo();
  /**
   * <code>.proto.PlatformLogo platform_logo = 8;</code>
   */
  proto.PlatformLogoOrBuilder getPlatformLogoOrBuilder();

  /**
   * <code>.proto.PlatformFamily platform_family = 9;</code>
   * @return Whether the platformFamily field is set.
   */
  boolean hasPlatformFamily();
  /**
   * <code>.proto.PlatformFamily platform_family = 9;</code>
   * @return The platformFamily.
   */
  proto.PlatformFamily getPlatformFamily();
  /**
   * <code>.proto.PlatformFamily platform_family = 9;</code>
   */
  proto.PlatformFamilyOrBuilder getPlatformFamilyOrBuilder();

  /**
   * <code>string slug = 10;</code>
   * @return The slug.
   */
  java.lang.String getSlug();
  /**
   * <code>string slug = 10;</code>
   * @return The bytes for slug.
   */
  com.google.protobuf.ByteString
      getSlugBytes();

  /**
   * <code>string summary = 11;</code>
   * @return The summary.
   */
  java.lang.String getSummary();
  /**
   * <code>string summary = 11;</code>
   * @return The bytes for summary.
   */
  com.google.protobuf.ByteString
      getSummaryBytes();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 12;</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 12;</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 12;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <code>string url = 13;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 13;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>repeated .proto.PlatformVersion versions = 14;</code>
   */
  java.util.List<proto.PlatformVersion> 
      getVersionsList();
  /**
   * <code>repeated .proto.PlatformVersion versions = 14;</code>
   */
  proto.PlatformVersion getVersions(int index);
  /**
   * <code>repeated .proto.PlatformVersion versions = 14;</code>
   */
  int getVersionsCount();
  /**
   * <code>repeated .proto.PlatformVersion versions = 14;</code>
   */
  java.util.List<? extends proto.PlatformVersionOrBuilder> 
      getVersionsOrBuilderList();
  /**
   * <code>repeated .proto.PlatformVersion versions = 14;</code>
   */
  proto.PlatformVersionOrBuilder getVersionsOrBuilder(
      int index);

  /**
   * <code>repeated .proto.PlatformWebsite websites = 15;</code>
   */
  java.util.List<proto.PlatformWebsite> 
      getWebsitesList();
  /**
   * <code>repeated .proto.PlatformWebsite websites = 15;</code>
   */
  proto.PlatformWebsite getWebsites(int index);
  /**
   * <code>repeated .proto.PlatformWebsite websites = 15;</code>
   */
  int getWebsitesCount();
  /**
   * <code>repeated .proto.PlatformWebsite websites = 15;</code>
   */
  java.util.List<? extends proto.PlatformWebsiteOrBuilder> 
      getWebsitesOrBuilderList();
  /**
   * <code>repeated .proto.PlatformWebsite websites = 15;</code>
   */
  proto.PlatformWebsiteOrBuilder getWebsitesOrBuilder(
      int index);

  /**
   * <code>string checksum = 16;</code>
   * @return The checksum.
   */
  java.lang.String getChecksum();
  /**
   * <code>string checksum = 16;</code>
   * @return The bytes for checksum.
   */
  com.google.protobuf.ByteString
      getChecksumBytes();
}
