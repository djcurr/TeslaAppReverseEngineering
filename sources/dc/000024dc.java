package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes3.dex */
public enum zzjj implements zzbj {
    SOURCE_UNKNOWN(0),
    APP_ASSET(1),
    LOCAL(2),
    CLOUD(3),
    SDK_BUILT_IN(4),
    URI(5);
    
    private final int zzh;

    zzjj(int i11) {
        this.zzh = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbj
    public final int zza() {
        return this.zzh;
    }
}