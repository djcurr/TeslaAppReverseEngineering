package com.google.android.exoplayer2;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes3.dex */
final class a1 {

    /* renamed from: a  reason: collision with root package name */
    private final PowerManager f13034a;

    /* renamed from: b  reason: collision with root package name */
    private PowerManager.WakeLock f13035b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13036c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13037d;

    public a1(Context context) {
        this.f13034a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    private void c() {
        PowerManager.WakeLock wakeLock = this.f13035b;
        if (wakeLock == null) {
            return;
        }
        if (this.f13036c && this.f13037d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z11) {
        if (z11 && this.f13035b == null) {
            PowerManager powerManager = this.f13034a;
            if (powerManager == null) {
                ak.o.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f13035b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f13036c = z11;
        c();
    }

    public void b(boolean z11) {
        this.f13037d = z11;
        c();
    }
}