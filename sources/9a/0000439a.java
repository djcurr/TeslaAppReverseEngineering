package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum e1 implements Internal.EnumLite {
    BUTTON_WEIGHT_UNKNOWN(0),
    BUTTON_WEIGHT_PRIMARY(1),
    BUTTON_WEIGHT_SECONDARY(2),
    BUTTON_WEIGHT_TERTIARY(3),
    UNRECOGNIZED(-1);
    
    public static final int BUTTON_WEIGHT_PRIMARY_VALUE = 1;
    public static final int BUTTON_WEIGHT_SECONDARY_VALUE = 2;
    public static final int BUTTON_WEIGHT_TERTIARY_VALUE = 3;
    public static final int BUTTON_WEIGHT_UNKNOWN_VALUE = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<e1> f18514b = new Internal.EnumLiteMap<e1>() { // from class: com.plaid.internal.e1.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public e1 findValueByNumber(int i11) {
            return e1.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f18516a;

    /* loaded from: classes2.dex */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f18517a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return e1.forNumber(i11) != null;
        }
    }

    e1(int i11) {
        this.f18516a = i11;
    }

    public static e1 forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return null;
                    }
                    return BUTTON_WEIGHT_TERTIARY;
                }
                return BUTTON_WEIGHT_SECONDARY;
            }
            return BUTTON_WEIGHT_PRIMARY;
        }
        return BUTTON_WEIGHT_UNKNOWN;
    }

    public static Internal.EnumLiteMap<e1> internalGetValueMap() {
        return f18514b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f18517a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f18516a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static e1 valueOf(int i11) {
        return forNumber(i11);
    }
}