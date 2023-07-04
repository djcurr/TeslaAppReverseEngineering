package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzij implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzim zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzij(zzim zzimVar, long j11) {
        this.zzb = zzimVar;
        this.zza = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}