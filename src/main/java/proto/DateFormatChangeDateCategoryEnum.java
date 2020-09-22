// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf enum {@code proto.DateFormatChangeDateCategoryEnum}
 */
public enum DateFormatChangeDateCategoryEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>YYYYMMMMDD = 0;</code>
   */
  YYYYMMMMDD(0),
  /**
   * <code>YYYYMMMM = 1;</code>
   */
  YYYYMMMM(1),
  /**
   * <code>YYYY = 2;</code>
   */
  YYYY(2),
  /**
   * <code>YYYYQ1 = 3;</code>
   */
  YYYYQ1(3),
  /**
   * <code>YYYYQ2 = 4;</code>
   */
  YYYYQ2(4),
  /**
   * <code>YYYYQ3 = 5;</code>
   */
  YYYYQ3(5),
  /**
   * <code>YYYYQ4 = 6;</code>
   */
  YYYYQ4(6),
  /**
   * <code>TBD = 7;</code>
   */
  TBD(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>YYYYMMMMDD = 0;</code>
   */
  public static final int YYYYMMMMDD_VALUE = 0;
  /**
   * <code>YYYYMMMM = 1;</code>
   */
  public static final int YYYYMMMM_VALUE = 1;
  /**
   * <code>YYYY = 2;</code>
   */
  public static final int YYYY_VALUE = 2;
  /**
   * <code>YYYYQ1 = 3;</code>
   */
  public static final int YYYYQ1_VALUE = 3;
  /**
   * <code>YYYYQ2 = 4;</code>
   */
  public static final int YYYYQ2_VALUE = 4;
  /**
   * <code>YYYYQ3 = 5;</code>
   */
  public static final int YYYYQ3_VALUE = 5;
  /**
   * <code>YYYYQ4 = 6;</code>
   */
  public static final int YYYYQ4_VALUE = 6;
  /**
   * <code>TBD = 7;</code>
   */
  public static final int TBD_VALUE = 7;


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
  public static DateFormatChangeDateCategoryEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DateFormatChangeDateCategoryEnum forNumber(int value) {
    switch (value) {
      case 0: return YYYYMMMMDD;
      case 1: return YYYYMMMM;
      case 2: return YYYY;
      case 3: return YYYYQ1;
      case 4: return YYYYQ2;
      case 5: return YYYYQ3;
      case 6: return YYYYQ4;
      case 7: return TBD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DateFormatChangeDateCategoryEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DateFormatChangeDateCategoryEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DateFormatChangeDateCategoryEnum>() {
          public DateFormatChangeDateCategoryEnum findValueByNumber(int number) {
            return DateFormatChangeDateCategoryEnum.forNumber(number);
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
    return proto.Igdbproto.getDescriptor().getEnumTypes().get(4);
  }

  private static final DateFormatChangeDateCategoryEnum[] VALUES = values();

  public static DateFormatChangeDateCategoryEnum valueOf(
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

  private DateFormatChangeDateCategoryEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.DateFormatChangeDateCategoryEnum)
}

