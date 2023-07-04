package de;

import android.graphics.Rect;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import md.n;
import md.o;

/* loaded from: classes.dex */
public class g implements h {

    /* renamed from: a  reason: collision with root package name */
    private final be.d f23921a;

    /* renamed from: b  reason: collision with root package name */
    private final td.b f23922b;

    /* renamed from: c  reason: collision with root package name */
    private final i f23923c = new i();

    /* renamed from: d  reason: collision with root package name */
    private final n<Boolean> f23924d;

    /* renamed from: e  reason: collision with root package name */
    private c f23925e;

    /* renamed from: f  reason: collision with root package name */
    private b f23926f;

    /* renamed from: g  reason: collision with root package name */
    private ee.c f23927g;

    /* renamed from: h  reason: collision with root package name */
    private ee.a f23928h;

    /* renamed from: i  reason: collision with root package name */
    private pf.c f23929i;

    /* renamed from: j  reason: collision with root package name */
    private List<f> f23930j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f23931k;

    public g(td.b bVar, be.d dVar, n<Boolean> nVar) {
        this.f23922b = bVar;
        this.f23921a = dVar;
        this.f23924d = nVar;
    }

    private void h() {
        if (this.f23928h == null) {
            this.f23928h = new ee.a(this.f23922b, this.f23923c, this, this.f23924d, o.f38489a);
        }
        if (this.f23927g == null) {
            this.f23927g = new ee.c(this.f23922b, this.f23923c);
        }
        if (this.f23926f == null) {
            this.f23926f = new ee.b(this.f23923c, this);
        }
        c cVar = this.f23925e;
        if (cVar == null) {
            this.f23925e = new c(this.f23921a.w(), this.f23926f);
        } else {
            cVar.l(this.f23921a.w());
        }
        if (this.f23929i == null) {
            this.f23929i = new pf.c(this.f23927g, this.f23925e);
        }
    }

    @Override // de.h
    public void a(i iVar, int i11) {
        List<f> list;
        if (!this.f23931k || (list = this.f23930j) == null || list.isEmpty()) {
            return;
        }
        e B = iVar.B();
        for (f fVar : this.f23930j) {
            fVar.a(B, i11);
        }
    }

    @Override // de.h
    public void b(i iVar, int i11) {
        List<f> list;
        iVar.o(i11);
        if (!this.f23931k || (list = this.f23930j) == null || list.isEmpty()) {
            return;
        }
        if (i11 == 3) {
            d();
        }
        e B = iVar.B();
        for (f fVar : this.f23930j) {
            fVar.b(B, i11);
        }
    }

    public void c(f fVar) {
        if (fVar == null) {
            return;
        }
        if (this.f23930j == null) {
            this.f23930j = new CopyOnWriteArrayList();
        }
        this.f23930j.add(fVar);
    }

    public void d() {
        me.b e11 = this.f23921a.e();
        if (e11 == null || e11.d() == null) {
            return;
        }
        Rect bounds = e11.d().getBounds();
        this.f23923c.v(bounds.width());
        this.f23923c.u(bounds.height());
    }

    public void e() {
        List<f> list = this.f23930j;
        if (list != null) {
            list.clear();
        }
    }

    public void f() {
        e();
        g(false);
        this.f23923c.b();
    }

    public void g(boolean z11) {
        this.f23931k = z11;
        if (z11) {
            h();
            b bVar = this.f23926f;
            if (bVar != null) {
                this.f23921a.i0(bVar);
            }
            ee.a aVar = this.f23928h;
            if (aVar != null) {
                this.f23921a.l(aVar);
            }
            pf.c cVar = this.f23929i;
            if (cVar != null) {
                this.f23921a.j0(cVar);
                return;
            }
            return;
        }
        b bVar2 = this.f23926f;
        if (bVar2 != null) {
            this.f23921a.y0(bVar2);
        }
        ee.a aVar2 = this.f23928h;
        if (aVar2 != null) {
            this.f23921a.S(aVar2);
        }
        pf.c cVar2 = this.f23929i;
        if (cVar2 != null) {
            this.f23921a.z0(cVar2);
        }
    }

    public void i(ge.b<be.e, com.facebook.imagepipeline.request.a, qd.a<nf.c>, nf.h> bVar) {
        this.f23923c.i(bVar.n(), bVar.o(), bVar.m());
    }
}