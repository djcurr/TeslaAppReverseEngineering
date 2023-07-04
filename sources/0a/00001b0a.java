package com.github.reactnativecommunity.location;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.lang.reflect.Constructor;

@fg.a(name = RNLocationModule.NAME)
/* loaded from: classes3.dex */
public class RNLocationModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RNLocation";
    private ActivityEventListener activityEventListener;
    private b locationProvider;

    /* loaded from: classes3.dex */
    class a extends BaseActivityEventListener {
        a() {
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
            if (RNLocationModule.this.locationProvider instanceof c) {
                ((c) RNLocationModule.this.locationProvider).j(i11, i12, intent);
            }
        }
    }

    public RNLocationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        a aVar = new a();
        this.activityEventListener = aVar;
        reactApplicationContext.addActivityEventListener(aVar);
    }

    private b createBaiduLocationProvider() {
        try {
            Constructor<?> declaredConstructor = Class.forName("com.github.reactnativecommunity.location.RNBaiduLocationProvider").getDeclaredConstructor(ReactApplicationContext.class);
            declaredConstructor.setAccessible(true);
            return (b) declaredConstructor.newInstance(getReactApplicationContext());
        } catch (Exception unused) {
            e.b(getReactApplicationContext(), "Cannot initialize BaiduLocationProvider", "500");
            return createStandardLocationProvider();
        }
    }

    private b createDefaultLocationProvider() {
        if (e.c()) {
            return createPlayServicesLocationProvider();
        }
        return createStandardLocationProvider();
    }

    private c createPlayServicesLocationProvider() {
        return new c(getCurrentActivity(), getReactApplicationContext());
    }

    private d createStandardLocationProvider() {
        return new d(getReactApplicationContext());
    }

    @ReactMethod
    public void configure(ReadableMap readableMap, Promise promise) {
        if (readableMap.hasKey("androidProvider")) {
            String string = readableMap.getString("androidProvider");
            string.hashCode();
            char c11 = 65535;
            switch (string.hashCode()) {
                case 3005871:
                    if (string.equals("auto")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 93498907:
                    if (string.equals("baidu")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 678398898:
                    if (string.equals("playServices")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 1312628413:
                    if (string.equals("standard")) {
                        c11 = 3;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    this.locationProvider = createDefaultLocationProvider();
                    break;
                case 1:
                    this.locationProvider = createBaiduLocationProvider();
                    break;
                case 2:
                    this.locationProvider = createPlayServicesLocationProvider();
                    break;
                case 3:
                    this.locationProvider = createStandardLocationProvider();
                    break;
                default:
                    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                    e.b(reactApplicationContext, "androidProvider was passed an unknown value: " + string, "401");
                    break;
            }
        } else if (this.locationProvider == null) {
            this.locationProvider = createDefaultLocationProvider();
        }
        this.locationProvider.a(getCurrentActivity(), readableMap, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void startUpdatingLocation() {
        if (this.locationProvider == null) {
            this.locationProvider = createDefaultLocationProvider();
        }
        this.locationProvider.b();
    }

    @ReactMethod
    public void stopUpdatingLocation() {
        if (this.locationProvider == null) {
            this.locationProvider = createDefaultLocationProvider();
        }
        this.locationProvider.c();
    }
}