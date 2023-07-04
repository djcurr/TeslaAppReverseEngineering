package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzfw implements Runnable {
    final /* synthetic */ zzab zza;
    final /* synthetic */ zzgl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfw(zzgl zzglVar, zzab zzabVar) {
        this.zzb = zzglVar;
        this.zza = zzabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkr zzkrVar;
        zzkr zzkrVar2;
        zzkr zzkrVar3;
        zzkrVar = this.zzb.zza;
        zzkrVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzkrVar3 = this.zzb.zza;
            zzkrVar3.zzM(this.zza);
            return;
        }
        zzkrVar2 = this.zzb.zza;
        zzkrVar2.zzS(this.zza);
    }
}