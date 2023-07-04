package x2;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class c {
    public static final long a(int i11, int i12, int i13, int i14) {
        boolean z11 = true;
        if (!(i12 >= i11)) {
            throw new IllegalArgumentException(("maxWidth(" + i12 + ") must be >= than minWidth(" + i11 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        if (!(i14 >= i13)) {
            throw new IllegalArgumentException(("maxHeight(" + i14 + ") must be >= than minHeight(" + i13 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        if (i11 < 0 || i13 < 0) {
            z11 = false;
        }
        if (z11) {
            return b.f56930b.b(i11, i12, i13, i14);
        }
        throw new IllegalArgumentException(("minWidth(" + i11 + ") and minHeight(" + i13 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long b(int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = 0;
        }
        if ((i15 & 2) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = Integer.MAX_VALUE;
        }
        return a(i11, i12, i13, i14);
    }

    private static final int c(int i11, int i12) {
        int d11;
        if (i11 == Integer.MAX_VALUE) {
            return i11;
        }
        d11 = m00.l.d(i11 + i12, 0);
        return d11;
    }

    public static final long d(long j11, long j12) {
        int m11;
        int m12;
        m11 = m00.l.m(o.g(j12), b.p(j11), b.n(j11));
        m12 = m00.l.m(o.f(j12), b.o(j11), b.m(j11));
        return p.a(m11, m12);
    }

    public static final long e(long j11, long j12) {
        int m11;
        int m12;
        int m13;
        int m14;
        m11 = m00.l.m(b.p(j12), b.p(j11), b.n(j11));
        m12 = m00.l.m(b.n(j12), b.p(j11), b.n(j11));
        m13 = m00.l.m(b.o(j12), b.o(j11), b.m(j11));
        m14 = m00.l.m(b.m(j12), b.o(j11), b.m(j11));
        return a(m11, m12, m13, m14);
    }

    public static final int f(long j11, int i11) {
        int m11;
        m11 = m00.l.m(i11, b.o(j11), b.m(j11));
        return m11;
    }

    public static final int g(long j11, int i11) {
        int m11;
        m11 = m00.l.m(i11, b.p(j11), b.n(j11));
        return m11;
    }

    public static final long h(long j11, int i11, int i12) {
        int d11;
        int d12;
        d11 = m00.l.d(b.p(j11) + i11, 0);
        int c11 = c(b.n(j11), i11);
        d12 = m00.l.d(b.o(j11) + i12, 0);
        return a(d11, c11, d12, c(b.m(j11), i12));
    }

    public static /* synthetic */ long i(long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return h(j11, i11, i12);
    }
}