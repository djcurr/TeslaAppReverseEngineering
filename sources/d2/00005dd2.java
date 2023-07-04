package com.swmansion.reanimated.layoutReanimation;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.reanimated.ReanimatedModule;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes6.dex */
public class LayoutAnimations {
    private WeakReference<ReactApplicationContext> mContext;
    @xf.a
    private final HybridData mHybridData = initHybrid();

    static {
        System.loadLibrary("reanimated");
    }

    public LayoutAnimations(ReactApplicationContext reactApplicationContext) {
        this.mContext = new WeakReference<>(reactApplicationContext);
    }

    private native HybridData initHybrid();

    private void notifyAboutEnd(int i11, int i12) {
        ReactApplicationContext reactApplicationContext = this.mContext.get();
        if (reactApplicationContext != null) {
            ((ReanimatedModule) reactApplicationContext.getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager().notifyAboutEnd(i11, i12 != 0);
        }
    }

    private void notifyAboutProgress(Map<String, Object> map, int i11) {
        ReactApplicationContext reactApplicationContext = this.mContext.get();
        if (reactApplicationContext != null) {
            ((ReanimatedModule) reactApplicationContext.getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager().notifyAboutProgress(map, Integer.valueOf(i11));
        }
    }

    public native boolean isLayoutAnimationEnabled();

    public native void removeConfigForTag(int i11);

    public native void startAnimationForTag(int i11, String str, Map<String, String> map);
}