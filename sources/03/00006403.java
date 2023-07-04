package com.wix.reactnativenotifications;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.wix.reactnativenotifications.core.notification.IPushNotification;

/* loaded from: classes6.dex */
public class RNNotificationsModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private final com.tesla.logging.g logger;

    public RNNotificationsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.logger = com.tesla.logging.g.g("ReactNativeNotifs");
        if (lw.c.a() instanceof lw.g) {
            ((lw.g) lw.c.a()).i(reactApplicationContext);
        }
        reactApplicationContext.addActivityEventListener(this);
    }

    public void cancelDeliveredNotification(String str, int i11) {
        nw.c.g(getReactApplicationContext().getApplicationContext()).e(str, i11);
    }

    @ReactMethod
    public void cancelLocalNotification(int i11) {
        nw.c.g(getReactApplicationContext().getApplicationContext()).b(i11);
    }

    @ReactMethod
    public void getInitialNotification(Promise promise) {
        try {
            com.wix.reactnativenotifications.core.notification.c b11 = lw.d.c().b();
            if (b11 == null) {
                return;
            }
            lw.d.c().a();
            promise.resolve(Arguments.fromBundle(lw.e.a(b11.a())));
        } finally {
            promise.resolve(null);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNBridgeModule";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        startPushIntentService("isAppInit");
        nw.c.g(getReactApplicationContext().getApplicationContext()).d();
    }

    @ReactMethod
    public void isRegisteredForRemoteNotifications(Promise promise) {
        promise.resolve(new Boolean(b.a(getReactApplicationContext()).a()));
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        if (lw.f.a(intent)) {
            IPushNotification j11 = com.wix.reactnativenotifications.core.notification.b.j(getReactApplicationContext().getApplicationContext(), lw.f.c(intent));
            if (j11 != null) {
                j11.c();
            }
        }
    }

    @ReactMethod
    public void postLocalNotification(ReadableMap readableMap, int i11) {
        com.wix.reactnativenotifications.core.notification.b.j(getReactApplicationContext().getApplicationContext(), Arguments.toBundle(readableMap)).b(Integer.valueOf(i11));
    }

    @ReactMethod
    public void pushServiceStatus(Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        writableNativeMap.putBoolean("isAutoLaunchAllowed", i.f());
        writableNativeMap.putBoolean("isRunningLimitedPushService", i.g(reactApplicationContext));
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public void refreshToken() {
        startPushIntentService("doManualRefresh");
    }

    @ReactMethod
    void removeAllDeliveredNotifications() {
        nw.c.g(getReactApplicationContext().getApplicationContext()).f();
    }

    @ReactMethod
    void revokePushToken() {
        i.h(getReactApplicationContext());
    }

    @ReactMethod
    public void setCategories(ReadableArray readableArray) {
    }

    @ReactMethod
    void setNotificationChannel(ReadableMap readableMap) {
        mw.c.d(getReactApplicationContext().getApplicationContext(), Arguments.toBundle(readableMap)).a();
    }

    protected void startPushIntentService(String str) {
        i.m(getReactApplicationContext().getApplicationContext(), str);
    }

    @ReactMethod
    void updateAutoLaunchPermission(boolean z11) {
        i.n(z11);
    }
}