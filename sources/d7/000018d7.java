package com.facebook.react.modules.debug;

import bg.d;
import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;

@fg.a(name = DevSettingsModule.NAME)
/* loaded from: classes3.dex */
public class DevSettingsModule extends NativeDevSettingsSpec {
    public static final String NAME = "DevSettings";
    private final d mDevSupportManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DevSettingsModule.this.mDevSupportManager.p();
        }
    }

    /* loaded from: classes3.dex */
    class b implements bg.b {
        b(DevSettingsModule devSettingsModule, String str) {
        }
    }

    public DevSettingsModule(ReactApplicationContext reactApplicationContext, d dVar) {
        super(reactApplicationContext);
        this.mDevSupportManager = dVar;
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void addMenuItem(String str) {
        this.mDevSupportManager.s(str, new b(this, str));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void onFastRefresh() {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reload() {
        if (this.mDevSupportManager.e()) {
            UiThreadUtil.runOnUiThread(new a());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void reloadWithReason(String str) {
        reload();
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void removeListeners(double d11) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setHotLoadingEnabled(boolean z11) {
        this.mDevSupportManager.f(z11);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsDebuggingRemotely(boolean z11) {
        this.mDevSupportManager.a(z11);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setIsShakeToShowDevMenuEnabled(boolean z11) {
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void setProfilingEnabled(boolean z11) {
        this.mDevSupportManager.q(z11);
    }

    @Override // com.facebook.fbreact.specs.NativeDevSettingsSpec
    public void toggleElementInspector() {
        this.mDevSupportManager.l();
    }
}