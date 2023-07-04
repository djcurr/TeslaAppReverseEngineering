package com.google.android.libraries.places.api.model;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzi extends zzbd {
    private int zza;
    private int zzb;
    private byte zzc;

    public final zzbd zza(int i11) {
        this.zza = i11;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzbd
    public final zzbd zzb(int i11) {
        this.zzb = i11;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzbd
    public final LocalTime zzc() {
        if (this.zzc != 3) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.zzc & 1) == 0) {
                sb2.append(" hours");
            }
            if ((this.zzc & 2) == 0) {
                sb2.append(" minutes");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        return new zzaj(this.zza, this.zzb);
    }
}