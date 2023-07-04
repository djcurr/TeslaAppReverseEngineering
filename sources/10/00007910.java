package io.sentry.android.core;

import io.sentry.f3;
import io.sentry.g3;
import java.io.Closeable;

/* loaded from: classes5.dex */
public final class l0 implements io.sentry.m0, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f32103a;

    /* renamed from: b  reason: collision with root package name */
    private SentryAndroidOptions f32104b;

    public l0(Class<?> cls) {
        this.f32103a = cls;
    }

    private void g(g3 g3Var) {
        g3Var.setEnableNdk(false);
        g3Var.setEnableScopeSync(false);
    }

    @Override // io.sentry.m0
    public final void a(io.sentry.c0 c0Var, g3 g3Var) {
        rz.j.a(c0Var, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) rz.j.a(g3Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) g3Var : null, "SentryAndroidOptions is required");
        this.f32104b = sentryAndroidOptions;
        boolean isEnableNdk = sentryAndroidOptions.isEnableNdk();
        io.sentry.d0 logger = this.f32104b.getLogger();
        f3 f3Var = f3.DEBUG;
        logger.c(f3Var, "NdkIntegration enabled: %s", Boolean.valueOf(isEnableNdk));
        if (isEnableNdk && this.f32103a != null) {
            if (this.f32104b.getCacheDirPath() == null) {
                this.f32104b.getLogger().c(f3.ERROR, "No cache dir path is defined in options.", new Object[0]);
                g(this.f32104b);
                return;
            }
            try {
                this.f32103a.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f32104b);
                this.f32104b.getLogger().c(f3Var, "NdkIntegration installed.", new Object[0]);
                return;
            } catch (NoSuchMethodException e11) {
                g(this.f32104b);
                this.f32104b.getLogger().b(f3.ERROR, "Failed to invoke the SentryNdk.init method.", e11);
                return;
            } catch (Throwable th2) {
                g(this.f32104b);
                this.f32104b.getLogger().b(f3.ERROR, "Failed to initialize SentryNdk.", th2);
                return;
            }
        }
        g(this.f32104b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Class<?> cls;
        SentryAndroidOptions sentryAndroidOptions = this.f32104b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk() || (cls = this.f32103a) == null) {
            return;
        }
        try {
            try {
                cls.getMethod("close", new Class[0]).invoke(null, new Object[0]);
                this.f32104b.getLogger().c(f3.DEBUG, "NdkIntegration removed.", new Object[0]);
            }
        } catch (NoSuchMethodException e11) {
            this.f32104b.getLogger().b(f3.ERROR, "Failed to invoke the SentryNdk.close method.", e11);
        }
        g(this.f32104b);
    }
}