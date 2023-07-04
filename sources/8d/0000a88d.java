package oy;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class f extends AtomicReference<iy.b> implements hy.c, iy.b, ky.f<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    final ky.f<? super Throwable> f45212a = this;

    /* renamed from: b  reason: collision with root package name */
    final ky.a f45213b;

    public f(ky.a aVar) {
        this.f45213b = aVar;
    }

    @Override // hy.c
    public void a(iy.b bVar) {
        ly.a.setOnce(this, bVar);
    }

    @Override // ky.f
    /* renamed from: b */
    public void accept(Throwable th2) {
        az.a.r(new OnErrorNotImplementedException(th2));
    }

    @Override // iy.b
    public void dispose() {
        ly.a.dispose(this);
    }

    @Override // iy.b
    public boolean isDisposed() {
        return get() == ly.a.DISPOSED;
    }

    @Override // hy.c, hy.h
    public void onComplete() {
        try {
            this.f45213b.run();
        } catch (Throwable th2) {
            jy.a.b(th2);
            az.a.r(th2);
        }
        lazySet(ly.a.DISPOSED);
    }

    @Override // hy.c
    public void onError(Throwable th2) {
        try {
            this.f45212a.accept(th2);
        } catch (Throwable th3) {
            jy.a.b(th3);
            az.a.r(th3);
        }
        lazySet(ly.a.DISPOSED);
    }
}