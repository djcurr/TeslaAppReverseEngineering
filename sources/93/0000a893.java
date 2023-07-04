package oy;

import hy.o;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class l<T> implements o<T> {

    /* renamed from: a  reason: collision with root package name */
    final AtomicReference<iy.b> f45226a;

    /* renamed from: b  reason: collision with root package name */
    final o<? super T> f45227b;

    public l(AtomicReference<iy.b> atomicReference, o<? super T> oVar) {
        this.f45226a = atomicReference;
        this.f45227b = oVar;
    }

    @Override // hy.o
    public void a(iy.b bVar) {
        ly.a.replace(this.f45226a, bVar);
    }

    @Override // hy.o
    public void onError(Throwable th2) {
        this.f45227b.onError(th2);
    }

    @Override // hy.o
    public void onSuccess(T t11) {
        this.f45227b.onSuccess(t11);
    }
}