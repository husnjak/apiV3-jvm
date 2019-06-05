// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf type {@code proto.MultiQueryResult}
 */
public  final class MultiQueryResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:proto.MultiQueryResult)
    MultiQueryResultOrBuilder {
  // Use MultiQueryResult.newBuilder() to construct.
  private MultiQueryResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiQueryResult() {
    name_ = "";
    results_ = java.util.Collections.emptyList();
    count_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.IGDBProtoFile.internal_static_proto_MultiQueryResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.IGDBProtoFile.internal_static_proto_MultiQueryResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.MultiQueryResult.class, proto.MultiQueryResult.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>optional string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESULTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.protobuf.ByteString> results_;
  /**
   * <code>repeated bytes results = 2;</code>
   */
  public java.util.List<com.google.protobuf.ByteString>
      getResultsList() {
    return results_;
  }
  /**
   * <code>repeated bytes results = 2;</code>
   */
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <code>repeated bytes results = 2;</code>
   */
  public com.google.protobuf.ByteString getResults(int index) {
    return results_.get(index);
  }

  public static final int COUNT_FIELD_NUMBER = 3;
  private long count_;
  /**
   * <code>optional int64 count = 3;</code>
   */
  public long getCount() {
    return count_;
  }

  public static proto.MultiQueryResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.MultiQueryResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.MultiQueryResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.MultiQueryResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.MultiQueryResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.MultiQueryResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.MultiQueryResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.MultiQueryResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.MultiQueryResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.MultiQueryResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.MultiQueryResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code proto.MultiQueryResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.MultiQueryResult)
      proto.MultiQueryResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.IGDBProtoFile.internal_static_proto_MultiQueryResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.IGDBProtoFile.internal_static_proto_MultiQueryResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.MultiQueryResult.class, proto.MultiQueryResult.Builder.class);
    }

    // Construct using proto.MultiQueryResult.newBuilder()
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
    public Builder clear() {
      super.clear();
      name_ = "";

      results_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      count_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.IGDBProtoFile.internal_static_proto_MultiQueryResult_descriptor;
    }

    public proto.MultiQueryResult getDefaultInstanceForType() {
      return proto.MultiQueryResult.getDefaultInstance();
    }

    public proto.MultiQueryResult build() {
      proto.MultiQueryResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public proto.MultiQueryResult buildPartial() {
      proto.MultiQueryResult result = new proto.MultiQueryResult(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        results_ = java.util.Collections.unmodifiableList(results_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.results_ = results_;
      result.count_ = count_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.ByteString> results_ = java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        results_ = new java.util.ArrayList<com.google.protobuf.ByteString>(results_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated bytes results = 2;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getResultsList() {
      return java.util.Collections.unmodifiableList(results_);
    }
    /**
     * <code>repeated bytes results = 2;</code>
     */
    public int getResultsCount() {
      return results_.size();
    }
    /**
     * <code>repeated bytes results = 2;</code>
     */
    public com.google.protobuf.ByteString getResults(int index) {
      return results_.get(index);
    }
    /**
     * <code>repeated bytes results = 2;</code>
     */
    public Builder setResults(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureResultsIsMutable();
      results_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes results = 2;</code>
     */
    public Builder addResults(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureResultsIsMutable();
      results_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes results = 2;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureResultsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, results_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes results = 2;</code>
     */
    public Builder clearResults() {
      results_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private long count_ ;
    /**
     * <code>optional int64 count = 3;</code>
     */
    public long getCount() {
      return count_;
    }
    /**
     * <code>optional int64 count = 3;</code>
     */
    public Builder setCount(long value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 count = 3;</code>
     */
    public Builder clearCount() {
      
      count_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:proto.MultiQueryResult)
  }

  // @@protoc_insertion_point(class_scope:proto.MultiQueryResult)
  private static final proto.MultiQueryResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.MultiQueryResult();
  }

  public static proto.MultiQueryResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiQueryResult>
      PARSER = new com.google.protobuf.AbstractParser<MultiQueryResult>() {
    public MultiQueryResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<MultiQueryResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiQueryResult> getParserForType() {
    return PARSER;
  }

  public proto.MultiQueryResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
