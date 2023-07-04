package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzip implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzp zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzjm zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzip(zzjm zzjmVar, AtomicReference atomicReference, zzp zzpVar, boolean z11) {
        this.zzd = zzjmVar;
        this.zza = atomicReference;
        this.zzb = zzpVar;
        this.zzc = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjm zzjmVar;
        zzdz zzdzVar;
        synchronized (this.zza) {
            try {
                zzjmVar = this.zzd;
                zzdzVar = zzjmVar.zzb;
            } catch (RemoteException e11) {
                this.zzd.zzs.zzay().zzd().zzb("Failed to get all user properties; remote exception", e11);
                atomicReference = this.zza;
            }
            if (zzdzVar == null) {
                zzjmVar.zzs.zzay().zzd().zza("Failed to get all user properties; not connected to service");
                this.zza.notify();
                return;
            }
            Preconditions.checkNotNull(this.zzb);
            this.zza.set(zzdzVar.zze(this.zzb, this.zzc));
            this.zzd.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}