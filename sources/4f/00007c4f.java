package jv;

import android.content.Context;
import com.tesla.logging.TeslaLog;
import com.teslamotors.plugins.ble.beacon.BeaconInjector;

/* loaded from: classes6.dex */
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0626a f33993a = C0626a.f33994a;

    /* renamed from: jv.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0626a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0626a f33994a = new C0626a();

        /* renamed from: b  reason: collision with root package name */
        private static final a f33995b;

        static {
            a aVar = null;
            try {
                BeaconInjector beaconInjector = BeaconInjector.INSTANCE;
                Object invoke = BeaconInjector.class.getDeclaredMethod("inject", new Class[0]).invoke(BeaconInjector.class.getDeclaredField("INSTANCE").get(null), new Object[0]);
                if (!(invoke instanceof a)) {
                    invoke = null;
                }
                aVar = (a) invoke;
            } catch (Exception e11) {
                TeslaLog.INSTANCE.e("ReflectionHelper", "can not invoke static method# inject on class# com.teslamotors.plugins.ble.beacon.BeaconInjector", e11);
            }
            if (aVar == null) {
                aVar = b.a();
            }
            f33995b = aVar;
        }

        private C0626a() {
        }

        public final a a() {
            return f33995b;
        }
    }

    static a a() {
        return f33993a.a();
    }

    c b(Context context);

    c c(String str, String str2, Context context);

    c d(String str, String str2, Context context);

    boolean isSupported(Context context);
}