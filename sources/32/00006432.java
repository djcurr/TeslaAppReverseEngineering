package com.zxcpoiu.incallmanager;

import android.content.Context;
import android.os.PowerManager;
import android.util.Log;

/* loaded from: classes6.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private PowerManager f23003a;

    /* renamed from: b  reason: collision with root package name */
    private PowerManager.WakeLock f23004b;

    /* renamed from: c  reason: collision with root package name */
    private PowerManager.WakeLock f23005c;

    /* renamed from: d  reason: collision with root package name */
    private PowerManager.WakeLock f23006d;

    public c(Context context) {
        this.f23004b = null;
        this.f23005c = null;
        this.f23006d = null;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        this.f23003a = powerManager;
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(805306394, "InCallWakeLockUtils");
        this.f23004b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock newWakeLock2 = this.f23003a.newWakeLock(1, "InCallWakeLockUtils");
        this.f23006d = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
        PowerManager.WakeLock newWakeLock3 = this.f23003a.newWakeLock(805306394, "InCallWakeLockUtils");
        this.f23005c = newWakeLock3;
        newWakeLock3.setReferenceCounted(false);
    }

    private boolean a(PowerManager.WakeLock wakeLock) {
        return b(wakeLock, 0L);
    }

    private boolean b(PowerManager.WakeLock wakeLock, long j11) {
        synchronized (wakeLock) {
            if (wakeLock.isHeld()) {
                return false;
            }
            if (j11 > 0) {
                wakeLock.acquire(j11);
            } else {
                wakeLock.acquire();
            }
            return true;
        }
    }

    private boolean c(PowerManager.WakeLock wakeLock) {
        synchronized (wakeLock) {
            if (wakeLock.isHeld()) {
                wakeLock.release();
                return true;
            }
            return false;
        }
    }

    public boolean d() {
        boolean a11 = a(this.f23006d);
        Log.d("InCallWakeLockUtils", "acquirePartialWakeLock(). sta=" + a11);
        return a11;
    }

    public boolean e(long j11) {
        boolean b11 = b(this.f23005c, j11);
        Log.d("InCallWakeLockUtils", String.format("acquirePokeFullWakeLockReleaseAfter() timeout=%s, sta=%s", Long.valueOf(j11), Boolean.valueOf(b11)));
        return b11;
    }

    public boolean f() {
        boolean c11 = c(this.f23006d);
        Log.d("InCallWakeLockUtils", "releasePartialWakeLock(). sta=" + c11);
        return c11;
    }
}