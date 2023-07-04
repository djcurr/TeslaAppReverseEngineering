package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzis implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzb;
    final /* synthetic */ zzjm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzis(zzjm zzjmVar, zzp zzpVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzc = zzjmVar;
        this.zza = zzpVar;
        this.zzb = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzft zzftVar;
        zzdz zzdzVar;
        String str = null;
        try {
            try {
                if (this.zzc.zzs.zzm().zzc().zzi(zzag.ANALYTICS_STORAGE)) {
                    zzjm zzjmVar = this.zzc;
                    zzdzVar = zzjmVar.zzb;
                    if (zzdzVar == null) {
                        zzjmVar.zzs.zzay().zzd().zza("Failed to get app instance id");
                        zzftVar = this.zzc.zzs;
                    } else {
                        Preconditions.checkNotNull(this.zza);
                        str = zzdzVar.zzd(this.zza);
                        if (str != null) {
                            this.zzc.zzs.zzq().zzO(str);
                            this.zzc.zzs.zzm().zze.zzb(str);
                        }
                        this.zzc.zzQ();
                        zzftVar = this.zzc.zzs;
                    }
                } else {
                    this.zzc.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                    this.zzc.zzs.zzq().zzO(null);
                    this.zzc.zzs.zzm().zze.zzb(null);
                    zzftVar = this.zzc.zzs;
                }
            } catch (RemoteException e11) {
                this.zzc.zzs.zzay().zzd().zzb("Failed to get app instance id", e11);
                zzftVar = this.zzc.zzs;
            }
            zzftVar.zzv().zzU(this.zzb, str);
        } catch (Throwable th2) {
            this.zzc.zzs.zzv().zzU(this.zzb, null);
            throw th2;
        }
    }
}