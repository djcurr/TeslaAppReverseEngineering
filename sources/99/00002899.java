package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzcf extends zzbq {
    private final transient zzbp zza;
    private final transient zzbn zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcf(zzbp zzbpVar, zzbn zzbnVar) {
        this.zza = zzbpVar;
        this.zzb = zzbnVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbq, com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zza(Object[] objArr, int i11) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbq, com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final zzcl zzd() {
        return this.zzb.listIterator(0);
    }
}