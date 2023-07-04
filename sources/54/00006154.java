package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes6.dex */
public enum WCState implements ProtocolMessageEnum {
    WC_STATE_INVALID(0),
    WC_STATE_CHARGING(1),
    WC_STATE_UNPLUGGED(2),
    WC_STATE_UNPLUGGED_FAULTED(3),
    WC_STATE_WAITING_FOR_VEHICLE(4),
    WC_STATE_TIME_RESTRICTED(5),
    WC_STATE_FAULT_CHARGING(6),
    WC_STATE_FAULT_NO_CHARGING(7),
    WC_STATE_OFFLINE(8),
    UNRECOGNIZED(-1);
    
    public static final int WC_STATE_CHARGING_VALUE = 1;
    public static final int WC_STATE_FAULT_CHARGING_VALUE = 6;
    public static final int WC_STATE_FAULT_NO_CHARGING_VALUE = 7;
    public static final int WC_STATE_INVALID_VALUE = 0;
    public static final int WC_STATE_OFFLINE_VALUE = 8;
    public static final int WC_STATE_TIME_RESTRICTED_VALUE = 5;
    public static final int WC_STATE_UNPLUGGED_FAULTED_VALUE = 3;
    public static final int WC_STATE_UNPLUGGED_VALUE = 2;
    public static final int WC_STATE_WAITING_FOR_VEHICLE_VALUE = 4;
    private final int value;
    private static final Internal.EnumLiteMap<WCState> internalValueMap = new Internal.EnumLiteMap<WCState>() { // from class: com.tesla.proto.energy.powergate.v1.WCState.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public WCState findValueByNumber(int i11) {
            return WCState.forNumber(i11);
        }
    };
    private static final WCState[] VALUES = values();

    WCState(int i11) {
        this.value = i11;
    }

    public static WCState forNumber(int i11) {
        switch (i11) {
            case 0:
                return WC_STATE_INVALID;
            case 1:
                return WC_STATE_CHARGING;
            case 2:
                return WC_STATE_UNPLUGGED;
            case 3:
                return WC_STATE_UNPLUGGED_FAULTED;
            case 4:
                return WC_STATE_WAITING_FOR_VEHICLE;
            case 5:
                return WC_STATE_TIME_RESTRICTED;
            case 6:
                return WC_STATE_FAULT_CHARGING;
            case 7:
                return WC_STATE_FAULT_NO_CHARGING;
            case 8:
                return WC_STATE_OFFLINE;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Powergate.getDescriptor().getEnumTypes().get(3);
    }

    public static Internal.EnumLiteMap<WCState> internalGetValueMap() {
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
    public static WCState valueOf(int i11) {
        return forNumber(i11);
    }

    public static WCState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}