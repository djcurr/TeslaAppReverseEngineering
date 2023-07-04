package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.z0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class r extends com.google.android.exoplayer2.source.a implements q.b {

    /* renamed from: g */
    private final i0 f14193g;

    /* renamed from: h */
    private final i0.g f14194h;

    /* renamed from: i */
    private final a.InterfaceC0258a f14195i;

    /* renamed from: j */
    private final ji.l f14196j;

    /* renamed from: k */
    private final com.google.android.exoplayer2.drm.g f14197k;

    /* renamed from: l */
    private final com.google.android.exoplayer2.upstream.g f14198l;

    /* renamed from: m */
    private final int f14199m;

    /* renamed from: n */
    private boolean f14200n = true;

    /* renamed from: o */
    private long f14201o = -9223372036854775807L;

    /* renamed from: p */
    private boolean f14202p;

    /* renamed from: q */
    private boolean f14203q;

    /* renamed from: t */
    private zj.n f14204t;

    /* loaded from: classes3.dex */
    public class a extends fj.f {
        a(r rVar, z0 z0Var) {
            super(z0Var);
        }

        @Override // fj.f, com.google.android.exoplayer2.z0
        public z0.c o(int i11, z0.c cVar, long j11) {
            super.o(i11, cVar, j11);
            cVar.f14798l = true;
            return cVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements fj.p {

        /* renamed from: a */
        private final a.InterfaceC0258a f14205a;

        /* renamed from: b */
        private ji.l f14206b;

        /* renamed from: c */
        private hi.l f14207c;

        /* renamed from: d */
        private com.google.android.exoplayer2.upstream.g f14208d;

        /* renamed from: e */
        private int f14209e;

        /* renamed from: f */
        private String f14210f;

        /* renamed from: g */
        private Object f14211g;

        public b(a.InterfaceC0258a interfaceC0258a) {
            this(interfaceC0258a, new ji.f());
        }

        public static /* synthetic */ com.google.android.exoplayer2.drm.g a(com.google.android.exoplayer2.drm.g gVar, i0 i0Var) {
            return d(gVar, i0Var);
        }

        public static /* synthetic */ com.google.android.exoplayer2.drm.g d(com.google.android.exoplayer2.drm.g gVar, i0 i0Var) {
            return gVar;
        }

        @Deprecated
        public r b(Uri uri) {
            return c(new i0.c().i(uri).a());
        }

        public r c(i0 i0Var) {
            ak.a.e(i0Var.f13502b);
            i0.g gVar = i0Var.f13502b;
            boolean z11 = true;
            boolean z12 = gVar.f13559h == null && this.f14211g != null;
            if (gVar.f13557f != null || this.f14210f == null) {
                z11 = false;
            }
            if (z12 && z11) {
                i0Var = i0Var.a().h(this.f14211g).b(this.f14210f).a();
            } else if (z12) {
                i0Var = i0Var.a().h(this.f14211g).a();
            } else if (z11) {
                i0Var = i0Var.a().b(this.f14210f).a();
            }
            i0 i0Var2 = i0Var;
            return new r(i0Var2, this.f14205a, this.f14206b, this.f14207c.a(i0Var2), this.f14208d, this.f14209e);
        }

        public b e(final com.google.android.exoplayer2.drm.g gVar) {
            if (gVar == null) {
                f(null);
            } else {
                f(new hi.l() { // from class: fj.q
                    @Override // hi.l
                    public final com.google.android.exoplayer2.drm.g a(i0 i0Var) {
                        return r.b.a(com.google.android.exoplayer2.drm.g.this, i0Var);
                    }
                });
            }
            return this;
        }

        public b f(hi.l lVar) {
            if (lVar != null) {
                this.f14207c = lVar;
            } else {
                this.f14207c = new com.google.android.exoplayer2.drm.d();
            }
            return this;
        }

        public b g(com.google.android.exoplayer2.upstream.g gVar) {
            if (gVar == null) {
                gVar = new com.google.android.exoplayer2.upstream.f();
            }
            this.f14208d = gVar;
            return this;
        }

        public b(a.InterfaceC0258a interfaceC0258a, ji.l lVar) {
            this.f14205a = interfaceC0258a;
            this.f14206b = lVar;
            this.f14207c = new com.google.android.exoplayer2.drm.d();
            this.f14208d = new com.google.android.exoplayer2.upstream.f();
            this.f14209e = PKIFailureInfo.badCertTemplate;
        }
    }

    r(i0 i0Var, a.InterfaceC0258a interfaceC0258a, ji.l lVar, com.google.android.exoplayer2.drm.g gVar, com.google.android.exoplayer2.upstream.g gVar2, int i11) {
        this.f14194h = (i0.g) ak.a.e(i0Var.f13502b);
        this.f14193g = i0Var;
        this.f14195i = interfaceC0258a;
        this.f14196j = lVar;
        this.f14197k = gVar;
        this.f14198l = gVar2;
        this.f14199m = i11;
    }

    private void D() {
        z0 tVar = new fj.t(this.f14201o, this.f14202p, false, this.f14203q, null, this.f14193g);
        if (this.f14200n) {
            tVar = new a(this, tVar);
        }
        B(tVar);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void A(zj.n nVar) {
        this.f14204t = nVar;
        this.f14197k.a();
        D();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void C() {
        this.f14197k.release();
    }

    @Override // com.google.android.exoplayer2.source.j
    public i0 f() {
        return this.f14193g;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void g(i iVar) {
        ((q) iVar).c0();
    }

    @Override // com.google.android.exoplayer2.source.j
    public i k(j.a aVar, zj.b bVar, long j11) {
        com.google.android.exoplayer2.upstream.a a11 = this.f14195i.a();
        zj.n nVar = this.f14204t;
        if (nVar != null) {
            a11.b(nVar);
        }
        return new q(this.f14194h.f13552a, a11, this.f14196j, this.f14197k, t(aVar), this.f14198l, v(aVar), this, bVar, this.f14194h.f13557f, this.f14199m);
    }

    @Override // com.google.android.exoplayer2.source.q.b
    public void m(long j11, boolean z11, boolean z12) {
        if (j11 == -9223372036854775807L) {
            j11 = this.f14201o;
        }
        if (!this.f14200n && this.f14201o == j11 && this.f14202p == z11 && this.f14203q == z12) {
            return;
        }
        this.f14201o = j11;
        this.f14202p = z11;
        this.f14203q = z12;
        this.f14200n = false;
        D();
    }

    @Override // com.google.android.exoplayer2.source.j
    public void p() {
    }
}