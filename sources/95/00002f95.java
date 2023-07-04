package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkm implements Callable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzkr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkm(zzkr zzkrVar, zzp zzpVar) {
        this.zzb = zzkrVar;
        this.zza = zzpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzah zzh = this.zzb.zzh((String) Preconditions.checkNotNull(this.zza.zza));
        zzag zzagVar = zzag.ANALYTICS_STORAGE;
        if (zzh.zzi(zzagVar) && zzah.zzb(this.zza.zzv).zzi(zzagVar)) {
            return this.zzb.zzd(this.zza).zzu();
        }
        this.zzb.zzay().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}