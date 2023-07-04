package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjg extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzce zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjg(List list, zzce zzceVar, byte[] bArr) {
        Objects.requireNonNull(list);
        this.zza = list;
        this.zzb = zzceVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new zzjf(this, this.zza.listIterator(i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}