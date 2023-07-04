package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzje extends AbstractList implements RandomAccess, Serializable {
    final List zza;
    final zzce zzb;

    public zzje(List list, zzce zzceVar, byte[] bArr) {
        Objects.requireNonNull(list);
        this.zza = list;
        this.zzb = zzceVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return ((zzcf) this.zza.get(i11)).toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new zzjd(this, this.zza.listIterator(i11));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        return ((zzcf) this.zza.remove(i11)).toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}