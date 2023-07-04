package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzeq implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzer zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeq(zzer zzerVar, boolean z11) {
        this.zzb = zzerVar;
        this.zza = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkr zzkrVar;
        zzkrVar = this.zzb.zzb;
        zzkrVar.zzI(this.zza);
    }
}