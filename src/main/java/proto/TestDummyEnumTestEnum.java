// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf enum {@code proto.TestDummyEnumTestEnum}
 */
public enum TestDummyEnumTestEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TESTDUMMY_ENUM_TEST_NULL = 0;</code>
   */
  TESTDUMMY_ENUM_TEST_NULL(0),
  /**
   * <code>ENUM1 = 1;</code>
   */
  ENUM1(1),
  /**
   * <code>ENUM2 = 2;</code>
   */
  ENUM2(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TESTDUMMY_ENUM_TEST_NULL = 0;</code>
   */
  public static final int TESTDUMMY_ENUM_TEST_NULL_VALUE = 0;
  /**
   * <code>ENUM1 = 1;</code>
   */
  public static final int ENUM1_VALUE = 1;
  /**
   * <code>ENUM2 = 2;</code>
   */
  public static final int ENUM2_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TestDummyEnumTestEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TestDummyEnumTestEnum forNumber(int value) {
    switch (value) {
      case 0: return TESTDUMMY_ENUM_TEST_NULL;
      case 1: return ENUM1;
      case 2: return ENUM2;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TestDummyEnumTestEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TestDummyEnumTestEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TestDummyEnumTestEnum>() {
          public TestDummyEnumTestEnum findValueByNumber(int number) {
            return TestDummyEnumTestEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return proto.Igdbproto.getDescriptor().getEnumTypes().get(14);
  }

  private static final TestDummyEnumTestEnum[] VALUES = values();

  public static TestDummyEnumTestEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TestDummyEnumTestEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.TestDummyEnumTestEnum)
}

