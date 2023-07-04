package zu;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.util.Locale;
import java.util.Map;
import wz.r0;

/* loaded from: classes6.dex */
public final class d0 {
    public static final String a(yt.f fVar, com.tesla.logging.g logger) {
        Map f11;
        Map f12;
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(logger, "logger");
        yt.a k11 = fVar.k();
        okio.i d11 = k11 == null ? null : k11.d();
        if (k11 == null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = logger.h();
            ht.a aVar = ht.a.f29422a;
            f12 = r0.f(vz.v.a(h11, "RoutableMessage destination is null"));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f12.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("RoutableMessage destination is null"));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a("RoutableMessage destination is null", new Object[0]);
            return "";
        } else if (d11 == null) {
            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
            String h12 = logger.h();
            ht.a aVar2 = ht.a.f29422a;
            f11 = r0.f(vz.v.a(h12, "RoutableMessage routing address is null"));
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry2 : f11.entrySet()) {
                ht.a.f29422a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics2.recordException(new Exception("RoutableMessage routing address is null"));
            TeslaLog.setTag$default(teslaLog2, h12, false, 2, null);
            n80.a.a("RoutableMessage routing address is null", new Object[0]);
            return "";
        } else {
            String n11 = d11.n();
            if (n11 == null) {
                return "";
            }
            Locale US = Locale.US;
            kotlin.jvm.internal.s.f(US, "US");
            String upperCase = n11.toUpperCase(US);
            kotlin.jvm.internal.s.f(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return upperCase == null ? "" : upperCase;
        }
    }
}