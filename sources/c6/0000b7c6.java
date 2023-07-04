package ui;

import ak.k0;
import ji.v;
import ji.w;

/* loaded from: classes3.dex */
final class e implements v {

    /* renamed from: a  reason: collision with root package name */
    private final c f53470a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53471b;

    /* renamed from: c  reason: collision with root package name */
    private final long f53472c;

    /* renamed from: d  reason: collision with root package name */
    private final long f53473d;

    /* renamed from: e  reason: collision with root package name */
    private final long f53474e;

    public e(c cVar, int i11, long j11, long j12) {
        this.f53470a = cVar;
        this.f53471b = i11;
        this.f53472c = j11;
        long j13 = (j12 - j11) / cVar.f53465d;
        this.f53473d = j13;
        this.f53474e = a(j13);
    }

    private long a(long j11) {
        return k0.I0(j11 * this.f53471b, 1000000L, this.f53470a.f53464c);
    }

    @Override // ji.v
    public v.a f(long j11) {
        long s11 = k0.s((this.f53470a.f53464c * j11) / (this.f53471b * 1000000), 0L, this.f53473d - 1);
        long j12 = this.f53472c + (this.f53470a.f53465d * s11);
        long a11 = a(s11);
        w wVar = new w(a11, j12);
        if (a11 < j11 && s11 != this.f53473d - 1) {
            long j13 = s11 + 1;
            return new v.a(wVar, new w(a(j13), this.f53472c + (this.f53470a.f53465d * j13)));
        }
        return new v.a(wVar);
    }

    @Override // ji.v
    public boolean h() {
        return true;
    }

    @Override // ji.v
    public long i() {
        return this.f53474e;
    }
}