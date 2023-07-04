package com.reactnativecommunity.webview;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.v;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class a implements v {
    @Override // com.facebook.react.v
    public List<RNCWebViewModule> createNativeModules(ReactApplicationContext reactContext) {
        List<RNCWebViewModule> d11;
        s.g(reactContext, "reactContext");
        d11 = wz.v.d(new RNCWebViewModule(reactContext));
        return d11;
    }

    @Override // com.facebook.react.v
    public List<RNCWebViewManager> createViewManagers(ReactApplicationContext reactContext) {
        List<RNCWebViewManager> d11;
        s.g(reactContext, "reactContext");
        d11 = wz.v.d(new RNCWebViewManager());
        return d11;
    }
}