package ou;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.s;
import nu.b;
import vz.v;
import wz.r0;

/* loaded from: classes6.dex */
public final class a implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f44043b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final g f44044c = g.f21878b.a("TeslaNotificationActionFactory");

    /* renamed from: d  reason: collision with root package name */
    private static final Map<ut.a, nu.a> f44045d = new LinkedHashMap();

    private a() {
    }

    @Override // nu.b
    public nu.a b(ut.a action) {
        s.g(action, "action");
        return f44045d.get(action);
    }

    @Override // nu.b
    public void c(ut.a action, nu.a notificationAction) {
        Map f11;
        s.g(action, "action");
        s.g(notificationAction, "notificationAction");
        if (f44045d.containsKey(action)) {
            g gVar = f44044c;
            String str = action.name() + " already set in factory";
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(v.a(h11, str));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(str));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a(str, new Object[0]);
        }
        f44045d.put(action, notificationAction);
    }
}