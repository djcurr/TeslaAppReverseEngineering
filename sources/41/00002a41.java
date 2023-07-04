package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzcj extends zzbp {
    private final transient zzbo zza;
    private final transient zzbm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcj(zzbo zzboVar, zzbm zzbmVar) {
        this.zza = zzboVar;
        this.zzb = zzbmVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbh, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbp, com.google.android.gms.internal.mlkit_vision_text_common.zzbh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbh
    public final int zza(Object[] objArr, int i11) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbp, com.google.android.gms.internal.mlkit_vision_text_common.zzbh
    public final zzcq zzd() {
        return this.zzb.listIterator(0);
    }
}