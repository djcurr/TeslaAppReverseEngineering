package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.f3;
import io.sentry.g3;
import java.io.Closeable;

/* loaded from: classes5.dex */
public final class v0 implements io.sentry.m0, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final Application f32164a;

    /* renamed from: b  reason: collision with root package name */
    private io.sentry.c0 f32165b;

    /* renamed from: c  reason: collision with root package name */
    private SentryAndroidOptions f32166c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f32167d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f32168e;

    public v0(Application application, i0 i0Var) {
        this.f32164a = (Application) rz.j.a(application, "Application is required");
        this.f32167d = i0Var.b("androidx.core.view.GestureDetectorCompat", this.f32166c);
        this.f32168e = i0Var.b("androidx.core.view.ScrollingView", this.f32166c);
    }

    private void g(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f32166c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(f3.INFO, "Window was null in startTracking", new Object[0]);
            }
        } else if (this.f32165b == null || this.f32166c == null) {
        } else {
            Window.Callback callback = window.getCallback();
            if (callback == null) {
                callback = new jz.a();
            }
            window.setCallback(new jz.h(callback, activity, new jz.g(activity, this.f32165b, this.f32166c, this.f32168e), this.f32166c));
        }
    }

    private void j(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f32166c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(f3.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof jz.h) {
            jz.h hVar = (jz.h) callback;
            hVar.c();
            if (hVar.a() instanceof jz.a) {
                window.setCallback(null);
            } else {
                window.setCallback(hVar.a());
            }
        }
    }

    @Override // io.sentry.m0
    public void a(io.sentry.c0 c0Var, g3 g3Var) {
        this.f32166c = (SentryAndroidOptions) rz.j.a(g3Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) g3Var : null, "SentryAndroidOptions is required");
        this.f32165b = (io.sentry.c0) rz.j.a(c0Var, "Hub is required");
        io.sentry.d0 logger = this.f32166c.getLogger();
        f3 f3Var = f3.DEBUG;
        logger.c(f3Var, "UserInteractionIntegration enabled: %s", Boolean.valueOf(this.f32166c.isEnableUserInteractionBreadcrumbs()));
        if (this.f32166c.isEnableUserInteractionBreadcrumbs()) {
            if (this.f32167d) {
                this.f32164a.registerActivityLifecycleCallbacks(this);
                this.f32166c.getLogger().c(f3Var, "UserInteractionIntegration installed.", new Object[0]);
                return;
            }
            g3Var.getLogger().c(f3.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32164a.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f32166c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(f3.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        g(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}