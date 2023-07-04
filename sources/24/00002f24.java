package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzgh implements Runnable {
    final /* synthetic */ zzku zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzgl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgh(zzgl zzglVar, zzku zzkuVar, zzp zzpVar) {
        this.zzc = zzglVar;
        this.zza = zzkuVar;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkr zzkrVar;
        zzkr zzkrVar2;
        zzkr zzkrVar3;
        zzkrVar = this.zzc.zza;
        zzkrVar.zzA();
        if (this.zza.zza() == null) {
            zzkrVar3 = this.zzc.zza;
            zzkrVar3.zzO(this.zza, this.zzb);
            return;
        }
        zzkrVar2 = this.zzc.zza;
        zzkrVar2.zzV(this.zza, this.zzb);
    }
}