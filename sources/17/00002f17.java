package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzfv implements Runnable {
    final /* synthetic */ zzab zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzgl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfv(zzgl zzglVar, zzab zzabVar, zzp zzpVar) {
        this.zzc = zzglVar;
        this.zza = zzabVar;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkr zzkrVar;
        zzkr zzkrVar2;
        zzkr zzkrVar3;
        zzkrVar = this.zzc.zza;
        zzkrVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzkrVar3 = this.zzc.zza;
            zzkrVar3.zzN(this.zza, this.zzb);
            return;
        }
        zzkrVar2 = this.zzc.zza;
        zzkrVar2.zzT(this.zza, this.zzb);
    }
}