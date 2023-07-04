package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum id implements Internal.EnumLite {
    WEBVIEW_FALLBACK_MODE_UNKNOWN(0),
    WEBVIEW_FALLBACK_MODE_IN_PROCESS(1),
    WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS(2),
    UNRECOGNIZED(-1);
    
    public static final int WEBVIEW_FALLBACK_MODE_IN_PROCESS_VALUE = 1;
    public static final int WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS_VALUE = 2;
    public static final int WEBVIEW_FALLBACK_MODE_UNKNOWN_VALUE = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<id> f18848b = new Internal.EnumLiteMap<id>() { // from class: com.plaid.internal.id.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public id findValueByNumber(int i11) {
            return id.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f18850a;

    /* loaded from: classes2.dex */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f18851a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return id.forNumber(i11) != null;
        }
    }

    id(int i11) {
        this.f18850a = i11;
    }

    public static id forNumber(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return null;
                }
                return WEBVIEW_FALLBACK_MODE_OUT_OF_PROCESS;
            }
            return WEBVIEW_FALLBACK_MODE_IN_PROCESS;
        }
        return WEBVIEW_FALLBACK_MODE_UNKNOWN;
    }

    public static Internal.EnumLiteMap<id> internalGetValueMap() {
        return f18848b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f18851a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f18850a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static id valueOf(int i11) {
        return forNumber(i11);
    }
}