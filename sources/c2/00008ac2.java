package net.time4j.calendar;

import net.time4j.b0;
import net.time4j.calendar.f;
import net.time4j.engine.z;
import net.time4j.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class d<D extends f<?, D>> implements net.time4j.engine.k<D> {

    /* renamed from: a  reason: collision with root package name */
    private static final long f40879a = g0.N0(1645, 1, 28).b();

    /* renamed from: b  reason: collision with root package name */
    private static final long f40880b = g0.N0(3000, 1, 27).b();

    /* renamed from: c  reason: collision with root package name */
    private static final long f40881c = g0.N0(-2636, 2, 15).b();

    private long e(int i11, int i12, h hVar) {
        long o11 = o(p(i11, i12) + ((hVar.getNumber() - 1) * 29));
        return hVar.equals(b(o11).a0()) ? o11 : o(o11 + 1);
    }

    private boolean i(long j11, long j12) {
        return j12 >= j11 && (j(j12) || i(j11, n(j12)));
    }

    private static long l(long j11, long j12) {
        return Math.round((j12 - j11) / 29.530588861d);
    }

    private long n(long j11) {
        return net.time4j.calendar.astro.d.NEW_MOON.before(m(j11)).v0(h(j11)).d0().b();
    }

    private long q(long j11) {
        long v11 = v(j11);
        long v12 = v(370 + v11);
        long o11 = o(v11 + 1);
        long o12 = o(o11 + 1);
        return (l(o11, n(v12 + 1)) == 12 && (j(o11) || j(o12))) ? o(o12 + 1) : o12;
    }

    private long r(long j11) {
        long q11 = q(j11);
        return j11 >= q11 ? q11 : q(j11 - 180);
    }

    private long v(long j11) {
        net.time4j.tz.p h11 = h(j11);
        g0 V0 = g0.V0(j11, z.UTC);
        int year = (V0.getMonth() <= 11 || V0.n() <= 15) ? V0.getYear() - 1 : V0.getYear();
        net.time4j.calendar.astro.b bVar = net.time4j.calendar.astro.b.WINTER_SOLSTICE;
        g0 T = bVar.inYear(year).v0(h11).T();
        if (T.M(V0)) {
            T = bVar.inYear(year - 1).v0(h11).T();
        }
        return T.b();
    }

    @Override // net.time4j.engine.k
    public final long a() {
        return f40880b;
    }

    @Override // net.time4j.engine.k
    public long c() {
        return f40879a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract D d(int i11, int i12, h hVar, int i13, long j11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int f(int i11, int i12) {
        int[] g11 = g();
        int i13 = (((i11 - 1) * 60) + i12) - 1;
        int i14 = ((i13 - g11[0]) / 3) * 2;
        while (i14 < g11.length) {
            int i15 = g11[i14];
            if (i15 >= i13) {
                if (i15 > i13) {
                    return 0;
                }
                return g11[i14 + 1];
            }
            i14 += Math.max(((i13 - i15) / 3) * 2, 2);
        }
        return 0;
    }

    abstract int[] g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract net.time4j.tz.p h(long j11);

    final boolean j(long j11) {
        return (((int) Math.floor(o.solarLongitude(net.time4j.calendar.astro.c.h(m(j11)).d()) / 30.0d)) + 2) % 12 == (((int) Math.floor(o.solarLongitude(net.time4j.calendar.astro.c.h(m(o(j11 + 1))).d()) / 30.0d)) + 2) % 12;
    }

    boolean k(int i11, int i12, h hVar, int i13) {
        if (i11 < 72 || i11 > 94 || i12 < 1 || i12 > 60 || ((i11 == 72 && i12 < 22) || ((i11 == 94 && i12 > 56) || i13 < 1 || i13 > 30 || hVar == null || (hVar.c() && hVar.getNumber() != f(i11, i12))))) {
            return false;
        }
        if (i13 == 30) {
            long e11 = e(i11, i12, hVar);
            return o(1 + e11) - e11 == 30;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0 m(long j11) {
        return g0.V0(j11, z.UTC).p0().N(h(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long o(long j11) {
        return net.time4j.calendar.astro.d.NEW_MOON.atOrAfter(m(j11)).v0(h(j11)).d0().b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long p(int i11, int i12) {
        return r((long) Math.floor(f40881c + (((((i11 - 1) * 60) + i12) - 0.5d) * 365.242189d)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long s(int i11, int i12, h hVar, int i13) {
        if (k(i11, i12, hVar, i13)) {
            return (e(i11, i12, hVar) + i13) - 1;
        }
        throw new IllegalArgumentException("Invalid date.");
    }

    @Override // net.time4j.engine.k
    /* renamed from: t */
    public final long transform(D d11) {
        return s(d11.U(), d11.e0().getNumber(), d11.a0(), d11.n());
    }

    @Override // net.time4j.engine.k
    /* renamed from: u */
    public final D b(long j11) {
        long v11 = v(j11);
        long v12 = v(370 + v11);
        long o11 = o(v11 + 1);
        long n11 = n(v12 + 1);
        long n12 = n(j11 + 1);
        boolean z11 = l(o11, n11) == 12;
        long l11 = l(o11, n12);
        if (z11 && i(o11, n12)) {
            l11--;
        }
        int d11 = net.time4j.base.c.d(l11, 12);
        int i11 = d11 != 0 ? d11 : 12;
        long floor = (long) Math.floor((1.5d - (i11 / 12.0d)) + ((j11 - f40881c) / 365.242189d));
        int b11 = 1 + ((int) net.time4j.base.c.b(floor - 1, 60));
        int d12 = net.time4j.base.c.d(floor, 60);
        int i12 = d12 != 0 ? d12 : 60;
        int i13 = (int) ((j11 - n12) + 1);
        h d13 = h.d(i11);
        if (z11 && j(n12) && !i(o11, n(n12))) {
            d13 = d13.e();
        }
        return d(b11, i12, d13, i13, j11);
    }
}