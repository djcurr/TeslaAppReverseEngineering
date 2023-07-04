package n2;

/* loaded from: classes.dex */
public final class z {
    public static final long a(int i11) {
        return b(i11, i11);
    }

    public static final long b(int i11, int i12) {
        return y.c(d(i11, i12));
    }

    public static final long c(long j11, int i11, int i12) {
        int m11;
        int m12;
        m11 = m00.l.m(y.n(j11), i11, i12);
        m12 = m00.l.m(y.i(j11), i11, i12);
        return (m11 == y.n(j11) && m12 == y.i(j11)) ? j11 : b(m11, m12);
    }

    private static final long d(int i11, int i12) {
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i11 + ']').toString());
        }
        if (i12 >= 0) {
            return (i12 & 4294967295L) | (i11 << 32);
        }
        throw new IllegalArgumentException(("end cannot negative. [end: " + i12 + ']').toString());
    }
}