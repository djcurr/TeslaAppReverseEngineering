package gk;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f27993a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f27994b = new i4.b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f27995c = new i4.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f27996d = new i4.c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f27997e = new DecelerateInterpolator();

    public static float a(float f11, float f12, float f13) {
        return f11 + (f13 * (f12 - f11));
    }

    public static float b(float f11, float f12, float f13, float f14, float f15) {
        return f15 < f13 ? f11 : f15 > f14 ? f12 : a(f11, f12, (f15 - f13) / (f14 - f13));
    }
}