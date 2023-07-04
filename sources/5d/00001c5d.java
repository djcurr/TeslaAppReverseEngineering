package com.google.android.exoplayer2.source.smoothstreaming;

import ak.k0;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.drm.g;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.a;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.upstream.g;
import com.google.android.exoplayer2.upstream.h;
import fj.p;
import fj.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zj.l;
import zj.n;

/* loaded from: classes3.dex */
public final class SsMediaSource extends com.google.android.exoplayer2.source.a implements Loader.b<h<com.google.android.exoplayer2.source.smoothstreaming.manifest.a>> {
    private n A;
    private long B;
    private com.google.android.exoplayer2.source.smoothstreaming.manifest.a C;
    private Handler E;

    /* renamed from: g */
    private final boolean f14224g;

    /* renamed from: h */
    private final Uri f14225h;

    /* renamed from: i */
    private final i0.g f14226i;

    /* renamed from: j */
    private final i0 f14227j;

    /* renamed from: k */
    private final a.InterfaceC0258a f14228k;

    /* renamed from: l */
    private final b.a f14229l;

    /* renamed from: m */
    private final fj.c f14230m;

    /* renamed from: n */
    private final g f14231n;

    /* renamed from: o */
    private final com.google.android.exoplayer2.upstream.g f14232o;

    /* renamed from: p */
    private final long f14233p;

    /* renamed from: q */
    private final k.a f14234q;

    /* renamed from: t */
    private final h.a<? extends com.google.android.exoplayer2.source.smoothstreaming.manifest.a> f14235t;

    /* renamed from: w */
    private final ArrayList<c> f14236w;

    /* renamed from: x */
    private com.google.android.exoplayer2.upstream.a f14237x;

    /* renamed from: y */
    private Loader f14238y;

    /* renamed from: z */
    private l f14239z;

    /* loaded from: classes3.dex */
    public static final class Factory implements p {

        /* renamed from: a */
        private final b.a f14240a;

        /* renamed from: b */
        private final a.InterfaceC0258a f14241b;

        /* renamed from: c */
        private fj.c f14242c;

        /* renamed from: d */
        private hi.l f14243d;

        /* renamed from: e */
        private com.google.android.exoplayer2.upstream.g f14244e;

        /* renamed from: f */
        private long f14245f;

        /* renamed from: g */
        private h.a<? extends com.google.android.exoplayer2.source.smoothstreaming.manifest.a> f14246g;

        /* renamed from: h */
        private List<ej.c> f14247h;

        /* renamed from: i */
        private Object f14248i;

        public Factory(a.InterfaceC0258a interfaceC0258a) {
            this(new a.C0254a(interfaceC0258a), interfaceC0258a);
        }

        public static /* synthetic */ g a(g gVar, i0 i0Var) {
            return d(gVar, i0Var);
        }

        public static /* synthetic */ g d(g gVar, i0 i0Var) {
            return gVar;
        }

        @Deprecated
        public SsMediaSource b(Uri uri) {
            return c(new i0.c().i(uri).a());
        }

        public SsMediaSource c(i0 i0Var) {
            List<ej.c> list;
            i0 i0Var2 = i0Var;
            ak.a.e(i0Var2.f13502b);
            h.a aVar = this.f14246g;
            if (aVar == null) {
                aVar = new SsManifestParser();
            }
            if (!i0Var2.f13502b.f13556e.isEmpty()) {
                list = i0Var2.f13502b.f13556e;
            } else {
                list = this.f14247h;
            }
            ej.b bVar = !list.isEmpty() ? new ej.b(aVar, list) : aVar;
            i0.g gVar = i0Var2.f13502b;
            boolean z11 = true;
            boolean z12 = gVar.f13559h == null && this.f14248i != null;
            if (!gVar.f13556e.isEmpty() || list.isEmpty()) {
                z11 = false;
            }
            if (z12 && z11) {
                i0Var2 = i0Var.a().h(this.f14248i).f(list).a();
            } else if (z12) {
                i0Var2 = i0Var.a().h(this.f14248i).a();
            } else if (z11) {
                i0Var2 = i0Var.a().f(list).a();
            }
            i0 i0Var3 = i0Var2;
            return new SsMediaSource(i0Var3, null, this.f14241b, bVar, this.f14240a, this.f14242c, this.f14243d.a(i0Var3), this.f14244e, this.f14245f);
        }

        public Factory e(final g gVar) {
            if (gVar == null) {
                f(null);
            } else {
                f(new hi.l() { // from class: mj.b
                    @Override // hi.l
                    public final g a(i0 i0Var) {
                        return SsMediaSource.Factory.a(g.this, i0Var);
                    }
                });
            }
            return this;
        }

        public Factory f(hi.l lVar) {
            if (lVar != null) {
                this.f14243d = lVar;
            } else {
                this.f14243d = new d();
            }
            return this;
        }

        public Factory g(com.google.android.exoplayer2.upstream.g gVar) {
            if (gVar == null) {
                gVar = new f();
            }
            this.f14244e = gVar;
            return this;
        }

        public Factory(b.a aVar, a.InterfaceC0258a interfaceC0258a) {
            this.f14240a = (b.a) ak.a.e(aVar);
            this.f14241b = interfaceC0258a;
            this.f14243d = new d();
            this.f14244e = new f();
            this.f14245f = 30000L;
            this.f14242c = new fj.d();
            this.f14247h = Collections.emptyList();
        }
    }

    static {
        ci.h.a("goog.exo.smoothstreaming");
    }

    public static /* synthetic */ void D(SsMediaSource ssMediaSource) {
        ssMediaSource.J();
    }

    private void H() {
        a.b[] bVarArr;
        t tVar;
        for (int i11 = 0; i11 < this.f14236w.size(); i11++) {
            this.f14236w.get(i11).w(this.C);
        }
        long j11 = Long.MIN_VALUE;
        long j12 = Long.MAX_VALUE;
        for (a.b bVar : this.C.f14309f) {
            if (bVar.f14325k > 0) {
                j12 = Math.min(j12, bVar.e(0));
                j11 = Math.max(j11, bVar.e(bVar.f14325k - 1) + bVar.c(bVar.f14325k - 1));
            }
        }
        if (j12 == Long.MAX_VALUE) {
            long j13 = this.C.f14307d ? -9223372036854775807L : 0L;
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.C;
            boolean z11 = aVar.f14307d;
            tVar = new t(j13, 0L, 0L, 0L, true, z11, z11, aVar, this.f14227j);
        } else {
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar2 = this.C;
            if (aVar2.f14307d) {
                long j14 = aVar2.f14311h;
                if (j14 != -9223372036854775807L && j14 > 0) {
                    j12 = Math.max(j12, j11 - j14);
                }
                long j15 = j12;
                long j16 = j11 - j15;
                long c11 = j16 - ci.b.c(this.f14233p);
                if (c11 < 5000000) {
                    c11 = Math.min(5000000L, j16 / 2);
                }
                tVar = new t(-9223372036854775807L, j16, j15, c11, true, true, true, this.C, this.f14227j);
            } else {
                long j17 = aVar2.f14310g;
                long j18 = j17 != -9223372036854775807L ? j17 : j11 - j12;
                tVar = new t(j12 + j18, j18, j12, 0L, true, false, false, this.C, this.f14227j);
            }
        }
        B(tVar);
    }

    private void I() {
        if (this.C.f14307d) {
            this.E.postDelayed(new Runnable() { // from class: mj.a
                {
                    SsMediaSource.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SsMediaSource.D(SsMediaSource.this);
                }
            }, Math.max(0L, (this.B + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public void J() {
        if (this.f14238y.i()) {
            return;
        }
        h hVar = new h(this.f14237x, this.f14225h, 4, this.f14235t);
        this.f14234q.z(new fj.g(hVar.f14696a, hVar.f14697b, this.f14238y.n(hVar, this, this.f14232o.d(hVar.f14698c))), hVar.f14698c);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void A(n nVar) {
        this.A = nVar;
        this.f14231n.a();
        if (this.f14224g) {
            this.f14239z = new l.a();
            H();
            return;
        }
        this.f14237x = this.f14228k.a();
        Loader loader = new Loader("Loader:Manifest");
        this.f14238y = loader;
        this.f14239z = loader;
        this.E = k0.x();
        J();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void C() {
        this.C = this.f14224g ? this.C : null;
        this.f14237x = null;
        this.B = 0L;
        Loader loader = this.f14238y;
        if (loader != null) {
            loader.l();
            this.f14238y = null;
        }
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.E = null;
        }
        this.f14231n.release();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: E */
    public void i(h<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> hVar, long j11, long j12, boolean z11) {
        fj.g gVar = new fj.g(hVar.f14696a, hVar.f14697b, hVar.f(), hVar.d(), j11, j12, hVar.c());
        this.f14232o.f(hVar.f14696a);
        this.f14234q.q(gVar, hVar.f14698c);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: F */
    public void j(h<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> hVar, long j11, long j12) {
        fj.g gVar = new fj.g(hVar.f14696a, hVar.f14697b, hVar.f(), hVar.d(), j11, j12, hVar.c());
        this.f14232o.f(hVar.f14696a);
        this.f14234q.t(gVar, hVar.f14698c);
        this.C = hVar.e();
        this.B = j11 - j12;
        H();
        I();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: G */
    public Loader.c n(h<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> hVar, long j11, long j12, IOException iOException, int i11) {
        Loader.c h11;
        fj.g gVar = new fj.g(hVar.f14696a, hVar.f14697b, hVar.f(), hVar.d(), j11, j12, hVar.c());
        long a11 = this.f14232o.a(new g.a(gVar, new fj.h(hVar.f14698c), iOException, i11));
        if (a11 == -9223372036854775807L) {
            h11 = Loader.f14598f;
        } else {
            h11 = Loader.h(false, a11);
        }
        boolean z11 = !h11.c();
        this.f14234q.x(gVar, hVar.f14698c, iOException, z11);
        if (z11) {
            this.f14232o.f(hVar.f14696a);
        }
        return h11;
    }

    @Override // com.google.android.exoplayer2.source.j
    public i0 f() {
        return this.f14227j;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void g(i iVar) {
        ((c) iVar).v();
        this.f14236w.remove(iVar);
    }

    @Override // com.google.android.exoplayer2.source.j
    public i k(j.a aVar, zj.b bVar, long j11) {
        k.a v11 = v(aVar);
        c cVar = new c(this.C, this.f14229l, this.A, this.f14230m, this.f14231n, t(aVar), this.f14232o, v11, this.f14239z, bVar);
        this.f14236w.add(cVar);
        return cVar;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void p() {
        this.f14239z.a();
    }

    private SsMediaSource(i0 i0Var, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, a.InterfaceC0258a interfaceC0258a, h.a<? extends com.google.android.exoplayer2.source.smoothstreaming.manifest.a> aVar2, b.a aVar3, fj.c cVar, com.google.android.exoplayer2.drm.g gVar, com.google.android.exoplayer2.upstream.g gVar2, long j11) {
        ak.a.f(aVar == null || !aVar.f14307d);
        this.f14227j = i0Var;
        i0.g gVar3 = (i0.g) ak.a.e(i0Var.f13502b);
        this.f14226i = gVar3;
        this.C = aVar;
        this.f14225h = gVar3.f13552a.equals(Uri.EMPTY) ? null : k0.C(gVar3.f13552a);
        this.f14228k = interfaceC0258a;
        this.f14235t = aVar2;
        this.f14229l = aVar3;
        this.f14230m = cVar;
        this.f14231n = gVar;
        this.f14232o = gVar2;
        this.f14233p = j11;
        this.f14234q = v(null);
        this.f14224g = aVar != null;
        this.f14236w = new ArrayList<>();
    }
}