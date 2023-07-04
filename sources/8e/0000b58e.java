package ts;

import android.content.Context;
import com.adyen.checkout.components.model.payments.request.Address;
import com.stripe.android.core.networking.AnalyticsFields;
import com.tesla.command.VehicleConnectivityStateManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import lt.w2;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import wz.s0;
import wz.x0;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a */
    public static final b f52420a = new b();

    /* renamed from: b */
    private static final ConcurrentLinkedQueue<String> f52421b = new ConcurrentLinkedQueue<>();

    private b() {
    }

    public static /* synthetic */ vz.b0 a(yu.e eVar, String str, uu.h hVar, Context context, String str2, ot.m mVar, int i11, String str3, String str4, pt.a aVar, ot.f fVar, Integer num, Map map, yu.m mVar2) {
        return e(eVar, str, hVar, context, str2, mVar, i11, str3, str4, aVar, fVar, num, map, mVar2);
    }

    public static /* synthetic */ void d(b bVar, Context context, yu.m mVar, uu.h hVar, String str, yu.e eVar, ot.m mVar2, ot.f fVar, Integer num, String str2, String str3, pt.a aVar, com.tesla.logging.g gVar, Map map, String str4, boolean z11, int i11, Object obj) {
        bVar.c(context, mVar, hVar, str, eVar, mVar2, fVar, (i11 & 128) != 0 ? null : num, (i11 & 256) != 0 ? null : str2, (i11 & 512) != 0 ? null : str3, (i11 & 1024) != 0 ? null : aVar, (i11 & 2048) != 0 ? null : gVar, (i11 & 4096) != 0 ? null : map, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : str4, (i11 & 16384) != 0 ? false : z11);
    }

    public static final vz.b0 e(yu.e getVehicleData, String vehicleId, uu.h request, Context context, String connectionId, ot.m transport, int i11, String str, String str2, pt.a aVar, ot.f fVar, Integer num, Map map, yu.m remoteLog) {
        List E0;
        Map<String, ? extends Object> n11;
        Set i12;
        boolean T;
        int t11;
        int intValue;
        String P0;
        String g11;
        mt.v o11;
        String n12;
        int t12;
        String a11;
        String c11;
        kotlin.jvm.internal.s.g(getVehicleData, "$getVehicleData");
        kotlin.jvm.internal.s.g(vehicleId, "$vehicleId");
        kotlin.jvm.internal.s.g(request, "$request");
        kotlin.jvm.internal.s.g(context, "$context");
        kotlin.jvm.internal.s.g(connectionId, "$connectionId");
        kotlin.jvm.internal.s.g(transport, "$transport");
        kotlin.jvm.internal.s.g(remoteLog, "$remoteLog");
        w2 a12 = getVehicleData.a(vehicleId);
        vz.p[] pVarArr = new vz.p[13];
        pVarArr[0] = vz.v.a("command", request.m());
        pVarArr[1] = vz.v.a("command_id", request.n());
        pVarArr[2] = vz.v.a("to_domain", ps.a.e(com.tesla.data.oapi.d.a(request.i())));
        pVarArr[3] = vz.v.a("country", zu.v.f60791a.a(context));
        pVarArr[4] = vz.v.a("number_of_tries", Integer.valueOf(request.N()));
        pVarArr[5] = vz.v.a("number_of_nominal_retries", Integer.valueOf(request.w().get()));
        pVarArr[6] = vz.v.a("sent", Boolean.valueOf(request.H()));
        pVarArr[7] = vz.v.a("connection_id", connectionId);
        pVarArr[8] = vz.v.a("user_agent", yu.b.p(context));
        pVarArr[9] = vz.v.a("txid", request.C());
        pVarArr[10] = vz.v.a("category", "mobile-app-command-telemetry");
        pVarArr[11] = vz.v.a("platform", "android");
        String version = yu.b.j(context);
        kotlin.jvm.internal.s.f(version, "version");
        E0 = kotlin.text.w.E0(version, new String[]{"-"}, false, 0, 6, null);
        String str3 = (String) wz.u.d0(E0);
        if (str3 != null) {
            version = str3;
        }
        pVarArr[12] = vz.v.a(AnalyticsFields.APP_VERSION, version);
        n11 = s0.n(pVarArr);
        if (transport == ot.m.TRANSPORT_HERMES) {
            n11.put("type", "mobile-app-signed-telemetry");
            n11.put("hermes_state", request.t().name());
            n11.put("response_cache_feature", Boolean.valueOf(request.O().get()));
            n11.put("blocked_on_session_info", Boolean.valueOf(request.k()));
        }
        Boolean T2 = request.T();
        if (T2 != null) {
            n11.put("legacy_ble", Boolean.valueOf(T2.booleanValue()));
            vz.b0 b0Var = vz.b0.f54756a;
        }
        n11.put("transport", ps.a.b(transport));
        if (i11 > 1) {
            n11.put("logged_count", Integer.valueOf(i11));
        }
        if (str != null) {
            n11.put("reason", str);
            vz.b0 b0Var2 = vz.b0.f54756a;
        }
        if (str2 != null) {
            n11.put("car_server_error_result_reason", str2);
            vz.b0 b0Var3 = vz.b0.f54756a;
        }
        if (aVar != null && (c11 = ps.a.c(aVar)) != null) {
            n11.put("nominal_error", c11);
            vz.b0 b0Var4 = vz.b0.f54756a;
        }
        String J = request.J();
        if (J != null) {
            n11.put("session_info_txid", J);
            vz.b0 b0Var5 = vz.b0.f54756a;
        }
        if (fVar != null && (a11 = ps.a.a(fVar)) != null) {
            n11.put("result", a11);
            vz.b0 b0Var6 = vz.b0.f54756a;
        }
        String I = request.I();
        if (I != null) {
            n11.put("sent_txid", I);
            vz.b0 b0Var7 = vz.b0.f54756a;
        }
        Collection<ot.f> F = request.F();
        if (!(!F.isEmpty())) {
            F = null;
        }
        if (F != null) {
            t12 = wz.x.t(F, 10);
            ArrayList arrayList = new ArrayList(t12);
            for (ot.f fVar2 : F) {
                arrayList.add(ps.a.a(fVar2));
            }
            n11.put("retry_results", arrayList.toString());
            vz.b0 b0Var8 = vz.b0.f54756a;
        }
        VehicleConnectivityStateManager vehicleConnectivityStateManager = VehicleConnectivityStateManager.f21488a;
        n11.put("connectivity_state", vehicleConnectivityStateManager.f(vehicleId));
        long currentTimeMillis = System.currentTimeMillis();
        Long h11 = vehicleConnectivityStateManager.h(vehicleId);
        String str4 = Address.ADDRESS_NULL_PLACEHOLDER;
        n11.put("last_online_timestamp_delta", h11 == null ? Address.ADDRESS_NULL_PLACEHOLDER : Long.valueOf(currentTimeMillis - h11.longValue()));
        Long j11 = vehicleConnectivityStateManager.j(vehicleId);
        n11.put("connectivity_state_timestamp_delta", j11 == null ? Address.ADDRESS_NULL_PLACEHOLDER : Long.valueOf(currentTimeMillis - j11.longValue()));
        Long i13 = vehicleConnectivityStateManager.i(vehicleId);
        n11.put("last_wake_time_delta", i13 == null ? Address.ADDRESS_NULL_PLACEHOLDER : Long.valueOf(currentTimeMillis - i13.longValue()));
        String o12 = request.o();
        if (o12 != null) {
            n11.put("dependent_command", o12);
            vz.b0 b0Var9 = vz.b0.f54756a;
        }
        Long k11 = vehicleConnectivityStateManager.k(vehicleId);
        n11.put("last_vehicle_data_success_delta", k11 == null ? Address.ADDRESS_NULL_PLACEHOLDER : Long.valueOf(currentTimeMillis - k11.longValue()));
        i12 = x0.i(ot.f.RESULT_SUCCESS, ot.f.RESULT_NOMINAL_ERROR);
        T = wz.e0.T(i12, fVar);
        if (!T) {
            Collection<String> l11 = request.l();
            if (!(!l11.isEmpty())) {
                l11 = null;
            }
            if (l11 != null) {
                n11.put("breadcrumbs", l11.toString());
                vz.b0 b0Var10 = vz.b0.f54756a;
            }
            String concurrentLinkedQueue = f52421b.toString();
            kotlin.jvm.internal.s.f(concurrentLinkedQueue, "globalCrumbs.toString()");
            n11.put("global_breadcrumbs", concurrentLinkedQueue);
        }
        Integer valueOf = Integer.valueOf(request.E());
        if (!(valueOf.intValue() != 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            n11.put("resent_count", Integer.valueOf(valueOf.intValue()));
            vz.b0 b0Var11 = vz.b0.f54756a;
        }
        Collection<uu.e> D = request.D();
        t11 = wz.x.t(D, 10);
        ArrayList arrayList2 = new ArrayList(t11);
        for (uu.e eVar : D) {
            arrayList2.add(eVar.d());
        }
        n11.put("request_ids", arrayList2);
        ot.f fVar3 = ot.f.RESULT_TIMEOUT;
        if (fVar == fVar3 || num != null) {
            if (fVar == fVar3) {
                intValue = -1;
            } else {
                kotlin.jvm.internal.s.e(num);
                intValue = num.intValue();
            }
            n11.put("command_status", Integer.valueOf(intValue));
        }
        Long q11 = request.q();
        if (q11 != null) {
            n11.put("duration_ms", Long.valueOf(q11.longValue()));
            vz.b0 b0Var12 = vz.b0.f54756a;
        }
        Long x11 = request.x();
        if (x11 != null) {
            long longValue = x11.longValue();
            Long y11 = request.y();
            if (y11 != null) {
                n11.put("duration_from_reception_ms", Long.valueOf(y11.longValue() - longValue));
                vz.b0 b0Var13 = vz.b0.f54756a;
            }
        }
        String o13 = com.tesla.data.oapi.c.o(request.i());
        if (o13 != null) {
            str4 = o13;
        }
        n11.put("request_type", str4);
        if (a12 != null && (o11 = a12.o()) != null && (n12 = o11.n()) != null) {
            n11.put("product_firmware", n12);
            vz.b0 b0Var14 = vz.b0.f54756a;
        }
        if (a12 != null && (g11 = et.a.g(a12)) != null) {
            n11.put("product_type", g11);
            vz.b0 b0Var15 = vz.b0.f54756a;
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                n11.put((String) entry.getKey(), (String) entry.getValue());
            }
            vz.b0 b0Var16 = vz.b0.f54756a;
        }
        P0 = kotlin.text.w.P0(request.A().h().name(), "SOURCE_", null, 2, null);
        n11.put("ui_source", P0);
        vz.b0 b0Var17 = vz.b0.f54756a;
        Integer G = request.G();
        if (G != null) {
            n11.put("seconds_remaining_when_sent", Integer.valueOf(G.intValue()));
        }
        remoteLog.d(n11, false);
        return b0Var17;
    }

    public final void b(String crumb) {
        kotlin.jvm.internal.s.g(crumb, "crumb");
        ConcurrentLinkedQueue<String> concurrentLinkedQueue = f52421b;
        concurrentLinkedQueue.add(crumb);
        if (concurrentLinkedQueue.size() > 25) {
            concurrentLinkedQueue.remove();
        }
    }

    public final void c(final Context context, final yu.m remoteLog, final uu.h request, final String connectionId, final yu.e getVehicleData, final ot.m transport, final ot.f fVar, final Integer num, String str, final String str2, final pt.a aVar, com.tesla.logging.g gVar, final Map<String, String> map, final String str3, boolean z11) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(remoteLog, "remoteLog");
        kotlin.jvm.internal.s.g(request, "request");
        kotlin.jvm.internal.s.g(connectionId, "connectionId");
        kotlin.jvm.internal.s.g(getVehicleData, "getVehicleData");
        kotlin.jvm.internal.s.g(transport, "transport");
        if (z11 || request.v().get() <= 0) {
            final int incrementAndGet = request.v().incrementAndGet();
            final String P = request.P();
            hy.b.e(new Callable() { // from class: ts.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return b.a(yu.e.this, P, request, context, connectionId, transport, incrementAndGet, str3, str2, aVar, fVar, num, map, remoteLog);
                }
            }).i(bz.a.c()).f();
        }
    }
}