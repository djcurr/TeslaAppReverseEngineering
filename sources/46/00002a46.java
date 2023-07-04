package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
abstract class zzco implements Iterator {
    final Iterator zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzco(Iterator it2) {
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