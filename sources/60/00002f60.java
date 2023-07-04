package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzin implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzp zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zze;
    final /* synthetic */ zzjm zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzin(zzjm zzjmVar, String str, String str2, zzp zzpVar, boolean z11, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzf = zzjmVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzpVar;
        this.zzd = z11;
        this.zze = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e11;
        zzdz zzdzVar;
        Bundle bundle2 = new Bundle();
        try {
            zzjm zzjmVar = this.zzf;
            zzdzVar = zzjmVar.zzb;
            if (zzdzVar == null) {
                zzjmVar.zzs.zzay().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                this.zzf.zzs.zzv().zzQ(this.zze, bundle2);
                return;
            }
            Preconditions.checkNotNull(this.zzc);
            List<zzku> zzh = zzdzVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
            bundle = new Bundle();
            if (zzh != null) {
                for (zzku zzkuVar : zzh) {
                    String str = zzkuVar.zze;
                    if (str != null) {
                        bundle.putString(zzkuVar.zzb, str);
                    } else {
                        Long l11 = zzkuVar.zzd;
                        if (l11 != null) {
                            bundle.putLong(zzkuVar.zzb, l11.longValue());
                        } else {
                            Double d11 = zzkuVar.zzg;
                            if (d11 != null) {
                                bundle.putDouble(zzkuVar.zzb, d11.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.zzf.zzQ();
                    this.zzf.zzs.zzv().zzQ(this.zze, bundle);
                } catch (Throwable th2) {
                    th = th2;
                    bundle2 = bundle;
                    this.zzf.zzs.zzv().zzQ(this.zze, bundle2);
                    throw th;
                }
            } catch (RemoteException e12) {
                e11 = e12;
                this.zzf.zzs.zzay().zzd().zzc("Failed to get user properties; remote exception", this.zza, e11);
                this.zzf.zzs.zzv().zzQ(this.zze, bundle);
            }
        } catch (RemoteException e13) {
            bundle = bundle2;
            e11 = e13;
        } catch (Throwable th3) {
            th = th3;
            this.zzf.zzs.zzv().zzQ(this.zze, bundle2);
            throw th;
        }
    }
}