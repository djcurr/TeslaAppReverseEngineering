package com.google.android.gms.internal.mlkit_vision_text_common;

/* loaded from: classes3.dex */
public final class zzeb {
    private zzee zza;
    private Integer zzb;
    private zzkb zzc;

    public final zzeb zza(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzeb zzb(zzkb zzkbVar) {
        this.zzc = zzkbVar;
        return this;
    }

    public final zzeb zzc(zzee zzeeVar) {
        this.zza = zzeeVar;
        return this;
    }

    public final zzeg zze() {
        return new zzeg(this, null);
    }
}