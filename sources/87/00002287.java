package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdn extends zzdt {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzee zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdn(zzee zzeeVar, Bundle bundle) {
        super(zzeeVar, true);
        this.zzb = zzeeVar;
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    final void zza() {
        zzcc zzccVar;
        zzccVar = this.zzb.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).setDefaultEventParameters(this.zza);
    }
}