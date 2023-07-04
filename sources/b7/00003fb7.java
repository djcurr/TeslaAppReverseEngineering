package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum b implements Internal.EnumLite {
    ALERT_LEVEL_DEFAULT(0),
    ALERT_LEVEL_HIGH(1),
    ALERT_LEVEL_LOW(2),
    ALERT_LEVEL_DISABLED(3),
    UNRECOGNIZED(-1);
    
    public static final int ALERT_LEVEL_DEFAULT_VALUE = 0;
    public static final int ALERT_LEVEL_DISABLED_VALUE = 3;
    public static final int ALERT_LEVEL_HIGH_VALUE = 1;
    public static final int ALERT_LEVEL_LOW_VALUE = 2;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<b> f18181b = new Internal.EnumLiteMap<b>() { // from class: com.plaid.internal.b.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public b findValueByNumber(int i11) {
            return b.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f18183a;

    /* renamed from: com.plaid.internal.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0326b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f18184a = new C0326b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return b.forNumber(i11) != null;
        }
    }

    b(int i11) {
        this.f18183a = i11;
    }

    public static b forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return null;
                    }
                    return ALERT_LEVEL_DISABLED;
                }
                return ALERT_LEVEL_LOW;
            }
            return ALERT_LEVEL_HIGH;
        }
        return ALERT_LEVEL_DEFAULT;
    }

    public static Internal.EnumLiteMap<b> internalGetValueMap() {
        return f18181b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return C0326b.f18184a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f18183a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static b valueOf(int i11) {
        return forNumber(i11);
    }
}