package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public interface e0<K, V> {
    Collection<Map.Entry<K, V>> a();

    Map<K, Collection<V>> asMap();

    boolean b(Object obj, Object obj2);

    void clear();

    Collection<V> get(K k11);

    boolean put(K k11, V v11);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection<V> values();
}