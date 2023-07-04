package com.tesla.TeslaV4.reactnative.module;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\u0010"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/MapUtilsModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "getName", "Lcom/facebook/react/bridge/ReadableMap;", "fromLocationDictionary", "toLocationDictionary", "mapType", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "openMapsWithDirections", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class MapUtilsModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapUtilsModule(ReactApplicationContext context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MapUtilsModule";
    }

    @ReactMethod
    public final void openMapsWithDirections(ReadableMap fromLocationDictionary, ReadableMap toLocationDictionary, String mapType, Promise promise) {
        kotlin.jvm.internal.s.g(fromLocationDictionary, "fromLocationDictionary");
        kotlin.jvm.internal.s.g(toLocationDictionary, "toLocationDictionary");
        kotlin.jvm.internal.s.g(mapType, "mapType");
        kotlin.jvm.internal.s.g(promise, "promise");
        d dVar = d.f21426a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
        dVar.a(reactApplicationContext, fromLocationDictionary, toLocationDictionary, mapType, promise);
    }
}