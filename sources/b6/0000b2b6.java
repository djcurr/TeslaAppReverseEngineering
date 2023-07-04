package ss;

import android.content.Context;
import com.tesla.command.VehicleConnectivityStateManager;
import com.tesla.data.HttpMethodType;
import com.tesla.data.oapi.CalendarData;
import com.tesla.data.oapi.CalendarSyncBody;
import com.tesla.data.oapi.CalendarSyncParameters;
import com.tesla.data.oapi.OwnerApiEndpoint;
import com.tesla.data.oapi.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import ls.b;
import okhttp3.Headers;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.b0;
import vz.v;
import wz.r0;
import yu.f;
import yu.y;

/* loaded from: classes6.dex */
public final class n implements j, i {

    /* renamed from: l */
    public static final a f50574l = new a(null);

    /* renamed from: m */
    private static final com.tesla.logging.g f50575m = com.tesla.logging.g.f21878b.a("OAPI");

    /* renamed from: a */
    private final yu.m f50576a;

    /* renamed from: b */
    private final yu.e f50577b;

    /* renamed from: c */
    private final y f50578c;

    /* renamed from: d */
    private final com.tesla.data.oapi.h f50579d;

    /* renamed from: e */
    private final Context f50580e;

    /* renamed from: f */
    private final String f50581f;

    /* renamed from: g */
    private final ot.m f50582g;

    /* renamed from: h */
    private final Map<String, List<uu.h>> f50583h;

    /* renamed from: i */
    private final Map<String, uu.h> f50584i;

    /* renamed from: j */
    private final Map<String, uu.h> f50585j;

    /* renamed from: k */
    private final Map<String, iy.b> f50586k;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void b(uu.h hVar, String str, com.tesla.logging.d dVar) {
            if (hVar == null) {
                return;
            }
            us.c.c(hVar, str, n.f50575m, dVar);
        }

        static /* synthetic */ void c(a aVar, uu.h hVar, String str, com.tesla.logging.d dVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                dVar = com.tesla.logging.d.INFO;
            }
            aVar.b(hVar, str, dVar);
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50587a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f50588b;

        static {
            int[] iArr = new int[VehicleConnectivityStateManager.c.values().length];
            iArr[VehicleConnectivityStateManager.c.OFFLINE.ordinal()] = 1;
            iArr[VehicleConnectivityStateManager.c.UNKNOWN.ordinal()] = 2;
            iArr[VehicleConnectivityStateManager.c.ONLINE.ordinal()] = 3;
            f50587a = iArr;
            int[] iArr2 = new int[com.tesla.data.oapi.j.values().length];
            iArr2[com.tesla.data.oapi.j.UNAUTHORIZED.ordinal()] = 1;
            iArr2[com.tesla.data.oapi.j.FORBIDDEN.ordinal()] = 2;
            iArr2[com.tesla.data.oapi.j.TIMEOUT.ordinal()] = 3;
            iArr2[com.tesla.data.oapi.j.PRODUCT_OFFLINE.ordinal()] = 4;
            iArr2[com.tesla.data.oapi.j.SERVER_ERROR.ordinal()] = 5;
            iArr2[com.tesla.data.oapi.j.NO_NETWORK.ordinal()] = 6;
            f50588b = iArr2;
        }
    }

    /* loaded from: classes6.dex */
    static final class c extends u implements h00.p<uu.h, ot.f, b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(2);
            n.this = r1;
        }

        public final void a(uu.h finishedRequest, ot.f result) {
            s.g(finishedRequest, "finishedRequest");
            s.g(result, "result");
            ts.b.f52420a.c(n.this.f50580e, n.this.f50576a, finishedRequest, n.this.f50581f, n.this.f50577b, n.this.a(), result, (r35 & 128) != 0 ? null : null, (r35 & 256) != 0 ? null : null, (r35 & 512) != 0 ? null : null, (r35 & 1024) != 0 ? null : null, (r35 & 2048) != 0 ? null : n.f50575m, (r35 & 4096) != 0 ? null : null, (r35 & PKIFailureInfo.certRevoked) != 0 ? null : null, (r35 & 16384) != 0 ? false : false);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(uu.h hVar, ot.f fVar) {
            a(hVar, fVar);
            return b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class d implements l.a {

        /* renamed from: a */
        private final String f50590a;

        /* renamed from: b */
        private final Context f50591b;

        /* renamed from: c */
        final /* synthetic */ String f50592c;

        /* renamed from: d */
        final /* synthetic */ n f50593d;

        /* renamed from: e */
        final /* synthetic */ uu.h f50594e;

        /* loaded from: classes6.dex */
        static final class a extends u implements h00.l<CalendarSyncParameters, CalendarSyncBody> {

            /* renamed from: a */
            final /* synthetic */ n f50595a;

            /* renamed from: b */
            final /* synthetic */ uu.h f50596b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n nVar, uu.h hVar) {
                super(1);
                this.f50595a = nVar;
                this.f50596b = hVar;
            }

            @Override // h00.l
            /* renamed from: a */
            public final CalendarSyncBody mo12invoke(CalendarSyncParameters params) {
                s.g(params, "params");
                b.a a11 = ls.b.f37327a.a(this.f50595a.f50580e, new CalendarSyncParameters(params.d(), params.c(), params.e()));
                String b11 = a11.b();
                if (b11 != null) {
                    n.f50574l.b(this.f50596b, b11, com.tesla.logging.d.INFO);
                }
                CalendarData a12 = a11.a();
                if (a12 == null) {
                    return null;
                }
                return new CalendarSyncBody(a12);
            }
        }

        d(String str, n nVar, uu.h hVar) {
            this.f50592c = str;
            this.f50593d = nVar;
            this.f50594e = hVar;
            this.f50590a = str;
            this.f50591b = nVar.f50580e;
        }

        @Override // com.tesla.data.oapi.l.a
        public h00.l<CalendarSyncParameters, CalendarSyncBody> a() {
            return new a(this.f50593d, this.f50594e);
        }

        @Override // com.tesla.data.oapi.l.a
        public Context b() {
            return this.f50591b;
        }

        @Override // com.tesla.data.oapi.l.a
        public String c() {
            return this.f50590a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends u implements h00.l<uu.h, b0> {

        /* renamed from: a */
        final /* synthetic */ uu.h f50597a;

        /* renamed from: b */
        final /* synthetic */ n f50598b;

        /* renamed from: c */
        final /* synthetic */ String f50599c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(uu.h hVar, n nVar, String str) {
            super(1);
            this.f50597a = hVar;
            this.f50598b = nVar;
            this.f50599c = str;
        }

        public final void a(uu.h it2) {
            s.g(it2, "it");
            a.c(n.f50574l, this.f50597a, "timeout for vehicle offline request, sending pending requests...", null, 2, null);
            this.f50598b.x(this.f50599c);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo12invoke(uu.h hVar) {
            a(hVar);
            return b0.f54756a;
        }
    }

    public n(yu.m remoteLog, yu.e getVehicleData, y sendOwnerRequest, com.tesla.data.oapi.h endpoints, Context context) {
        s.g(remoteLog, "remoteLog");
        s.g(getVehicleData, "getVehicleData");
        s.g(sendOwnerRequest, "sendOwnerRequest");
        s.g(endpoints, "endpoints");
        s.g(context, "context");
        this.f50576a = remoteLog;
        this.f50577b = getVehicleData;
        this.f50578c = sendOwnerRequest;
        this.f50579d = endpoints;
        this.f50580e = context;
        String uuid = UUID.randomUUID().toString();
        s.f(uuid, "randomUUID().toString()");
        this.f50581f = uuid;
        this.f50582g = ot.m.TRANSPORT_OWNER_API;
        this.f50583h = new LinkedHashMap();
        this.f50584i = new LinkedHashMap();
        this.f50585j = new LinkedHashMap();
        this.f50586k = new LinkedHashMap();
    }

    public static /* synthetic */ void d(uu.h hVar, n nVar, String str, Throwable th2) {
        u(hVar, nVar, str, th2);
    }

    public static /* synthetic */ void e(uu.h hVar, n nVar) {
        w(hVar, nVar);
    }

    public static /* synthetic */ void f(uu.h hVar, String str, n nVar, String str2, com.tesla.data.oapi.k kVar) {
        t(hVar, str, nVar, str2, kVar);
    }

    private final void m(uu.h hVar) {
        String P = hVar.P();
        a aVar = f50574l;
        uu.h hVar2 = this.f50584i.get(P);
        String m11 = hVar2 == null ? null : hVar2.m();
        a.c(aVar, hVar, "adding request to vehicle offline queue, waiting for " + m11 + " to finish", null, 2, null);
        r(hVar);
        Map<String, List<uu.h>> map = this.f50583h;
        List<uu.h> list = map.get(P);
        if (list == null) {
            list = new ArrayList<>();
            map.put(P, list);
        }
        list.add(hVar);
    }

    private final ot.e n(String str, ot.f fVar, String str2, String str3) {
        return new ot.e(str2, null, str, fVar, a(), 0, null, null, str3, null, 738, null);
    }

    static /* synthetic */ ot.e o(n nVar, String str, ot.f fVar, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        return nVar.n(str, fVar, str2, str3);
    }

    private final long p(int i11) {
        return i11 <= 1 ? 1L : 2L;
    }

    private final boolean q(uu.h hVar) {
        return s.c(this.f50584i.get(hVar.P()), hVar);
    }

    private final void r(uu.h hVar) {
        ot.m a11 = a();
        Integer K = hVar.K();
        hVar.m0(30, a11, K == null || K.intValue() != 30);
    }

    private final void s(final uu.h hVar) {
        Map f11;
        ot.b c11 = hVar.A().c();
        if (c11 == null) {
            f50574l.b(hVar, "CommandAction is null, nothing to send.", com.tesla.logging.d.ERROR);
            return;
        }
        final String P = hVar.P();
        final String n11 = hVar.n();
        com.tesla.data.oapi.i n12 = com.tesla.data.oapi.l.f21795a.n(c11, new d(P, this, hVar));
        if (n12 == null) {
            f50574l.b(hVar, "Failed to map command action to OAPI request", com.tesla.logging.d.ERROR);
            hVar.a(o(this, null, ot.f.RESULT_INTERNAL_ERROR, n11, null, 9, null));
            return;
        }
        String a11 = n12.a();
        OwnerApiEndpoint c12 = this.f50579d.c(a11);
        if (hVar.s()) {
            a.c(f50574l, hVar, "request finished, not sending request", null, 2, null);
        } else if (c12 == null) {
            a aVar = f50574l;
            String b11 = uu.c.b(hVar.A());
            aVar.b(hVar, "failed to find endpoint " + a11 + " for " + b11, com.tesla.logging.d.ERROR);
            hVar.a(o(this, null, ot.f.RESULT_INVALID_COMMAND_REQUEST, n11, null, 9, null));
        } else {
            HttpMethodType component1 = c12.component1();
            String component2 = c12.component2();
            boolean component3 = c12.component3();
            y yVar = this.f50578c;
            f11 = r0.f(v.a("vehicle_id", P));
            Map<String, String> g11 = hVar.A().g();
            String b12 = n12.b();
            hy.m d11 = f.a.d(yVar, component1, component2, f11, b12 == null ? null : new JSONObject(b12), null, g11, null, component3, false, 336, null);
            Map<String, iy.b> map = this.f50586k;
            iy.b u11 = d11.p(gy.b.c()).u(new ky.f() { // from class: ss.l
                @Override // ky.f
                public final void accept(Object obj) {
                    n.f(uu.h.this, P, this, n11, (com.tesla.data.oapi.k) obj);
                }
            }, new ky.f() { // from class: ss.m
                @Override // ky.f
                public final void accept(Object obj) {
                    n.d(uu.h.this, this, n11, (Throwable) obj);
                }
            });
            s.f(u11, "oapiRequestSingle\n      …      )\n        )\n      }");
            map.put(n11, u11);
        }
    }

    public static final void t(uu.h request, String vehicleId, n this$0, String commandId, com.tesla.data.oapi.k kVar) {
        ot.f fVar;
        String jSONObject;
        s.g(request, "$request");
        s.g(vehicleId, "$vehicleId");
        s.g(this$0, "this$0");
        s.g(commandId, "$commandId");
        JSONObject e11 = kVar.e();
        com.tesla.data.oapi.j g11 = kVar.g();
        boolean z11 = true;
        if (g11.isSuccess()) {
            a.c(f50574l, request, "successfully sent request", null, 2, null);
            VehicleConnectivityStateManager.f21488a.p(vehicleId, VehicleConnectivityStateManager.c.ONLINE);
            request.a(o(this$0, (e11 == null || (jSONObject = e11.toString()) == null) ? "" : jSONObject, ot.f.RESULT_SUCCESS, commandId, null, 8, null));
        } else {
            a aVar = f50574l;
            a.c(aVar, request, "failure code:" + g11, null, 2, null);
            switch (b.f50588b[g11.ordinal()]) {
                case 1:
                    request.a(o(this$0, null, ot.f.RESULT_UNAUTHORIZED, commandId, null, 9, null));
                    break;
                case 2:
                    Headers d11 = kVar.d();
                    boolean c11 = s.c(d11 == null ? null : d11.get("x-signed-commands-required"), "true");
                    if (c11) {
                        fVar = ot.f.RESULT_SIGNED_COMMANDS_REQUIRED;
                    } else if (!c11) {
                        fVar = ot.f.RESULT_FORBIDDEN;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    request.a(o(this$0, null, fVar, commandId, null, 9, null));
                    break;
                case 3:
                    request.a(o(this$0, null, ot.f.RESULT_TIMEOUT, commandId, null, 9, null));
                    break;
                case 4:
                    VehicleConnectivityStateManager vehicleConnectivityStateManager = VehicleConnectivityStateManager.f21488a;
                    vehicleConnectivityStateManager.p(vehicleId, VehicleConnectivityStateManager.c.OFFLINE);
                    vehicleConnectivityStateManager.s(request.A());
                    if (request.A().f()) {
                        a.c(aVar, request, "product offline and request `letSleep` is true. failing request.", null, 2, null);
                        request.a(o(this$0, null, ot.f.RESULT_VEHICLE_NOT_CONNECTED, commandId, null, 9, null));
                        return;
                    }
                    this$0.y(vehicleId, request);
                    if (this$0.q(request)) {
                        v(request, this$0, commandId, ot.f.RESULT_INTERNAL_ERROR, Integer.MAX_VALUE);
                        break;
                    }
                    break;
                case 5:
                    v(request, this$0, commandId, ot.f.RESULT_SERVER_ERROR, 10);
                    break;
                case 6:
                    request.a(o(this$0, null, ot.f.RESULT_NO_NETWORK, commandId, null, 9, null));
                    break;
                default:
                    request.a(o(this$0, null, ot.f.RESULT_UNKNOWN_ERROR, commandId, kVar.c(), 1, null));
                    break;
            }
            if (z11 && this$0.q(request)) {
                this$0.x(request.P());
                return;
            }
        }
        z11 = false;
        if (z11) {
        }
    }

    public static final void u(uu.h request, n this$0, String commandId, Throwable th2) {
        s.g(request, "$request");
        s.g(this$0, "this$0");
        s.g(commandId, "$commandId");
        com.tesla.logging.g gVar = f50575m;
        String a11 = us.c.a(request.A());
        gVar.d(a11 + " exception thrown executing OAPI request", th2);
        a.c(f50574l, request, "unhandled exception, finishing response", null, 2, null);
        request.a(o(this$0, null, ot.f.RESULT_EXCEPTION_THROWN, commandId, null, 9, null));
    }

    private static final void v(final uu.h hVar, final n nVar, String str, ot.f fVar, int i11) {
        hVar.S(fVar);
        int i12 = hVar.M().get();
        if (i12 > i11) {
            a.c(f50574l, hVar, "exhausted retries, finishing request", null, 2, null);
            hVar.a(o(nVar, null, fVar, str, null, 9, null));
            return;
        }
        long p11 = nVar.p(i12);
        a aVar = f50574l;
        a.c(aVar, hVar, "queuing request for retry #" + i12 + " with delay " + p11 + "s", null, 2, null);
        hy.b.j(p11, TimeUnit.SECONDS).g(new ky.a() { // from class: ss.k
            @Override // ky.a
            public final void run() {
                n.e(uu.h.this, nVar);
            }
        });
    }

    public static final void w(uu.h request, n this$0) {
        s.g(request, "$request");
        s.g(this$0, "this$0");
        a.c(f50574l, request, "retrying request", null, 2, null);
        this$0.s(request);
    }

    public final void x(String str) {
        com.tesla.logging.g gVar = f50575m;
        gVar.i("sending requests that were blocked for offline vehicle " + str);
        this.f50584i.remove(str);
        List<uu.h> list = this.f50583h.get(str);
        if (list == null) {
            return;
        }
        for (uu.h hVar : list) {
            s(hVar);
        }
        list.clear();
    }

    private final void y(String str, uu.h hVar) {
        if (q(hVar)) {
            return;
        }
        if (this.f50584i.get(str) != null) {
            m(hVar);
            return;
        }
        this.f50584i.put(str, hVar);
        r(hVar);
        hVar.e(new e(hVar, this, str));
    }

    @Override // ss.i
    public ot.m a() {
        return this.f50582g;
    }

    @Override // ss.j
    public void b(ot.c request, uu.d listener) {
        s.g(request, "request");
        s.g(listener, "listener");
        String d11 = gu.c.d(request);
        String j11 = request.j();
        uu.h hVar = new uu.h(request, listener, null, null, null, 28, null);
        hVar.d(new c());
        this.f50585j.put(d11, hVar);
        uu.h.n0(hVar, 30, a(), false, 4, null);
        VehicleConnectivityStateManager vehicleConnectivityStateManager = VehicleConnectivityStateManager.f21488a;
        int i11 = b.f50587a[vehicleConnectivityStateManager.f(j11).ordinal()];
        if (i11 == 1 || i11 == 2) {
            if (request.f()) {
                a.c(f50574l, hVar, "not waking vehicle because letSleep property is set", null, 2, null);
            } else {
                vehicleConnectivityStateManager.s(request);
            }
        }
        if (this.f50584i.get(j11) == null) {
            a.c(f50574l, hVar, "sending...", null, 2, null);
            s(hVar);
            return;
        }
        m(hVar);
    }

    @Override // ss.j
    public void c(ot.c request) {
        s.g(request, "request");
        String d11 = gu.c.d(request);
        iy.b remove = this.f50586k.remove(d11);
        if (remove != null) {
            remove.dispose();
        }
        uu.h remove2 = this.f50585j.remove(d11);
        if (remove2 == null) {
            return;
        }
        a.c(f50574l, remove2, "cancelling", null, 2, null);
        remove2.h(ot.f.RESULT_TIMEOUT);
    }
}