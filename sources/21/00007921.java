package io.sentry.android.core;

import android.content.Context;
import io.sentry.android.core.b;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.f3;
import io.sentry.g3;
import java.io.Closeable;

/* loaded from: classes5.dex */
public final class t implements io.sentry.m0, Closeable {

    /* renamed from: c */
    private static b f32146c;

    /* renamed from: d */
    private static final Object f32147d = new Object();

    /* renamed from: a */
    private final Context f32148a;

    /* renamed from: b */
    private g3 f32149b;

    public t(Context context) {
        this.f32148a = context;
    }

    public static /* synthetic */ void g(t tVar, io.sentry.c0 c0Var, SentryAndroidOptions sentryAndroidOptions, z zVar) {
        tVar.j(c0Var, sentryAndroidOptions, zVar);
    }

    public /* synthetic */ void j(io.sentry.c0 c0Var, SentryAndroidOptions sentryAndroidOptions, z zVar) {
        m(c0Var, sentryAndroidOptions.getLogger(), zVar);
    }

    private void l(final io.sentry.c0 c0Var, final SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.d0 logger = sentryAndroidOptions.getLogger();
        f3 f3Var = f3.DEBUG;
        logger.c(f3Var, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            synchronized (f32147d) {
                if (f32146c == null) {
                    sentryAndroidOptions.getLogger().c(f3Var, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                    b bVar = new b(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new b.a() { // from class: io.sentry.android.core.s
                        @Override // io.sentry.android.core.b.a
                        public final void a(z zVar) {
                            t.g(t.this, c0Var, sentryAndroidOptions, zVar);
                        }
                    }, sentryAndroidOptions.getLogger(), this.f32148a);
                    f32146c = bVar;
                    bVar.start();
                    sentryAndroidOptions.getLogger().c(f3Var, "AnrIntegration installed.", new Object[0]);
                }
            }
        }
    }

    @Override // io.sentry.m0
    public final void a(io.sentry.c0 c0Var, g3 g3Var) {
        this.f32149b = (g3) rz.j.a(g3Var, "SentryOptions is required");
        l(c0Var, (SentryAndroidOptions) g3Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (f32147d) {
            b bVar = f32146c;
            if (bVar != null) {
                bVar.interrupt();
                f32146c = null;
                g3 g3Var = this.f32149b;
                if (g3Var != null) {
                    g3Var.getLogger().c(f3.DEBUG, "AnrIntegration removed.", new Object[0]);
                }
            }
        }
    }

    void m(io.sentry.c0 c0Var, io.sentry.d0 d0Var, z zVar) {
        d0Var.c(f3.INFO, "ANR triggered with message: %s", zVar.getMessage());
        io.sentry.protocol.h hVar = new io.sentry.protocol.h();
        hVar.j("ANR");
        c0Var.p(new ExceptionMechanismException(hVar, zVar, zVar.a(), true));
    }
}