package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zziu implements Runnable {
    final /* synthetic */ zzif zza;
    final /* synthetic */ zzjm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziu(zzjm zzjmVar, zzif zzifVar) {
        this.zzb = zzjmVar;
        this.zza = zzifVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdz zzdzVar;
        zzjm zzjmVar = this.zzb;
        zzdzVar = zzjmVar.zzb;
        if (zzdzVar == null) {
            zzjmVar.zzs.zzay().zzd().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzif zzifVar = this.zza;
            if (zzifVar == null) {
                zzdzVar.zzq(0L, null, null, zzjmVar.zzs.zzau().getPackageName());
            } else {
                zzdzVar.zzq(zzifVar.zzc, zzifVar.zza, zzifVar.zzb, zzjmVar.zzs.zzau().getPackageName());
            }
            this.zzb.zzQ();
        } catch (RemoteException e11) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send current screen to the service", e11);
        }
    }
}