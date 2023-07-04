package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzdv {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzds zzc;
    private final Object zzd;
    private final Object zze;
    private final Object zzf = new Object();
    private volatile Object zzg = null;
    private volatile Object zzh = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdv(String str, Object obj, Object obj2, zzds zzdsVar, zzdu zzduVar) {
        this.zzb = str;
        this.zzd = obj;
        this.zze = obj2;
        this.zzc = zzdsVar;
    }

    public final Object zza(Object obj) {
        synchronized (this.zzf) {
        }
        if (obj != null) {
            return obj;
        }
        if (zzdt.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            if (zzaa.zza()) {
                return this.zzh == null ? this.zzd : this.zzh;
            }
            try {
                for (zzdv zzdvVar : zzdw.zzb()) {
                    if (!zzaa.zza()) {
                        Object obj2 = null;
                        try {
                            zzds zzdsVar = zzdvVar.zzc;
                            if (zzdsVar != null) {
                                obj2 = zzdsVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (zza) {
                            zzdvVar.zzh = obj2;
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException unused2) {
            }
            zzds zzdsVar2 = this.zzc;
            if (zzdsVar2 == null) {
                return this.zzd;
            }
            try {
                return zzdsVar2.zza();
            } catch (IllegalStateException unused3) {
                return this.zzd;
            } catch (SecurityException unused4) {
                return this.zzd;
            }
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}