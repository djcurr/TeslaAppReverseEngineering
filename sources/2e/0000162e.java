package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xf.a;

/* loaded from: classes3.dex */
public abstract class NativeDevMenuSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeDevMenuSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void debugRemotely(boolean z11);

    @ReactMethod
    @a
    public abstract void reload();

    @ReactMethod
    @a
    public abstract void setHotLoadingEnabled(boolean z11);

    @ReactMethod
    @a
    public abstract void setProfilingEnabled(boolean z11);

    @ReactMethod
    @a
    public abstract void show();
}