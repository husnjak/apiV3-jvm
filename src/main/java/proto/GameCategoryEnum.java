// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/api/igdb/igdbproto.proto

package proto;

/**
 * Protobuf enum {@code proto.GameCategoryEnum}
 */
public enum GameCategoryEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MAIN_GAME = 0;</code>
   */
  MAIN_GAME(0),
  /**
   * <code>DLC_ADDON = 1;</code>
   */
  DLC_ADDON(1),
  /**
   * <code>EXPANSION = 2;</code>
   */
  EXPANSION(2),
  /**
   * <code>BUNDLE = 3;</code>
   */
  BUNDLE(3),
  /**
   * <code>STANDALONE_EXPANSION = 4;</code>
   */
  STANDALONE_EXPANSION(4),
  /**
   * <code>MOD = 5;</code>
   */
  MOD(5),
  /**
   * <code>EPISODE = 6;</code>
   */
  EPISODE(6),
  /**
   * <code>SEASON = 7;</code>
   */
  SEASON(7),
  /**
   * <code>REMAKE = 8;</code>
   */
  REMAKE(8),
  /**
   * <code>REMASTER = 9;</code>
   */
  REMASTER(9),
  /**
   * <code>EXPANDED_GAME = 10;</code>
   */
  EXPANDED_GAME(10),
  /**
   * <code>PORT = 11;</code>
   */
  PORT(11),
  /**
   * <code>FORK = 12;</code>
   */
  FORK(12),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MAIN_GAME = 0;</code>
   */
  public static final int MAIN_GAME_VALUE = 0;
  /**
   * <code>DLC_ADDON = 1;</code>
   */
  public static final int DLC_ADDON_VALUE = 1;
  /**
   * <code>EXPANSION = 2;</code>
   */
  public static final int EXPANSION_VALUE = 2;
  /**
   * <code>BUNDLE = 3;</code>
   */
  public static final int BUNDLE_VALUE = 3;
  /**
   * <code>STANDALONE_EXPANSION = 4;</code>
   */
  public static final int STANDALONE_EXPANSION_VALUE = 4;
  /**
   * <code>MOD = 5;</code>
   */
  public static final int MOD_VALUE = 5;
  /**
   * <code>EPISODE = 6;</code>
   */
  public static final int EPISODE_VALUE = 6;
  /**
   * <code>SEASON = 7;</code>
   */
  public static final int SEASON_VALUE = 7;
  /**
   * <code>REMAKE = 8;</code>
   */
  public static final int REMAKE_VALUE = 8;
  /**
   * <code>REMASTER = 9;</code>
   */
  public static final int REMASTER_VALUE = 9;
  /**
   * <code>EXPANDED_GAME = 10;</code>
   */
  public static final int EXPANDED_GAME_VALUE = 10;
  /**
   * <code>PORT = 11;</code>
   */
  public static final int PORT_VALUE = 11;
  /**
   * <code>FORK = 12;</code>
   */
  public static final int FORK_VALUE = 12;


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
  public static GameCategoryEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GameCategoryEnum forNumber(int value) {
    switch (value) {
      case 0: return MAIN_GAME;
      case 1: return DLC_ADDON;
      case 2: return EXPANSION;
      case 3: return BUNDLE;
      case 4: return STANDALONE_EXPANSION;
      case 5: return MOD;
      case 6: return EPISODE;
      case 7: return SEASON;
      case 8: return REMAKE;
      case 9: return REMASTER;
      case 10: return EXPANDED_GAME;
      case 11: return PORT;
      case 12: return FORK;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GameCategoryEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GameCategoryEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GameCategoryEnum>() {
          public GameCategoryEnum findValueByNumber(int number) {
            return GameCategoryEnum.forNumber(number);
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
    return proto.Igdbproto.getDescriptor().getEnumTypes().get(8);
  }

  private static final GameCategoryEnum[] VALUES = values();

  public static GameCategoryEnum valueOf(
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

  private GameCategoryEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.GameCategoryEnum)
}

