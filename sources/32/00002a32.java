package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzbv extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbv(List list, zzu zzuVar) {
        Objects.requireNonNull(list);
        this.zza = list;
        Objects.requireNonNull(zzuVar);
        this.zzb = zzuVar;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i11) {
        return new zzbu(this, this.zza.listIterator(i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}