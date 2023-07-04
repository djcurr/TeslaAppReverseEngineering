package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgv implements zzed {
    final /* synthetic */ zzft zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgv(zzgw zzgwVar, zzft zzftVar) {
        this.zza = zzftVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzed
    public final boolean zza() {
        return this.zza.zzL() && Log.isLoggable(this.zza.zzay().zzq(), 3);
    }
}