package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.f3;
import io.sentry.g3;
import io.sentry.protocol.e;
import java.io.Closeable;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class u implements io.sentry.m0, Closeable, ComponentCallbacks2 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f32156a;

    /* renamed from: b  reason: collision with root package name */
    private io.sentry.c0 f32157b;

    /* renamed from: c  reason: collision with root package name */
    private SentryAndroidOptions f32158c;

    public u(Context context) {
        this.f32156a = (Context) rz.j.a(context, "Context is required");
    }

    private void g(Integer num) {
        if (this.f32157b != null) {
            io.sentry.c cVar = new io.sentry.c();
            if (num != null) {
                if (num.intValue() < 40) {
                    return;
                }
                cVar.m("level", num);
            }
            cVar.p("system");
            cVar.l("device.event");
            cVar.o("Low memory");
            cVar.m("action", "LOW_MEMORY");
            cVar.n(f3.WARNING);
            this.f32157b.e(cVar);
        }
    }

    @Override // io.sentry.m0
    public void a(io.sentry.c0 c0Var, g3 g3Var) {
        this.f32157b = (io.sentry.c0) rz.j.a(c0Var, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) rz.j.a(g3Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) g3Var : null, "SentryAndroidOptions is required");
        this.f32158c = sentryAndroidOptions;
        io.sentry.d0 logger = sentryAndroidOptions.getLogger();
        f3 f3Var = f3.DEBUG;
        logger.c(f3Var, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f32158c.isEnableAppComponentBreadcrumbs()));
        if (this.f32158c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f32156a.registerComponentCallbacks(this);
                g3Var.getLogger().c(f3Var, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
            } catch (Throwable th2) {
                this.f32158c.setEnableAppComponentBreadcrumbs(false);
                g3Var.getLogger().a(f3.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f32156a.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.f32158c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().a(f3.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f32158c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().c(f3.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f32157b != null) {
            e.b a11 = kz.c.a(this.f32156a.getResources().getConfiguration().orientation);
            String lowerCase = a11 != null ? a11.name().toLowerCase(Locale.ROOT) : "undefined";
            io.sentry.c cVar = new io.sentry.c();
            cVar.p("navigation");
            cVar.l("device.orientation");
            cVar.m("position", lowerCase);
            cVar.n(f3.INFO);
            io.sentry.t tVar = new io.sentry.t();
            tVar.e("android:configuration", configuration);
            this.f32157b.h(cVar, tVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        g(null);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        g(Integer.valueOf(i11));
    }
}