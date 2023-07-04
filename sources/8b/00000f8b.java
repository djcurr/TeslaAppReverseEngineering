package c3;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: k  reason: collision with root package name */
    protected static float f8844k = 6.2831855f;

    /* renamed from: a  reason: collision with root package name */
    protected b f8845a;

    /* renamed from: e  reason: collision with root package name */
    protected int f8849e;

    /* renamed from: f  reason: collision with root package name */
    protected String f8850f;

    /* renamed from: i  reason: collision with root package name */
    protected long f8853i;

    /* renamed from: b  reason: collision with root package name */
    protected int f8846b = 0;

    /* renamed from: c  reason: collision with root package name */
    protected int[] f8847c = new int[10];

    /* renamed from: d  reason: collision with root package name */
    protected float[][] f8848d = (float[][]) Array.newInstance(float.class, 10, 3);

    /* renamed from: g  reason: collision with root package name */
    protected float[] f8851g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    protected boolean f8852h = false;

    /* renamed from: j  reason: collision with root package name */
    protected float f8854j = Float.NaN;

    /* loaded from: classes.dex */
    protected static class a {
        static void a(int[] iArr, float[][] fArr, int i11, int i12) {
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

        private static int b(int[] iArr, float[][] fArr, int i11, int i12) {
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

        private static void c(int[] iArr, float[][] fArr, int i11, int i12) {
            int i13 = iArr[i11];
            iArr[i11] = iArr[i12];
            iArr[i12] = i13;
            float[] fArr2 = fArr[i11];
            fArr[i11] = fArr[i12];
            fArr[i12] = fArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float a(float f11) {
        float abs;
        switch (this.f8846b) {
            case 1:
                return Math.signum(f11 * f8844k);
            case 2:
                abs = Math.abs(f11);
                break;
            case 3:
                return (((f11 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f11 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f11 * f8844k);
            case 6:
                float abs2 = 1.0f - Math.abs(((f11 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f11 * f8844k);
        }
        return 1.0f - abs;
    }

    public void b(int i11, float f11, float f12, int i12, float f13) {
        int[] iArr = this.f8847c;
        int i13 = this.f8849e;
        iArr[i13] = i11;
        float[][] fArr = this.f8848d;
        fArr[i13][0] = f11;
        fArr[i13][1] = f12;
        fArr[i13][2] = f13;
        this.f8846b = Math.max(this.f8846b, i12);
        this.f8849e++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(long j11) {
        this.f8853i = j11;
    }

    public void d(String str) {
        this.f8850f = str;
    }

    public void e(int i11) {
        int i12;
        int i13 = this.f8849e;
        if (i13 == 0) {
            System.err.println("Error no points added to " + this.f8850f);
            return;
        }
        a.a(this.f8847c, this.f8848d, 0, i13 - 1);
        int i14 = 1;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f8847c;
            if (i14 >= iArr.length) {
                break;
            }
            if (iArr[i14] != iArr[i14 - 1]) {
                i15++;
            }
            i14++;
        }
        if (i15 == 0) {
            i15 = 1;
        }
        double[] dArr = new double[i15];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, i15, 3);
        int i16 = 0;
        for (i12 = 0; i12 < this.f8849e; i12 = i12 + 1) {
            if (i12 > 0) {
                int[] iArr2 = this.f8847c;
                i12 = iArr2[i12] == iArr2[i12 - 1] ? i12 + 1 : 0;
            }
            dArr[i16] = this.f8847c[i12] * 0.01d;
            double[] dArr3 = dArr2[i16];
            float[][] fArr = this.f8848d;
            dArr3[0] = fArr[i12][0];
            dArr2[i16][1] = fArr[i12][1];
            dArr2[i16][2] = fArr[i12][2];
            i16++;
        }
        this.f8845a = b.a(i11, dArr, dArr2);
    }

    public String toString() {
        String str = this.f8850f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i11 = 0; i11 < this.f8849e; i11++) {
            str = str + "[" + this.f8847c[i11] + " , " + decimalFormat.format(this.f8848d[i11]) + "] ";
        }
        return str;
    }
}