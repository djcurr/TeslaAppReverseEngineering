package ji;

import ak.k0;
import ji.v;

/* loaded from: classes3.dex */
public class d implements v {

    /* renamed from: a  reason: collision with root package name */
    private final long f33715a;

    /* renamed from: b  reason: collision with root package name */
    private final long f33716b;

    /* renamed from: c  reason: collision with root package name */
    private final int f33717c;

    /* renamed from: d  reason: collision with root package name */
    private final long f33718d;

    /* renamed from: e  reason: collision with root package name */
    private final int f33719e;

    /* renamed from: f  reason: collision with root package name */
    private final long f33720f;

    public d(long j11, long j12, int i11, int i12) {
        this.f33715a = j11;
        this.f33716b = j12;
        this.f33717c = i12 == -1 ? 1 : i12;
        this.f33719e = i11;
        if (j11 == -1) {
            this.f33718d = -1L;
            this.f33720f = -9223372036854775807L;
            return;
        }
        this.f33718d = j11 - j12;
        this.f33720f = d(j11, j12, i11);
    }

    private long a(long j11) {
        int i11 = this.f33717c;
        return this.f33716b + k0.s((((j11 * this.f33719e) / 8000000) / i11) * i11, 0L, this.f33718d - i11);
    }

    private static long d(long j11, long j12, int i11) {
        return ((Math.max(0L, j11 - j12) * 8) * 1000000) / i11;
    }

    public long b(long j11) {
        return d(j11, this.f33716b, this.f33719e);
    }

    @Override // ji.v
    public v.a f(long j11) {
        if (this.f33718d == -1) {
            return new v.a(new w(0L, this.f33716b));
        }
        long a11 = a(j11);
        long b11 = b(a11);
        w wVar = new w(b11, a11);
        if (b11 < j11) {
            int i11 = this.f33717c;
            if (i11 + a11 < this.f33715a) {
                long j12 = a11 + i11;
                return new v.a(wVar, new w(b(j12), j12));
            }
        }
        return new v.a(wVar);
    }

    @Override // ji.v
    public boolean h() {
        return this.f33718d != -1;
    }

    @Override // ji.v
    public long i() {
        return this.f33720f;
    }
}