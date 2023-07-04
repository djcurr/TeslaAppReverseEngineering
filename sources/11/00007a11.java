package io.sentry;

import io.sentry.x1;
import java.io.File;

/* loaded from: classes5.dex */
public final class x1 implements m0 {

    /* renamed from: a */
    private final c f32704a;

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes5.dex */
    public interface b {
        String a();
    }

    /* loaded from: classes5.dex */
    public interface c {
        static /* synthetic */ void b(d0 d0Var, String str, j jVar, File file) {
            c(d0Var, str, jVar, file);
        }

        static /* synthetic */ void c(d0 d0Var, String str, j jVar, File file) {
            f3 f3Var = f3.DEBUG;
            d0Var.c(f3Var, "Started processing cached files from %s", str);
            jVar.e(file);
            d0Var.c(f3Var, "Finished processing cached files from %s", str);
        }

        default a a(final j jVar, final String str, final d0 d0Var) {
            final File file = new File(str);
            return new a() { // from class: io.sentry.y1
                @Override // io.sentry.x1.a
                public final void a() {
                    x1.c.b(d0.this, str, jVar, file);
                }
            };
        }

        a d(c0 c0Var, g3 g3Var);

        default boolean e(String str, d0 d0Var) {
            if (str == null) {
                d0Var.c(f3.INFO, "No cached dir path is defined in options.", new Object[0]);
                return false;
            }
            return true;
        }
    }

    public x1(c cVar) {
        this.f32704a = (c) rz.j.a(cVar, "SendFireAndForgetFactory is required");
    }

    public static /* synthetic */ void c(a aVar, g3 g3Var) {
        try {
            aVar.a();
        } catch (Throwable th2) {
            g3Var.getLogger().b(f3.ERROR, "Failed trying to send cached events.", th2);
        }
    }

    @Override // io.sentry.m0
    public final void a(c0 c0Var, final g3 g3Var) {
        rz.j.a(c0Var, "Hub is required");
        rz.j.a(g3Var, "SentryOptions is required");
        if (!this.f32704a.e(g3Var.getCacheDirPath(), g3Var.getLogger())) {
            g3Var.getLogger().c(f3.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return;
        }
        final a d11 = this.f32704a.d(c0Var, g3Var);
        if (d11 == null) {
            g3Var.getLogger().c(f3.ERROR, "SendFireAndForget factory is null.", new Object[0]);
            return;
        }
        try {
            g3Var.getExecutorService().submit(new Runnable() { // from class: io.sentry.w1
                @Override // java.lang.Runnable
                public final void run() {
                    x1.c(x1.a.this, g3Var);
                }
            });
            g3Var.getLogger().c(f3.DEBUG, "SendCachedEventFireAndForgetIntegration installed.", new Object[0]);
        } catch (Throwable th2) {
            g3Var.getLogger().b(f3.ERROR, "Failed to call the executor. Cached events will not be sent", th2);
        }
    }
}