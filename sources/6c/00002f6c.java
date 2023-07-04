package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zziz implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzjm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziz(zzjm zzjmVar, zzp zzpVar) {
        this.zzb = zzjmVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdz zzdzVar;
        zzjm zzjmVar = this.zzb;
        zzdzVar = zzjmVar.zzb;
        if (zzdzVar == null) {
            zzjmVar.zzs.zzay().zzd().zza("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzdzVar.zzs(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e11) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send measurementEnabled to the service", e11);
        }
    }
}