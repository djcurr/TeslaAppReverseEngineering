package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xf.a;

/* loaded from: classes3.dex */
public abstract class NativeTimingSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeTimingSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void createTimer(double d11, double d12, double d13, boolean z11);

    @ReactMethod
    @a
    public abstract void deleteTimer(double d11);

    @ReactMethod
    @a
    public abstract void setSendIdleEvents(boolean z11);
}