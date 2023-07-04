package it;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.squareup.moshi.p;
import com.tesla.features.FeaturesConfig;
import com.tesla.logging.TeslaLog;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.r0;

/* loaded from: classes6.dex */
public final class g implements d {

    /* renamed from: d  reason: collision with root package name */
    private static final com.tesla.logging.g f32757d;

    /* renamed from: b  reason: collision with root package name */
    private final ct.i f32758b;

    /* renamed from: c  reason: collision with root package name */
    private final com.squareup.moshi.f<FeaturesConfig> f32759c;

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
        f32757d = com.tesla.logging.g.f21878b.a("FeaturesConfigRepository");
    }

    public g(ct.i realmHelper) {
        s.g(realmHelper, "realmHelper");
        this.f32758b = realmHelper;
        this.f32759c = new p.b().d().c(FeaturesConfig.class);
    }

    @Override // it.d
    public FeaturesConfig a() {
        try {
            String g11 = this.f32758b.g("FEATURE_CONFIG");
            if (g11 == null) {
                return null;
            }
            return this.f32759c.c(g11);
        } catch (Exception e11) {
            f32757d.d("error getting local config", e11);
            return null;
        }
    }

    @Override // it.d
    public void b(FeaturesConfig featuresConfig) {
        Map f11;
        try {
            if (featuresConfig == null) {
                this.f32758b.q("FEATURE_CONFIG");
            } else if (!this.f32758b.t("FEATURE_CONFIG", this.f32759c.i(featuresConfig))) {
                com.tesla.logging.g gVar = f32757d;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String h11 = gVar.h();
                ht.a aVar = ht.a.f29422a;
                f11 = r0.f(v.a(h11, "failed to persist config"));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : f11.entrySet()) {
                    ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception("failed to persist config"));
                TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
                n80.a.a("failed to persist config", new Object[0]);
            }
        } catch (Exception e11) {
            f32757d.d("failure setting feature config", e11);
        }
    }
}