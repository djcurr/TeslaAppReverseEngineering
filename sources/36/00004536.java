package com.plaid.internal;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum r1 implements Internal.EnumLite {
    INTEGRATION_MODE_UNKNOWN(0),
    INTEGRATION_MODE_IFRAME(1),
    INTEGRATION_MODE_WEBVIEW(2),
    INTEGRATION_MODE_IOS_SDK_WEBVIEW(3),
    INTEGRATION_MODE_ANDROID_SDK_WEBVIEW(4),
    INTEGRATION_MODE_IOS_SDK_OUT_OF_PROCESS_WEBVIEW(5),
    INTEGRATION_MODE_ANDROID_SDK_OUT_OF_PROCESS_WEBVIEW(6),
    INTEGRATION_MODE_TAB_WINDOW(7),
    INTEGRATION_MODE_REDIRECT_URI(8),
    INTEGRATION_MODE_TRUSTED_AUTH_FRONT_END(9),
    INTEGRATION_MODE_HOSTED_TRUSTED_AUTH_FRONT_END(10),
    UNRECOGNIZED(-1);
    
    public static final int INTEGRATION_MODE_ANDROID_SDK_OUT_OF_PROCESS_WEBVIEW_VALUE = 6;
    public static final int INTEGRATION_MODE_ANDROID_SDK_WEBVIEW_VALUE = 4;
    public static final int INTEGRATION_MODE_HOSTED_TRUSTED_AUTH_FRONT_END_VALUE = 10;
    public static final int INTEGRATION_MODE_IFRAME_VALUE = 1;
    public static final int INTEGRATION_MODE_IOS_SDK_OUT_OF_PROCESS_WEBVIEW_VALUE = 5;
    public static final int INTEGRATION_MODE_IOS_SDK_WEBVIEW_VALUE = 3;
    public static final int INTEGRATION_MODE_REDIRECT_URI_VALUE = 8;
    public static final int INTEGRATION_MODE_TAB_WINDOW_VALUE = 7;
    public static final int INTEGRATION_MODE_TRUSTED_AUTH_FRONT_END_VALUE = 9;
    public static final int INTEGRATION_MODE_UNKNOWN_VALUE = 0;
    public static final int INTEGRATION_MODE_WEBVIEW_VALUE = 2;

    /* renamed from: b  reason: collision with root package name */
    public static final Internal.EnumLiteMap<r1> f19338b = new Internal.EnumLiteMap<r1>() { // from class: com.plaid.internal.r1.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public r1 findValueByNumber(int i11) {
            return r1.forNumber(i11);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final int f19340a;

    /* loaded from: classes2.dex */
    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f19341a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i11) {
            return r1.forNumber(i11) != null;
        }
    }

    r1(int i11) {
        this.f19340a = i11;
    }

    public static r1 forNumber(int i11) {
        switch (i11) {
            case 0:
                return INTEGRATION_MODE_UNKNOWN;
            case 1:
                return INTEGRATION_MODE_IFRAME;
            case 2:
                return INTEGRATION_MODE_WEBVIEW;
            case 3:
                return INTEGRATION_MODE_IOS_SDK_WEBVIEW;
            case 4:
                return INTEGRATION_MODE_ANDROID_SDK_WEBVIEW;
            case 5:
                return INTEGRATION_MODE_IOS_SDK_OUT_OF_PROCESS_WEBVIEW;
            case 6:
                return INTEGRATION_MODE_ANDROID_SDK_OUT_OF_PROCESS_WEBVIEW;
            case 7:
                return INTEGRATION_MODE_TAB_WINDOW;
            case 8:
                return INTEGRATION_MODE_REDIRECT_URI;
            case 9:
                return INTEGRATION_MODE_TRUSTED_AUTH_FRONT_END;
            case 10:
                return INTEGRATION_MODE_HOSTED_TRUSTED_AUTH_FRONT_END;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<r1> internalGetValueMap() {
        return f19338b;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f19341a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f19340a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static r1 valueOf(int i11) {
        return forNumber(i11);
    }
}