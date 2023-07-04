package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class b<K, V> extends c<K, V> implements y<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    public b(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.e0
    /* renamed from: A */
    public List<V> get(K k11) {
        return (List) super.get(k11);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.e0
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.e
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.e0
    public boolean put(K k11, V v11) {
        return super.put(k11, v11);
    }

    @Override // com.google.common.collect.c
    <E> Collection<E> x(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.c
    Collection<V> y(K k11, Collection<V> collection) {
        return z(k11, (List) collection, null);
    }
}