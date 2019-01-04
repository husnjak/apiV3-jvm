// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IGDBProtoFile.proto

package proto;

/**
 * Protobuf enum {@code proto.AgeRatingRatingEnum}
 */
public enum AgeRatingRatingEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AGERATING_RATING_NULL = 0;</code>
   */
  AGERATING_RATING_NULL(0),
  /**
   * <code>THREE = 1;</code>
   */
  THREE(1),
  /**
   * <code>SEVEN = 2;</code>
   */
  SEVEN(2),
  /**
   * <code>TWELVE = 3;</code>
   */
  TWELVE(3),
  /**
   * <code>SIXTEEN = 4;</code>
   */
  SIXTEEN(4),
  /**
   * <code>EIGHTEEN = 5;</code>
   */
  EIGHTEEN(5),
  /**
   * <code>RP = 6;</code>
   */
  RP(6),
  /**
   * <code>EC = 7;</code>
   */
  EC(7),
  /**
   * <code>E = 8;</code>
   */
  E(8),
  /**
   * <code>E10 = 9;</code>
   */
  E10(9),
  /**
   * <code>T = 10;</code>
   */
  T(10),
  /**
   * <code>M = 11;</code>
   */
  M(11),
  /**
   * <code>AO = 12;</code>
   */
  AO(12),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>AGERATING_RATING_NULL = 0;</code>
   */
  public static final int AGERATING_RATING_NULL_VALUE = 0;
  /**
   * <code>THREE = 1;</code>
   */
  public static final int THREE_VALUE = 1;
  /**
   * <code>SEVEN = 2;</code>
   */
  public static final int SEVEN_VALUE = 2;
  /**
   * <code>TWELVE = 3;</code>
   */
  public static final int TWELVE_VALUE = 3;
  /**
   * <code>SIXTEEN = 4;</code>
   */
  public static final int SIXTEEN_VALUE = 4;
  /**
   * <code>EIGHTEEN = 5;</code>
   */
  public static final int EIGHTEEN_VALUE = 5;
  /**
   * <code>RP = 6;</code>
   */
  public static final int RP_VALUE = 6;
  /**
   * <code>EC = 7;</code>
   */
  public static final int EC_VALUE = 7;
  /**
   * <code>E = 8;</code>
   */
  public static final int E_VALUE = 8;
  /**
   * <code>E10 = 9;</code>
   */
  public static final int E10_VALUE = 9;
  /**
   * <code>T = 10;</code>
   */
  public static final int T_VALUE = 10;
  /**
   * <code>M = 11;</code>
   */
  public static final int M_VALUE = 11;
  /**
   * <code>AO = 12;</code>
   */
  public static final int AO_VALUE = 12;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AgeRatingRatingEnum valueOf(int value) {
    return forNumber(value);
  }

  public static AgeRatingRatingEnum forNumber(int value) {
    switch (value) {
      case 0: return AGERATING_RATING_NULL;
      case 1: return THREE;
      case 2: return SEVEN;
      case 3: return TWELVE;
      case 4: return SIXTEEN;
      case 5: return EIGHTEEN;
      case 6: return RP;
      case 7: return EC;
      case 8: return E;
      case 9: return E10;
      case 10: return T;
      case 11: return M;
      case 12: return AO;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AgeRatingRatingEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AgeRatingRatingEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AgeRatingRatingEnum>() {
          public AgeRatingRatingEnum findValueByNumber(int number) {
            return AgeRatingRatingEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return proto.IGDBProtoFile.getDescriptor().getEnumTypes().get(4);
  }

  private static final AgeRatingRatingEnum[] VALUES = values();

  public static AgeRatingRatingEnum valueOf(
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

  private AgeRatingRatingEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.AgeRatingRatingEnum)
}
