package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkq {
    com.google.android.gms.internal.measurement.zzfy zza;
    List zzb;
    List zzc;
    long zzd;
    final /* synthetic */ zzkr zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkq(zzkr zzkrVar, zzkp zzkpVar) {
        this.zze = zzkrVar;
    }

    private static final long zzb(com.google.android.gms.internal.measurement.zzfo zzfoVar) {
        return ((zzfoVar.zzd() / 1000) / 60) / 60;
    }

    public final boolean zza(long j11, com.google.android.gms.internal.measurement.zzfo zzfoVar) {
        Preconditions.checkNotNull(zzfoVar);
        if (this.zzc == null) {
            this.zzc = new ArrayList();
        }
        if (this.zzb == null) {
            this.zzb = new ArrayList();
        }
        if (this.zzc.size() <= 0 || zzb((com.google.android.gms.internal.measurement.zzfo) this.zzc.get(0)) == zzb(zzfoVar)) {
            long zzbr = this.zzd + zzfoVar.zzbr();
            this.zze.zzg();
            if (zzbr >= Math.max(0, ((Integer) zzdw.zzh.zza(null)).intValue())) {
                return false;
            }
            this.zzd = zzbr;
            this.zzc.add(zzfoVar);
            this.zzb.add(Long.valueOf(j11));
            int size = this.zzc.size();
            this.zze.zzg();
            return size < Math.max(1, ((Integer) zzdw.zzi.zza(null)).intValue());
        }
        return false;
    }
}