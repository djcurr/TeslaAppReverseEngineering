package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes3.dex */
public enum zziu implements zzbj {
    UNKNOWN(0),
    TRANSLATE(1);
    
    private final int zzd;

    zziu(int i11) {
        this.zzd = i11;
    }

    public static zziu zzb(int i11) {
        zziu[] values;
        for (zziu zziuVar : values()) {
            if (zziuVar.zzd == i11) {
                return zziuVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbj
    public final int zza() {
        return this.zzd;
    }
}