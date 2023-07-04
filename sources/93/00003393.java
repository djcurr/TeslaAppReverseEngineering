package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
abstract class zzjt implements Iterator {
    final Iterator zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjt(Iterator it2) {
        Objects.requireNonNull(it2);
        this.zzb = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.zzb.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzb.remove();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zza(Object obj);
}