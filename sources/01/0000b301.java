package sy;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCombineLatest;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class b<T, R> extends hy.i<R> {

    /* renamed from: a  reason: collision with root package name */
    final ObservableSource<? extends T>[] f50706a;

    /* renamed from: b  reason: collision with root package name */
    final Iterable<? extends hy.j<? extends T>> f50707b;

    /* renamed from: c  reason: collision with root package name */
    final ky.h<? super Object[], ? extends R> f50708c;

    /* renamed from: d  reason: collision with root package name */
    final int f50709d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f50710e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a<T, R> extends AtomicReference<iy.b> implements hy.k<T> {

        /* renamed from: a  reason: collision with root package name */
        final C1131b<T, R> f50711a;

        /* renamed from: b  reason: collision with root package name */
        final int f50712b;

        a(C1131b<T, R> c1131b, int i11) {
            this.f50711a = c1131b;
            this.f50712b = i11;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            ly.a.setOnce(this, bVar);
        }

        @Override // hy.k
        public void b(T t11) {
            this.f50711a.i(this.f50712b, t11);
        }

        public void c() {
            ly.a.dispose(this);
        }

        @Override // hy.k
        public void onComplete() {
            this.f50711a.g(this.f50712b);
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            this.f50711a.h(this.f50712b, th2);
        }
    }

    /* renamed from: sy.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C1131b<T, R> extends AtomicInteger implements iy.b {

        /* renamed from: a  reason: collision with root package name */
        final hy.k<? super R> f50713a;

        /* renamed from: b  reason: collision with root package name */
        final ky.h<? super Object[], ? extends R> f50714b;

        /* renamed from: c  reason: collision with root package name */
        final ObservableCombineLatest.CombinerObserver<T, R>[] f50715c;

        /* renamed from: d  reason: collision with root package name */
        Object[] f50716d;

        /* renamed from: e  reason: collision with root package name */
        final uy.c<Object[]> f50717e;

        /* renamed from: f  reason: collision with root package name */
        final boolean f50718f;

        /* renamed from: g  reason: collision with root package name */
        volatile boolean f50719g;

        /* renamed from: h  reason: collision with root package name */
        volatile boolean f50720h;

        /* renamed from: i  reason: collision with root package name */
        final yy.b f50721i = new yy.b();

        /* renamed from: j  reason: collision with root package name */
        int f50722j;

        /* renamed from: k  reason: collision with root package name */
        int f50723k;

        C1131b(hy.k<? super R> kVar, ky.h<? super Object[], ? extends R> hVar, int i11, int i12, boolean z11) {
            this.f50713a = kVar;
            this.f50714b = hVar;
            this.f50718f = z11;
            this.f50716d = new Object[i11];
            a[] aVarArr = new a[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                aVarArr[i13] = new a(this, i13);
            }
            this.f50715c = aVarArr;
            this.f50717e = new uy.c<>(i12);
        }

        void a() {
            for (a aVar : this.f50715c) {
                aVar.c();
            }
        }

        void b(uy.c<?> cVar) {
            synchronized (this) {
                this.f50716d = null;
            }
            cVar.clear();
        }

        void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            uy.c<Object[]> cVar = this.f50717e;
            hy.k<? super R> kVar = this.f50713a;
            boolean z11 = this.f50718f;
            int i11 = 1;
            while (!this.f50719g) {
                if (!z11 && this.f50721i.get() != null) {
                    a();
                    b(cVar);
                    this.f50721i.f(kVar);
                    return;
                }
                boolean z12 = this.f50720h;
                Object[] poll = cVar.poll();
                boolean z13 = poll == null;
                if (z12 && z13) {
                    b(cVar);
                    this.f50721i.f(kVar);
                    return;
                } else if (z13) {
                    i11 = addAndGet(-i11);
                    if (i11 == 0) {
                        return;
                    }
                } else {
                    try {
                        Object obj = (R) this.f50714b.apply(poll);
                        Objects.requireNonNull(obj, "The combiner returned a null value");
                        kVar.b(obj);
                    } catch (Throwable th2) {
                        jy.a.b(th2);
                        this.f50721i.c(th2);
                        a();
                        b(cVar);
                        this.f50721i.f(kVar);
                        return;
                    }
                }
            }
            b(cVar);
            this.f50721i.d();
        }

        @Override // iy.b
        public void dispose() {
            if (this.f50719g) {
                return;
            }
            this.f50719g = true;
            a();
            c();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
            if (r2 == r0.length) goto L19;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void g(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f50716d     // Catch: java.lang.Throwable -> L25
                if (r0 != 0) goto L7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                return
            L7:
                r4 = r0[r4]     // Catch: java.lang.Throwable -> L25
                r1 = 1
                if (r4 != 0) goto Le
                r4 = r1
                goto Lf
            Le:
                r4 = 0
            Lf:
                if (r4 != 0) goto L19
                int r2 = r3.f50723k     // Catch: java.lang.Throwable -> L25
                int r2 = r2 + r1
                r3.f50723k = r2     // Catch: java.lang.Throwable -> L25
                int r0 = r0.length     // Catch: java.lang.Throwable -> L25
                if (r2 != r0) goto L1b
            L19:
                r3.f50720h = r1     // Catch: java.lang.Throwable -> L25
            L1b:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                if (r4 == 0) goto L21
                r3.a()
            L21:
                r3.c()
                return
            L25:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: sy.b.C1131b.g(int):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
            if (r1 == r4.length) goto L20;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void h(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                yy.b r0 = r2.f50721i
                boolean r4 = r0.c(r4)
                if (r4 == 0) goto L35
                boolean r4 = r2.f50718f
                r0 = 1
                if (r4 == 0) goto L2d
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.f50716d     // Catch: java.lang.Throwable -> L2a
                if (r4 != 0) goto L14
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                return
            L14:
                r3 = r4[r3]     // Catch: java.lang.Throwable -> L2a
                if (r3 != 0) goto L1a
                r3 = r0
                goto L1b
            L1a:
                r3 = 0
            L1b:
                if (r3 != 0) goto L25
                int r1 = r2.f50723k     // Catch: java.lang.Throwable -> L2a
                int r1 = r1 + r0
                r2.f50723k = r1     // Catch: java.lang.Throwable -> L2a
                int r4 = r4.length     // Catch: java.lang.Throwable -> L2a
                if (r1 != r4) goto L27
            L25:
                r2.f50720h = r0     // Catch: java.lang.Throwable -> L2a
            L27:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                r0 = r3
                goto L2d
            L2a:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                throw r3
            L2d:
                if (r0 == 0) goto L32
                r2.a()
            L32:
                r2.c()
            L35:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sy.b.C1131b.h(int, java.lang.Throwable):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        void i(int i11, T t11) {
            boolean z11;
            synchronized (this) {
                Object[] objArr = this.f50716d;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i11];
                int i12 = this.f50722j;
                if (obj == null) {
                    i12++;
                    this.f50722j = i12;
                }
                objArr[i11] = t11;
                if (i12 == objArr.length) {
                    this.f50717e.offer(objArr.clone());
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    c();
                }
            }
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f50719g;
        }

        public void j(ObservableSource<? extends T>[] observableSourceArr) {
            ObservableCombineLatest.CombinerObserver<T, R>[] combinerObserverArr = this.f50715c;
            int length = combinerObserverArr.length;
            this.f50713a.a(this);
            for (int i11 = 0; i11 < length && !this.f50720h && !this.f50719g; i11++) {
                observableSourceArr[i11].c(combinerObserverArr[i11]);
            }
        }
    }

    public b(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends hy.j<? extends T>> iterable, ky.h<? super Object[], ? extends R> hVar, int i11, boolean z11) {
        this.f50706a = observableSourceArr;
        this.f50707b = iterable;
        this.f50708c = hVar;
        this.f50709d = i11;
        this.f50710e = z11;
    }

    @Override // hy.i
    public void L(hy.k<? super R> kVar) {
        int length;
        hy.j[] jVarArr = this.f50706a;
        if (jVarArr == null) {
            jVarArr = new hy.j[8];
            try {
                length = 0;
                for (hy.j<? extends T> jVar : this.f50707b) {
                    if (length == jVarArr.length) {
                        hy.j[] jVarArr2 = new hy.j[(length >> 2) + length];
                        System.arraycopy(jVarArr, 0, jVarArr2, 0, length);
                        jVarArr = jVarArr2;
                    }
                    int i11 = length + 1;
                    Objects.requireNonNull(jVar, "The Iterator returned a null ObservableSource");
                    jVarArr[length] = jVar;
                    length = i11;
                }
            } catch (Throwable th2) {
                jy.a.b(th2);
                ly.b.error(th2, kVar);
                return;
            }
        } else {
            length = jVarArr.length;
        }
        int i12 = length;
        if (i12 == 0) {
            ly.b.complete(kVar);
        } else {
            new C1131b(kVar, this.f50708c, i12, this.f50709d, this.f50710e).j(jVarArr);
        }
    }
}