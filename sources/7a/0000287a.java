package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Map;

/* loaded from: classes3.dex */
final class zzbb extends zzaq {
    final /* synthetic */ zzbd zza;
    private final Object zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbb(zzbd zzbdVar, int i11) {
        this.zza = zzbdVar;
        this.zzb = zzbd.zzg(zzbdVar, i11);
        this.zzc = i11;
    }

    private final void zza() {
        int zzv;
        int i11 = this.zzc;
        if (i11 == -1 || i11 >= this.zza.size() || !zzx.zza(this.zzb, zzbd.zzg(this.zza, this.zzc))) {
            zzv = this.zza.zzv(this.zzb);
            this.zzc = zzv;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
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
        return zzbd.zzj(this.zza, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzaq, java.util.Map.Entry
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
        Object zzj = zzbd.zzj(this.zza, i11);
        zzbd.zzm(this.zza, this.zzc, obj);
        return zzj;
    }
}