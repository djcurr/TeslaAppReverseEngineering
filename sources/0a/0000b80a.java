package uo;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final float f53635a;

    /* renamed from: b  reason: collision with root package name */
    private final float f53636b;

    /* renamed from: c  reason: collision with root package name */
    private final float f53637c;

    /* renamed from: d  reason: collision with root package name */
    private final float f53638d;

    /* renamed from: e  reason: collision with root package name */
    private final float f53639e;

    /* renamed from: f  reason: collision with root package name */
    private final float f53640f;

    /* renamed from: g  reason: collision with root package name */
    private final float f53641g;

    /* renamed from: h  reason: collision with root package name */
    private final float f53642h;

    /* renamed from: i  reason: collision with root package name */
    private final float f53643i;

    private k(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f53635a = f11;
        this.f53636b = f14;
        this.f53637c = f17;
        this.f53638d = f12;
        this.f53639e = f15;
        this.f53640f = f18;
        this.f53641g = f13;
        this.f53642h = f16;
        this.f53643i = f19;
    }

    public static k b(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, float f27) {
        return d(f19, f21, f22, f23, f24, f25, f26, f27).e(c(f11, f12, f13, f14, f15, f16, f17, f18));
    }

    public static k c(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        return d(f11, f12, f13, f14, f15, f16, f17, f18).a();
    }

    public static k d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        float f19 = ((f11 - f13) + f15) - f17;
        float f21 = ((f12 - f14) + f16) - f18;
        if (f19 == BitmapDescriptorFactory.HUE_RED && f21 == BitmapDescriptorFactory.HUE_RED) {
            return new k(f13 - f11, f15 - f13, f11, f14 - f12, f16 - f14, f12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        }
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = f14 - f16;
        float f25 = f18 - f16;
        float f26 = (f22 * f25) - (f23 * f24);
        float f27 = ((f25 * f19) - (f23 * f21)) / f26;
        float f28 = ((f22 * f21) - (f19 * f24)) / f26;
        return new k((f27 * f13) + (f13 - f11), (f28 * f17) + (f17 - f11), f11, (f14 - f12) + (f27 * f14), (f18 - f12) + (f28 * f18), f12, f27, f28, 1.0f);
    }

    k a() {
        float f11 = this.f53639e;
        float f12 = this.f53643i;
        float f13 = this.f53640f;
        float f14 = this.f53642h;
        float f15 = (f11 * f12) - (f13 * f14);
        float f16 = this.f53641g;
        float f17 = this.f53638d;
        float f18 = (f13 * f16) - (f17 * f12);
        float f19 = (f17 * f14) - (f11 * f16);
        float f21 = this.f53637c;
        float f22 = this.f53636b;
        float f23 = (f21 * f14) - (f22 * f12);
        float f24 = this.f53635a;
        return new k(f15, f18, f19, f23, (f12 * f24) - (f21 * f16), (f16 * f22) - (f14 * f24), (f22 * f13) - (f21 * f11), (f21 * f17) - (f13 * f24), (f24 * f11) - (f22 * f17));
    }

    k e(k kVar) {
        float f11 = this.f53635a;
        float f12 = kVar.f53635a;
        float f13 = this.f53638d;
        float f14 = kVar.f53636b;
        float f15 = this.f53641g;
        float f16 = kVar.f53637c;
        float f17 = (f11 * f12) + (f13 * f14) + (f15 * f16);
        float f18 = kVar.f53638d;
        float f19 = kVar.f53639e;
        float f21 = kVar.f53640f;
        float f22 = (f11 * f18) + (f13 * f19) + (f15 * f21);
        float f23 = kVar.f53641g;
        float f24 = kVar.f53642h;
        float f25 = kVar.f53643i;
        float f26 = (f11 * f23) + (f13 * f24) + (f15 * f25);
        float f27 = this.f53636b;
        float f28 = this.f53639e;
        float f29 = this.f53642h;
        float f31 = (f29 * f25) + (f27 * f23) + (f28 * f24);
        float f32 = this.f53637c;
        float f33 = this.f53640f;
        float f34 = (f12 * f32) + (f14 * f33);
        float f35 = this.f53643i;
        return new k(f17, f22, f26, (f27 * f12) + (f28 * f14) + (f29 * f16), (f27 * f18) + (f28 * f19) + (f29 * f21), f31, (f16 * f35) + f34, (f18 * f32) + (f19 * f33) + (f21 * f35), (f32 * f23) + (f33 * f24) + (f35 * f25));
    }

    public void f(float[] fArr) {
        int length = fArr.length;
        float f11 = this.f53635a;
        float f12 = this.f53636b;
        float f13 = this.f53637c;
        float f14 = this.f53638d;
        float f15 = this.f53639e;
        float f16 = this.f53640f;
        float f17 = this.f53641g;
        float f18 = this.f53642h;
        float f19 = this.f53643i;
        for (int i11 = 0; i11 < length; i11 += 2) {
            float f21 = fArr[i11];
            int i12 = i11 + 1;
            float f22 = fArr[i12];
            float f23 = (f13 * f21) + (f16 * f22) + f19;
            fArr[i11] = (((f11 * f21) + (f14 * f22)) + f17) / f23;
            fArr[i12] = (((f21 * f12) + (f22 * f15)) + f18) / f23;
        }
    }
}