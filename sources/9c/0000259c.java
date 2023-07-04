package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzcu extends zzcf {
    private final transient zzce zza;
    private final transient zzcc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcu(zzce zzceVar, zzcc zzccVar) {
        this.zza = zzceVar;
        this.zzb = zzccVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcf, com.google.android.gms.internal.mlkit_vision_barcode.zzbx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final int zza(Object[] objArr, int i11) {
        return this.zzb.zza(objArr, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcf, com.google.android.gms.internal.mlkit_vision_barcode.zzbx
    public final zzda zzd() {
        return this.zzb.listIterator(0);
    }
}