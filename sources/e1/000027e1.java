package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes3.dex */
public enum zzhm implements zzag {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);
    
    private final int zzh;

    zzhm(int i11) {
        this.zzh = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzag
    public final int zza() {
        return this.zzh;
    }
}