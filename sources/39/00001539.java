package com.bumptech.glide.load.engine;

import android.util.Log;
import cb.a;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import java.util.Map;
import java.util.concurrent.Executor;
import la.a;
import la.h;

/* loaded from: classes.dex */
public class j implements l, h.a, o.a {

    /* renamed from: i  reason: collision with root package name */
    private static final boolean f10623i = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    private final p f10624a;

    /* renamed from: b  reason: collision with root package name */
    private final n f10625b;

    /* renamed from: c  reason: collision with root package name */
    private final la.h f10626c;

    /* renamed from: d  reason: collision with root package name */
    private final b f10627d;

    /* renamed from: e  reason: collision with root package name */
    private final u f10628e;

    /* renamed from: f  reason: collision with root package name */
    private final c f10629f;

    /* renamed from: g  reason: collision with root package name */
    private final a f10630g;

    /* renamed from: h  reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a f10631h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final h.e f10632a;

        /* renamed from: b  reason: collision with root package name */
        final v3.f<h<?>> f10633b = cb.a.d(150, new C0204a());

        /* renamed from: c  reason: collision with root package name */
        private int f10634c;

        /* renamed from: com.bumptech.glide.load.engine.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0204a implements a.d<h<?>> {
            C0204a() {
            }

            @Override // cb.a.d
            /* renamed from: a */
            public h<?> create() {
                a aVar = a.this;
                return new h<>(aVar.f10632a, aVar.f10633b);
            }
        }

        a(h.e eVar) {
            this.f10632a = eVar;
        }

        <R> h<R> a(com.bumptech.glide.e eVar, Object obj, m mVar, ha.b bVar, int i11, int i12, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, ja.a aVar, Map<Class<?>, ha.h<?>> map, boolean z11, boolean z12, boolean z13, ha.e eVar2, h.b<R> bVar2) {
            h hVar2 = (h) bb.j.d(this.f10633b.b());
            int i13 = this.f10634c;
            this.f10634c = i13 + 1;
            return hVar2.q(eVar, obj, mVar, bVar, i11, i12, cls, cls2, hVar, aVar, map, z11, z12, z13, eVar2, bVar2, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final ma.a f10636a;

        /* renamed from: b  reason: collision with root package name */
        final ma.a f10637b;

        /* renamed from: c  reason: collision with root package name */
        final ma.a f10638c;

        /* renamed from: d  reason: collision with root package name */
        final ma.a f10639d;

        /* renamed from: e  reason: collision with root package name */
        final l f10640e;

        /* renamed from: f  reason: collision with root package name */
        final o.a f10641f;

        /* renamed from: g  reason: collision with root package name */
        final v3.f<k<?>> f10642g = cb.a.d(150, new a());

        /* loaded from: classes.dex */
        class a implements a.d<k<?>> {
            a() {
            }

            @Override // cb.a.d
            /* renamed from: a */
            public k<?> create() {
                b bVar = b.this;
                return new k<>(bVar.f10636a, bVar.f10637b, bVar.f10638c, bVar.f10639d, bVar.f10640e, bVar.f10641f, bVar.f10642g);
            }
        }

        b(ma.a aVar, ma.a aVar2, ma.a aVar3, ma.a aVar4, l lVar, o.a aVar5) {
            this.f10636a = aVar;
            this.f10637b = aVar2;
            this.f10638c = aVar3;
            this.f10639d = aVar4;
            this.f10640e = lVar;
            this.f10641f = aVar5;
        }

        <R> k<R> a(ha.b bVar, boolean z11, boolean z12, boolean z13, boolean z14) {
            return ((k) bb.j.d(this.f10642g.b())).l(bVar, z11, z12, z13, z14);
        }

        void b() {
            bb.e.c(this.f10636a);
            bb.e.c(this.f10637b);
            bb.e.c(this.f10638c);
            bb.e.c(this.f10639d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c implements h.e {

        /* renamed from: a  reason: collision with root package name */
        private final a.InterfaceC0700a f10644a;

        /* renamed from: b  reason: collision with root package name */
        private volatile la.a f10645b;

        c(a.InterfaceC0700a interfaceC0700a) {
            this.f10644a = interfaceC0700a;
        }

        @Override // com.bumptech.glide.load.engine.h.e
        public la.a a() {
            if (this.f10645b == null) {
                synchronized (this) {
                    if (this.f10645b == null) {
                        this.f10645b = this.f10644a.build();
                    }
                    if (this.f10645b == null) {
                        this.f10645b = new la.b();
                    }
                }
            }
            return this.f10645b;
        }

        synchronized void b() {
            if (this.f10645b == null) {
                return;
            }
            this.f10645b.clear();
        }
    }

    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        private final k<?> f10646a;

        /* renamed from: b  reason: collision with root package name */
        private final com.bumptech.glide.request.i f10647b;

        d(com.bumptech.glide.request.i iVar, k<?> kVar) {
            this.f10647b = iVar;
            this.f10646a = kVar;
        }

        public void a() {
            synchronized (j.this) {
                this.f10646a.r(this.f10647b);
            }
        }
    }

    public j(la.h hVar, a.InterfaceC0700a interfaceC0700a, ma.a aVar, ma.a aVar2, ma.a aVar3, ma.a aVar4, boolean z11) {
        this(hVar, interfaceC0700a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z11);
    }

    private o<?> f(ha.b bVar) {
        ja.c<?> b11 = this.f10626c.b(bVar);
        if (b11 == null) {
            return null;
        }
        if (b11 instanceof o) {
            return (o) b11;
        }
        return new o<>(b11, true, true, bVar, this);
    }

    private o<?> h(ha.b bVar) {
        o<?> e11 = this.f10631h.e(bVar);
        if (e11 != null) {
            e11.c();
        }
        return e11;
    }

    private o<?> i(ha.b bVar) {
        o<?> f11 = f(bVar);
        if (f11 != null) {
            f11.c();
            this.f10631h.a(bVar, f11);
        }
        return f11;
    }

    private o<?> j(m mVar, boolean z11, long j11) {
        if (z11) {
            o<?> h11 = h(mVar);
            if (h11 != null) {
                if (f10623i) {
                    k("Loaded resource from active resources", j11, mVar);
                }
                return h11;
            }
            o<?> i11 = i(mVar);
            if (i11 != null) {
                if (f10623i) {
                    k("Loaded resource from cache", j11, mVar);
                }
                return i11;
            }
            return null;
        }
        return null;
    }

    private static void k(String str, long j11, ha.b bVar) {
        Log.v("Engine", str + " in " + bb.f.a(j11) + "ms, key: " + bVar);
    }

    private <R> d n(com.bumptech.glide.e eVar, Object obj, ha.b bVar, int i11, int i12, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, ja.a aVar, Map<Class<?>, ha.h<?>> map, boolean z11, boolean z12, ha.e eVar2, boolean z13, boolean z14, boolean z15, boolean z16, com.bumptech.glide.request.i iVar, Executor executor, m mVar, long j11) {
        k<?> a11 = this.f10624a.a(mVar, z16);
        if (a11 != null) {
            a11.a(iVar, executor);
            if (f10623i) {
                k("Added to existing load", j11, mVar);
            }
            return new d(iVar, a11);
        }
        k<R> a12 = this.f10627d.a(mVar, z13, z14, z15, z16);
        h<R> a13 = this.f10630g.a(eVar, obj, mVar, bVar, i11, i12, cls, cls2, hVar, aVar, map, z11, z12, z16, eVar2, a12);
        this.f10624a.c(mVar, a12);
        a12.a(iVar, executor);
        a12.s(a13);
        if (f10623i) {
            k("Started new load", j11, mVar);
        }
        return new d(iVar, a12);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void a(k<?> kVar, ha.b bVar) {
        this.f10624a.d(bVar, kVar);
    }

    @Override // com.bumptech.glide.load.engine.l
    public synchronized void b(k<?> kVar, ha.b bVar, o<?> oVar) {
        if (oVar != null) {
            if (oVar.e()) {
                this.f10631h.a(bVar, oVar);
            }
        }
        this.f10624a.d(bVar, kVar);
    }

    @Override // la.h.a
    public void c(ja.c<?> cVar) {
        this.f10628e.a(cVar, true);
    }

    @Override // com.bumptech.glide.load.engine.o.a
    public void d(ha.b bVar, o<?> oVar) {
        this.f10631h.d(bVar);
        if (oVar.e()) {
            this.f10626c.e(bVar, oVar);
        } else {
            this.f10628e.a(oVar, false);
        }
    }

    public void e() {
        this.f10629f.a().clear();
    }

    public <R> d g(com.bumptech.glide.e eVar, Object obj, ha.b bVar, int i11, int i12, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, ja.a aVar, Map<Class<?>, ha.h<?>> map, boolean z11, boolean z12, ha.e eVar2, boolean z13, boolean z14, boolean z15, boolean z16, com.bumptech.glide.request.i iVar, Executor executor) {
        long b11 = f10623i ? bb.f.b() : 0L;
        m a11 = this.f10625b.a(obj, bVar, i11, i12, map, cls, cls2, eVar2);
        synchronized (this) {
            o<?> j11 = j(a11, z13, b11);
            if (j11 == null) {
                return n(eVar, obj, bVar, i11, i12, cls, cls2, hVar, aVar, map, z11, z12, eVar2, z13, z14, z15, z16, iVar, executor, a11, b11);
            }
            iVar.c(j11, com.bumptech.glide.load.a.MEMORY_CACHE, false);
            return null;
        }
    }

    public void l(ja.c<?> cVar) {
        if (cVar instanceof o) {
            ((o) cVar).f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public void m() {
        this.f10627d.b();
        this.f10629f.b();
        this.f10631h.g();
    }

    j(la.h hVar, a.InterfaceC0700a interfaceC0700a, ma.a aVar, ma.a aVar2, ma.a aVar3, ma.a aVar4, p pVar, n nVar, com.bumptech.glide.load.engine.a aVar5, b bVar, a aVar6, u uVar, boolean z11) {
        this.f10626c = hVar;
        c cVar = new c(interfaceC0700a);
        this.f10629f = cVar;
        com.bumptech.glide.load.engine.a aVar7 = aVar5 == null ? new com.bumptech.glide.load.engine.a(z11) : aVar5;
        this.f10631h = aVar7;
        aVar7.f(this);
        this.f10625b = nVar == null ? new n() : nVar;
        this.f10624a = pVar == null ? new p() : pVar;
        this.f10627d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f10630g = aVar6 == null ? new a(cVar) : aVar6;
        this.f10628e = uVar == null ? new u() : uVar;
        hVar.c(this);
    }
}