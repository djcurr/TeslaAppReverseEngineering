package zy;

import hy.k;
import iy.b;
import yy.g;
import yy.i;

/* loaded from: classes5.dex */
public final class a<T> implements k<T>, b {

    /* renamed from: a  reason: collision with root package name */
    final k<? super T> f61266a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f61267b;

    /* renamed from: c  reason: collision with root package name */
    b f61268c;

    /* renamed from: d  reason: collision with root package name */
    boolean f61269d;

    /* renamed from: e  reason: collision with root package name */
    yy.a<Object> f61270e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f61271f;

    public a(k<? super T> kVar) {
        this(kVar, false);
    }

    @Override // hy.k
    public void a(b bVar) {
        if (ly.a.validate(this.f61268c, bVar)) {
            this.f61268c = bVar;
            this.f61266a.a(this);
        }
    }

    @Override // hy.k
    public void b(T t11) {
        if (this.f61271f) {
            return;
        }
        if (t11 == null) {
            this.f61268c.dispose();
            onError(g.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            if (this.f61271f) {
                return;
            }
            if (this.f61269d) {
                yy.a<Object> aVar = this.f61270e;
                if (aVar == null) {
                    aVar = new yy.a<>(4);
                    this.f61270e = aVar;
                }
                aVar.c(i.next(t11));
                return;
            }
            this.f61269d = true;
            this.f61266a.b(t11);
            c();
        }
    }

    void c() {
        yy.a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f61270e;
                if (aVar == null) {
                    this.f61269d = false;
                    return;
                }
                this.f61270e = null;
            }
        } while (!aVar.b((k<? super T>) this.f61266a));
    }

    @Override // iy.b
    public void dispose() {
        this.f61271f = true;
        this.f61268c.dispose();
    }

    @Override // iy.b
    public boolean isDisposed() {
        return this.f61268c.isDisposed();
    }

    @Override // hy.k
    public void onComplete() {
        if (this.f61271f) {
            return;
        }
        synchronized (this) {
            if (this.f61271f) {
                return;
            }
            if (this.f61269d) {
                yy.a<Object> aVar = this.f61270e;
                if (aVar == null) {
                    aVar = new yy.a<>(4);
                    this.f61270e = aVar;
                }
                aVar.c(i.complete());
                return;
            }
            this.f61271f = true;
            this.f61269d = true;
            this.f61266a.onComplete();
        }
    }

    @Override // hy.k
    public void onError(Throwable th2) {
        if (this.f61271f) {
            az.a.r(th2);
            return;
        }
        synchronized (this) {
            boolean z11 = true;
            if (!this.f61271f) {
                if (this.f61269d) {
                    this.f61271f = true;
                    yy.a<Object> aVar = this.f61270e;
                    if (aVar == null) {
                        aVar = new yy.a<>(4);
                        this.f61270e = aVar;
                    }
                    Object error = i.error(th2);
                    if (this.f61267b) {
                        aVar.c(error);
                    } else {
                        aVar.e(error);
                    }
                    return;
                }
                this.f61271f = true;
                this.f61269d = true;
                z11 = false;
            }
            if (z11) {
                az.a.r(th2);
            } else {
                this.f61266a.onError(th2);
            }
        }
    }

    public a(k<? super T> kVar, boolean z11) {
        this.f61266a = kVar;
        this.f61267b = z11;
    }
}