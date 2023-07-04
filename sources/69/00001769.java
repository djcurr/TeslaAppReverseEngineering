package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.bundleloader.NativeDevSplitBundleLoaderModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.e1;
import com.facebook.react.uimanager.s0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class a extends a0 implements x {

    /* renamed from: a  reason: collision with root package name */
    private final r f11657a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.modules.core.b f11658b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11659c;

    /* renamed from: d  reason: collision with root package name */
    private final int f11660d;

    /* renamed from: com.facebook.react.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0221a implements gg.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f11661a;

        C0221a(a aVar, Map map) {
            this.f11661a = map;
        }

        @Override // gg.a
        public Map<String, ReactModuleInfo> getReactModuleInfos() {
            return this.f11661a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements e1 {
        b() {
        }

        @Override // com.facebook.react.uimanager.e1
        public List<String> a() {
            return a.this.f11657a.E();
        }

        @Override // com.facebook.react.uimanager.e1
        public ViewManager b(String str) {
            return a.this.f11657a.w(str);
        }
    }

    public a(r rVar, com.facebook.react.modules.core.b bVar, s0 s0Var, boolean z11, int i11) {
        this.f11657a = rVar;
        this.f11658b = bVar;
        this.f11659c = z11;
        this.f11660d = i11;
    }

    private UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        com.facebook.systrace.a.c(0L, "createUIManagerModule");
        try {
            if (this.f11659c) {
                return new UIManagerModule(reactApplicationContext, new b(), this.f11660d);
            }
            return new UIManagerModule(reactApplicationContext, this.f11657a.D(reactApplicationContext), this.f11660d);
        } finally {
            com.facebook.systrace.a.g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    @Override // com.facebook.react.x
    public void a() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    @Override // com.facebook.react.x
    public void b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    @Override // com.facebook.react.a0
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2013505529:
                if (str.equals(LogBoxModule.NAME)) {
                    c11 = 0;
                    break;
                }
                break;
            case -1789797270:
                if (str.equals(TimingModule.NAME)) {
                    c11 = 1;
                    break;
                }
                break;
            case -1633589448:
                if (str.equals(DevSettingsModule.NAME)) {
                    c11 = 2;
                    break;
                }
                break;
            case -1520650172:
                if (str.equals(DeviceInfoModule.NAME)) {
                    c11 = 3;
                    break;
                }
                break;
            case -1037217463:
                if (str.equals(DeviceEventManagerModule.NAME)) {
                    c11 = 4;
                    break;
                }
                break;
            case -790603268:
                if (str.equals(AndroidInfoModule.NAME)) {
                    c11 = 5;
                    break;
                }
                break;
            case -508954630:
                if (str.equals(NativeDevSplitBundleLoaderModule.NAME)) {
                    c11 = 6;
                    break;
                }
                break;
            case 512434409:
                if (str.equals(ExceptionsManagerModule.NAME)) {
                    c11 = 7;
                    break;
                }
                break;
            case 881516744:
                if (str.equals(SourceCodeModule.NAME)) {
                    c11 = '\b';
                    break;
                }
                break;
            case 1256514152:
                if (str.equals(HeadlessJsTaskSupportModule.NAME)) {
                    c11 = '\t';
                    break;
                }
                break;
            case 1861242489:
                if (str.equals(UIManagerModule.NAME)) {
                    c11 = '\n';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return new LogBoxModule(reactApplicationContext, this.f11657a.B());
            case 1:
                return new TimingModule(reactApplicationContext, this.f11657a.B());
            case 2:
                return new DevSettingsModule(reactApplicationContext, this.f11657a.B());
            case 3:
                return new DeviceInfoModule(reactApplicationContext);
            case 4:
                return new DeviceEventManagerModule(reactApplicationContext, this.f11658b);
            case 5:
                return new AndroidInfoModule(reactApplicationContext);
            case 6:
                return new NativeDevSplitBundleLoaderModule(reactApplicationContext, this.f11657a.B());
            case 7:
                return new ExceptionsManagerModule(this.f11657a.B());
            case '\b':
                return new SourceCodeModule(reactApplicationContext);
            case '\t':
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case '\n':
                return createUIManager(reactApplicationContext);
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + str);
        }
    }

    @Override // com.facebook.react.a0
    public gg.a getReactModuleInfoProvider() {
        try {
            return (gg.a) Class.forName("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class, NativeDevSplitBundleLoaderModule.class};
            HashMap hashMap = new HashMap();
            for (int i11 = 0; i11 < 11; i11++) {
                Class cls = clsArr[i11];
                fg.a aVar = (fg.a) cls.getAnnotation(fg.a.class);
                hashMap.put(aVar.name(), new ReactModuleInfo(aVar.name(), cls.getName(), aVar.canOverrideExistingModule(), aVar.needsEagerInit(), aVar.hasConstants(), aVar.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            }
            return new C0221a(this, hashMap);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e12);
        }
    }
}