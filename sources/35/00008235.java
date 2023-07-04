package l3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final float f36515a;

    /* renamed from: b  reason: collision with root package name */
    private final float f36516b;

    /* renamed from: c  reason: collision with root package name */
    private final float f36517c;

    /* renamed from: d  reason: collision with root package name */
    private final float f36518d;

    /* renamed from: e  reason: collision with root package name */
    private final float f36519e;

    /* renamed from: f  reason: collision with root package name */
    private final float f36520f;

    a(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f36515a = f11;
        this.f36516b = f12;
        this.f36517c = f13;
        this.f36518d = f17;
        this.f36519e = f18;
        this.f36520f = f19;
    }

    private static a b(float f11, float f12, float f13) {
        float f14 = 1000.0f;
        float f15 = 0.0f;
        a aVar = null;
        float f16 = 100.0f;
        float f17 = 1000.0f;
        while (Math.abs(f15 - f16) > 0.01f) {
            float f18 = ((f16 - f15) / 2.0f) + f15;
            int p11 = e(f18, f12, f11).p();
            float b11 = b.b(p11);
            float abs = Math.abs(f13 - b11);
            if (abs < 0.2f) {
                a c11 = c(p11);
                float a11 = c11.a(e(c11.k(), c11.i(), f11));
                if (a11 <= 1.0f) {
                    aVar = c11;
                    f14 = abs;
                    f17 = a11;
                }
            }
            if (f14 == BitmapDescriptorFactory.HUE_RED && f17 == BitmapDescriptorFactory.HUE_RED) {
                break;
            } else if (b11 < f13) {
                f15 = f18;
            } else {
                f16 = f18;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a c(int i11) {
        return d(i11, j.f36556k);
    }

    static a d(int i11, j jVar) {
        float pow;
        float[] f11 = b.f(i11);
        float[][] fArr = b.f36521a;
        float f12 = (f11[0] * fArr[0][0]) + (f11[1] * fArr[0][1]) + (f11[2] * fArr[0][2]);
        float f13 = (f11[0] * fArr[1][0]) + (f11[1] * fArr[1][1]) + (f11[2] * fArr[1][2]);
        float f14 = (f11[0] * fArr[2][0]) + (f11[1] * fArr[2][1]) + (f11[2] * fArr[2][2]);
        float f15 = jVar.i()[0] * f12;
        float f16 = jVar.i()[1] * f13;
        float f17 = jVar.i()[2] * f14;
        float pow2 = (float) Math.pow((jVar.c() * Math.abs(f15)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((jVar.c() * Math.abs(f16)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((jVar.c() * Math.abs(f17)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f17) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d11 = signum3;
        float f18 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d11)) / 11.0f;
        float f19 = ((float) ((signum + signum2) - (d11 * 2.0d))) / 9.0f;
        float f21 = signum2 * 20.0f;
        float f22 = (((signum * 20.0f) + f21) + (21.0f * signum3)) / 20.0f;
        float f23 = (((signum * 40.0f) + f21) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f19, f18)) * 180.0f) / 3.1415927f;
        if (atan2 < BitmapDescriptorFactory.HUE_RED) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f24 = atan2;
        float f25 = (3.1415927f * f24) / 180.0f;
        float pow5 = ((float) Math.pow((f23 * jVar.f()) / jVar.a(), jVar.b() * jVar.j())) * 100.0f;
        float d12 = jVar.d() * (4.0f / jVar.b()) * ((float) Math.sqrt(pow5 / 100.0f)) * (jVar.a() + 4.0f);
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, jVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f24) < 20.14d ? 360.0f + f24 : f24) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * jVar.g()) * jVar.h()) * ((float) Math.sqrt((f18 * f18) + (f19 * f19)))) / (f22 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float d13 = pow6 * jVar.d();
        float sqrt = ((float) Math.sqrt((pow * jVar.b()) / (jVar.a() + 4.0f))) * 50.0f;
        float f26 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * d13) + 1.0f)) * 43.85965f;
        double d14 = f25;
        return new a(f24, pow6, pow5, d12, d13, sqrt, f26, log * ((float) Math.cos(d14)), log * ((float) Math.sin(d14)));
    }

    private static a e(float f11, float f12, float f13) {
        return f(f11, f12, f13, j.f36556k);
    }

    private static a f(float f11, float f12, float f13, j jVar) {
        double d11;
        float b11 = (4.0f / jVar.b()) * ((float) Math.sqrt(f11 / 100.0d)) * (jVar.a() + 4.0f) * jVar.d();
        float d12 = f12 * jVar.d();
        float sqrt = ((float) Math.sqrt(((f12 / ((float) Math.sqrt(d11))) * jVar.b()) / (jVar.a() + 4.0f))) * 50.0f;
        float f14 = (1.7f * f11) / ((0.007f * f11) + 1.0f);
        float log = ((float) Math.log((d12 * 0.0228d) + 1.0d)) * 43.85965f;
        double d13 = (3.1415927f * f13) / 180.0f;
        return new a(f13, f12, f11, b11, d12, sqrt, f14, log * ((float) Math.cos(d13)), log * ((float) Math.sin(d13)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(float f11, float f12, float f13) {
        return n(f11, f12, f13, j.f36556k);
    }

    static int n(float f11, float f12, float f13, j jVar) {
        if (f12 >= 1.0d && Math.round(f13) > 0.0d && Math.round(f13) < 100.0d) {
            float min = f11 < BitmapDescriptorFactory.HUE_RED ? 0.0f : Math.min(360.0f, f11);
            a aVar = null;
            boolean z11 = true;
            float f14 = 0.0f;
            float f15 = f12;
            while (Math.abs(f14 - f12) >= 0.4f) {
                a b11 = b(min, f15, f13);
                if (z11) {
                    if (b11 != null) {
                        return b11.o(jVar);
                    }
                    z11 = false;
                } else if (b11 == null) {
                    f12 = f15;
                } else {
                    f14 = f15;
                    aVar = b11;
                }
                f15 = ((f12 - f14) / 2.0f) + f14;
            }
            if (aVar == null) {
                return b.a(f13);
            }
            return aVar.o(jVar);
        }
        return b.a(f13);
    }

    float a(a aVar) {
        float l11 = l() - aVar.l();
        float g11 = g() - aVar.g();
        float h11 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((l11 * l11) + (g11 * g11) + (h11 * h11)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f36519e;
    }

    float h() {
        return this.f36520f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f36516b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f36515a;
    }

    float k() {
        return this.f36517c;
    }

    float l() {
        return this.f36518d;
    }

    int o(j jVar) {
        float f11;
        float pow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? BitmapDescriptorFactory.HUE_RED : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, jVar.e()), 0.73d), 1.1111111111111112d);
        double j11 = (j() * 3.1415927f) / 180.0f;
        float a11 = jVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / jVar.b()) / jVar.j()));
        float cos = ((float) (Math.cos(2.0d + j11) + 3.8d)) * 0.25f * 3846.1538f * jVar.g() * jVar.h();
        float f12 = a11 / jVar.f();
        float sin = (float) Math.sin(j11);
        float cos2 = (float) Math.cos(j11);
        float f13 = (((0.305f + f12) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f14 = cos2 * f13;
        float f15 = f13 * sin;
        float f16 = f12 * 460.0f;
        float f17 = (((451.0f * f14) + f16) + (288.0f * f15)) / 1403.0f;
        float f18 = ((f16 - (891.0f * f14)) - (261.0f * f15)) / 1403.0f;
        float signum = Math.signum(f17) * (100.0f / jVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17))), 2.380952380952381d));
        float signum2 = Math.signum(f18) * (100.0f / jVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
        float signum3 = Math.signum(((f16 - (f14 * 220.0f)) - (f15 * 6300.0f)) / 1403.0f) * (100.0f / jVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
        float f19 = signum / jVar.i()[0];
        float f21 = signum2 / jVar.i()[1];
        float f22 = signum3 / jVar.i()[2];
        float[][] fArr = b.f36522b;
        return m3.a.b((fArr[0][0] * f19) + (fArr[0][1] * f21) + (fArr[0][2] * f22), (fArr[1][0] * f19) + (fArr[1][1] * f21) + (fArr[1][2] * f22), (f19 * fArr[2][0]) + (f21 * fArr[2][1]) + (f22 * fArr[2][2]));
    }

    int p() {
        return o(j.f36556k);
    }
}