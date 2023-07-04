package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzho implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzhy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzho(zzhy zzhyVar, AtomicReference atomicReference) {
        this.zzb = zzhyVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            this.zza.set(Long.valueOf(this.zzb.zzs.zzf().zzi(this.zzb.zzs.zzh().zzl(), zzdw.zzL)));
            this.zza.notify();
        }
    }
}