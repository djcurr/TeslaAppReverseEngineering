package oy;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class k<T> extends AtomicReference<iy.b> implements hy.k<T>, iy.b {

    /* renamed from: a  reason: collision with root package name */
    final ky.f<? super T> f45222a;

    /* renamed from: b  reason: collision with root package name */
    final ky.f<? super Throwable> f45223b;

    /* renamed from: c  reason: collision with root package name */
    final ky.a f45224c;

    /* renamed from: d  reason: collision with root package name */
    final ky.f<? super iy.b> f45225d;

    public k(ky.f<? super T> fVar, ky.f<? super Throwable> fVar2, ky.a aVar, ky.f<? super iy.b> fVar3) {
        this.f45222a = fVar;
        this.f45223b = fVar2;
        this.f45224c = aVar;
        this.f45225d = fVar3;
    }

    @Override // hy.k
    public void a(iy.b bVar) {
        if (ly.a.setOnce(this, bVar)) {
            try {
                this.f45225d.accept(this);
            } catch (Throwable th2) {
                jy.a.b(th2);
                bVar.dispose();
                onError(th2);
            }
        }
    }

    @Override // hy.k
    public void b(T t11) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f45222a.accept(t11);
        } catch (Throwable th2) {
            jy.a.b(th2);
            get().dispose();
            onError(th2);
        }
    }

    @Override // iy.b
    public void dispose() {
        ly.a.dispose(this);
    }

    @Override // iy.b
    public boolean isDisposed() {
        return get() == ly.a.DISPOSED;
    }

    @Override // hy.k
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(ly.a.DISPOSED);
        try {
            this.f45224c.run();
        } catch (Throwable th2) {
            jy.a.b(th2);
            az.a.r(th2);
        }
    }

    @Override // hy.k
    public void onError(Throwable th2) {
        if (!isDisposed()) {
            lazySet(ly.a.DISPOSED);
            try {
                this.f45223b.accept(th2);
                return;
            } catch (Throwable th3) {
                jy.a.b(th3);
                az.a.r(new CompositeException(th2, th3));
                return;
            }
        }
        az.a.r(th2);
    }
}