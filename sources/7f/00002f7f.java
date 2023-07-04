package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzjr implements Runnable {
    final /* synthetic */ zzkr zza;
    final /* synthetic */ Runnable zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjr(zzjt zzjtVar, zzkr zzkrVar, Runnable runnable) {
        this.zza = zzkrVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzA();
        this.zza.zzz(this.zzb);
        this.zza.zzW();
    }
}