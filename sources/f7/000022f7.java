package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class zzhr {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    final zzhy zzi;

    public zzhr(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzhr(String str, Uri uri, String str2, String str3, boolean z11, boolean z12, boolean z13, boolean z14, zzhy zzhyVar) {
        this.zza = null;
        this.zzb = uri;
        this.zzc = "";
        this.zzd = "";
        this.zze = z11;
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
    }

    public final zzhr zza() {
        if (this.zzc.isEmpty()) {
            return new zzhr(null, this.zzb, this.zzc, this.zzd, true, false, false, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzhu zzb(String str, double d11) {
        return new zzhp(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final zzhu zzc(String str, long j11) {
        return new zzhn(this, str, Long.valueOf(j11), true);
    }

    public final zzhu zzd(String str, String str2) {
        return new zzhq(this, str, str2, true);
    }

    public final zzhu zze(String str, boolean z11) {
        return new zzho(this, str, Boolean.valueOf(z11), true);
    }
}