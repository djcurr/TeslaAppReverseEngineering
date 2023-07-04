package io.sentry.android.core;

import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.f3;
import io.sentry.g3;
import java.io.Closeable;

/* loaded from: classes5.dex */
public final class x implements io.sentry.m0, Closeable {

    /* renamed from: a */
    LifecycleWatcher f32171a;

    /* renamed from: b */
    private SentryAndroidOptions f32172b;

    /* renamed from: c */
    private final j0 f32173c;

    public x() {
        this(new j0());
    }

    /* renamed from: C */
    public void m() {
        ProcessLifecycleOwner.h().getLifecycle().c(this.f32171a);
    }

    public static /* synthetic */ void g(x xVar) {
        xVar.m();
    }

    public static /* synthetic */ void j(x xVar, io.sentry.c0 c0Var) {
        xVar.p(c0Var);
    }

    /* renamed from: l */
    public void p(io.sentry.c0 c0Var) {
        SentryAndroidOptions sentryAndroidOptions = this.f32172b;
        if (sentryAndroidOptions == null) {
            return;
        }
        this.f32171a = new LifecycleWatcher(c0Var, sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.f32172b.isEnableAutoSessionTracking(), this.f32172b.isEnableAppLifecycleBreadcrumbs());
        ProcessLifecycleOwner.h().getLifecycle().a(this.f32171a);
        this.f32172b.getLogger().c(f3.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0074 -> B:44:0x008c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0081 -> B:44:0x008c). Please submit an issue!!! */
    @Override // io.sentry.m0
    public void a(final io.sentry.c0 c0Var, g3 g3Var) {
        rz.j.a(c0Var, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) rz.j.a(g3Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) g3Var : null, "SentryAndroidOptions is required");
        this.f32172b = sentryAndroidOptions;
        io.sentry.d0 logger = sentryAndroidOptions.getLogger();
        f3 f3Var = f3.DEBUG;
        logger.c(f3Var, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f32172b.isEnableAutoSessionTracking()));
        this.f32172b.getLogger().c(f3Var, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f32172b.isEnableAppLifecycleBreadcrumbs()));
        if (this.f32172b.isEnableAutoSessionTracking() || this.f32172b.isEnableAppLifecycleBreadcrumbs()) {
            try {
                int i11 = ProcessLifecycleOwner.f5047j;
                if (kz.d.a()) {
                    p(c0Var);
                    g3Var = g3Var;
                } else {
                    this.f32173c.b(new Runnable() { // from class: io.sentry.android.core.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            x.j(x.this, c0Var);
                        }
                    });
                    g3Var = g3Var;
                }
            } catch (ClassNotFoundException e11) {
                io.sentry.d0 logger2 = g3Var.getLogger();
                logger2.b(f3.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", e11);
                g3Var = logger2;
            } catch (IllegalStateException e12) {
                io.sentry.d0 logger3 = g3Var.getLogger();
                logger3.b(f3.ERROR, "AppLifecycleIntegration could not be installed", e12);
                g3Var = logger3;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f32171a != null) {
            if (kz.d.a()) {
                m();
            } else {
                this.f32173c.b(new Runnable() { // from class: io.sentry.android.core.v
                    {
                        x.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        x.g(x.this);
                    }
                });
            }
            this.f32171a = null;
            SentryAndroidOptions sentryAndroidOptions = this.f32172b;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(f3.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
    }

    x(j0 j0Var) {
        this.f32173c = j0Var;
    }
}