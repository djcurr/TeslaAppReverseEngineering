package io.sentry.android.core;

import io.sentry.f3;
import io.sentry.g3;
import io.sentry.o1;
import java.io.Closeable;

/* loaded from: classes5.dex */
public abstract class f0 implements io.sentry.m0, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private e0 f32079a;

    /* renamed from: b  reason: collision with root package name */
    private io.sentry.d0 f32080b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b extends f0 {
        private b() {
        }

        @Override // io.sentry.android.core.f0
        protected String j(g3 g3Var) {
            return g3Var.getOutboxPath();
        }
    }

    public static f0 g() {
        return new b();
    }

    @Override // io.sentry.m0
    public final void a(io.sentry.c0 c0Var, g3 g3Var) {
        rz.j.a(c0Var, "Hub is required");
        rz.j.a(g3Var, "SentryOptions is required");
        this.f32080b = g3Var.getLogger();
        String j11 = j(g3Var);
        if (j11 == null) {
            this.f32080b.c(f3.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        io.sentry.d0 d0Var = this.f32080b;
        f3 f3Var = f3.DEBUG;
        d0Var.c(f3Var, "Registering EnvelopeFileObserverIntegration for path: %s", j11);
        e0 e0Var = new e0(j11, new o1(c0Var, g3Var.getEnvelopeReader(), g3Var.getSerializer(), this.f32080b, g3Var.getFlushTimeoutMillis()), this.f32080b, g3Var.getFlushTimeoutMillis());
        this.f32079a = e0Var;
        try {
            e0Var.startWatching();
            this.f32080b.c(f3Var, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th2) {
            g3Var.getLogger().b(f3.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e0 e0Var = this.f32079a;
        if (e0Var != null) {
            e0Var.stopWatching();
            io.sentry.d0 d0Var = this.f32080b;
            if (d0Var != null) {
                d0Var.c(f3.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
            }
        }
    }

    abstract String j(g3 g3Var);
}