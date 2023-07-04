package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/* loaded from: classes6.dex */
public enum WCFaultStatusState implements ProtocolMessageEnum {
    WC_FAULT_STATUS_STATE_INVALID(0),
    WC_FAULT_STATUS_STATE_STARTUP(1),
    WC_FAULT_STATUS_STATE_READY(2),
    WC_FAULT_STATUS_STATE_CRITICAL_FAULT(3),
    WC_FAULT_STATUS_STATE_NON_CRITICAL_FAULT(4),
    WC_FAULT_STATUS_STATE_RETRY_PENDING(5),
    WC_FAULT_STATUS_STATE_LOCKOUT(6),
    WC_FAULT_STATUS_STATE_FOLDBACK(7),
    WC_FAULT_STATUS_STATE_CHARGING(8),
    WC_FAULT_STATUS_STATE_CONFIGURATION_REQUIRED(9),
    UNRECOGNIZED(-1);
    
    public static final int WC_FAULT_STATUS_STATE_CHARGING_VALUE = 8;
    public static final int WC_FAULT_STATUS_STATE_CONFIGURATION_REQUIRED_VALUE = 9;
    public static final int WC_FAULT_STATUS_STATE_CRITICAL_FAULT_VALUE = 3;
    public static final int WC_FAULT_STATUS_STATE_FOLDBACK_VALUE = 7;
    public static final int WC_FAULT_STATUS_STATE_INVALID_VALUE = 0;
    public static final int WC_FAULT_STATUS_STATE_LOCKOUT_VALUE = 6;
    public static final int WC_FAULT_STATUS_STATE_NON_CRITICAL_FAULT_VALUE = 4;
    public static final int WC_FAULT_STATUS_STATE_READY_VALUE = 2;
    public static final int WC_FAULT_STATUS_STATE_RETRY_PENDING_VALUE = 5;
    public static final int WC_FAULT_STATUS_STATE_STARTUP_VALUE = 1;
    private final int value;
    private static final Internal.EnumLiteMap<WCFaultStatusState> internalValueMap = new Internal.EnumLiteMap<WCFaultStatusState>() { // from class: com.tesla.proto.energy.powergate.v1.WCFaultStatusState.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public WCFaultStatusState findValueByNumber(int i11) {
            return WCFaultStatusState.forNumber(i11);
        }
    };
    private static final WCFaultStatusState[] VALUES = values();

    WCFaultStatusState(int i11) {
        this.value = i11;
    }

    public static WCFaultStatusState forNumber(int i11) {
        switch (i11) {
            case 0:
                return WC_FAULT_STATUS_STATE_INVALID;
            case 1:
                return WC_FAULT_STATUS_STATE_STARTUP;
            case 2:
                return WC_FAULT_STATUS_STATE_READY;
            case 3:
                return WC_FAULT_STATUS_STATE_CRITICAL_FAULT;
            case 4:
                return WC_FAULT_STATUS_STATE_NON_CRITICAL_FAULT;
            case 5:
                return WC_FAULT_STATUS_STATE_RETRY_PENDING;
            case 6:
                return WC_FAULT_STATUS_STATE_LOCKOUT;
            case 7:
                return WC_FAULT_STATUS_STATE_FOLDBACK;
            case 8:
                return WC_FAULT_STATUS_STATE_CHARGING;
            case 9:
                return WC_FAULT_STATUS_STATE_CONFIGURATION_REQUIRED;
            default:
                return null;
        }
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return Powergate.getDescriptor().getEnumTypes().get(4);
    }

    public static Internal.EnumLiteMap<WCFaultStatusState> internalGetValueMap() {
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
    public static WCFaultStatusState valueOf(int i11) {
        return forNumber(i11);
    }

    public static WCFaultStatusState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() == getDescriptor()) {
            if (enumValueDescriptor.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[enumValueDescriptor.getIndex()];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
}