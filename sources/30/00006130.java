package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes6.dex */
public enum IslandStatus implements ProtocolMessageEnum {
    ISLAND_STATUS_INVALID(0),
    ISLAND_STATUS_ON_GRID(1),
    ISLAND_STATUS_TRANSITIONING_ON_GRID(2),
    ISLAND_STATUS_TRANSITIONING_OFF_GRID(3),
    ISLAND_STATUS_OFF_GRID_INTENTIONAL(4),
    ISLAND_STATUS_OFF_GRID_UNINTENTIONAL(5),
    ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_OVERLOAD(6),
    ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_WAIT_FOR_SOLAR(7),
    ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_WAIT_FOR_USER(8),
    ISLAND_STATUS_ISLAND_STATUS_UNKNOWN(9),
    ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_WAIT_FOR_JUMP_START(10),
    UNRECOGNIZED(-1);
    
    public static final int ISLAND_STATUS_INVALID_VALUE = 0;
    public static final int ISLAND_STATUS_ISLAND_STATUS_UNKNOWN_VALUE = 9;
    public static final int ISLAND_STATUS_OFF_GRID_INTENTIONAL_VALUE = 4;
    public static final int ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_OVERLOAD_VALUE = 6;
    public static final int ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_VALUE = 5;
    public static final int ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_WAIT_FOR_JUMP_START_VALUE = 10;
    public static final int ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_WAIT_FOR_SOLAR_VALUE = 7;
    public static final int ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_WAIT_FOR_USER_VALUE = 8;
    public static final int ISLAND_STATUS_ON_GRID_VALUE = 1;
    public static final int ISLAND_STATUS_TRANSITIONING_OFF_GRID_VALUE = 3;
    public static final int ISLAND_STATUS_TRANSITIONING_ON_GRID_VALUE = 2;
    private final int value;
    private static final Internal.EnumLiteMap<IslandStatus> internalValueMap = new Internal.EnumLiteMap<IslandStatus>() { // from class: com.tesla.proto.energy.powergate.v1.IslandStatus.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public IslandStatus findValueByNumber(int i11) {
            return IslandStatus.forNumber(i11);
        }
    };
    private static final IslandStatus[] VALUES = values();

    IslandStatus(int i11) {
        this.value = i11;
    }

    public static IslandStatus forNumber(int i11) {
        switch (i11) {
            case 0:
                return ISLAND_STATUS_INVALID;
            case 1:
                return ISLAND_STATUS_ON_GRID;
            case 2:
                return ISLAND_STATUS_TRANSITIONING_ON_GRID;
            case 3:
                return ISLAND_STATUS_TRANSITIONING_OFF_GRID;
            case 4:
                return ISLAND_STATUS_OFF_GRID_INTENTIONAL;
            case 5:
                return ISLAND_STATUS_OFF_GRID_UNINTENTIONAL;
            case 6:
                return ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_OVERLOAD;
            case 7:
                return ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_WAIT_FOR_SOLAR;
            case 8:
                return ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_WAIT_FOR_USER;
            case 9:
                return ISLAND_STATUS_ISLAND_STATUS_UNKNOWN;
            case 10:
                return ISLAND_STATUS_OFF_GRID_UNINTENTIONAL_WAIT_FOR_JUMP_START;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Powergate.getDescriptor().getEnumTypes().get(2);
    }

    public static Internal.EnumLiteMap<IslandStatus> internalGetValueMap() {
        return internalValueMap;
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.google.protobuf.ProtocolMessageEnum
    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this != UNRECOGNIZED) {
            return getDescriptor().getValues().get(ordinal());
        }
        throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
    }

    @Deprecated
    public static IslandStatus valueOf(int i11) {
        return forNumber(i11);
    }

    public static IslandStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}