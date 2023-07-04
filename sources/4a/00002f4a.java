package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhs implements Runnable {
    final /* synthetic */ zzah zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzhy zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhs(zzhy zzhyVar, zzah zzahVar, long j11, int i11, long j12, boolean z11) {
        this.zzf = zzhyVar;
        this.zza = zzahVar;
        this.zzb = j11;
        this.zzc = i11;
        this.zzd = j12;
        this.zze = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zzW(this.zza);
        this.zzf.zzL(this.zzb, false);
        zzhy.zzv(this.zzf, this.zza, this.zzc, this.zzd, true, this.zze);
    }
}