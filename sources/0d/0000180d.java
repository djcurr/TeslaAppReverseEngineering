package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import xf.a;

@a
/* loaded from: classes3.dex */
public abstract class NativeMap {
    @a
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    public NativeMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native String toString();
}