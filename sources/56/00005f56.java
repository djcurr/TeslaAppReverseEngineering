package com.tesla.TeslaV4.reactnative.module;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.tesla.logging.TeslaLog;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import yu.g;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/LocationNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "getName", "Lcom/facebook/react/bridge/ReadableMap;", "locationMap", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "reverseGeocodeAsync", "getCountryCodeUsingPhoneLocation", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class LocationNativeModule extends ReactContextBaseJavaModule {

    /* loaded from: classes6.dex */
    public static final class a implements yu.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WritableNativeArray f21391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f21392b;

        a(WritableNativeArray writableNativeArray, Promise promise) {
            this.f21391a = writableNativeArray;
            this.f21392b = promise;
        }

        @Override // yu.p
        public void a() {
            this.f21392b.resolve(this.f21391a);
        }

        @Override // yu.p
        public void b(Map<String, String> addressMapping) {
            kotlin.jvm.internal.s.g(addressMapping, "addressMapping");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            for (Map.Entry<String, String> entry : addressMapping.entrySet()) {
                writableNativeMap.putString(entry.getKey(), entry.getValue());
            }
            this.f21391a.pushMap(writableNativeMap);
            this.f21392b.resolve(this.f21391a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationNativeModule(ReactApplicationContext context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void getCountryCodeUsingPhoneLocation(com.facebook.react.bridge.Promise r8) {
        /*
            r7 = this;
            java.lang.String r0 = "promise"
            kotlin.jvm.internal.s.g(r8, r0)
            zu.f r0 = zu.f.f60769a
            com.facebook.react.bridge.ReactApplicationContext r1 = r7.getReactApplicationContext()
            java.lang.String r2 = "reactApplicationContext"
            kotlin.jvm.internal.s.f(r1, r2)
            java.lang.String r1 = r0.a(r1)
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L21
            boolean r5 = kotlin.text.m.w(r1)
            if (r5 == 0) goto L1f
            goto L21
        L1f:
            r5 = r4
            goto L22
        L21:
            r5 = r3
        L22:
            r6 = 0
            if (r5 != 0) goto L26
            goto L27
        L26:
            r1 = r6
        L27:
            java.lang.String r5 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            if (r1 != 0) goto L88
            com.facebook.react.bridge.ReactApplicationContext r1 = r7.getReactApplicationContext()
            kotlin.jvm.internal.s.f(r1, r2)
            java.lang.String r0 = r0.b(r1)
            if (r0 == 0) goto L40
            boolean r1 = kotlin.text.m.w(r0)
            if (r1 == 0) goto L3f
            goto L40
        L3f:
            r3 = r4
        L40:
            if (r3 != 0) goto L43
            r6 = r0
        L43:
            if (r6 != 0) goto L7b
            com.facebook.react.bridge.ReactApplicationContext r0 = r7.getReactApplicationContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L75
            java.util.Locale r0 = r0.get(r4)
            java.lang.String r0 = r0.getCountry()
            java.lang.String r1 = "primary.country"
            kotlin.jvm.internal.s.f(r0, r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            kotlin.jvm.internal.s.f(r0, r5)
            r8.resolve(r0)
            return
        L75:
            java.lang.String r0 = ""
            r8.resolve(r0)
            return
        L7b:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r6.toUpperCase(r0)
            kotlin.jvm.internal.s.f(r0, r5)
            r8.resolve(r0)
            return
        L88:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toUpperCase(r0)
            kotlin.jvm.internal.s.f(r0, r5)
            r8.resolve(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.TeslaV4.reactnative.module.LocationNativeModule.getCountryCodeUsingPhoneLocation(com.facebook.react.bridge.Promise):void");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "LocationModule";
    }

    @ReactMethod
    public final void reverseGeocodeAsync(ReadableMap locationMap, Promise promise) {
        kotlin.jvm.internal.s.g(locationMap, "locationMap");
        kotlin.jvm.internal.s.g(promise, "promise");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        try {
            double d11 = locationMap.getDouble("latitude");
            double d12 = locationMap.getDouble("longitude");
            g.a aVar = yu.g.f59787c;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
            aVar.a(reactApplicationContext).c(d11, d12, Locale.getDefault().toString(), new a(writableNativeArray, promise));
        } catch (Exception e11) {
            TeslaLog.INSTANCE.e(getName(), "Failed to reverse geocode", e11);
            promise.resolve(writableNativeArray);
        }
    }
}