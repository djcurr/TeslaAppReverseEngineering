package m00;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;
import m00.g;

/* loaded from: classes5.dex */
public class l extends k {
    public static float c(float f11, float f12) {
        return f11 < f12 ? f12 : f11;
    }

    public static int d(int i11, int i12) {
        return i11 < i12 ? i12 : i11;
    }

    public static long e(long j11, long j12) {
        return j11 < j12 ? j12 : j11;
    }

    public static <T extends Comparable<? super T>> T f(T t11, T minimumValue) {
        s.g(t11, "<this>");
        s.g(minimumValue, "minimumValue");
        return t11.compareTo(minimumValue) < 0 ? minimumValue : t11;
    }

    public static double g(double d11, double d12) {
        return d11 > d12 ? d12 : d11;
    }

    public static float h(float f11, float f12) {
        return f11 > f12 ? f12 : f11;
    }

    public static int i(int i11, int i12) {
        return i11 > i12 ? i12 : i11;
    }

    public static long j(long j11, long j12) {
        return j11 > j12 ? j12 : j11;
    }

    public static double k(double d11, double d12, double d13) {
        if (d12 <= d13) {
            return d11 < d12 ? d12 : d11 > d13 ? d13 : d11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d13 + " is less than minimum " + d12 + CoreConstants.DOT);
    }

    public static float l(float f11, float f12, float f13) {
        if (f12 <= f13) {
            return f11 < f12 ? f12 : f11 > f13 ? f13 : f11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f13 + " is less than minimum " + f12 + CoreConstants.DOT);
    }

    public static int m(int i11, int i12, int i13) {
        if (i12 <= i13) {
            return i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i13 + " is less than minimum " + i12 + CoreConstants.DOT);
    }

    public static long n(long j11, long j12, long j13) {
        if (j12 <= j13) {
            return j11 < j12 ? j12 : j11 > j13 ? j13 : j11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j13 + " is less than minimum " + j12 + CoreConstants.DOT);
    }

    public static <T extends Comparable<? super T>> T o(T t11, T t12, T t13) {
        s.g(t11, "<this>");
        if (t12 != null && t13 != null) {
            if (t12.compareTo(t13) <= 0) {
                if (t11.compareTo(t12) < 0) {
                    return t12;
                }
                if (t11.compareTo(t13) > 0) {
                    return t13;
                }
            } else {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t13 + " is less than minimum " + t12 + CoreConstants.DOT);
            }
        } else if (t12 != null && t11.compareTo(t12) < 0) {
            return t12;
        } else {
            if (t13 != null && t11.compareTo(t13) > 0) {
                return t13;
            }
        }
        return t11;
    }

    public static g p(int i11, int i12) {
        return g.f38147d.a(i11, i12, -1);
    }

    public static g q(g gVar, int i11) {
        s.g(gVar, "<this>");
        k.a(i11 > 0, Integer.valueOf(i11));
        g.a aVar = g.f38147d;
        int c11 = gVar.c();
        int e11 = gVar.e();
        if (gVar.f() <= 0) {
            i11 = -i11;
        }
        return aVar.a(c11, e11, i11);
    }

    public static i r(int i11, int i12) {
        if (i12 <= Integer.MIN_VALUE) {
            return i.f38155e.a();
        }
        return new i(i11, i12 - 1);
    }
}