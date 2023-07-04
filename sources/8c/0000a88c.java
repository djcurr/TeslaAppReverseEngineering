package oy;

import hy.o;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes5.dex */
public final class e<T> extends CountDownLatch implements o<T>, hy.c, hy.h<T> {

    /* renamed from: a  reason: collision with root package name */
    T f45208a;

    /* renamed from: b  reason: collision with root package name */
    Throwable f45209b;

    /* renamed from: c  reason: collision with root package name */
    iy.b f45210c;

    /* renamed from: d  reason: collision with root package name */
    volatile boolean f45211d;

    public e() {
        super(1);
    }

    @Override // hy.o
    public void a(iy.b bVar) {
        this.f45210c = bVar;
        if (this.f45211d) {
            bVar.dispose();
        }
    }

    public T b() {
        if (getCount() != 0) {
            try {
                yy.d.a();
                await();
            } catch (InterruptedException e11) {
                c();
                throw yy.g.h(e11);
            }
        }
        Throwable th2 = this.f45209b;
        if (th2 == null) {
            return this.f45208a;
        }
        throw yy.g.h(th2);
    }

    void c() {
        this.f45211d = true;
        iy.b bVar = this.f45210c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // hy.c, hy.h
    public void onComplete() {
        countDown();
    }

    @Override // hy.o
    public void onError(Throwable th2) {
        this.f45209b = th2;
        countDown();
    }

    @Override // hy.o
    public void onSuccess(T t11) {
        this.f45208a = t11;
        countDown();
    }
}