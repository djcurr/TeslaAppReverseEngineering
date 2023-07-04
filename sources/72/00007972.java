package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import io.sentry.g4;
import java.io.Closeable;
import java.lang.Thread;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class h4 implements m0, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f32278a;

    /* renamed from: b  reason: collision with root package name */
    private c0 f32279b;

    /* renamed from: c  reason: collision with root package name */
    private g3 f32280c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f32281d;

    /* renamed from: e  reason: collision with root package name */
    private final g4 f32282e;

    /* loaded from: classes5.dex */
    private static final class a implements oz.c, oz.d, oz.g {

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f32283a = new CountDownLatch(1);

        /* renamed from: b  reason: collision with root package name */
        private final long f32284b;

        /* renamed from: c  reason: collision with root package name */
        private final d0 f32285c;

        a(long j11, d0 d0Var) {
            this.f32284b = j11;
            this.f32285c = d0Var;
        }

        @Override // oz.c
        public void a() {
            this.f32283a.countDown();
        }

        @Override // oz.d
        public boolean d() {
            try {
                return this.f32283a.await(this.f32284b, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                this.f32285c.b(f3.ERROR, "Exception while awaiting for flush in UncaughtExceptionHint", e11);
                return false;
            }
        }
    }

    public h4() {
        this(g4.a.c());
    }

    static Throwable g(Thread thread, Throwable th2) {
        io.sentry.protocol.h hVar = new io.sentry.protocol.h();
        hVar.i(Boolean.FALSE);
        hVar.j("UncaughtExceptionHandler");
        return new ExceptionMechanismException(hVar, th2, thread);
    }

    @Override // io.sentry.m0
    public final void a(c0 c0Var, g3 g3Var) {
        if (this.f32281d) {
            g3Var.getLogger().c(f3.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f32281d = true;
        this.f32279b = (c0) rz.j.a(c0Var, "Hub is required");
        g3 g3Var2 = (g3) rz.j.a(g3Var, "SentryOptions is required");
        this.f32280c = g3Var2;
        d0 logger = g3Var2.getLogger();
        f3 f3Var = f3.DEBUG;
        logger.c(f3Var, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f32280c.isEnableUncaughtExceptionHandler()));
        if (this.f32280c.isEnableUncaughtExceptionHandler()) {
            Thread.UncaughtExceptionHandler b11 = this.f32282e.b();
            if (b11 != null) {
                d0 logger2 = this.f32280c.getLogger();
                logger2.c(f3Var, "default UncaughtExceptionHandler class='" + b11.getClass().getName() + "'", new Object[0]);
                this.f32278a = b11;
            }
            this.f32282e.a(this);
            this.f32280c.getLogger().c(f3Var, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this == this.f32282e.b()) {
            this.f32282e.a(this.f32278a);
            g3 g3Var = this.f32280c;
            if (g3Var != null) {
                g3Var.getLogger().c(f3.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        g3 g3Var = this.f32280c;
        if (g3Var == null || this.f32279b == null) {
            return;
        }
        g3Var.getLogger().c(f3.INFO, "Uncaught exception received.", new Object[0]);
        try {
            a aVar = new a(this.f32280c.getFlushTimeoutMillis(), this.f32280c.getLogger());
            b3 b3Var = new b3(g(thread, th2));
            b3Var.w0(f3.FATAL);
            this.f32279b.o(b3Var, rz.h.e(aVar));
            if (!aVar.d()) {
                this.f32280c.getLogger().c(f3.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", b3Var.E());
            }
        } catch (Throwable th3) {
            this.f32280c.getLogger().b(f3.ERROR, "Error sending uncaught exception to Sentry.", th3);
        }
        if (this.f32278a != null) {
            this.f32280c.getLogger().c(f3.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f32278a.uncaughtException(thread, th2);
        } else if (this.f32280c.isPrintUncaughtStackTrace()) {
            th2.printStackTrace();
        }
    }

    h4(g4 g4Var) {
        this.f32281d = false;
        this.f32282e = (g4) rz.j.a(g4Var, "threadAdapter is required.");
    }
}