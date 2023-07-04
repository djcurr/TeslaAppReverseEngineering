package com.google.android.exoplayer2.source;

import ak.k0;
import android.os.Handler;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.z0;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class d<T> extends com.google.android.exoplayer2.source.a {

    /* renamed from: g */
    private final HashMap<T, b> f13811g = new HashMap<>();

    /* renamed from: h */
    private Handler f13812h;

    /* renamed from: i */
    private zj.n f13813i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class a implements k, com.google.android.exoplayer2.drm.f {

        /* renamed from: a */
        private final T f13814a;

        /* renamed from: b */
        private k.a f13815b;

        /* renamed from: c */
        private f.a f13816c;

        public a(T t11) {
            d.this = r3;
            this.f13815b = r3.v(null);
            this.f13816c = r3.t(null);
            this.f13814a = t11;
        }

        private boolean a(int i11, j.a aVar) {
            j.a aVar2;
            if (aVar != null) {
                aVar2 = d.this.E(this.f13814a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int G = d.this.G(this.f13814a, i11);
            k.a aVar3 = this.f13815b;
            if (aVar3.f14122a != G || !k0.c(aVar3.f14123b, aVar2)) {
                this.f13815b = d.this.u(G, aVar2, 0L);
            }
            f.a aVar4 = this.f13816c;
            if (aVar4.f13357a == G && k0.c(aVar4.f13358b, aVar2)) {
                return true;
            }
            this.f13816c = d.this.s(G, aVar2);
            return true;
        }

        private fj.h c(fj.h hVar) {
            long F = d.this.F(this.f13814a, hVar.f26301f);
            long F2 = d.this.F(this.f13814a, hVar.f26302g);
            return (F == hVar.f26301f && F2 == hVar.f26302g) ? hVar : new fj.h(hVar.f26296a, hVar.f26297b, hVar.f26298c, hVar.f26299d, hVar.f26300e, F, F2);
        }

        @Override // com.google.android.exoplayer2.drm.f
        public void F(int i11, j.a aVar, Exception exc) {
            if (a(i11, aVar)) {
                this.f13816c.l(exc);
            }
        }

        @Override // com.google.android.exoplayer2.source.k
        public void M(int i11, j.a aVar, fj.h hVar) {
            if (a(i11, aVar)) {
                this.f13815b.j(c(hVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.k
        public void N(int i11, j.a aVar, fj.h hVar) {
            if (a(i11, aVar)) {
                this.f13815b.E(c(hVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.k
        public void Q(int i11, j.a aVar, fj.g gVar, fj.h hVar) {
            if (a(i11, aVar)) {
                this.f13815b.v(gVar, c(hVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.k
        public void R(int i11, j.a aVar, fj.g gVar, fj.h hVar) {
            if (a(i11, aVar)) {
                this.f13815b.s(gVar, c(hVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.f
        public void S(int i11, j.a aVar) {
            if (a(i11, aVar)) {
                this.f13816c.h();
            }
        }

        @Override // com.google.android.exoplayer2.drm.f
        public void U(int i11, j.a aVar) {
            if (a(i11, aVar)) {
                this.f13816c.m();
            }
        }

        @Override // com.google.android.exoplayer2.drm.f
        public void a0(int i11, j.a aVar) {
            if (a(i11, aVar)) {
                this.f13816c.j();
            }
        }

        @Override // com.google.android.exoplayer2.source.k
        public void b(int i11, j.a aVar, fj.g gVar, fj.h hVar) {
            if (a(i11, aVar)) {
                this.f13815b.B(gVar, c(hVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.k
        public void r(int i11, j.a aVar, fj.g gVar, fj.h hVar, IOException iOException, boolean z11) {
            if (a(i11, aVar)) {
                this.f13815b.y(gVar, c(hVar), iOException, z11);
            }
        }

        @Override // com.google.android.exoplayer2.drm.f
        public void v(int i11, j.a aVar) {
            if (a(i11, aVar)) {
                this.f13816c.i();
            }
        }

        @Override // com.google.android.exoplayer2.drm.f
        public void w(int i11, j.a aVar) {
            if (a(i11, aVar)) {
                this.f13816c.k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public final j f13818a;

        /* renamed from: b */
        public final j.b f13819b;

        /* renamed from: c */
        public final k f13820c;

        public b(j jVar, j.b bVar, k kVar) {
            this.f13818a = jVar;
            this.f13819b = bVar;
            this.f13820c = kVar;
        }
    }

    public static /* synthetic */ void D(d dVar, Object obj, j jVar, z0 z0Var) {
        dVar.H(obj, jVar, z0Var);
    }

    @Override // com.google.android.exoplayer2.source.a
    public void A(zj.n nVar) {
        this.f13813i = nVar;
        this.f13812h = k0.x();
    }

    @Override // com.google.android.exoplayer2.source.a
    public void C() {
        for (b bVar : this.f13811g.values()) {
            bVar.f13818a.b(bVar.f13819b);
            bVar.f13818a.e(bVar.f13820c);
        }
        this.f13811g.clear();
    }

    protected abstract j.a E(T t11, j.a aVar);

    protected long F(T t11, long j11) {
        return j11;
    }

    protected int G(T t11, int i11) {
        return i11;
    }

    /* renamed from: I */
    public abstract void H(T t11, j jVar, z0 z0Var);

    public final void J(final T t11, j jVar) {
        ak.a.a(!this.f13811g.containsKey(t11));
        j.b bVar = new j.b() { // from class: fj.a
            @Override // com.google.android.exoplayer2.source.j.b
            public final void a(com.google.android.exoplayer2.source.j jVar2, z0 z0Var) {
                com.google.android.exoplayer2.source.d.D(com.google.android.exoplayer2.source.d.this, t11, jVar2, z0Var);
            }
        };
        a aVar = new a(t11);
        this.f13811g.put(t11, new b(jVar, bVar, aVar));
        jVar.d((Handler) ak.a.e(this.f13812h), aVar);
        jVar.o((Handler) ak.a.e(this.f13812h), aVar);
        jVar.a(bVar, this.f13813i);
        if (z()) {
            return;
        }
        jVar.l(bVar);
    }

    @Override // com.google.android.exoplayer2.source.j
    public void p() {
        for (b bVar : this.f13811g.values()) {
            bVar.f13818a.p();
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void x() {
        for (b bVar : this.f13811g.values()) {
            bVar.f13818a.l(bVar.f13819b);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void y() {
        for (b bVar : this.f13811g.values()) {
            bVar.f13818a.h(bVar.f13819b);
        }
    }
}