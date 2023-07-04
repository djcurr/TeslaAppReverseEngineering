package ys;

import com.tesla.data.HttpMethodType;
import com.tesla.data.oapi.OwnerApiEndpoint;
import expo.modules.constants.ExponentInstallationId;
import gu.r;
import hy.q;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import vz.v;
import wz.r0;
import yu.f;
import yu.y;
import zu.c0;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: d */
    public static final a f59712d = new a(null);

    /* renamed from: e */
    private static final com.tesla.logging.g f59713e = com.tesla.logging.g.f21878b.a("HermesToken");

    /* renamed from: a */
    private final y f59714a;

    /* renamed from: b */
    private final at.e f59715b;

    /* renamed from: c */
    private final OwnerApiEndpoint f59716c;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(y sendOwnerRequest, at.e local, com.tesla.data.oapi.h endpoints) {
            s.g(sendOwnerRequest, "sendOwnerRequest");
            s.g(local, "local");
            s.g(endpoints, "endpoints");
            return new e(sendOwnerRequest, local, endpoints, null);
        }
    }

    private e(y yVar, at.e eVar, com.tesla.data.oapi.h hVar) {
        this.f59714a = yVar;
        this.f59715b = eVar;
        OwnerApiEndpoint c11 = hVar.c("HERMES_AUTHORIZATION");
        if (c11 == null) {
            throw new IllegalStateException("HERMES_AUTHORIZATION not found in endpoints");
        }
        this.f59716c = c11;
    }

    public /* synthetic */ e(y yVar, at.e eVar, com.tesla.data.oapi.h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(yVar, eVar, hVar);
    }

    public static /* synthetic */ c0 a(e eVar, String str, com.tesla.data.oapi.k kVar) {
        return i(eVar, str, kVar);
    }

    public static /* synthetic */ c0 b(e eVar, String str) {
        return g(eVar, str);
    }

    public static /* synthetic */ q c(e eVar, String str, String str2, c0 c0Var) {
        return h(eVar, str, str2, c0Var);
    }

    private final String d(String str) {
        return "HermesToken-" + str;
    }

    public static final c0 g(e this$0, String key) {
        s.g(this$0, "this$0");
        s.g(key, "$key");
        String string = this$0.f59715b.getString(key);
        if (string == null) {
            return c0.f60762e.a(new RuntimeException("Local hermes token missing"));
        }
        return c0.f60762e.b(new com.auth0.android.jwt.c(string));
    }

    public static final q h(e this$0, String connectionId, final String key, c0 c0Var) {
        Map f11;
        s.g(this$0, "this$0");
        s.g(connectionId, "$connectionId");
        s.g(key, "$key");
        if (!c0Var.c() && !((com.auth0.android.jwt.c) c0Var.b()).g(0L)) {
            return hy.m.n(c0Var);
        }
        OwnerApiEndpoint ownerApiEndpoint = this$0.f59716c;
        HttpMethodType component1 = ownerApiEndpoint.component1();
        String component2 = ownerApiEndpoint.component2();
        boolean component3 = ownerApiEndpoint.component3();
        y yVar = this$0.f59714a;
        f11 = r0.f(v.a(ExponentInstallationId.LEGACY_UUID_KEY, connectionId));
        return f.a.c(yVar, component1, component2, null, f11, null, null, null, component3, false, 372, null).o(new ky.h() { // from class: ys.c
            @Override // ky.h
            public final Object apply(Object obj) {
                return e.a(e.this, key, (com.tesla.data.oapi.k) obj);
            }
        });
    }

    public static final c0 i(e this$0, String key, com.tesla.data.oapi.k kVar) {
        s.g(this$0, "this$0");
        s.g(key, "$key");
        if (kVar.i()) {
            try {
                JSONObject e11 = kVar.e();
                s.e(e11);
                com.auth0.android.jwt.c cVar = new com.auth0.android.jwt.c(e11.getString("token"));
                at.e eVar = this$0.f59715b;
                String cVar2 = cVar.toString();
                s.f(cVar2, "token.toString()");
                eVar.a(key, cVar2);
                return c0.f60762e.b(cVar);
            } catch (Exception e12) {
                f59713e.d("Failed to parse token", e12);
                return c0.f60762e.a(e12);
            }
        }
        f59713e.i("Failed to fetch remote hermes user token");
        return c0.f60762e.a(new r(null, null, null, null, "Failed to fetch remote hermes user token", null, 47, null));
    }

    public final void e(String email) {
        s.g(email, "email");
        this.f59715b.b(d(email));
    }

    public final hy.m<c0<com.auth0.android.jwt.c>> f(String email, final String connectionId) {
        s.g(email, "email");
        s.g(connectionId, "connectionId");
        final String d11 = d(email);
        hy.m<c0<com.auth0.android.jwt.c>> k11 = hy.m.l(new Callable() { // from class: ys.b
            {
                e.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return e.b(e.this, d11);
            }
        }).w(bz.a.c()).k(new ky.h() { // from class: ys.d
            {
                e.this = this;
            }

            @Override // ky.h
            public final Object apply(Object obj) {
                return e.c(e.this, connectionId, d11, (c0) obj);
            }
        });
        s.f(k11, "fromCallable {\n        v…Result)\n        }\n      }");
        return k11;
    }
}