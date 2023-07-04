package com.facebook.react.uimanager;

import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public class j {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        double[] f12324a = new double[4];

        /* renamed from: b  reason: collision with root package name */
        double[] f12325b = new double[3];

        /* renamed from: c  reason: collision with root package name */
        double[] f12326c = new double[3];

        /* renamed from: d  reason: collision with root package name */
        double[] f12327d = new double[3];

        /* renamed from: e  reason: collision with root package name */
        double[] f12328e = new double[3];

        private static void b(double[] dArr) {
            for (int i11 = 0; i11 < dArr.length; i11++) {
                dArr[i11] = 0.0d;
            }
        }

        public void a() {
            b(this.f12324a);
            b(this.f12325b);
            b(this.f12326c);
            b(this.f12327d);
            b(this.f12328e);
        }
    }

    public static void a(double[] dArr, double d11) {
        dArr[11] = (-1.0d) / d11;
    }

    public static void b(double[] dArr, double d11) {
        dArr[5] = Math.cos(d11);
        dArr[6] = Math.sin(d11);
        dArr[9] = -Math.sin(d11);
        dArr[10] = Math.cos(d11);
    }

    public static void c(double[] dArr, double d11) {
        dArr[0] = Math.cos(d11);
        dArr[2] = -Math.sin(d11);
        dArr[8] = Math.sin(d11);
        dArr[10] = Math.cos(d11);
    }

    public static void d(double[] dArr, double d11) {
        dArr[0] = Math.cos(d11);
        dArr[1] = Math.sin(d11);
        dArr[4] = -Math.sin(d11);
        dArr[5] = Math.cos(d11);
    }

    public static void e(double[] dArr, double d11) {
        dArr[0] = d11;
    }

    public static void f(double[] dArr, double d11) {
        dArr[5] = d11;
    }

    public static void g(double[] dArr, double d11) {
        dArr[4] = Math.tan(d11);
    }

    public static void h(double[] dArr, double d11) {
        dArr[1] = Math.tan(d11);
    }

    public static void i(double[] dArr, double d11, double d12) {
        dArr[12] = d11;
        dArr[13] = d12;
    }

    public static void j(double[] dArr, double d11, double d12, double d13) {
        dArr[12] = d11;
        dArr[13] = d12;
        dArr[14] = d13;
    }

    public static void k(double[] dArr, a aVar) {
        wf.a.a(dArr.length == 16);
        double[] dArr2 = aVar.f12324a;
        double[] dArr3 = aVar.f12325b;
        double[] dArr4 = aVar.f12326c;
        double[] dArr5 = aVar.f12327d;
        double[] dArr6 = aVar.f12328e;
        if (o(dArr[15])) {
            return;
        }
        double[][] dArr7 = (double[][]) Array.newInstance(double.class, 4, 4);
        double[] dArr8 = new double[16];
        for (int i11 = 0; i11 < 4; i11++) {
            for (int i12 = 0; i12 < 4; i12++) {
                int i13 = (i11 * 4) + i12;
                double d11 = dArr[i13] / dArr[15];
                dArr7[i11][i12] = d11;
                if (i12 == 3) {
                    d11 = 0.0d;
                }
                dArr8[i13] = d11;
            }
        }
        dArr8[15] = 1.0d;
        if (o(m(dArr8))) {
            return;
        }
        if (o(dArr7[0][3]) && o(dArr7[1][3]) && o(dArr7[2][3])) {
            dArr2[2] = 0.0d;
            dArr2[1] = 0.0d;
            dArr2[0] = 0.0d;
            dArr2[3] = 1.0d;
        } else {
            q(new double[]{dArr7[0][3], dArr7[1][3], dArr7[2][3], dArr7[3][3]}, t(n(dArr8)), dArr2);
        }
        for (int i14 = 0; i14 < 3; i14++) {
            dArr5[i14] = dArr7[3][i14];
        }
        double[][] dArr9 = (double[][]) Array.newInstance(double.class, 3, 3);
        for (int i15 = 0; i15 < 3; i15++) {
            dArr9[i15][0] = dArr7[i15][0];
            dArr9[i15][1] = dArr7[i15][1];
            dArr9[i15][2] = dArr7[i15][2];
        }
        dArr3[0] = x(dArr9[0]);
        dArr9[0] = y(dArr9[0], dArr3[0]);
        dArr4[0] = w(dArr9[0], dArr9[1]);
        dArr9[1] = u(dArr9[1], dArr9[0], 1.0d, -dArr4[0]);
        dArr3[1] = x(dArr9[1]);
        dArr9[1] = y(dArr9[1], dArr3[1]);
        dArr4[0] = dArr4[0] / dArr3[1];
        dArr4[1] = w(dArr9[0], dArr9[2]);
        dArr9[2] = u(dArr9[2], dArr9[0], 1.0d, -dArr4[1]);
        dArr4[2] = w(dArr9[1], dArr9[2]);
        dArr9[2] = u(dArr9[2], dArr9[1], 1.0d, -dArr4[2]);
        dArr3[2] = x(dArr9[2]);
        dArr9[2] = y(dArr9[2], dArr3[2]);
        dArr4[1] = dArr4[1] / dArr3[2];
        dArr4[2] = dArr4[2] / dArr3[2];
        if (w(dArr9[0], v(dArr9[1], dArr9[2])) < 0.0d) {
            for (int i16 = 0; i16 < 3; i16++) {
                dArr3[i16] = dArr3[i16] * (-1.0d);
                double[] dArr10 = dArr9[i16];
                dArr10[0] = dArr10[0] * (-1.0d);
                double[] dArr11 = dArr9[i16];
                dArr11[1] = dArr11[1] * (-1.0d);
                double[] dArr12 = dArr9[i16];
                dArr12[2] = dArr12[2] * (-1.0d);
            }
        }
        dArr6[0] = s((-Math.atan2(dArr9[2][1], dArr9[2][2])) * 57.29577951308232d);
        dArr6[1] = s((-Math.atan2(-dArr9[2][0], Math.sqrt((dArr9[2][1] * dArr9[2][1]) + (dArr9[2][2] * dArr9[2][2])))) * 57.29577951308232d);
        dArr6[2] = s((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
    }

    public static double l(double d11) {
        return (d11 * 3.141592653589793d) / 180.0d;
    }

    public static double m(double[] dArr) {
        double d11 = dArr[0];
        double d12 = dArr[1];
        double d13 = dArr[2];
        double d14 = dArr[3];
        double d15 = dArr[4];
        double d16 = dArr[5];
        double d17 = dArr[6];
        double d18 = dArr[7];
        double d19 = dArr[8];
        double d21 = dArr[9];
        double d22 = dArr[10];
        double d23 = dArr[11];
        double d24 = dArr[12];
        double d25 = dArr[13];
        double d26 = dArr[14];
        double d27 = dArr[15];
        double d28 = d14 * d17;
        double d29 = d13 * d18;
        double d31 = d14 * d16;
        double d32 = d12 * d18;
        double d33 = d13 * d16;
        double d34 = d12 * d17;
        double d35 = d14 * d15;
        double d36 = d18 * d11;
        double d37 = d13 * d15;
        double d38 = d17 * d11;
        double d39 = d12 * d15;
        double d41 = d11 * d16;
        return ((((((((((((((((((((((((d28 * d21) * d24) - ((d29 * d21) * d24)) - ((d31 * d22) * d24)) + ((d32 * d22) * d24)) + ((d33 * d23) * d24)) - ((d34 * d23) * d24)) - ((d28 * d19) * d25)) + ((d29 * d19) * d25)) + ((d35 * d22) * d25)) - ((d36 * d22) * d25)) - ((d37 * d23) * d25)) + ((d38 * d23) * d25)) + ((d31 * d19) * d26)) - ((d32 * d19) * d26)) - ((d35 * d21) * d26)) + ((d36 * d21) * d26)) + ((d39 * d23) * d26)) - ((d23 * d41) * d26)) - ((d33 * d19) * d27)) + ((d34 * d19) * d27)) + ((d37 * d21) * d27)) - ((d38 * d21) * d27)) - ((d39 * d22) * d27)) + (d41 * d22 * d27);
    }

    public static double[] n(double[] dArr) {
        double m11 = m(dArr);
        if (o(m11)) {
            return dArr;
        }
        double d11 = dArr[0];
        double d12 = dArr[1];
        double d13 = dArr[2];
        double d14 = dArr[3];
        double d15 = dArr[4];
        double d16 = dArr[5];
        double d17 = dArr[6];
        double d18 = dArr[7];
        double d19 = dArr[8];
        double d21 = dArr[9];
        double d22 = dArr[10];
        double d23 = dArr[11];
        double d24 = dArr[12];
        double d25 = dArr[13];
        double d26 = dArr[14];
        double d27 = dArr[15];
        double d28 = d17 * d23;
        double d29 = d18 * d22;
        double d31 = d18 * d21;
        double d32 = d16 * d23;
        double d33 = d17 * d21;
        double d34 = ((((d28 * d25) - (d29 * d25)) + (d31 * d26)) - (d32 * d26)) - (d33 * d27);
        double d35 = d16 * d22;
        double d36 = d14 * d22;
        double d37 = d13 * d23;
        double d38 = d14 * d21;
        double d39 = d12 * d23;
        double d41 = d13 * d21;
        double d42 = (((d36 * d25) - (d37 * d25)) - (d38 * d26)) + (d39 * d26) + (d41 * d27);
        double d43 = d12 * d22;
        double d44 = d13 * d18;
        double d45 = d14 * d17;
        double d46 = d14 * d16;
        double d47 = d12 * d18;
        double d48 = d13 * d16;
        double d49 = d12 * d17;
        double d51 = (d29 * d24) - (d28 * d24);
        double d52 = d18 * d19;
        double d53 = d15 * d23;
        double d54 = d17 * d19;
        double d55 = (d51 - (d52 * d26)) + (d53 * d26) + (d54 * d27);
        double d56 = d15 * d22;
        double d57 = (d37 * d24) - (d36 * d24);
        double d58 = d14 * d19;
        double d59 = d11 * d23;
        double d61 = d13 * d19;
        double d62 = d11 * d22;
        double d63 = d14 * d15;
        double d64 = d18 * d11;
        double d65 = d13 * d15;
        double d66 = d17 * d11;
        double d67 = d16 * d19;
        double d68 = ((((d32 * d24) - (d31 * d24)) + (d52 * d25)) - (d53 * d25)) - (d67 * d27);
        double d69 = d15 * d21;
        double d71 = d12 * d19;
        double d72 = d11 * d21;
        double d73 = d12 * d15;
        double d74 = d11 * d16;
        return new double[]{(d34 + (d35 * d27)) / m11, (d42 - (d43 * d27)) / m11, ((((((d44 * d25) - (d45 * d25)) + (d46 * d26)) - (d47 * d26)) - (d48 * d27)) + (d49 * d27)) / m11, ((((((d45 * d21) - (d44 * d21)) - (d46 * d22)) + (d47 * d22)) + (d48 * d23)) - (d49 * d23)) / m11, (d55 - (d56 * d27)) / m11, ((((d57 + (d58 * d26)) - (d59 * d26)) - (d61 * d27)) + (d62 * d27)) / m11, ((((((d45 * d24) - (d44 * d24)) - (d63 * d26)) + (d64 * d26)) + (d65 * d27)) - (d66 * d27)) / m11, ((((((d44 * d19) - (d45 * d19)) + (d63 * d22)) - (d64 * d22)) - (d65 * d23)) + (d66 * d23)) / m11, (d68 + (d69 * d27)) / m11, ((((((d38 * d24) - (d39 * d24)) - (d58 * d25)) + (d59 * d25)) + (d71 * d27)) - (d72 * d27)) / m11, ((((((d47 * d24) - (d46 * d24)) + (d63 * d25)) - (d64 * d25)) - (d73 * d27)) + (d27 * d74)) / m11, ((((((d46 * d19) - (d47 * d19)) - (d63 * d21)) + (d64 * d21)) + (d73 * d23)) - (d23 * d74)) / m11, ((((((d33 * d24) - (d35 * d24)) - (d54 * d25)) + (d56 * d25)) + (d67 * d26)) - (d69 * d26)) / m11, ((((((d43 * d24) - (d41 * d24)) + (d61 * d25)) - (d62 * d25)) - (d71 * d26)) + (d72 * d26)) / m11, ((((((d48 * d24) - (d24 * d49)) - (d65 * d25)) + (d25 * d66)) + (d73 * d26)) - (d26 * d74)) / m11, ((((((d49 * d19) - (d48 * d19)) + (d65 * d21)) - (d66 * d21)) - (d73 * d22)) + (d74 * d22)) / m11};
    }

    private static boolean o(double d11) {
        return !Double.isNaN(d11) && Math.abs(d11) < 1.0E-5d;
    }

    public static void p(double[] dArr, double[] dArr2, double[] dArr3) {
        double d11 = dArr2[0];
        double d12 = dArr2[1];
        double d13 = dArr2[2];
        double d14 = dArr2[3];
        double d15 = dArr2[4];
        double d16 = dArr2[5];
        double d17 = dArr2[6];
        double d18 = dArr2[7];
        double d19 = dArr2[8];
        double d21 = dArr2[9];
        double d22 = dArr2[10];
        double d23 = dArr2[11];
        double d24 = dArr2[12];
        double d25 = dArr2[13];
        double d26 = dArr2[14];
        double d27 = dArr2[15];
        double d28 = dArr3[0];
        double d29 = dArr3[1];
        double d31 = dArr3[2];
        double d32 = dArr3[3];
        dArr[0] = (d28 * d11) + (d29 * d15) + (d31 * d19) + (d32 * d24);
        dArr[1] = (d28 * d12) + (d29 * d16) + (d31 * d21) + (d32 * d25);
        dArr[2] = (d28 * d13) + (d29 * d17) + (d31 * d22) + (d32 * d26);
        dArr[3] = (d28 * d14) + (d29 * d18) + (d31 * d23) + (d32 * d27);
        double d33 = dArr3[4];
        double d34 = dArr3[5];
        double d35 = dArr3[6];
        double d36 = dArr3[7];
        dArr[4] = (d33 * d11) + (d34 * d15) + (d35 * d19) + (d36 * d24);
        dArr[5] = (d33 * d12) + (d34 * d16) + (d35 * d21) + (d36 * d25);
        dArr[6] = (d33 * d13) + (d34 * d17) + (d35 * d22) + (d36 * d26);
        dArr[7] = (d33 * d14) + (d34 * d18) + (d35 * d23) + (d36 * d27);
        double d37 = dArr3[8];
        double d38 = dArr3[9];
        double d39 = dArr3[10];
        double d41 = dArr3[11];
        dArr[8] = (d37 * d11) + (d38 * d15) + (d39 * d19) + (d41 * d24);
        dArr[9] = (d37 * d12) + (d38 * d16) + (d39 * d21) + (d41 * d25);
        dArr[10] = (d37 * d13) + (d38 * d17) + (d39 * d22) + (d41 * d26);
        dArr[11] = (d37 * d14) + (d38 * d18) + (d39 * d23) + (d41 * d27);
        double d42 = dArr3[12];
        double d43 = dArr3[13];
        double d44 = dArr3[14];
        double d45 = dArr3[15];
        dArr[12] = (d11 * d42) + (d15 * d43) + (d19 * d44) + (d24 * d45);
        dArr[13] = (d12 * d42) + (d16 * d43) + (d21 * d44) + (d25 * d45);
        dArr[14] = (d13 * d42) + (d17 * d43) + (d22 * d44) + (d26 * d45);
        dArr[15] = (d42 * d14) + (d43 * d18) + (d44 * d23) + (d45 * d27);
    }

    public static void q(double[] dArr, double[] dArr2, double[] dArr3) {
        double d11 = dArr[0];
        double d12 = dArr[1];
        double d13 = dArr[2];
        double d14 = dArr[3];
        dArr3[0] = (dArr2[0] * d11) + (dArr2[4] * d12) + (dArr2[8] * d13) + (dArr2[12] * d14);
        dArr3[1] = (dArr2[1] * d11) + (dArr2[5] * d12) + (dArr2[9] * d13) + (dArr2[13] * d14);
        dArr3[2] = (dArr2[2] * d11) + (dArr2[6] * d12) + (dArr2[10] * d13) + (dArr2[14] * d14);
        dArr3[3] = (d11 * dArr2[3]) + (d12 * dArr2[7]) + (d13 * dArr2[11]) + (d14 * dArr2[15]);
    }

    public static void r(double[] dArr) {
        dArr[14] = 0.0d;
        dArr[13] = 0.0d;
        dArr[12] = 0.0d;
        dArr[11] = 0.0d;
        dArr[9] = 0.0d;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[15] = 1.0d;
        dArr[10] = 1.0d;
        dArr[5] = 1.0d;
        dArr[0] = 1.0d;
    }

    public static double s(double d11) {
        return Math.round(d11 * 1000.0d) * 0.001d;
    }

    public static double[] t(double[] dArr) {
        return new double[]{dArr[0], dArr[4], dArr[8], dArr[12], dArr[1], dArr[5], dArr[9], dArr[13], dArr[2], dArr[6], dArr[10], dArr[14], dArr[3], dArr[7], dArr[11], dArr[15]};
    }

    public static double[] u(double[] dArr, double[] dArr2, double d11, double d12) {
        return new double[]{(dArr[0] * d11) + (dArr2[0] * d12), (dArr[1] * d11) + (dArr2[1] * d12), (d11 * dArr[2]) + (d12 * dArr2[2])};
    }

    public static double[] v(double[] dArr, double[] dArr2) {
        return new double[]{(dArr[1] * dArr2[2]) - (dArr[2] * dArr2[1]), (dArr[2] * dArr2[0]) - (dArr[0] * dArr2[2]), (dArr[0] * dArr2[1]) - (dArr[1] * dArr2[0])};
    }

    public static double w(double[] dArr, double[] dArr2) {
        return (dArr[0] * dArr2[0]) + (dArr[1] * dArr2[1]) + (dArr[2] * dArr2[2]);
    }

    public static double x(double[] dArr) {
        return Math.sqrt((dArr[0] * dArr[0]) + (dArr[1] * dArr[1]) + (dArr[2] * dArr[2]));
    }

    public static double[] y(double[] dArr, double d11) {
        if (o(d11)) {
            d11 = x(dArr);
        }
        double d12 = 1.0d / d11;
        return new double[]{dArr[0] * d12, dArr[1] * d12, dArr[2] * d12};
    }
}