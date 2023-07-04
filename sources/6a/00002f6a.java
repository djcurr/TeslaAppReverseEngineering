package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzix implements Runnable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzc;
    final /* synthetic */ zzjm zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzix(zzjm zzjmVar, zzau zzauVar, String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzd = zzjmVar;
        this.zza = zzauVar;
        this.zzb = str;
        this.zzc = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzft zzftVar;
        zzdz zzdzVar;
        byte[] bArr = null;
        try {
            try {
                zzjm zzjmVar = this.zzd;
                zzdzVar = zzjmVar.zzb;
                if (zzdzVar == null) {
                    zzjmVar.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service to bundle");
                    zzftVar = this.zzd.zzs;
                } else {
                    bArr = zzdzVar.zzu(this.zza, this.zzb);
                    this.zzd.zzQ();
                    zzftVar = this.zzd.zzs;
                }
            } catch (RemoteException e11) {
                this.zzd.zzs.zzay().zzd().zzb("Failed to send event to the service to bundle", e11);
                zzftVar = this.zzd.zzs;
            }
            zzftVar.zzv().zzR(this.zzc, bArr);
        } catch (Throwable th2) {
            this.zzd.zzs.zzv().zzR(this.zzc, bArr);
            throw th2;
        }
    }
}