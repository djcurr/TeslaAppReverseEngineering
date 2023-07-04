package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbl extends zzbm {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbm zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbl(zzbm zzbmVar, int i11, int i12) {
        this.zzc = zzbmVar;
        this.zza = i11;
        this.zzb = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzaa.zza(i11, this.zzb, "index");
        return this.zzc.get(i11 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbh
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbh
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbh
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbm
    public final zzbm zzf(int i11, int i12) {
        zzaa.zzc(i11, i12, this.zzb);
        zzbm zzbmVar = this.zzc;
        int i13 = this.zza;
        return zzbmVar.subList(i11 + i13, i12 + i13);
    }
}