package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzgb implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzgl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgb(zzgl zzglVar, zzp zzpVar) {
        this.zzb = zzglVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkr zzkrVar;
        zzkr zzkrVar2;
        zzkrVar = this.zzb.zza;
        zzkrVar.zzA();
        zzkrVar2 = this.zzb.zza;
        zzkrVar2.zzP(this.zza);
    }
}