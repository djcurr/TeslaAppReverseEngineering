package pi;

import ak.k0;
import ak.o;
import ak.v;
import ei.s;
import ji.v;
import ji.w;

/* loaded from: classes3.dex */
final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f46572a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46573b;

    /* renamed from: c  reason: collision with root package name */
    private final long f46574c;

    /* renamed from: d  reason: collision with root package name */
    private final long f46575d;

    /* renamed from: e  reason: collision with root package name */
    private final long f46576e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f46577f;

    private i(long j11, int i11, long j12) {
        this(j11, i11, j12, -1L, null);
    }

    public static i a(long j11, long j12, s.a aVar, v vVar) {
        int G;
        int i11 = aVar.f25184g;
        int i12 = aVar.f25181d;
        int m11 = vVar.m();
        if ((m11 & 1) != 1 || (G = vVar.G()) == 0) {
            return null;
        }
        long I0 = k0.I0(G, i11 * 1000000, i12);
        if ((m11 & 6) != 6) {
            return new i(j12, aVar.f25180c, I0);
        }
        long E = vVar.E();
        long[] jArr = new long[100];
        for (int i13 = 0; i13 < 100; i13++) {
            jArr[i13] = vVar.C();
        }
        if (j11 != -1) {
            long j13 = j12 + E;
            if (j11 != j13) {
                StringBuilder sb2 = new StringBuilder(67);
                sb2.append("XING data size mismatch: ");
                sb2.append(j11);
                sb2.append(", ");
                sb2.append(j13);
                o.h("XingSeeker", sb2.toString());
            }
        }
        return new i(j12, aVar.f25180c, I0, E, jArr);
    }

    private long b(int i11) {
        return (this.f46574c * i11) / 100;
    }

    @Override // pi.g
    public long c(long j11) {
        long j12 = j11 - this.f46572a;
        if (!h() || j12 <= this.f46573b) {
            return 0L;
        }
        long[] jArr = (long[]) ak.a.h(this.f46577f);
        double d11 = (j12 * 256.0d) / this.f46575d;
        int i11 = k0.i(jArr, (long) d11, true, true);
        long b11 = b(i11);
        long j13 = jArr[i11];
        int i12 = i11 + 1;
        long b12 = b(i12);
        long j14 = i11 == 99 ? 256L : jArr[i12];
        return b11 + Math.round((j13 == j14 ? 0.0d : (d11 - j13) / (j14 - j13)) * (b12 - b11));
    }

    @Override // ji.v
    public v.a f(long j11) {
        long[] jArr;
        if (!h()) {
            return new v.a(new w(0L, this.f46572a + this.f46573b));
        }
        long s11 = k0.s(j11, 0L, this.f46574c);
        double d11 = (s11 * 100.0d) / this.f46574c;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i11 = (int) d11;
                double d13 = ((long[]) ak.a.h(this.f46577f))[i11];
                d12 = d13 + ((d11 - i11) * ((i11 == 99 ? 256.0d : jArr[i11 + 1]) - d13));
            }
        }
        return new v.a(new w(s11, this.f46572a + k0.s(Math.round((d12 / 256.0d) * this.f46575d), this.f46573b, this.f46575d - 1)));
    }

    @Override // pi.g
    public long g() {
        return this.f46576e;
    }

    @Override // ji.v
    public boolean h() {
        return this.f46577f != null;
    }

    @Override // ji.v
    public long i() {
        return this.f46574c;
    }

    private i(long j11, int i11, long j12, long j13, long[] jArr) {
        this.f46572a = j11;
        this.f46573b = i11;
        this.f46574c = j12;
        this.f46577f = jArr;
        this.f46575d = j13;
        this.f46576e = j13 != -1 ? j11 + j13 : -1L;
    }
}