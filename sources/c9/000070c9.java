package gv;

import android.app.Notification;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.j;
import com.google.android.gms.identity.intents.AddressConstants;
import com.teslamotors.plugins.ble.BLEService;
import java.util.List;
import java.util.Map;
import yu.z;

/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f28160a = new l();

    private l() {
    }

    public static final void a(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        f28160a.e(context).b(444);
    }

    private final PendingIntent b(Context context, nv.c cVar) {
        Intent intent = new Intent(context, BLEService.class);
        intent.setAction("com.teslamotors.ble.action.COMMAND");
        intent.putExtra("command_id", cVar.getWhat());
        return PendingIntent.getService(context, cVar.getWhat(), intent, 67108864);
    }

    public static final j.e c(Context context, String str, Bundle bundle) {
        kotlin.jvm.internal.s.g(context, "context");
        Intent a11 = zu.a.a(context);
        if (bundle != null) {
            kotlin.jvm.internal.s.e(a11);
            a11.putExtra("pushNotification", bundle);
        }
        j.e k11 = nu.j.e(context).h("phone_key_service_channel").m(context.getString(o.f28172i)).l(str).q("com.teslamotors.plugins.ble.BLE_SERVICE").w(true).k(PendingIntent.getActivity(context, AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES, a11, 201326592));
        kotlin.jvm.internal.s.f(k11, "getDefaultNotificationBu…tentIntent(contentIntent)");
        return k11;
    }

    public static final j.e d(Context context, String str, String str2, com.teslamotors.plugins.ble.d vehicleController, Map<String, ? extends com.teslamotors.plugins.ble.d> vehicleControllers, nv.j jVar, List<String> recentlySelectedVins, BluetoothAdapter bluetoothAdapter) {
        com.teslamotors.plugins.ble.d dVar;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(vehicleController, "vehicleController");
        kotlin.jvm.internal.s.g(vehicleControllers, "vehicleControllers");
        kotlin.jvm.internal.s.g(recentlySelectedVins, "recentlySelectedVins");
        String str3 = "";
        if (m.c(context, str2, str) && !m.a(vehicleController, jVar)) {
            String C = z.p(context).C(str2);
            Bundle a11 = jVar != null ? jVar.a() : null;
            if (jVar != null) {
                str3 = context.getString(jVar.b());
                kotlin.jvm.internal.s.f(str3, "context.getString(vehicleStatus.humanStatus)");
            }
            j.e m11 = c(context, str3, a11).m(C);
            kotlin.jvm.internal.s.f(m11, "getForegroundNotificatio…ContentTitle(vehicleName)");
            return m11;
        }
        int i11 = 0;
        j.e eVar = null;
        j.e eVar2 = null;
        for (String str4 : recentlySelectedVins) {
            if (m.c(context, str4, str) && (dVar = vehicleControllers.get(str4)) != null) {
                nv.j jVar2 = new nv.j();
                jVar2.f41926w = bluetoothAdapter != null && bluetoothAdapter.isEnabled();
                dVar.h(jVar2, false);
                if (eVar == null) {
                    eVar = f28160a.g(context, str4, jVar2);
                }
                if (m.a(dVar, jVar2)) {
                    i11++;
                    if (i11 > 1) {
                        break;
                    }
                    l lVar = f28160a;
                    j.e g11 = lVar.g(context, str4, jVar2);
                    if (jVar2.f41916i) {
                        kotlin.jvm.internal.s.e(g11);
                        g11.a(n.f28163a, context.getString(o.f28167d), lVar.b(context, nv.c.UnlockCar));
                    } else {
                        kotlin.jvm.internal.s.e(g11);
                        g11.a(n.f28163a, context.getString(o.f28165b), lVar.b(context, nv.c.LockCar));
                    }
                    int i12 = n.f28163a;
                    g11.a(i12, context.getString(o.f28164a), lVar.b(context, nv.c.OpenFrunk));
                    g11.a(i12, context.getString(o.f28166c), lVar.b(context, nv.c.OpenTrunk));
                    eVar2 = g11;
                } else {
                    continue;
                }
            }
        }
        if (i11 > 1) {
            eVar2 = c(context, context.getString(o.f28177n), null);
        } else if (i11 != 1) {
            eVar2 = eVar;
        }
        return eVar2 == null ? c(context, "", null) : eVar2;
    }

    private final androidx.core.app.m e(Context context) {
        androidx.core.app.m e11 = androidx.core.app.m.e(context);
        kotlin.jvm.internal.s.f(e11, "from(this)");
        return e11;
    }

    public static final Notification f(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        Notification b11 = c(context, "", null).m(context.getString(o.f28169f)).l(context.getString(o.f28168e)).k(PendingIntent.getActivity(context, AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES, f28160a.h(context), 67108864)).b();
        kotlin.jvm.internal.s.f(b11, "getForegroundNotificatio… )\n      )\n      .build()");
        return b11;
    }

    private final j.e g(Context context, String str, nv.j jVar) {
        String C = z.p(context).C(str);
        Bundle a11 = jVar.a();
        String string = context.getString(jVar.b());
        kotlin.jvm.internal.s.f(string, "context.getString(status.humanStatus)");
        j.e m11 = c(context, string, a11).m(C);
        kotlin.jvm.internal.s.f(m11, "getForegroundNotificatio…ContentTitle(vehicleName)");
        return m11;
    }

    private final Intent h(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        intent.addFlags(268435456);
        return intent;
    }

    public static final void i(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        Notification b11 = nu.j.e(context).m(context.getString(o.f28171h)).l(context.getString(o.f28170g)).x(0).b();
        kotlin.jvm.internal.s.f(b11, "getDefaultNotificationBu…Y_DEFAULT)\n      .build()");
        f28160a.e(context).g(444, b11);
    }
}