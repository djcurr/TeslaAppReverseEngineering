package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkj implements Runnable {
    final /* synthetic */ zzks zza;
    final /* synthetic */ zzkr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkj(zzkr zzkrVar, zzks zzksVar) {
        this.zzb = zzkrVar;
        this.zza = zzksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkr.zzy(this.zzb, this.zza);
        this.zzb.zzR();
    }
}