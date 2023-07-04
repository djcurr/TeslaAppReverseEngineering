package com.tesla.widget.rn;

import bv.b;
import bv.c;
import bv.d;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.tesla.logging.g;
import com.tesla.widget.worker.UpdateWidgetWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/tesla/widget/rn/AppWidgetReactNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "getName", "vehicleId", "", "appWidgetId", "command", "", "result", "Lvz/b0;", "updateAppWidget", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "Lbv/b;", "vehicleCommandService$delegate", "Lvz/k;", "getVehicleCommandService", "()Lbv/b;", "vehicleCommandService", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "widget_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class AppWidgetReactNativeModule extends ReactContextBaseJavaModule {
    private final g logger;
    private final k vehicleCommandService$delegate;

    /* loaded from: classes6.dex */
    static final class a extends u implements h00.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f22022a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final b invoke() {
            return ev.b.f25256a.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWidgetReactNativeModule(ReactApplicationContext context) {
        super(context);
        k a11;
        s.g(context, "context");
        this.logger = av.a.a().n("NativeCall");
        a11 = m.a(a.f22022a);
        this.vehicleCommandService$delegate = a11;
    }

    private final b getVehicleCommandService() {
        return (b) this.vehicleCommandService$delegate.getValue();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AppWidgetModule";
    }

    @ReactMethod
    public final void updateAppWidget(String vehicleId, int i11, String command, boolean z11) {
        com.tesla.widget.b bVar;
        s.g(vehicleId, "vehicleId");
        s.g(command, "command");
        g gVar = this.logger;
        gVar.a("updating widget from react-native appWidgetId: " + i11 + " vehicleId: " + vehicleId + " command: " + command);
        c d11 = d.d(command);
        if (d11 != null) {
            getVehicleCommandService().c(vehicleId, d11);
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (i11 == 0) {
            s.f(reactApplicationContext, "");
            av.m.n(reactApplicationContext);
            return;
        }
        if (z11) {
            bVar = com.tesla.widget.b.SUCCESS;
        } else {
            bVar = com.tesla.widget.b.FAIL;
        }
        com.tesla.widget.b bVar2 = bVar;
        UpdateWidgetWorker.a aVar = UpdateWidgetWorker.f22023b;
        s.f(reactApplicationContext, "this");
        com.tesla.widget.d dVar = com.tesla.widget.d.NORMAL;
        aVar.d(i11, reactApplicationContext, dVar, (r18 & 8) != 0 ? null : bVar2, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
        aVar.d(i11, reactApplicationContext, dVar, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : 3000L, (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
    }
}