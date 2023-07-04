package com.google.android.gms.internal.mlkit_common;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzan extends zzao {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzao zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzan(zzao zzaoVar, int i11, int i12) {
        this.zzc = zzaoVar;
        this.zza = i11;
        this.zzb = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzac.zza(i11, this.zzb, "index");
        return this.zzc.get(i11 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzao, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzak
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_common.zzak
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_common.zzak
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzao
    public final zzao zzf(int i11, int i12) {
        zzac.zzc(i11, i12, this.zzb);
        zzao zzaoVar = this.zzc;
        int i13 = this.zza;
        return zzaoVar.subList(i11 + i13, i12 + i13);
    }
}