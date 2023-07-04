package com.facebook.react.uimanager;

import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes3.dex */
public class p {
    public static float a(float f11) {
        return f11 / c.d().density;
    }

    public static float b(double d11) {
        return c((float) d11);
    }

    public static float c(float f11) {
        return TypedValue.applyDimension(1, f11, c.d());
    }

    public static float d(double d11) {
        return e((float) d11);
    }

    public static float e(float f11) {
        return f(f11, Float.NaN);
    }

    public static float f(float f11, float f12) {
        DisplayMetrics d11 = c.d();
        float f13 = d11.scaledDensity;
        float f14 = d11.density;
        float f15 = f13 / f14;
        if (f12 >= 1.0f && f12 < f15) {
            f13 = f14 * f12;
        }
        return f11 * f13;
    }
}