// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf type {@code proto.AgeRatingResult}
 */
public final class AgeRatingResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.AgeRatingResult)
    AgeRatingResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AgeRatingResult.newBuilder() to construct.
  private AgeRatingResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AgeRatingResult() {
    ageratings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AgeRatingResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.Igdbproto.internal_static_proto_AgeRatingResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.Igdbproto.internal_static_proto_AgeRatingResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.AgeRatingResult.class, proto.AgeRatingResult.Builder.class);
  }

  public static final int AGERATINGS_FIELD_NUMBER = 1;
  private java.util.List<proto.AgeRating> ageratings_;
  /**
   * <code>repeated .proto.AgeRating ageratings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.AgeRating> getAgeratingsList() {
    return ageratings_;
  }
  /**
   * <code>repeated .proto.AgeRating ageratings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.AgeRatingOrBuilder> 
      getAgeratingsOrBuilderList() {
    return ageratings_;
  }
  /**
   * <code>repeated .proto.AgeRating ageratings = 1;</code>
   */
  @java.lang.Override
  public int getAgeratingsCount() {
    return ageratings_.size();
  }
  /**
   * <code>repeated .proto.AgeRating ageratings = 1;</code>
   */
  @java.lang.Override
  public proto.AgeRating getAgeratings(int index) {
    return ageratings_.get(index);
  }
  /**
   * <code>repeated .proto.AgeRating ageratings = 1;</code>
   */
  @java.lang.Override
  public proto.AgeRatingOrBuilder getAgeratingsOrBuilder(
      int index) {
    return ageratings_.get(index);
  }

  public static proto.AgeRatingResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.AgeRatingResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.AgeRatingResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.AgeRatingResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.AgeRatingResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.AgeRatingResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.AgeRatingResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.AgeRatingResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.AgeRatingResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.AgeRatingResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.AgeRatingResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.AgeRatingResult parseFrom(
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
  public static Builder newBuilder(proto.AgeRatingResult prototype) {
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
   * Protobuf type {@code proto.AgeRatingResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.AgeRatingResult)
      proto.AgeRatingResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.Igdbproto.internal_static_proto_AgeRatingResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Igdbproto.internal_static_proto_AgeRatingResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.AgeRatingResult.class, proto.AgeRatingResult.Builder.class);
    }

    // Construct using proto.AgeRatingResult.newBuilder()
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
        getAgeratingsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ageratingsBuilder_ == null) {
        ageratings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ageratingsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.Igdbproto.internal_static_proto_AgeRatingResult_descriptor;
    }

    @java.lang.Override
    public proto.AgeRatingResult getDefaultInstanceForType() {
      return proto.AgeRatingResult.getDefaultInstance();
    }

    @java.lang.Override
    public proto.AgeRatingResult build() {
      proto.AgeRatingResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.AgeRatingResult buildPartial() {
      proto.AgeRatingResult result = new proto.AgeRatingResult(this);
      int from_bitField0_ = bitField0_;
      if (ageratingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ageratings_ = java.util.Collections.unmodifiableList(ageratings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ageratings_ = ageratings_;
      } else {
        result.ageratings_ = ageratingsBuilder_.build();
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

    private java.util.List<proto.AgeRating> ageratings_ =
      java.util.Collections.emptyList();
    private void ensureAgeratingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ageratings_ = new java.util.ArrayList<proto.AgeRating>(ageratings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.AgeRating, proto.AgeRating.Builder, proto.AgeRatingOrBuilder> ageratingsBuilder_;

    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public java.util.List<proto.AgeRating> getAgeratingsList() {
      if (ageratingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ageratings_);
      } else {
        return ageratingsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public int getAgeratingsCount() {
      if (ageratingsBuilder_ == null) {
        return ageratings_.size();
      } else {
        return ageratingsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public proto.AgeRating getAgeratings(int index) {
      if (ageratingsBuilder_ == null) {
        return ageratings_.get(index);
      } else {
        return ageratingsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public Builder setAgeratings(
        int index, proto.AgeRating value) {
      if (ageratingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgeratingsIsMutable();
        ageratings_.set(index, value);
        onChanged();
      } else {
        ageratingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public Builder setAgeratings(
        int index, proto.AgeRating.Builder builderForValue) {
      if (ageratingsBuilder_ == null) {
        ensureAgeratingsIsMutable();
        ageratings_.set(index, builderForValue.build());
        onChanged();
      } else {
        ageratingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public Builder addAgeratings(proto.AgeRating value) {
      if (ageratingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgeratingsIsMutable();
        ageratings_.add(value);
        onChanged();
      } else {
        ageratingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public Builder addAgeratings(
        int index, proto.AgeRating value) {
      if (ageratingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAgeratingsIsMutable();
        ageratings_.add(index, value);
        onChanged();
      } else {
        ageratingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public Builder addAgeratings(
        proto.AgeRating.Builder builderForValue) {
      if (ageratingsBuilder_ == null) {
        ensureAgeratingsIsMutable();
        ageratings_.add(builderForValue.build());
        onChanged();
      } else {
        ageratingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public Builder addAgeratings(
        int index, proto.AgeRating.Builder builderForValue) {
      if (ageratingsBuilder_ == null) {
        ensureAgeratingsIsMutable();
        ageratings_.add(index, builderForValue.build());
        onChanged();
      } else {
        ageratingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public Builder addAllAgeratings(
        java.lang.Iterable<? extends proto.AgeRating> values) {
      if (ageratingsBuilder_ == null) {
        ensureAgeratingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ageratings_);
        onChanged();
      } else {
        ageratingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public Builder clearAgeratings() {
      if (ageratingsBuilder_ == null) {
        ageratings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ageratingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public Builder removeAgeratings(int index) {
      if (ageratingsBuilder_ == null) {
        ensureAgeratingsIsMutable();
        ageratings_.remove(index);
        onChanged();
      } else {
        ageratingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public proto.AgeRating.Builder getAgeratingsBuilder(
        int index) {
      return getAgeratingsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public proto.AgeRatingOrBuilder getAgeratingsOrBuilder(
        int index) {
      if (ageratingsBuilder_ == null) {
        return ageratings_.get(index);  } else {
        return ageratingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public java.util.List<? extends proto.AgeRatingOrBuilder> 
         getAgeratingsOrBuilderList() {
      if (ageratingsBuilder_ != null) {
        return ageratingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ageratings_);
      }
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public proto.AgeRating.Builder addAgeratingsBuilder() {
      return getAgeratingsFieldBuilder().addBuilder(
          proto.AgeRating.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public proto.AgeRating.Builder addAgeratingsBuilder(
        int index) {
      return getAgeratingsFieldBuilder().addBuilder(
          index, proto.AgeRating.getDefaultInstance());
    }
    /**
     * <code>repeated .proto.AgeRating ageratings = 1;</code>
     */
    public java.util.List<proto.AgeRating.Builder> 
         getAgeratingsBuilderList() {
      return getAgeratingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.AgeRating, proto.AgeRating.Builder, proto.AgeRatingOrBuilder> 
        getAgeratingsFieldBuilder() {
      if (ageratingsBuilder_ == null) {
        ageratingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.AgeRating, proto.AgeRating.Builder, proto.AgeRatingOrBuilder>(
                ageratings_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ageratings_ = null;
      }
      return ageratingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:proto.AgeRatingResult)
  }

  // @@protoc_insertion_point(class_scope:proto.AgeRatingResult)
  private static final proto.AgeRatingResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.AgeRatingResult();
  }

  public static proto.AgeRatingResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AgeRatingResult>
      PARSER = new com.google.protobuf.AbstractParser<AgeRatingResult>() {
    @java.lang.Override
    public AgeRatingResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<AgeRatingResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AgeRatingResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.AgeRatingResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

