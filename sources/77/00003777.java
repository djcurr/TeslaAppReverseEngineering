package com.google.common.collect;

import com.google.common.collect.g0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class e<K, V> implements e0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private transient Collection<Map.Entry<K, V>> f16054a;

    /* renamed from: b  reason: collision with root package name */
    private transient Set<K> f16055b;

    /* renamed from: c  reason: collision with root package name */
    private transient Collection<V> f16056c;

    /* renamed from: d  reason: collision with root package name */
    private transient Map<K, Collection<V>> f16057d;

    /* loaded from: classes3.dex */
    class a extends g0.b<K, V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        @Override // com.google.common.collect.g0.b
        e0<K, V> b() {
            return e.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return e.this.h();
        }
    }

    /* loaded from: classes3.dex */
    class b extends AbstractCollection<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            e.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return e.this.c(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return e.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return e.this.size();
        }
    }

    @Override // com.google.common.collect.e0
    public Collection<Map.Entry<K, V>> a() {
        Collection<Map.Entry<K, V>> collection = this.f16054a;
        if (collection == null) {
            Collection<Map.Entry<K, V>> e11 = e();
            this.f16054a = e11;
            return e11;
        }
        return collection;
    }

    @Override // com.google.common.collect.e0
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f16057d;
        if (map == null) {
            Map<K, Collection<V>> d11 = d();
            this.f16057d = d11;
            return d11;
        }
        return map;
    }

    @Override // com.google.common.collect.e0
    public boolean b(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean c(Object obj) {
        for (Collection<V> collection : asMap().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map<K, Collection<V>> d();

    abstract Collection<Map.Entry<K, V>> e();

    public boolean equals(Object obj) {
        return g0.a(this, obj);
    }

    abstract Set<K> f();

    abstract Collection<V> g();

    abstract Iterator<Map.Entry<K, V>> h();

    public int hashCode() {
        return asMap().hashCode();
    }

    public Set<K> i() {
        Set<K> set = this.f16055b;
        if (set == null) {
            Set<K> f11 = f();
            this.f16055b = f11;
            return f11;
        }
        return set;
    }

    abstract Iterator<V> j();

    @Override // com.google.common.collect.e0
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return asMap().toString();
    }

    @Override // com.google.common.collect.e0
    public Collection<V> values() {
        Collection<V> collection = this.f16056c;
        if (collection == null) {
            Collection<V> g11 = g();
            this.f16056c = g11;
            return g11;
        }
        return collection;
    }
}