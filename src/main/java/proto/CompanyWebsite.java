// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.CompanyWebsite}
 */
public final class CompanyWebsite extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.CompanyWebsite)
    CompanyWebsiteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompanyWebsite.newBuilder() to construct.
  private CompanyWebsite(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompanyWebsite() {
    category_ = 0;
    url_ = "";
    checksum_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompanyWebsite();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_CompanyWebsite_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_CompanyWebsite_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.CompanyWebsite.class, proto.CompanyWebsite.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>uint64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int CATEGORY_FIELD_NUMBER = 2;
  private int category_;
  /**
   * <code>.proto.WebsiteCategoryEnum category = 2;</code>
   * @return The enum numeric value on the wire for category.
   */
  @java.lang.Override public int getCategoryValue() {
    return category_;
  }
  /**
   * <code>.proto.WebsiteCategoryEnum category = 2;</code>
   * @return The category.
   */
  @java.lang.Override public proto.WebsiteCategoryEnum getCategory() {
    @SuppressWarnings("deprecation")
    proto.WebsiteCategoryEnum result = proto.WebsiteCategoryEnum.valueOf(category_);
    return result == null ? proto.WebsiteCategoryEnum.UNRECOGNIZED : result;
  }

  public static final int TRUSTED_FIELD_NUMBER = 3;
  private boolean trusted_;
  /**
   * <code>bool trusted = 3;</code>
   * @return The trusted.
   */
  @java.lang.Override
  public boolean getTrusted() {
    return trusted_;
  }

  public static final int URL_FIELD_NUMBER = 4;
  private volatile java.lang.Object url_;
  /**
   * <code>string url = 4;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <code>string url = 4;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CHECKSUM_FIELD_NUMBER = 5;
  private volatile java.lang.Object checksum_;
  /**
   * <code>string checksum = 5;</code>
   * @return The checksum.
   */
  @java.lang.Override
  public java.lang.String getChecksum() {
    java.lang.Object ref = checksum_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      checksum_ = s;
      return s;
    }
  }
  /**
   * <code>string checksum = 5;</code>
   * @return The bytes for checksum.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChecksumBytes() {
    java.lang.Object ref = checksum_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      checksum_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static proto.CompanyWebsite parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CompanyWebsite parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CompanyWebsite parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CompanyWebsite parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CompanyWebsite parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CompanyWebsite parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CompanyWebsite parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.CompanyWebsite parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.CompanyWebsite parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.CompanyWebsite parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.CompanyWebsite parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.CompanyWebsite parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.CompanyWebsite prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.CompanyWebsite}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.CompanyWebsite)
      proto.CompanyWebsiteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_CompanyWebsite_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_CompanyWebsite_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.CompanyWebsite.class, proto.CompanyWebsite.Builder.class);
    }

    // Construct using proto.CompanyWebsite.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      category_ = 0;

      trusted_ = false;

      url_ = "";

      checksum_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_CompanyWebsite_descriptor;
    }

    @java.lang.Override
    public proto.CompanyWebsite getDefaultInstanceForType() {
      return proto.CompanyWebsite.getDefaultInstance();
    }

    @java.lang.Override
    public proto.CompanyWebsite build() {
      proto.CompanyWebsite result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.CompanyWebsite buildPartial() {
      proto.CompanyWebsite result = new proto.CompanyWebsite(this);
      result.id_ = id_;
      result.category_ = category_;
      result.trusted_ = trusted_;
      result.url_ = url_;
      result.checksum_ = checksum_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    private long id_ ;
    /**
     * <code>uint64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>uint64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private int category_ = 0;
    /**
     * <code>.proto.WebsiteCategoryEnum category = 2;</code>
     * @return The enum numeric value on the wire for category.
     */
    @java.lang.Override public int getCategoryValue() {
      return category_;
    }
    /**
     * <code>.proto.WebsiteCategoryEnum category = 2;</code>
     * @param value The enum numeric value on the wire for category to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryValue(int value) {
      
      category_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.proto.WebsiteCategoryEnum category = 2;</code>
     * @return The category.
     */
    @java.lang.Override
    public proto.WebsiteCategoryEnum getCategory() {
      @SuppressWarnings("deprecation")
      proto.WebsiteCategoryEnum result = proto.WebsiteCategoryEnum.valueOf(category_);
      return result == null ? proto.WebsiteCategoryEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>.proto.WebsiteCategoryEnum category = 2;</code>
     * @param value The category to set.
     * @return This builder for chaining.
     */
    public Builder setCategory(proto.WebsiteCategoryEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      category_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.proto.WebsiteCategoryEnum category = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCategory() {
      
      category_ = 0;
      onChanged();
      return this;
    }

    private boolean trusted_ ;
    /**
     * <code>bool trusted = 3;</code>
     * @return The trusted.
     */
    @java.lang.Override
    public boolean getTrusted() {
      return trusted_;
    }
    /**
     * <code>bool trusted = 3;</code>
     * @param value The trusted to set.
     * @return This builder for chaining.
     */
    public Builder setTrusted(boolean value) {
      
      trusted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool trusted = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrusted() {
      
      trusted_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <code>string url = 4;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string url = 4;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string url = 4;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      url_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string url = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      
      url_ = getDefaultInstance().getUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string url = 4;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      url_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object checksum_ = "";
    /**
     * <code>string checksum = 5;</code>
     * @return The checksum.
     */
    public java.lang.String getChecksum() {
      java.lang.Object ref = checksum_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        checksum_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string checksum = 5;</code>
     * @return The bytes for checksum.
     */
    public com.google.protobuf.ByteString
        getChecksumBytes() {
      java.lang.Object ref = checksum_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        checksum_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string checksum = 5;</code>
     * @param value The checksum to set.
     * @return This builder for chaining.
     */
    public Builder setChecksum(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      checksum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string checksum = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearChecksum() {
      
      checksum_ = getDefaultInstance().getChecksum();
      onChanged();
      return this;
    }
    /**
     * <code>string checksum = 5;</code>
     * @param value The bytes for checksum to set.
     * @return This builder for chaining.
     */
    public Builder setChecksumBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      checksum_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.CompanyWebsite)
  }

  // @@protoc_insertion_point(class_scope:proto.CompanyWebsite)
  private static final proto.CompanyWebsite DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.CompanyWebsite();
  }

  public static proto.CompanyWebsite getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompanyWebsite>
      PARSER = new com.google.protobuf.AbstractParser<CompanyWebsite>() {
    @java.lang.Override
    public CompanyWebsite parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(
                builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CompanyWebsite> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompanyWebsite> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.CompanyWebsite getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

