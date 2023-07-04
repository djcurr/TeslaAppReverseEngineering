package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhe implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzhy zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhe(zzhy zzhyVar, String str, String str2, Object obj, long j11) {
        this.zze = zzhyVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzZ(this.zza, this.zzb, this.zzc, this.zzd);
    }
}