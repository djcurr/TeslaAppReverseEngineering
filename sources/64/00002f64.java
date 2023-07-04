package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzir implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ zzjm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzir(zzjm zzjmVar, AtomicReference atomicReference, zzp zzpVar) {
        this.zzc = zzjmVar;
        this.zza = atomicReference;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzdz zzdzVar;
        synchronized (this.zza) {
            try {
            } catch (RemoteException e11) {
                this.zzc.zzs.zzay().zzd().zzb("Failed to get app instance id", e11);
                atomicReference = this.zza;
            }
            if (!this.zzc.zzs.zzm().zzc().zzi(zzag.ANALYTICS_STORAGE)) {
                this.zzc.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzs.zzq().zzO(null);
                this.zzc.zzs.zzm().zze.zzb(null);
                this.zza.set(null);
                this.zza.notify();
                return;
            }
            zzjm zzjmVar = this.zzc;
            zzdzVar = zzjmVar.zzb;
            if (zzdzVar == null) {
                zzjmVar.zzs.zzay().zzd().zza("Failed to get app instance id");
                this.zza.notify();
                return;
            }
            Preconditions.checkNotNull(this.zzb);
            this.zza.set(zzdzVar.zzd(this.zzb));
            String str = (String) this.zza.get();
            if (str != null) {
                this.zzc.zzs.zzq().zzO(str);
                this.zzc.zzs.zzm().zze.zzb(str);
            }
            this.zzc.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}