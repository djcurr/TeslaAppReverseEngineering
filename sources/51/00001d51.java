package com.google.android.gms.common;

/* loaded from: classes3.dex */
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;
    private final String zzc;
    private final Throwable zzd;

    private PackageVerificationResult(String str, int i11, boolean z11, String str2, Throwable th2) {
        this.zza = str;
        this.zzb = z11;
        this.zzc = str2;
        this.zzd = th2;
    }

    public static PackageVerificationResult zza(String str, String str2, Throwable th2) {
        return new PackageVerificationResult(str, 1, false, str2, th2);
    }

    public static PackageVerificationResult zzd(String str, int i11) {
        return new PackageVerificationResult(str, i11, true, null, null);
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        String concat = "PackageVerificationRslt: ".concat(String.valueOf(this.zzc));
        Throwable th2 = this.zzd;
        if (th2 == null) {
            throw new SecurityException(concat);
        }
        throw new SecurityException(concat, th2);
    }

    public final boolean zzc() {
        return this.zzb;
    }
}