package com.google.android.gms.internal.mlkit_vision_face;

/* loaded from: classes3.dex */
public enum zzka implements zzcs {
    UNKNOWN_LANDMARKS(0),
    NO_LANDMARKS(1),
    ALL_LANDMARKS(2);
    
    private final int zze;

    zzka(int i11) {
        this.zze = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcs
    public final int zza() {
        return this.zze;
    }
}