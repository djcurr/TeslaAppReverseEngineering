package io.sua;

import android.text.format.DateFormat;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* loaded from: classes5.dex */
public class RNDeviceTimeFormatModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    public RNDeviceTimeFormatModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNDeviceTimeFormat";
    }

    @ReactMethod
    public void is24HourFormat(Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(DateFormat.is24HourFormat(this.reactContext)));
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }
}