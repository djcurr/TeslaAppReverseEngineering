package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum i1 implements Internal.EnumLite {
    SDK_ENCRYPTION_SCHEME_UNKNOWN(0),
    SDK_ENCRYPTION_SCHEME_RSA_PKCS1(1),
    SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1(2),
    UNRECOGNIZED(-1);
    
    public static final int SDK_ENCRYPTION_SCHEME_RSA_PKCS1_VALUE = 1;
    public static final int SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1_VALUE = 2;
    public static final int SDK_ENCRYPTION_SCHEME_UNKNOWN_VALUE = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<i1> f18722b = new Internal.EnumLiteMap<i1>() { // from class: com.plaid.internal.i1.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public i1 findValueByNumber(int i11) {
            return i1.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f18724a;

    /* loaded from: classes2.dex */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f18725a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return i1.forNumber(i11) != null;
        }
    }

    i1(int i11) {
        this.f18724a = i11;
    }

    public static i1 forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return null;
                }
                return SDK_ENCRYPTION_SCHEME_RSA_SHA256_MGF1;
            }
            return SDK_ENCRYPTION_SCHEME_RSA_PKCS1;
        }
        return SDK_ENCRYPTION_SCHEME_UNKNOWN;
    }

    public static Internal.EnumLiteMap<i1> internalGetValueMap() {
        return f18722b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f18725a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f18724a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static i1 valueOf(int i11) {
        return forNumber(i11);
    }
}