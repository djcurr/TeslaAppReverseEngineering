package it;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.data.oapi.OwnerApiEndpoint;
import com.tesla.features.FeaturesConfig;
import com.tesla.features.FeaturesConfigEnvelope;
import com.tesla.logging.TeslaLog;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.v;
import wz.r0;
import yu.f;
import zu.c0;

/* loaded from: classes6.dex */
public final class m implements e {

    /* renamed from: g */
    private static final com.tesla.logging.g f32765g;

    /* renamed from: b */
    private final com.tesla.data.oapi.h f32766b;

    /* renamed from: c */
    private final ct.i f32767c;

    /* renamed from: d */
    private final yu.f f32768d;

    /* renamed from: e */
    private final d f32769e;

    /* renamed from: f */
    private final yu.c f32770f;

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
        f32765g = com.tesla.logging.g.f21878b.a("GetFeatureConfig");
    }

    public m(com.tesla.data.oapi.h endpoints, ct.i realmHelper, yu.f sendOwnerRequest, d repository, yu.c getLoggedInStatus) {
        s.g(endpoints, "endpoints");
        s.g(realmHelper, "realmHelper");
        s.g(sendOwnerRequest, "sendOwnerRequest");
        s.g(repository, "repository");
        s.g(getLoggedInStatus, "getLoggedInStatus");
        this.f32766b = endpoints;
        this.f32767c = realmHelper;
        this.f32768d = sendOwnerRequest;
        this.f32769e = repository;
        this.f32770f = getLoggedInStatus;
    }

    public static /* synthetic */ com.tesla.data.oapi.k b(Throwable th2) {
        return m(th2);
    }

    public static /* synthetic */ c0 c(m mVar, com.tesla.data.oapi.k kVar) {
        return g(mVar, kVar);
    }

    public static /* synthetic */ c0 d(Throwable th2) {
        return h(th2);
    }

    public static /* synthetic */ b0 e() {
        return l();
    }

    public static /* synthetic */ c0 f(m mVar, c0 c0Var) {
        return i(mVar, c0Var);
    }

    public static final c0 g(m this$0, com.tesla.data.oapi.k kVar) {
        Map f11;
        Map f12;
        s.g(this$0, "this$0");
        try {
            if (kVar.i()) {
                FeaturesConfigEnvelope c11 = it.a.a().c(String.valueOf(kVar.e()));
                FeaturesConfig config = c11 == null ? null : c11.getConfig();
                if (config == null) {
                    com.tesla.logging.g gVar = f32765g;
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String h11 = gVar.h();
                    ht.a aVar = ht.a.f29422a;
                    f12 = r0.f(v.a(h11, "failed to deserialize config"));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : f12.entrySet()) {
                        ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception("failed to deserialize config"));
                    TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
                    n80.a.a("failed to deserialize config", new Object[0]);
                    return c0.f60762e.a(new IllegalStateException("failed to deserialize config"));
                }
                com.tesla.logging.g gVar2 = f32765g;
                gVar2.i("successfully fetched features config => " + config);
                this$0.f32769e.b(config);
                return c0.f60762e.b(config);
            }
            com.tesla.logging.g gVar3 = f32765g;
            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
            String h12 = gVar3.h();
            ht.a aVar2 = ht.a.f29422a;
            f11 = r0.f(v.a(h12, "failed to fetch config"));
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry2 : f11.entrySet()) {
                ht.a.f29422a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics2.recordException(new Exception("failed to fetch config"));
            TeslaLog.setTag$default(teslaLog2, h12, false, 2, null);
            n80.a.a("failed to fetch config", new Object[0]);
            return c0.f60762e.a(new IllegalStateException("failed to fetch config"));
        } catch (Exception e11) {
            f32765g.d("failed to fetch config", e11);
            return c0.f60762e.a(e11);
        }
    }

    public static final c0 h(Throwable it2) {
        f32765g.d("error getting config", it2);
        c0.a aVar = c0.f60762e;
        s.f(it2, "it");
        return aVar.a(it2);
    }

    public static final c0 i(m this$0, c0 c0Var) {
        s.g(this$0, "this$0");
        if (c0Var.c()) {
            FeaturesConfig a11 = this$0.f32769e.a();
            if (a11 == null) {
                f32765g.i("failed to get local config");
            }
            c0.a aVar = c0.f60762e;
            if (a11 == null) {
                a11 = new FeaturesConfig(null, 1, null);
            }
            return aVar.b(a11);
        }
        return c0Var;
    }

    private final long j() {
        try {
            String g11 = this.f32767c.g("FEATURE_CONFIG_LAST_FETCH");
            if (g11 == null) {
                return 0L;
            }
            return Long.parseLong(g11);
        } catch (Exception e11) {
            f32765g.d("error getting last fetch time", e11);
            return 0L;
        }
    }

    private final hy.b k(boolean z11) {
        if (z11) {
            OwnerApiEndpoint c11 = this.f32766b.c("PRODUCT_LIST");
            if (c11 == null) {
                hy.b e11 = hy.b.e(new Callable() { // from class: it.h
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return m.e();
                    }
                });
                s.f(e11, "fromCallable {\n         …int not found\")\n        }");
                return e11;
            }
            hy.b m11 = f.a.a(this.f32768d, c11.component1(), c11.component2(), 5, c11.component3(), false, 16, null).r(new ky.h() { // from class: it.k
                @Override // ky.h
                public final Object apply(Object obj) {
                    return m.b((Throwable) obj);
                }
            }).m();
            s.f(m11, "sendOwnerRequest\n       …\n        .ignoreElement()");
            return m11;
        }
        hy.b d11 = hy.b.d();
        s.f(d11, "complete()");
        return d11;
    }

    public static final b0 l() {
        Map f11;
        com.tesla.logging.g gVar = f32765g;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String h11 = gVar.h();
        ht.a aVar = ht.a.f29422a;
        f11 = r0.f(v.a(h11, "product list endpoint not found"));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : f11.entrySet()) {
            ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception("product list endpoint not found"));
        TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
        n80.a.a("product list endpoint not found", new Object[0]);
        return b0.f54756a;
    }

    public static final com.tesla.data.oapi.k m(Throwable th2) {
        return com.tesla.data.oapi.k.f21782k.a(com.tesla.data.oapi.j.UNKNOWN);
    }

    private final void n() {
        this.f32767c.t("FEATURE_CONFIG_LAST_FETCH", String.valueOf(System.currentTimeMillis()));
    }

    @Override // it.e
    public hy.m<c0<FeaturesConfig>> a(boolean z11) {
        if (!this.f32770f.a()) {
            hy.m<c0<FeaturesConfig>> n11 = hy.m.n(c0.f60762e.a(new IllegalStateException("not fetching config, not logged in")));
            s.f(n11, "just(\n        Result.fai… not logged in\"))\n      )");
            return n11;
        } else if (System.currentTimeMillis() - j() < 60000 && !z11) {
            c0.a aVar = c0.f60762e;
            FeaturesConfig a11 = this.f32769e.a();
            if (a11 == null) {
                a11 = new FeaturesConfig(null, 1, null);
            }
            hy.m<c0<FeaturesConfig>> n12 = hy.m.n(aVar.b(a11));
            s.f(n12, "just(\n        Result.suc…FeaturesConfig())\n      )");
            return n12;
        } else {
            OwnerApiEndpoint c11 = this.f32766b.c("FEATURE_CONFIG");
            if (c11 == null) {
                hy.m<c0<FeaturesConfig>> n13 = hy.m.n(c0.f60762e.a(new IllegalStateException("endpoint not found")));
                s.f(n13, "just(Result.failure(Ille…n(\"endpoint not found\")))");
                return n13;
            }
            n();
            hy.m<c0<FeaturesConfig>> w11 = k(z11).c(f.a.a(this.f32768d, c11.component1(), c11.component2(), null, c11.component3(), false, 20, null)).o(new ky.h() { // from class: it.i
                @Override // ky.h
                public final Object apply(Object obj) {
                    return m.c(m.this, (com.tesla.data.oapi.k) obj);
                }
            }).r(new ky.h() { // from class: it.l
                @Override // ky.h
                public final Object apply(Object obj) {
                    return m.d((Throwable) obj);
                }
            }).o(new ky.h() { // from class: it.j
                {
                    m.this = this;
                }

                @Override // ky.h
                public final Object apply(Object obj) {
                    return m.f(m.this, (c0) obj);
                }
            }).w(bz.a.c());
            s.f(w11, "getPrerequisiteWork(refr…scribeOn(Schedulers.io())");
            return w11;
        }
    }
}