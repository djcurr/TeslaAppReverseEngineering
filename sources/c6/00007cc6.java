package k00;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d {
    public static final String a(Object from, Object until) {
        s.g(from, "from");
        s.g(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void b(int i11, int i12) {
        if (!(i12 > i11)) {
            throw new IllegalArgumentException(a(Integer.valueOf(i11), Integer.valueOf(i12)).toString());
        }
    }

    public static final void c(long j11, long j12) {
        if (!(j12 > j11)) {
            throw new IllegalArgumentException(a(Long.valueOf(j11), Long.valueOf(j12)).toString());
        }
    }

    public static final int d(int i11) {
        return 31 - Integer.numberOfLeadingZeros(i11);
    }

    public static final int e(int i11, int i12) {
        return (i11 >>> (32 - i12)) & ((-i12) >> 31);
    }
}