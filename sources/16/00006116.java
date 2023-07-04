package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes6.dex */
public enum BatteryType implements ProtocolMessageEnum {
    BATTERY_TYPE_INVALID(0),
    BATTERY_TYPE_DC_POWERWALL(1),
    BATTERY_TYPE_AC_POWERWALL(2),
    BATTERY_TYPE_POWERPACK(3),
    BATTERY_TYPE_SOLAR_POWERWALL(4),
    UNRECOGNIZED(-1);
    
    public static final int BATTERY_TYPE_AC_POWERWALL_VALUE = 2;
    public static final int BATTERY_TYPE_DC_POWERWALL_VALUE = 1;
    public static final int BATTERY_TYPE_INVALID_VALUE = 0;
    public static final int BATTERY_TYPE_POWERPACK_VALUE = 3;
    public static final int BATTERY_TYPE_SOLAR_POWERWALL_VALUE = 4;
    private final int value;
    private static final Internal.EnumLiteMap<BatteryType> internalValueMap = new Internal.EnumLiteMap<BatteryType>() { // from class: com.tesla.proto.energy.powergate.v1.BatteryType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public BatteryType findValueByNumber(int i11) {
            return BatteryType.forNumber(i11);
        }
    };
    private static final BatteryType[] VALUES = values();

    BatteryType(int i11) {
        this.value = i11;
    }

    public static BatteryType forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return null;
                        }
                        return BATTERY_TYPE_SOLAR_POWERWALL;
                    }
                    return BATTERY_TYPE_POWERPACK;
                }
                return BATTERY_TYPE_AC_POWERWALL;
            }
            return BATTERY_TYPE_DC_POWERWALL;
        }
        return BATTERY_TYPE_INVALID;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Powergate.getDescriptor().getEnumTypes().get(0);
    }

    public static Internal.EnumLiteMap<BatteryType> internalGetValueMap() {
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
    public static BatteryType valueOf(int i11) {
        return forNumber(i11);
    }

    public static BatteryType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}