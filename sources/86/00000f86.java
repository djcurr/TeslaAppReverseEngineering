package c3;

import java.util.Arrays;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    double[] f8831c;

    /* renamed from: d  reason: collision with root package name */
    String f8832d;

    /* renamed from: e  reason: collision with root package name */
    g f8833e;

    /* renamed from: f  reason: collision with root package name */
    int f8834f;

    /* renamed from: a  reason: collision with root package name */
    float[] f8829a = new float[0];

    /* renamed from: b  reason: collision with root package name */
    double[] f8830b = new double[0];

    /* renamed from: g  reason: collision with root package name */
    double f8835g = 6.283185307179586d;

    public void a(double d11, float f11) {
        int length = this.f8829a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f8830b, d11);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f8830b = Arrays.copyOf(this.f8830b, length);
        this.f8829a = Arrays.copyOf(this.f8829a, length);
        this.f8831c = new double[length];
        double[] dArr = this.f8830b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f8830b[binarySearch] = d11;
        this.f8829a[binarySearch] = f11;
    }

    double b(double d11) {
        if (d11 < 0.0d) {
            d11 = 0.0d;
        } else if (d11 > 1.0d) {
            d11 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f8830b, d11);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch != 0) {
            int i11 = (-binarySearch) - 1;
            float[] fArr = this.f8829a;
            int i12 = i11 - 1;
            double d12 = fArr[i11] - fArr[i12];
            double[] dArr = this.f8830b;
            double d13 = d12 / (dArr[i11] - dArr[i12]);
            return this.f8831c[i12] + ((fArr[i12] - (dArr[i12] * d13)) * (d11 - dArr[i12])) + ((d13 * ((d11 * d11) - (dArr[i12] * dArr[i12]))) / 2.0d);
        }
        return 0.0d;
    }

    public double c(double d11, double d12) {
        double abs;
        double b11 = b(d11) + d12;
        switch (this.f8834f) {
            case 1:
                return Math.signum(0.5d - (b11 % 1.0d));
            case 2:
                abs = Math.abs((((b11 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((b11 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((b11 * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f8835g * (d12 + b11));
            case 6:
                double abs2 = 1.0d - Math.abs(((b11 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.f8833e.c(b11 % 1.0d, 0);
            default:
                return Math.sin(this.f8835g * b11);
        }
        return 1.0d - abs;
    }

    public void d() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int i11;
        int i12 = 0;
        double d11 = 0.0d;
        while (true) {
            if (i12 >= this.f8829a.length) {
                break;
            }
            d11 += fArr[i12];
            i12++;
        }
        int i13 = 1;
        double d12 = 0.0d;
        int i14 = 1;
        while (true) {
            if (i14 >= this.f8829a.length) {
                break;
            }
            double[] dArr = this.f8830b;
            d12 += (dArr[i14] - dArr[i14 - 1]) * ((fArr2[i11] + fArr2[i14]) / 2.0f);
            i14++;
        }
        int i15 = 0;
        while (true) {
            float[] fArr4 = this.f8829a;
            if (i15 >= fArr4.length) {
                break;
            }
            fArr4[i15] = (float) (fArr4[i15] * (d11 / d12));
            i15++;
        }
        this.f8831c[0] = 0.0d;
        while (true) {
            if (i13 >= this.f8829a.length) {
                return;
            }
            int i16 = i13 - 1;
            double[] dArr2 = this.f8830b;
            double d13 = dArr2[i13] - dArr2[i16];
            double[] dArr3 = this.f8831c;
            dArr3[i13] = dArr3[i16] + (d13 * ((fArr3[i16] + fArr3[i13]) / 2.0f));
            i13++;
        }
    }

    public void e(int i11, String str) {
        this.f8834f = i11;
        this.f8832d = str;
        if (str != null) {
            this.f8833e = g.h(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f8830b) + " period=" + Arrays.toString(this.f8829a);
    }
}