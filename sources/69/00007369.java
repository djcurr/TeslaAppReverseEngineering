package hj;

import ak.k0;
import hj.f;

/* loaded from: classes3.dex */
public final class l extends e {

    /* renamed from: j  reason: collision with root package name */
    private final f f29300j;

    /* renamed from: k  reason: collision with root package name */
    private f.a f29301k;

    /* renamed from: l  reason: collision with root package name */
    private long f29302l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f29303m;

    public l(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, ci.i iVar, int i11, Object obj, f fVar) {
        super(aVar, bVar, 2, iVar, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.f29300j = fVar;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void a() {
        if (this.f29302l == 0) {
            this.f29300j.c(this.f29301k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            com.google.android.exoplayer2.upstream.b e11 = this.f29255b.e(this.f29302l);
            zj.m mVar = this.f29262i;
            ji.e eVar = new ji.e(mVar, e11.f14637f, mVar.i(e11));
            while (!this.f29303m && this.f29300j.a(eVar)) {
            }
            this.f29302l = eVar.getPosition() - this.f29255b.f14637f;
        } finally {
            k0.n(this.f29262i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void b() {
        this.f29303m = true;
    }

    public void g(f.a aVar) {
        this.f29301k = aVar;
    }
}