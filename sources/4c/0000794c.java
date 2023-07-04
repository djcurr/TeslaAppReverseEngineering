package io.sentry;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
final class d3 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f32245a;

    d3(ScheduledExecutorService scheduledExecutorService) {
        this.f32245a = scheduledExecutorService;
    }

    @Override // io.sentry.g0
    public void a(long j11) {
        synchronized (this.f32245a) {
            if (!this.f32245a.isShutdown()) {
                this.f32245a.shutdown();
                try {
                    if (!this.f32245a.awaitTermination(j11, TimeUnit.MILLISECONDS)) {
                        this.f32245a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f32245a.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // io.sentry.g0
    public Future<?> b(Runnable runnable, long j11) {
        return this.f32245a.schedule(runnable, j11, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.g0
    public Future<?> submit(Runnable runnable) {
        return this.f32245a.submit(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d3() {
        this(Executors.newSingleThreadScheduledExecutor());
    }
}