package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import expo.modules.interfaces.permissions.PermissionsResponse;

/* loaded from: classes3.dex */
class d {

    /* renamed from: a  reason: collision with root package name */
    private final Float f16483a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f16484b;

    private d(Float f11, boolean z11) {
        this.f16484b = z11;
        this.f16483a = f11;
    }

    public static d a(Context context) {
        Float f11 = null;
        boolean z11 = false;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z11 = e(registerReceiver);
                f11 = d(registerReceiver);
            }
        } catch (IllegalStateException e11) {
            wl.f.f().e("An error occurred getting battery state.", e11);
        }
        return new d(f11, z11);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra(PermissionsResponse.STATUS_KEY, -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f16483a;
    }

    public int c() {
        Float f11;
        if (!this.f16484b || (f11 = this.f16483a) == null) {
            return 1;
        }
        return ((double) f11.floatValue()) < 0.99d ? 2 : 3;
    }
}