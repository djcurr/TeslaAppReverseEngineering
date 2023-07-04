package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzio implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzku zzc;
    final /* synthetic */ zzjm zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzio(zzjm zzjmVar, zzp zzpVar, boolean z11, zzku zzkuVar) {
        this.zzd = zzjmVar;
        this.zza = zzpVar;
        this.zzb = z11;
        this.zzc = zzkuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdz zzdzVar;
        zzjm zzjmVar = this.zzd;
        zzdzVar = zzjmVar.zzb;
        if (zzdzVar == null) {
            zzjmVar.zzs.zzay().zzd().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zzD(zzdzVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzQ();
    }
}