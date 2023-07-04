package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzjp extends zzjc {
    private final transient zzjb zza;
    private final transient zziy zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjp(zzjb zzjbVar, zziy zziyVar) {
        this.zza = zzjbVar;
        this.zzb = zziyVar;
    }

    @Override // com.google.android.libraries.places.internal.zziv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.libraries.places.internal.zzjc, com.google.android.libraries.places.internal.zziv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zziv
    public final int zza(Object[] objArr, int i11) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzjc, com.google.android.libraries.places.internal.zziv
    public final zziy zzd() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzjc, com.google.android.libraries.places.internal.zziv
    public final zzjv zze() {
        return this.zzb.listIterator(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zziv
    public final boolean zzf() {
        throw null;
    }
}