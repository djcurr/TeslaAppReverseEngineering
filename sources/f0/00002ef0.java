package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzek {
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final Bundle zzd;

    public zzek(String str, String str2, Bundle bundle, long j11) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j11;
    }

    public static zzek zzb(zzau zzauVar) {
        return new zzek(zzauVar.zza, zzauVar.zzc, zzauVar.zzb.zzc(), zzauVar.zzd);
    }

    public final String toString() {
        String str = this.zzb;
        String str2 = this.zza;
        String obj = this.zzd.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + obj.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(obj);
        return sb2.toString();
    }

    public final zzau zza() {
        return new zzau(this.zza, new zzas(new Bundle(this.zzd)), this.zzb, this.zzc);
    }
}