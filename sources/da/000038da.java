package com.google.firebase.crashlytics.internal.common;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16593a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicLong f16594b;

        /* renamed from: com.google.firebase.crashlytics.internal.common.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0303a extends c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f16595a;

            C0303a(a aVar, Runnable runnable) {
                this.f16595a = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.c
            public void a() {
                this.f16595a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f16593a = str;
            this.f16594b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0303a(this, runnable));
            newThread.setName(this.f16593a + this.f16594b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f16596a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExecutorService f16597b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f16598c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TimeUnit f16599d;

        b(String str, ExecutorService executorService, long j11, TimeUnit timeUnit) {
            this.f16596a = str;
            this.f16597b = executorService;
            this.f16598c = j11;
            this.f16599d = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.internal.common.c
        public void a() {
            try {
                wl.f f11 = wl.f.f();
                f11.b("Executing shutdown hook for " + this.f16596a);
                this.f16597b.shutdown();
                if (this.f16597b.awaitTermination(this.f16598c, this.f16599d)) {
                    return;
                }
                wl.f f12 = wl.f.f();
                f12.b(this.f16596a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f16597b.shutdownNow();
            } catch (InterruptedException unused) {
                wl.f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f16596a));
                this.f16597b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j11, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        b bVar = new b(str, executorService, j11, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e11 = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e11);
        return e11;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}