package hy;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class e<T> implements b80.a<T> {

    /* renamed from: a  reason: collision with root package name */
    static final int f29481a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    public static int b() {
        return f29481a;
    }

    private e<T> i(ky.f<? super T> fVar, ky.f<? super Throwable> fVar2, ky.a aVar, ky.a aVar2) {
        Objects.requireNonNull(fVar, "onNext is null");
        Objects.requireNonNull(fVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        Objects.requireNonNull(aVar2, "onAfterTerminate is null");
        return az.a.l(new qy.e(this, fVar, fVar2, aVar, aVar2));
    }

    public static <T> e<T> k() {
        return az.a.l(qy.f.f48741b);
    }

    public static <T> e<T> l(Iterable<? extends T> iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return az.a.l(new qy.g(iterable));
    }

    public static e<Long> m(long j11, long j12, TimeUnit timeUnit) {
        return n(j11, j12, timeUnit, bz.a.a());
    }

    public static e<Long> n(long j11, long j12, TimeUnit timeUnit, l lVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(lVar, "scheduler is null");
        return az.a.l(new qy.j(Math.max(0L, j11), Math.max(0L, j12), timeUnit, lVar));
    }

    public static e<Long> o(long j11, long j12, long j13, long j14, TimeUnit timeUnit) {
        return p(j11, j12, j13, j14, timeUnit, bz.a.a());
    }

    public static e<Long> p(long j11, long j12, long j13, long j14, TimeUnit timeUnit, l lVar) {
        int i11 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if (i11 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j12);
        } else if (i11 == 0) {
            return k().g(j13, timeUnit, lVar);
        } else {
            long j15 = j11 + (j12 - 1);
            if (j11 > 0 && j15 < 0) {
                throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
            }
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(lVar, "scheduler is null");
            return az.a.l(new qy.k(j11, j15, Math.max(0L, j13), Math.max(0L, j14), timeUnit, lVar));
        }
    }

    public final e<T> A(l lVar) {
        Objects.requireNonNull(lVar, "scheduler is null");
        return B(lVar, true);
    }

    public final e<T> B(l lVar, boolean z11) {
        Objects.requireNonNull(lVar, "scheduler is null");
        return az.a.l(new qy.q(this, lVar, z11));
    }

    @Override // b80.a
    public final void a(b80.b<? super T> bVar) {
        if (bVar instanceof f) {
            y((f) bVar);
            return;
        }
        Objects.requireNonNull(bVar, "subscriber is null");
        y(new wy.f(bVar));
    }

    public final <R> e<R> c(ky.h<? super T, ? extends b80.a<? extends R>> hVar, boolean z11) {
        return d(hVar, z11, b(), b());
    }

    public final <R> e<R> d(ky.h<? super T, ? extends b80.a<? extends R>> hVar, boolean z11, int i11, int i12) {
        Objects.requireNonNull(hVar, "mapper is null");
        my.b.b(i11, "maxConcurrency");
        my.b.b(i12, "prefetch");
        return az.a.l(new qy.c(this, hVar, i11, i12, z11 ? yy.f.END : yy.f.BOUNDARY));
    }

    public final <R> e<R> e(ky.h<? super T, ? extends q<? extends R>> hVar, boolean z11) {
        return f(hVar, z11, 2);
    }

    public final <R> e<R> f(ky.h<? super T, ? extends q<? extends R>> hVar, boolean z11, int i11) {
        Objects.requireNonNull(hVar, "mapper is null");
        my.b.b(i11, "prefetch");
        return az.a.l(new ry.b(this, hVar, z11 ? yy.f.END : yy.f.BOUNDARY, i11));
    }

    public final e<T> g(long j11, TimeUnit timeUnit, l lVar) {
        return h(j11, timeUnit, lVar, false);
    }

    public final e<T> h(long j11, TimeUnit timeUnit, l lVar, boolean z11) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(lVar, "scheduler is null");
        return az.a.l(new qy.d(this, Math.max(0L, j11), timeUnit, lVar, z11));
    }

    public final e<T> j(ky.a aVar) {
        return i(my.a.b(), my.a.a(aVar), aVar, my.a.f39642c);
    }

    public final e<T> q() {
        return r(b(), false, true);
    }

    public final e<T> r(int i11, boolean z11, boolean z12) {
        my.b.b(i11, "capacity");
        return az.a.l(new qy.l(this, i11, z12, z11, my.a.f39642c));
    }

    public final e<T> s() {
        return az.a.l(new qy.m(this));
    }

    public final e<T> t() {
        return az.a.l(new qy.o(this));
    }

    public final <R> m<R> u(R r11, ky.c<R, ? super T, R> cVar) {
        Objects.requireNonNull(r11, "seed is null");
        Objects.requireNonNull(cVar, "reducer is null");
        return az.a.o(new qy.p(this, r11, cVar));
    }

    public final iy.b v() {
        return x(my.a.b(), my.a.f39644e, my.a.f39642c);
    }

    public final iy.b w(ky.f<? super T> fVar) {
        return x(fVar, my.a.f39644e, my.a.f39642c);
    }

    public final iy.b x(ky.f<? super T> fVar, ky.f<? super Throwable> fVar2, ky.a aVar) {
        Objects.requireNonNull(fVar, "onNext is null");
        Objects.requireNonNull(fVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        wy.e eVar = new wy.e(fVar, fVar2, aVar, qy.i.INSTANCE);
        y(eVar);
        return eVar;
    }

    public final void y(f<? super T> fVar) {
        Objects.requireNonNull(fVar, "subscriber is null");
        try {
            b80.b<? super T> v11 = az.a.v(this, fVar);
            Objects.requireNonNull(v11, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            z(v11);
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

    protected abstract void z(b80.b<? super T> bVar);
}