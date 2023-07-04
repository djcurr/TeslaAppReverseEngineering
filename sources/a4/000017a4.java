package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class b extends a0 {

    /* loaded from: classes3.dex */
    class a implements gg.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f11816a;

        a(b bVar, Map map) {
            this.f11816a = map;
        }

        @Override // gg.a
        public Map<String, ReactModuleInfo> getReactModuleInfos() {
            return this.f11816a;
        }
    }

    @Override // com.facebook.react.a0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        if (str.equals(JSCHeapCapture.TAG)) {
            return new JSCHeapCapture(reactApplicationContext);
        }
        throw new IllegalArgumentException("In DebugCorePackage, could not find Native module for " + str);
    }

    @Override // com.facebook.react.a0
    public gg.a getReactModuleInfoProvider() {
        try {
            return (gg.a) Class.forName("com.facebook.react.DebugCorePackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {JSCHeapCapture.class};
            HashMap hashMap = new HashMap();
            for (int i11 = 0; i11 < 1; i11++) {
                Class cls = clsArr[i11];
                fg.a aVar = (fg.a) cls.getAnnotation(fg.a.class);
                hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            }
            return new a(this, hashMap);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider", e12);
        }
    }
}