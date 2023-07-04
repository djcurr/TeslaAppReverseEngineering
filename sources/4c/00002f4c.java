package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhu implements Runnable {
    final /* synthetic */ zzah zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzhy zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhu(zzhy zzhyVar, zzah zzahVar, int i11, long j11, boolean z11) {
        this.zze = zzhyVar;
        this.zza = zzahVar;
        this.zzb = i11;
        this.zzc = j11;
        this.zzd = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzW(this.zza);
        zzhy.zzv(this.zze, this.zza, this.zzb, this.zzc, false, this.zzd);
    }
}