package c3;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    protected b f8838a;

    /* renamed from: b  reason: collision with root package name */
    protected int[] f8839b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    protected float[] f8840c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    private int f8841d;

    /* renamed from: e  reason: collision with root package name */
    private String f8842e;

    /* loaded from: classes.dex */
    private static class a {
        static void a(int[] iArr, float[] fArr, int i11, int i12) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i12;
            iArr2[1] = i11;
            int i13 = 2;
            while (i13 > 0) {
                int i14 = i13 - 1;
                int i15 = iArr2[i14];
                i13 = i14 - 1;
                int i16 = iArr2[i13];
                if (i15 < i16) {
                    int b11 = b(iArr, fArr, i15, i16);
                    int i17 = i13 + 1;
                    iArr2[i13] = b11 - 1;
                    int i18 = i17 + 1;
                    iArr2[i17] = i15;
                    int i19 = i18 + 1;
                    iArr2[i18] = i16;
                    i13 = i19 + 1;
                    iArr2[i19] = b11 + 1;
                }
            }
        }

        private static int b(int[] iArr, float[] fArr, int i11, int i12) {
            int i13 = iArr[i12];
            int i14 = i11;
            while (i11 < i12) {
                if (iArr[i11] <= i13) {
                    c(iArr, fArr, i14, i11);
                    i14++;
                }
                i11++;
            }
            c(iArr, fArr, i14, i12);
            return i14;
        }

        private static void c(int[] iArr, float[] fArr, int i11, int i12) {
            int i13 = iArr[i11];
            iArr[i11] = iArr[i12];
            iArr[i12] = i13;
            float f11 = fArr[i11];
            fArr[i11] = fArr[i12];
            fArr[i12] = f11;
        }
    }

    public float a(float f11) {
        return (float) this.f8838a.c(f11, 0);
    }

    public void b(int i11, float f11) {
        int[] iArr = this.f8839b;
        if (iArr.length < this.f8841d + 1) {
            this.f8839b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f8840c;
            this.f8840c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f8839b;
        int i12 = this.f8841d;
        iArr2[i12] = i11;
        this.f8840c[i12] = f11;
        this.f8841d = i12 + 1;
    }

    public void c(String str) {
        this.f8842e = str;
    }

    public void d(int i11) {
        int i12;
        int i13 = this.f8841d;
        if (i13 == 0) {
            return;
        }
        a.a(this.f8839b, this.f8840c, 0, i13 - 1);
        int i14 = 1;
        for (int i15 = 1; i15 < this.f8841d; i15++) {
            int[] iArr = this.f8839b;
            if (iArr[i15 - 1] != iArr[i15]) {
                i14++;
            }
        }
        double[] dArr = new double[i14];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, i14, 1);
        int i16 = 0;
        for (i12 = 0; i12 < this.f8841d; i12 = i12 + 1) {
            if (i12 > 0) {
                int[] iArr2 = this.f8839b;
                i12 = iArr2[i12] == iArr2[i12 - 1] ? i12 + 1 : 0;
            }
            dArr[i16] = this.f8839b[i12] * 0.01d;
            dArr2[i16][0] = this.f8840c[i12];
            i16++;
        }
        this.f8838a = b.a(i11, dArr, dArr2);
    }

    public String toString() {
        String str = this.f8842e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i11 = 0; i11 < this.f8841d; i11++) {
            str = str + "[" + this.f8839b[i11] + " , " + decimalFormat.format(this.f8840c[i11]) + "] ";
        }
        return str;
    }
}