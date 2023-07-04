package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import io.sentry.b3;
import io.sentry.f3;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class p0 implements io.sentry.r, Application.ActivityLifecycleCallbacks, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Application f32118a;

    /* renamed from: b  reason: collision with root package name */
    private final SentryAndroidOptions f32119b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<Activity> f32120c;

    /* renamed from: d  reason: collision with root package name */
    final a0 f32121d;

    public p0(Application application, SentryAndroidOptions sentryAndroidOptions, a0 a0Var) {
        this.f32118a = (Application) rz.j.a(application, "Application is required");
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) rz.j.a(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f32119b = sentryAndroidOptions2;
        this.f32121d = (a0) rz.j.a(a0Var, "BuildInfoProvider is required");
        if (sentryAndroidOptions2.isAttachScreenshot()) {
            application.registerActivityLifecycleCallbacks(this);
            sentryAndroidOptions2.getLogger().c(f3.DEBUG, "attachScreenshot is enabled, ScreenshotEventProcessor is installed.", new Object[0]);
            return;
        }
        sentryAndroidOptions2.getLogger().c(f3.DEBUG, "attachScreenshot is disabled, ScreenshotEventProcessor isn't installed.", new Object[0]);
    }

    private void j(Activity activity) {
        WeakReference<Activity> weakReference = this.f32120c;
        if (weakReference == null || weakReference.get() != activity) {
            return;
        }
        this.f32120c = null;
    }

    private boolean l(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (this.f32121d.d() >= 17) {
            return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
        }
        return !activity.isFinishing();
    }

    private void m(Activity activity) {
        WeakReference<Activity> weakReference = this.f32120c;
        if (weakReference == null || weakReference.get() != activity) {
            this.f32120c = new WeakReference<>(activity);
        }
    }

    @Override // io.sentry.r
    public b3 a(b3 b3Var, io.sentry.t tVar) {
        WeakReference<Activity> weakReference;
        if (this.f32119b.isAttachScreenshot() && b3Var.s0() && (weakReference = this.f32120c) != null) {
            Activity activity = weakReference.get();
            if (l(activity) && activity.getWindow() != null && activity.getWindow().getDecorView() != null && activity.getWindow().getDecorView().getRootView() != null) {
                View rootView = activity.getWindow().getDecorView().getRootView();
                if (rootView.getWidth() > 0 && rootView.getHeight() > 0) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
                        rootView.draw(new Canvas(createBitmap));
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        if (byteArrayOutputStream.size() > 0) {
                            tVar.f(io.sentry.b.a(byteArrayOutputStream.toByteArray()));
                            tVar.e("android:activity", activity);
                        } else {
                            this.f32119b.getLogger().c(f3.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                        }
                    } catch (Throwable th2) {
                        this.f32119b.getLogger().b(f3.ERROR, "Taking screenshot failed.", th2);
                    }
                } else {
                    this.f32119b.getLogger().c(f3.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
                }
            } else {
                this.f32119b.getLogger().c(f3.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            }
        }
        return b3Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f32119b.isAttachScreenshot()) {
            this.f32118a.unregisterActivityLifecycleCallbacks(this);
            this.f32120c = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        m(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        j(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        m(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        m(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        j(activity);
    }
}