package com.reactnativepagerview;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.v;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.w;

/* loaded from: classes2.dex */
public final class a implements v {
    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> i11;
        s.g(reactContext, "reactContext");
        i11 = w.i();
        return i11;
    }

    @Override // com.facebook.react.v
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        List<ViewManager<?, ?>> d11;
        s.g(reactContext, "reactContext");
        d11 = wz.v.d(new PagerViewViewManager());
        return d11;
    }
}