package be;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import hf.s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import je.p;
import je.q;
import md.j;
import md.k;
import md.n;
import nf.h;

/* loaded from: classes.dex */
public class d extends ge.a<qd.a<nf.c>, h> {
    private static final Class<?> M = d.class;
    private final s<gd.d, nf.c> A;
    private gd.d B;
    private n<com.facebook.datasource.c<qd.a<nf.c>>> C;
    private boolean D;
    private md.f<mf.a> E;
    private de.g F;
    private Set<pf.e> G;
    private de.b H;
    private ce.b I;
    private com.facebook.imagepipeline.request.a J;
    private com.facebook.imagepipeline.request.a[] K;
    private com.facebook.imagepipeline.request.a L;

    /* renamed from: y  reason: collision with root package name */
    private final mf.a f7629y;

    /* renamed from: z  reason: collision with root package name */
    private final md.f<mf.a> f7630z;

    public d(Resources resources, fe.a aVar, mf.a aVar2, Executor executor, s<gd.d, nf.c> sVar, md.f<mf.a> fVar) {
        super(aVar, executor, null, null);
        this.f7629y = new a(resources, aVar2);
        this.f7630z = fVar;
        this.A = sVar;
    }

    private void q0(n<com.facebook.datasource.c<qd.a<nf.c>>> nVar) {
        this.C = nVar;
        u0(null);
    }

    private Drawable t0(md.f<mf.a> fVar, nf.c cVar) {
        Drawable b11;
        if (fVar == null) {
            return null;
        }
        Iterator<mf.a> it2 = fVar.iterator();
        while (it2.hasNext()) {
            mf.a next = it2.next();
            if (next.a(cVar) && (b11 = next.b(cVar)) != null) {
                return b11;
            }
        }
        return null;
    }

    private void u0(nf.c cVar) {
        if (this.D) {
            if (s() == null) {
                he.a aVar = new he.a();
                ie.a aVar2 = new ie.a(aVar);
                this.I = new ce.b();
                k(aVar2);
                a0(aVar);
            }
            if (this.H == null) {
                i0(this.I);
            }
            if (s() instanceof he.a) {
                C0(cVar, (he.a) s());
            }
        }
    }

    @Override // ge.a
    protected Uri A() {
        return xe.f.a(this.J, this.L, this.K, com.facebook.imagepipeline.request.a.f11628w);
    }

    public void A0(md.f<mf.a> fVar) {
        this.E = fVar;
    }

    public void B0(boolean z11) {
        this.D = z11;
    }

    protected void C0(nf.c cVar, he.a aVar) {
        p a11;
        aVar.i(w());
        me.b e11 = e();
        q.c cVar2 = null;
        if (e11 != null && (a11 = q.a(e11.d())) != null) {
            cVar2 = a11.A();
        }
        aVar.m(cVar2);
        int b11 = this.I.b();
        aVar.l(de.d.b(b11), ce.a.a(b11));
        if (cVar != null) {
            aVar.j(cVar.getWidth(), cVar.getHeight());
            aVar.k(cVar.g());
            return;
        }
        aVar.h();
    }

    @Override // ge.a
    protected void O(Drawable drawable) {
        if (drawable instanceof ae.a) {
            ((ae.a) drawable).a();
        }
    }

    @Override // ge.a, me.a
    public void f(me.b bVar) {
        super.f(bVar);
        u0(null);
    }

    public synchronized void i0(de.b bVar) {
        de.b bVar2 = this.H;
        if (bVar2 instanceof de.a) {
            ((de.a) bVar2).b(bVar);
        } else if (bVar2 != null) {
            this.H = new de.a(bVar2, bVar);
        } else {
            this.H = bVar;
        }
    }

    public synchronized void j0(pf.e eVar) {
        if (this.G == null) {
            this.G = new HashSet();
        }
        this.G.add(eVar);
    }

    protected void k0() {
        synchronized (this) {
            this.H = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ge.a
    /* renamed from: l0 */
    public Drawable m(qd.a<nf.c> aVar) {
        try {
            if (tf.b.d()) {
                tf.b.a("PipelineDraweeController#createDrawable");
            }
            k.i(qd.a.n0(aVar));
            nf.c J = aVar.J();
            u0(J);
            Drawable t02 = t0(this.E, J);
            if (t02 != null) {
                return t02;
            }
            Drawable t03 = t0(this.f7630z, J);
            if (t03 != null) {
                if (tf.b.d()) {
                    tf.b.b();
                }
                return t03;
            }
            Drawable b11 = this.f7629y.b(J);
            if (b11 != null) {
                if (tf.b.d()) {
                    tf.b.b();
                }
                return b11;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + J);
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ge.a
    /* renamed from: m0 */
    public qd.a<nf.c> o() {
        gd.d dVar;
        if (tf.b.d()) {
            tf.b.a("PipelineDraweeController#getCachedImage");
        }
        try {
            s<gd.d, nf.c> sVar = this.A;
            if (sVar != null && (dVar = this.B) != null) {
                qd.a<nf.c> aVar = sVar.get(dVar);
                if (aVar != null && !aVar.J().a().a()) {
                    aVar.close();
                    return null;
                }
                if (tf.b.d()) {
                    tf.b.b();
                }
                return aVar;
            }
            if (tf.b.d()) {
                tf.b.b();
            }
            return null;
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ge.a
    /* renamed from: n0 */
    public int y(qd.a<nf.c> aVar) {
        if (aVar != null) {
            return aVar.L();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ge.a
    /* renamed from: o0 */
    public h z(qd.a<nf.c> aVar) {
        k.i(qd.a.n0(aVar));
        return aVar.J();
    }

    public synchronized pf.e p0() {
        de.c cVar = this.H != null ? new de.c(w(), this.H) : null;
        Set<pf.e> set = this.G;
        if (set != null) {
            pf.c cVar2 = new pf.c(set);
            if (cVar != null) {
                cVar2.l(cVar);
            }
            return cVar2;
        }
        return cVar;
    }

    public void r0(n<com.facebook.datasource.c<qd.a<nf.c>>> nVar, String str, gd.d dVar, Object obj, md.f<mf.a> fVar, de.b bVar) {
        if (tf.b.d()) {
            tf.b.a("PipelineDraweeController#initialize");
        }
        super.D(str, obj);
        q0(nVar);
        this.B = dVar;
        A0(fVar);
        k0();
        u0(null);
        i0(bVar);
        if (tf.b.d()) {
            tf.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void s0(de.f fVar, ge.b<e, com.facebook.imagepipeline.request.a, qd.a<nf.c>, h> bVar, n<Boolean> nVar) {
        de.g gVar = this.F;
        if (gVar != null) {
            gVar.f();
        }
        if (fVar != null) {
            if (this.F == null) {
                this.F = new de.g(AwakeTimeSinceBootClock.get(), this, nVar);
            }
            this.F.c(fVar);
            this.F.g(true);
            this.F.i(bVar);
        }
        this.J = bVar.n();
        this.K = bVar.m();
        this.L = bVar.o();
    }

    @Override // ge.a
    protected com.facebook.datasource.c<qd.a<nf.c>> t() {
        if (tf.b.d()) {
            tf.b.a("PipelineDraweeController#getDataSource");
        }
        if (nd.a.u(2)) {
            nd.a.w(M, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        com.facebook.datasource.c<qd.a<nf.c>> cVar = this.C.get();
        if (tf.b.d()) {
            tf.b.b();
        }
        return cVar;
    }

    @Override // ge.a
    public String toString() {
        return j.c(this).b("super", super.toString()).b("dataSourceSupplier", this.C).toString();
    }

    @Override // ge.a
    /* renamed from: v0 */
    public Map<String, Object> J(h hVar) {
        if (hVar == null) {
            return null;
        }
        return hVar.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ge.a
    /* renamed from: w0 */
    public void L(String str, qd.a<nf.c> aVar) {
        super.L(str, aVar);
        synchronized (this) {
            de.b bVar = this.H;
            if (bVar != null) {
                bVar.a(str, 6, true, "PipelineDraweeController");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ge.a
    /* renamed from: x0 */
    public void Q(qd.a<nf.c> aVar) {
        qd.a.C(aVar);
    }

    public synchronized void y0(de.b bVar) {
        de.b bVar2 = this.H;
        if (bVar2 instanceof de.a) {
            ((de.a) bVar2).c(bVar);
            return;
        }
        if (bVar2 == bVar) {
            this.H = null;
        }
    }

    public synchronized void z0(pf.e eVar) {
        Set<pf.e> set = this.G;
        if (set == null) {
            return;
        }
        set.remove(eVar);
    }
}