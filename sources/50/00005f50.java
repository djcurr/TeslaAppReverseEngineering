package com.tesla.TeslaV4.reactnative.module;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\r"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/CommandCenterNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "getName", "request", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "sendCommand", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CommandCenterNativeModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommandCenterNativeModule(ReactApplicationContext context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public static /* synthetic */ void a(Promise promise, ot.e eVar) {
        m554sendCommand$lambda1(promise, eVar);
    }

    /* renamed from: sendCommand$lambda-1 */
    public static final void m554sendCommand$lambda1(Promise promise, ot.e response) {
        kotlin.jvm.internal.s.g(promise, "$promise");
        kotlin.jvm.internal.s.g(response, "response");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("result", ot.e.f44018j.encodeByteString(response).a());
        promise.resolve(writableNativeMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CommandCenter";
    }

    @ReactMethod
    public final void sendCommand(String request, final Promise promise) {
        kotlin.jvm.internal.s.g(request, "request");
        kotlin.jvm.internal.s.g(promise, "promise");
        Context appContext = getReactApplicationContext().getApplicationContext();
        qs.a aVar = qs.a.f48438a;
        kotlin.jvm.internal.s.f(appContext, "appContext");
        ss.q.f50617j.a(appContext).b(aVar.a(appContext, ot.c.f44007i.decode(zu.j.a(request))), new uu.d() { // from class: com.tesla.TeslaV4.reactnative.module.c
            @Override // uu.d
            public final void a(ot.e eVar) {
                CommandCenterNativeModule.a(Promise.this, eVar);
            }
        });
    }
}