package com.swmansion.rnscreens;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;

/* loaded from: classes6.dex */
public final class c implements com.facebook.react.v {
    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> i11;
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        i11 = wz.w.i();
        return i11;
    }

    @Override // com.facebook.react.v
    public List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactContext) {
        List<ViewManager<?, ?>> l11;
        kotlin.jvm.internal.s.g(reactContext, "reactContext");
        l11 = wz.w.l(new ScreenContainerViewManager(), new ScreenViewManager(), new ScreenStackViewManager(), new ScreenStackHeaderConfigViewManager(), new ScreenStackHeaderSubviewManager());
        return l11;
    }
}