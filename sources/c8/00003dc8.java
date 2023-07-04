package com.google.protobuf.kotlin;

import i00.a;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: Add missing generic type declarations: [V, K] */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0003J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002¨\u0006\u0006"}, d2 = {"com/google/protobuf/kotlin/UnmodifiableMapEntries$iterator$1", "", "", "", "hasNext", "next", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class UnmodifiableMapEntries$iterator$1<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, a {
    private final /* synthetic */ Iterator<Map.Entry<K, V>> $$delegate_0;
    final /* synthetic */ Iterator<Map.Entry<K, V>> $itr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntries$iterator$1(Iterator<? extends Map.Entry<? extends K, ? extends V>> it2) {
        this.$itr = it2;
        this.$$delegate_0 = it2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        return new UnmodifiableMapEntry(this.$itr.next());
    }
}