package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzkw {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final Object zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkw(String str, String str2, String str3, long j11, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(obj);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j11;
        this.zze = obj;
    }
}