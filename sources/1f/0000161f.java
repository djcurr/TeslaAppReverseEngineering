package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xf.a;

/* loaded from: classes3.dex */
public abstract class NativeAccessibilityManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeAccessibilityManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void announceForAccessibility(String str);

    @ReactMethod
    @a
    public void announceForAccessibilityWithOptions(String str, ReadableMap readableMap) {
    }

    @ReactMethod
    @a
    public abstract void getCurrentBoldTextState(Callback callback, Callback callback2);

    @ReactMethod
    @a
    public abstract void getCurrentGrayscaleState(Callback callback, Callback callback2);

    @ReactMethod
    @a
    public abstract void getCurrentInvertColorsState(Callback callback, Callback callback2);

    @ReactMethod
    @a
    public abstract void getCurrentReduceMotionState(Callback callback, Callback callback2);

    @ReactMethod
    @a
    public abstract void getCurrentReduceTransparencyState(Callback callback, Callback callback2);

    @ReactMethod
    @a
    public abstract void getCurrentVoiceOverState(Callback callback, Callback callback2);

    @ReactMethod
    @a
    public abstract void setAccessibilityContentSizeMultipliers(ReadableMap readableMap);

    @ReactMethod
    @a
    public abstract void setAccessibilityFocus(double d11);
}