package androidx.constraintlayout.motion.widget;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q implements Comparable<q> {

    /* renamed from: q  reason: collision with root package name */
    static String[] f3586q = {"position", "x", "y", Snapshot.WIDTH, Snapshot.HEIGHT, "pathRotate"};

    /* renamed from: a  reason: collision with root package name */
    c3.c f3587a;

    /* renamed from: c  reason: collision with root package name */
    float f3589c;

    /* renamed from: d  reason: collision with root package name */
    float f3590d;

    /* renamed from: e  reason: collision with root package name */
    float f3591e;

    /* renamed from: f  reason: collision with root package name */
    float f3592f;

    /* renamed from: g  reason: collision with root package name */
    float f3593g;

    /* renamed from: h  reason: collision with root package name */
    float f3594h;

    /* renamed from: j  reason: collision with root package name */
    int f3596j;

    /* renamed from: k  reason: collision with root package name */
    int f3597k;

    /* renamed from: l  reason: collision with root package name */
    m f3598l;

    /* renamed from: m  reason: collision with root package name */
    LinkedHashMap<String, androidx.constraintlayout.widget.a> f3599m;

    /* renamed from: n  reason: collision with root package name */
    int f3600n;

    /* renamed from: o  reason: collision with root package name */
    double[] f3601o;

    /* renamed from: p  reason: collision with root package name */
    double[] f3602p;

    /* renamed from: b  reason: collision with root package name */
    int f3588b = 0;

    /* renamed from: i  reason: collision with root package name */
    float f3595i = Float.NaN;

    public q() {
        int i11 = d.f3361f;
        this.f3596j = i11;
        this.f3597k = i11;
        this.f3598l = null;
        this.f3599m = new LinkedHashMap<>();
        this.f3600n = 0;
        this.f3601o = new double[18];
        this.f3602p = new double[18];
    }

    private boolean b(float f11, float f12) {
        return (Float.isNaN(f11) || Float.isNaN(f12)) ? Float.isNaN(f11) != Float.isNaN(f12) : Math.abs(f11 - f12) > 1.0E-6f;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(q qVar) {
        return Float.compare(this.f3590d, qVar.f3590d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(q qVar, boolean[] zArr, String[] strArr, boolean z11) {
        boolean b11 = b(this.f3591e, qVar.f3591e);
        boolean b12 = b(this.f3592f, qVar.f3592f);
        zArr[0] = zArr[0] | b(this.f3590d, qVar.f3590d);
        boolean z12 = b11 | b12 | z11;
        zArr[1] = zArr[1] | z12;
        zArr[2] = z12 | zArr[2];
        zArr[3] = zArr[3] | b(this.f3593g, qVar.f3593g);
        zArr[4] = b(this.f3594h, qVar.f3594h) | zArr[4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(double[] dArr, int[] iArr) {
        float[] fArr = {this.f3590d, this.f3591e, this.f3592f, this.f3593g, this.f3594h, this.f3595i};
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            if (iArr[i12] < 6) {
                dArr[i11] = fArr[iArr[i12]];
                i11++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(double d11, int[] iArr, double[] dArr, float[] fArr, int i11) {
        float f11 = this.f3591e;
        float f12 = this.f3592f;
        float f13 = this.f3593g;
        float f14 = this.f3594h;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f15 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                f11 = f15;
            } else if (i13 == 2) {
                f12 = f15;
            } else if (i13 == 3) {
                f13 = f15;
            } else if (i13 == 4) {
                f14 = f15;
            }
        }
        m mVar = this.f3598l;
        if (mVar != null) {
            float[] fArr2 = new float[2];
            mVar.h(d11, fArr2, new float[2]);
            float f16 = fArr2[0];
            float f17 = fArr2[1];
            double d12 = f16;
            double d13 = f11;
            double d14 = f12;
            f11 = (float) ((d12 + (Math.sin(d14) * d13)) - (f13 / 2.0f));
            f12 = (float) ((f17 - (d13 * Math.cos(d14))) - (f14 / 2.0f));
        }
        fArr[i11] = f11 + (f13 / 2.0f) + BitmapDescriptorFactory.HUE_RED;
        fArr[i11 + 1] = f12 + (f14 / 2.0f) + BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(double d11, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f11;
        float f12 = this.f3591e;
        float f13 = this.f3592f;
        float f14 = this.f3593g;
        float f15 = this.f3594h;
        float f16 = BitmapDescriptorFactory.HUE_RED;
        float f17 = BitmapDescriptorFactory.HUE_RED;
        float f18 = BitmapDescriptorFactory.HUE_RED;
        float f19 = BitmapDescriptorFactory.HUE_RED;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f21 = (float) dArr[i11];
            float f22 = (float) dArr2[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f12 = f21;
                f16 = f22;
            } else if (i12 == 2) {
                f13 = f21;
                f18 = f22;
            } else if (i12 == 3) {
                f14 = f21;
                f17 = f22;
            } else if (i12 == 4) {
                f15 = f21;
                f19 = f22;
            }
        }
        float f23 = 2.0f;
        float f24 = (f17 / 2.0f) + f16;
        float f25 = (f19 / 2.0f) + f18;
        m mVar = this.f3598l;
        if (mVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            mVar.h(d11, fArr3, fArr4);
            float f26 = fArr3[0];
            float f27 = fArr3[1];
            float f28 = fArr4[0];
            float f29 = fArr4[1];
            double d12 = f12;
            double d13 = f13;
            f11 = f14;
            double d14 = f16;
            double d15 = f18;
            float sin = (float) (f28 + (Math.sin(d13) * d14) + (Math.cos(d13) * d15));
            f25 = (float) ((f29 - (d14 * Math.cos(d13))) + (Math.sin(d13) * d15));
            f24 = sin;
            f12 = (float) ((f26 + (Math.sin(d13) * d12)) - (f14 / 2.0f));
            f13 = (float) ((f27 - (d12 * Math.cos(d13))) - (f15 / 2.0f));
            f23 = 2.0f;
        } else {
            f11 = f14;
        }
        fArr[0] = f12 + (f11 / f23) + BitmapDescriptorFactory.HUE_RED;
        fArr[1] = f13 + (f15 / f23) + BitmapDescriptorFactory.HUE_RED;
        fArr2[0] = f24;
        fArr2[1] = f25;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g(String str, double[] dArr, int i11) {
        androidx.constraintlayout.widget.a aVar = this.f3599m.get(str);
        int i12 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.g() == 1) {
            dArr[i11] = aVar.e();
            return 1;
        }
        int g11 = aVar.g();
        float[] fArr = new float[g11];
        aVar.f(fArr);
        while (i12 < g11) {
            dArr[i11] = fArr[i12];
            i12++;
            i11++;
        }
        return g11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h(String str) {
        androidx.constraintlayout.widget.a aVar = this.f3599m.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(int[] iArr, double[] dArr, float[] fArr, int i11) {
        float f11 = this.f3591e;
        float f12 = this.f3592f;
        float f13 = this.f3593g;
        float f14 = this.f3594h;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f15 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 == 1) {
                f11 = f15;
            } else if (i13 == 2) {
                f12 = f15;
            } else if (i13 == 3) {
                f13 = f15;
            } else if (i13 == 4) {
                f14 = f15;
            }
        }
        m mVar = this.f3598l;
        if (mVar != null) {
            float i14 = mVar.i();
            double d11 = f11;
            double d12 = f12;
            f12 = (float) ((this.f3598l.j() - (d11 * Math.cos(d12))) - (f14 / 2.0f));
            f11 = (float) ((i14 + (Math.sin(d12) * d11)) - (f13 / 2.0f));
        }
        float f16 = f13 + f11;
        float f17 = f14 + f12;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f18 = f11 + BitmapDescriptorFactory.HUE_RED;
        float f19 = f12 + BitmapDescriptorFactory.HUE_RED;
        float f21 = f16 + BitmapDescriptorFactory.HUE_RED;
        float f22 = f12 + BitmapDescriptorFactory.HUE_RED;
        float f23 = f16 + BitmapDescriptorFactory.HUE_RED;
        float f24 = f17 + BitmapDescriptorFactory.HUE_RED;
        float f25 = f11 + BitmapDescriptorFactory.HUE_RED;
        float f26 = f17 + BitmapDescriptorFactory.HUE_RED;
        int i15 = i11 + 1;
        fArr[i11] = f18;
        int i16 = i15 + 1;
        fArr[i15] = f19;
        int i17 = i16 + 1;
        fArr[i16] = f21;
        int i18 = i17 + 1;
        fArr[i17] = f22;
        int i19 = i18 + 1;
        fArr[i18] = f23;
        int i21 = i19 + 1;
        fArr[i19] = f24;
        fArr[i21] = f25;
        fArr[i21 + 1] = f26;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k(String str) {
        return this.f3599m.containsKey(str);
    }

    void l(h hVar, q qVar, q qVar2) {
        float f11 = hVar.f3362a / 100.0f;
        this.f3589c = f11;
        this.f3588b = hVar.f3410j;
        float f12 = Float.isNaN(hVar.f3411k) ? f11 : hVar.f3411k;
        float f13 = Float.isNaN(hVar.f3412l) ? f11 : hVar.f3412l;
        float f14 = qVar2.f3593g;
        float f15 = qVar.f3593g;
        float f16 = qVar2.f3594h;
        float f17 = qVar.f3594h;
        this.f3590d = this.f3589c;
        float f18 = qVar.f3591e;
        float f19 = qVar.f3592f;
        float f21 = (qVar2.f3591e + (f14 / 2.0f)) - ((f15 / 2.0f) + f18);
        float f22 = (qVar2.f3592f + (f16 / 2.0f)) - (f19 + (f17 / 2.0f));
        float f23 = (f14 - f15) * f12;
        float f24 = f23 / 2.0f;
        this.f3591e = (int) ((f18 + (f21 * f11)) - f24);
        float f25 = (f16 - f17) * f13;
        float f26 = f25 / 2.0f;
        this.f3592f = (int) ((f19 + (f22 * f11)) - f26);
        this.f3593g = (int) (f15 + f23);
        this.f3594h = (int) (f17 + f25);
        float f27 = Float.isNaN(hVar.f3413m) ? f11 : hVar.f3413m;
        boolean isNaN = Float.isNaN(hVar.f3416p);
        float f28 = BitmapDescriptorFactory.HUE_RED;
        float f29 = isNaN ? 0.0f : hVar.f3416p;
        if (!Float.isNaN(hVar.f3414n)) {
            f11 = hVar.f3414n;
        }
        if (!Float.isNaN(hVar.f3415o)) {
            f28 = hVar.f3415o;
        }
        this.f3600n = 0;
        this.f3591e = (int) (((qVar.f3591e + (f27 * f21)) + (f28 * f22)) - f24);
        this.f3592f = (int) (((qVar.f3592f + (f21 * f29)) + (f22 * f11)) - f26);
        this.f3587a = c3.c.c(hVar.f3408h);
        this.f3596j = hVar.f3409i;
    }

    void n(h hVar, q qVar, q qVar2) {
        float f11;
        float f12;
        float f13 = hVar.f3362a / 100.0f;
        this.f3589c = f13;
        this.f3588b = hVar.f3410j;
        float f14 = Float.isNaN(hVar.f3411k) ? f13 : hVar.f3411k;
        float f15 = Float.isNaN(hVar.f3412l) ? f13 : hVar.f3412l;
        float f16 = qVar2.f3593g - qVar.f3593g;
        float f17 = qVar2.f3594h - qVar.f3594h;
        this.f3590d = this.f3589c;
        if (!Float.isNaN(hVar.f3413m)) {
            f13 = hVar.f3413m;
        }
        float f18 = qVar.f3591e;
        float f19 = qVar.f3593g;
        float f21 = qVar.f3592f;
        float f22 = qVar.f3594h;
        float f23 = (qVar2.f3591e + (qVar2.f3593g / 2.0f)) - ((f19 / 2.0f) + f18);
        float f24 = (qVar2.f3592f + (qVar2.f3594h / 2.0f)) - ((f22 / 2.0f) + f21);
        float f25 = f23 * f13;
        float f26 = (f16 * f14) / 2.0f;
        this.f3591e = (int) ((f18 + f25) - f26);
        float f27 = f13 * f24;
        float f28 = (f17 * f15) / 2.0f;
        this.f3592f = (int) ((f21 + f27) - f28);
        this.f3593g = (int) (f19 + f11);
        this.f3594h = (int) (f22 + f12);
        float f29 = Float.isNaN(hVar.f3414n) ? BitmapDescriptorFactory.HUE_RED : hVar.f3414n;
        this.f3600n = 1;
        float f31 = (int) ((qVar.f3591e + f25) - f26);
        this.f3591e = f31;
        float f32 = (int) ((qVar.f3592f + f27) - f28);
        this.f3592f = f32;
        this.f3591e = f31 + ((-f24) * f29);
        this.f3592f = f32 + (f23 * f29);
        this.f3597k = this.f3597k;
        this.f3587a = c3.c.c(hVar.f3408h);
        this.f3596j = hVar.f3409i;
    }

    void o(int i11, int i12, h hVar, q qVar, q qVar2) {
        float min;
        float f11;
        float f12 = hVar.f3362a / 100.0f;
        this.f3589c = f12;
        this.f3588b = hVar.f3410j;
        this.f3600n = hVar.f3417q;
        float f13 = Float.isNaN(hVar.f3411k) ? f12 : hVar.f3411k;
        float f14 = Float.isNaN(hVar.f3412l) ? f12 : hVar.f3412l;
        float f15 = qVar2.f3593g;
        float f16 = qVar.f3593g;
        float f17 = qVar2.f3594h;
        float f18 = qVar.f3594h;
        this.f3590d = this.f3589c;
        this.f3593g = (int) (f16 + ((f15 - f16) * f13));
        this.f3594h = (int) (f18 + ((f17 - f18) * f14));
        int i13 = hVar.f3417q;
        if (i13 == 1) {
            float f19 = Float.isNaN(hVar.f3413m) ? f12 : hVar.f3413m;
            float f21 = qVar2.f3591e;
            float f22 = qVar.f3591e;
            this.f3591e = (f19 * (f21 - f22)) + f22;
            if (!Float.isNaN(hVar.f3414n)) {
                f12 = hVar.f3414n;
            }
            float f23 = qVar2.f3592f;
            float f24 = qVar.f3592f;
            this.f3592f = (f12 * (f23 - f24)) + f24;
        } else if (i13 != 2) {
            float f25 = Float.isNaN(hVar.f3413m) ? f12 : hVar.f3413m;
            float f26 = qVar2.f3591e;
            float f27 = qVar.f3591e;
            this.f3591e = (f25 * (f26 - f27)) + f27;
            if (!Float.isNaN(hVar.f3414n)) {
                f12 = hVar.f3414n;
            }
            float f28 = qVar2.f3592f;
            float f29 = qVar.f3592f;
            this.f3592f = (f12 * (f28 - f29)) + f29;
        } else {
            if (Float.isNaN(hVar.f3413m)) {
                float f31 = qVar2.f3591e;
                float f32 = qVar.f3591e;
                min = ((f31 - f32) * f12) + f32;
            } else {
                min = Math.min(f14, f13) * hVar.f3413m;
            }
            this.f3591e = min;
            if (Float.isNaN(hVar.f3414n)) {
                float f33 = qVar2.f3592f;
                float f34 = qVar.f3592f;
                f11 = (f12 * (f33 - f34)) + f34;
            } else {
                f11 = hVar.f3414n;
            }
            this.f3592f = f11;
        }
        this.f3597k = qVar.f3597k;
        this.f3587a = c3.c.c(hVar.f3408h);
        this.f3596j = hVar.f3409i;
    }

    void q(int i11, int i12, h hVar, q qVar, q qVar2) {
        float f11 = hVar.f3362a / 100.0f;
        this.f3589c = f11;
        this.f3588b = hVar.f3410j;
        float f12 = Float.isNaN(hVar.f3411k) ? f11 : hVar.f3411k;
        float f13 = Float.isNaN(hVar.f3412l) ? f11 : hVar.f3412l;
        float f14 = qVar2.f3593g;
        float f15 = qVar.f3593g;
        float f16 = qVar2.f3594h;
        float f17 = qVar.f3594h;
        this.f3590d = this.f3589c;
        float f18 = qVar.f3591e;
        float f19 = qVar.f3592f;
        float f21 = qVar2.f3591e + (f14 / 2.0f);
        float f22 = qVar2.f3592f + (f16 / 2.0f);
        float f23 = (f14 - f15) * f12;
        this.f3591e = (int) ((f18 + ((f21 - ((f15 / 2.0f) + f18)) * f11)) - (f23 / 2.0f));
        float f24 = (f16 - f17) * f13;
        this.f3592f = (int) ((f19 + ((f22 - (f19 + (f17 / 2.0f))) * f11)) - (f24 / 2.0f));
        this.f3593g = (int) (f15 + f23);
        this.f3594h = (int) (f17 + f24);
        this.f3600n = 2;
        if (!Float.isNaN(hVar.f3413m)) {
            this.f3591e = (int) (hVar.f3413m * ((int) (i11 - this.f3593g)));
        }
        if (!Float.isNaN(hVar.f3414n)) {
            this.f3592f = (int) (hVar.f3414n * ((int) (i12 - this.f3594h)));
        }
        this.f3597k = this.f3597k;
        this.f3587a = c3.c.c(hVar.f3408h);
        this.f3596j = hVar.f3409i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(float f11, float f12, float f13, float f14) {
        this.f3591e = f11;
        this.f3592f = f12;
        this.f3593g = f13;
        this.f3594h = f14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(float f11, float f12, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f17 = (float) dArr[i11];
            double d11 = dArr2[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                f13 = f17;
            } else if (i12 == 2) {
                f15 = f17;
            } else if (i12 == 3) {
                f14 = f17;
            } else if (i12 == 4) {
                f16 = f17;
            }
        }
        float f18 = f13 - ((BitmapDescriptorFactory.HUE_RED * f14) / 2.0f);
        float f19 = f15 - ((BitmapDescriptorFactory.HUE_RED * f16) / 2.0f);
        fArr[0] = (f18 * (1.0f - f11)) + (((f14 * 1.0f) + f18) * f11) + BitmapDescriptorFactory.HUE_RED;
        fArr[1] = (f19 * (1.0f - f12)) + (((f16 * 1.0f) + f19) * f12) + BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(float f11, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z11) {
        float f12;
        boolean z12;
        boolean z13;
        float f13;
        float f14 = this.f3591e;
        float f15 = this.f3592f;
        float f16 = this.f3593g;
        float f17 = this.f3594h;
        if (iArr.length != 0 && this.f3601o.length <= iArr[iArr.length - 1]) {
            int i11 = iArr[iArr.length - 1] + 1;
            this.f3601o = new double[i11];
            this.f3602p = new double[i11];
        }
        Arrays.fill(this.f3601o, Double.NaN);
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f3601o[iArr[i12]] = dArr[i12];
            this.f3602p[iArr[i12]] = dArr2[i12];
        }
        float f18 = Float.NaN;
        int i13 = 0;
        float f19 = BitmapDescriptorFactory.HUE_RED;
        float f21 = BitmapDescriptorFactory.HUE_RED;
        float f22 = BitmapDescriptorFactory.HUE_RED;
        float f23 = BitmapDescriptorFactory.HUE_RED;
        while (true) {
            double[] dArr4 = this.f3601o;
            if (i13 >= dArr4.length) {
                break;
            }
            if (Double.isNaN(dArr4[i13]) && (dArr3 == null || dArr3[i13] == 0.0d)) {
                f13 = f18;
            } else {
                double d11 = dArr3 != null ? dArr3[i13] : 0.0d;
                if (!Double.isNaN(this.f3601o[i13])) {
                    d11 = this.f3601o[i13] + d11;
                }
                f13 = f18;
                float f24 = (float) d11;
                float f25 = (float) this.f3602p[i13];
                if (i13 == 1) {
                    f18 = f13;
                    f19 = f25;
                    f14 = f24;
                } else if (i13 == 2) {
                    f18 = f13;
                    f21 = f25;
                    f15 = f24;
                } else if (i13 == 3) {
                    f18 = f13;
                    f22 = f25;
                    f16 = f24;
                } else if (i13 == 4) {
                    f18 = f13;
                    f23 = f25;
                    f17 = f24;
                } else if (i13 == 5) {
                    f18 = f24;
                }
                i13++;
            }
            f18 = f13;
            i13++;
        }
        float f26 = f18;
        m mVar = this.f3598l;
        if (mVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            mVar.h(f11, fArr, fArr2);
            float f27 = fArr[0];
            float f28 = fArr[1];
            float f29 = fArr2[0];
            float f31 = fArr2[1];
            double d12 = f14;
            double d13 = f15;
            float sin = (float) ((f27 + (Math.sin(d13) * d12)) - (f16 / 2.0f));
            f12 = f17;
            float cos = (float) ((f28 - (Math.cos(d13) * d12)) - (f17 / 2.0f));
            double d14 = f19;
            double d15 = f21;
            float sin2 = (float) (f29 + (Math.sin(d13) * d14) + (Math.cos(d13) * d12 * d15));
            float cos2 = (float) ((f31 - (d14 * Math.cos(d13))) + (d12 * Math.sin(d13) * d15));
            if (dArr2.length >= 2) {
                z12 = false;
                dArr2[0] = sin2;
                z13 = true;
                dArr2[1] = cos2;
            } else {
                z12 = false;
                z13 = true;
            }
            if (!Float.isNaN(f26)) {
                view.setRotation((float) (f26 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f14 = sin;
            f15 = cos;
        } else {
            f12 = f17;
            z12 = false;
            z13 = true;
            if (!Float.isNaN(f26)) {
                view.setRotation((float) (((double) BitmapDescriptorFactory.HUE_RED) + f26 + Math.toDegrees(Math.atan2(f21 + (f23 / 2.0f), f19 + (f22 / 2.0f)))));
            }
        }
        if (view instanceof c) {
            ((c) view).a(f14, f15, f16 + f14, f15 + f12);
            return;
        }
        float f32 = f14 + 0.5f;
        int i14 = (int) f32;
        float f33 = f15 + 0.5f;
        int i15 = (int) f33;
        int i16 = (int) (f32 + f16);
        int i17 = (int) (f33 + f12);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (i18 != view.getMeasuredWidth() || i19 != view.getMeasuredHeight()) {
            z12 = z13;
        }
        if (z12 || z11) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
        }
        view.layout(i14, i15, i16, i17);
    }

    public q(int i11, int i12, h hVar, q qVar, q qVar2) {
        int i13 = d.f3361f;
        this.f3596j = i13;
        this.f3597k = i13;
        this.f3598l = null;
        this.f3599m = new LinkedHashMap<>();
        this.f3600n = 0;
        this.f3601o = new double[18];
        this.f3602p = new double[18];
        if (qVar.f3597k != d.f3361f) {
            o(i11, i12, hVar, qVar, qVar2);
            return;
        }
        int i14 = hVar.f3417q;
        if (i14 == 1) {
            n(hVar, qVar, qVar2);
        } else if (i14 != 2) {
            l(hVar, qVar, qVar2);
        } else {
            q(i11, i12, hVar, qVar, qVar2);
        }
    }
}