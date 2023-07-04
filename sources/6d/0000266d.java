package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes3.dex */
public final class zzkn {
    private zzko zza;
    private Integer zzb;

    public final zzkn zza(zzko zzkoVar) {
        this.zza = zzkoVar;
        return this;
    }

    public final zzkn zzb(Integer num) {
        this.zzb = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final zzkq zzd() {
        return new zzkq(this, null);
    }
}