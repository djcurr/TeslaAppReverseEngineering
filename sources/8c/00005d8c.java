package com.swmansion.gesturehandler.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.v;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.w;

/* loaded from: classes6.dex */
public final class h implements v {
    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> d11;
        s.g(reactContext, "reactContext");
        d11 = wz.v.d(new RNGestureHandlerModule(reactContext));
        return d11;
    }

    @Override // com.facebook.react.v
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        List<ViewManager<?, ?>> l11;
        s.g(reactContext, "reactContext");
        l11 = w.l(new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager());
        return l11;
    }
}