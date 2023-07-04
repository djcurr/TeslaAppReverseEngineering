package hy;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class b implements d {
    public static b d() {
        return az.a.k(py.a.f47006a);
    }

    public static b e(Callable<?> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return az.a.k(new py.b(callable));
    }

    public static b j(long j11, TimeUnit timeUnit) {
        return k(j11, timeUnit, bz.a.a());
    }

    public static b k(long j11, TimeUnit timeUnit, l lVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(lVar, "scheduler is null");
        return az.a.k(new py.e(j11, timeUnit, lVar));
    }

    private static NullPointerException l(Throwable th2) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th2);
        return nullPointerException;
    }

    @Override // hy.d
    public final void b(c cVar) {
        Objects.requireNonNull(cVar, "observer is null");
        try {
            c w11 = az.a.w(this, cVar);
            Objects.requireNonNull(w11, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            h(w11);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            jy.a.b(th2);
            az.a.r(th2);
            throw l(th2);
        }
    }

    public final <T> m<T> c(q<T> qVar) {
        Objects.requireNonNull(qVar, "next is null");
        return az.a.o(new ty.b(qVar, this));
    }

    public final iy.b f() {
        oy.j jVar = new oy.j();
        b(jVar);
        return jVar;
    }

    public final iy.b g(ky.a aVar) {
        Objects.requireNonNull(aVar, "onComplete is null");
        oy.f fVar = new oy.f(aVar);
        b(fVar);
        return fVar;
    }

    protected abstract void h(c cVar);

    public final b i(l lVar) {
        Objects.requireNonNull(lVar, "scheduler is null");
        return az.a.k(new py.d(this, lVar));
    }
}