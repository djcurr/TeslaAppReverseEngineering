package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum m1 implements Internal.EnumLite {
    TEXT_INPUT_TYPE_UNKNOWN(0),
    TEXT_INPUT_TYPE_TEXT(1),
    TEXT_INPUT_TYPE_NUMERIC(2),
    TEXT_INPUT_TYPE_CURRENCY(3),
    TEXT_INPUT_TYPE_MICRODEPOSIT(4),
    TEXT_INPUT_TYPE_EMAIL(5),
    TEXT_INPUT_TYPE_DATE(6),
    UNRECOGNIZED(-1);
    
    public static final int TEXT_INPUT_TYPE_CURRENCY_VALUE = 3;
    public static final int TEXT_INPUT_TYPE_DATE_VALUE = 6;
    public static final int TEXT_INPUT_TYPE_EMAIL_VALUE = 5;
    public static final int TEXT_INPUT_TYPE_MICRODEPOSIT_VALUE = 4;
    public static final int TEXT_INPUT_TYPE_NUMERIC_VALUE = 2;
    public static final int TEXT_INPUT_TYPE_TEXT_VALUE = 1;
    public static final int TEXT_INPUT_TYPE_UNKNOWN_VALUE = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<m1> f19000b = new Internal.EnumLiteMap<m1>() { // from class: com.plaid.internal.m1.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public m1 findValueByNumber(int i11) {
            return m1.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f19002a;

    /* loaded from: classes2.dex */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f19003a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return m1.forNumber(i11) != null;
        }
    }

    m1(int i11) {
        this.f19002a = i11;
    }

    public static m1 forNumber(int i11) {
        switch (i11) {
            case 0:
                return TEXT_INPUT_TYPE_UNKNOWN;
            case 1:
                return TEXT_INPUT_TYPE_TEXT;
            case 2:
                return TEXT_INPUT_TYPE_NUMERIC;
            case 3:
                return TEXT_INPUT_TYPE_CURRENCY;
            case 4:
                return TEXT_INPUT_TYPE_MICRODEPOSIT;
            case 5:
                return TEXT_INPUT_TYPE_EMAIL;
            case 6:
                return TEXT_INPUT_TYPE_DATE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<m1> internalGetValueMap() {
        return f19000b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f19003a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f19002a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static m1 valueOf(int i11) {
        return forNumber(i11);
    }
}