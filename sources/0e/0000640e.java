package com.wix.reactnativenotifications;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.v;
import com.wix.reactnativenotifications.core.notification.IPushNotification;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lw.b;

/* loaded from: classes6.dex */
public class d implements v, b.a, Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final Application f22954a;

    public d(Application application) {
        this.f22954a = application;
        lw.c.a().e(this);
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // lw.b.a
    public void a() {
        nw.c.g(this.f22954a.getApplicationContext()).a();
    }

    @Override // lw.b.a
    public void b() {
    }

    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNNotificationsModule(reactApplicationContext));
        arrayList.addAll(i.f22960a.createNativeModules(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.v
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        nw.c.g(this.f22954a.getApplicationContext()).c(activity);
        Intent intent = activity.getIntent();
        if (lw.f.a(intent)) {
            IPushNotification j11 = com.wix.reactnativenotifications.core.notification.b.j(this.f22954a.getApplicationContext(), lw.f.c(intent));
            if (j11 != null) {
                j11.c();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Bundle extras = activity.getIntent().getExtras();
        if (extras != null) {
            com.wix.reactnativenotifications.core.notification.c cVar = new com.wix.reactnativenotifications.core.notification.c(extras);
            if (cVar.b()) {
                lw.d.c().d(cVar);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}