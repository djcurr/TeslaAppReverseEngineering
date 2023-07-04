package sy;

import hy.l;

/* loaded from: classes5.dex */
public final class q<T> extends sy.a<T, T> {

    /* renamed from: b  reason: collision with root package name */
    final hy.l f50830b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f50831c;

    /* renamed from: d  reason: collision with root package name */
    final int f50832d;

    /* loaded from: classes5.dex */
    static final class a<T> extends oy.b<T> implements hy.k<T>, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final hy.k<? super T> f50833a;

        /* renamed from: b  reason: collision with root package name */
        final l.c f50834b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f50835c;

        /* renamed from: d  reason: collision with root package name */
        final int f50836d;

        /* renamed from: e  reason: collision with root package name */
        ny.h<T> f50837e;

        /* renamed from: f  reason: collision with root package name */
        iy.b f50838f;

        /* renamed from: g  reason: collision with root package name */
        Throwable f50839g;

        /* renamed from: h  reason: collision with root package name */
        volatile boolean f50840h;

        /* renamed from: i  reason: collision with root package name */
        volatile boolean f50841i;

        /* renamed from: j  reason: collision with root package name */
        int f50842j;

        /* renamed from: k  reason: collision with root package name */
        boolean f50843k;

        a(hy.k<? super T> kVar, l.c cVar, boolean z11, int i11) {
            this.f50833a = kVar;
            this.f50834b = cVar;
            this.f50835c = z11;
            this.f50836d = i11;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            if (ly.a.validate(this.f50838f, bVar)) {
                this.f50838f = bVar;
                if (bVar instanceof ny.c) {
                    ny.c cVar = (ny.c) bVar;
                    int requestFusion = cVar.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f50842j = requestFusion;
                        this.f50837e = cVar;
                        this.f50840h = true;
                        this.f50833a.a(this);
                        i();
                        return;
                    } else if (requestFusion == 2) {
                        this.f50842j = requestFusion;
                        this.f50837e = cVar;
                        this.f50833a.a(this);
                        return;
                    }
                }
                this.f50837e = new uy.c(this.f50836d);
                this.f50833a.a(this);
            }
        }

        @Override // hy.k
        public void b(T t11) {
            if (this.f50840h) {
                return;
            }
            if (this.f50842j != 2) {
                this.f50837e.offer(t11);
            }
            i();
        }

        boolean c(boolean z11, boolean z12, hy.k<? super T> kVar) {
            if (this.f50841i) {
                this.f50837e.clear();
                return true;
            } else if (z11) {
                Throwable th2 = this.f50839g;
                if (this.f50835c) {
                    if (z12) {
                        this.f50841i = true;
                        if (th2 != null) {
                            kVar.onError(th2);
                        } else {
                            kVar.onComplete();
                        }
                        this.f50834b.dispose();
                        return true;
                    }
                    return false;
                } else if (th2 != null) {
                    this.f50841i = true;
                    this.f50837e.clear();
                    kVar.onError(th2);
                    this.f50834b.dispose();
                    return true;
                } else if (z12) {
                    this.f50841i = true;
                    kVar.onComplete();
                    this.f50834b.dispose();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // ny.h
        public void clear() {
            this.f50837e.clear();
        }

        @Override // iy.b
        public void dispose() {
            if (this.f50841i) {
                return;
            }
            this.f50841i = true;
            this.f50838f.dispose();
            this.f50834b.dispose();
            if (this.f50843k || getAndIncrement() != 0) {
                return;
            }
            this.f50837e.clear();
        }

        void g() {
            int i11 = 1;
            while (!this.f50841i) {
                boolean z11 = this.f50840h;
                Throwable th2 = this.f50839g;
                if (!this.f50835c && z11 && th2 != null) {
                    this.f50841i = true;
                    this.f50833a.onError(this.f50839g);
                    this.f50834b.dispose();
                    return;
                }
                this.f50833a.b(null);
                if (z11) {
                    this.f50841i = true;
                    Throwable th3 = this.f50839g;
                    if (th3 != null) {
                        this.f50833a.onError(th3);
                    } else {
                        this.f50833a.onComplete();
                    }
                    this.f50834b.dispose();
                    return;
                }
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
        }

        void h() {
            ny.h<T> hVar = this.f50837e;
            hy.k<? super T> kVar = this.f50833a;
            int i11 = 1;
            while (!c(this.f50840h, hVar.isEmpty(), kVar)) {
                while (true) {
                    boolean z11 = this.f50840h;
                    try {
                        Object obj = (T) hVar.poll();
                        boolean z12 = obj == null;
                        if (c(z11, z12, kVar)) {
                            return;
                        }
                        if (z12) {
                            i11 = addAndGet(-i11);
                            if (i11 == 0) {
                                return;
                            }
                        } else {
                            kVar.b(obj);
                        }
                    } catch (Throwable th2) {
                        jy.a.b(th2);
                        this.f50841i = true;
                        this.f50838f.dispose();
                        hVar.clear();
                        kVar.onError(th2);
                        this.f50834b.dispose();
                        return;
                    }
                }
            }
        }

        void i() {
            if (getAndIncrement() == 0) {
                this.f50834b.b(this);
            }
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f50841i;
        }

        @Override // ny.h
        public boolean isEmpty() {
            return this.f50837e.isEmpty();
        }

        @Override // hy.k
        public void onComplete() {
            if (this.f50840h) {
                return;
            }
            this.f50840h = true;
            i();
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            if (this.f50840h) {
                az.a.r(th2);
                return;
            }
            this.f50839g = th2;
            this.f50840h = true;
            i();
        }

        @Override // ny.h
        public T poll() {
            return this.f50837e.poll();
        }

        @Override // ny.d
        public int requestFusion(int i11) {
            if ((i11 & 2) != 0) {
                this.f50843k = true;
                return 2;
            }
            return 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f50843k) {
                g();
            } else {
                h();
            }
        }
    }

    public q(hy.j<T> jVar, hy.l lVar, boolean z11, int i11) {
        super(jVar);
        this.f50830b = lVar;
        this.f50831c = z11;
        this.f50832d = i11;
    }

    @Override // hy.i
    protected void L(hy.k<? super T> kVar) {
        hy.l lVar = this.f50830b;
        if (lVar instanceof vy.p) {
            this.f50705a.c(kVar);
            return;
        }
        this.f50705a.c(new a(kVar, lVar.c(), this.f50831c, this.f50832d));
    }
}