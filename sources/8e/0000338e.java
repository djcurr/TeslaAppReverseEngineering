package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzjo extends zzjc {
    private final transient zzjb zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjo(zzjb zzjbVar, Object[] objArr, int i11, int i12) {
        this.zza = zzjbVar;
        this.zzb = objArr;
        this.zzc = i12;
    }

    @Override // com.google.android.libraries.places.internal.zziv, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzjc, com.google.android.libraries.places.internal.zziv, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zziv
    public final int zza(Object[] objArr, int i11) {
        return zzd().zza(objArr, 0);
    }

    @Override // com.google.android.libraries.places.internal.zzjc, com.google.android.libraries.places.internal.zziv
    public final zzjv zze() {
        return zzd().listIterator(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zziv
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzjc
    final zziy zzh() {
        return new zzjn(this);
    }
}