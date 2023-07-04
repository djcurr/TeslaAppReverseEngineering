package dz;

import b80.c;
import hy.f;
import xy.e;
import yy.g;
import yy.i;

/* loaded from: classes5.dex */
public final class b<T> implements f<T>, c {

    /* renamed from: a  reason: collision with root package name */
    final b80.b<? super T> f24367a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f24368b;

    /* renamed from: c  reason: collision with root package name */
    c f24369c;

    /* renamed from: d  reason: collision with root package name */
    boolean f24370d;

    /* renamed from: e  reason: collision with root package name */
    yy.a<Object> f24371e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f24372f;

    public b(b80.b<? super T> bVar) {
        this(bVar, false);
    }

    void a() {
        yy.a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f24371e;
                if (aVar == null) {
                    this.f24370d = false;
                    return;
                }
                this.f24371e = null;
            }
        } while (!aVar.a((b80.b<? super T>) this.f24367a));
    }

    @Override // b80.b
    public void b(T t11) {
        if (this.f24372f) {
            return;
        }
        if (t11 == null) {
            this.f24369c.cancel();
            onError(g.b("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            if (this.f24372f) {
                return;
            }
            if (this.f24370d) {
                yy.a<Object> aVar = this.f24371e;
                if (aVar == null) {
                    aVar = new yy.a<>(4);
                    this.f24371e = aVar;
                }
                aVar.c(i.next(t11));
                return;
            }
            this.f24370d = true;
            this.f24367a.b(t11);
            a();
        }
    }

    @Override // hy.f, b80.b
    public void c(c cVar) {
        if (e.validate(this.f24369c, cVar)) {
            this.f24369c = cVar;
            this.f24367a.c(this);
        }
    }

    @Override // b80.c
    public void cancel() {
        this.f24369c.cancel();
    }

    @Override // b80.b
    public void onComplete() {
        if (this.f24372f) {
            return;
        }
        synchronized (this) {
            if (this.f24372f) {
                return;
            }
            if (this.f24370d) {
                yy.a<Object> aVar = this.f24371e;
                if (aVar == null) {
                    aVar = new yy.a<>(4);
                    this.f24371e = aVar;
                }
                aVar.c(i.complete());
                return;
            }
            this.f24372f = true;
            this.f24370d = true;
            this.f24367a.onComplete();
        }
    }

    @Override // b80.b
    public void onError(Throwable th2) {
        if (this.f24372f) {
            az.a.r(th2);
            return;
        }
        synchronized (this) {
            boolean z11 = true;
            if (!this.f24372f) {
                if (this.f24370d) {
                    this.f24372f = true;
                    yy.a<Object> aVar = this.f24371e;
                    if (aVar == null) {
                        aVar = new yy.a<>(4);
                        this.f24371e = aVar;
                    }
                    Object error = i.error(th2);
                    if (this.f24368b) {
                        aVar.c(error);
                    } else {
                        aVar.e(error);
                    }
                    return;
                }
                this.f24372f = true;
                this.f24370d = true;
                z11 = false;
            }
            if (z11) {
                az.a.r(th2);
            } else {
                this.f24367a.onError(th2);
            }
        }
    }

    @Override // b80.c
    public void request(long j11) {
        this.f24369c.request(j11);
    }

    public b(b80.b<? super T> bVar, boolean z11) {
        this.f24367a = bVar;
        this.f24368b = z11;
    }
}