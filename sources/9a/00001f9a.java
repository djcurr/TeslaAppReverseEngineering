package com.google.android.gms.common;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzx {
    private static final zzx zze = new zzx(true, 3, 1, null, null);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzx(boolean z11, int i11, int i12, String str, Throwable th2) {
        this.zza = z11;
        this.zzd = i11;
        this.zzb = str;
        this.zzc = th2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static zzx zzb() {
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzx zzc(String str) {
        return new zzx(false, 1, 5, str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzx zzd(String str, Throwable th2) {
        return new zzx(false, 1, 5, str, th2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzx zzf(int i11) {
        return new zzx(true, i11, 1, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzx zzg(int i11, int i12, String str, Throwable th2) {
        return new zzx(false, i11, i12, str, th2);
    }

    String zza() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze() {
        if (this.zza || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.zzc != null) {
            Log.d("GoogleCertificatesRslt", zza(), this.zzc);
        } else {
            Log.d("GoogleCertificatesRslt", zza());
        }
    }
}