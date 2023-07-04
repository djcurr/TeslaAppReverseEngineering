package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzgl<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zzyg;

    public zzgl(Iterator<Map.Entry<K, Object>> it2) {
        this.zzyg = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzyg.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.zzyg.next();
        return next.getValue() instanceof zzgi ? new zzgk(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzyg.remove();
    }
}