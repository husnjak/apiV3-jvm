// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.CompanyWebsiteResult}
 */
public final class CompanyWebsiteResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.CompanyWebsiteResult)
    CompanyWebsiteResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CompanyWebsiteResult.newBuilder() to construct.
  private CompanyWebsiteResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompanyWebsiteResult() {
    companywebsites_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CompanyWebsiteResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_CompanyWebsiteResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_CompanyWebsiteResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.CompanyWebsiteResult.class, proto.CompanyWebsiteResult.Builder.class);
  }

  public static final int COMPANYWEBSITES_FIELD_NUMBER = 1;
  private java.util.List<proto.CompanyWebsite> companywebsites_;
  /**
   * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.CompanyWebsite> getCompanywebsitesList() {
    return companywebsites_;
  }
  /**
   * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.CompanyWebsiteOrBuilder> 
      getCompanywebsitesOrBuilderList() {
    return companywebsites_;
  }
  /**
   * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
   */
  @java.lang.Override
  public int getCompanywebsitesCount() {
    return companywebsites_.size();
  }
  /**
   * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
   */
  @java.lang.Override
  public proto.CompanyWebsite getCompanywebsites(int index) {
    return companywebsites_.get(index);
  }
  /**
   * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
   */
  @java.lang.Override
  public proto.CompanyWebsiteOrBuilder getCompanywebsitesOrBuilder(
      int index) {
    return companywebsites_.get(index);
  }

  public static proto.CompanyWebsiteResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CompanyWebsiteResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CompanyWebsiteResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CompanyWebsiteResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CompanyWebsiteResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.CompanyWebsiteResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.CompanyWebsiteResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.CompanyWebsiteResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.CompanyWebsiteResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.CompanyWebsiteResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.CompanyWebsiteResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.CompanyWebsiteResult parseFrom(
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
  public static Builder newBuilder(proto.CompanyWebsiteResult prototype) {
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
   * Protobuf type {@code proto.CompanyWebsiteResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.CompanyWebsiteResult)
      proto.CompanyWebsiteResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_CompanyWebsiteResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_CompanyWebsiteResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.CompanyWebsiteResult.class, proto.CompanyWebsiteResult.Builder.class);
    }

    // Construct using proto.CompanyWebsiteResult.newBuilder()
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
        getCompanywebsitesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (companywebsitesBuilder_ == null) {
        companywebsites_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        companywebsitesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_CompanyWebsiteResult_descriptor;
    }

    @java.lang.Override
    public proto.CompanyWebsiteResult getDefaultInstanceForType() {
      return proto.CompanyWebsiteResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.CompanyWebsiteResult build() {
      proto.CompanyWebsiteResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.CompanyWebsiteResult buildPartial() {
      proto.CompanyWebsiteResult result = new proto.CompanyWebsiteResult(this);
      int from_bitField0_ = bitField0_;
      if (companywebsitesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          companywebsites_ = java.util.Collections.unmodifiableList(companywebsites_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.companywebsites_ = companywebsites_;
      } else {
        result.companywebsites_ = companywebsitesBuilder_.build();
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

    private java.util.List<proto.CompanyWebsite> companywebsites_ =
      java.util.Collections.emptyList();
    private void ensureCompanywebsitesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        companywebsites_ = new java.util.ArrayList<proto.CompanyWebsite>(companywebsites_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.CompanyWebsite, proto.CompanyWebsite.Builder, proto.CompanyWebsiteOrBuilder> companywebsitesBuilder_;

    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public java.util.List<proto.CompanyWebsite> getCompanywebsitesList() {
      if (companywebsitesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(companywebsites_);
      } else {
        return companywebsitesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public int getCompanywebsitesCount() {
      if (companywebsitesBuilder_ == null) {
        return companywebsites_.size();
      } else {
        return companywebsitesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public proto.CompanyWebsite getCompanywebsites(int index) {
      if (companywebsitesBuilder_ == null) {
        return companywebsites_.get(index);
      } else {
        return companywebsitesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public Builder setCompanywebsites(
        int index, proto.CompanyWebsite value) {
      if (companywebsitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompanywebsitesIsMutable();
        companywebsites_.set(index, value);
        onChanged();
      } else {
        companywebsitesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public Builder setCompanywebsites(
        int index, proto.CompanyWebsite.Builder builderForValue) {
      if (companywebsitesBuilder_ == null) {
        ensureCompanywebsitesIsMutable();
        companywebsites_.set(index, builderForValue.build());
        onChanged();
      } else {
        companywebsitesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public Builder addCompanywebsites(proto.CompanyWebsite value) {
      if (companywebsitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompanywebsitesIsMutable();
        companywebsites_.add(value);
        onChanged();
      } else {
        companywebsitesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public Builder addCompanywebsites(
        int index, proto.CompanyWebsite value) {
      if (companywebsitesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCompanywebsitesIsMutable();
        companywebsites_.add(index, value);
        onChanged();
      } else {
        companywebsitesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public Builder addCompanywebsites(
        proto.CompanyWebsite.Builder builderForValue) {
      if (companywebsitesBuilder_ == null) {
        ensureCompanywebsitesIsMutable();
        companywebsites_.add(builderForValue.build());
        onChanged();
      } else {
        companywebsitesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public Builder addCompanywebsites(
        int index, proto.CompanyWebsite.Builder builderForValue) {
      if (companywebsitesBuilder_ == null) {
        ensureCompanywebsitesIsMutable();
        companywebsites_.add(index, builderForValue.build());
        onChanged();
      } else {
        companywebsitesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public Builder addAllCompanywebsites(
        java.lang.Iterable<? extends proto.CompanyWebsite> values) {
      if (companywebsitesBuilder_ == null) {
        ensureCompanywebsitesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, companywebsites_);
        onChanged();
      } else {
        companywebsitesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public Builder clearCompanywebsites() {
      if (companywebsitesBuilder_ == null) {
        companywebsites_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        companywebsitesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public Builder removeCompanywebsites(int index) {
      if (companywebsitesBuilder_ == null) {
        ensureCompanywebsitesIsMutable();
        companywebsites_.remove(index);
        onChanged();
      } else {
        companywebsitesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public proto.CompanyWebsite.Builder getCompanywebsitesBuilder(
        int index) {
      return getCompanywebsitesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public proto.CompanyWebsiteOrBuilder getCompanywebsitesOrBuilder(
        int index) {
      if (companywebsitesBuilder_ == null) {
        return companywebsites_.get(index);  } else {
        return companywebsitesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public java.util.List<? extends proto.CompanyWebsiteOrBuilder> 
         getCompanywebsitesOrBuilderList() {
      if (companywebsitesBuilder_ != null) {
        return companywebsitesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(companywebsites_);
      }
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public proto.CompanyWebsite.Builder addCompanywebsitesBuilder() {
      return getCompanywebsitesFieldBuilder().addBuilder(
          proto.CompanyWebsite.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public proto.CompanyWebsite.Builder addCompanywebsitesBuilder(
        int index) {
      return getCompanywebsitesFieldBuilder().addBuilder(
          index, proto.CompanyWebsite.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.CompanyWebsite companywebsites = 1;</code>
     */
    public java.util.List<proto.CompanyWebsite.Builder> 
         getCompanywebsitesBuilderList() {
      return getCompanywebsitesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.CompanyWebsite, proto.CompanyWebsite.Builder, proto.CompanyWebsiteOrBuilder> 
        getCompanywebsitesFieldBuilder() {
      if (companywebsitesBuilder_ == null) {
        companywebsitesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.CompanyWebsite, proto.CompanyWebsite.Builder, proto.CompanyWebsiteOrBuilder>(
                companywebsites_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        companywebsites_ = null;
      }
      return companywebsitesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.CompanyWebsiteResult)
  }

  // @@protoc_insertion_point(class_scope:proto.CompanyWebsiteResult)
  private static final proto.CompanyWebsiteResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.CompanyWebsiteResult();
  }

  public static proto.CompanyWebsiteResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompanyWebsiteResult>
      PARSER = new com.google.protobuf.AbstractParser<CompanyWebsiteResult>() {
    @java.lang.Override
    public CompanyWebsiteResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<CompanyWebsiteResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompanyWebsiteResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.CompanyWebsiteResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

