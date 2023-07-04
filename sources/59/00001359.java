package com.adyen.threeds2.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class AppUpgradeBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (atd.s0.a.a(-105156643187264L).equals(intent.getAction()) && context.getPackageName().equals(intent.getPackage())) {
            e.a(context, atd.k0.b.a()).c(context);
        }
    }
}