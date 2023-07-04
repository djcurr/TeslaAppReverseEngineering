package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzge implements Runnable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzgl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzge(zzgl zzglVar, zzau zzauVar, zzp zzpVar) {
        this.zzc = zzglVar;
        this.zza = zzauVar;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzv(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}