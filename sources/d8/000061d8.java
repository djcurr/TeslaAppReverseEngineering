package com.teslamotors.plugins.ble;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import gv.m;
import java.util.ArrayList;
import yu.z;
import zu.f0;
import zu.r;

/* loaded from: classes6.dex */
public class BLEBootReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final com.tesla.logging.g f22066a = com.tesla.logging.g.g("BLEBootReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f22066a.i(String.format("Got %s; checking whether to start...", intent.getAction()));
        z p11 = z.p(context);
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED") || intent.getAction().equals("android.intent.action.MY_PACKAGE_REPLACED")) {
            if (r.c() && !r.b() && !r.a(context)) {
                this.f22066a.i("Not Starting service caused by foreground service restriction");
                return;
            }
            ArrayList arrayList = new ArrayList(p11.y());
            this.f22066a.i(String.format("Starting for %d VINs", Integer.valueOf(arrayList.size())));
            String h11 = p11.h();
            String A = p11.A();
            String C = p11.C(A);
            Intent intent2 = new Intent(context, BLEService.class);
            intent2.putStringArrayListExtra("VINS", new ArrayList<>(arrayList));
            intent2.putExtra("SELECTED_VIN", A);
            intent2.putExtra("ACCOUNT_EMAIL", h11);
            intent2.putExtra("VEHICLE_NAME", C);
            boolean b11 = m.b(context, arrayList, h11);
            com.tesla.logging.g gVar = this.f22066a;
            gVar.i("shouldRunInForeground() => " + b11);
            if (b11) {
                this.f22066a.i("Starting BLE as foreground service");
                intent2.putExtra("SERVICE_IN_FOREGROUND", true);
                try {
                    androidx.core.content.b.startForegroundService(context, intent2);
                } catch (Exception e11) {
                    this.f22066a.c(String.format("Not Starting service: VIN: %s, Account: %s, caused by Exception: ", f0.f(p11.A()), f0.e(p11.h()), e11.getMessage()));
                }
            }
        }
    }
}