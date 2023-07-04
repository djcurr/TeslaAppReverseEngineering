package c3;

/* loaded from: classes.dex */
public class f extends b {

    /* renamed from: a  reason: collision with root package name */
    private double[] f8820a;

    /* renamed from: b  reason: collision with root package name */
    private double[][] f8821b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8822c = true;

    /* renamed from: d  reason: collision with root package name */
    double[] f8823d;

    public f(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f8823d = new double[length2];
        this.f8820a = dArr;
        this.f8821b = dArr2;
        if (length2 > 2) {
            double d11 = 0.0d;
            int i11 = 0;
            double d12 = 0.0d;
            while (i11 < dArr.length) {
                double d13 = dArr2[i11][0];
                double d14 = dArr2[i11][0];
                if (i11 > 0) {
                    Math.hypot(d13 - d11, d14 - d12);
                }
                i11++;
                d11 = d13;
                d12 = d14;
            }
        }
    }

    @Override // c3.b
    public double c(double d11, int i11) {
        double[] dArr = this.f8820a;
        int length = dArr.length;
        int i12 = 0;
        if (this.f8822c) {
            if (d11 <= dArr[0]) {
                return this.f8821b[0][i11] + ((d11 - dArr[0]) * h(dArr[0], i11));
            }
            int i13 = length - 1;
            if (d11 >= dArr[i13]) {
                return this.f8821b[i13][i11] + ((d11 - dArr[i13]) * h(dArr[i13], i11));
            }
        } else if (d11 <= dArr[0]) {
            return this.f8821b[0][i11];
        } else {
            int i14 = length - 1;
            if (d11 >= dArr[i14]) {
                return this.f8821b[i14][i11];
            }
        }
        while (i12 < length - 1) {
            double[] dArr2 = this.f8820a;
            if (d11 == dArr2[i12]) {
                return this.f8821b[i12][i11];
            }
            int i15 = i12 + 1;
            if (d11 < dArr2[i15]) {
                double d12 = (d11 - dArr2[i12]) / (dArr2[i15] - dArr2[i12]);
                double[][] dArr3 = this.f8821b;
                return (dArr3[i12][i11] * (1.0d - d12)) + (dArr3[i15][i11] * d12);
            }
            i12 = i15;
        }
        return 0.0d;
    }

    @Override // c3.b
    public void d(double d11, double[] dArr) {
        double[] dArr2 = this.f8820a;
        int length = dArr2.length;
        int i11 = 0;
        int length2 = this.f8821b[0].length;
        if (this.f8822c) {
            if (d11 <= dArr2[0]) {
                f(dArr2[0], this.f8823d);
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = this.f8821b[0][i12] + ((d11 - this.f8820a[0]) * this.f8823d[i12]);
                }
                return;
            }
            int i13 = length - 1;
            if (d11 >= dArr2[i13]) {
                f(dArr2[i13], this.f8823d);
                while (i11 < length2) {
                    dArr[i11] = this.f8821b[i13][i11] + ((d11 - this.f8820a[i13]) * this.f8823d[i11]);
                    i11++;
                }
                return;
            }
        } else if (d11 <= dArr2[0]) {
            for (int i14 = 0; i14 < length2; i14++) {
                dArr[i14] = this.f8821b[0][i14];
            }
            return;
        } else {
            int i15 = length - 1;
            if (d11 >= dArr2[i15]) {
                while (i11 < length2) {
                    dArr[i11] = this.f8821b[i15][i11];
                    i11++;
                }
                return;
            }
        }
        int i16 = 0;
        while (i16 < length - 1) {
            if (d11 == this.f8820a[i16]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    dArr[i17] = this.f8821b[i16][i17];
                }
            }
            double[] dArr3 = this.f8820a;
            int i18 = i16 + 1;
            if (d11 < dArr3[i18]) {
                double d12 = (d11 - dArr3[i16]) / (dArr3[i18] - dArr3[i16]);
                while (i11 < length2) {
                    double[][] dArr4 = this.f8821b;
                    dArr[i11] = (dArr4[i16][i11] * (1.0d - d12)) + (dArr4[i18][i11] * d12);
                    i11++;
                }
                return;
            }
            i16 = i18;
        }
    }

    @Override // c3.b
    public void e(double d11, float[] fArr) {
        double[] dArr = this.f8820a;
        int length = dArr.length;
        int i11 = 0;
        int length2 = this.f8821b[0].length;
        if (this.f8822c) {
            if (d11 <= dArr[0]) {
                f(dArr[0], this.f8823d);
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = (float) (this.f8821b[0][i12] + ((d11 - this.f8820a[0]) * this.f8823d[i12]));
                }
                return;
            }
            int i13 = length - 1;
            if (d11 >= dArr[i13]) {
                f(dArr[i13], this.f8823d);
                while (i11 < length2) {
                    fArr[i11] = (float) (this.f8821b[i13][i11] + ((d11 - this.f8820a[i13]) * this.f8823d[i11]));
                    i11++;
                }
                return;
            }
        } else if (d11 <= dArr[0]) {
            for (int i14 = 0; i14 < length2; i14++) {
                fArr[i14] = (float) this.f8821b[0][i14];
            }
            return;
        } else {
            int i15 = length - 1;
            if (d11 >= dArr[i15]) {
                while (i11 < length2) {
                    fArr[i11] = (float) this.f8821b[i15][i11];
                    i11++;
                }
                return;
            }
        }
        int i16 = 0;
        while (i16 < length - 1) {
            if (d11 == this.f8820a[i16]) {
                for (int i17 = 0; i17 < length2; i17++) {
                    fArr[i17] = (float) this.f8821b[i16][i17];
                }
            }
            double[] dArr2 = this.f8820a;
            int i18 = i16 + 1;
            if (d11 < dArr2[i18]) {
                double d12 = (d11 - dArr2[i16]) / (dArr2[i18] - dArr2[i16]);
                while (i11 < length2) {
                    double[][] dArr3 = this.f8821b;
                    fArr[i11] = (float) ((dArr3[i16][i11] * (1.0d - d12)) + (dArr3[i18][i11] * d12));
                    i11++;
                }
                return;
            }
            i16 = i18;
        }
    }

    @Override // c3.b
    public void f(double d11, double[] dArr) {
        double[] dArr2 = this.f8820a;
        int length = dArr2.length;
        int length2 = this.f8821b[0].length;
        if (d11 <= dArr2[0]) {
            d11 = dArr2[0];
        } else {
            int i11 = length - 1;
            if (d11 >= dArr2[i11]) {
                d11 = dArr2[i11];
            }
        }
        int i12 = 0;
        while (i12 < length - 1) {
            double[] dArr3 = this.f8820a;
            int i13 = i12 + 1;
            if (d11 <= dArr3[i13]) {
                double d12 = dArr3[i13] - dArr3[i12];
                double d13 = dArr3[i12];
                for (int i14 = 0; i14 < length2; i14++) {
                    double[][] dArr4 = this.f8821b;
                    dArr[i14] = (dArr4[i13][i14] - dArr4[i12][i14]) / d12;
                }
                return;
            }
            i12 = i13;
        }
    }

    @Override // c3.b
    public double[] g() {
        return this.f8820a;
    }

    public double h(double d11, int i11) {
        double[] dArr = this.f8820a;
        int length = dArr.length;
        int i12 = 0;
        if (d11 < dArr[0]) {
            d11 = dArr[0];
        } else {
            int i13 = length - 1;
            if (d11 >= dArr[i13]) {
                d11 = dArr[i13];
            }
        }
        while (i12 < length - 1) {
            double[] dArr2 = this.f8820a;
            int i14 = i12 + 1;
            if (d11 <= dArr2[i14]) {
                double d12 = dArr2[i14] - dArr2[i12];
                double d13 = dArr2[i12];
                double[][] dArr3 = this.f8821b;
                return (dArr3[i14][i11] - dArr3[i12][i11]) / d12;
            }
            i12 = i14;
        }
        return 0.0d;
    }
}