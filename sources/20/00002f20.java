package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzgd implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzgl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgd(zzgl zzglVar, zzp zzpVar) {
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
        zzp zzpVar = this.zza;
        zzkrVar2.zzaz().zzg();
        zzkrVar2.zzB();
        Preconditions.checkNotEmpty(zzpVar.zza);
        zzah zzb = zzah.zzb(zzpVar.zzv);
        zzah zzh = zzkrVar2.zzh(zzpVar.zza);
        zzkrVar2.zzay().zzj().zzc("Setting consent, package, consent", zzpVar.zza, zzb);
        zzkrVar2.zzU(zzpVar.zza, zzb);
        if (zzb.zzk(zzh)) {
            zzkrVar2.zzP(zzpVar);
        }
    }
}