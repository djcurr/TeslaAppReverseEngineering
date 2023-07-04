package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzgf implements Runnable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgf(zzgl zzglVar, zzau zzauVar, String str) {
        this.zzc = zzglVar;
        this.zza = zzauVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkr zzkrVar;
        zzkr zzkrVar2;
        zzkrVar = this.zzc.zza;
        zzkrVar.zzA();
        zzkrVar2 = this.zzc.zza;
        zzkrVar2.zzE(this.zza, this.zzb);
    }
}