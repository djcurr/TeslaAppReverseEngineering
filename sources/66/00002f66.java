package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzit implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzjm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzit(zzjm zzjmVar, zzp zzpVar) {
        this.zzb = zzjmVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdz zzdzVar;
        zzjm zzjmVar = this.zzb;
        zzdzVar = zzjmVar.zzb;
        if (zzdzVar == null) {
            zzjmVar.zzs.zzay().zzd().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzdzVar.zzj(this.zza);
            this.zzb.zzs.zzi().zzm();
            this.zzb.zzD(zzdzVar, null, this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e11) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send app launch to the service", e11);
        }
    }
}