package sy;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class r {

    /* loaded from: classes5.dex */
    public static final class a<T> extends AtomicInteger implements ny.c<T>, Runnable {

        /* renamed from: a  reason: collision with root package name */
        final hy.k<? super T> f50844a;

        /* renamed from: b  reason: collision with root package name */
        final T f50845b;

        public a(hy.k<? super T> kVar, T t11) {
            this.f50844a = kVar;
            this.f50845b = t11;
        }

        @Override // ny.h
        public void clear() {
            lazySet(3);
        }

        @Override // iy.b
        public void dispose() {
            set(3);
        }

        @Override // iy.b
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // ny.h
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // ny.h
        public boolean offer(T t11) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // ny.h
        public T poll() {
            if (get() == 1) {
                lazySet(3);
                return this.f50845b;
            }
            return null;
        }

        @Override // ny.d
        public int requestFusion(int i11) {
            if ((i11 & 1) != 0) {
                lazySet(1);
                return 1;
            }
            return 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f50844a.b((T) this.f50845b);
                if (get() == 2) {
                    lazySet(3);
                    this.f50844a.onComplete();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b<T, R> extends hy.i<R> {

        /* renamed from: a  reason: collision with root package name */
        final T f50846a;

        /* renamed from: b  reason: collision with root package name */
        final ky.h<? super T, ? extends hy.j<? extends R>> f50847b;

        b(T t11, ky.h<? super T, ? extends hy.j<? extends R>> hVar) {
            this.f50846a = t11;
            this.f50847b = hVar;
        }

        @Override // hy.i
        public void L(hy.k<? super R> kVar) {
            try {
                hy.j<? extends R> apply = this.f50847b.apply((T) this.f50846a);
                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                hy.j<? extends R> jVar = apply;
                if (jVar instanceof ky.j) {
                    try {
                        Object obj = ((ky.j) jVar).get();
                        if (obj == null) {
                            ly.b.complete(kVar);
                            return;
                        }
                        a aVar = new a(kVar, obj);
                        kVar.a(aVar);
                        aVar.run();
                        return;
                    } catch (Throwable th2) {
                        jy.a.b(th2);
                        ly.b.error(th2, kVar);
                        return;
                    }
                }
                jVar.c(kVar);
            } catch (Throwable th3) {
                jy.a.b(th3);
                ly.b.error(th3, kVar);
            }
        }
    }

    public static <T, U> hy.i<U> a(T t11, ky.h<? super T, ? extends hy.j<? extends U>> hVar) {
        return az.a.n(new b(t11, hVar));
    }

    public static <T, R> boolean b(hy.j<T> jVar, hy.k<? super R> kVar, ky.h<? super T, ? extends hy.j<? extends R>> hVar) {
        if (jVar instanceof ky.j) {
            try {
                Object obj = (Object) ((ky.j) jVar).get();
                if (obj == 0) {
                    ly.b.complete(kVar);
                    return true;
                }
                try {
                    hy.j<? extends R> apply = hVar.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                    hy.j<? extends R> jVar2 = apply;
                    if (jVar2 instanceof ky.j) {
                        try {
                            Object obj2 = ((ky.j) jVar2).get();
                            if (obj2 == null) {
                                ly.b.complete(kVar);
                                return true;
                            }
                            a aVar = new a(kVar, obj2);
                            kVar.a(aVar);
                            aVar.run();
                        } catch (Throwable th2) {
                            jy.a.b(th2);
                            ly.b.error(th2, kVar);
                            return true;
                        }
                    } else {
                        jVar2.c(kVar);
                    }
                    return true;
                } catch (Throwable th3) {
                    jy.a.b(th3);
                    ly.b.error(th3, kVar);
                    return true;
                }
            } catch (Throwable th4) {
                jy.a.b(th4);
                ly.b.error(th4, kVar);
                return true;
            }
        }
        return false;
    }
}