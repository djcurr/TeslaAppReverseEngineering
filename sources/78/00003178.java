package com.google.android.libraries.places.api.model;

/* loaded from: classes3.dex */
final class zzf extends zzba {
    private int zza;
    private int zzb;
    private byte zzc;

    @Override // com.google.android.libraries.places.api.model.zzba
    public final zzba zza(int i11) {
        this.zzb = i11;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzba
    public final zzba zzb(int i11) {
        this.zza = i11;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzba
    public final zzbb zzc() {
        if (this.zzc != 3) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.zzc & 1) == 0) {
                sb2.append(" offset");
            }
            if ((this.zzc & 2) == 0) {
                sb2.append(" length");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        return new zzaf(this.zza, this.zzb);
    }
}