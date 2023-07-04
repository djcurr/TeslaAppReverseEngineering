package com.facebook.yoga;

/* loaded from: classes3.dex */
public class o {
    public static long a(float f11, float f12) {
        int floatToRawIntBits = Float.floatToRawIntBits(f11);
        return Float.floatToRawIntBits(f12) | (floatToRawIntBits << 32);
    }

    public static long b(int i11, int i12) {
        return a(i11, i12);
    }
}