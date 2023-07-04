package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum h0 implements Internal.EnumLite {
    TABLE_ROW_STYLE_UNKNOWN(0),
    TABLE_ROW_STYLE_LEADING_LABEL(1),
    TABLE_ROW_STYLE_TRAILING_LABEL(2),
    UNRECOGNIZED(-1);
    
    public static final int TABLE_ROW_STYLE_LEADING_LABEL_VALUE = 1;
    public static final int TABLE_ROW_STYLE_TRAILING_LABEL_VALUE = 2;
    public static final int TABLE_ROW_STYLE_UNKNOWN_VALUE = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<h0> f18682b = new Internal.EnumLiteMap<h0>() { // from class: com.plaid.internal.h0.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public h0 findValueByNumber(int i11) {
            return h0.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f18684a;

    /* loaded from: classes2.dex */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f18685a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return h0.forNumber(i11) != null;
        }
    }

    h0(int i11) {
        this.f18684a = i11;
    }

    public static h0 forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return null;
                }
                return TABLE_ROW_STYLE_TRAILING_LABEL;
            }
            return TABLE_ROW_STYLE_LEADING_LABEL;
        }
        return TABLE_ROW_STYLE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<h0> internalGetValueMap() {
        return f18682b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f18685a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f18684a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static h0 valueOf(int i11) {
        return forNumber(i11);
    }
}