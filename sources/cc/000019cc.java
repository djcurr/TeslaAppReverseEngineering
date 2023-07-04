package com.facebook.react.uimanager.layoutanimation;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class n implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float f12362a;

    public n(float f11) {
        this.f12362a = f11;
    }

    public static float a(ReadableMap readableMap) {
        if (readableMap.getType("springDamping").equals(ReadableType.Number)) {
            return (float) readableMap.getDouble("springDamping");
        }
        return 0.5f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        double pow = Math.pow(2.0d, (-10.0f) * f11);
        float f12 = this.f12362a;
        return (float) ((pow * Math.sin((((f11 - (f12 / 4.0f)) * 3.141592653589793d) * 2.0d) / f12)) + 1.0d);
    }
}