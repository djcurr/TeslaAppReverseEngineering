package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhf implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzhy zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhf(zzhy zzhyVar, AtomicReference atomicReference, boolean z11) {
        this.zzc = zzhyVar;
        this.zza = atomicReference;
        this.zzb = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzs.zzt().zzx(this.zza, this.zzb);
    }
}