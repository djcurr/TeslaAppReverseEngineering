package com.reactlibrary;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.v;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class g implements v {
    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new AdyenBridgeModule(reactApplicationContext), new AlipayBridgeModule(reactApplicationContext), new WeChatBridgeModule(reactApplicationContext), new CmbBridgeModule(reactApplicationContext));
    }

    @Override // com.facebook.react.v
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new BacsViewManager(), new BacsMandateViewManager());
    }
}