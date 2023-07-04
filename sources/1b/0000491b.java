package com.proyecto26.inappbrowser;

import android.app.Activity;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import fg.a;
import tq.c;

@a(name = RNInAppBrowserModule.NAME)
/* loaded from: classes2.dex */
public class RNInAppBrowserModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RNInAppBrowser";
    private final ReactApplicationContext reactContext;

    public RNInAppBrowserModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    public static void onStart(Activity activity) {
        c.f().j(activity);
    }

    @ReactMethod
    public void close() {
        c.f().d();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void isAvailable(Promise promise) {
        c.f().h(this.reactContext, promise);
    }

    @ReactMethod
    public void mayLaunchUrl(String str, ReadableArray readableArray) {
        c.f().i(str, readableArray);
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Promise promise) {
        c.f().k(this.reactContext, readableMap, promise, getCurrentActivity());
    }

    @ReactMethod
    public void warmup(Promise promise) {
        c.f().q(promise);
    }
}