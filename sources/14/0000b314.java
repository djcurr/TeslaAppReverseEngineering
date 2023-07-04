package sy;

import io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMap;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class j<T, U> extends sy.a<T, U> {

    /* renamed from: b  reason: collision with root package name */
    final ky.h<? super T, ? extends hy.j<? extends U>> f50790b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f50791c;

    /* renamed from: d  reason: collision with root package name */
    final int f50792d;

    /* renamed from: e  reason: collision with root package name */
    final int f50793e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a<T, U> extends AtomicReference<iy.b> implements hy.k<U> {

        /* renamed from: a  reason: collision with root package name */
        final b<T, U> f50794a;

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f50795b;

        /* renamed from: c  reason: collision with root package name */
        volatile ny.h<U> f50796c;

        /* renamed from: d  reason: collision with root package name */
        int f50797d;

        a(b<T, U> bVar, long j11) {
            this.f50794a = bVar;
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            if (ly.a.setOnce(this, bVar) && (bVar instanceof ny.c)) {
                ny.c cVar = (ny.c) bVar;
                int requestFusion = cVar.requestFusion(7);
                if (requestFusion == 1) {
                    this.f50797d = requestFusion;
                    this.f50796c = cVar;
                    this.f50795b = true;
                    this.f50794a.i();
                } else if (requestFusion == 2) {
                    this.f50797d = requestFusion;
                    this.f50796c = cVar;
                }
            }
        }

        @Override // hy.k
        public void b(U u11) {
            if (this.f50797d == 0) {
                this.f50794a.n(u11, this);
            } else {
                this.f50794a.i();
            }
        }

        public void c() {
            ly.a.dispose(this);
        }

        @Override // hy.k
        public void onComplete() {
            this.f50795b = true;
            this.f50794a.i();
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            if (this.f50794a.f50807h.c(th2)) {
                b<T, U> bVar = this.f50794a;
                if (!bVar.f50802c) {
                    bVar.h();
                }
                this.f50795b = true;
                this.f50794a.i();
            }
        }
    }

    /* loaded from: classes5.dex */
    static final class b<T, U> extends AtomicInteger implements iy.b, hy.k<T> {

        /* renamed from: p  reason: collision with root package name */
        static final ObservableFlatMap.InnerObserver<?, ?>[] f50798p = new a[0];

        /* renamed from: q  reason: collision with root package name */
        static final ObservableFlatMap.InnerObserver<?, ?>[] f50799q = new a[0];

        /* renamed from: a  reason: collision with root package name */
        final hy.k<? super U> f50800a;

        /* renamed from: b  reason: collision with root package name */
        final ky.h<? super T, ? extends hy.j<? extends U>> f50801b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f50802c;

        /* renamed from: d  reason: collision with root package name */
        final int f50803d;

        /* renamed from: e  reason: collision with root package name */
        final int f50804e;

        /* renamed from: f  reason: collision with root package name */
        volatile ny.g<U> f50805f;

        /* renamed from: g  reason: collision with root package name */
        volatile boolean f50806g;

        /* renamed from: h  reason: collision with root package name */
        final yy.b f50807h = new yy.b();

        /* renamed from: i  reason: collision with root package name */
        volatile boolean f50808i;

        /* renamed from: j  reason: collision with root package name */
        final AtomicReference<ObservableFlatMap.InnerObserver<?, ?>[]> f50809j;

        /* renamed from: k  reason: collision with root package name */
        iy.b f50810k;

        /* renamed from: l  reason: collision with root package name */
        long f50811l;

        /* renamed from: m  reason: collision with root package name */
        int f50812m;

        /* renamed from: n  reason: collision with root package name */
        Queue<hy.j<? extends U>> f50813n;

        /* renamed from: o  reason: collision with root package name */
        int f50814o;

        b(hy.k<? super U> kVar, ky.h<? super T, ? extends hy.j<? extends U>> hVar, boolean z11, int i11, int i12) {
            this.f50800a = kVar;
            this.f50801b = hVar;
            this.f50802c = z11;
            this.f50803d = i11;
            this.f50804e = i12;
            if (i11 != Integer.MAX_VALUE) {
                this.f50813n = new ArrayDeque(i11);
            }
            this.f50809j = new AtomicReference<>(f50798p);
        }

        @Override // hy.k
        public void a(iy.b bVar) {
            if (ly.a.validate(this.f50810k, bVar)) {
                this.f50810k = bVar;
                this.f50800a.a(this);
            }
        }

        @Override // hy.k
        public void b(T t11) {
            if (this.f50806g) {
                return;
            }
            try {
                hy.j<? extends U> apply = this.f50801b.apply(t11);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                hy.j<? extends U> jVar = apply;
                if (this.f50803d != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i11 = this.f50814o;
                        if (i11 == this.f50803d) {
                            this.f50813n.offer(jVar);
                            return;
                        }
                        this.f50814o = i11 + 1;
                    }
                }
                l(jVar);
            } catch (Throwable th2) {
                jy.a.b(th2);
                this.f50810k.dispose();
                onError(th2);
            }
        }

        boolean c(a<T, U> aVar) {
            ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr;
            ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = (a[]) this.f50809j.get();
                if (innerObserverArr == f50799q) {
                    aVar.c();
                    return false;
                }
                int length = innerObserverArr.length;
                innerObserverArr2 = new a[length + 1];
                System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                innerObserverArr2[length] = aVar;
            } while (!this.f50809j.compareAndSet(innerObserverArr, innerObserverArr2));
            return true;
        }

        @Override // iy.b
        public void dispose() {
            this.f50808i = true;
            if (h()) {
                this.f50807h.d();
            }
        }

        boolean g() {
            if (this.f50808i) {
                return true;
            }
            Throwable th2 = this.f50807h.get();
            if (this.f50802c || th2 == null) {
                return false;
            }
            h();
            this.f50807h.f(this.f50800a);
            return true;
        }

        boolean h() {
            this.f50810k.dispose();
            AtomicReference<ObservableFlatMap.InnerObserver<?, ?>[]> atomicReference = this.f50809j;
            a[] aVarArr = f50799q;
            a[] andSet = atomicReference.getAndSet(aVarArr);
            if (andSet != aVarArr) {
                for (a aVar : andSet) {
                    aVar.c();
                }
                return true;
            }
            return false;
        }

        void i() {
            if (getAndIncrement() == 0) {
                j();
            }
        }

        @Override // iy.b
        public boolean isDisposed() {
            return this.f50808i;
        }

        void j() {
            int i11;
            int i12;
            hy.k<? super U> kVar = this.f50800a;
            int i13 = 1;
            while (!g()) {
                ny.g<U> gVar = this.f50805f;
                int i14 = 0;
                if (gVar != null) {
                    while (!g()) {
                        Object obj = (U) gVar.poll();
                        if (obj != null) {
                            kVar.b(obj);
                            i14++;
                        }
                    }
                    return;
                }
                if (i14 != 0) {
                    if (this.f50803d != Integer.MAX_VALUE) {
                        m(i14);
                    }
                } else {
                    boolean z11 = this.f50806g;
                    ny.g<U> gVar2 = this.f50805f;
                    a<T, U>[] aVarArr = (a[]) this.f50809j.get();
                    int length = aVarArr.length;
                    if (this.f50803d != Integer.MAX_VALUE) {
                        synchronized (this) {
                            i11 = this.f50813n.size();
                        }
                    } else {
                        i11 = 0;
                    }
                    if (z11 && ((gVar2 == null || gVar2.isEmpty()) && length == 0 && i11 == 0)) {
                        this.f50807h.f(this.f50800a);
                        return;
                    }
                    if (length != 0) {
                        int min = Math.min(length - 1, this.f50812m);
                        for (i12 = 0; i12 < length; i12 = i12 + 1) {
                            if (g()) {
                                return;
                            }
                            a<T, U> aVar = aVarArr[min];
                            ny.h<U> hVar = aVar.f50796c;
                            if (hVar != null) {
                                while (true) {
                                    try {
                                        Object obj2 = (U) hVar.poll();
                                        if (obj2 == null) {
                                            break;
                                        }
                                        kVar.b(obj2);
                                        if (g()) {
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        jy.a.b(th2);
                                        aVar.c();
                                        this.f50807h.c(th2);
                                        if (g()) {
                                            return;
                                        }
                                        k(aVar);
                                        i14++;
                                        min++;
                                        if (min != length) {
                                        }
                                    }
                                }
                            }
                            boolean z12 = aVar.f50795b;
                            ny.h<U> hVar2 = aVar.f50796c;
                            if (z12 && (hVar2 == null || hVar2.isEmpty())) {
                                k(aVar);
                                i14++;
                            }
                            min++;
                            i12 = min != length ? i12 + 1 : 0;
                            min = 0;
                        }
                        this.f50812m = min;
                    }
                    if (i14 != 0) {
                        if (this.f50803d != Integer.MAX_VALUE) {
                            m(i14);
                        }
                    } else {
                        i13 = addAndGet(-i13);
                        if (i13 == 0) {
                            return;
                        }
                    }
                }
            }
        }

        void k(a<T, U> aVar) {
            ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr;
            ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = (a[]) this.f50809j.get();
                int length = innerObserverArr.length;
                int i11 = -1;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    } else if (innerObserverArr[i12] == aVar) {
                        i11 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i11 < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = f50798p;
                } else {
                    ObservableFlatMap.InnerObserver<?, ?>[] innerObserverArr3 = new a[length - 1];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i11);
                    System.arraycopy(innerObserverArr, i11 + 1, innerObserverArr3, i11, (length - i11) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!this.f50809j.compareAndSet(innerObserverArr, innerObserverArr2));
        }

        void l(hy.j<? extends U> jVar) {
            hy.j<? extends U> poll;
            while (jVar instanceof ky.j) {
                if (!o((ky.j) jVar) || this.f50803d == Integer.MAX_VALUE) {
                    return;
                }
                boolean z11 = false;
                synchronized (this) {
                    poll = this.f50813n.poll();
                    if (poll == null) {
                        this.f50814o--;
                        z11 = true;
                    }
                }
                if (z11) {
                    i();
                    return;
                }
                jVar = poll;
            }
            long j11 = this.f50811l;
            this.f50811l = 1 + j11;
            a<T, U> aVar = new a<>(this, j11);
            if (c(aVar)) {
                jVar.c(aVar);
            }
        }

        void m(int i11) {
            while (true) {
                int i12 = i11 - 1;
                if (i11 == 0) {
                    return;
                }
                synchronized (this) {
                    hy.j<? extends U> poll = this.f50813n.poll();
                    if (poll == null) {
                        this.f50814o--;
                    } else {
                        l(poll);
                    }
                }
                i11 = i12;
            }
        }

        void n(U u11, a<T, U> aVar) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f50800a.b(u11);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                ny.h hVar = aVar.f50796c;
                if (hVar == null) {
                    hVar = new uy.c(this.f50804e);
                    aVar.f50796c = hVar;
                }
                hVar.offer(u11);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            j();
        }

        boolean o(ky.j<? extends U> jVar) {
            try {
                U u11 = jVar.get();
                if (u11 == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.f50800a.b(u11);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    ny.g<U> gVar = this.f50805f;
                    if (gVar == null) {
                        if (this.f50803d == Integer.MAX_VALUE) {
                            gVar = new uy.c<>(this.f50804e);
                        } else {
                            gVar = new uy.b<>(this.f50803d);
                        }
                        this.f50805f = gVar;
                    }
                    gVar.offer(u11);
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                j();
                return true;
            } catch (Throwable th2) {
                jy.a.b(th2);
                this.f50807h.c(th2);
                i();
                return true;
            }
        }

        @Override // hy.k
        public void onComplete() {
            if (this.f50806g) {
                return;
            }
            this.f50806g = true;
            i();
        }

        @Override // hy.k
        public void onError(Throwable th2) {
            if (this.f50806g) {
                az.a.r(th2);
            } else if (this.f50807h.c(th2)) {
                this.f50806g = true;
                i();
            }
        }
    }

    public j(hy.j<T> jVar, ky.h<? super T, ? extends hy.j<? extends U>> hVar, boolean z11, int i11, int i12) {
        super(jVar);
        this.f50790b = hVar;
        this.f50791c = z11;
        this.f50792d = i11;
        this.f50793e = i12;
    }

    @Override // hy.i
    public void L(hy.k<? super U> kVar) {
        if (r.b(this.f50705a, kVar, this.f50790b)) {
            return;
        }
        this.f50705a.c(new b(kVar, this.f50790b, this.f50791c, this.f50792d, this.f50793e));
    }
}