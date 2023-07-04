package com.facebook.react.modules.network;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class n {
    public static void a(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i11, WritableMap writableMap) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i11);
        createArray.pushMap(writableMap);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didReceiveNetworkData", createArray);
        }
    }

    public static void b(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i11, String str) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i11);
        createArray.pushString(str);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didReceiveNetworkData", createArray);
        }
    }

    public static void c(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i11, long j11, long j12) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i11);
        createArray.pushInt((int) j11);
        createArray.pushInt((int) j12);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didReceiveNetworkDataProgress", createArray);
        }
    }

    public static void d(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i11, long j11, long j12) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i11);
        createArray.pushInt((int) j11);
        createArray.pushInt((int) j12);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didSendNetworkData", createArray);
        }
    }

    public static void e(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i11, String str, long j11, long j12) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i11);
        createArray.pushString(str);
        createArray.pushInt((int) j11);
        createArray.pushInt((int) j12);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didReceiveNetworkIncrementalData", createArray);
        }
    }

    public static void f(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i11, String str, Throwable th2) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i11);
        createArray.pushString(str);
        if (th2 != null && th2.getClass() == SocketTimeoutException.class) {
            createArray.pushBoolean(true);
        }
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didCompleteNetworkResponse", createArray);
        }
    }

    public static void g(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i11) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i11);
        createArray.pushNull();
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didCompleteNetworkResponse", createArray);
        }
    }

    public static void h(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i11, int i12, WritableMap writableMap, String str) {
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i11);
        createArray.pushInt(i12);
        createArray.pushMap(writableMap);
        createArray.pushString(str);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit("didReceiveNetworkResponse", createArray);
        }
    }
}