package gv;

import android.content.Context;
import android.os.Build;
import bu.x0;
import bu.y0;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import vz.v;
import wz.s0;
import wz.w;

/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f28153a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static final vz.k f28154b;

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28155a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f28156b;

        static {
            int[] iArr = new int[bu.j.values().length];
            iArr[bu.j.AUTHENTICATION_LEVEL_NONE.ordinal()] = 1;
            iArr[bu.j.AUTHENTICATION_LEVEL_UNLOCK.ordinal()] = 2;
            iArr[bu.j.AUTHENTICATION_LEVEL_DRIVE.ordinal()] = 3;
            f28155a = iArr;
            int[] iArr2 = new int[y0.values().length];
            iArr2[y0.HANDLE_PULLED_FRONT_DRIVER_DOOR.ordinal()] = 1;
            iArr2[y0.HANDLE_PULLED_FRONT_PASSENGER_DOOR.ordinal()] = 2;
            iArr2[y0.HANDLE_PULLED_REAR_DRIVER_DOOR.ordinal()] = 3;
            iArr2[y0.HANDLE_PULLED_REAR_PASSENGER_DOOR.ordinal()] = 4;
            iArr2[y0.HANDLE_PULLED_TRUNK.ordinal()] = 5;
            iArr2[y0.HANDLE_PULLED_CHARGE_PORT.ordinal()] = 6;
            iArr2[y0.HANDLE_PULLED_FRONT_DRIVER_AUTO_PRESENT_DOOR.ordinal()] = 7;
            iArr2[y0.HANDLE_PULLED_FRONT_PASSENGER_AUTO_PRESENT_DOOR.ordinal()] = 8;
            iArr2[y0.HANDLE_PULLED_OTHER.ordinal()] = 9;
            f28156b = iArr2;
        }
    }

    /* loaded from: classes6.dex */
    static final class b extends u implements h00.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f28157a = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    static {
        vz.k a11;
        a11 = vz.m.a(b.f28157a);
        f28154b = a11;
    }

    private j() {
    }

    private final Map<String, Object> a(bu.f fVar) {
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = 0;
        for (Object obj : fVar.e()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                w.s();
            }
            x0 x0Var = (x0) obj;
            String str3 = fVar.e().size() > 1 ? i11 + "_" : "";
            linkedHashMap.put(str3 + "keyChannel", Integer.valueOf(x0Var.m()));
            String str4 = str3 + "authenticationLevel";
            int i13 = a.f28155a[x0Var.c().ordinal()];
            if (i13 == 1) {
                str2 = PermissionsResponse.SCOPE_NONE;
            } else if (i13 == 2) {
                str2 = "unlock";
            } else if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                str2 = "drive";
            }
            linkedHashMap.put(str4, str2);
            linkedHashMap.put(str3 + "present", Boolean.valueOf(x0Var.n()));
            linkedHashMap.put(str3 + "rssiLeft", Integer.valueOf(x0Var.q()));
            linkedHashMap.put(str3 + "rssiRight", Integer.valueOf(x0Var.v()));
            linkedHashMap.put(str3 + "rssiRear", Integer.valueOf(x0Var.s()));
            linkedHashMap.put(str3 + "rssiCenter", Integer.valueOf(x0Var.o()));
            linkedHashMap.put(str3 + "rssiFront", Integer.valueOf(x0Var.p()));
            linkedHashMap.put(str3 + "rssiSecondary", Integer.valueOf(x0Var.w()));
            linkedHashMap.put(str3 + "rssiNFCCradle", Integer.valueOf(x0Var.r()));
            linkedHashMap.put(str3 + "rssiRearLeft", Integer.valueOf(x0Var.t()));
            linkedHashMap.put(str3 + "rssiRearRight", Integer.valueOf(x0Var.u()));
            linkedHashMap.put(str3 + "highThreshLeftPresent", Boolean.valueOf(x0Var.f()));
            linkedHashMap.put(str3 + "highThreshRightPresent", Boolean.valueOf(x0Var.k()));
            linkedHashMap.put(str3 + "highThreshCenterPresent", Boolean.valueOf(x0Var.d()));
            linkedHashMap.put(str3 + "highThreshFrontPresent", Boolean.valueOf(x0Var.e()));
            linkedHashMap.put(str3 + "highThreshRearPresent", Boolean.valueOf(x0Var.i()));
            linkedHashMap.put(str3 + "highThreshRearLeftPresent", Boolean.valueOf(x0Var.h()));
            linkedHashMap.put(str3 + "highThreshRearRightPresent", Boolean.valueOf(x0Var.j()));
            linkedHashMap.put(str3 + "highThreshSecondaryPresent", Boolean.valueOf(x0Var.l()));
            linkedHashMap.put(str3 + "highThreshNFCPresent", Boolean.valueOf(x0Var.g()));
            linkedHashMap.put(str3 + "sortedDeltaBayesLeftPresent", Boolean.valueOf(x0Var.z()));
            linkedHashMap.put(str3 + "sortedDeltaBayesRightPresent", Boolean.valueOf(x0Var.A()));
            linkedHashMap.put(str3 + "rawDeltaBayesLeftPresent", Boolean.valueOf(x0Var.x()));
            linkedHashMap.put(str3 + "rawDeltaBayesRightPresent", Boolean.valueOf(x0Var.y()));
            i11 = i12;
        }
        linkedHashMap.put("time_since_alert_set_ms", Integer.valueOf(fVar.g()));
        switch (a.f28156b[fVar.f().ordinal()]) {
            case 1:
                str = "front_driver_door";
                break;
            case 2:
                str = "front_passenger_door";
                break;
            case 3:
                str = "rear_driver_door";
                break;
            case 4:
                str = "rear_passenger_door";
                break;
            case 5:
                str = "trunk";
                break;
            case 6:
                str = "charge_port";
                break;
            case 7:
                str = "front_driver_auto_present_door";
                break;
            case 8:
                str = "front_passenger_auto_present_door";
                break;
            case 9:
                str = "other";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        linkedHashMap.put("handle_pulled", str);
        linkedHashMap.put("connection_count", Integer.valueOf(fVar.d()));
        linkedHashMap.put("unknown_device_present", Boolean.valueOf(fVar.h()));
        linkedHashMap.put("auth_requested", Boolean.valueOf(fVar.c()));
        return linkedHashMap;
    }

    private final long b() {
        return ((Number) f28154b.getValue()).longValue();
    }

    public static final void d(Context context, bu.f alert, Map<String, String> metadata) {
        Map l11;
        Map p11;
        Map<String, ? extends Object> y11;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(alert, "alert");
        kotlin.jvm.internal.s.g(metadata, "metadata");
        j jVar = f28153a;
        l11 = s0.l(v.a("type", "mobile-app-handle-pull-telemetry"), v.a("app_launch_time", Long.valueOf(jVar.b())));
        p11 = s0.p(l11, metadata);
        y11 = s0.y(p11);
        y11.put("alert", jVar.a(alert));
        y11.put("location_permission_status", Integer.valueOf(androidx.core.content.b.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION")));
        if (Build.VERSION.SDK_INT >= 31) {
            y11.put("bluetooth_scan_permission_status", Integer.valueOf(androidx.core.content.b.checkSelfPermission(context, "android.permission.BLUETOOTH_SCAN")));
            y11.put("bluetooth_connect_permission_status", Integer.valueOf(androidx.core.content.b.checkSelfPermission(context, "android.permission.BLUETOOTH_CONNECT")));
        }
        yu.m.f59801c.b(context).d(y11, false);
    }

    public final void c() {
        b();
    }
}