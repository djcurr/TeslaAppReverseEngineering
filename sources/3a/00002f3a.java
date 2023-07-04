package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzhc implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzhy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhc(zzhy zzhyVar, long j11) {
        this.zzb = zzhyVar;
        this.zza = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzm().zzf.zzb(this.zza);
        this.zzb.zzs.zzay().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }
}