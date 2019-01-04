// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.ListResult}
 */
public  final class ListResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.ListResult)
    ListResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListResult.newBuilder() to construct.
  private ListResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListResult() {
    lists_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_ListResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_ListResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.ListResult.class, proto.ListResult.Builder.class);
  }

  public static final int LISTS_FIELD_NUMBER = 1;
  private java.util.List<proto.List> lists_;
  /**
   * <code>repeated .proto.List lists = 1;</code>
   */
  public java.util.List<proto.List> getListsList() {
    return lists_;
  }
  /**
   * <code>repeated .proto.List lists = 1;</code>
   */
  public java.util.List<? extends proto.ListOrBuilder> 
      getListsOrBuilderList() {
    return lists_;
  }
  /**
   * <code>repeated .proto.List lists = 1;</code>
   */
  public int getListsCount() {
    return lists_.size();
  }
  /**
   * <code>repeated .proto.List lists = 1;</code>
   */
  public proto.List getLists(int index) {
    return lists_.get(index);
  }
  /**
   * <code>repeated .proto.List lists = 1;</code>
   */
  public proto.ListOrBuilder getListsOrBuilder(
      int index) {
    return lists_.get(index);
  }

  public static proto.ListResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ListResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ListResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ListResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ListResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.ListResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.ListResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.ListResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.ListResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.ListResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.ListResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.ListResult parseFrom(
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
  public static Builder newBuilder(proto.ListResult prototype) {
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
   * Protobuf type {@code proto.ListResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.ListResult)
      proto.ListResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_ListResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_ListResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.ListResult.class, proto.ListResult.Builder.class);
    }

    // Construct using proto.ListResult.newBuilder()
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
        getListsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (listsBuilder_ == null) {
        lists_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        listsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_ListResult_descriptor;
    }

    @java.lang.Override
    public proto.ListResult getDefaultInstanceForType() {
      return proto.ListResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.ListResult build() {
      proto.ListResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.ListResult buildPartial() {
      proto.ListResult result = new proto.ListResult(this);
      int from_bitField0_ = bitField0_;
      if (listsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          lists_ = java.util.Collections.unmodifiableList(lists_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lists_ = lists_;
      } else {
        result.lists_ = listsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private java.util.List<proto.List> lists_ =
      java.util.Collections.emptyList();
    private void ensureListsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        lists_ = new java.util.ArrayList<proto.List>(lists_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.List, proto.List.Builder, proto.ListOrBuilder> listsBuilder_;

    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public java.util.List<proto.List> getListsList() {
      if (listsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lists_);
      } else {
        return listsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public int getListsCount() {
      if (listsBuilder_ == null) {
        return lists_.size();
      } else {
        return listsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public proto.List getLists(int index) {
      if (listsBuilder_ == null) {
        return lists_.get(index);
      } else {
        return listsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public Builder setLists(
        int index, proto.List value) {
      if (listsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListsIsMutable();
        lists_.set(index, value);
        onChanged();
      } else {
        listsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public Builder setLists(
        int index, proto.List.Builder builderForValue) {
      if (listsBuilder_ == null) {
        ensureListsIsMutable();
        lists_.set(index, builderForValue.build());
        onChanged();
      } else {
        listsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public Builder addLists(proto.List value) {
      if (listsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListsIsMutable();
        lists_.add(value);
        onChanged();
      } else {
        listsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public Builder addLists(
        int index, proto.List value) {
      if (listsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureListsIsMutable();
        lists_.add(index, value);
        onChanged();
      } else {
        listsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public Builder addLists(
        proto.List.Builder builderForValue) {
      if (listsBuilder_ == null) {
        ensureListsIsMutable();
        lists_.add(builderForValue.build());
        onChanged();
      } else {
        listsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public Builder addLists(
        int index, proto.List.Builder builderForValue) {
      if (listsBuilder_ == null) {
        ensureListsIsMutable();
        lists_.add(index, builderForValue.build());
        onChanged();
      } else {
        listsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public Builder addAllLists(
        java.lang.Iterable<? extends proto.List> values) {
      if (listsBuilder_ == null) {
        ensureListsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lists_);
        onChanged();
      } else {
        listsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public Builder clearLists() {
      if (listsBuilder_ == null) {
        lists_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        listsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public Builder removeLists(int index) {
      if (listsBuilder_ == null) {
        ensureListsIsMutable();
        lists_.remove(index);
        onChanged();
      } else {
        listsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public proto.List.Builder getListsBuilder(
        int index) {
      return getListsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public proto.ListOrBuilder getListsOrBuilder(
        int index) {
      if (listsBuilder_ == null) {
        return lists_.get(index);  } else {
        return listsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public java.util.List<? extends proto.ListOrBuilder> 
         getListsOrBuilderList() {
      if (listsBuilder_ != null) {
        return listsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lists_);
      }
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public proto.List.Builder addListsBuilder() {
      return getListsFieldBuilder().addBuilder(
          proto.List.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public proto.List.Builder addListsBuilder(
        int index) {
      return getListsFieldBuilder().addBuilder(
          index, proto.List.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.List lists = 1;</code>
     */
    public java.util.List<proto.List.Builder> 
         getListsBuilderList() {
      return getListsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.List, proto.List.Builder, proto.ListOrBuilder> 
        getListsFieldBuilder() {
      if (listsBuilder_ == null) {
        listsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.List, proto.List.Builder, proto.ListOrBuilder>(
                lists_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        lists_ = null;
      }
      return listsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:proto.ListResult)
  }

  // @@protoc_insertion_point(class_scope:proto.ListResult)
  private static final proto.ListResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.ListResult();
  }

  public static proto.ListResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListResult>
      PARSER = new com.google.protobuf.AbstractParser<ListResult>() {
    @java.lang.Override
    public ListResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.ListResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
