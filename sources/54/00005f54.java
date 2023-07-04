package com.tesla.TeslaV4.reactnative.module;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000f"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/LocalizationModuleNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "getName", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "shouldRestrictDataCollection", "belongsToRegionCN", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class LocalizationModuleNativeModule extends ReactContextBaseJavaModule {
    public static final a Companion = new a(null);
    private static final String TAG = "LocalizationModule";

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalizationModuleNativeModule(ReactApplicationContext context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
    }

    @ReactMethod
    public final void belongsToRegionCN(Promise promise) {
        kotlin.jvm.internal.s.g(promise, "promise");
        promise.resolve(Boolean.valueOf(zu.q.a()));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void shouldRestrictDataCollection(Promise promise) {
        kotlin.jvm.internal.s.g(promise, "promise");
        promise.resolve(Boolean.valueOf(zu.q.a()));
    }
}