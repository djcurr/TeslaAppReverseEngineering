package xr;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class a {
    public static final DeviceEventManagerModule.RCTDeviceEventEmitter a(ReactContext reactContext) {
        s.g(reactContext, "<this>");
        JavaScriptModule jSModule = reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        s.f(jSModule, "this.getJSModule(DeviceE…EventEmitter::class.java)");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule;
    }

    public static final UIManagerModule b(ReactContext reactContext) {
        s.g(reactContext, "<this>");
        NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
        s.e(nativeModule);
        s.f(nativeModule, "this.getNativeModule(UIM…agerModule::class.java)!!");
        return (UIManagerModule) nativeModule;
    }
}