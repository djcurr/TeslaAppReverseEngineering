package com.tesla.TeslaV4.reactnative.module;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.tesla.command.VehicleConnectivityStateManager;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000e"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/HermesReactNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "getName", "Lcom/facebook/react/bridge/Dynamic;", "vehicleId", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "getVehicleOnlineState", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class HermesReactNativeModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HermesReactNativeModule(ReactApplicationContext context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "HermesModule";
    }

    @ReactMethod
    public final void getVehicleOnlineState(Dynamic vehicleId, Promise promise) {
        kotlin.jvm.internal.s.g(vehicleId, "vehicleId");
        kotlin.jvm.internal.s.g(promise, "promise");
        try {
            VehicleConnectivityStateManager vehicleConnectivityStateManager = VehicleConnectivityStateManager.f21488a;
            String asString = vehicleId.asString();
            kotlin.jvm.internal.s.f(asString, "vehicleId.asString()");
            String lowerCase = vehicleConnectivityStateManager.f(asString).name().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.s.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            promise.resolve(lowerCase);
        } catch (Exception unused) {
            String lowerCase2 = VehicleConnectivityStateManager.c.UNKNOWN.name().toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.s.f(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            promise.resolve(lowerCase2);
        }
    }
}