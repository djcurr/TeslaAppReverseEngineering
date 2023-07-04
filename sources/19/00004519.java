package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum q1 implements Internal.EnumLite {
    CLIENT_TYPE_UNKNOWN(0),
    CLIENT_TYPE_ANDROID(1),
    CLIENT_TYPE_IOS(2),
    CLIENT_TYPE_WEB(3),
    CLIENT_TYPE_REACTNATIVEANDROID(4),
    CLIENT_TYPE_REACTNATIVEIOS(5),
    UNRECOGNIZED(-1);
    
    public static final int CLIENT_TYPE_ANDROID_VALUE = 1;
    public static final int CLIENT_TYPE_IOS_VALUE = 2;
    public static final int CLIENT_TYPE_REACTNATIVEANDROID_VALUE = 4;
    public static final int CLIENT_TYPE_REACTNATIVEIOS_VALUE = 5;
    public static final int CLIENT_TYPE_UNKNOWN_VALUE = 0;
    public static final int CLIENT_TYPE_WEB_VALUE = 3;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<q1> f19281b = new Internal.EnumLiteMap<q1>() { // from class: com.plaid.internal.q1.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public q1 findValueByNumber(int i11) {
            return q1.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f19283a;

    /* loaded from: classes2.dex */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f19284a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return q1.forNumber(i11) != null;
        }
    }

    q1(int i11) {
        this.f19283a = i11;
    }

    public static q1 forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                return null;
                            }
                            return CLIENT_TYPE_REACTNATIVEIOS;
                        }
                        return CLIENT_TYPE_REACTNATIVEANDROID;
                    }
                    return CLIENT_TYPE_WEB;
                }
                return CLIENT_TYPE_IOS;
            }
            return CLIENT_TYPE_ANDROID;
        }
        return CLIENT_TYPE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<q1> internalGetValueMap() {
        return f19281b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f19284a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f19283a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static q1 valueOf(int i11) {
        return forNumber(i11);
    }
}