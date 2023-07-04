package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjf implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzp zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ zzjm zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjf(zzjm zzjmVar, AtomicReference atomicReference, String str, String str2, String str3, zzp zzpVar, boolean z11) {
        this.zzf = zzjmVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzpVar;
        this.zze = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjm zzjmVar;
        zzdz zzdzVar;
        synchronized (this.zza) {
            try {
                zzjmVar = this.zzf;
                zzdzVar = zzjmVar.zzb;
            } catch (RemoteException e11) {
                this.zzf.zzs.zzay().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.zzb, e11);
                this.zza.set(Collections.emptyList());
                atomicReference = this.zza;
            }
            if (zzdzVar == null) {
                zzjmVar.zzs.zzay().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.zzb, this.zzc);
                this.zza.set(Collections.emptyList());
                this.zza.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.checkNotNull(this.zzd);
                this.zza.set(zzdzVar.zzh(this.zzb, this.zzc, this.zze, this.zzd));
            } else {
                this.zza.set(zzdzVar.zzi(null, this.zzb, this.zzc, this.zze));
            }
            this.zzf.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}