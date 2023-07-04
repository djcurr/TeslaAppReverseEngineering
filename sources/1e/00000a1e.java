package as;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jt.c;
import jt.e;
import jt.f;
import jt.h;
import kotlin.jvm.internal.s;
import vz.v;
import wz.r0;

/* loaded from: classes6.dex */
public final class b implements es.a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f6721a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final g f6722b = g.f21878b.a("FirebaseAnalyticsAdapter");

    /* renamed from: c  reason: collision with root package name */
    private static FirebaseAnalytics f6723c;

    private b() {
    }

    private final String d(String str) {
        Locale US = Locale.US;
        s.f(US, "US");
        String lowerCase = str.toLowerCase(US);
        s.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Override // es.a
    public void a(c event) {
        String c11;
        Map f11;
        s.g(event, "event");
        if (f6723c == null) {
            g gVar = f6722b;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(v.a(h11, "record called but firebase analytics is null"));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("record called but firebase analytics is null"));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a("record called but firebase analytics is null", new Object[0]);
            return;
        }
        Bundle bundle = new Bundle();
        for (f fVar : event.d()) {
            b bVar = f6721a;
            String d11 = bVar.d(fVar.f().name());
            jt.a c12 = fVar.c();
            if (c12 != null) {
                bundle.putBoolean(d11, c12.c());
            }
            jt.b d12 = fVar.d();
            if (d12 != null) {
                bundle.putDouble(d11, d12.c());
            }
            h g11 = fVar.g();
            if (g11 != null && (c11 = g11.c()) != null) {
                bundle.putString(d11, bVar.d(c11));
            }
            e e11 = fVar.e();
            if (e11 != null) {
                bundle.putLong(d11, e11.c());
            }
        }
        FirebaseAnalytics firebaseAnalytics = f6723c;
        if (firebaseAnalytics == null) {
            return;
        }
        firebaseAnalytics.a(d(event.c().name()), bundle);
    }

    @Override // es.a
    public void b(List<f> list) {
        String c11;
        Map f11;
        if (f6723c == null) {
            g gVar = f6722b;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(v.a(h11, "record called but firebase analytics is null"));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("record called but firebase analytics is null"));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a("record called but firebase analytics is null", new Object[0]);
            return;
        }
        Bundle bundle = new Bundle();
        if (list != null) {
            for (f fVar : list) {
                b bVar = f6721a;
                String d11 = bVar.d(fVar.f().name());
                jt.a c12 = fVar.c();
                if (c12 != null) {
                    bundle.putBoolean(d11, c12.c());
                }
                jt.b d12 = fVar.d();
                if (d12 != null) {
                    bundle.putDouble(d11, d12.c());
                }
                h g11 = fVar.g();
                if (g11 != null && (c11 = g11.c()) != null) {
                    bundle.putString(d11, bVar.d(c11));
                }
                e e11 = fVar.e();
                if (e11 != null) {
                    bundle.putLong(d11, e11.c());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f6723c;
        if (firebaseAnalytics == null) {
            return;
        }
        firebaseAnalytics.c(bundle);
    }

    public final void c(FirebaseAnalytics firebaseAnalytics) {
        f6723c = firebaseAnalytics;
    }
}