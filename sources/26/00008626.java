package m3;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<double[]> f38362a = new ThreadLocal<>();

    public static void a(int i11, int i12, int i13, double[] dArr) {
        if (dArr.length == 3) {
            double d11 = i11 / 255.0d;
            double pow = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            double d12 = i12 / 255.0d;
            double pow2 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
            double d13 = i13 / 255.0d;
            double pow3 = d13 < 0.04045d ? d13 / 12.92d : Math.pow((d13 + 0.055d) / 1.055d, 2.4d);
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int b(double d11, double d12, double d13) {
        double d14 = (((3.2406d * d11) + ((-1.5372d) * d12)) + ((-0.4986d) * d13)) / 100.0d;
        double d15 = ((((-0.9689d) * d11) + (1.8758d * d12)) + (0.0415d * d13)) / 100.0d;
        double d16 = (((0.0557d * d11) + ((-0.204d) * d12)) + (1.057d * d13)) / 100.0d;
        return Color.rgb(i((int) Math.round((d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d) * 255.0d), 0, 255), i((int) Math.round((d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d) * 255.0d), 0, 255), i((int) Math.round((d16 > 0.0031308d ? (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d : d16 * 12.92d) * 255.0d), 0, 255));
    }

    public static double c(int i11, int i12) {
        if (Color.alpha(i12) == 255) {
            if (Color.alpha(i11) < 255) {
                i11 = g(i11, i12);
            }
            double d11 = d(i11) + 0.05d;
            double d12 = d(i12) + 0.05d;
            return Math.max(d11, d12) / Math.min(d11, d12);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i12));
    }

    public static double d(int i11) {
        double[] j11 = j();
        e(i11, j11);
        return j11[1] / 100.0d;
    }

    public static void e(int i11, double[] dArr) {
        a(Color.red(i11), Color.green(i11), Color.blue(i11), dArr);
    }

    private static int f(int i11, int i12) {
        return 255 - (((255 - i12) * (255 - i11)) / 255);
    }

    public static int g(int i11, int i12) {
        int alpha = Color.alpha(i12);
        int alpha2 = Color.alpha(i11);
        int f11 = f(alpha2, alpha);
        return Color.argb(f11, h(Color.red(i11), alpha2, Color.red(i12), alpha, f11), h(Color.green(i11), alpha2, Color.green(i12), alpha, f11), h(Color.blue(i11), alpha2, Color.blue(i12), alpha, f11));
    }

    private static int h(int i11, int i12, int i13, int i14, int i15) {
        if (i15 == 0) {
            return 0;
        }
        return (((i11 * 255) * i12) + ((i13 * i14) * (255 - i12))) / (i15 * 255);
    }

    private static int i(int i11, int i12, int i13) {
        return i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
    }

    private static double[] j() {
        ThreadLocal<double[]> threadLocal = f38362a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }

    public static int k(int i11, int i12) {
        if (i12 < 0 || i12 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i11 & 16777215) | (i12 << 24);
    }
}