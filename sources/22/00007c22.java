package js;

import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.a;
import hy.m;
import hy.n;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import js.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import vz.p;
import vz.v;
import wz.r0;
import zu.c0;

/* loaded from: classes6.dex */
public final class i implements b {

    /* renamed from: e */
    private static final com.tesla.logging.g f33953e;

    /* renamed from: a */
    private final js.a f33954a;

    /* renamed from: b */
    public e f33955b;

    /* renamed from: c */
    private final Context f33956c;

    /* renamed from: d */
    private final ReentrantLock f33957d;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f33953e = com.tesla.logging.g.f21878b.a("TeslaAuthRepository");
    }

    public i(Context context, js.a local) {
        s.g(context, "context");
        s.g(local, "local");
        this.f33954a = local;
        Context applicationContext = context.getApplicationContext();
        s.f(applicationContext, "context.applicationContext");
        this.f33956c = applicationContext;
        this.f33957d = new ReentrantLock();
    }

    public static /* synthetic */ p g(i iVar, com.tesla.data.oapi.k kVar) {
        return k(iVar, kVar);
    }

    public static /* synthetic */ void h(i iVar, com.auth0.android.jwt.c cVar, String str, n nVar) {
        l(iVar, cVar, str, nVar);
    }

    private final String j(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final p k(i this$0, com.tesla.data.oapi.k response) {
        s.g(this$0, "this$0");
        s.f(response, "response");
        return v.a(this$0.m(response), Integer.valueOf(response.a()));
    }

    public static final void l(i this$0, com.auth0.android.jwt.c cVar, String str, n nVar) {
        String b11;
        Map f11;
        Map f12;
        Map f13;
        Map f14;
        s.g(this$0, "this$0");
        this$0.f33957d.lock();
        String a11 = this$0.f33954a.a();
        com.auth0.android.jwt.c a12 = a11 == null ? null : at.c.f6724a.a(a11);
        if ((a12 == null ? null : a12.toString()) != null) {
            if (!s.c(a12.toString(), cVar == null ? null : cVar.toString())) {
                this$0.f33957d.unlock();
                f33953e.i("Token has been updated, return with the latest value");
                String cVar2 = a12.toString();
                s.f(cVar2, "latestLocalToken.toString()");
                nVar.onSuccess(new k.b(cVar2));
                return;
            }
        }
        try {
            try {
                b11 = this$0.b();
            } catch (Exception e11) {
                f33953e.d("error occurs when requesting token", e11);
                nVar.onSuccess(new k.a(e11));
            }
            if (b11 == null) {
                com.tesla.logging.g gVar = f33953e;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String h11 = gVar.h();
                ht.a aVar = ht.a.f29422a;
                f14 = r0.f(v.a(h11, "missing refresh token"));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : f14.entrySet()) {
                    ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception("missing refresh token"));
                TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
                n80.a.a("missing refresh token", new Object[0]);
                nVar.onSuccess(new k.a(new IllegalStateException("Missing refresh token!")));
                return;
            }
            if (str == null) {
                str = this$0.getIssuer();
            }
            if (str == null) {
                com.tesla.logging.g gVar2 = f33953e;
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String h12 = gVar2.h();
                ht.a aVar2 = ht.a.f29422a;
                f13 = r0.f(v.a(h12, "missing issuer"));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : f13.entrySet()) {
                    ht.a.f29422a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception("missing issuer"));
                TeslaLog.setTag$default(teslaLog2, h12, false, 2, null);
                n80.a.a("missing issuer", new Object[0]);
                nVar.onSuccess(new k.a(new IllegalStateException("Missing issuer!")));
                return;
            }
            com.tesla.data.oapi.k remoteTokenResponse = this$0.i().a(b11, str).b();
            s.f(remoteTokenResponse, "remoteTokenResponse");
            c0<String> m11 = this$0.m(remoteTokenResponse);
            int a13 = remoteTokenResponse.a();
            if (m11.c()) {
                com.tesla.logging.g gVar3 = f33953e;
                TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                String h13 = gVar3.h();
                ht.a aVar3 = ht.a.f29422a;
                f11 = r0.f(v.a(h13, "failed to get new token"));
                FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry3 : f11.entrySet()) {
                    ht.a.f29422a.a((String) entry3.getKey(), (String) entry3.getValue());
                }
                firebaseCrashlytics3.recordException(new Exception("failed to get new token"));
                TeslaLog.setTag$default(teslaLog3, h13, false, 2, null);
                n80.a.a("failed to get new token", new Object[0]);
                if (a13 == com.tesla.data.oapi.j.UNAUTHORIZED.getCode()) {
                    com.tesla.logging.g gVar4 = f33953e;
                    TeslaLog teslaLog4 = TeslaLog.INSTANCE;
                    String h14 = gVar4.h();
                    ht.a aVar4 = ht.a.f29422a;
                    f12 = r0.f(v.a(h14, "token response code is 401"));
                    FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry4 : f12.entrySet()) {
                        ht.a.f29422a.a((String) entry4.getKey(), (String) entry4.getValue());
                    }
                    firebaseCrashlytics4.recordException(new Exception("token response code is 401"));
                    TeslaLog.setTag$default(teslaLog4, h14, false, 2, null);
                    n80.a.a("token response code is 401", new Object[0]);
                    com.tesla.logging.a.d(a.EnumC0395a.AUTH_FAILURE, null, 2, null);
                    this$0.n();
                }
                nVar.onSuccess(new k.c(m11.a(), a13));
            } else {
                f33953e.i("token is refreshed");
                nVar.onSuccess(new k.d(m11.b()));
            }
        } finally {
            this$0.f33957d.unlock();
        }
    }

    private final c0<String> m(com.tesla.data.oapi.k kVar) {
        if (com.tesla.data.oapi.f.isUnauthorized(kVar.a())) {
            return c0.f60762e.a(new IllegalStateException(com.tesla.data.oapi.f.OWNERAPI_ERROR_UNAUTHORIZED.getErrorString()));
        }
        if (kVar.e() != null) {
            JSONObject e11 = kVar.e();
            s.e(e11);
            String j11 = j(e11, "access_token");
            String j12 = j(e11, "refresh_token");
            String j13 = j(e11, "id_token");
            if (j11 != null) {
                this.f33954a.c(j11);
            }
            if (j12 != null) {
                this.f33954a.e(j12);
            }
            if (j13 != null) {
                com.auth0.android.jwt.c a11 = at.c.f6724a.a(j13);
                if (a11 != null) {
                    yu.b.t(this.f33956c, a11.c("email").asString());
                    yu.b.u(this.f33956c, a11.c("phone_number").asString());
                }
                this.f33954a.f(j13);
            }
            if (j11 == null) {
                return c0.f60762e.a(new IllegalStateException("access token was null on refresh!"));
            }
            return c0.f60762e.b(j11);
        } else if (kVar.b() != null) {
            c0.a aVar = c0.f60762e;
            com.tesla.data.oapi.f b11 = kVar.b();
            s.e(b11);
            return aVar.a(new IllegalStateException(b11.getErrorString()));
        } else {
            c0.a aVar2 = c0.f60762e;
            com.tesla.data.oapi.j g11 = kVar.g();
            return aVar2.a(new IllegalStateException("Unhandled token response error: status code => " + g11));
        }
    }

    private final void n() {
        js.a aVar = this.f33954a;
        aVar.c(null);
        aVar.e(null);
        aVar.f(null);
    }

    @Override // js.b
    public String a() {
        return this.f33954a.a();
    }

    @Override // js.b
    public String b() {
        return this.f33954a.b();
    }

    @Override // js.b
    public m<p<c0<String>, Integer>> c(String authorizationCode, String codeVerifier, String issuer) {
        s.g(authorizationCode, "authorizationCode");
        s.g(codeVerifier, "codeVerifier");
        s.g(issuer, "issuer");
        m o11 = i().c(issuer, authorizationCode, codeVerifier).o(new ky.h() { // from class: js.h
            @Override // ky.h
            public final Object apply(Object obj) {
                return i.g(i.this, (com.tesla.data.oapi.k) obj);
            }
        });
        s.f(o11, "remote\n      .getToken(i… to response.code\n      }");
        return o11;
    }

    @Override // js.b
    public String d() {
        return this.f33954a.d();
    }

    @Override // js.b
    public void e() {
        n();
        yu.b.t(this.f33956c, null);
        yu.b.u(this.f33956c, null);
    }

    @Override // js.b
    public m<k> f(final String str, boolean z11) {
        m e11;
        String a11 = this.f33954a.a();
        final com.auth0.android.jwt.c a12 = a11 == null ? null : at.c.f6724a.a(a11);
        if (!z11 && a12 != null && a12.d() != null) {
            Date date = new Date();
            Date d11 = a12.d();
            s.e(d11);
            if (!date.after(new Date(d11.getTime() - 30000))) {
                String cVar = a12.toString();
                s.f(cVar, "localToken.toString()");
                e11 = m.n(new k.b(cVar));
                m<k> w11 = e11.w(bz.a.c());
                s.f(w11, "singleResult.subscribeOn(Schedulers.io())");
                return w11;
            }
        }
        e11 = m.e(new hy.p() { // from class: js.g
            @Override // hy.p
            public final void a(n nVar) {
                i.h(i.this, a12, str, nVar);
            }
        });
        m<k> w112 = e11.w(bz.a.c());
        s.f(w112, "singleResult.subscribeOn(Schedulers.io())");
        return w112;
    }

    @Override // js.b
    public String getIssuer() {
        return this.f33954a.getIssuer();
    }

    public final e i() {
        e eVar = this.f33955b;
        if (eVar != null) {
            return eVar;
        }
        s.x("remote");
        return null;
    }
}