package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.RuntimeScheduler;
import com.facebook.react.fabric.events.EventBeatManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;

@xf.a
/* loaded from: classes3.dex */
public class Binding {
    @xf.a
    private final HybridData mHybridData = initHybrid();

    static {
        b.a();
    }

    private static native HybridData initHybrid();

    private native void installFabricUIManager(RuntimeExecutor runtimeExecutor, RuntimeScheduler runtimeScheduler, Object obj, EventBeatManager eventBeatManager, ComponentFactory componentFactory, Object obj2);

    private native void uninstallFabricUIManager();

    public void a() {
        uninstallFabricUIManager();
    }

    public native void driveCxxAnimations();

    public native ReadableNativeMap getInspectorDataForInstance(EventEmitterWrapper eventEmitterWrapper);

    public native void registerSurface(SurfaceHandlerBinding surfaceHandlerBinding);

    public native void renderTemplateToSurface(int i11, String str);

    public native void setConstraints(int i11, float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, boolean z12);

    public native void setPixelDensity(float f11);

    public native void startSurface(int i11, String str, NativeMap nativeMap);

    public native void startSurfaceWithConstraints(int i11, String str, NativeMap nativeMap, float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, boolean z12);

    public native void stopSurface(int i11);

    public native void unregisterSurface(SurfaceHandlerBinding surfaceHandlerBinding);
}