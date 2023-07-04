package oy;

import hy.o;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class g<T> extends AtomicReference<iy.b> implements o<T>, iy.b {

    /* renamed from: a  reason: collision with root package name */
    final ky.f<? super T> f45214a;

    /* renamed from: b  reason: collision with root package name */
    final ky.f<? super Throwable> f45215b;

    public g(ky.f<? super T> fVar, ky.f<? super Throwable> fVar2) {
        this.f45214a = fVar;
        this.f45215b = fVar2;
    }

    @Override // hy.o
    public void a(iy.b bVar) {
        ly.a.setOnce(this, bVar);
    }

    @Override // iy.b
    public void dispose() {
        ly.a.dispose(this);
    }

    @Override // iy.b
    public boolean isDisposed() {
        return get() == ly.a.DISPOSED;
    }

    @Override // hy.o
    public void onError(Throwable th2) {
        lazySet(ly.a.DISPOSED);
        try {
            this.f45215b.accept(th2);
        } catch (Throwable th3) {
            jy.a.b(th3);
            az.a.r(new CompositeException(th2, th3));
        }
    }

    @Override // hy.o
    public void onSuccess(T t11) {
        lazySet(ly.a.DISPOSED);
        try {
            this.f45214a.accept(t11);
        } catch (Throwable th2) {
            jy.a.b(th2);
            az.a.r(th2);
        }
    }
}