package com.facebook.react.fabric.events;

import com.facebook.jni.HybridData;
import com.facebook.react.fabric.b;
import com.facebook.react.uimanager.events.a;

/* loaded from: classes3.dex */
public class EventBeatManager implements a {
    @xf.a
    private final HybridData mHybridData;

    static {
        b.a();
    }

    private static native HybridData initHybrid();

    private native void tick();

    @Override // com.facebook.react.uimanager.events.a
    public void a() {
        tick();
    }
}