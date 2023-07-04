package com.bumptech.glide.load.engine;

import cb.a;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class k<R> implements h.b<R>, a.f {
    private static final c E = new c();
    private h<R> A;
    private volatile boolean B;
    private boolean C;

    /* renamed from: a  reason: collision with root package name */
    final e f10649a;

    /* renamed from: b  reason: collision with root package name */
    private final cb.c f10650b;

    /* renamed from: c  reason: collision with root package name */
    private final o.a f10651c;

    /* renamed from: d  reason: collision with root package name */
    private final v3.f<k<?>> f10652d;

    /* renamed from: e  reason: collision with root package name */
    private final c f10653e;

    /* renamed from: f  reason: collision with root package name */
    private final l f10654f;

    /* renamed from: g  reason: collision with root package name */
    private final ma.a f10655g;

    /* renamed from: h  reason: collision with root package name */
    private final ma.a f10656h;

    /* renamed from: i  reason: collision with root package name */
    private final ma.a f10657i;

    /* renamed from: j  reason: collision with root package name */
    private final ma.a f10658j;

    /* renamed from: k  reason: collision with root package name */
    private final AtomicInteger f10659k;

    /* renamed from: l  reason: collision with root package name */
    private ha.b f10660l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10661m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10662n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10663o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10664p;

    /* renamed from: q  reason: collision with root package name */
    private ja.c<?> f10665q;

    /* renamed from: t  reason: collision with root package name */
    com.bumptech.glide.load.a f10666t;

    /* renamed from: w  reason: collision with root package name */
    private boolean f10667w;

    /* renamed from: x  reason: collision with root package name */
    GlideException f10668x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10669y;

    /* renamed from: z  reason: collision with root package name */
    o<?> f10670z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final com.bumptech.glide.request.i f10671a;

        a(com.bumptech.glide.request.i iVar) {
            this.f10671a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f10671a.g()) {
                synchronized (k.this) {
                    if (k.this.f10649a.c(this.f10671a)) {
                        k.this.f(this.f10671a);
                    }
                    k.this.i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final com.bumptech.glide.request.i f10673a;

        b(com.bumptech.glide.request.i iVar) {
            this.f10673a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f10673a.g()) {
                synchronized (k.this) {
                    if (k.this.f10649a.c(this.f10673a)) {
                        k.this.f10670z.c();
                        k.this.g(this.f10673a);
                        k.this.r(this.f10673a);
                    }
                    k.this.i();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        public <R> o<R> a(ja.c<R> cVar, boolean z11, ha.b bVar, o.a aVar) {
            return new o<>(cVar, z11, true, bVar, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        final com.bumptech.glide.request.i f10675a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f10676b;

        d(com.bumptech.glide.request.i iVar, Executor executor) {
            this.f10675a = iVar;
            this.f10676b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f10675a.equals(((d) obj).f10675a);
            }
            return false;
        }

        public int hashCode() {
            return this.f10675a.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f10677a;

        e() {
            this(new ArrayList(2));
        }

        private static d e(com.bumptech.glide.request.i iVar) {
            return new d(iVar, bb.e.a());
        }

        void b(com.bumptech.glide.request.i iVar, Executor executor) {
            this.f10677a.add(new d(iVar, executor));
        }

        boolean c(com.bumptech.glide.request.i iVar) {
            return this.f10677a.contains(e(iVar));
        }

        void clear() {
            this.f10677a.clear();
        }

        e d() {
            return new e(new ArrayList(this.f10677a));
        }

        void f(com.bumptech.glide.request.i iVar) {
            this.f10677a.remove(e(iVar));
        }

        boolean isEmpty() {
            return this.f10677a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f10677a.iterator();
        }

        int size() {
            return this.f10677a.size();
        }

        e(List<d> list) {
            this.f10677a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(ma.a aVar, ma.a aVar2, ma.a aVar3, ma.a aVar4, l lVar, o.a aVar5, v3.f<k<?>> fVar) {
        this(aVar, aVar2, aVar3, aVar4, lVar, aVar5, fVar, E);
    }

    private ma.a j() {
        if (this.f10662n) {
            return this.f10657i;
        }
        return this.f10663o ? this.f10658j : this.f10656h;
    }

    private boolean m() {
        return this.f10669y || this.f10667w || this.B;
    }

    private synchronized void q() {
        if (this.f10660l != null) {
            this.f10649a.clear();
            this.f10660l = null;
            this.f10670z = null;
            this.f10665q = null;
            this.f10669y = false;
            this.B = false;
            this.f10667w = false;
            this.C = false;
            this.A.z(false);
            this.A = null;
            this.f10668x = null;
            this.f10666t = null;
            this.f10652d.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(com.bumptech.glide.request.i iVar, Executor executor) {
        this.f10650b.c();
        this.f10649a.b(iVar, executor);
        boolean z11 = true;
        if (this.f10667w) {
            k(1);
            executor.execute(new b(iVar));
        } else if (this.f10669y) {
            k(1);
            executor.execute(new a(iVar));
        } else {
            if (this.B) {
                z11 = false;
            }
            bb.j.a(z11, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void b(GlideException glideException) {
        synchronized (this) {
            this.f10668x = glideException;
        }
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.h.b
    public void c(ja.c<R> cVar, com.bumptech.glide.load.a aVar, boolean z11) {
        synchronized (this) {
            this.f10665q = cVar;
            this.f10666t = aVar;
            this.C = z11;
        }
        o();
    }

    @Override // cb.a.f
    public cb.c d() {
        return this.f10650b;
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void e(h<?> hVar) {
        j().execute(hVar);
    }

    void f(com.bumptech.glide.request.i iVar) {
        try {
            iVar.b(this.f10668x);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    void g(com.bumptech.glide.request.i iVar) {
        try {
            iVar.c(this.f10670z, this.f10666t, this.C);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    void h() {
        if (m()) {
            return;
        }
        this.B = true;
        this.A.c();
        this.f10654f.a(this, this.f10660l);
    }

    void i() {
        o<?> oVar;
        synchronized (this) {
            this.f10650b.c();
            bb.j.a(m(), "Not yet complete!");
            int decrementAndGet = this.f10659k.decrementAndGet();
            bb.j.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                oVar = this.f10670z;
                q();
            } else {
                oVar = null;
            }
        }
        if (oVar != null) {
            oVar.f();
        }
    }

    synchronized void k(int i11) {
        o<?> oVar;
        bb.j.a(m(), "Not yet complete!");
        if (this.f10659k.getAndAdd(i11) == 0 && (oVar = this.f10670z) != null) {
            oVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized k<R> l(ha.b bVar, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f10660l = bVar;
        this.f10661m = z11;
        this.f10662n = z12;
        this.f10663o = z13;
        this.f10664p = z14;
        return this;
    }

    void n() {
        synchronized (this) {
            this.f10650b.c();
            if (this.B) {
                q();
            } else if (!this.f10649a.isEmpty()) {
                if (!this.f10669y) {
                    this.f10669y = true;
                    ha.b bVar = this.f10660l;
                    e d11 = this.f10649a.d();
                    k(d11.size() + 1);
                    this.f10654f.b(this, bVar, null);
                    Iterator<d> it2 = d11.iterator();
                    while (it2.hasNext()) {
                        d next = it2.next();
                        next.f10676b.execute(new a(next.f10675a));
                    }
                    i();
                    return;
                }
                throw new IllegalStateException("Already failed once");
            } else {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
        }
    }

    void o() {
        synchronized (this) {
            this.f10650b.c();
            if (this.B) {
                this.f10665q.recycle();
                q();
            } else if (!this.f10649a.isEmpty()) {
                if (!this.f10667w) {
                    this.f10670z = this.f10653e.a(this.f10665q, this.f10661m, this.f10660l, this.f10651c);
                    this.f10667w = true;
                    e d11 = this.f10649a.d();
                    k(d11.size() + 1);
                    this.f10654f.b(this, this.f10660l, this.f10670z);
                    Iterator<d> it2 = d11.iterator();
                    while (it2.hasNext()) {
                        d next = it2.next();
                        next.f10676b.execute(new b(next.f10675a));
                    }
                    i();
                    return;
                }
                throw new IllegalStateException("Already have resource");
            } else {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f10664p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void r(com.bumptech.glide.request.i iVar) {
        boolean z11;
        this.f10650b.c();
        this.f10649a.f(iVar);
        if (this.f10649a.isEmpty()) {
            h();
            if (!this.f10667w && !this.f10669y) {
                z11 = false;
                if (z11 && this.f10659k.get() == 0) {
                    q();
                }
            }
            z11 = true;
            if (z11) {
                q();
            }
        }
    }

    public synchronized void s(h<R> hVar) {
        this.A = hVar;
        (hVar.G() ? this.f10655g : j()).execute(hVar);
    }

    k(ma.a aVar, ma.a aVar2, ma.a aVar3, ma.a aVar4, l lVar, o.a aVar5, v3.f<k<?>> fVar, c cVar) {
        this.f10649a = new e();
        this.f10650b = cb.c.a();
        this.f10659k = new AtomicInteger();
        this.f10655g = aVar;
        this.f10656h = aVar2;
        this.f10657i = aVar3;
        this.f10658j = aVar4;
        this.f10654f = lVar;
        this.f10651c = aVar5;
        this.f10652d = fVar;
        this.f10653e = cVar;
    }
}