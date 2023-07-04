package ys;

import com.tesla.data.HttpMethodType;
import com.tesla.data.oapi.OwnerApiEndpoint;
import expo.modules.constants.ExponentInstallationId;
import gu.r;
import hy.q;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import vz.v;
import wz.r0;
import wz.w;
import yu.f;
import yu.y;
import zu.c0;

/* loaded from: classes6.dex */
public final class i {

    /* renamed from: e */
    public static final a f59725e = new a(null);

    /* renamed from: f */
    private static final com.tesla.logging.g f59726f = com.tesla.logging.g.f21878b.a("HermesVehicleToken");

    /* renamed from: a */
    private final y f59727a;

    /* renamed from: b */
    private final es.c f59728b;

    /* renamed from: c */
    private final at.e f59729c;

    /* renamed from: d */
    private final OwnerApiEndpoint f59730d;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a(y sendOwnerRequest, es.c analyticsService, at.e local, com.tesla.data.oapi.h endpoints) {
            s.g(sendOwnerRequest, "sendOwnerRequest");
            s.g(analyticsService, "analyticsService");
            s.g(local, "local");
            s.g(endpoints, "endpoints");
            return new i(sendOwnerRequest, analyticsService, local, endpoints, null);
        }
    }

    private i(y yVar, es.c cVar, at.e eVar, com.tesla.data.oapi.h hVar) {
        this.f59727a = yVar;
        this.f59728b = cVar;
        this.f59729c = eVar;
        OwnerApiEndpoint c11 = hVar.c("HERMES_VEHICLE_AUTHORIZATION");
        if (c11 == null) {
            throw new IllegalStateException("HERMES_VEHICLE_AUTHORIZATION not found in endpoints");
        }
        this.f59730d = c11;
    }

    public /* synthetic */ i(y yVar, es.c cVar, at.e eVar, com.tesla.data.oapi.h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, cVar, eVar, hVar);
    }

    public static /* synthetic */ q a(i iVar, String str, String str2, String str3, c0 c0Var) {
        return h(iVar, str, str2, str3, c0Var);
    }

    public static /* synthetic */ c0 b(i iVar, String str, com.tesla.data.oapi.k kVar) {
        return i(iVar, str, kVar);
    }

    public static /* synthetic */ c0 c(i iVar, String str) {
        return g(iVar, str);
    }

    private final String d(String str, String str2) {
        return "HermesVehicleToken-" + str + "-" + str2;
    }

    public static final c0 g(i this$0, String localKey) {
        s.g(this$0, "this$0");
        s.g(localKey, "$localKey");
        String string = this$0.f59729c.getString(localKey);
        if (string == null) {
            return c0.f60762e.a(new RuntimeException("Local hermes token missing"));
        }
        return c0.f60762e.b(new com.auth0.android.jwt.c(string));
    }

    public static final q h(i this$0, String vehicleId, String connectionId, final String localKey, c0 c0Var) {
        Map f11;
        Map f12;
        s.g(this$0, "this$0");
        s.g(vehicleId, "$vehicleId");
        s.g(connectionId, "$connectionId");
        s.g(localKey, "$localKey");
        if (!c0Var.c() && !((com.auth0.android.jwt.c) c0Var.b()).g(0L)) {
            return hy.m.n(c0Var);
        }
        this$0.f59728b.d(jt.d.FETCH_VEHICLE_TOKEN_ATTEMPT);
        OwnerApiEndpoint ownerApiEndpoint = this$0.f59730d;
        HttpMethodType component1 = ownerApiEndpoint.component1();
        String component2 = ownerApiEndpoint.component2();
        boolean component3 = ownerApiEndpoint.component3();
        y yVar = this$0.f59727a;
        f11 = r0.f(v.a("id", vehicleId));
        f12 = r0.f(v.a(ExponentInstallationId.LEGACY_UUID_KEY, connectionId));
        return f.a.c(yVar, component1, component2, f11, f12, null, null, null, component3, false, 368, null).o(new ky.h() { // from class: ys.g
            @Override // ky.h
            public final Object apply(Object obj) {
                return i.b(i.this, localKey, (com.tesla.data.oapi.k) obj);
            }
        });
    }

    public static final c0 i(i this$0, String localKey, com.tesla.data.oapi.k kVar) {
        List l11;
        List d11;
        List l12;
        s.g(this$0, "this$0");
        s.g(localKey, "$localKey");
        if (kVar.i()) {
            try {
                JSONObject e11 = kVar.e();
                s.e(e11);
                com.auth0.android.jwt.c cVar = new com.auth0.android.jwt.c(e11.getString("token"));
                at.e eVar = this$0.f59729c;
                String cVar2 = cVar.toString();
                s.f(cVar2, "token.toString()");
                eVar.a(localKey, cVar2);
                d11 = wz.v.d(fs.a.g());
                j(this$0, d11);
                return c0.f60762e.b(cVar);
            } catch (Exception e12) {
                l11 = w.l(fs.a.b(), fs.a.a("exception"));
                j(this$0, l11);
                f59726f.d("Failed to parse token", e12);
                return c0.f60762e.a(e12);
            }
        }
        l12 = w.l(fs.a.b(), fs.a.d(kVar.a()));
        j(this$0, l12);
        f59726f.i("Failed to fetch remote hermes vehicle token");
        return c0.f60762e.a(new r(null, null, null, null, "Failed to fetch remote hermes vehicle token", null, 47, null));
    }

    private static final void j(i iVar, List<jt.f> list) {
        iVar.f59728b.a(jt.d.FETCH_VEHICLE_TOKEN, list);
    }

    public final void e(String email, String vehicleId) {
        s.g(email, "email");
        s.g(vehicleId, "vehicleId");
        this.f59729c.b(d(email, vehicleId));
    }

    public final hy.m<c0<com.auth0.android.jwt.c>> f(String email, final String connectionId, final String vehicleId) {
        s.g(email, "email");
        s.g(connectionId, "connectionId");
        s.g(vehicleId, "vehicleId");
        final String d11 = d(email, vehicleId);
        hy.m<c0<com.auth0.android.jwt.c>> w11 = hy.m.l(new Callable() { // from class: ys.f
            {
                i.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return i.c(i.this, d11);
            }
        }).w(bz.a.c()).k(new ky.h() { // from class: ys.h
            {
                i.this = this;
            }

            @Override // ky.h
            public final Object apply(Object obj) {
                return i.a(i.this, vehicleId, connectionId, d11, (c0) obj);
            }
        }).w(bz.a.c());
        s.f(w11, "fromCallable {\n        v…scribeOn(Schedulers.io())");
        return w11;
    }
}