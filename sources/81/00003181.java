package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzo extends PhotoMetadata.Builder {
    private String zza;
    private int zzb;
    private int zzc;
    private String zzd;
    private byte zze;

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final String getAttributions() {
        String str = this.zza;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"attributions\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final int getHeight() {
        if ((this.zze & 1) != 0) {
            return this.zzb;
        }
        throw new IllegalStateException("Property \"height\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final int getWidth() {
        if ((this.zze & 2) != 0) {
            return this.zzc;
        }
        throw new IllegalStateException("Property \"width\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setAttributions(String str) {
        Objects.requireNonNull(str, "Null attributions");
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setHeight(int i11) {
        this.zzb = i11;
        this.zze = (byte) (this.zze | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    public final PhotoMetadata.Builder setWidth(int i11) {
        this.zzc = i11;
        this.zze = (byte) (this.zze | 2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PhotoMetadata.Builder zza(String str) {
        Objects.requireNonNull(str, "Null photoReference");
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.PhotoMetadata.Builder
    final PhotoMetadata zzb() {
        String str;
        String str2;
        if (this.zze == 3 && (str = this.zza) != null && (str2 = this.zzd) != null) {
            return new zzap(str, this.zzb, this.zzc, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" attributions");
        }
        if ((this.zze & 1) == 0) {
            sb2.append(" height");
        }
        if ((this.zze & 2) == 0) {
            sb2.append(" width");
        }
        if (this.zzd == null) {
            sb2.append(" photoReference");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}