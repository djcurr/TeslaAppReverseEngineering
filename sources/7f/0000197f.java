package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes3.dex */
public class ReactEventEmitter implements RCTModernEventEmitter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ReactEventEmitter";
    private RCTModernEventEmitter mFabricEventEmitter = null;
    private RCTEventEmitter mRCTEventEmitter = null;
    private final ReactApplicationContext mReactContext;

    public ReactEventEmitter(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
    }

    private RCTEventEmitter getEventEmitter(int i11) {
        int a11 = og.a.a(i11);
        if (this.mRCTEventEmitter == null) {
            if (this.mReactContext.hasActiveReactInstance()) {
                this.mRCTEventEmitter = (RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class);
            } else {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get RCTEventEmitter from Context for reactTag: " + i11 + " - uiManagerType: " + a11 + " - No active Catalyst instance!"));
            }
        }
        return this.mRCTEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i11, String str, WritableMap writableMap) {
        receiveEvent(-1, i11, str, writableMap);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        wf.a.a(writableArray.size() > 0);
        int i11 = writableArray.getMap(0).getInt("target");
        if (og.a.a(i11) != 1 || getEventEmitter(i11) == null) {
            return;
        }
        this.mRCTEventEmitter.receiveTouches(str, writableArray, writableArray2);
    }

    public void register(int i11, RCTModernEventEmitter rCTModernEventEmitter) {
        this.mFabricEventEmitter = rCTModernEventEmitter;
    }

    public void unregister(int i11) {
        if (i11 == 1) {
            this.mRCTEventEmitter = null;
        } else {
            this.mFabricEventEmitter = null;
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i11, int i12, String str, WritableMap writableMap) {
        receiveEvent(i11, i12, str, false, 0, writableMap, 2);
    }

    public void register(int i11, RCTEventEmitter rCTEventEmitter) {
        this.mRCTEventEmitter = rCTEventEmitter;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i11, int i12, String str, boolean z11, int i13, WritableMap writableMap, int i14) {
        RCTModernEventEmitter rCTModernEventEmitter;
        int a11 = og.a.a(i12);
        if (a11 == 2 && (rCTModernEventEmitter = this.mFabricEventEmitter) != null) {
            rCTModernEventEmitter.receiveEvent(i11, i12, str, z11, i13, writableMap, i14);
        } else if (a11 == 1 && getEventEmitter(i12) != null) {
            this.mRCTEventEmitter.receiveEvent(i12, str, writableMap);
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot find EventEmitter for receiveEvent: SurfaceId[" + i11 + "] ReactTag[" + i12 + "] UIManagerType[" + a11 + "] EventName[" + str + "]"));
        }
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveTouches(j jVar) {
        RCTModernEventEmitter rCTModernEventEmitter;
        int viewTag = jVar.getViewTag();
        int a11 = og.a.a(viewTag);
        if (a11 == 2 && (rCTModernEventEmitter = this.mFabricEventEmitter) != null) {
            rCTModernEventEmitter.receiveTouches(jVar);
        } else if (a11 == 1 && getEventEmitter(viewTag) != null) {
            m.d(this.mRCTEventEmitter, jVar);
        } else {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot find EventEmitter for receivedTouches: ReactTag[" + viewTag + "] UIManagerType[" + a11 + "] EventName[" + jVar.getEventName() + "]"));
        }
    }
}