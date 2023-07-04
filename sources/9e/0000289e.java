package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
abstract class zzck implements Iterator {
    final Iterator zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzck(Iterator it2) {
        Objects.requireNonNull(it2);
        this.zza = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza(this.zza.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }

    abstract Object zza(Object obj);
}