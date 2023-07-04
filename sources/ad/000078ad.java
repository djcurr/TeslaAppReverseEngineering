package io.realm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class j0<K, V> implements Map<K, V> {

    /* renamed from: a  reason: collision with root package name */
    protected final b<K, V> f31963a = new c();

    /* loaded from: classes5.dex */
    static abstract class b<K, V> implements Map<K, V> {
        b() {
        }

        protected void a(K k11) {
            Objects.requireNonNull(k11, "Null keys are not allowed.");
            if (k11.getClass() == String.class) {
                String str = (String) k11;
                if (str.contains(".") || str.contains("$")) {
                    throw new IllegalArgumentException("Keys containing dots ('.') or dollar signs ('$') are not allowed.");
                }
            }
        }

        abstract V b(K k11, V v11);

        @Override // java.util.Map
        public V put(K k11, V v11) {
            a(k11);
            return b(k11, v11);
        }
    }

    /* loaded from: classes5.dex */
    private static class c<K, V> extends b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<K, V> f31964a;

        private c() {
            this.f31964a = new HashMap();
        }

        @Override // io.realm.j0.b
        protected V b(K k11, V v11) {
            return this.f31964a.put(k11, v11);
        }

        @Override // java.util.Map
        public void clear() {
            this.f31964a.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.f31964a.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.f31964a.containsValue(obj);
        }

        @Override // java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return this.f31964a.entrySet();
        }

        @Override // java.util.Map
        public V get(Object obj) {
            return this.f31964a.get(obj);
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f31964a.isEmpty();
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            return this.f31964a.keySet();
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f31964a.putAll(map);
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            return this.f31964a.remove(obj);
        }

        @Override // java.util.Map
        public int size() {
            return this.f31964a.size();
        }

        @Override // java.util.Map
        public Collection<V> values() {
            return this.f31964a.values();
        }
    }

    @Override // java.util.Map
    public void clear() {
        this.f31963a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f31963a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f31963a.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.f31963a.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.f31963a.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f31963a.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.f31963a.keySet();
    }

    @Override // java.util.Map
    public V put(K k11, V v11) {
        return this.f31963a.put(k11, v11);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        this.f31963a.putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return this.f31963a.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f31963a.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.f31963a.values();
    }
}