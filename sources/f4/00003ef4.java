package com.mkuczera;

import android.os.Vibrator;
import android.provider.Settings;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes2.dex */
public class RNReactNativeHapticFeedbackModule extends ReactContextBaseJavaModule {
    ReactApplicationContext reactContext;

    public RNReactNativeHapticFeedbackModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNReactNativeHapticFeedback";
    }

    @ReactMethod
    public void trigger(String str, ReadableMap readableMap) {
        boolean z11 = readableMap.getBoolean("ignoreAndroidSystemSettings");
        int i11 = Settings.System.getInt(this.reactContext.getContentResolver(), "haptic_feedback_enabled", 0);
        if (z11 || i11 != 0) {
            Vibrator vibrator = (Vibrator) this.reactContext.getSystemService("vibrator");
            b a11 = c.a(str);
            if (vibrator == null || a11 == null) {
                return;
            }
            a11.a(vibrator);
        }
    }
}