package qz;

import io.sentry.d0;
import io.sentry.f3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
final class v extends ThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    private final int f48847a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f48848b;

    /* renamed from: c  reason: collision with root package name */
    private final z f48849c;

    /* loaded from: classes5.dex */
    static final class a<T> implements Future<T> {
        a() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public T get(long j11, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    public v(int i11, int i12, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, d0 d0Var) {
        super(i11, i11, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f48849c = new z();
        this.f48847a = i12;
        this.f48848b = d0Var;
    }

    private boolean a() {
        return this.f48849c.b() < this.f48847a;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th2) {
        try {
            super.afterExecute(runnable, th2);
        } finally {
            this.f48849c.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(long j11) {
        try {
            this.f48849c.d(j11, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            this.f48848b.b(f3.ERROR, "Failed to wait till idle", e11);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        if (a()) {
            this.f48849c.c();
            return super.submit(runnable);
        }
        this.f48848b.c(f3.WARNING, "Submit cancelled", new Object[0]);
        return new a();
    }
}