package com.bumptech.glide.request;

import com.bumptech.glide.request.e;

/* loaded from: classes.dex */
public class k implements e, d {

    /* renamed from: a  reason: collision with root package name */
    private final e f10869a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f10870b;

    /* renamed from: c  reason: collision with root package name */
    private volatile d f10871c;

    /* renamed from: d  reason: collision with root package name */
    private volatile d f10872d;

    /* renamed from: e  reason: collision with root package name */
    private e.a f10873e;

    /* renamed from: f  reason: collision with root package name */
    private e.a f10874f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10875g;

    public k(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f10873e = aVar;
        this.f10874f = aVar;
        this.f10870b = obj;
        this.f10869a = eVar;
    }

    private boolean k() {
        e eVar = this.f10869a;
        return eVar == null || eVar.j(this);
    }

    private boolean l() {
        e eVar = this.f10869a;
        return eVar == null || eVar.b(this);
    }

    private boolean m() {
        e eVar = this.f10869a;
        return eVar == null || eVar.c(this);
    }

    @Override // com.bumptech.glide.request.e, com.bumptech.glide.request.d
    public boolean a() {
        boolean z11;
        synchronized (this.f10870b) {
            z11 = this.f10872d.a() || this.f10871c.a();
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public boolean b(d dVar) {
        boolean z11;
        synchronized (this.f10870b) {
            z11 = l() && dVar.equals(this.f10871c) && !a();
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public boolean c(d dVar) {
        boolean z11;
        synchronized (this.f10870b) {
            z11 = m() && (dVar.equals(this.f10871c) || this.f10873e != e.a.SUCCESS);
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.d
    public void clear() {
        synchronized (this.f10870b) {
            this.f10875g = false;
            e.a aVar = e.a.CLEARED;
            this.f10873e = aVar;
            this.f10874f = aVar;
            this.f10872d.clear();
            this.f10871c.clear();
        }
    }

    @Override // com.bumptech.glide.request.d
    public void d() {
        synchronized (this.f10870b) {
            if (!this.f10874f.isComplete()) {
                this.f10874f = e.a.PAUSED;
                this.f10872d.d();
            }
            if (!this.f10873e.isComplete()) {
                this.f10873e = e.a.PAUSED;
                this.f10871c.d();
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public void e(d dVar) {
        synchronized (this.f10870b) {
            if (!dVar.equals(this.f10871c)) {
                this.f10874f = e.a.FAILED;
                return;
            }
            this.f10873e = e.a.FAILED;
            e eVar = this.f10869a;
            if (eVar != null) {
                eVar.e(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.d
    public boolean f() {
        boolean z11;
        synchronized (this.f10870b) {
            z11 = this.f10873e == e.a.CLEARED;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public void g(d dVar) {
        synchronized (this.f10870b) {
            if (dVar.equals(this.f10872d)) {
                this.f10874f = e.a.SUCCESS;
                return;
            }
            this.f10873e = e.a.SUCCESS;
            e eVar = this.f10869a;
            if (eVar != null) {
                eVar.g(this);
            }
            if (!this.f10874f.isComplete()) {
                this.f10872d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public e getRoot() {
        e root;
        synchronized (this.f10870b) {
            e eVar = this.f10869a;
            root = eVar != null ? eVar.getRoot() : this;
        }
        return root;
    }

    @Override // com.bumptech.glide.request.d
    public boolean h(d dVar) {
        if (dVar instanceof k) {
            k kVar = (k) dVar;
            if (this.f10871c == null) {
                if (kVar.f10871c != null) {
                    return false;
                }
            } else if (!this.f10871c.h(kVar.f10871c)) {
                return false;
            }
            if (this.f10872d == null) {
                if (kVar.f10872d != null) {
                    return false;
                }
            } else if (!this.f10872d.h(kVar.f10872d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.request.d
    public void i() {
        synchronized (this.f10870b) {
            this.f10875g = true;
            if (this.f10873e != e.a.SUCCESS) {
                e.a aVar = this.f10874f;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f10874f = aVar2;
                    this.f10872d.i();
                }
            }
            if (this.f10875g) {
                e.a aVar3 = this.f10873e;
                e.a aVar4 = e.a.RUNNING;
                if (aVar3 != aVar4) {
                    this.f10873e = aVar4;
                    this.f10871c.i();
                }
            }
            this.f10875g = false;
        }
    }

    @Override // com.bumptech.glide.request.d
    public boolean isComplete() {
        boolean z11;
        synchronized (this.f10870b) {
            z11 = this.f10873e == e.a.SUCCESS;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.d
    public boolean isRunning() {
        boolean z11;
        synchronized (this.f10870b) {
            z11 = this.f10873e == e.a.RUNNING;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public boolean j(d dVar) {
        boolean z11;
        synchronized (this.f10870b) {
            z11 = k() && dVar.equals(this.f10871c) && this.f10873e != e.a.PAUSED;
        }
        return z11;
    }

    public void n(d dVar, d dVar2) {
        this.f10871c = dVar;
        this.f10872d = dVar2;
    }
}