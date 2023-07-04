package com.swmansion.reanimated;

import android.os.SystemClock;
import android.util.Log;
import bg.b;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.o;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.layoutReanimation.AnimationsManager;
import com.swmansion.reanimated.layoutReanimation.LayoutAnimations;
import com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder;
import com.swmansion.reanimated.sensor.ReanimatedSensorContainer;
import com.swmansion.reanimated.sensor.ReanimatedSensorType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class NativeProxy {
    private final wr.a gestureHandlerStateManager;
    private final WeakReference<ReactApplicationContext> mContext;
    @xf.a
    private final HybridData mHybridData;
    private NodesManager mNodesManager;
    private Scheduler mScheduler;
    private ReanimatedSensorContainer reanimatedSensorContainer;
    private Long firstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean slowAnimationsEnabled = false;

    @xf.a
    /* loaded from: classes6.dex */
    public static class AnimationFrameCallback implements NodesManager.OnAnimationFrame {
        @xf.a
        private final HybridData mHybridData;

        @xf.a
        private AnimationFrameCallback(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        @Override // com.swmansion.reanimated.NodesManager.OnAnimationFrame
        public native void onAnimationFrame(double d11);
    }

    @xf.a
    /* loaded from: classes6.dex */
    public static class EventHandler implements RCTEventEmitter {
        private UIManagerModule.d mCustomEventNamesResolver;
        @xf.a
        private final HybridData mHybridData;

        @xf.a
        private EventHandler(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        @Override // com.facebook.react.uimanager.events.RCTEventEmitter
        public void receiveEvent(int i11, String str, WritableMap writableMap) {
            String a11 = this.mCustomEventNamesResolver.a(str);
            receiveEvent(i11 + a11, writableMap);
        }

        public native void receiveEvent(String str, WritableMap writableMap);

        @Override // com.facebook.react.uimanager.events.RCTEventEmitter
        public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        }
    }

    @xf.a
    /* loaded from: classes6.dex */
    public static class SensorSetter {
        @xf.a
        private final HybridData mHybridData;

        @xf.a
        private SensorSetter(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void sensorSetter(float[] fArr);
    }

    static {
        System.loadLibrary("reanimated");
    }

    public NativeProxy(ReactApplicationContext reactApplicationContext) {
        wr.a aVar = null;
        this.mScheduler = null;
        CallInvokerHolderImpl callInvokerHolderImpl = (CallInvokerHolderImpl) reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder();
        LayoutAnimations layoutAnimations = new LayoutAnimations(reactApplicationContext);
        this.mScheduler = new Scheduler(reactApplicationContext);
        this.mHybridData = initHybrid(reactApplicationContext.getJavaScriptContextHolder().get(), callInvokerHolderImpl, this.mScheduler, layoutAnimations);
        WeakReference<ReactApplicationContext> weakReference = new WeakReference<>(reactApplicationContext);
        this.mContext = weakReference;
        prepare(layoutAnimations);
        this.reanimatedSensorContainer = new ReanimatedSensorContainer(weakReference);
        addDevMenuOption();
        try {
            RNGestureHandlerModule.a aVar2 = RNGestureHandlerModule.Companion;
            aVar = (wr.a) reactApplicationContext.getNativeModule(RNGestureHandlerModule.class);
        } catch (ClassCastException | ClassNotFoundException unused) {
        }
        this.gestureHandlerStateManager = aVar;
    }

    private void addDevMenuOption() {
        if (this.mContext.get().getApplicationContext() instanceof o) {
            ((o) this.mContext.get().getApplicationContext()).c().getReactInstanceManager().B().s("Toggle slow animations (Reanimated)", new b(this) { // from class: com.swmansion.reanimated.a
            });
        }
    }

    @xf.a
    private void configureProps(ReadableNativeArray readableNativeArray, ReadableNativeArray readableNativeArray2) {
        this.mNodesManager.configureProps(convertProps(readableNativeArray), convertProps(readableNativeArray2));
    }

    private Set<String> convertProps(ReadableNativeArray readableNativeArray) {
        HashSet hashSet = new HashSet();
        ArrayList<Object> arrayList = readableNativeArray.toArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            hashSet.add((String) arrayList.get(i11));
        }
        return hashSet;
    }

    @xf.a
    private String getUptime() {
        if (this.slowAnimationsEnabled) {
            return Long.toString(this.firstUptime.longValue() + ((SystemClock.uptimeMillis() - this.firstUptime.longValue()) / 10));
        }
        return Long.toString(SystemClock.uptimeMillis());
    }

    private native HybridData initHybrid(long j11, CallInvokerHolderImpl callInvokerHolderImpl, Scheduler scheduler, LayoutAnimations layoutAnimations);

    private native void installJSIBindings();

    @xf.a
    private float[] measure(int i11) {
        return this.mNodesManager.measure(i11);
    }

    @xf.a
    private String obtainProp(int i11, String str) {
        return this.mNodesManager.obtainProp(i11, str);
    }

    @xf.a
    private void registerEventHandler(EventHandler eventHandler) {
        eventHandler.mCustomEventNamesResolver = this.mNodesManager.getEventNameResolver();
        this.mNodesManager.registerEventHandler(eventHandler);
    }

    @xf.a
    private int registerSensor(int i11, int i12, SensorSetter sensorSetter) {
        return this.reanimatedSensorContainer.registerSensor(ReanimatedSensorType.getInstanceById(i11), i12, sensorSetter);
    }

    @xf.a
    private void requestRender(AnimationFrameCallback animationFrameCallback) {
        this.mNodesManager.postOnAnimation(animationFrameCallback);
    }

    @xf.a
    private void scrollTo(int i11, double d11, double d12, boolean z11) {
        this.mNodesManager.scrollTo(i11, d11, d12, z11);
    }

    @xf.a
    private void setGestureState(int i11, int i12) {
        wr.a aVar = this.gestureHandlerStateManager;
        if (aVar != null) {
            aVar.setGestureHandlerState(i11, i12);
        }
    }

    private void toggleSlowAnimations() {
        boolean z11 = !this.slowAnimationsEnabled;
        this.slowAnimationsEnabled = z11;
        if (z11) {
            this.firstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    @xf.a
    private void unregisterSensor(int i11) {
        this.reanimatedSensorContainer.unregisterSensor(i11);
    }

    @xf.a
    private void updateProps(int i11, Map<String, Object> map) {
        this.mNodesManager.updateProps(i11, map);
    }

    public Scheduler getScheduler() {
        return this.mScheduler;
    }

    public native boolean isAnyHandlerWaitingForEvent(String str);

    public void onCatalystInstanceDestroy() {
        this.mScheduler.deactivate();
        this.mHybridData.resetNative();
    }

    public void prepare(final LayoutAnimations layoutAnimations) {
        if (!Utils.isChromeDebugger) {
            this.mNodesManager = ((ReanimatedModule) this.mContext.get().getNativeModule(ReanimatedModule.class)).getNodesManager();
            installJSIBindings();
            AnimationsManager animationsManager = ((ReanimatedModule) this.mContext.get().getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager();
            final WeakReference weakReference = new WeakReference(layoutAnimations);
            animationsManager.setNativeMethods(new NativeMethodsHolder() { // from class: com.swmansion.reanimated.NativeProxy.1
                @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
                public boolean isLayoutAnimationEnabled() {
                    return layoutAnimations.isLayoutAnimationEnabled();
                }

                @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
                public void removeConfigForTag(int i11) {
                    LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                    if (layoutAnimations2 != null) {
                        layoutAnimations2.removeConfigForTag(i11);
                    }
                }

                @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
                public void startAnimationForTag(int i11, String str, HashMap<String, Float> hashMap) {
                    LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                    if (layoutAnimations2 != null) {
                        HashMap hashMap2 = new HashMap();
                        for (String str2 : hashMap.keySet()) {
                            hashMap2.put(str2, hashMap.get(str2).toString());
                        }
                        layoutAnimations2.startAnimationForTag(i11, str, hashMap2);
                    }
                }
            });
            return;
        }
        Log.w("[REANIMATED]", "You can not use LayoutAnimation with enabled Chrome Debugger");
    }
}