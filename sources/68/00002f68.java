package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zziv implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzjm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziv(zzjm zzjmVar, zzp zzpVar, Bundle bundle) {
        this.zzc = zzjmVar;
        this.zza = zzpVar;
        this.zzb = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdz zzdzVar;
        zzjm zzjmVar = this.zzc;
        zzdzVar = zzjmVar.zzb;
        if (zzdzVar == null) {
            zzjmVar.zzs.zzay().zzd().zza("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzdzVar.zzr(this.zzb, this.zza);
        } catch (RemoteException e11) {
            this.zzc.zzs.zzay().zzd().zzb("Failed to send default event parameters to service", e11);
        }
    }
}