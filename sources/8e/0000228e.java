package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class zzdu extends zzch {
    private final com.google.android.gms.measurement.internal.zzgt zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdu(com.google.android.gms.measurement.internal.zzgt zzgtVar) {
        this.zza = zzgtVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j11) {
        this.zza.interceptEvent(str, str2, bundle, j11);
    }
}