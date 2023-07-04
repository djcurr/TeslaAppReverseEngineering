package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzgc implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzgl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgc(zzgl zzglVar, zzp zzpVar) {
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
        zzkrVar2.zzd(zzpVar);
    }
}