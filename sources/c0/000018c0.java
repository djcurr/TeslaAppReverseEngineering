package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;

@fg.a(name = TimingModule.NAME)
/* loaded from: classes3.dex */
public final class TimingModule extends NativeTimingSpec implements LifecycleEventListener, eg.c {
    public static final String NAME = "Timing";
    private final d mJavaTimerManager;

    /* loaded from: classes3.dex */
    public class a implements c {
        public a() {
        }

        @Override // com.facebook.react.modules.core.c
        public void callIdleCallbacks(double d11) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).callIdleCallbacks(d11);
            }
        }

        @Override // com.facebook.react.modules.core.c
        public void callTimers(WritableArray writableArray) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).callTimers(writableArray);
            }
        }

        @Override // com.facebook.react.modules.core.c
        public void emitTimeDriftWarning(String str) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = TimingModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((JSTimers) reactApplicationContextIfActiveOrWarn.getJSModule(JSTimers.class)).emitTimeDriftWarning(str);
            }
        }
    }

    public TimingModule(ReactApplicationContext reactApplicationContext, bg.d dVar) {
        super(reactApplicationContext);
        this.mJavaTimerManager = new d(reactApplicationContext, new a(), g.i(), dVar);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void createTimer(double d11, double d12, double d13, boolean z11) {
        this.mJavaTimerManager.q((int) d11, (int) d12, d13, z11);
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void deleteTimer(double d11) {
        this.mJavaTimerManager.deleteTimer((int) d11);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public boolean hasActiveTimersInRange(long j11) {
        return this.mJavaTimerManager.r(j11);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        eg.b.e(getReactApplicationContext()).c(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        eg.b.e(reactApplicationContext).h(this);
        this.mJavaTimerManager.A();
        reactApplicationContext.removeLifecycleEventListener(this);
    }

    @Override // eg.c
    public void onHeadlessJsTaskFinish(int i11) {
        this.mJavaTimerManager.v(i11);
    }

    @Override // eg.c
    public void onHeadlessJsTaskStart(int i11) {
        this.mJavaTimerManager.w(i11);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mJavaTimerManager.x();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mJavaTimerManager.y();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mJavaTimerManager.z();
    }

    @Override // com.facebook.fbreact.specs.NativeTimingSpec
    public void setSendIdleEvents(boolean z11) {
        this.mJavaTimerManager.setSendIdleEvents(z11);
    }
}