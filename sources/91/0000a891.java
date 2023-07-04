package oy;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class j extends AtomicReference<iy.b> implements hy.c, iy.b {
    @Override // hy.c
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

    @Override // hy.c, hy.h
    public void onComplete() {
        lazySet(ly.a.DISPOSED);
    }

    @Override // hy.c
    public void onError(Throwable th2) {
        lazySet(ly.a.DISPOSED);
        az.a.r(new OnErrorNotImplementedException(th2));
    }
}