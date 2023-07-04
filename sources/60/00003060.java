package com.google.android.gms.vision.clearcut;

/* loaded from: classes3.dex */
public final class zzb {
    private final Object lock = new Object();
    private long zzbv = Long.MIN_VALUE;
    private final long zzbu = Math.round(30000.0d);

    public zzb(double d11) {
    }

    public final boolean tryAcquire() {
        synchronized (this.lock) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.zzbv + this.zzbu > currentTimeMillis) {
                return false;
            }
            this.zzbv = currentTimeMillis;
            return true;
        }
    }
}