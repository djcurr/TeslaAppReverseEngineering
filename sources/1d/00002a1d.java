package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzba extends zzap {
    final /* synthetic */ zzbc zza;
    private final Object zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzba(zzbc zzbcVar, int i11) {
        this.zza = zzbcVar;
        this.zzb = zzbc.zzg(zzbcVar, i11);
        this.zzc = i11;
    }

    private final void zza() {
        int zzv;
        int i11 = this.zzc;
        if (i11 == -1 || i11 >= this.zza.size() || !zzw.zza(this.zzb, zzbc.zzg(this.zza, this.zzc))) {
            zzv = this.zza.zzv(this.zzb);
            this.zzc = zzv;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzap, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzap, java.util.Map.Entry
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
        return zzbc.zzj(this.zza, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzap, java.util.Map.Entry
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
        Object zzj = zzbc.zzj(this.zza, i11);
        zzbc.zzm(this.zza, this.zzc, obj);
        return zzj;
    }
}