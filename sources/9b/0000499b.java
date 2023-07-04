package com.reactnativecompressor.Video;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactnativecompressor.Video.a;
import cr.b;

@fg.a(name = VideoModule.NAME)
/* loaded from: classes2.dex */
public class VideoModule extends ReactContextBaseJavaModule {
    public static final String NAME = "VideoCompressor";
    private static final String TAG = "react-native-compessor";
    private final ReactApplicationContext reactContext;

    public VideoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void activateBackgroundTask(ReadableMap readableMap, Promise promise) {
        try {
            promise.resolve(a.i(readableMap, this.reactContext));
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ReactMethod
    public void cancelCompression(String str) {
        b.b(str);
        Log.d("cancelCompression", str);
    }

    @ReactMethod
    public void compress(String str, ReadableMap readableMap, Promise promise) {
        a g11 = a.g(readableMap);
        String e11 = b.e(str, this.reactContext);
        if (g11.f20189a == a.c.auto) {
            a.a(e11, g11, promise, this.reactContext);
        } else {
            a.b(e11, g11, promise, this.reactContext);
        }
    }

    @ReactMethod
    public void deactivateBackgroundTask(ReadableMap readableMap, Promise promise) {
        try {
            promise.resolve(a.j(readableMap, this.reactContext));
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void upload(String str, ReadableMap readableMap, Promise promise) {
        try {
            a.k(str, readableMap, this.reactContext, promise);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }
}