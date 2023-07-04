package com.swmansion.reanimated;

import com.facebook.react.a0;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.o;
import com.facebook.react.r;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.ReanimatedUIManager;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class ReanimatedPackage extends a0 {
    private UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        com.facebook.systrace.a.c(0L, "createUIManagerModule");
        try {
            return new ReanimatedUIManager(reactApplicationContext, getReactInstanceManager(reactApplicationContext).D(reactApplicationContext), -1);
        } finally {
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    @Override // com.facebook.react.a0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(ReanimatedModule.NAME)) {
            return new ReanimatedModule(reactApplicationContext);
        }
        if (str.equals(UIManagerModule.NAME)) {
            return createUIManager(reactApplicationContext);
        }
        return null;
    }

    public r getReactInstanceManager(ReactApplicationContext reactApplicationContext) {
        return ((o) reactApplicationContext.getApplicationContext()).c().getReactInstanceManager();
    }

    @Override // com.facebook.react.a0
    public gg.a getReactModuleInfoProvider() {
        Class[] clsArr = {ReanimatedModule.class, ReanimatedUIManager.class};
        final HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < 2; i11++) {
            Class cls = clsArr[i11];
            fg.a aVar = (fg.a) cls.getAnnotation(fg.a.class);
            hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), true, aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
        }
        return new gg.a() { // from class: com.swmansion.reanimated.ReanimatedPackage.1
            @Override // gg.a
            public Map<String, ReactModuleInfo> getReactModuleInfos() {
                return hashMap;
            }
        };
    }
}