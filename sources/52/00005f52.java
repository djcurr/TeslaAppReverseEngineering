package com.tesla.TeslaV4.reactnative.module;

import android.app.Application;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.r0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\t\u001a\u00020\u0007H\u0007¨\u0006\u0010"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/JsLifeCycleNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "getName", "", "isCnUser", "analyticsId", "Lvz/b0;", "onUserLogin", "onLoginSuccess", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class JsLifeCycleNativeModule extends ReactContextBaseJavaModule {
    public static final a Companion = new a(null);
    private static final String TAG = "JsLifeCycleModule";
    private static final com.tesla.logging.g log = com.tesla.logging.g.f21878b.a(TAG);

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsLifeCycleNativeModule(ReactApplicationContext context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void onLoginSuccess() {
        log.i("onLoginSuccess");
    }

    @ReactMethod
    public final void onUserLogin(boolean z11, String str) {
        Map f11;
        Map f12;
        log.i("onUserLogin");
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        com.wix.reactnativenotifications.i.e((Application) applicationContext);
        if (zu.q.a()) {
            try {
                Method method = Class.forName("com.tesla.android.react.maps.BaiduMapsPackage").getMethod("initialize", Context.class);
                kotlin.jvm.internal.s.f(method, "clazz.getMethod(\"initialize\", Context::class.java)");
                method.invoke(null, getReactApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                com.tesla.logging.g gVar = log;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String h11 = gVar.h();
                ht.a aVar = ht.a.f29422a;
                f12 = r0.f(vz.v.a(h11, "Cannot initialize BaiduMapsPackage"));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : f12.entrySet()) {
                    ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception("Cannot initialize BaiduMapsPackage"));
                TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
                n80.a.a("Cannot initialize BaiduMapsPackage", new Object[0]);
            } catch (NoSuchMethodException unused2) {
                com.tesla.logging.g gVar2 = log;
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String h12 = gVar2.h();
                ht.a aVar2 = ht.a.f29422a;
                f11 = r0.f(vz.v.a(h12, "Cannot find initialize method"));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : f11.entrySet()) {
                    ht.a.f29422a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception("Cannot find initialize method"));
                TeslaLog.setTag$default(teslaLog2, h12, false, 2, null);
                n80.a.a("Cannot find initialize method", new Object[0]);
            }
        }
        if (str == null) {
            return;
        }
        as.a.f6719a.b(str);
    }
}