package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzji implements Runnable {
    final /* synthetic */ zzdz zza;
    final /* synthetic */ zzjl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzji(zzjl zzjlVar, zzdz zzdzVar) {
        this.zzb = zzjlVar;
        this.zza = zzdzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzs.zzay().zzc().zza("Connected to remote service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}