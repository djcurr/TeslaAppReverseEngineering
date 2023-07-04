package hy;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import ty.r;

/* loaded from: classes5.dex */
public abstract class m<T> implements q<T> {
    public static <T> e<T> c(Iterable<? extends q<? extends T>> iterable) {
        return e.l(iterable).e(my.a.c(), false);
    }

    public static <T> e<T> d(Iterable<? extends q<? extends T>> iterable) {
        return e.l(iterable).c(ty.i.a(), true);
    }

    public static <T> m<T> e(p<T> pVar) {
        Objects.requireNonNull(pVar, "source is null");
        return az.a.o(new ty.a(pVar));
    }

    public static <T> m<T> i(Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return j(my.a.d(th2));
    }

    public static <T> m<T> j(ky.j<? extends Throwable> jVar) {
        Objects.requireNonNull(jVar, "supplier is null");
        return az.a.o(new ty.f(jVar));
    }

    public static <T> m<T> l(Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return az.a.o(new ty.h(callable));
    }

    public static <T> m<T> n(T t11) {
        Objects.requireNonNull(t11, "item is null");
        return az.a.o(new ty.j(t11));
    }

    private m<T> y(long j11, TimeUnit timeUnit, l lVar, q<? extends T> qVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(lVar, "scheduler is null");
        return az.a.o(new ty.p(this, j11, timeUnit, lVar, qVar));
    }

    @Override // hy.q
    public final void a(o<? super T> oVar) {
        Objects.requireNonNull(oVar, "observer is null");
        o<? super T> y11 = az.a.y(this, oVar);
        Objects.requireNonNull(y11, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            v(y11);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            jy.a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final T b() {
        oy.e eVar = new oy.e();
        a(eVar);
        return (T) eVar.b();
    }

    public final m<T> f(ky.f<? super Throwable> fVar) {
        Objects.requireNonNull(fVar, "onError is null");
        return az.a.o(new ty.c(this, fVar));
    }

    public final m<T> g(ky.f<? super T> fVar) {
        Objects.requireNonNull(fVar, "onSuccess is null");
        return az.a.o(new ty.d(this, fVar));
    }

    public final m<T> h(ky.a aVar) {
        Objects.requireNonNull(aVar, "onTerminate is null");
        return az.a.o(new ty.e(this, aVar));
    }

    public final <R> m<R> k(ky.h<? super T, ? extends q<? extends R>> hVar) {
        Objects.requireNonNull(hVar, "mapper is null");
        return az.a.o(new ty.g(this, hVar));
    }

    public final b m() {
        return az.a.k(new py.c(this));
    }

    public final <R> m<R> o(ky.h<? super T, ? extends R> hVar) {
        Objects.requireNonNull(hVar, "mapper is null");
        return az.a.o(new ty.k(this, hVar));
    }

    public final m<T> p(l lVar) {
        Objects.requireNonNull(lVar, "scheduler is null");
        return az.a.o(new ty.l(this, lVar));
    }

    public final m<T> q(ky.h<? super Throwable, ? extends q<? extends T>> hVar) {
        Objects.requireNonNull(hVar, "fallbackSupplier is null");
        return az.a.o(new ty.n(this, hVar));
    }

    public final m<T> r(ky.h<Throwable, ? extends T> hVar) {
        Objects.requireNonNull(hVar, "itemSupplier is null");
        return az.a.o(new ty.m(this, hVar, null));
    }

    public final iy.b s() {
        return u(my.a.b(), my.a.f39644e);
    }

    public final iy.b t(ky.b<? super T, ? super Throwable> bVar) {
        Objects.requireNonNull(bVar, "onCallback is null");
        oy.d dVar = new oy.d(bVar);
        a(dVar);
        return dVar;
    }

    public final iy.b u(ky.f<? super T> fVar, ky.f<? super Throwable> fVar2) {
        Objects.requireNonNull(fVar, "onSuccess is null");
        Objects.requireNonNull(fVar2, "onError is null");
        oy.g gVar = new oy.g(fVar, fVar2);
        a(gVar);
        return gVar;
    }

    protected abstract void v(o<? super T> oVar);

    public final m<T> w(l lVar) {
        Objects.requireNonNull(lVar, "scheduler is null");
        return az.a.o(new ty.o(this, lVar));
    }

    public final m<T> x(long j11, TimeUnit timeUnit) {
        return y(j11, timeUnit, bz.a.a(), null);
    }

    public final i<T> z() {
        if (this instanceof ny.b) {
            return ((ny.b) this).a();
        }
        return az.a.n(new r(this));
    }
}