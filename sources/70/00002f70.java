package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjc implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzab zzc;
    final /* synthetic */ zzab zzd;
    final /* synthetic */ zzjm zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjc(zzjm zzjmVar, boolean z11, zzp zzpVar, boolean z12, zzab zzabVar, zzab zzabVar2) {
        this.zze = zzjmVar;
        this.zza = zzpVar;
        this.zzb = z12;
        this.zzc = zzabVar;
        this.zzd = zzabVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdz zzdzVar;
        zzjm zzjmVar = this.zze;
        zzdzVar = zzjmVar.zzb;
        if (zzdzVar == null) {
            zzjmVar.zzs.zzay().zzd().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzdzVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}