// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf enum {@code proto.GameStatusEnum}
 */
public enum GameStatusEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>RELEASED = 0;</code>
   */
  RELEASED(0),
  /**
   * <code>ALPHA = 2;</code>
   */
  ALPHA(2),
  /**
   * <code>BETA = 3;</code>
   */
  BETA(3),
  /**
   * <code>EARLY_ACCESS = 4;</code>
   */
  EARLY_ACCESS(4),
  /**
   * <code>OFFLINE = 5;</code>
   */
  OFFLINE(5),
  /**
   * <code>CANCELLED = 6;</code>
   */
  CANCELLED(6),
  /**
   * <code>RUMORED = 7;</code>
   */
  RUMORED(7),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>RELEASED = 0;</code>
   */
  public static final int RELEASED_VALUE = 0;
  /**
   * <code>ALPHA = 2;</code>
   */
  public static final int ALPHA_VALUE = 2;
  /**
   * <code>BETA = 3;</code>
   */
  public static final int BETA_VALUE = 3;
  /**
   * <code>EARLY_ACCESS = 4;</code>
   */
  public static final int EARLY_ACCESS_VALUE = 4;
  /**
   * <code>OFFLINE = 5;</code>
   */
  public static final int OFFLINE_VALUE = 5;
  /**
   * <code>CANCELLED = 6;</code>
   */
  public static final int CANCELLED_VALUE = 6;
  /**
   * <code>RUMORED = 7;</code>
   */
  public static final int RUMORED_VALUE = 7;


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
  public static GameStatusEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GameStatusEnum forNumber(int value) {
    switch (value) {
      case 0: return RELEASED;
      case 2: return ALPHA;
      case 3: return BETA;
      case 4: return EARLY_ACCESS;
      case 5: return OFFLINE;
      case 6: return CANCELLED;
      case 7: return RUMORED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GameStatusEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GameStatusEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GameStatusEnum>() {
          public GameStatusEnum findValueByNumber(int number) {
            return GameStatusEnum.forNumber(number);
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
    return proto.Igdbproto.getDescriptor().getEnumTypes().get(9);
  }

  private static final GameStatusEnum[] VALUES = values();

  public static GameStatusEnum valueOf(
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

  private GameStatusEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.GameStatusEnum)
}

