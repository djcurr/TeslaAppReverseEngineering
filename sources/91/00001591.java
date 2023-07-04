package com.bumptech.glide.request;

import com.bumptech.glide.request.e;

/* loaded from: classes.dex */
public final class b implements e, d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f10826a;

    /* renamed from: b  reason: collision with root package name */
    private final e f10827b;

    /* renamed from: c  reason: collision with root package name */
    private volatile d f10828c;

    /* renamed from: d  reason: collision with root package name */
    private volatile d f10829d;

    /* renamed from: e  reason: collision with root package name */
    private e.a f10830e;

    /* renamed from: f  reason: collision with root package name */
    private e.a f10831f;

    public b(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f10830e = aVar;
        this.f10831f = aVar;
        this.f10826a = obj;
        this.f10827b = eVar;
    }

    private boolean k(d dVar) {
        return dVar.equals(this.f10828c) || (this.f10830e == e.a.FAILED && dVar.equals(this.f10829d));
    }

    private boolean l() {
        e eVar = this.f10827b;
        return eVar == null || eVar.j(this);
    }

    private boolean m() {
        e eVar = this.f10827b;
        return eVar == null || eVar.b(this);
    }

    private boolean n() {
        e eVar = this.f10827b;
        return eVar == null || eVar.c(this);
    }

    @Override // com.bumptech.glide.request.e, com.bumptech.glide.request.d
    public boolean a() {
        boolean z11;
        synchronized (this.f10826a) {
            z11 = this.f10828c.a() || this.f10829d.a();
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public boolean b(d dVar) {
        boolean z11;
        synchronized (this.f10826a) {
            z11 = m() && k(dVar);
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public boolean c(d dVar) {
        boolean z11;
        synchronized (this.f10826a) {
            z11 = n() && k(dVar);
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.d
    public void clear() {
        synchronized (this.f10826a) {
            e.a aVar = e.a.CLEARED;
            this.f10830e = aVar;
            this.f10828c.clear();
            if (this.f10831f != aVar) {
                this.f10831f = aVar;
                this.f10829d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public void d() {
        synchronized (this.f10826a) {
            e.a aVar = this.f10830e;
            e.a aVar2 = e.a.RUNNING;
            if (aVar == aVar2) {
                this.f10830e = e.a.PAUSED;
                this.f10828c.d();
            }
            if (this.f10831f == aVar2) {
                this.f10831f = e.a.PAUSED;
                this.f10829d.d();
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public void e(d dVar) {
        synchronized (this.f10826a) {
            if (!dVar.equals(this.f10829d)) {
                this.f10830e = e.a.FAILED;
                e.a aVar = this.f10831f;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f10831f = aVar2;
                    this.f10829d.i();
                }
                return;
            }
            this.f10831f = e.a.FAILED;
            e eVar = this.f10827b;
            if (eVar != null) {
                eVar.e(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public boolean f() {
        boolean z11;
        synchronized (this.f10826a) {
            e.a aVar = this.f10830e;
            e.a aVar2 = e.a.CLEARED;
            z11 = aVar == aVar2 && this.f10831f == aVar2;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public void g(d dVar) {
        synchronized (this.f10826a) {
            if (dVar.equals(this.f10828c)) {
                this.f10830e = e.a.SUCCESS;
            } else if (dVar.equals(this.f10829d)) {
                this.f10831f = e.a.SUCCESS;
            }
            e eVar = this.f10827b;
            if (eVar != null) {
                eVar.g(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public e getRoot() {
        e root;
        synchronized (this.f10826a) {
            e eVar = this.f10827b;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    @Override // com.bumptech.glide.request.d
    public boolean h(d dVar) {
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            return this.f10828c.h(bVar.f10828c) && this.f10829d.h(bVar.f10829d);
        }
        return false;
    }

    @Override // com.bumptech.glide.request.d
    public void i() {
        synchronized (this.f10826a) {
            e.a aVar = this.f10830e;
            e.a aVar2 = e.a.RUNNING;
            if (aVar != aVar2) {
                this.f10830e = aVar2;
                this.f10828c.i();
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public boolean isComplete() {
        boolean z11;
        synchronized (this.f10826a) {
            e.a aVar = this.f10830e;
            e.a aVar2 = e.a.SUCCESS;
            z11 = aVar == aVar2 || this.f10831f == aVar2;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isRunning() {
        boolean z11;
        synchronized (this.f10826a) {
            e.a aVar = this.f10830e;
            e.a aVar2 = e.a.RUNNING;
            z11 = aVar == aVar2 || this.f10831f == aVar2;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public boolean j(d dVar) {
        boolean z11;
        synchronized (this.f10826a) {
            z11 = l() && k(dVar);
        }
        return z11;
    }

    public void o(d dVar, d dVar2) {
        this.f10828c = dVar;
        this.f10829d = dVar2;
    }
}