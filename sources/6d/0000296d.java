package com.google.android.gms.internal.mlkit_vision_face;

/* loaded from: classes3.dex */
public enum zzkb implements zzcs {
    UNKNOWN_PERFORMANCE(0),
    FAST(1),
    ACCURATE(2);
    
    private final int zze;

    zzkb(int i11) {
        this.zze = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcs
    public final int zza() {
        return this.zze;
    }
}