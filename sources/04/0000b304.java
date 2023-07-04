package sy;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class c<T, U> extends sy.a<T, U> {

    /* renamed from: b  reason: collision with root package name */
    final ky.h<? super T, ? extends hy.j<? extends U>> f50724b;

    /* renamed from: c  reason: collision with root package name */
    final int f50725c;

    /* renamed from: d  reason: collision with root package name */
    final yy.f f50726d;

    /* loaded from: classes5.dex */
    static final class a<T, R> extends AtomicInteger implements hy.k<T>, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.k<? super R> f50727a;

        /* renamed from: b  reason: collision with root package name */
        final ky.h<? super T, ? extends hy.j<? extends R>> f50728b;

        /* renamed from: c  reason: collision with root package name */
        final int f50729c;

        /* renamed from: d  reason: collision with root package name */
        final yy.b f50730d = new yy.b();

        /* renamed from: e  reason: collision with root package name */
        final C1132a<R> f50731e;

        /* renamed from: f  reason: collision with root package name */
        final boolean f50732f;

        /* renamed from: g  reason: collision with root package name */
        ny.h<T> f50733g;

        /* renamed from: h  reason: collision with root package name */
        iy.b f50734h;

        /* renamed from: i  reason: collision with root package name */
        volatile boolean f50735i;

        /* renamed from: j  reason: collision with root package name */
        volatile boolean f50736j;

        /* renamed from: k  reason: collision with root package name */
        volatile boolean f50737k;

        /* renamed from: l  reason: collision with root package name */
        int f50738l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sy.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1132a<R> extends AtomicReference<iy.b> implements hy.k<R> {

            /* renamed from: a  reason: collision with root package name */
            final hy.k<? super R> f50739a;

            /* renamed from: b  reason: collision with root package name */
            final a<?, R> f50740b;

            C1132a(hy.k<? super R> kVar, a<?, R> aVar) {
                this.f50739a = kVar;
                this.f50740b = aVar;
            }

            @Override // hy.k
            public void a(iy.b bVar) {
                ly.a.replace(this, bVar);
            }

            @Override // hy.k
            public void b(R r11) {
                this.f50739a.b(r11);
            }

            void c() {
                ly.a.dispose(this);
            }

            @Override // hy.k
            public void onComplete() {
                a<?, R> aVar = this.f50740b;
                aVar.f50735i = false;
                aVar.c();
            }

            @Override // hy.k
            public void onError(Throwable th2) {
                a<?, R> aVar = this.f50740b;
                if (aVar.f50730d.c(th2)) {
                    if (!aVar.f50732f) {
                        aVar.f50734h.dispose();
                    }
                    aVar.f50735i = false;
                    aVar.c();
                }
            }
        }

        a(hy.k<? super R> kVar, ky.h<? super T, ? extends hy.j<? extends R>> hVar, int i11, boolean z11) {
            this.f50727a = kVar;
            this.f50728b = hVar;
            this.f50729c = i11;
            this.f50732f = z11;
            this.f50731e = new C1132a<>(kVar, this);
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            if (ly.a.validate(this.f50734h, bVar)) {
                this.f50734h = bVar;
                if (bVar instanceof ny.c) {
                    ny.c cVar = (ny.c) bVar;
                    int requestFusion = cVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f50738l = requestFusion;
                        this.f50733g = cVar;
                        this.f50736j = true;
                        this.f50727a.a(this);
                        c();
                        return;
                    } else if (requestFusion == 2) {
                        this.f50738l = requestFusion;
                        this.f50733g = cVar;
                        this.f50727a.a(this);
                        return;
                    }
                }
                this.f50733g = new uy.c(this.f50729c);
                this.f50727a.a(this);
            }
        }

        @Override // hy.k
        public void b(T t11) {
            if (this.f50738l == 0) {
                this.f50733g.offer(t11);
            }
            c();
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            hy.k<? super R> kVar = this.f50727a;
            ny.h<T> hVar = this.f50733g;
            yy.b bVar = this.f50730d;
            while (true) {
                if (!this.f50735i) {
                    if (this.f50737k) {
                        hVar.clear();
                        return;
                    } else if (!this.f50732f && bVar.get() != null) {
                        hVar.clear();
                        this.f50737k = true;
                        bVar.f(kVar);
                        return;
                    } else {
                        boolean z11 = this.f50736j;
                        try {
                            T poll = hVar.poll();
                            boolean z12 = poll == null;
                            if (z11 && z12) {
                                this.f50737k = true;
                                bVar.f(kVar);
                                return;
                            } else if (!z12) {
                                try {
                                    hy.j<? extends R> apply = this.f50728b.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                    hy.j<? extends R> jVar = apply;
                                    if (jVar instanceof ky.j) {
                                        try {
                                            Object obj = (Object) ((ky.j) jVar).get();
                                            if (obj != 0 && !this.f50737k) {
                                                kVar.b(obj);
                                            }
                                        } catch (Throwable th2) {
                                            jy.a.b(th2);
                                            bVar.c(th2);
                                        }
                                    } else {
                                        this.f50735i = true;
                                        jVar.c(this.f50731e);
                                    }
                                } catch (Throwable th3) {
                                    jy.a.b(th3);
                                    this.f50737k = true;
                                    this.f50734h.dispose();
                                    hVar.clear();
                                    bVar.c(th3);
                                    bVar.f(kVar);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            jy.a.b(th4);
                            this.f50737k = true;
                            this.f50734h.dispose();
                            bVar.c(th4);
                            bVar.f(kVar);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // iy.b
        public void dispose() {
            this.f50737k = true;
            this.f50734h.dispose();
            this.f50731e.c();
            this.f50730d.d();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f50737k;
        }

        @Override // hy.k
        public void onComplete() {
            this.f50736j = true;
            c();
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            if (this.f50730d.c(th2)) {
                this.f50736j = true;
                c();
            }
        }
    }

    /* loaded from: classes5.dex */
    static final class b<T, U> extends AtomicInteger implements hy.k<T>, iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.k<? super U> f50741a;

        /* renamed from: b  reason: collision with root package name */
        final ky.h<? super T, ? extends hy.j<? extends U>> f50742b;

        /* renamed from: c  reason: collision with root package name */
        final a<U> f50743c;

        /* renamed from: d  reason: collision with root package name */
        final int f50744d;

        /* renamed from: e  reason: collision with root package name */
        ny.h<T> f50745e;

        /* renamed from: f  reason: collision with root package name */
        iy.b f50746f;

        /* renamed from: g  reason: collision with root package name */
        volatile boolean f50747g;

        /* renamed from: h  reason: collision with root package name */
        volatile boolean f50748h;

        /* renamed from: i  reason: collision with root package name */
        volatile boolean f50749i;

        /* renamed from: j  reason: collision with root package name */
        int f50750j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a<U> extends AtomicReference<iy.b> implements hy.k<U> {

            /* renamed from: a  reason: collision with root package name */
            final hy.k<? super U> f50751a;

            /* renamed from: b  reason: collision with root package name */
            final b<?, ?> f50752b;

            a(hy.k<? super U> kVar, b<?, ?> bVar) {
                this.f50751a = kVar;
                this.f50752b = bVar;
            }

            @Override // hy.k
            public void a(iy.b bVar) {
                ly.a.replace(this, bVar);
            }

            @Override // hy.k
            public void b(U u11) {
                this.f50751a.b(u11);
            }

            void c() {
                ly.a.dispose(this);
            }

            @Override // hy.k
            public void onComplete() {
                this.f50752b.g();
            }

            @Override // hy.k
            public void onError(Throwable th2) {
                this.f50752b.dispose();
                this.f50751a.onError(th2);
            }
        }

        b(hy.k<? super U> kVar, ky.h<? super T, ? extends hy.j<? extends U>> hVar, int i11) {
            this.f50741a = kVar;
            this.f50742b = hVar;
            this.f50744d = i11;
            this.f50743c = new a<>(kVar, this);
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            if (ly.a.validate(this.f50746f, bVar)) {
                this.f50746f = bVar;
                if (bVar instanceof ny.c) {
                    ny.c cVar = (ny.c) bVar;
                    int requestFusion = cVar.requestFusion(3);
                    if (requestFusion == 1) {
                        this.f50750j = requestFusion;
                        this.f50745e = cVar;
                        this.f50749i = true;
                        this.f50741a.a(this);
                        c();
                        return;
                    } else if (requestFusion == 2) {
                        this.f50750j = requestFusion;
                        this.f50745e = cVar;
                        this.f50741a.a(this);
                        return;
                    }
                }
                this.f50745e = new uy.c(this.f50744d);
                this.f50741a.a(this);
            }
        }

        @Override // hy.k
        public void b(T t11) {
            if (this.f50749i) {
                return;
            }
            if (this.f50750j == 0) {
                this.f50745e.offer(t11);
            }
            c();
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f50748h) {
                if (!this.f50747g) {
                    boolean z11 = this.f50749i;
                    try {
                        T poll = this.f50745e.poll();
                        boolean z12 = poll == null;
                        if (z11 && z12) {
                            this.f50748h = true;
                            this.f50741a.onComplete();
                            return;
                        } else if (!z12) {
                            try {
                                hy.j<? extends U> apply = this.f50742b.apply(poll);
                                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                hy.j<? extends U> jVar = apply;
                                this.f50747g = true;
                                jVar.c(this.f50743c);
                            } catch (Throwable th2) {
                                jy.a.b(th2);
                                dispose();
                                this.f50745e.clear();
                                this.f50741a.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        jy.a.b(th3);
                        dispose();
                        this.f50745e.clear();
                        this.f50741a.onError(th3);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f50745e.clear();
        }

        @Override // iy.b
        public void dispose() {
            this.f50748h = true;
            this.f50743c.c();
            this.f50746f.dispose();
            if (getAndIncrement() == 0) {
                this.f50745e.clear();
            }
        }

        void g() {
            this.f50747g = false;
            c();
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f50748h;
        }

        @Override // hy.k
        public void onComplete() {
            if (this.f50749i) {
                return;
            }
            this.f50749i = true;
            c();
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            if (this.f50749i) {
                az.a.r(th2);
                return;
            }
            this.f50749i = true;
            dispose();
            this.f50741a.onError(th2);
        }
    }

    public c(hy.j<T> jVar, ky.h<? super T, ? extends hy.j<? extends U>> hVar, int i11, yy.f fVar) {
        super(jVar);
        this.f50724b = hVar;
        this.f50726d = fVar;
        this.f50725c = Math.max(8, i11);
    }

    @Override // hy.i
    public void L(hy.k<? super U> kVar) {
        if (r.b(this.f50705a, kVar, this.f50724b)) {
            return;
        }
        if (this.f50726d == yy.f.IMMEDIATE) {
            this.f50705a.c(new b(new zy.a(kVar), this.f50724b, this.f50725c));
        } else {
            this.f50705a.c(new a(kVar, this.f50724b, this.f50725c, this.f50726d == yy.f.END));
        }
    }
}