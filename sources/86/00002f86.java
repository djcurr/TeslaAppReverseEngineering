package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjy {
    final /* synthetic */ zzkc zza;
    private zzjx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjy(zzkc zzkcVar) {
        this.zza = zzkcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(long j11) {
        Handler handler;
        this.zzb = new zzjx(this, this.zza.zzs.zzav().currentTimeMillis(), j11);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Handler handler;
        this.zza.zzg();
        zzjx zzjxVar = this.zzb;
        if (zzjxVar != null) {
            handler = this.zza.zzd;
            handler.removeCallbacks(zzjxVar);
        }
        this.zza.zzs.zzm().zzl.zza(false);
    }
}