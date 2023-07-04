package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes3.dex */
public enum zzji implements zzbj {
    TYPE_UNKNOWN(0),
    CUSTOM(1),
    AUTOML_IMAGE_LABELING(2),
    BASE_TRANSLATE(3),
    CUSTOM_OBJECT_DETECTION(4),
    CUSTOM_IMAGE_LABELING(5),
    BASE_ENTITY_EXTRACTION(6),
    BASE_DIGITAL_INK(7),
    TOXICITY_DETECTION(8);
    
    private final int zzk;

    zzji(int i11) {
        this.zzk = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbj
    public final int zza() {
        return this.zzk;
    }
}