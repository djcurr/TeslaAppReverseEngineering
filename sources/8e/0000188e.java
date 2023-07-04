package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;

/* loaded from: classes3.dex */
public class SurfaceHandlerBinding implements d {
    @xf.a
    private final HybridData mHybridData;

    static {
        b.a();
    }

    private native String getModuleNameNative();

    private native int getSurfaceIdNative();

    private static native HybridData initHybrid(int i11, String str);

    private native boolean isRunningNative();

    private native void setDisplayModeNative(int i11);

    private native void setLayoutConstraintsNative(float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, boolean z12, float f17);

    private native void setPropsNative(NativeMap nativeMap);

    private native void setSurfaceIdNative(int i11);

    private native void startNative();

    private native void stopNative();

    @Override // com.facebook.react.fabric.d
    public int a() {
        return getSurfaceIdNative();
    }

    @Override // com.facebook.react.fabric.d
    public void b(int i11) {
        setSurfaceIdNative(i11);
    }

    @Override // com.facebook.react.fabric.d
    public void c(boolean z11) {
        setDisplayModeNative(!z11 ? 1 : 0);
    }

    @Override // com.facebook.react.fabric.d
    public String d() {
        return getModuleNameNative();
    }

    @Override // com.facebook.react.fabric.d
    public boolean isRunning() {
        return isRunningNative();
    }

    @Override // com.facebook.react.fabric.d
    public void start() {
        startNative();
    }

    @Override // com.facebook.react.fabric.d
    public void stop() {
        stopNative();
    }
}