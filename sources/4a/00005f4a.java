package com.tesla.TeslaV4.firebase;

import android.os.Bundle;
import bx.d;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.tesla.TeslaV4.firebase.FirebaseAnalyticsModule;
import com.tesla.domain.model.DataRestrictedCountry;
import firebase.common.ReactNativeFirebaseModule;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0011\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J$\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007J!\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/tesla/TeslaV4/firebase/FirebaseAnalyticsModule;", "Lfirebase/common/ReactNativeFirebaseModule;", "", "getName", "name", "Lcom/facebook/react/bridge/ReadableMap;", "params", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "logEvent", "", "enabled", "setAnalyticsCollectionEnabled", "(Ljava/lang/Boolean;Lcom/facebook/react/bridge/Promise;)V", "screenName", "logScreenView", "properties", "setUserProperties", "isDataRestricted", "Z", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class FirebaseAnalyticsModule extends ReactNativeFirebaseModule {
    public static final a Companion = new a(null);
    private static final String SERVICE_NAME = "Analytics";
    private final boolean isDataRestricted;
    private final d module;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseAnalyticsModule(ReactApplicationContext reactContext) {
        super(reactContext, SERVICE_NAME);
        s.g(reactContext, "reactContext");
        this.isDataRestricted = DataRestrictedCountry.Companion.b(getContext());
        this.module = new d(reactContext, SERVICE_NAME);
    }

    public static /* synthetic */ void a(Promise promise, Task task) {
        m553setUserProperties$lambda3(promise, task);
    }

    public static /* synthetic */ void b(Promise promise, Task task) {
        m552setAnalyticsCollectionEnabled$lambda1(promise, task);
    }

    public static /* synthetic */ void c(Promise promise, Task task) {
        m550logEvent$lambda0(promise, task);
    }

    public static /* synthetic */ void d(Promise promise, Task task) {
        m551logScreenView$lambda2(promise, task);
    }

    /* renamed from: logEvent$lambda-0 */
    public static final void m550logEvent$lambda0(Promise promise, Task task) {
        s.g(promise, "$promise");
        s.g(task, "task");
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.Companion.a(promise, task.getException());
        }
    }

    /* renamed from: logScreenView$lambda-2 */
    public static final void m551logScreenView$lambda2(Promise promise, Task task) {
        s.g(promise, "$promise");
        s.g(task, "task");
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.Companion.a(promise, task.getException());
        }
    }

    /* renamed from: setAnalyticsCollectionEnabled$lambda-1 */
    public static final void m552setAnalyticsCollectionEnabled$lambda1(Promise promise, Task task) {
        s.g(promise, "$promise");
        s.g(task, "task");
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.Companion.a(promise, task.getException());
        }
    }

    /* renamed from: setUserProperties$lambda-3 */
    public static final void m553setUserProperties$lambda3(Promise promise, Task task) {
        s.g(promise, "$promise");
        s.g(task, "task");
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.Companion.a(promise, task.getException());
        }
    }

    @Override // firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "FirebaseAnalytics";
    }

    @ReactMethod
    public final void logEvent(String str, ReadableMap readableMap, final Promise promise) {
        s.g(promise, "promise");
        if (this.isDataRestricted) {
            promise.resolve(Boolean.TRUE);
        } else {
            this.module.e(str, Arguments.toBundle(readableMap)).addOnCompleteListener(new OnCompleteListener() { // from class: bs.c
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FirebaseAnalyticsModule.c(Promise.this, task);
                }
            });
        }
    }

    @ReactMethod
    public final void logScreenView(String str, ReadableMap readableMap, final Promise promise) {
        s.g(promise, "promise");
        if (this.isDataRestricted) {
            promise.resolve(Boolean.TRUE);
        } else {
            this.module.e("screen_view", Arguments.toBundle(readableMap)).addOnCompleteListener(new OnCompleteListener() { // from class: bs.d
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FirebaseAnalyticsModule.d(Promise.this, task);
                }
            });
        }
    }

    @ReactMethod
    public final void setAnalyticsCollectionEnabled(Boolean bool, final Promise promise) {
        s.g(promise, "promise");
        if (this.isDataRestricted) {
            promise.resolve(Boolean.TRUE);
        } else {
            this.module.g(bool).addOnCompleteListener(new OnCompleteListener() { // from class: bs.b
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FirebaseAnalyticsModule.b(Promise.this, task);
                }
            });
        }
    }

    @ReactMethod
    public final void setUserProperties(ReadableMap properties, final Promise promise) {
        s.g(properties, "properties");
        s.g(promise, "promise");
        if (this.isDataRestricted) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        Bundle bundle = Arguments.toBundle(properties);
        Objects.requireNonNull(bundle, "null cannot be cast to non-null type android.os.Bundle");
        this.module.i(bundle).addOnCompleteListener(new OnCompleteListener() { // from class: bs.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                FirebaseAnalyticsModule.a(Promise.this, task);
            }
        });
    }
}