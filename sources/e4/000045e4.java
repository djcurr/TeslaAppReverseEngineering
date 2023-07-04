package com.plaid.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.plaid.BuildConfig;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class w2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f19657a = new WeakReference<>(null);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        boolean M;
        kotlin.jvm.internal.s.g(activity, "activity");
        String name = activity.getClass().getName();
        kotlin.jvm.internal.s.f(name, "activity.javaClass.name");
        M = kotlin.text.w.M(name, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null);
        if (M) {
            this.f19657a = new WeakReference<>(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.s.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.s.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        boolean M;
        kotlin.jvm.internal.s.g(activity, "activity");
        String name = activity.getClass().getName();
        kotlin.jvm.internal.s.f(name, "activity.javaClass.name");
        M = kotlin.text.w.M(name, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null);
        if (M) {
            this.f19657a = new WeakReference<>(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.s.g(activity, "activity");
        kotlin.jvm.internal.s.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        boolean M;
        kotlin.jvm.internal.s.g(activity, "activity");
        String name = activity.getClass().getName();
        kotlin.jvm.internal.s.f(name, "activity.javaClass.name");
        M = kotlin.text.w.M(name, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null);
        if (M) {
            this.f19657a = new WeakReference<>(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.s.g(activity, "activity");
    }
}