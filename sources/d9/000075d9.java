package io.grpc;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class h1 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f30585a;

    /* renamed from: b  reason: collision with root package name */
    private final Queue<Runnable> f30586b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<Thread> f30587c = new AtomicReference<>();

    /* loaded from: classes5.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f30588a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f30589b;

        a(b bVar, Runnable runnable) {
            this.f30588a = bVar;
            this.f30589b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            h1.this.execute(this.f30588a);
        }

        public String toString() {
            return this.f30589b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final Runnable f30591a;

        /* renamed from: b  reason: collision with root package name */
        boolean f30592b;

        /* renamed from: c  reason: collision with root package name */
        boolean f30593c;

        b(Runnable runnable) {
            this.f30591a = (Runnable) com.google.common.base.u.p(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f30592b) {
                return;
            }
            this.f30593c = true;
            this.f30591a.run();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final b f30594a;

        /* renamed from: b  reason: collision with root package name */
        private final ScheduledFuture<?> f30595b;

        /* synthetic */ c(b bVar, ScheduledFuture scheduledFuture, a aVar) {
            this(bVar, scheduledFuture);
        }

        public void a() {
            this.f30594a.f30592b = true;
            this.f30595b.cancel(false);
        }

        public boolean b() {
            b bVar = this.f30594a;
            return (bVar.f30593c || bVar.f30592b) ? false : true;
        }

        private c(b bVar, ScheduledFuture<?> scheduledFuture) {
            this.f30594a = (b) com.google.common.base.u.p(bVar, "runnable");
            this.f30595b = (ScheduledFuture) com.google.common.base.u.p(scheduledFuture, "future");
        }
    }

    public h1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f30585a = (Thread.UncaughtExceptionHandler) com.google.common.base.u.p(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void a() {
        while (this.f30587c.compareAndSet(null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable poll = this.f30586b.poll();
                    if (poll != null) {
                        poll.run();
                    } else {
                        this.f30587c.set(null);
                        if (this.f30586b.isEmpty()) {
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    this.f30587c.set(null);
                    throw th2;
                }
            }
        }
    }

    public final void b(Runnable runnable) {
        this.f30586b.add((Runnable) com.google.common.base.u.p(runnable, "runnable is null"));
    }

    public final c c(Runnable runnable, long j11, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        b bVar = new b(runnable);
        return new c(bVar, scheduledExecutorService.schedule(new a(bVar, runnable), j11, timeUnit), null);
    }

    public void d() {
        com.google.common.base.u.v(Thread.currentThread() == this.f30587c.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}