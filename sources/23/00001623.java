package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xf.a;

/* loaded from: classes3.dex */
public abstract class NativeAnimatedTurboModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    public NativeAnimatedTurboModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    @a
    public abstract void addAnimatedEventToView(double d11, String str, ReadableMap readableMap);

    @ReactMethod
    @a
    public abstract void addListener(String str);

    @ReactMethod
    @a
    public abstract void connectAnimatedNodeToView(double d11, double d12);

    @ReactMethod
    @a
    public abstract void connectAnimatedNodes(double d11, double d12);

    @ReactMethod
    @a
    public abstract void createAnimatedNode(double d11, ReadableMap readableMap);

    @ReactMethod
    @a
    public abstract void disconnectAnimatedNodeFromView(double d11, double d12);

    @ReactMethod
    @a
    public abstract void disconnectAnimatedNodes(double d11, double d12);

    @ReactMethod
    @a
    public abstract void dropAnimatedNode(double d11);

    @ReactMethod
    @a
    public abstract void extractAnimatedNodeOffset(double d11);

    @ReactMethod
    @a
    public abstract void finishOperationBatch();

    @ReactMethod
    @a
    public abstract void flattenAnimatedNodeOffset(double d11);

    @ReactMethod
    @a
    public abstract void getValue(double d11, Callback callback);

    @ReactMethod
    @a
    public abstract void removeAnimatedEventFromView(double d11, String str, double d12);

    @ReactMethod
    @a
    public abstract void removeListeners(double d11);

    @ReactMethod
    @a
    public abstract void restoreDefaultValues(double d11);

    @ReactMethod
    @a
    public abstract void setAnimatedNodeOffset(double d11, double d12);

    @ReactMethod
    @a
    public abstract void setAnimatedNodeValue(double d11, double d12);

    @ReactMethod
    @a
    public abstract void startAnimatingNode(double d11, double d12, ReadableMap readableMap, Callback callback);

    @ReactMethod
    @a
    public abstract void startListeningToAnimatedNodeValue(double d11);

    @ReactMethod
    @a
    public abstract void startOperationBatch();

    @ReactMethod
    @a
    public abstract void stopAnimation(double d11);

    @ReactMethod
    @a
    public abstract void stopListeningToAnimatedNodeValue(double d11);
}