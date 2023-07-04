package com.google.android.exoplayer2.source.hls;

import ak.k0;
import android.net.Uri;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.b;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.f;
import fj.c;
import fj.p;
import fj.t;
import hi.l;
import java.util.Collections;
import java.util.List;
import kj.g;
import kj.h;
import kj.k;
import lj.e;
import zj.n;

/* loaded from: classes3.dex */
public final class HlsMediaSource extends com.google.android.exoplayer2.source.a implements HlsPlaylistTracker.c {

    /* renamed from: g */
    private final h f13969g;

    /* renamed from: h */
    private final i0.g f13970h;

    /* renamed from: i */
    private final g f13971i;

    /* renamed from: j */
    private final c f13972j;

    /* renamed from: k */
    private final com.google.android.exoplayer2.drm.g f13973k;

    /* renamed from: l */
    private final com.google.android.exoplayer2.upstream.g f13974l;

    /* renamed from: m */
    private final boolean f13975m;

    /* renamed from: n */
    private final int f13976n;

    /* renamed from: o */
    private final boolean f13977o;

    /* renamed from: p */
    private final HlsPlaylistTracker f13978p;

    /* renamed from: q */
    private final long f13979q;

    /* renamed from: t */
    private final i0 f13980t;

    /* renamed from: w */
    private i0.f f13981w;

    /* renamed from: x */
    private n f13982x;

    /* loaded from: classes3.dex */
    public static final class Factory implements p {

        /* renamed from: a */
        private final g f13983a;

        /* renamed from: b */
        private h f13984b;

        /* renamed from: c */
        private e f13985c;

        /* renamed from: d */
        private HlsPlaylistTracker.a f13986d;

        /* renamed from: e */
        private c f13987e;

        /* renamed from: f */
        private l f13988f;

        /* renamed from: g */
        private com.google.android.exoplayer2.upstream.g f13989g;

        /* renamed from: h */
        private boolean f13990h;

        /* renamed from: i */
        private int f13991i;

        /* renamed from: j */
        private boolean f13992j;

        /* renamed from: k */
        private List<ej.c> f13993k;

        /* renamed from: l */
        private Object f13994l;

        /* renamed from: m */
        private long f13995m;

        public Factory(a.InterfaceC0258a interfaceC0258a) {
            this(new kj.c(interfaceC0258a));
        }

        public static /* synthetic */ com.google.android.exoplayer2.drm.g a(com.google.android.exoplayer2.drm.g gVar, i0 i0Var) {
            return d(gVar, i0Var);
        }

        public static /* synthetic */ com.google.android.exoplayer2.drm.g d(com.google.android.exoplayer2.drm.g gVar, i0 i0Var) {
            return gVar;
        }

        @Deprecated
        public HlsMediaSource b(Uri uri) {
            return c(new i0.c().i(uri).e("application/x-mpegURL").a());
        }

        public HlsMediaSource c(i0 i0Var) {
            List<ej.c> list;
            i0 i0Var2 = i0Var;
            ak.a.e(i0Var2.f13502b);
            e eVar = this.f13985c;
            if (i0Var2.f13502b.f13556e.isEmpty()) {
                list = this.f13993k;
            } else {
                list = i0Var2.f13502b.f13556e;
            }
            if (!list.isEmpty()) {
                eVar = new lj.c(eVar, list);
            }
            i0.g gVar = i0Var2.f13502b;
            boolean z11 = true;
            boolean z12 = gVar.f13559h == null && this.f13994l != null;
            if (!gVar.f13556e.isEmpty() || list.isEmpty()) {
                z11 = false;
            }
            if (z12 && z11) {
                i0Var2 = i0Var.a().h(this.f13994l).f(list).a();
            } else if (z12) {
                i0Var2 = i0Var.a().h(this.f13994l).a();
            } else if (z11) {
                i0Var2 = i0Var.a().f(list).a();
            }
            i0 i0Var3 = i0Var2;
            g gVar2 = this.f13983a;
            h hVar = this.f13984b;
            c cVar = this.f13987e;
            com.google.android.exoplayer2.drm.g a11 = this.f13988f.a(i0Var3);
            com.google.android.exoplayer2.upstream.g gVar3 = this.f13989g;
            return new HlsMediaSource(i0Var3, gVar2, hVar, cVar, a11, gVar3, this.f13986d.a(this.f13983a, gVar3, eVar), this.f13995m, this.f13990h, this.f13991i, this.f13992j);
        }

        public Factory e(final com.google.android.exoplayer2.drm.g gVar) {
            if (gVar == null) {
                f(null);
            } else {
                f(new l() { // from class: kj.l
                    @Override // hi.l
                    public final com.google.android.exoplayer2.drm.g a(i0 i0Var) {
                        return HlsMediaSource.Factory.a(com.google.android.exoplayer2.drm.g.this, i0Var);
                    }
                });
            }
            return this;
        }

        public Factory f(l lVar) {
            if (lVar != null) {
                this.f13988f = lVar;
            } else {
                this.f13988f = new d();
            }
            return this;
        }

        public Factory g(com.google.android.exoplayer2.upstream.g gVar) {
            if (gVar == null) {
                gVar = new f();
            }
            this.f13989g = gVar;
            return this;
        }

        public Factory(g gVar) {
            this.f13983a = (g) ak.a.e(gVar);
            this.f13988f = new d();
            this.f13985c = new lj.a();
            this.f13986d = b.f14036p;
            this.f13984b = h.f34716a;
            this.f13989g = new f();
            this.f13987e = new fj.d();
            this.f13991i = 1;
            this.f13993k = Collections.emptyList();
            this.f13995m = -9223372036854775807L;
        }
    }

    static {
        ci.h.a("goog.exo.hls");
    }

    private long D(com.google.android.exoplayer2.source.hls.playlist.d dVar) {
        if (dVar.f14093n) {
            return ci.b.c(k0.Z(this.f13979q)) - dVar.e();
        }
        return 0L;
    }

    private static long E(com.google.android.exoplayer2.source.hls.playlist.d dVar, long j11) {
        d.f fVar = dVar.f14099t;
        long j12 = fVar.f14120d;
        if (j12 == -9223372036854775807L || dVar.f14091l == -9223372036854775807L) {
            j12 = fVar.f14119c;
            if (j12 == -9223372036854775807L) {
                j12 = dVar.f14090k * 3;
            }
        }
        return j12 + j11;
    }

    private long F(com.google.android.exoplayer2.source.hls.playlist.d dVar, long j11) {
        List<d.C0252d> list = dVar.f14095p;
        int size = list.size() - 1;
        long c11 = (dVar.f14098s + j11) - ci.b.c(this.f13981w.f13547a);
        while (size > 0 && list.get(size).f14110e > c11) {
            size--;
        }
        return list.get(size).f14110e;
    }

    private void G(long j11) {
        long d11 = ci.b.d(j11);
        if (d11 != this.f13981w.f13547a) {
            this.f13981w = this.f13980t.a().c(d11).a().f13503c;
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void A(n nVar) {
        this.f13982x = nVar;
        this.f13973k.a();
        this.f13978p.k(this.f13970h.f13552a, v(null), this);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void C() {
        this.f13978p.stop();
        this.f13973k.release();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.c
    public void c(com.google.android.exoplayer2.source.hls.playlist.d dVar) {
        t tVar;
        long E;
        long j11;
        long d11 = dVar.f14093n ? ci.b.d(dVar.f14085f) : -9223372036854775807L;
        int i11 = dVar.f14083d;
        long j12 = (i11 == 2 || i11 == 1) ? d11 : -9223372036854775807L;
        long j13 = dVar.f14084e;
        com.google.android.exoplayer2.source.hls.a aVar = new com.google.android.exoplayer2.source.hls.a((com.google.android.exoplayer2.source.hls.playlist.c) ak.a.e(this.f13978p.d()), dVar);
        if (this.f13978p.h()) {
            long D = D(dVar);
            long j14 = this.f13981w.f13547a;
            if (j14 != -9223372036854775807L) {
                E = ci.b.c(j14);
            } else {
                E = E(dVar, D);
            }
            G(k0.s(E, D, dVar.f14098s + D));
            long c11 = dVar.f14085f - this.f13978p.c();
            long j15 = dVar.f14092m ? c11 + dVar.f14098s : -9223372036854775807L;
            if (dVar.f14095p.isEmpty()) {
                j11 = j13 == -9223372036854775807L ? 0L : j13;
            } else {
                j11 = F(dVar, D);
            }
            tVar = new t(j12, d11, -9223372036854775807L, j15, dVar.f14098s, c11, j11, true, !dVar.f14092m, aVar, this.f13980t, this.f13981w);
        } else {
            long j16 = j13 == -9223372036854775807L ? 0L : j13;
            long j17 = dVar.f14098s;
            tVar = new t(j12, d11, -9223372036854775807L, j17, j17, 0L, j16, true, false, aVar, this.f13980t, null);
        }
        B(tVar);
    }

    @Override // com.google.android.exoplayer2.source.j
    public i0 f() {
        return this.f13980t;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void g(i iVar) {
        ((k) iVar).B();
    }

    @Override // com.google.android.exoplayer2.source.j
    public i k(j.a aVar, zj.b bVar, long j11) {
        k.a v11 = v(aVar);
        return new kj.k(this.f13969g, this.f13978p, this.f13971i, this.f13982x, this.f13973k, t(aVar), this.f13974l, v11, bVar, this.f13972j, this.f13975m, this.f13976n, this.f13977o);
    }

    @Override // com.google.android.exoplayer2.source.j
    public void p() {
        this.f13978p.l();
    }

    private HlsMediaSource(i0 i0Var, g gVar, h hVar, c cVar, com.google.android.exoplayer2.drm.g gVar2, com.google.android.exoplayer2.upstream.g gVar3, HlsPlaylistTracker hlsPlaylistTracker, long j11, boolean z11, int i11, boolean z12) {
        this.f13970h = (i0.g) ak.a.e(i0Var.f13502b);
        this.f13980t = i0Var;
        this.f13981w = i0Var.f13503c;
        this.f13971i = gVar;
        this.f13969g = hVar;
        this.f13972j = cVar;
        this.f13973k = gVar2;
        this.f13974l = gVar3;
        this.f13978p = hlsPlaylistTracker;
        this.f13979q = j11;
        this.f13975m = z11;
        this.f13976n = i11;
        this.f13977o = z12;
    }
}