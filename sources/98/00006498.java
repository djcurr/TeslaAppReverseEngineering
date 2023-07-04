package cz;

import hy.k;
import yy.a;
import yy.i;

/* loaded from: classes5.dex */
final class d<T> extends e<T> implements a.InterfaceC1369a<Object> {

    /* renamed from: a  reason: collision with root package name */
    final e<T> f23202a;

    /* renamed from: b  reason: collision with root package name */
    boolean f23203b;

    /* renamed from: c  reason: collision with root package name */
    yy.a<Object> f23204c;

    /* renamed from: d  reason: collision with root package name */
    volatile boolean f23205d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(e<T> eVar) {
        this.f23202a = eVar;
    }

    @Override // hy.i
    protected void L(k<? super T> kVar) {
        this.f23202a.c(kVar);
    }

    @Override // cz.e
    public boolean R() {
        return this.f23202a.R();
    }

    @Override // cz.e
    public boolean S() {
        return this.f23202a.S();
    }

    @Override // cz.e
    public boolean T() {
        return this.f23202a.T();
    }

    void V() {
        yy.a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f23204c;
                if (aVar == null) {
                    this.f23203b = false;
                    return;
                }
                this.f23204c = null;
            }
            aVar.d(this);
        }
    }

    @Override // hy.k
    public void a(iy.b bVar) {
        boolean z11 = true;
        if (!this.f23205d) {
            synchronized (this) {
                if (!this.f23205d) {
                    if (this.f23203b) {
                        yy.a<Object> aVar = this.f23204c;
                        if (aVar == null) {
                            aVar = new yy.a<>(4);
                            this.f23204c = aVar;
                        }
                        aVar.c(i.disposable(bVar));
                        return;
                    }
                    this.f23203b = true;
                    z11 = false;
                }
            }
        }
        if (z11) {
            bVar.dispose();
            return;
        }
        this.f23202a.a(bVar);
        V();
    }

    @Override // hy.k
    public void b(T t11) {
        if (this.f23205d) {
            return;
        }
        synchronized (this) {
            if (this.f23205d) {
                return;
            }
            if (this.f23203b) {
                yy.a<Object> aVar = this.f23204c;
                if (aVar == null) {
                    aVar = new yy.a<>(4);
                    this.f23204c = aVar;
                }
                aVar.c(i.next(t11));
                return;
            }
            this.f23203b = true;
            this.f23202a.b(t11);
            V();
        }
    }

    @Override // hy.k
    public void onComplete() {
        if (this.f23205d) {
            return;
        }
        synchronized (this) {
            if (this.f23205d) {
                return;
            }
            this.f23205d = true;
            if (this.f23203b) {
                yy.a<Object> aVar = this.f23204c;
                if (aVar == null) {
                    aVar = new yy.a<>(4);
                    this.f23204c = aVar;
                }
                aVar.c(i.complete());
                return;
            }
            this.f23203b = true;
            this.f23202a.onComplete();
        }
    }

    @Override // hy.k
    public void onError(Throwable th2) {
        if (this.f23205d) {
            az.a.r(th2);
            return;
        }
        synchronized (this) {
            boolean z11 = true;
            if (!this.f23205d) {
                this.f23205d = true;
                if (this.f23203b) {
                    yy.a<Object> aVar = this.f23204c;
                    if (aVar == null) {
                        aVar = new yy.a<>(4);
                        this.f23204c = aVar;
                    }
                    aVar.e(i.error(th2));
                    return;
                }
                this.f23203b = true;
                z11 = false;
            }
            if (z11) {
                az.a.r(th2);
            } else {
                this.f23202a.onError(th2);
            }
        }
    }

    @Override // yy.a.InterfaceC1369a, ky.i
    public boolean test(Object obj) {
        return i.acceptFull(obj, this.f23202a);
    }
}