package u1;

import kotlin.jvm.internal.s;
import u1.b;
import u1.f;

/* loaded from: classes.dex */
public final class d {
    public static final double a(double d11, double d12, double d13, double d14, double d15, double d16) {
        return Math.copySign(n(d11 < 0.0d ? -d11 : d11, d12, d13, d14, d15, d16), d11);
    }

    public static final double b(double d11, double d12, double d13, double d14, double d15, double d16) {
        return Math.copySign(p(d11 < 0.0d ? -d11 : d11, d12, d13, d14, d15, d16), d11);
    }

    public static final c c(c cVar, m whitePoint, a adaptation) {
        s.g(cVar, "<this>");
        s.g(whitePoint, "whitePoint");
        s.g(adaptation, "adaptation");
        if (b.e(cVar.f(), b.f52891a.b())) {
            k kVar = (k) cVar;
            if (f(kVar.r(), whitePoint)) {
                return cVar;
            }
            return new k(kVar, k(e(adaptation.c(), kVar.r().c(), whitePoint.c()), kVar.q()), whitePoint);
        }
        return cVar;
    }

    public static /* synthetic */ c d(c cVar, m mVar, a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = a.f52887b.a();
        }
        return c(cVar, mVar, aVar);
    }

    public static final float[] e(float[] matrix, float[] srcWhitePoint, float[] dstWhitePoint) {
        s.g(matrix, "matrix");
        s.g(srcWhitePoint, "srcWhitePoint");
        s.g(dstWhitePoint, "dstWhitePoint");
        float[] m11 = m(matrix, srcWhitePoint);
        float[] m12 = m(matrix, dstWhitePoint);
        return k(j(matrix), l(new float[]{m12[0] / m11[0], m12[1] / m11[1], m12[2] / m11[2]}, matrix));
    }

    public static final boolean f(m a11, m b11) {
        s.g(a11, "a");
        s.g(b11, "b");
        if (a11 == b11) {
            return true;
        }
        return Math.abs(a11.a() - b11.a()) < 0.001f && Math.abs(a11.b() - b11.b()) < 0.001f;
    }

    public static final boolean g(float[] a11, float[] b11) {
        s.g(a11, "a");
        s.g(b11, "b");
        if (a11 == b11) {
            return true;
        }
        int length = a11.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (Float.compare(a11[i11], b11[i11]) != 0 && Math.abs(a11[i11] - b11[i11]) > 0.001f) {
                return false;
            }
            i11 = i12;
        }
        return true;
    }

    public static final f h(c connect, c destination, int i11) {
        s.g(connect, "$this$connect");
        s.g(destination, "destination");
        if (connect == destination) {
            return f.f52925d.c(connect);
        }
        long f11 = connect.f();
        b.a aVar = b.f52891a;
        if (b.e(f11, aVar.b()) && b.e(destination.f(), aVar.b())) {
            return new f.b((k) connect, (k) destination, i11, null);
        }
        return new f(connect, destination, i11, null);
    }

    public static /* synthetic */ f i(c cVar, c cVar2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            cVar2 = e.f52899a.s();
        }
        if ((i12 & 2) != 0) {
            i11 = j.f52942a.b();
        }
        return h(cVar, cVar2, i11);
    }

    public static final float[] j(float[] m11) {
        s.g(m11, "m");
        float f11 = m11[0];
        float f12 = m11[3];
        float f13 = m11[6];
        float f14 = m11[1];
        float f15 = m11[4];
        float f16 = m11[7];
        float f17 = m11[2];
        float f18 = m11[5];
        float f19 = m11[8];
        float f21 = (f15 * f19) - (f16 * f18);
        float f22 = (f16 * f17) - (f14 * f19);
        float f23 = (f14 * f18) - (f15 * f17);
        float f24 = (f11 * f21) + (f12 * f22) + (f13 * f23);
        float[] fArr = new float[m11.length];
        fArr[0] = f21 / f24;
        fArr[1] = f22 / f24;
        fArr[2] = f23 / f24;
        fArr[3] = ((f13 * f18) - (f12 * f19)) / f24;
        fArr[4] = ((f19 * f11) - (f13 * f17)) / f24;
        fArr[5] = ((f17 * f12) - (f18 * f11)) / f24;
        fArr[6] = ((f12 * f16) - (f13 * f15)) / f24;
        fArr[7] = ((f13 * f14) - (f16 * f11)) / f24;
        fArr[8] = ((f11 * f15) - (f12 * f14)) / f24;
        return fArr;
    }

    public static final float[] k(float[] lhs, float[] rhs) {
        s.g(lhs, "lhs");
        s.g(rhs, "rhs");
        return new float[]{(lhs[0] * rhs[0]) + (lhs[3] * rhs[1]) + (lhs[6] * rhs[2]), (lhs[1] * rhs[0]) + (lhs[4] * rhs[1]) + (lhs[7] * rhs[2]), (lhs[2] * rhs[0]) + (lhs[5] * rhs[1]) + (lhs[8] * rhs[2]), (lhs[0] * rhs[3]) + (lhs[3] * rhs[4]) + (lhs[6] * rhs[5]), (lhs[1] * rhs[3]) + (lhs[4] * rhs[4]) + (lhs[7] * rhs[5]), (lhs[2] * rhs[3]) + (lhs[5] * rhs[4]) + (lhs[8] * rhs[5]), (lhs[0] * rhs[6]) + (lhs[3] * rhs[7]) + (lhs[6] * rhs[8]), (lhs[1] * rhs[6]) + (lhs[4] * rhs[7]) + (lhs[7] * rhs[8]), (lhs[2] * rhs[6]) + (lhs[5] * rhs[7]) + (lhs[8] * rhs[8])};
    }

    public static final float[] l(float[] lhs, float[] rhs) {
        s.g(lhs, "lhs");
        s.g(rhs, "rhs");
        return new float[]{lhs[0] * rhs[0], lhs[1] * rhs[1], lhs[2] * rhs[2], lhs[0] * rhs[3], lhs[1] * rhs[4], lhs[2] * rhs[5], lhs[0] * rhs[6], lhs[1] * rhs[7], lhs[2] * rhs[8]};
    }

    public static final float[] m(float[] lhs, float[] rhs) {
        s.g(lhs, "lhs");
        s.g(rhs, "rhs");
        float f11 = rhs[0];
        float f12 = rhs[1];
        float f13 = rhs[2];
        rhs[0] = (lhs[0] * f11) + (lhs[3] * f12) + (lhs[6] * f13);
        rhs[1] = (lhs[1] * f11) + (lhs[4] * f12) + (lhs[7] * f13);
        rhs[2] = (lhs[2] * f11) + (lhs[5] * f12) + (lhs[8] * f13);
        return rhs;
    }

    public static final double n(double d11, double d12, double d13, double d14, double d15, double d16) {
        return d11 >= d15 * d14 ? (Math.pow(d11, 1.0d / d16) - d13) / d12 : d11 / d14;
    }

    public static final double o(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        return d11 >= d15 * d14 ? (Math.pow(d11 - d16, 1.0d / d18) - d13) / d12 : (d11 - d17) / d14;
    }

    public static final double p(double d11, double d12, double d13, double d14, double d15, double d16) {
        return d11 >= d15 ? Math.pow((d12 * d11) + d13, d16) : d11 * d14;
    }

    public static final double q(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        return d11 >= d15 ? Math.pow((d12 * d11) + d13, d18) + d16 : (d14 * d11) + d17;
    }
}