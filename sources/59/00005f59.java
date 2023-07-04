package com.tesla.TeslaV4.reactnative.module;

import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ku.a;
import ku.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\tH\u0007J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\tH\u0007J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\tH\u0007R\u0016\u0010\u001b\u001a\u00020\u00188B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/MonitoringServiceModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "traceValue", "Lkotlin/Function1;", "Ltt/l;", "Lvz/b0;", "onParseTrace", "parseTraceValue", "", "getName", "", "enabled", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "setMonitoringEnabled", "startTrace", "endTrace", "cancelTrace", "attributes", "endTraceWithAttributes", "trace", "startHTTPTrace", "endHTTPTrace", "Lku/e;", "getMonitoringService", "()Lku/e;", "monitoringService", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class MonitoringServiceModule extends ReactContextBaseJavaModule {

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21393a = new int[tt.l.values().length];
    }

    /* loaded from: classes6.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<tt.l, vz.b0> {
        b() {
            super(1);
        }

        public final void a(tt.l it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            MonitoringServiceModule.this.getMonitoringService().h(it2);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(tt.l lVar) {
            a(lVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<tt.l, vz.b0> {
        c() {
            super(1);
        }

        public final void a(tt.l it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            e.b.c(MonitoringServiceModule.this.getMonitoringService(), it2, null, null, 6, null);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(tt.l lVar) {
            a(lVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.l<tt.l, vz.b0> {
        d() {
            super(1);
        }

        public final void a(tt.l it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            e.b.b(MonitoringServiceModule.this.getMonitoringService(), it2, null, 2, null);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(tt.l lVar) {
            a(lVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonitoringServiceModule(ReactApplicationContext context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ku.e getMonitoringService() {
        return ku.e.f35884a.a();
    }

    private final void parseTraceValue(int i11, h00.l<? super tt.l, vz.b0> lVar) {
        tt.l a11 = tt.l.Companion.a(i11);
        if ((a11 == null ? -1 : a.f21393a[a11.ordinal()]) != -1) {
            lVar.mo12invoke(a11);
            return;
        }
        throw new IllegalArgumentException(i11 + " not supported");
    }

    @ReactMethod
    public final void cancelTrace(int i11) {
        parseTraceValue(i11, new b());
    }

    @ReactMethod
    public final void endHTTPTrace(String trace) {
        kotlin.jvm.internal.s.g(trace, "trace");
        getMonitoringService().k(tt.f.f52534e.decode(zu.j.a(trace)));
    }

    @ReactMethod
    public final void endTrace(int i11) {
        parseTraceValue(i11, new c());
    }

    @ReactMethod
    public final void endTraceWithAttributes(String attributes) {
        int t11;
        List l11;
        kotlin.jvm.internal.s.g(attributes, "attributes");
        tt.c decode = tt.c.f52528d.decode(zu.j.a(attributes));
        tt.d c11 = decode.c();
        if (c11 != null) {
            e.b.c(getMonitoringService(), c11.c(), null, null, 6, null);
        }
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        tt.j d11 = decode.d();
        if (d11 != null) {
            ku.e monitoringService = getMonitoringService();
            tt.l lVar = tt.l.ANDROID_TIME_TO_INTERACTIVE;
            a.C0683a c0683a = ku.a.f35879c;
            l11 = wz.w.l(c0683a.a("initial_product_list_fetch", Boolean.valueOf(d11.d())), c0683a.a("product_count", Integer.valueOf(d11.e())), c0683a.a("destination", lu.c.a(d11.c())), c0683a.a("current_memory_usage_bytes", Long.valueOf(freeMemory)));
            e.b.c(monitoringService, lVar, l11, null, 4, null);
        }
        tt.b b11 = decode.b();
        if (b11 == null) {
            return;
        }
        ku.e monitoringService2 = getMonitoringService();
        tt.l e11 = b11.e();
        List<tt.a> c12 = b11.c();
        t11 = wz.x.t(c12, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (tt.a aVar : c12) {
            arrayList.add(ku.a.f35879c.a(aVar.getName(), aVar.c()));
        }
        monitoringService2.e(e11, arrayList, b11.d());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MonitoringServiceModule";
    }

    @ReactMethod
    public final void setMonitoringEnabled(boolean z11, Promise promise) {
        kotlin.jvm.internal.s.g(promise, "promise");
        ku.d dVar = ku.d.f35883a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
        dVar.a(reactApplicationContext, z11);
        promise.resolve(null);
    }

    @ReactMethod
    public final void startHTTPTrace(String trace) {
        kotlin.jvm.internal.s.g(trace, "trace");
        getMonitoringService().i(tt.g.f52539d.decode(zu.j.a(trace)));
    }

    @ReactMethod
    public final void startTrace(int i11) {
        parseTraceValue(i11, new d());
    }
}