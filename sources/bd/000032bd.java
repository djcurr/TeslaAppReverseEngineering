package com.google.android.libraries.places.internal;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzcf {
    private final String zza;

    private zzcf(String str) {
        this.zza = str;
    }

    public static zzcf zza(zzcf zzcfVar, zzcf... zzcfVarArr) {
        return new zzcf(zzcfVar.zza.concat(zzib.zzc("").zzf(zzjh.zza(Arrays.asList(zzcfVarArr), zzce.zza))));
    }

    public static zzcf zzb(String str) {
        return new zzcf(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcf) {
            return this.zza.equals(((zzcf) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}