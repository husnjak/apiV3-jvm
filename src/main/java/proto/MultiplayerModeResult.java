// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.MultiplayerModeResult}
 */
public final class MultiplayerModeResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.MultiplayerModeResult)
    MultiplayerModeResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiplayerModeResult.newBuilder() to construct.
  private MultiplayerModeResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiplayerModeResult() {
    multiplayermodes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiplayerModeResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_MultiplayerModeResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_MultiplayerModeResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.MultiplayerModeResult.class, proto.MultiplayerModeResult.Builder.class);
  }

  public static final int MULTIPLAYERMODES_FIELD_NUMBER = 1;
  private java.util.List<proto.MultiplayerMode> multiplayermodes_;
  /**
   * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.MultiplayerMode> getMultiplayermodesList() {
    return multiplayermodes_;
  }
  /**
   * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.MultiplayerModeOrBuilder> 
      getMultiplayermodesOrBuilderList() {
    return multiplayermodes_;
  }
  /**
   * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
   */
  @java.lang.Override
  public int getMultiplayermodesCount() {
    return multiplayermodes_.size();
  }
  /**
   * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
   */
  @java.lang.Override
  public proto.MultiplayerMode getMultiplayermodes(int index) {
    return multiplayermodes_.get(index);
  }
  /**
   * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
   */
  @java.lang.Override
  public proto.MultiplayerModeOrBuilder getMultiplayermodesOrBuilder(
      int index) {
    return multiplayermodes_.get(index);
  }

  public static proto.MultiplayerModeResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.MultiplayerModeResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.MultiplayerModeResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.MultiplayerModeResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.MultiplayerModeResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.MultiplayerModeResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.MultiplayerModeResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.MultiplayerModeResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.MultiplayerModeResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.MultiplayerModeResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.MultiplayerModeResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.MultiplayerModeResult parseFrom(
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
  public static Builder newBuilder(proto.MultiplayerModeResult prototype) {
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
   * Protobuf type {@code proto.MultiplayerModeResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.MultiplayerModeResult)
      proto.MultiplayerModeResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_MultiplayerModeResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_MultiplayerModeResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.MultiplayerModeResult.class, proto.MultiplayerModeResult.Builder.class);
    }

    // Construct using proto.MultiplayerModeResult.newBuilder()
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
        getMultiplayermodesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (multiplayermodesBuilder_ == null) {
        multiplayermodes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        multiplayermodesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_MultiplayerModeResult_descriptor;
    }

    @java.lang.Override
    public proto.MultiplayerModeResult getDefaultInstanceForType() {
      return proto.MultiplayerModeResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.MultiplayerModeResult build() {
      proto.MultiplayerModeResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.MultiplayerModeResult buildPartial() {
      proto.MultiplayerModeResult result = new proto.MultiplayerModeResult(this);
      int from_bitField0_ = bitField0_;
      if (multiplayermodesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          multiplayermodes_ = java.util.Collections.unmodifiableList(multiplayermodes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.multiplayermodes_ = multiplayermodes_;
      } else {
        result.multiplayermodes_ = multiplayermodesBuilder_.build();
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

    private java.util.List<proto.MultiplayerMode> multiplayermodes_ =
      java.util.Collections.emptyList();
    private void ensureMultiplayermodesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        multiplayermodes_ = new java.util.ArrayList<proto.MultiplayerMode>(multiplayermodes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.MultiplayerMode, proto.MultiplayerMode.Builder, proto.MultiplayerModeOrBuilder> multiplayermodesBuilder_;

    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public java.util.List<proto.MultiplayerMode> getMultiplayermodesList() {
      if (multiplayermodesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(multiplayermodes_);
      } else {
        return multiplayermodesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public int getMultiplayermodesCount() {
      if (multiplayermodesBuilder_ == null) {
        return multiplayermodes_.size();
      } else {
        return multiplayermodesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public proto.MultiplayerMode getMultiplayermodes(int index) {
      if (multiplayermodesBuilder_ == null) {
        return multiplayermodes_.get(index);
      } else {
        return multiplayermodesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public Builder setMultiplayermodes(
        int index, proto.MultiplayerMode value) {
      if (multiplayermodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMultiplayermodesIsMutable();
        multiplayermodes_.set(index, value);
        onChanged();
      } else {
        multiplayermodesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public Builder setMultiplayermodes(
        int index, proto.MultiplayerMode.Builder builderForValue) {
      if (multiplayermodesBuilder_ == null) {
        ensureMultiplayermodesIsMutable();
        multiplayermodes_.set(index, builderForValue.build());
        onChanged();
      } else {
        multiplayermodesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public Builder addMultiplayermodes(proto.MultiplayerMode value) {
      if (multiplayermodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMultiplayermodesIsMutable();
        multiplayermodes_.add(value);
        onChanged();
      } else {
        multiplayermodesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public Builder addMultiplayermodes(
        int index, proto.MultiplayerMode value) {
      if (multiplayermodesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMultiplayermodesIsMutable();
        multiplayermodes_.add(index, value);
        onChanged();
      } else {
        multiplayermodesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public Builder addMultiplayermodes(
        proto.MultiplayerMode.Builder builderForValue) {
      if (multiplayermodesBuilder_ == null) {
        ensureMultiplayermodesIsMutable();
        multiplayermodes_.add(builderForValue.build());
        onChanged();
      } else {
        multiplayermodesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public Builder addMultiplayermodes(
        int index, proto.MultiplayerMode.Builder builderForValue) {
      if (multiplayermodesBuilder_ == null) {
        ensureMultiplayermodesIsMutable();
        multiplayermodes_.add(index, builderForValue.build());
        onChanged();
      } else {
        multiplayermodesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public Builder addAllMultiplayermodes(
        java.lang.Iterable<? extends proto.MultiplayerMode> values) {
      if (multiplayermodesBuilder_ == null) {
        ensureMultiplayermodesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, multiplayermodes_);
        onChanged();
      } else {
        multiplayermodesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public Builder clearMultiplayermodes() {
      if (multiplayermodesBuilder_ == null) {
        multiplayermodes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        multiplayermodesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public Builder removeMultiplayermodes(int index) {
      if (multiplayermodesBuilder_ == null) {
        ensureMultiplayermodesIsMutable();
        multiplayermodes_.remove(index);
        onChanged();
      } else {
        multiplayermodesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public proto.MultiplayerMode.Builder getMultiplayermodesBuilder(
        int index) {
      return getMultiplayermodesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public proto.MultiplayerModeOrBuilder getMultiplayermodesOrBuilder(
        int index) {
      if (multiplayermodesBuilder_ == null) {
        return multiplayermodes_.get(index);  } else {
        return multiplayermodesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public java.util.List<? extends proto.MultiplayerModeOrBuilder> 
         getMultiplayermodesOrBuilderList() {
      if (multiplayermodesBuilder_ != null) {
        return multiplayermodesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(multiplayermodes_);
      }
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public proto.MultiplayerMode.Builder addMultiplayermodesBuilder() {
      return getMultiplayermodesFieldBuilder().addBuilder(
          proto.MultiplayerMode.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public proto.MultiplayerMode.Builder addMultiplayermodesBuilder(
        int index) {
      return getMultiplayermodesFieldBuilder().addBuilder(
          index, proto.MultiplayerMode.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.MultiplayerMode multiplayermodes = 1;</code>
     */
    public java.util.List<proto.MultiplayerMode.Builder> 
         getMultiplayermodesBuilderList() {
      return getMultiplayermodesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.MultiplayerMode, proto.MultiplayerMode.Builder, proto.MultiplayerModeOrBuilder> 
        getMultiplayermodesFieldBuilder() {
      if (multiplayermodesBuilder_ == null) {
        multiplayermodesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.MultiplayerMode, proto.MultiplayerMode.Builder, proto.MultiplayerModeOrBuilder>(
                multiplayermodes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        multiplayermodes_ = null;
      }
      return multiplayermodesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.MultiplayerModeResult)
  }

  // @@protoc_insertion_point(class_scope:proto.MultiplayerModeResult)
  private static final proto.MultiplayerModeResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.MultiplayerModeResult();
  }

  public static proto.MultiplayerModeResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiplayerModeResult>
      PARSER = new com.google.protobuf.AbstractParser<MultiplayerModeResult>() {
    @java.lang.Override
    public MultiplayerModeResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<MultiplayerModeResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiplayerModeResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.MultiplayerModeResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

