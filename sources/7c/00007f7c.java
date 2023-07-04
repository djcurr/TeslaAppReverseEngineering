package kotlin.text;

import kotlin.KotlinNothingValueException;
import okhttp3.internal.http2.Settings;
import vz.d0;

/* loaded from: classes5.dex */
public final class z {
    public static final byte a(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        vz.w b11 = b(str);
        if (b11 != null) {
            return b11.f();
        }
        u.m(str);
        throw new KotlinNothingValueException();
    }

    public static final vz.w b(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        return c(str, 10);
    }

    public static final vz.w c(String str, int i11) {
        kotlin.jvm.internal.s.g(str, "<this>");
        vz.x f11 = f(str, i11);
        if (f11 != null) {
            int f12 = f11.f();
            if (d0.a(f12, vz.x.b(255)) > 0) {
                return null;
            }
            return vz.w.a(vz.w.b((byte) f12));
        }
        return null;
    }

    public static final int d(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        vz.x e11 = e(str);
        if (e11 != null) {
            return e11.f();
        }
        u.m(str);
        throw new KotlinNothingValueException();
    }

    public static final vz.x e(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        return f(str, 10);
    }

    public static final vz.x f(String str, int i11) {
        kotlin.jvm.internal.s.g(str, "<this>");
        b.a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        int i13 = 1;
        if (kotlin.jvm.internal.s.i(charAt, 48) >= 0) {
            i13 = 0;
        } else if (length == 1 || charAt != '+') {
            return null;
        }
        int b11 = vz.x.b(i11);
        int i14 = 119304647;
        while (i13 < length) {
            int b12 = b.b(str.charAt(i13), i11);
            if (b12 < 0) {
                return null;
            }
            if (d0.a(i12, i14) > 0) {
                if (i14 == 119304647) {
                    i14 = d0.b(-1, b11);
                    if (d0.a(i12, i14) > 0) {
                    }
                }
                return null;
            }
            int b13 = vz.x.b(i12 * b11);
            int b14 = vz.x.b(vz.x.b(b12) + b13);
            if (d0.a(b14, b13) < 0) {
                return null;
            }
            i13++;
            i12 = b14;
        }
        return vz.x.a(i12);
    }

    public static final long g(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        vz.y h11 = h(str);
        if (h11 != null) {
            return h11.f();
        }
        u.m(str);
        throw new KotlinNothingValueException();
    }

    public static final vz.y h(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        return i(str, 10);
    }

    public static final vz.y i(String str, int i11) {
        int b11;
        kotlin.jvm.internal.s.g(str, "<this>");
        b.a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        long j11 = -1;
        int i12 = 0;
        char charAt = str.charAt(0);
        if (kotlin.jvm.internal.s.i(charAt, 48) < 0) {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i12 = 1;
        }
        long b12 = vz.y.b(i11);
        long j12 = 0;
        long j13 = 512409557603043100L;
        while (i12 < length) {
            if (b.b(str.charAt(i12), i11) < 0) {
                return null;
            }
            if (d0.c(j12, j13) > 0) {
                if (j13 == 512409557603043100L) {
                    j13 = d0.d(j11, b12);
                    if (d0.c(j12, j13) > 0) {
                    }
                }
                return null;
            }
            long b13 = vz.y.b(j12 * b12);
            long b14 = vz.y.b(vz.y.b(vz.x.b(b11) & 4294967295L) + b13);
            if (d0.c(b14, b13) < 0) {
                return null;
            }
            i12++;
            j12 = b14;
            j11 = -1;
        }
        return vz.y.a(j12);
    }

    public static final short j(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        vz.a0 k11 = k(str);
        if (k11 != null) {
            return k11.f();
        }
        u.m(str);
        throw new KotlinNothingValueException();
    }

    public static final vz.a0 k(String str) {
        kotlin.jvm.internal.s.g(str, "<this>");
        return l(str, 10);
    }

    public static final vz.a0 l(String str, int i11) {
        kotlin.jvm.internal.s.g(str, "<this>");
        vz.x f11 = f(str, i11);
        if (f11 != null) {
            int f12 = f11.f();
            if (d0.a(f12, vz.x.b(Settings.DEFAULT_INITIAL_WINDOW_SIZE)) > 0) {
                return null;
            }
            return vz.a0.a(vz.a0.b((short) f12));
        }
        return null;
    }
}