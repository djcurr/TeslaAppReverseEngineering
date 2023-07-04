package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;

@fg.a(name = LogBoxModule.NAME)
/* loaded from: classes3.dex */
public class LogBoxModule extends NativeLogBoxSpec {
    public static final String NAME = "LogBox";
    private final bg.d mDevSupportManager;
    private final yf.g mSurfaceDelegate;

    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogBoxModule.this.mSurfaceDelegate.b(LogBoxModule.NAME);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogBoxModule.this.mSurfaceDelegate.show();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogBoxModule.this.mSurfaceDelegate.hide();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogBoxModule.this.mSurfaceDelegate.c();
        }
    }

    public LogBoxModule(ReactApplicationContext reactApplicationContext, bg.d dVar) {
        super(reactApplicationContext);
        this.mDevSupportManager = dVar;
        yf.g g11 = dVar.g(NAME);
        if (g11 != null) {
            this.mSurfaceDelegate = g11;
        } else {
            this.mSurfaceDelegate = new f(dVar);
        }
        UiThreadUtil.runOnUiThread(new a());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void hide() {
        UiThreadUtil.runOnUiThread(new c());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        UiThreadUtil.runOnUiThread(new d());
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void show() {
        if (this.mSurfaceDelegate.a()) {
            UiThreadUtil.runOnUiThread(new b());
        }
    }
}