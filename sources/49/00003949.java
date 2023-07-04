package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class q implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Set<Intent> f16842a = Collections.newSetFromMap(new WeakHashMap());

    public static /* synthetic */ void a(q qVar, Intent intent) {
        qVar.b(intent);
    }

    /* renamed from: c */
    public void b(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Bundle bundle = extras.getBundle("gcm.n.analytics_data");
            if (h0.B(bundle)) {
                h0.u(bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent == null || !this.f16842a.add(intent)) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 24) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.firebase.messaging.p
                {
                    q.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    q.a(q.this, intent);
                }
            });
        } else {
            b(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f16842a.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
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