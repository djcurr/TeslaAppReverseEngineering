package ls;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.data.oapi.CalendarData;
import com.tesla.data.oapi.CalendarSyncParameters;
import com.tesla.logging.TeslaLog;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.r0;
import yu.z;
import zu.a0;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f37327a = new b();

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final C0709a f37328c = new C0709a(null);

        /* renamed from: a  reason: collision with root package name */
        private final String f37329a;

        /* renamed from: b  reason: collision with root package name */
        private final CalendarData f37330b;

        /* renamed from: ls.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0709a {
            private C0709a() {
            }

            public /* synthetic */ C0709a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(String errorMessage) {
                s.g(errorMessage, "errorMessage");
                return new a(errorMessage, null);
            }

            public final a b(CalendarData calendar) {
                s.g(calendar, "calendar");
                return new a(null, calendar);
            }
        }

        public a(String str, CalendarData calendarData) {
            this.f37329a = str;
            this.f37330b = calendarData;
        }

        public final CalendarData a() {
            return this.f37330b;
        }

        public final String b() {
            return this.f37329a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return s.c(this.f37329a, aVar.f37329a) && s.c(this.f37330b, aVar.f37330b);
            }
            return false;
        }

        public int hashCode() {
            String str = this.f37329a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            CalendarData calendarData = this.f37330b;
            return hashCode + (calendarData != null ? calendarData.hashCode() : 0);
        }

        public String toString() {
            String str = this.f37329a;
            CalendarData calendarData = this.f37330b;
            return "BuildResult(errorMessage=" + str + ", data=" + calendarData + ")";
        }
    }

    private b() {
    }

    public final a a(Context context, CalendarSyncParameters params) {
        ms.a aVar;
        Map f11;
        s.g(context, "context");
        s.g(params, "params");
        String a11 = params.a();
        boolean b11 = params.b();
        if (b11) {
            aVar = ls.a.f37311a.a(context);
        } else {
            aVar = new ms.a();
        }
        if (aVar == null) {
            return a.f37328c.a("CALENDAR_SYNC_DISABLED");
        }
        ns.b.f41863a.a("Calendar data successfully queried");
        if (!a0.a(context)) {
            return a.f37328c.a("MISSING_BLUETOOTH_CONNECT_PERMISSION");
        }
        Object systemService = context.getSystemService("bluetooth");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        BluetoothAdapter adapter = ((BluetoothManager) systemService).getAdapter();
        String name = adapter == null ? null : adapter.getName();
        if (name == null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            ht.a aVar2 = ht.a.f29422a;
            f11 = r0.f(v.a("CalendarSyncBuilder", "MISSING_BLE_ADAPTER_NAME"));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("MISSING_BLE_ADAPTER_NAME"));
            TeslaLog.setTag$default(teslaLog, "CalendarSyncBuilder", false, 2, null);
            n80.a.a("MISSING_BLE_ADAPTER_NAME", new Object[0]);
            return a.f37328c.a("MISSING_BLE_ADAPTER_NAME");
        }
        z p11 = z.p(context);
        try {
            a.C0709a c0709a = a.f37328c;
            boolean z11 = !b11;
            String k11 = p11.k();
            s.f(k11, "teslaClient.appUUID");
            return c0709a.b(new CalendarData(z11, name, false, false, k11, a11, aVar.c()));
        } catch (Exception e11) {
            TeslaLog.INSTANCE.e("CalendarSyncBuilder", "Failed to serialize calendar data", e11);
            return a.f37328c.a("THROWN_EXCEPTION");
        }
    }
}