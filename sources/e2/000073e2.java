package hy;

import io.reactivex.rxjava3.core.ObservableSource;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import sy.r;
import sy.s;
import sy.t;
import sy.u;
import sy.v;
import sy.w;

/* loaded from: classes5.dex */
public abstract class i<T> implements j<T> {

    /* loaded from: classes5.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29482a;

        static {
            int[] iArr = new int[hy.a.values().length];
            f29482a = iArr;
            try {
                iArr[hy.a.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29482a[hy.a.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29482a[hy.a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29482a[hy.a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static <T> i<T> Q(j<T> jVar) {
        Objects.requireNonNull(jVar, "source is null");
        if (jVar instanceof i) {
            return az.a.n((i) jVar);
        }
        return az.a.n(new sy.l(jVar));
    }

    public static int d() {
        return e.b();
    }

    public static <T1, T2, T3, R> i<R> e(j<? extends T1> jVar, j<? extends T2> jVar2, j<? extends T3> jVar3, ky.g<? super T1, ? super T2, ? super T3, ? extends R> gVar) {
        Objects.requireNonNull(jVar, "source1 is null");
        Objects.requireNonNull(jVar2, "source2 is null");
        Objects.requireNonNull(jVar3, "source3 is null");
        Objects.requireNonNull(gVar, "combiner is null");
        return g(new j[]{jVar, jVar2, jVar3}, my.a.f(gVar), d());
    }

    public static <T1, T2, R> i<R> f(j<? extends T1> jVar, j<? extends T2> jVar2, ky.c<? super T1, ? super T2, ? extends R> cVar) {
        Objects.requireNonNull(jVar, "source1 is null");
        Objects.requireNonNull(jVar2, "source2 is null");
        Objects.requireNonNull(cVar, "combiner is null");
        return g(new j[]{jVar, jVar2}, my.a.e(cVar), d());
    }

    public static <T, R> i<R> g(ObservableSource<? extends T>[] observableSourceArr, ky.h<? super Object[], ? extends R> hVar, int i11) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return r();
        }
        Objects.requireNonNull(hVar, "combiner is null");
        my.b.b(i11, "bufferSize");
        return az.a.n(new sy.b(observableSourceArr, null, hVar, i11 << 1, false));
    }

    @SafeVarargs
    public static <T> i<T> h(ObservableSource<? extends T>... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return r();
        }
        if (observableSourceArr.length == 1) {
            return Q(observableSourceArr[0]);
        }
        return az.a.n(new sy.c(x(observableSourceArr), my.a.c(), d(), yy.f.BOUNDARY));
    }

    private i<T> n(ky.f<? super T> fVar, ky.f<? super Throwable> fVar2, ky.a aVar, ky.a aVar2) {
        Objects.requireNonNull(fVar, "onNext is null");
        Objects.requireNonNull(fVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        Objects.requireNonNull(aVar2, "onAfterTerminate is null");
        return az.a.n(new sy.f(this, fVar, fVar2, aVar, aVar2));
    }

    public static <T> i<T> r() {
        return az.a.n(sy.h.f50787a);
    }

    @SafeVarargs
    public static <T> i<T> x(T... tArr) {
        Objects.requireNonNull(tArr, "items is null");
        if (tArr.length == 0) {
            return r();
        }
        if (tArr.length == 1) {
            return z(tArr[0]);
        }
        return az.a.n(new sy.k(tArr));
    }

    public static <T> i<T> z(T t11) {
        Objects.requireNonNull(t11, "item is null");
        return az.a.n(new sy.o(t11));
    }

    public final <R> i<R> A(ky.h<? super T, ? extends R> hVar) {
        Objects.requireNonNull(hVar, "mapper is null");
        return az.a.n(new sy.p(this, hVar));
    }

    public final i<T> B(l lVar) {
        return C(lVar, false, d());
    }

    public final i<T> C(l lVar, boolean z11, int i11) {
        Objects.requireNonNull(lVar, "scheduler is null");
        my.b.b(i11, "bufferSize");
        return az.a.n(new sy.q(this, lVar, z11, i11));
    }

    public final <R> i<R> D(R r11, ky.c<R, ? super T, R> cVar) {
        Objects.requireNonNull(r11, "initialValue is null");
        return E(my.a.d(r11), cVar);
    }

    public final <R> i<R> E(ky.j<R> jVar, ky.c<R, ? super T, R> cVar) {
        Objects.requireNonNull(jVar, "seedSupplier is null");
        Objects.requireNonNull(cVar, "accumulator is null");
        return az.a.n(new s(this, jVar, cVar));
    }

    public final g<T> F() {
        return az.a.m(new t(this));
    }

    public final m<T> G() {
        return az.a.o(new u(this, null));
    }

    public final i<T> H(T t11) {
        return h(z(t11), this);
    }

    public final iy.b I(ky.f<? super T> fVar) {
        return K(fVar, my.a.f39644e, my.a.f39642c);
    }

    public final iy.b J(ky.f<? super T> fVar, ky.f<? super Throwable> fVar2) {
        return K(fVar, fVar2, my.a.f39642c);
    }

    public final iy.b K(ky.f<? super T> fVar, ky.f<? super Throwable> fVar2, ky.a aVar) {
        Objects.requireNonNull(fVar, "onNext is null");
        Objects.requireNonNull(fVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        oy.k kVar = new oy.k(fVar, fVar2, aVar, my.a.b());
        c(kVar);
        return kVar;
    }

    protected abstract void L(k<? super T> kVar);

    public final i<T> M(l lVar) {
        Objects.requireNonNull(lVar, "scheduler is null");
        return az.a.n(new v(this, lVar));
    }

    public final <R> i<R> N(ky.h<? super T, ? extends j<? extends R>> hVar) {
        return O(hVar, d());
    }

    public final <R> i<R> O(ky.h<? super T, ? extends j<? extends R>> hVar, int i11) {
        Objects.requireNonNull(hVar, "mapper is null");
        my.b.b(i11, "bufferSize");
        if (this instanceof ny.f) {
            Object obj = ((ny.f) this).get();
            if (obj == null) {
                return r();
            }
            return r.a(obj, hVar);
        }
        return az.a.n(new w(this, hVar, i11, false));
    }

    public final e<T> P(hy.a aVar) {
        Objects.requireNonNull(aVar, "strategy is null");
        qy.h hVar = new qy.h(this);
        int i11 = a.f29482a[aVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return hVar.q();
                    }
                    return az.a.l(new qy.n(hVar));
                }
                return hVar;
            }
            return hVar.t();
        }
        return hVar.s();
    }

    @Override // hy.j
    public final void c(k<? super T> kVar) {
        Objects.requireNonNull(kVar, "observer is null");
        try {
            k<? super T> x11 = az.a.x(this, kVar);
            Objects.requireNonNull(x11, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            L(x11);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            jy.a.b(th2);
            az.a.r(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final i<T> i(long j11, TimeUnit timeUnit) {
        return j(j11, timeUnit, bz.a.a());
    }

    public final i<T> j(long j11, TimeUnit timeUnit, l lVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(lVar, "scheduler is null");
        return az.a.n(new sy.d(this, j11, timeUnit, lVar));
    }

    public final i<T> k() {
        return l(my.a.c());
    }

    public final <K> i<T> l(ky.h<? super T, K> hVar) {
        Objects.requireNonNull(hVar, "keySelector is null");
        return az.a.n(new sy.e(this, hVar, my.b.a()));
    }

    public final i<T> m(ky.a aVar) {
        return p(my.a.b(), aVar);
    }

    public final i<T> o(ky.f<? super Throwable> fVar) {
        ky.f<? super T> b11 = my.a.b();
        ky.a aVar = my.a.f39642c;
        return n(b11, fVar, aVar, aVar);
    }

    public final i<T> p(ky.f<? super iy.b> fVar, ky.a aVar) {
        Objects.requireNonNull(fVar, "onSubscribe is null");
        Objects.requireNonNull(aVar, "onDispose is null");
        return az.a.n(new sy.g(this, fVar, aVar));
    }

    public final i<T> q(ky.f<? super T> fVar) {
        ky.f<? super Throwable> b11 = my.a.b();
        ky.a aVar = my.a.f39642c;
        return n(fVar, b11, aVar, aVar);
    }

    public final i<T> s(ky.i<? super T> iVar) {
        Objects.requireNonNull(iVar, "predicate is null");
        return az.a.n(new sy.i(this, iVar));
    }

    public final <R> i<R> t(ky.h<? super T, ? extends j<? extends R>> hVar) {
        return u(hVar, false);
    }

    public final <R> i<R> u(ky.h<? super T, ? extends j<? extends R>> hVar, boolean z11) {
        return v(hVar, z11, Integer.MAX_VALUE);
    }

    public final <R> i<R> v(ky.h<? super T, ? extends j<? extends R>> hVar, boolean z11, int i11) {
        return w(hVar, z11, i11, d());
    }

    public final <R> i<R> w(ky.h<? super T, ? extends j<? extends R>> hVar, boolean z11, int i11, int i12) {
        Objects.requireNonNull(hVar, "mapper is null");
        my.b.b(i11, "maxConcurrency");
        my.b.b(i12, "bufferSize");
        if (this instanceof ny.f) {
            Object obj = ((ny.f) this).get();
            if (obj == null) {
                return r();
            }
            return r.a(obj, hVar);
        }
        return az.a.n(new sy.j(this, hVar, z11, i11, i12));
    }

    public final b y() {
        return az.a.k(new sy.n(this));
    }
}