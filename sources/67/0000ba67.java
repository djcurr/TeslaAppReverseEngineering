package vy;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class e implements Callable<Void>, iy.b {

    /* renamed from: f  reason: collision with root package name */
    static final FutureTask<Void> f54690f = new FutureTask<>(my.a.f39641b, null);

    /* renamed from: a  reason: collision with root package name */
    final Runnable f54691a;

    /* renamed from: d  reason: collision with root package name */
    final ExecutorService f54694d;

    /* renamed from: e  reason: collision with root package name */
    Thread f54695e;

    /* renamed from: c  reason: collision with root package name */
    final AtomicReference<Future<?>> f54693c = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    final AtomicReference<Future<?>> f54692b = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Runnable runnable, ExecutorService executorService) {
        this.f54691a = runnable;
        this.f54694d = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public Void call() {
        this.f54695e = Thread.currentThread();
        try {
            this.f54691a.run();
            this.f54695e = null;
            c(this.f54694d.submit(this));
            return null;
        } catch (Throwable th2) {
            this.f54695e = null;
            az.a.r(th2);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f54693c.get();
            if (future2 == f54690f) {
                future.cancel(this.f54695e != Thread.currentThread());
                return;
            }
        } while (!this.f54693c.compareAndSet(future2, future));
    }

    void c(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.f54692b.get();
            if (future2 == f54690f) {
                future.cancel(this.f54695e != Thread.currentThread());
                return;
            }
        } while (!this.f54692b.compareAndSet(future2, future));
    }

    @Override // iy.b
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f54693c;
        FutureTask<Void> futureTask = f54690f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f54695e != Thread.currentThread());
        }
        Future<?> andSet2 = this.f54692b.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f54695e != Thread.currentThread());
    }

    @Override // iy.b
    public boolean isDisposed() {
        return this.f54693c.get() == f54690f;
    }
}