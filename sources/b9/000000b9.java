package ak;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private long f468a;

    /* renamed from: b  reason: collision with root package name */
    private long f469b;

    /* renamed from: c  reason: collision with root package name */
    private volatile long f470c = -9223372036854775807L;

    public g0(long j11) {
        h(j11);
    }

    public static long f(long j11) {
        return (j11 * 1000000) / 90000;
    }

    public static long i(long j11) {
        return (j11 * 90000) / 1000000;
    }

    public static long j(long j11) {
        return i(j11) % 8589934592L;
    }

    public long a(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f470c != -9223372036854775807L) {
            this.f470c = j11;
        } else {
            long j12 = this.f468a;
            if (j12 != Long.MAX_VALUE) {
                this.f469b = j12 - j11;
            }
            synchronized (this) {
                this.f470c = j11;
                notifyAll();
            }
        }
        return j11 + this.f469b;
    }

    public long b(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f470c != -9223372036854775807L) {
            long i11 = i(this.f470c);
            long j12 = (4294967296L + i11) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j11;
            j11 += j12 * 8589934592L;
            if (Math.abs(j13 - i11) < Math.abs(j11 - i11)) {
                j11 = j13;
            }
        }
        return a(f(j11));
    }

    public long c() {
        return this.f468a;
    }

    public long d() {
        if (this.f470c != -9223372036854775807L) {
            return this.f469b + this.f470c;
        }
        long j11 = this.f468a;
        if (j11 != Long.MAX_VALUE) {
            return j11;
        }
        return -9223372036854775807L;
    }

    public long e() {
        if (this.f468a == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.f470c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f469b;
    }

    public void g() {
        this.f470c = -9223372036854775807L;
    }

    public synchronized void h(long j11) {
        a.f(this.f470c == -9223372036854775807L);
        this.f468a = j11;
    }

    public synchronized void k() {
        while (this.f470c == -9223372036854775807L) {
            wait();
        }
    }
}