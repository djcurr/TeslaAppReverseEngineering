package io.grpc.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class x1 {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f31321a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f31322b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f31323c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.common.base.y f31324d;

    /* renamed from: e  reason: collision with root package name */
    private long f31325e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f31326f;

    /* renamed from: g  reason: collision with root package name */
    private ScheduledFuture<?> f31327g;

    /* loaded from: classes5.dex */
    private final class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!x1.this.f31326f) {
                x1.this.f31327g = null;
                return;
            }
            long j11 = x1.this.j();
            if (x1.this.f31325e - j11 <= 0) {
                x1.this.f31326f = false;
                x1.this.f31327g = null;
                x1.this.f31323c.run();
                return;
            }
            x1 x1Var = x1.this;
            x1Var.f31327g = x1Var.f31321a.schedule(new c(), x1.this.f31325e - j11, TimeUnit.NANOSECONDS);
        }
    }

    /* loaded from: classes5.dex */
    private final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x1.this.f31322b.execute(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x1(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, com.google.common.base.y yVar) {
        this.f31323c = runnable;
        this.f31322b = executor;
        this.f31321a = scheduledExecutorService;
        this.f31324d = yVar;
        yVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long j() {
        return this.f31324d.d(TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(boolean z11) {
        ScheduledFuture<?> scheduledFuture;
        this.f31326f = false;
        if (!z11 || (scheduledFuture = this.f31327g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f31327g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(long j11, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j11);
        long j12 = j() + nanos;
        this.f31326f = true;
        if (j12 - this.f31325e < 0 || this.f31327g == null) {
            ScheduledFuture<?> scheduledFuture = this.f31327g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f31327g = this.f31321a.schedule(new c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f31325e = j12;
    }
}