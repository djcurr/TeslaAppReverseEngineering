package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum u7 implements Internal.EnumLite {
    BACK_STACK_BEHAVIOR_UNKNOWN(0),
    BACK_STACK_BEHAVIOR_PERSISTENT(1),
    BACK_STACK_BEHAVIOR_TRANSIENT(2),
    UNRECOGNIZED(-1);
    
    public static final int BACK_STACK_BEHAVIOR_PERSISTENT_VALUE = 1;
    public static final int BACK_STACK_BEHAVIOR_TRANSIENT_VALUE = 2;
    public static final int BACK_STACK_BEHAVIOR_UNKNOWN_VALUE = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<u7> f19579b = new Internal.EnumLiteMap<u7>() { // from class: com.plaid.internal.u7.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public u7 findValueByNumber(int i11) {
            return u7.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f19581a;

    /* loaded from: classes2.dex */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f19582a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return u7.forNumber(i11) != null;
        }
    }

    u7(int i11) {
        this.f19581a = i11;
    }

    public static u7 forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return null;
                }
                return BACK_STACK_BEHAVIOR_TRANSIENT;
            }
            return BACK_STACK_BEHAVIOR_PERSISTENT;
        }
        return BACK_STACK_BEHAVIOR_UNKNOWN;
    }

    public static Internal.EnumLiteMap<u7> internalGetValueMap() {
        return f19579b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f19582a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f19581a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static u7 valueOf(int i11) {
        return forNumber(i11);
    }
}