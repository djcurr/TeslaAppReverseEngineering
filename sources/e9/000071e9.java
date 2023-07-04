package h2;

/* loaded from: classes.dex */
final class d {
    public static final int a(long j11, long j12) {
        boolean d11 = d(j11);
        if (d11 != d(j12)) {
            return d11 ? -1 : 1;
        }
        return (int) Math.signum(c(j11) - c(j12));
    }

    public static long b(long j11) {
        return j11;
    }

    public static final float c(long j11) {
        kotlin.jvm.internal.l lVar = kotlin.jvm.internal.l.f34915a;
        return Float.intBitsToFloat((int) (j11 >> 32));
    }

    public static final boolean d(long j11) {
        return ((int) (j11 & 4294967295L)) != 0;
    }
}