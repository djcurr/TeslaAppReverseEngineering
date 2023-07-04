package com.google.android.exoplayer2.source.smoothstreaming;

import ci.q;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.drm.g;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.a;
import com.google.android.exoplayer2.source.u;
import fj.r;
import fj.v;
import hj.h;
import java.util.ArrayList;
import zj.l;
import zj.n;

/* loaded from: classes3.dex */
final class c implements i, u.a<h<b>> {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f14258a;

    /* renamed from: b  reason: collision with root package name */
    private final n f14259b;

    /* renamed from: c  reason: collision with root package name */
    private final l f14260c;

    /* renamed from: d  reason: collision with root package name */
    private final g f14261d;

    /* renamed from: e  reason: collision with root package name */
    private final f.a f14262e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g f14263f;

    /* renamed from: g  reason: collision with root package name */
    private final k.a f14264g;

    /* renamed from: h  reason: collision with root package name */
    private final zj.b f14265h;

    /* renamed from: i  reason: collision with root package name */
    private final v f14266i;

    /* renamed from: j  reason: collision with root package name */
    private final fj.c f14267j;

    /* renamed from: k  reason: collision with root package name */
    private i.a f14268k;

    /* renamed from: l  reason: collision with root package name */
    private com.google.android.exoplayer2.source.smoothstreaming.manifest.a f14269l;

    /* renamed from: m  reason: collision with root package name */
    private ChunkSampleStream<b>[] f14270m;

    /* renamed from: n  reason: collision with root package name */
    private u f14271n;

    public c(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, b.a aVar2, n nVar, fj.c cVar, g gVar, f.a aVar3, com.google.android.exoplayer2.upstream.g gVar2, k.a aVar4, l lVar, zj.b bVar) {
        this.f14269l = aVar;
        this.f14258a = aVar2;
        this.f14259b = nVar;
        this.f14260c = lVar;
        this.f14261d = gVar;
        this.f14262e = aVar3;
        this.f14263f = gVar2;
        this.f14264g = aVar4;
        this.f14265h = bVar;
        this.f14267j = cVar;
        this.f14266i = i(aVar, gVar);
        ChunkSampleStream<b>[] q11 = q(0);
        this.f14270m = q11;
        this.f14271n = cVar.a(q11);
    }

    private h<b> f(xj.g gVar, long j11) {
        int b11 = this.f14266i.b(gVar.j());
        return new h<>(this.f14269l.f14309f[b11].f14315a, null, null, this.f14258a.a(this.f14260c, this.f14269l, b11, gVar, this.f14259b), this, this.f14265h, j11, this.f14261d, this.f14262e, this.f14263f, this.f14264g);
    }

    private static v i(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, g gVar) {
        fj.u[] uVarArr = new fj.u[aVar.f14309f.length];
        int i11 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f14309f;
            if (i11 < bVarArr.length) {
                ci.i[] iVarArr = bVarArr[i11].f14324j;
                ci.i[] iVarArr2 = new ci.i[iVarArr.length];
                for (int i12 = 0; i12 < iVarArr.length; i12++) {
                    ci.i iVar = iVarArr[i12];
                    iVarArr2[i12] = iVar.b(gVar.c(iVar));
                }
                uVarArr[i11] = new fj.u(iVarArr2);
                i11++;
            } else {
                return new v(uVarArr);
            }
        }
    }

    private static ChunkSampleStream<b>[] q(int i11) {
        return new h[i11];
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long b() {
        return this.f14271n.b();
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean c() {
        return this.f14271n.c();
    }

    @Override // com.google.android.exoplayer2.source.i
    public long d(long j11, q qVar) {
        h[] hVarArr;
        for (h hVar : this.f14270m) {
            if (hVar.f29265a == 2) {
                return hVar.d(j11, qVar);
            }
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean e(long j11) {
        return this.f14271n.e(j11);
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long g() {
        return this.f14271n.g();
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public void h(long j11) {
        this.f14271n.h(j11);
    }

    @Override // com.google.android.exoplayer2.source.i
    public long k(long j11) {
        for (h hVar : this.f14270m) {
            hVar.R(j11);
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.i
    public long l() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void m(i.a aVar, long j11) {
        this.f14268k = aVar;
        aVar.p(this);
    }

    @Override // com.google.android.exoplayer2.source.i
    public long o(xj.g[] gVarArr, boolean[] zArr, r[] rVarArr, boolean[] zArr2, long j11) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < gVarArr.length; i11++) {
            if (rVarArr[i11] != null) {
                h hVar = (h) rVarArr[i11];
                if (gVarArr[i11] != null && zArr[i11]) {
                    ((b) hVar.D()).b(gVarArr[i11]);
                    arrayList.add(hVar);
                } else {
                    hVar.O();
                    rVarArr[i11] = null;
                }
            }
            if (rVarArr[i11] == null && gVarArr[i11] != null) {
                h<b> f11 = f(gVarArr[i11], j11);
                arrayList.add(f11);
                rVarArr[i11] = f11;
                zArr2[i11] = true;
            }
        }
        ChunkSampleStream<b>[] q11 = q(arrayList.size());
        this.f14270m = q11;
        arrayList.toArray(q11);
        this.f14271n = this.f14267j.a(this.f14270m);
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void r() {
        this.f14260c.a();
    }

    @Override // com.google.android.exoplayer2.source.u.a
    /* renamed from: s */
    public void j(h<b> hVar) {
        this.f14268k.j(this);
    }

    @Override // com.google.android.exoplayer2.source.i
    public v t() {
        return this.f14266i;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void u(long j11, boolean z11) {
        for (h hVar : this.f14270m) {
            hVar.u(j11, z11);
        }
    }

    public void v() {
        for (h hVar : this.f14270m) {
            hVar.O();
        }
        this.f14268k = null;
    }

    public void w(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar) {
        this.f14269l = aVar;
        for (h hVar : this.f14270m) {
            ((b) hVar.D()).c(aVar);
        }
        this.f14268k.j(this);
    }
}