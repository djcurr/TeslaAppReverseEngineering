package com.plaid;

import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class PlaidPackage extends a0 {
    public static /* synthetic */ Map c() {
        return lambda$getReactModuleInfoProvider$0();
    }

    public static /* synthetic */ Map lambda$getReactModuleInfoProvider$0() {
        HashMap hashMap = new HashMap();
        hashMap.put("PlaidAndroid", new ReactModuleInfo("PlaidAndroid", "com.reactlibrary.PlaidModule", false, false, true, false, false));
        return hashMap;
    }

    @Override // com.facebook.react.a0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return new PlaidModule(reactApplicationContext);
    }

    @Override // com.facebook.react.a0
    public gg.a getReactModuleInfoProvider() {
        return new gg.a() { // from class: com.plaid.a
            @Override // gg.a
            public final Map getReactModuleInfos() {
                return PlaidPackage.c();
            }
        };
    }
}