package com.tesla.TeslaV4.reactnative.module;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.tesla.TeslaV4.MainApplication;
import com.tesla.logging.TeslaLog;

/* loaded from: classes6.dex */
public class ClientModuleNativeModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "TMClient";

    /* loaded from: classes6.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f21389a;

        a(ClientModuleNativeModule clientModuleNativeModule, Activity activity) {
            this.f21389a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21389a.getWindow().addFlags(128);
        }
    }

    /* loaded from: classes6.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f21390a;

        b(ClientModuleNativeModule clientModuleNativeModule, Activity activity) {
            this.f21390a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21390a.getWindow().clearFlags(128);
        }
    }

    public ClientModuleNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void activateKeepAwake() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new a(this, currentActivity));
        }
    }

    @ReactMethod
    public void deactivateKeepAwake() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new b(this, currentActivity));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void onJsBridgeReady() {
        TeslaLog.INSTANCE.i("ClientModule", "JS Bridge notified ready!", true, false);
        com.tesla.logging.a.f((MainApplication) getReactApplicationContext().getApplicationContext());
    }

    @ReactMethod
    public void sendLogToNative(String str) {
        TeslaLog.INSTANCE.i("JS", str, false, false);
    }
}