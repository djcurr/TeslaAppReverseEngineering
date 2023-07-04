package io.sentry;

import java.io.Closeable;

/* loaded from: classes5.dex */
public final class s3 implements m0, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Runtime f32608a;

    /* renamed from: b  reason: collision with root package name */
    private Thread f32609b;

    public s3(Runtime runtime) {
        this.f32608a = (Runtime) rz.j.a(runtime, "Runtime is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(c0 c0Var, g3 g3Var) {
        c0Var.d(g3Var.getFlushTimeoutMillis());
    }

    @Override // io.sentry.m0
    public void a(final c0 c0Var, final g3 g3Var) {
        rz.j.a(c0Var, "Hub is required");
        rz.j.a(g3Var, "SentryOptions is required");
        if (g3Var.isEnableShutdownHook()) {
            Thread thread = new Thread(new Runnable() { // from class: io.sentry.r3
                @Override // java.lang.Runnable
                public final void run() {
                    s3.j(c0.this, g3Var);
                }
            });
            this.f32609b = thread;
            this.f32608a.addShutdownHook(thread);
            g3Var.getLogger().c(f3.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            return;
        }
        g3Var.getLogger().c(f3.INFO, "enableShutdownHook is disabled.", new Object[0]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Thread thread = this.f32609b;
        if (thread != null) {
            this.f32608a.removeShutdownHook(thread);
        }
    }

    public s3() {
        this(Runtime.getRuntime());
    }
}