package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes6.dex */
public enum SolarType implements ProtocolMessageEnum {
    SOLAR_TYPE_INVALID(0),
    SOLAR_TYPE_PV_PANEL(1),
    SOLAR_TYPE_SOLARGLASS(2),
    UNRECOGNIZED(-1);
    
    public static final int SOLAR_TYPE_INVALID_VALUE = 0;
    public static final int SOLAR_TYPE_PV_PANEL_VALUE = 1;
    public static final int SOLAR_TYPE_SOLARGLASS_VALUE = 2;
    private final int value;
    private static final Internal.EnumLiteMap<SolarType> internalValueMap = new Internal.EnumLiteMap<SolarType>() { // from class: com.tesla.proto.energy.powergate.v1.SolarType.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public SolarType findValueByNumber(int i11) {
            return SolarType.forNumber(i11);
        }
    };
    private static final SolarType[] VALUES = values();

    SolarType(int i11) {
        this.value = i11;
    }

    public static SolarType forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return null;
                }
                return SOLAR_TYPE_SOLARGLASS;
            }
            return SOLAR_TYPE_PV_PANEL;
        }
        return SOLAR_TYPE_INVALID;
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Powergate.getDescriptor().getEnumTypes().get(1);
    }

    public static Internal.EnumLiteMap<SolarType> internalGetValueMap() {
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
    public static SolarType valueOf(int i11) {
        return forNumber(i11);
    }

    public static SolarType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}