package iv;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import gv.k;
import java.util.Map;
import vz.v;
import wz.r0;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a */
    public static final c f32778a = new c();

    private c() {
    }

    public final boolean a(String str) {
        Map f11;
        if (!(str == null || str.length() == 0)) {
            return k.b(str);
        }
        g a11 = g.f21878b.a("PassiveAuthUtils");
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String h11 = a11.h();
        ht.a aVar = ht.a.f29422a;
        f11 = r0.f(v.a(h11, "VIN is null or empty, cannot fetch passive auth state"));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : f11.entrySet()) {
            ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception("VIN is null or empty, cannot fetch passive auth state"));
        TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
        n80.a.a("VIN is null or empty, cannot fetch passive auth state", new Object[0]);
        return true;
    }
}