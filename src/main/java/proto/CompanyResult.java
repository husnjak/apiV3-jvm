// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.CompanyResult}
 */
public final class CompanyResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.CompanyResult)
    CompanyResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompanyResult.newBuilder() to construct.
  private CompanyResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompanyResult() {
    companies_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompanyResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_CompanyResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_CompanyResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.CompanyResult.class, proto.CompanyResult.Builder.class);
  }

  public static final int COMPANIES_FIELD_NUMBER = 1;
  private java.util.List<proto.Company> companies_;
  /**
   * <code>repeated .proto.Company companies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.Company> getCompaniesList() {
    return companies_;
  }
  /**
   * <code>repeated .proto.Company companies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.CompanyOrBuilder> 
      getCompaniesOrBuilderList() {
    return companies_;
  }
  /**
   * <code>repeated .proto.Company companies = 1;</code>
   */
  @java.lang.Override
  public int getCompaniesCount() {
    return companies_.size();
  }
  /**
   * <code>repeated .proto.Company companies = 1;</code>
   */
  @java.lang.Override
  public proto.Company getCompanies(int index) {
    return companies_.get(index);
  }
  /**
   * <code>repeated .proto.Company companies = 1;</code>
   */
  @java.lang.Override
  public proto.CompanyOrBuilder getCompaniesOrBuilder(
      int index) {
    return companies_.get(index);
  }

  public static proto.CompanyResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CompanyResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CompanyResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CompanyResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CompanyResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CompanyResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CompanyResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.CompanyResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.CompanyResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.CompanyResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.CompanyResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.CompanyResult parseFrom(
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
  public static Builder newBuilder(proto.CompanyResult prototype) {
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
   * Protobuf type {@code proto.CompanyResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.CompanyResult)
      proto.CompanyResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_CompanyResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_CompanyResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.CompanyResult.class, proto.CompanyResult.Builder.class);
    }

    // Construct using proto.CompanyResult.newBuilder()
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
        getCompaniesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (companiesBuilder_ == null) {
        companies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        companiesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_CompanyResult_descriptor;
    }

    @java.lang.Override
    public proto.CompanyResult getDefaultInstanceForType() {
      return proto.CompanyResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.CompanyResult build() {
      proto.CompanyResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.CompanyResult buildPartial() {
      proto.CompanyResult result = new proto.CompanyResult(this);
      int from_bitField0_ = bitField0_;
      if (companiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          companies_ = java.util.Collections.unmodifiableList(companies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.companies_ = companies_;
      } else {
        result.companies_ = companiesBuilder_.build();
      }
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
    private int bitField0_;

    private java.util.List<proto.Company> companies_ =
      java.util.Collections.emptyList();
    private void ensureCompaniesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        companies_ = new java.util.ArrayList<proto.Company>(companies_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Company, proto.Company.Builder, proto.CompanyOrBuilder> companiesBuilder_;

    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public java.util.List<proto.Company> getCompaniesList() {
      if (companiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(companies_);
      } else {
        return companiesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public int getCompaniesCount() {
      if (companiesBuilder_ == null) {
        return companies_.size();
      } else {
        return companiesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public proto.Company getCompanies(int index) {
      if (companiesBuilder_ == null) {
        return companies_.get(index);
      } else {
        return companiesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public Builder setCompanies(
        int index, proto.Company value) {
      if (companiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompaniesIsMutable();
        companies_.set(index, value);
        onChanged();
      } else {
        companiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public Builder setCompanies(
        int index, proto.Company.Builder builderForValue) {
      if (companiesBuilder_ == null) {
        ensureCompaniesIsMutable();
        companies_.set(index, builderForValue.build());
        onChanged();
      } else {
        companiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public Builder addCompanies(proto.Company value) {
      if (companiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompaniesIsMutable();
        companies_.add(value);
        onChanged();
      } else {
        companiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public Builder addCompanies(
        int index, proto.Company value) {
      if (companiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompaniesIsMutable();
        companies_.add(index, value);
        onChanged();
      } else {
        companiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public Builder addCompanies(
        proto.Company.Builder builderForValue) {
      if (companiesBuilder_ == null) {
        ensureCompaniesIsMutable();
        companies_.add(builderForValue.build());
        onChanged();
      } else {
        companiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public Builder addCompanies(
        int index, proto.Company.Builder builderForValue) {
      if (companiesBuilder_ == null) {
        ensureCompaniesIsMutable();
        companies_.add(index, builderForValue.build());
        onChanged();
      } else {
        companiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public Builder addAllCompanies(
        java.lang.Iterable<? extends proto.Company> values) {
      if (companiesBuilder_ == null) {
        ensureCompaniesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, companies_);
        onChanged();
      } else {
        companiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public Builder clearCompanies() {
      if (companiesBuilder_ == null) {
        companies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        companiesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public Builder removeCompanies(int index) {
      if (companiesBuilder_ == null) {
        ensureCompaniesIsMutable();
        companies_.remove(index);
        onChanged();
      } else {
        companiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public proto.Company.Builder getCompaniesBuilder(
        int index) {
      return getCompaniesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public proto.CompanyOrBuilder getCompaniesOrBuilder(
        int index) {
      if (companiesBuilder_ == null) {
        return companies_.get(index);  } else {
        return companiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public java.util.List<? extends proto.CompanyOrBuilder> 
         getCompaniesOrBuilderList() {
      if (companiesBuilder_ != null) {
        return companiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(companies_);
      }
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public proto.Company.Builder addCompaniesBuilder() {
      return getCompaniesFieldBuilder().addBuilder(
          proto.Company.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public proto.Company.Builder addCompaniesBuilder(
        int index) {
      return getCompaniesFieldBuilder().addBuilder(
          index, proto.Company.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.Company companies = 1;</code>
     */
    public java.util.List<proto.Company.Builder> 
         getCompaniesBuilderList() {
      return getCompaniesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.Company, proto.Company.Builder, proto.CompanyOrBuilder> 
        getCompaniesFieldBuilder() {
      if (companiesBuilder_ == null) {
        companiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.Company, proto.Company.Builder, proto.CompanyOrBuilder>(
                companies_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        companies_ = null;
      }
      return companiesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.CompanyResult)
  }

  // @@protoc_insertion_point(class_scope:proto.CompanyResult)
  private static final proto.CompanyResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.CompanyResult();
  }

  public static proto.CompanyResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompanyResult>
      PARSER = new com.google.protobuf.AbstractParser<CompanyResult>() {
    @java.lang.Override
    public CompanyResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompanyResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompanyResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.CompanyResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

