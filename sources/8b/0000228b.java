package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdr extends zzdt {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzee zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzee zzeeVar, Long l11, String str, String str2, Bundle bundle, boolean z11, boolean z12) {
        super(zzeeVar, true);
        this.zzg = zzeeVar;
        this.zza = l11;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z11;
        this.zzf = z12;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    final void zza() {
        zzcc zzccVar;
        Long l11 = this.zza;
        long longValue = l11 == null ? this.zzh : l11.longValue();
        zzccVar = this.zzg.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, longValue);
    }
}