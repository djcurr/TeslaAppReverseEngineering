package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes3.dex */
public class n0 extends ReactContext {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f12376a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12377b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12378c;

    public n0(ReactApplicationContext reactApplicationContext, Context context, String str, int i11) {
        super(context);
        if (reactApplicationContext.hasCatalystInstance()) {
            initializeWithInstance(reactApplicationContext.getCatalystInstance());
        }
        this.f12376a = reactApplicationContext;
        this.f12377b = str;
        this.f12378c = i11;
    }

    public String a() {
        return this.f12377b;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void addLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f12376a.addLifecycleEventListener(lifecycleEventListener);
    }

    public ReactApplicationContext b() {
        return this.f12376a;
    }

    public int c() {
        return this.f12378c;
    }

    @Override // com.facebook.react.bridge.ReactContext
    public Activity getCurrentActivity() {
        return this.f12376a.getCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public JSIModule getJSIModule(JSIModuleType jSIModuleType) {
        if (isBridgeless()) {
            return this.f12376a.getJSIModule(jSIModuleType);
        }
        return super.getJSIModule(jSIModuleType);
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean hasCurrentActivity() {
        return this.f12376a.hasCurrentActivity();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public boolean isBridgeless() {
        return this.f12376a.isBridgeless();
    }

    @Override // com.facebook.react.bridge.ReactContext
    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.f12376a.removeLifecycleEventListener(lifecycleEventListener);
    }
}