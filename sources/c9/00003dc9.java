package com.google.protobuf.kotlin;

import ch.qos.logback.core.joran.action.Action;
import i00.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00028\u00008\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\b\u001a\u00028\u00018\u0016@\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableMapEntry;", "K", "V", "", "getKey", "()Ljava/lang/Object;", Action.KEY_ATTRIBUTE, "getValue", "value", "delegate", "<init>", "(Ljava/util/Map$Entry;)V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class UnmodifiableMapEntry<K, V> implements Map.Entry<K, V>, a {
    private final /* synthetic */ Map.Entry<K, V> $$delegate_0;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntry(Map.Entry<? extends K, ? extends V> delegate) {
        s.g(delegate, "delegate");
        this.$$delegate_0 = delegate;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.$$delegate_0.getKey();
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // java.util.Map.Entry
    public V setValue(V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}