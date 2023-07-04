package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class t implements v {
    public abstract List<NativeModule> a(ReactApplicationContext reactApplicationContext, r rVar);

    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new RuntimeException("ReactInstancePackage must be passed in the ReactInstanceManager.");
    }
}