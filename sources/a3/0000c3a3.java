package yy;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class c {
    public static long a(AtomicLong atomicLong, long j11) {
        long j12;
        do {
            j12 = atomicLong.get();
            if (j12 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j12, b(j12, j11)));
        return j12;
    }

    public static long b(long j11, long j12) {
        long j13 = j11 + j12;
        if (j13 < 0) {
            return Long.MAX_VALUE;
        }
        return j13;
    }

    public static long c(AtomicLong atomicLong, long j11) {
        long j12;
        long j13;
        do {
            j12 = atomicLong.get();
            if (j12 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j13 = j12 - j11;
            if (j13 < 0) {
                az.a.r(new IllegalStateException("More produced than requested: " + j13));
                j13 = 0L;
            }
        } while (!atomicLong.compareAndSet(j12, j13));
        return j13;
    }
}