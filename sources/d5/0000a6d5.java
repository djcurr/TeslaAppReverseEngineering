package org.wonday.orientation;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    private static AtomicInteger f43969b = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    private static a f43970c;

    /* renamed from: a  reason: collision with root package name */
    private b f43971a;

    private a() {
    }

    public static a a() {
        if (f43970c == null) {
            f43970c = new a();
        }
        return f43970c;
    }

    public void b(b bVar) {
        this.f43971a = bVar;
        if (f43969b.get() == 1) {
            this.f43971a.start();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Log.d("OrientationModule", "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        b bVar;
        Log.d("OrientationModule", "onActivityDestroyed");
        if (f43969b.get() != 0 || (bVar = this.f43971a) == null) {
            return;
        }
        bVar.release();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Log.d("OrientationModule", "onActivityPaused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Log.d("OrientationModule", "onActivityResumed");
        if (f43969b.incrementAndGet() != 1 || this.f43971a == null) {
            return;
        }
        Log.d("OrientationModule", "Start orientation");
        this.f43971a.start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Log.d("OrientationModule", "onActivitySaveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Log.d("OrientationModule", "onActivityStarted");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        b bVar;
        Log.d("OrientationModule", "onActivityStopped");
        if (f43969b.decrementAndGet() != 0 || (bVar = this.f43971a) == null) {
            return;
        }
        bVar.stop();
    }
}