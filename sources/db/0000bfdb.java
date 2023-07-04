package xs;

import android.content.Context;
import bu.d0;
import bu.e0;
import bu.g2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.data.oapi.CalendarData;
import com.tesla.data.oapi.CalendarDataJsonAdapter;
import com.tesla.data.oapi.CalendarSyncParameters;
import com.tesla.logging.TeslaLog;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import kt.f;
import kt.u;
import ls.b;
import lt.h;
import lt.h2;
import lt.j2;
import lt.k2;
import lt.l2;
import lt.m2;
import lt.n0;
import lt.o0;
import lt.p0;
import lt.p2;
import lt.r2;
import lt.s1;
import lt.t0;
import lt.t2;
import lt.v2;
import org.spongycastle.crypto.tls.CipherSuite;
import ot.c;
import ot.d;
import ot.m;
import vz.b0;
import vz.v;
import wz.r0;
import wz.w;
import ys.j;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f57689a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static j f57690b;

    private b() {
    }

    public static /* synthetic */ c E(b bVar, String str, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = d.SOURCE_NOTIFICATION;
        }
        return bVar.D(str, dVar);
    }

    public static /* synthetic */ c G(b bVar, String str, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = d.SOURCE_NOTIFICATION;
        }
        return bVar.F(str, dVar);
    }

    public static /* synthetic */ c J(b bVar, String str, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = d.SOURCE_NOTIFICATION;
        }
        return bVar.I(str, dVar);
    }

    public static /* synthetic */ c L(b bVar, String str, boolean z11, d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            dVar = d.SOURCE_NOTIFICATION;
        }
        return bVar.K(str, z11, dVar);
    }

    public static /* synthetic */ c b(b bVar, String str, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = d.SOURCE_NOTIFICATION;
        }
        return bVar.a(str, dVar);
    }

    public static /* synthetic */ c d(b bVar, String str, boolean z11, boolean z12, d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        if ((i11 & 8) != 0) {
            dVar = d.SOURCE_NOTIFICATION;
        }
        return bVar.c(str, z11, z12, dVar);
    }

    public static /* synthetic */ c g(b bVar, String str, String str2, boolean z11, d dVar, Context context, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            dVar = d.SOURCE_APP_NATIVE;
        }
        return bVar.f(str, str2, z11, dVar, context);
    }

    public static /* synthetic */ c i(b bVar, String str, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = d.SOURCE_NOTIFICATION;
        }
        return bVar.h(str, dVar);
    }

    public static /* synthetic */ c k(b bVar, String str, p0.a aVar, boolean z11, d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            dVar = d.SOURCE_NOTIFICATION;
        }
        return bVar.j(str, aVar, z11, dVar);
    }

    public static /* synthetic */ c m(b bVar, String str, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = d.SOURCE_NOTIFICATION;
        }
        return bVar.l(str, dVar);
    }

    public static /* synthetic */ c o(b bVar, String str, boolean z11, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            dVar = d.SOURCE_NOTIFICATION;
        }
        return bVar.n(str, z11, dVar);
    }

    public static /* synthetic */ c q(b bVar, String str, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = d.SOURCE_NOTIFICATION;
        }
        return bVar.p(str, dVar);
    }

    private final List<m> u(String str) {
        Map f11;
        List<m> l11;
        j jVar = f57690b;
        if (jVar == null) {
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(v.a("VehicleCommandRequestFactory", "Missing call to initialize. Cannot get transports for command. Defaulting to BLE & OAPI."));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception("Missing call to initialize. Cannot get transports for command. Defaulting to BLE & OAPI."));
            TeslaLog.setTag$default(teslaLog, "VehicleCommandRequestFactory", false, 2, null);
            n80.a.a("Missing call to initialize. Cannot get transports for command. Defaulting to BLE & OAPI.", new Object[0]);
            l11 = w.l(m.TRANSPORT_BLUETOOTH, m.TRANSPORT_OWNER_API);
            return l11;
        }
        s.e(jVar);
        return jVar.a(str);
    }

    public static /* synthetic */ c y(b bVar, String str, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = d.SOURCE_NOTIFICATION;
        }
        return bVar.x(str, dVar);
    }

    public final c A(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        c b11 = uu.b.f53671a.b();
        List<m> u11 = u(vehicleId);
        e0 e0Var = e0.CLOSURE_MOVE_TYPE_OPEN;
        return c.b(b11, null, vehicleId, u11, source, null, false, false, new ot.b(null, null, new d0(e0Var, e0Var, e0Var, e0Var, null, null, null, null, 240, null), null, null, null, null, null, null, 507, null), null, 369, null);
    }

    public final c B(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(null, null, new d0(null, null, null, null, null, null, e0.CLOSURE_MOVE_TYPE_OPEN, null, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, null), null, null, null, null, null, null, 507, null), null, 369, null);
    }

    public final c C(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, new s1(null, 1, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c D(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new p2(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c F(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new r2(false, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435457, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c H(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new r2(true, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435457, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c I(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, new lt.m(null, null, null, null, new u(null, 1, null), null, 47, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c K(String vehicleId, boolean z11, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new t2(null, null, z11 ? new u(null, 1, null) : null, !z11 ? new u(null, 1, null) : null, null, null, 51, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741825, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c M(String vehicleId, d source) {
        List d11;
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        c b11 = uu.b.f53671a.b();
        d11 = wz.v.d(m.TRANSPORT_BLUETOOTH);
        return c.b(b11, null, vehicleId, d11, source, null, false, false, new ot.b(null, null, new d0(e0.CLOSURE_MOVE_TYPE_OPEN, null, null, null, null, null, null, null, 254, null), null, null, null, null, null, null, 507, null), null, 369, null);
    }

    public final c N(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(null, g2.RKE_ACTION_UNLOCK, null, null, null, null, null, null, null, 509, null), null, 369, null);
    }

    public final c O(String vehicleId, double d11, double d12, boolean z11, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new v2(new f((float) d11, (float) d12, null, 4, null), null, !z11 ? new u(null, 1, null) : null, z11 ? new u(null, 1, null) : null, null, 18, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -2, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c a(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(null, null, new d0(null, null, null, null, e0.CLOSURE_MOVE_TYPE_MOVE, null, null, null, 239, null), null, null, null, null, null, null, 507, null), null, 369, null);
    }

    public final c c(String vehicleId, boolean z11, boolean z12, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new o0(!z11, z12, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -3, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c e(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new h(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -536870913, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c f(String vehicleId, String reason, boolean z11, d source, Context context) {
        List Q0;
        String i11;
        s.g(vehicleId, "vehicleId");
        s.g(reason, "reason");
        s.g(source, "source");
        s.g(context, "context");
        b.a a11 = ls.b.f37327a.a(context, new CalendarSyncParameters(reason, z11, vehicleId));
        if (a11.b() == null) {
            c b11 = uu.b.f53671a.b();
            Q0 = wz.e0.Q0(u(vehicleId));
            Q0.remove(m.TRANSPORT_BLUETOOTH);
            b0 b0Var = b0.f54756a;
            CalendarData a12 = a11.a();
            String str = "";
            if (a12 != null && (i11 = new CalendarDataJsonAdapter(com.tesla.data.oapi.a.f21724a.a()).i(a12)) != null) {
                str = i11;
            }
            return c.b(b11, null, vehicleId, Q0, source, null, true, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new h2(str, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4194305, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 337, null);
        }
        return null;
    }

    public final c h(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new k2(null, 1, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c j(String vehicleId, p0.a mode, boolean z11, d source) {
        List<m> u11;
        s.g(vehicleId, "vehicleId");
        s.g(mode, "mode");
        s.g(source, "source");
        c b11 = uu.b.f53671a.b();
        if (z11) {
            u11 = wz.v.d(m.TRANSPORT_OWNER_API);
        } else {
            u11 = u(vehicleId);
        }
        return c.b(b11, null, vehicleId, u11, source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new p0(mode, z11, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1025, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c l(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, new n0(false, false, null, 6, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -513, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c n(String vehicleId, boolean z11, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, new n0(true, z11, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -513, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c p(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new v2(new f(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 4, null), null, null, new u(null, 1, null), null, 22, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -2, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c r(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(null, null, new d0(null, null, null, null, null, null, e0.CLOSURE_MOVE_TYPE_CLOSE, null, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, null), null, null, null, null, null, null, 507, null), null, 369, null);
    }

    public final c s(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(null, g2.RKE_ACTION_AUTO_SECURE_VEHICLE, null, null, null, null, null, null, null, 509, null), null, 369, null);
    }

    public final c t(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new l2(null, 1, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final c v(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new m2(null, 1, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33554433, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }

    public final void w(j getTransportList) {
        s.g(getTransportList, "getTransportList");
        f57690b = getTransportList;
    }

    public final c x(String vehicleId, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(null, g2.RKE_ACTION_LOCK, null, null, null, null, null, null, null, 509, null), null, 369, null);
    }

    public final c z(String vehicleId, boolean z11, boolean z12, List<? extends t0.c> manual_override_mode, d source) {
        s.g(vehicleId, "vehicleId");
        s.g(manual_override_mode, "manual_override_mode");
        s.g(source, "source");
        return c.b(uu.b.f53671a.b(), null, vehicleId, u(vehicleId), source, null, false, false, new ot.b(new j2(null, null, null, null, null, null, null, null, null, null, new t0(z11, z12, manual_override_mode, null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, 4095, null), null, null, null, null, null, null, null, null, 510, null), null, 369, null);
    }
}