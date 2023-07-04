package com.google.android.material.bottomappbar;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import wk.f;
import wk.m;

/* loaded from: classes3.dex */
public class a extends f implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private float f14947a;

    /* renamed from: b  reason: collision with root package name */
    private float f14948b;

    /* renamed from: c  reason: collision with root package name */
    private float f14949c;

    /* renamed from: d  reason: collision with root package name */
    private float f14950d;

    /* renamed from: e  reason: collision with root package name */
    private float f14951e;

    /* renamed from: f  reason: collision with root package name */
    private float f14952f;

    @Override // wk.f
    public void b(float f11, float f12, float f13, m mVar) {
        float f14;
        float f15;
        float f16 = this.f14949c;
        if (f16 == BitmapDescriptorFactory.HUE_RED) {
            mVar.m(f11, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f17 = ((this.f14948b * 2.0f) + f16) / 2.0f;
        float f18 = f13 * this.f14947a;
        float f19 = f12 + this.f14951e;
        float f21 = (this.f14950d * f13) + ((1.0f - f13) * f17);
        if (f21 / f17 >= 1.0f) {
            mVar.m(f11, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f22 = this.f14952f;
        float f23 = f22 * f13;
        boolean z11 = f22 == -1.0f || Math.abs((f22 * 2.0f) - f16) < 0.1f;
        if (z11) {
            f14 = f21;
            f15 = 0.0f;
        } else {
            f15 = 1.75f;
            f14 = 0.0f;
        }
        float f24 = f17 + f18;
        float f25 = f14 + f18;
        float sqrt = (float) Math.sqrt((f24 * f24) - (f25 * f25));
        float f26 = f19 - sqrt;
        float f27 = f19 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f25));
        float f28 = (90.0f - degrees) + f15;
        mVar.m(f26, BitmapDescriptorFactory.HUE_RED);
        float f29 = f18 * 2.0f;
        mVar.a(f26 - f18, BitmapDescriptorFactory.HUE_RED, f26 + f18, f29, 270.0f, degrees);
        if (z11) {
            mVar.a(f19 - f17, (-f17) - f14, f19 + f17, f17 - f14, 180.0f - f28, (f28 * 2.0f) - 180.0f);
        } else {
            float f31 = this.f14948b;
            float f32 = f23 * 2.0f;
            float f33 = f19 - f17;
            mVar.a(f33, -(f23 + f31), f33 + f31 + f32, f31 + f23, 180.0f - f28, ((f28 * 2.0f) - 180.0f) / 2.0f);
            float f34 = f19 + f17;
            float f35 = this.f14948b;
            mVar.m(f34 - ((f35 / 2.0f) + f23), f35 + f23);
            float f36 = this.f14948b;
            mVar.a(f34 - (f32 + f36), -(f23 + f36), f34, f36 + f23, 90.0f, f28 - 90.0f);
        }
        mVar.a(f27 - f18, BitmapDescriptorFactory.HUE_RED, f27 + f18, f29, 270.0f - degrees, degrees);
        mVar.m(f11, BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f14950d;
    }

    public float d() {
        return this.f14952f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        return this.f14948b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float f() {
        return this.f14947a;
    }

    public float g() {
        return this.f14949c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(float f11) {
        if (f11 >= BitmapDescriptorFactory.HUE_RED) {
            this.f14950d = f11;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void i(float f11) {
        this.f14952f = f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(float f11) {
        this.f14948b = f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(float f11) {
        this.f14947a = f11;
    }

    public void l(float f11) {
        this.f14949c = f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(float f11) {
        this.f14951e = f11;
    }
}