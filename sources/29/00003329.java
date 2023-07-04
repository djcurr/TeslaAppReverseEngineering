package com.google.android.libraries.places.internal;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfv extends zzfy {
    private String zza;
    private int zzb;
    private byte zzc;
    private int zzd;

    public final zzfy zza(String str) {
        Objects.requireNonNull(str, "Null packageName");
        this.zza = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzfy
    public final zzfy zzb(int i11) {
        this.zzb = i11;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzfy
    final zzfz zzc() {
        String str;
        int i11;
        if (this.zzc == 1 && (str = this.zza) != null && (i11 = this.zzd) != 0) {
            return new zzfx(str, this.zzb, i11, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" packageName");
        }
        if (this.zzc == 0) {
            sb2.append(" versionCode");
        }
        if (this.zzd == 0) {
            sb2.append(" requestSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.libraries.places.internal.zzfy
    public final zzfy zzd(int i11) {
        this.zzd = i11;
        return this;
    }
}