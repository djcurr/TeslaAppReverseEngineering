package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhj implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzhy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhj(zzhy zzhyVar, AtomicReference atomicReference) {
        this.zzb = zzhyVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            this.zza.set(Boolean.valueOf(this.zzb.zzs.zzf().zzs(this.zzb.zzs.zzh().zzl(), zzdw.zzJ)));
            this.zza.notify();
        }
    }
}