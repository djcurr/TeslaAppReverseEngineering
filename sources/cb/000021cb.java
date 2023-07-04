package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzav extends zzah {
    final /* synthetic */ zzao zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzav(zzbe zzbeVar, zzao zzaoVar) {
        this.zza = zzaoVar;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(zzaa zzaaVar) {
        if (zzaaVar.getStatus().isSuccess()) {
            return;
        }
        this.zza.zzb(zzaaVar.getStatus(), null);
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzc() {
        this.zza.zzb(Status.RESULT_SUCCESS, null);
    }
}