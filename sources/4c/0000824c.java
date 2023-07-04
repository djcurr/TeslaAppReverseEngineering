package l3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class j {

    /* renamed from: k  reason: collision with root package name */
    static final j f36556k = k(b.f36523c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a  reason: collision with root package name */
    private final float f36557a;

    /* renamed from: b  reason: collision with root package name */
    private final float f36558b;

    /* renamed from: c  reason: collision with root package name */
    private final float f36559c;

    /* renamed from: d  reason: collision with root package name */
    private final float f36560d;

    /* renamed from: e  reason: collision with root package name */
    private final float f36561e;

    /* renamed from: f  reason: collision with root package name */
    private final float f36562f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f36563g;

    /* renamed from: h  reason: collision with root package name */
    private final float f36564h;

    /* renamed from: i  reason: collision with root package name */
    private final float f36565i;

    /* renamed from: j  reason: collision with root package name */
    private final float f36566j;

    private j(float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr, float f17, float f18, float f19) {
        this.f36562f = f11;
        this.f36557a = f12;
        this.f36558b = f13;
        this.f36559c = f14;
        this.f36560d = f15;
        this.f36561e = f16;
        this.f36563g = fArr;
        this.f36564h = f17;
        this.f36565i = f18;
        this.f36566j = f19;
    }

    static j k(float[] fArr, float f11, float f12, float f13, boolean z11) {
        float[][] fArr2 = b.f36521a;
        float f14 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f15 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f16 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f17 = (f13 / 10.0f) + 0.8f;
        float d11 = ((double) f17) >= 0.9d ? b.d(0.59f, 0.69f, (f17 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f17 - 0.8f) * 10.0f);
        float exp = z11 ? 1.0f : (1.0f - (((float) Math.exp(((-f11) - 42.0f) / 92.0f)) * 0.2777778f)) * f17;
        double d12 = exp;
        if (d12 > 1.0d) {
            exp = 1.0f;
        } else if (d12 < 0.0d) {
            exp = BitmapDescriptorFactory.HUE_RED;
        }
        float[] fArr3 = {(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp};
        float f18 = 1.0f / ((5.0f * f11) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f21 = 1.0f - f19;
        float cbrt = (f19 * f11) + (0.1f * f21 * f21 * ((float) Math.cbrt(f11 * 5.0d)));
        float h11 = b.h(f12) / fArr[1];
        double d13 = h11;
        float sqrt = ((float) Math.sqrt(d13)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d13, 0.2d));
        float[] fArr4 = {(float) Math.pow(((fArr3[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr3[1] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr3[2] * cbrt) * f16) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new j(h11, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, d11, f17, fArr3, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a() {
        return this.f36557a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.f36560d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f36564h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.f36565i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        return this.f36562f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float f() {
        return this.f36558b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.f36561e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float h() {
        return this.f36559c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float[] i() {
        return this.f36563g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f36566j;
    }
}