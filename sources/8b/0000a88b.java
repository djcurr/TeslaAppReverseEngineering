package oy;

import hy.o;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class d<T> extends AtomicReference<iy.b> implements o<T>, iy.b {

    /* renamed from: a  reason: collision with root package name */
    final ky.b<? super T, ? super Throwable> f45207a;

    public d(ky.b<? super T, ? super Throwable> bVar) {
        this.f45207a = bVar;
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
        try {
            lazySet(ly.a.DISPOSED);
            this.f45207a.accept(null, th2);
        } catch (Throwable th3) {
            jy.a.b(th3);
            az.a.r(new CompositeException(th2, th3));
        }
    }

    @Override // hy.o
    public void onSuccess(T t11) {
        try {
            lazySet(ly.a.DISPOSED);
            this.f45207a.accept(t11, null);
        } catch (Throwable th2) {
            jy.a.b(th2);
            az.a.r(th2);
        }
    }
}