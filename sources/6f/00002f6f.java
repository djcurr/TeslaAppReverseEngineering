package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjb implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzjm zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjb(zzjm zzjmVar, boolean z11, zzp zzpVar, boolean z12, zzau zzauVar, String str) {
        this.zze = zzjmVar;
        this.zza = zzpVar;
        this.zzb = z12;
        this.zzc = zzauVar;
        this.zzd = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdz zzdzVar;
        zzjm zzjmVar = this.zze;
        zzdzVar = zzjmVar.zzb;
        if (zzdzVar == null) {
            zzjmVar.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzdzVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}