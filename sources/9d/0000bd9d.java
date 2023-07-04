package wy;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import yy.h;

/* loaded from: classes5.dex */
public class f<T> extends AtomicInteger implements hy.f<T>, b80.c {

    /* renamed from: a  reason: collision with root package name */
    final b80.b<? super T> f56458a;

    /* renamed from: b  reason: collision with root package name */
    final yy.b f56459b = new yy.b();

    /* renamed from: c  reason: collision with root package name */
    final AtomicLong f56460c = new AtomicLong();

    /* renamed from: d  reason: collision with root package name */
    final AtomicReference<b80.c> f56461d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    final AtomicBoolean f56462e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f56463f;

    public f(b80.b<? super T> bVar) {
        this.f56458a = bVar;
    }

    @Override // b80.b
    public void b(T t11) {
        h.c(this.f56458a, t11, this, this.f56459b);
    }

    @Override // hy.f, b80.b
    public void c(b80.c cVar) {
        if (this.f56462e.compareAndSet(false, true)) {
            this.f56458a.c(this);
            xy.e.deferredSetOnce(this.f56461d, this.f56460c, cVar);
            return;
        }
        cVar.cancel();
        cancel();
        onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    @Override // b80.c
    public void cancel() {
        if (this.f56463f) {
            return;
        }
        xy.e.cancel(this.f56461d);
    }

    @Override // b80.b
    public void onComplete() {
        this.f56463f = true;
        h.a(this.f56458a, this, this.f56459b);
    }

    @Override // b80.b
    public void onError(Throwable th2) {
        this.f56463f = true;
        h.b(this.f56458a, th2, this, this.f56459b);
    }

    @Override // b80.c
    public void request(long j11) {
        if (j11 <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j11));
            return;
        }
        xy.e.deferredRequest(this.f56461d, this.f56460c, j11);
    }
}