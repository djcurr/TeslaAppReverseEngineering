package com.wix.reactnativenotifications.fcm;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.g;
import pw.b;
import pw.c;

/* loaded from: classes6.dex */
public class FcmInstanceIdRefreshHandlerService extends g {
    public static void j(Context context, Intent intent) {
        g.d(context, FcmInstanceIdRefreshHandlerService.class, 2400, intent);
    }

    @Override // androidx.core.app.g
    protected void g(Intent intent) {
        c f11 = b.f(this);
        if (f11 == null) {
            return;
        }
        if (intent.getBooleanExtra("isAppInit", false)) {
            f11.d();
        } else if (intent.getBooleanExtra("doManualRefresh", false)) {
            f11.a();
        } else {
            f11.b();
        }
    }
}