package com.oney.WebRTCModule;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* loaded from: classes2.dex */
public class m {

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18056a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f18056a = iArr;
            try {
                iArr[ReadableType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18056a[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18056a[ReadableType.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String a(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str)) {
            int i11 = a.f18056a[readableMap.getType(str).ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return null;
                    }
                    return readableMap.getString(str);
                }
                return String.valueOf(readableMap.getDouble(str));
            }
            return String.valueOf(readableMap.getBoolean(str));
        }
        return null;
    }
}