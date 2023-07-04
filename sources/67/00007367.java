package hj;

import ak.k0;
import hj.f;

/* loaded from: classes3.dex */
public class j extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f29292o;

    /* renamed from: p  reason: collision with root package name */
    private final long f29293p;

    /* renamed from: q  reason: collision with root package name */
    private final f f29294q;

    /* renamed from: r  reason: collision with root package name */
    private long f29295r;

    /* renamed from: s  reason: collision with root package name */
    private volatile boolean f29296s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f29297t;

    public j(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, ci.i iVar, int i11, Object obj, long j11, long j12, long j13, long j14, long j15, int i12, long j16, f fVar) {
        super(aVar, bVar, iVar, i11, obj, j11, j12, j13, j14, j15);
        this.f29292o = i12;
        this.f29293p = j16;
        this.f29294q = fVar;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void a() {
        if (this.f29295r == 0) {
            c j11 = j();
            j11.b(this.f29293p);
            f fVar = this.f29294q;
            f.a l11 = l(j11);
            long j12 = this.f29230k;
            long j13 = j12 == -9223372036854775807L ? -9223372036854775807L : j12 - this.f29293p;
            long j14 = this.f29231l;
            fVar.c(l11, j13, j14 == -9223372036854775807L ? -9223372036854775807L : j14 - this.f29293p);
        }
        try {
            com.google.android.exoplayer2.upstream.b e11 = this.f29255b.e(this.f29295r);
            zj.m mVar = this.f29262i;
            ji.e eVar = new ji.e(mVar, e11.f14637f, mVar.i(e11));
            while (!this.f29296s && this.f29294q.a(eVar)) {
            }
            this.f29295r = eVar.getPosition() - this.f29255b.f14637f;
            k0.n(this.f29262i);
            this.f29297t = !this.f29296s;
        } catch (Throwable th2) {
            k0.n(this.f29262i);
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void b() {
        this.f29296s = true;
    }

    @Override // hj.m
    public long g() {
        return this.f29304j + this.f29292o;
    }

    @Override // hj.m
    public boolean h() {
        return this.f29297t;
    }

    protected f.a l(c cVar) {
        return cVar;
    }
}