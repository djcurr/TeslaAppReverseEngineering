package com.facebook.react.uimanager;

/* loaded from: classes3.dex */
public class e {
    public static boolean a(float f11, float f12) {
        return (Float.isNaN(f11) || Float.isNaN(f12)) ? Float.isNaN(f11) && Float.isNaN(f12) : Math.abs(f12 - f11) < 1.0E-5f;
    }
}