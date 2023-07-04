package com.reactlibrary;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class CmbBridgeModule extends ReactContextBaseJavaModule implements gb.b {
    private static final String CMB_PAYMENT_CANCELLED_CODE = "2000";
    private static final String PAYMENT_SAMPLE_APP_PACKAGE_NAME = "com.exampleapp";
    private static final String TESLA_APP_CMB_ENTRY_ACTIVITY = "com.tesla.TeslaV4.cmbapi.CmbPayEntryActivity";
    private static final ArrayList<CmbBridgeModule> modules = new ArrayList<>();
    private Promise originalPromise;
    private final ReactApplicationContext reactContext;

    public CmbBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    public static void handleIntent(Intent intent) {
        Iterator<CmbBridgeModule> it2 = modules.iterator();
        while (it2.hasNext()) {
            try {
                gb.a.a(it2.next(), intent);
            } catch (Exception e11) {
                Log.e("CmbBridgeModule handleIntent failed", e11.getMessage());
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CmbBridge";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        modules.add(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        modules.remove(this);
    }

    @Override // gb.b
    public void onCmblifeCallBack(String str, Map<String, String> map) {
        Promise promise;
        if ("pay".equals(str)) {
            String str2 = map.get("respCode");
            String str3 = map.get("respMsg");
            if (!CMB_PAYMENT_CANCELLED_CODE.equals(str2) || (promise = this.originalPromise) == null) {
                return;
            }
            promise.reject(str2, str3);
        }
    }

    @ReactMethod
    public void startCmblife(ReadableMap readableMap, Promise promise) {
        Class<?> cls;
        this.originalPromise = promise;
        String string = readableMap.getString("protocol");
        String string2 = readableMap.getString("requestCode");
        Activity currentActivity = getCurrentActivity();
        try {
            if (PAYMENT_SAMPLE_APP_PACKAGE_NAME.equals(this.reactContext.getPackageName())) {
                cls = currentActivity.getClass();
            } else {
                cls = Class.forName(TESLA_APP_CMB_ENTRY_ACTIVITY);
            }
            gb.a.c(currentActivity, string, cls, string2);
        } catch (Exception e11) {
            Log.e("CmbBridgeModule startCmblife failed", e11.getMessage());
        }
    }
}