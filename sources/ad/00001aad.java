package com.facebook.react;

import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class y extends TurboModuleManagerDelegate {

    /* renamed from: a  reason: collision with root package name */
    private final List<a0> f12836a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<a0, Map<String, ReactModuleInfo>> f12837b;

    /* renamed from: c  reason: collision with root package name */
    private final ReactApplicationContext f12838c;

    /* loaded from: classes3.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private List<v> f12839a;

        /* renamed from: b  reason: collision with root package name */
        private ReactApplicationContext f12840b;

        public y a() {
            wf.a.d(this.f12840b, "The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            wf.a.d(this.f12839a, "A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
            return b(this.f12840b, this.f12839a);
        }

        protected abstract y b(ReactApplicationContext reactApplicationContext, List<v> list);

        public a c(List<v> list) {
            this.f12839a = new ArrayList(list);
            return this;
        }

        public a d(ReactApplicationContext reactApplicationContext) {
            this.f12840b = reactApplicationContext;
            return this;
        }
    }

    private TurboModule a(String str) {
        NativeModule nativeModule = null;
        for (a0 a0Var : this.f12836a) {
            try {
                ReactModuleInfo reactModuleInfo = this.f12837b.get(a0Var).get(str);
                if (reactModuleInfo != null && reactModuleInfo.e() && (nativeModule == null || reactModuleInfo.a())) {
                    NativeModule module = a0Var.getModule(str, this.f12838c);
                    if (module != null) {
                        nativeModule = module;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (nativeModule instanceof TurboModule) {
            return (TurboModule) nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.turbomodule.core.TurboModuleManagerDelegate
    public List<String> getEagerInitModuleNames() {
        ArrayList arrayList = new ArrayList();
        for (a0 a0Var : this.f12836a) {
            for (ReactModuleInfo reactModuleInfo : a0Var.getReactModuleInfoProvider().getReactModuleInfos().values()) {
                if (reactModuleInfo.e() && reactModuleInfo.g()) {
                    arrayList.add(reactModuleInfo.f());
                }
            }
        }
        return arrayList;
    }

    @Override // com.facebook.react.turbomodule.core.TurboModuleManagerDelegate
    @xf.a
    public CxxModuleWrapper getLegacyCxxModule(String str) {
        TurboModule a11 = a(str);
        if (a11 != null && (a11 instanceof CxxModuleWrapper)) {
            return (CxxModuleWrapper) a11;
        }
        return null;
    }

    @Override // com.facebook.react.turbomodule.core.TurboModuleManagerDelegate
    public TurboModule getModule(String str) {
        TurboModule a11 = a(str);
        if (a11 == null || (a11 instanceof CxxModuleWrapper)) {
            return null;
        }
        return a11;
    }
}