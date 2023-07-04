package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes3.dex */
public final class zzdv {
    private zzdy zza;
    private Integer zzb;
    private zzkk zzc;

    public final zzdv zza(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzdv zzb(zzkk zzkkVar) {
        this.zzc = zzkkVar;
        return this;
    }

    public final zzdv zzc(zzdy zzdyVar) {
        this.zza = zzdyVar;
        return this;
    }

    public final zzea zze() {
        return new zzea(this, null);
    }
}