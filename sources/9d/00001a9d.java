package com.facebook.react.views.view;

/* loaded from: classes3.dex */
public class b {
    public static int a(int i11) {
        int i12 = i11 >>> 24;
        if (i12 == 255) {
            return -1;
        }
        return i12 == 0 ? -2 : -3;
    }

    public static int b(int i11, int i12) {
        if (i12 == 255) {
            return i11;
        }
        if (i12 == 0) {
            return i11 & 16777215;
        }
        return (i11 & 16777215) | ((((i11 >>> 24) * (i12 + (i12 >> 7))) >> 8) << 24);
    }
}