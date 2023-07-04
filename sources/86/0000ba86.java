package vz;

/* loaded from: classes5.dex */
public final class d0 {
    public static final int a(int i11, int i12) {
        return kotlin.jvm.internal.s.i(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE);
    }

    public static final int b(int i11, int i12) {
        return x.b((int) ((i11 & 4294967295L) / (i12 & 4294967295L)));
    }

    public static final int c(long j11, long j12) {
        return kotlin.jvm.internal.s.j(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
    }

    public static final long d(long j11, long j12) {
        if (j12 < 0) {
            return c(j11, j12) < 0 ? y.b(0L) : y.b(1L);
        } else if (j11 >= 0) {
            return y.b(j11 / j12);
        } else {
            long j13 = ((j11 >>> 1) / j12) << 1;
            return y.b(j13 + (c(y.b(j11 - (j13 * j12)), y.b(j12)) < 0 ? 0 : 1));
        }
    }

    public static final double e(long j11) {
        return ((j11 >>> 11) * 2048) + (j11 & 2047);
    }

    public static final String f(long j11) {
        return g(j11, 10);
    }

    public static final String g(long j11, int i11) {
        int a11;
        int a12;
        int a13;
        if (j11 >= 0) {
            a13 = kotlin.text.b.a(i11);
            String l11 = Long.toString(j11, a13);
            kotlin.jvm.internal.s.f(l11, "toString(this, checkRadix(radix))");
            return l11;
        }
        long j12 = i11;
        long j13 = ((j11 >>> 1) / j12) << 1;
        long j14 = j11 - (j13 * j12);
        if (j14 >= j12) {
            j14 -= j12;
            j13++;
        }
        StringBuilder sb2 = new StringBuilder();
        a11 = kotlin.text.b.a(i11);
        String l12 = Long.toString(j13, a11);
        kotlin.jvm.internal.s.f(l12, "toString(this, checkRadix(radix))");
        sb2.append(l12);
        a12 = kotlin.text.b.a(i11);
        String l13 = Long.toString(j14, a12);
        kotlin.jvm.internal.s.f(l13, "toString(this, checkRadix(radix))");
        sb2.append(l13);
        return sb2.toString();
    }
}