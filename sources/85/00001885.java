package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

@xf.a
/* loaded from: classes3.dex */
public class CoreComponentsRegistry {
    @xf.a
    private final HybridData mHybridData;

    static {
        SoLoader.p("fabricjni");
    }

    @xf.a
    private CoreComponentsRegistry(ComponentFactory componentFactory) {
        this.mHybridData = initHybrid(componentFactory);
    }

    @xf.a
    private native HybridData initHybrid(ComponentFactory componentFactory);

    @xf.a
    public static CoreComponentsRegistry register(ComponentFactory componentFactory) {
        return new CoreComponentsRegistry(componentFactory);
    }
}