package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzju implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzkc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzju(zzkc zzkcVar, long j11) {
        this.zzb = zzkcVar;
        this.zza = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkc.zzl(this.zzb, this.zza);
    }
}