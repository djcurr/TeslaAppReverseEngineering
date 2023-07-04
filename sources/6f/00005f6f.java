package com.tesla.TeslaV4.reactnative.module;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0007R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/ReportNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "getName", "Lvz/b0;", "shareReport", "shareLogs", "request", "sendReport", "Lqu/h;", "reportService$delegate", "Lvz/k;", "getReportService", "()Lqu/h;", "reportService", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ReportNativeModule extends ReactContextBaseJavaModule {
    public static final a Companion = new a(null);
    private static final String TAG = "ReportServiceModule";
    private static final com.tesla.logging.g logger = com.tesla.logging.g.f21878b.a(TAG);
    private final vz.k reportService$delegate;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<qu.h> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final qu.h invoke() {
            Context applicationContext = ReportNativeModule.this.getReactApplicationContext().getApplicationContext();
            kotlin.jvm.internal.s.f(applicationContext, "reactApplicationContext.applicationContext");
            return new qu.h(applicationContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportNativeModule(ReactApplicationContext context) {
        super(context);
        vz.k a11;
        kotlin.jvm.internal.s.g(context, "context");
        a11 = vz.m.a(new b());
        this.reportService$delegate = a11;
    }

    private final qu.h getReportService() {
        return (qu.h) this.reportService$delegate.getValue();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void sendReport(String request) {
        kotlin.jvm.internal.s.g(request, "request");
        com.teslamotors.plugins.ble.b.I(getReactApplicationContext().getApplicationContext(), "from ReportNativeModule#sendReport").w0(zu.j.a(request));
    }

    @ReactMethod
    public final void shareLogs() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        qu.l.f48495a.c(currentActivity);
    }

    @ReactMethod
    public final void shareReport() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        qu.l.f48495a.f(currentActivity);
    }
}