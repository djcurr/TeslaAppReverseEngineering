package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzam implements Runnable {
    final /* synthetic */ zzgo zza;
    final /* synthetic */ zzan zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzam(zzan zzanVar, zzgo zzgoVar) {
        this.zzb = zzanVar;
        this.zza = zzgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzaw();
        if (zzaa.zza()) {
            this.zza.zzaz().zzp(this);
            return;
        }
        boolean zze = this.zzb.zze();
        this.zzb.zzd = 0L;
        if (zze) {
            this.zzb.zzc();
        }
    }
}