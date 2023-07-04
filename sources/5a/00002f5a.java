package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzih implements Runnable {
    final /* synthetic */ zzif zza;
    final /* synthetic */ zzif zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzim zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzih(zzim zzimVar, zzif zzifVar, zzif zzifVar2, long j11, boolean z11) {
        this.zze = zzimVar;
        this.zza = zzifVar;
        this.zzb = zzifVar2;
        this.zzc = j11;
        this.zzd = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzB(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}