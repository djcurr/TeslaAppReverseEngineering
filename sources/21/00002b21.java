package com.google.android.gms.internal.mlkit_vision_text_common;

/* loaded from: classes3.dex */
public enum zzkr implements zzcx {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);
    
    private final int zzf;

    zzkr(int i11) {
        this.zzf = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcx
    public final int zza() {
        return this.zzf;
    }
}