package cz;

import hy.i;
import hy.k;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ny.h;
import yy.g;

/* loaded from: classes5.dex */
public final class f<T> extends e<T> {

    /* renamed from: a  reason: collision with root package name */
    final uy.c<T> f23206a;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<Runnable> f23208c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f23209d;

    /* renamed from: e  reason: collision with root package name */
    volatile boolean f23210e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f23211f;

    /* renamed from: g  reason: collision with root package name */
    Throwable f23212g;

    /* renamed from: j  reason: collision with root package name */
    boolean f23215j;

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<k<? super T>> f23207b = new AtomicReference<>();

    /* renamed from: h  reason: collision with root package name */
    final AtomicBoolean f23213h = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    final oy.b<T> f23214i = new a();

    /* loaded from: classes5.dex */
    final class a extends oy.b<T> {
        a() {
        }

        @Override // ny.h
        public void clear() {
            f.this.f23206a.clear();
        }

        @Override // iy.b
        public void dispose() {
            if (f.this.f23210e) {
                return;
            }
            f.this.f23210e = true;
            f.this.W();
            f.this.f23207b.lazySet(null);
            if (f.this.f23214i.getAndIncrement() == 0) {
                f.this.f23207b.lazySet(null);
                f fVar = f.this;
                if (fVar.f23215j) {
                    return;
                }
                fVar.f23206a.clear();
            }
        }

        @Override // iy.b
        public boolean isDisposed() {
            return f.this.f23210e;
        }

        @Override // ny.h
        public boolean isEmpty() {
            return f.this.f23206a.isEmpty();
        }

        @Override // ny.h
        public T poll() {
            return f.this.f23206a.poll();
        }

        @Override // ny.d
        public int requestFusion(int i11) {
            if ((i11 & 2) != 0) {
                f.this.f23215j = true;
                return 2;
            }
            return 0;
        }
    }

    f(int i11, Runnable runnable, boolean z11) {
        this.f23206a = new uy.c<>(i11);
        this.f23208c = new AtomicReference<>(runnable);
        this.f23209d = z11;
    }

    public static <T> f<T> V() {
        return new f<>(i.d(), null, true);
    }

    @Override // hy.i
    protected void L(k<? super T> kVar) {
        if (!this.f23213h.get() && this.f23213h.compareAndSet(false, true)) {
            kVar.a(this.f23214i);
            this.f23207b.lazySet(kVar);
            if (this.f23210e) {
                this.f23207b.lazySet(null);
                return;
            } else {
                X();
                return;
            }
        }
        ly.b.error(new IllegalStateException("Only a single observer allowed."), kVar);
    }

    @Override // cz.e
    public boolean R() {
        return this.f23211f && this.f23212g == null;
    }

    @Override // cz.e
    public boolean S() {
        return this.f23207b.get() != null;
    }

    @Override // cz.e
    public boolean T() {
        return this.f23211f && this.f23212g != null;
    }

    void W() {
        Runnable runnable = this.f23208c.get();
        if (runnable == null || !this.f23208c.compareAndSet(runnable, null)) {
            return;
        }
        runnable.run();
    }

    void X() {
        if (this.f23214i.getAndIncrement() != 0) {
            return;
        }
        k<? super T> kVar = this.f23207b.get();
        int i11 = 1;
        while (kVar == null) {
            i11 = this.f23214i.addAndGet(-i11);
            if (i11 == 0) {
                return;
            }
            kVar = this.f23207b.get();
        }
        if (this.f23215j) {
            Y(kVar);
        } else {
            Z(kVar);
        }
    }

    void Y(k<? super T> kVar) {
        uy.c<T> cVar = this.f23206a;
        int i11 = 1;
        boolean z11 = !this.f23209d;
        while (!this.f23210e) {
            boolean z12 = this.f23211f;
            if (z11 && z12 && b0(cVar, kVar)) {
                return;
            }
            kVar.b(null);
            if (z12) {
                a0(kVar);
                return;
            }
            i11 = this.f23214i.addAndGet(-i11);
            if (i11 == 0) {
                return;
            }
        }
        this.f23207b.lazySet(null);
    }

    void Z(k<? super T> kVar) {
        uy.c<T> cVar = this.f23206a;
        boolean z11 = !this.f23209d;
        boolean z12 = true;
        int i11 = 1;
        while (!this.f23210e) {
            boolean z13 = this.f23211f;
            Object obj = (T) this.f23206a.poll();
            boolean z14 = obj == null;
            if (z13) {
                if (z11 && z12) {
                    if (b0(cVar, kVar)) {
                        return;
                    }
                    z12 = false;
                }
                if (z14) {
                    a0(kVar);
                    return;
                }
            }
            if (z14) {
                i11 = this.f23214i.addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            } else {
                kVar.b(obj);
            }
        }
        this.f23207b.lazySet(null);
        cVar.clear();
    }

    @Override // hy.k
    public void a(iy.b bVar) {
        if (this.f23211f || this.f23210e) {
            bVar.dispose();
        }
    }

    void a0(k<? super T> kVar) {
        this.f23207b.lazySet(null);
        Throwable th2 = this.f23212g;
        if (th2 != null) {
            kVar.onError(th2);
        } else {
            kVar.onComplete();
        }
    }

    @Override // hy.k
    public void b(T t11) {
        g.c(t11, "onNext called with a null value.");
        if (this.f23211f || this.f23210e) {
            return;
        }
        this.f23206a.offer(t11);
        X();
    }

    boolean b0(h<T> hVar, k<? super T> kVar) {
        Throwable th2 = this.f23212g;
        if (th2 != null) {
            this.f23207b.lazySet(null);
            hVar.clear();
            kVar.onError(th2);
            return true;
        }
        return false;
    }

    @Override // hy.k
    public void onComplete() {
        if (this.f23211f || this.f23210e) {
            return;
        }
        this.f23211f = true;
        W();
        X();
    }

    @Override // hy.k
    public void onError(Throwable th2) {
        g.c(th2, "onError called with a null Throwable.");
        if (!this.f23211f && !this.f23210e) {
            this.f23212g = th2;
            this.f23211f = true;
            W();
            X();
            return;
        }
        az.a.r(th2);
    }
}