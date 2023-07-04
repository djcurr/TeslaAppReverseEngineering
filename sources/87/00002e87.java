package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzan {
    private static volatile Handler zza;
    private final zzgo zzb;
    private final Runnable zzc;
    private volatile long zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzan(zzgo zzgoVar) {
        Preconditions.checkNotNull(zzgoVar);
        this.zzb = zzgoVar;
        this.zzc = new zzam(this, zzgoVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzan.class) {
            if (zza == null) {
                zza = new com.google.android.gms.internal.measurement.zzby(this.zzb.zzau().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public abstract void zzc();

    public final void zzd(long j11) {
        zzb();
        if (j11 >= 0) {
            this.zzd = this.zzb.zzav().currentTimeMillis();
            if (zzf().postDelayed(this.zzc, j11)) {
                return;
            }
            this.zzb.zzay().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j11));
        }
    }

    public final boolean zze() {
        return this.zzd != 0;
    }
}