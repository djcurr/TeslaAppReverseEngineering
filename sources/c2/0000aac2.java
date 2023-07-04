package pi;

import ak.k0;
import android.util.Pair;
import bj.k;
import ji.v;
import ji.w;

/* loaded from: classes3.dex */
final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f46542a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f46543b;

    /* renamed from: c  reason: collision with root package name */
    private final long f46544c;

    private c(long[] jArr, long[] jArr2, long j11) {
        this.f46542a = jArr;
        this.f46543b = jArr2;
        this.f46544c = j11 == -9223372036854775807L ? ci.b.c(jArr2[jArr2.length - 1]) : j11;
    }

    public static c a(long j11, k kVar, long j12) {
        int length = kVar.f7704e.length;
        int i11 = length + 1;
        long[] jArr = new long[i11];
        long[] jArr2 = new long[i11];
        jArr[0] = j11;
        long j13 = 0;
        jArr2[0] = 0;
        for (int i12 = 1; i12 <= length; i12++) {
            int i13 = i12 - 1;
            j11 += kVar.f7702c + kVar.f7704e[i13];
            j13 += kVar.f7703d + kVar.f7705f[i13];
            jArr[i12] = j11;
            jArr2[i12] = j13;
        }
        return new c(jArr, jArr2, j12);
    }

    private static Pair<Long, Long> b(long j11, long[] jArr, long[] jArr2) {
        int i11 = k0.i(jArr, j11, true, true);
        long j12 = jArr[i11];
        long j13 = jArr2[i11];
        int i12 = i11 + 1;
        if (i12 == jArr.length) {
            return Pair.create(Long.valueOf(j12), Long.valueOf(j13));
        }
        long j14 = jArr[i12];
        return Pair.create(Long.valueOf(j11), Long.valueOf(((long) ((j14 == j12 ? 0.0d : (j11 - j12) / (j14 - j12)) * (jArr2[i12] - j13))) + j13));
    }

    @Override // pi.g
    public long c(long j11) {
        return ci.b.c(((Long) b(j11, this.f46542a, this.f46543b).second).longValue());
    }

    @Override // ji.v
    public v.a f(long j11) {
        Pair<Long, Long> b11 = b(ci.b.d(k0.s(j11, 0L, this.f46544c)), this.f46543b, this.f46542a);
        return new v.a(new w(ci.b.c(((Long) b11.first).longValue()), ((Long) b11.second).longValue()));
    }

    @Override // pi.g
    public long g() {
        return -1L;
    }

    @Override // ji.v
    public boolean h() {
        return true;
    }

    @Override // ji.v
    public long i() {
        return this.f46544c;
    }
}