package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzax extends zzas {
    private final transient zzar zza;
    private final transient zzao zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzax(zzar zzarVar, zzao zzaoVar) {
        this.zza = zzarVar;
        this.zzb = zzaoVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzak, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzas, com.google.android.gms.internal.mlkit_common.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.mlkit_common.zzak
    public final int zza(Object[] objArr, int i11) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzas, com.google.android.gms.internal.mlkit_common.zzak
    public final zzbb zzd() {
        return this.zzb.listIterator(0);
    }
}