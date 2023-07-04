package hj;

import ak.k0;
import ji.x;

/* loaded from: classes3.dex */
public final class o extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f29306o;

    /* renamed from: p  reason: collision with root package name */
    private final ci.i f29307p;

    /* renamed from: q  reason: collision with root package name */
    private long f29308q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f29309r;

    public o(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, ci.i iVar, int i11, Object obj, long j11, long j12, long j13, int i12, ci.i iVar2) {
        super(aVar, bVar, iVar, i11, obj, j11, j12, -9223372036854775807L, -9223372036854775807L, j13);
        this.f29306o = i12;
        this.f29307p = iVar2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void a() {
        c j11 = j();
        j11.b(0L);
        x f11 = j11.f(0, this.f29306o);
        f11.d(this.f29307p);
        try {
            long i11 = this.f29262i.i(this.f29255b.e(this.f29308q));
            if (i11 != -1) {
                i11 += this.f29308q;
            }
            ji.e eVar = new ji.e(this.f29262i, this.f29308q, i11);
            for (int i12 = 0; i12 != -1; i12 = f11.a(eVar, Integer.MAX_VALUE, true)) {
                this.f29308q += i12;
            }
            f11.f(this.f29260g, 1, (int) this.f29308q, 0, null);
            k0.n(this.f29262i);
            this.f29309r = true;
        } catch (Throwable th2) {
            k0.n(this.f29262i);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void b() {
    }

    @Override // hj.m
    public boolean h() {
        return this.f29309r;
    }
}