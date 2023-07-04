package wy;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class e<T> extends AtomicReference<b80.c> implements hy.f<T>, b80.c, iy.b {

    /* renamed from: a  reason: collision with root package name */
    final ky.f<? super T> f56454a;

    /* renamed from: b  reason: collision with root package name */
    final ky.f<? super Throwable> f56455b;

    /* renamed from: c  reason: collision with root package name */
    final ky.a f56456c;

    /* renamed from: d  reason: collision with root package name */
    final ky.f<? super b80.c> f56457d;

    public e(ky.f<? super T> fVar, ky.f<? super Throwable> fVar2, ky.a aVar, ky.f<? super b80.c> fVar3) {
        this.f56454a = fVar;
        this.f56455b = fVar2;
        this.f56456c = aVar;
        this.f56457d = fVar3;
    }

    @Override // b80.b
    public void b(T t11) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f56454a.accept(t11);
        } catch (Throwable th2) {
            jy.a.b(th2);
            get().cancel();
            onError(th2);
        }
    }

    @Override // hy.f, b80.b
    public void c(b80.c cVar) {
        if (xy.e.setOnce(this, cVar)) {
            try {
                this.f56457d.accept(this);
            } catch (Throwable th2) {
                jy.a.b(th2);
                cVar.cancel();
                onError(th2);
            }
        }
    }

    @Override // b80.c
    public void cancel() {
        xy.e.cancel(this);
    }

    @Override // iy.b
    public void dispose() {
        cancel();
    }

    @Override // iy.b
    public boolean isDisposed() {
        return get() == xy.e.CANCELLED;
    }

    @Override // b80.b
    public void onComplete() {
        b80.c cVar = get();
        xy.e eVar = xy.e.CANCELLED;
        if (cVar != eVar) {
            lazySet(eVar);
            try {
                this.f56456c.run();
            } catch (Throwable th2) {
                jy.a.b(th2);
                az.a.r(th2);
            }
        }
    }

    @Override // b80.b
    public void onError(Throwable th2) {
        b80.c cVar = get();
        xy.e eVar = xy.e.CANCELLED;
        if (cVar != eVar) {
            lazySet(eVar);
            try {
                this.f56455b.accept(th2);
                return;
            } catch (Throwable th3) {
                jy.a.b(th3);
                az.a.r(new CompositeException(th2, th3));
                return;
            }
        }
        az.a.r(th2);
    }

    @Override // b80.c
    public void request(long j11) {
        get().request(j11);
    }
}