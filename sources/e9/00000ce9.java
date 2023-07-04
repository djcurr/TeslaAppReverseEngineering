package bt;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.s;
import vz.v;
import wz.r0;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7915a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<b> f7916b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private static final g f7917c = g.f21878b.a("DataModule");

    private a() {
    }

    public static final void a(b dependency) {
        Map f11;
        s.g(dependency, "dependency");
        if (f7916b.compareAndSet(null, dependency)) {
            return;
        }
        g gVar = f7917c;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String h11 = gVar.h();
        ht.a aVar = ht.a.f29422a;
        f11 = r0.f(v.a(h11, "Do not init module twice"));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : f11.entrySet()) {
            ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception("Do not init module twice"));
        TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
        n80.a.a("Do not init module twice", new Object[0]);
    }

    public static final void b() {
        Map f11;
        b bVar = f7916b.get();
        if (bVar == null) {
            g gVar = f7917c;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h11 = gVar.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(v.a(h11, "DataModuleDependency is not set before calling showLowDiskNotification"));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("DataModuleDependency is not set before calling showLowDiskNotification"));
            TeslaLog.setTag$default(teslaLog, h11, false, 2, null);
            n80.a.a("DataModuleDependency is not set before calling showLowDiskNotification", new Object[0]);
            return;
        }
        bVar.a();
    }
}