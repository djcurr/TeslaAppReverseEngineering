package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zziq implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzjm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziq(zzjm zzjmVar, zzp zzpVar) {
        this.zzb = zzjmVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdz zzdzVar;
        zzjm zzjmVar = this.zzb;
        zzdzVar = zzjmVar.zzb;
        if (zzdzVar == null) {
            zzjmVar.zzs.zzay().zzd().zza("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzdzVar.zzm(this.zza);
        } catch (RemoteException e11) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to reset data on the service: remote exception", e11);
        }
        this.zzb.zzQ();
    }
}