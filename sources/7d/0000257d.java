package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzbq extends zzbf {
    final /* synthetic */ zzbs zza;
    private final Object zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbq(zzbs zzbsVar, int i11) {
        this.zza = zzbsVar;
        this.zzb = zzbs.zzg(zzbsVar, i11);
        this.zzc = i11;
    }

    private final void zza() {
        int zzv;
        int i11 = this.zzc;
        if (i11 == -1 || i11 >= this.zza.size() || !zzam.zza(this.zzb, zzbs.zzg(this.zza, this.zzc))) {
            zzv = this.zza.zzv(this.zzb);
            this.zzc = zzv;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbf, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbf, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i11 = this.zzc;
        if (i11 == -1) {
            return null;
        }
        return zzbs.zzj(this.zza, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbf, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i11 = this.zzc;
        if (i11 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object zzj = zzbs.zzj(this.zza, i11);
        zzbs.zzm(this.zza, this.zzc, obj);
        return zzj;
    }
}