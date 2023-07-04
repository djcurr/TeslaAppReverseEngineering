package com.google.android.libraries.places.api.model;

import java.util.Objects;

/* loaded from: classes3.dex */
abstract class zzp extends PhotoMetadata {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzp(String str, int i11, int i12, String str2) {
        Objects.requireNonNull(str, "Null attributions");
        this.zza = str;
        this.zzb = i11;
        this.zzc = i12;
        Objects.requireNonNull(str2, "Null photoReference");
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PhotoMetadata) {
            PhotoMetadata photoMetadata = (PhotoMetadata) obj;
            if (this.zza.equals(photoMetadata.getAttributions()) && this.zzb == photoMetadata.getHeight() && this.zzc == photoMetadata.getWidth() && this.zzd.equals(photoMetadata.zza())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public String getAttributions() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public int getHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public int getWidth() {
        return this.zzc;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc) * 1000003) ^ this.zzd.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int i11 = this.zzb;
        int i12 = this.zzc;
        String str2 = this.zzd;
        return "PhotoMetadata{attributions=" + str + ", height=" + i11 + ", width=" + i12 + ", photoReference=" + str2 + "}";
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata
    public final String zza() {
        return this.zzd;
    }
}