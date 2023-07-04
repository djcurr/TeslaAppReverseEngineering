package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzpi;

/* loaded from: classes3.dex */
final class zzgk implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzgl zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgk(zzgl zzglVar, String str, String str2, String str3, long j11) {
        this.zze = zzglVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkr zzkrVar;
        zzkr zzkrVar2;
        zzkr zzkrVar3;
        zzkr zzkrVar4;
        zzkr zzkrVar5;
        zzpi.zzc();
        zzkrVar = this.zze.zza;
        if (zzkrVar.zzg().zzs(null, zzdw.zzat)) {
            String str = this.zza;
            if (str == null) {
                zzkrVar5 = this.zze.zza;
                zzkrVar5.zzQ(this.zzb, null);
                return;
            }
            zzif zzifVar = new zzif(this.zzc, str, this.zzd);
            zzkrVar4 = this.zze.zza;
            zzkrVar4.zzQ(this.zzb, zzifVar);
            return;
        }
        String str2 = this.zza;
        if (str2 == null) {
            zzkrVar3 = this.zze.zza;
            zzkrVar3.zzq().zzs().zzy(this.zzb, null);
            return;
        }
        zzif zzifVar2 = new zzif(this.zzc, str2, this.zzd);
        zzkrVar2 = this.zze.zza;
        zzkrVar2.zzq().zzs().zzy(this.zzb, zzifVar2);
    }
}