package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class u<K, V> extends f<K, V> implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    final transient t<K, ? extends p<V>> f16143e;

    /* renamed from: f  reason: collision with root package name */
    final transient int f16144f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends v0<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        final Iterator<? extends Map.Entry<K, ? extends p<V>>> f16145a;

        /* renamed from: b  reason: collision with root package name */
        K f16146b = null;

        /* renamed from: c  reason: collision with root package name */
        Iterator<V> f16147c = x.d();

        a() {
            this.f16145a = u.this.f16143e.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (!this.f16147c.hasNext()) {
                Map.Entry<K, ? extends p<V>> next = this.f16145a.next();
                this.f16146b = next.getKey();
                this.f16147c = next.getValue().iterator();
            }
            K k11 = this.f16146b;
            Objects.requireNonNull(k11);
            return d0.c(k11, this.f16147c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16147c.hasNext() || this.f16145a.hasNext();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends v0<V> {

        /* renamed from: a  reason: collision with root package name */
        Iterator<? extends p<V>> f16149a;

        /* renamed from: b  reason: collision with root package name */
        Iterator<V> f16150b = x.d();

        b() {
            this.f16149a = u.this.f16143e.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16150b.hasNext() || this.f16149a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f16150b.hasNext()) {
                this.f16150b = this.f16149a.next().iterator();
            }
            return this.f16150b.next();
        }
    }

    /* loaded from: classes3.dex */
    public static class c<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, Collection<V>> f16152a = m0.d();

        /* renamed from: b  reason: collision with root package name */
        Comparator<? super K> f16153b;

        /* renamed from: c  reason: collision with root package name */
        Comparator<? super V> f16154c;

        public u<K, V> a() {
            Collection entrySet = this.f16152a.entrySet();
            Comparator<? super K> comparator = this.f16153b;
            if (comparator != null) {
                entrySet = l0.a(comparator).f().b(entrySet);
            }
            return s.s(entrySet, this.f16154c);
        }

        Collection<V> b() {
            return new ArrayList();
        }

        public c<K, V> c(K k11, Iterable<? extends V> iterable) {
            if (k11 == null) {
                String valueOf = String.valueOf(w.e(iterable));
                throw new NullPointerException(valueOf.length() != 0 ? "null key in entry: null=".concat(valueOf) : new String("null key in entry: null="));
            }
            Collection<V> collection = this.f16152a.get(k11);
            if (collection != null) {
                for (V v11 : iterable) {
                    h.a(k11, v11);
                    collection.add(v11);
                }
                return this;
            }
            Iterator<? extends V> it2 = iterable.iterator();
            if (it2.hasNext()) {
                Collection<V> b11 = b();
                while (it2.hasNext()) {
                    V next = it2.next();
                    h.a(k11, next);
                    b11.add(next);
                }
                this.f16152a.put(k11, b11);
                return this;
            }
            return this;
        }

        public c<K, V> d(K k11, V... vArr) {
            return c(k11, Arrays.asList(vArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class d<K, V> extends p<Map.Entry<K, V>> {

        /* renamed from: b  reason: collision with root package name */
        final u<K, V> f16155b;

        d(u<K, V> uVar) {
            this.f16155b = uVar;
        }

        @Override // com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.f16155b.b(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: i */
        public v0<Map.Entry<K, V>> iterator() {
            return this.f16155b.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f16155b.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class e<K, V> extends p<V> {

        /* renamed from: b  reason: collision with root package name */
        private final transient u<K, V> f16156b;

        e(u<K, V> uVar) {
            this.f16156b = uVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.p
        public int c(Object[] objArr, int i11) {
            v0<? extends p<V>> it2 = this.f16156b.f16143e.values().iterator();
            while (it2.hasNext()) {
                i11 = it2.next().c(objArr, i11);
            }
            return i11;
        }

        @Override // com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f16156b.c(obj);
        }

        @Override // com.google.common.collect.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: i */
        public v0<V> iterator() {
            return this.f16156b.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f16156b.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(t<K, ? extends p<V>> tVar, int i11) {
        this.f16143e = tVar;
        this.f16144f = i11;
    }

    @Override // com.google.common.collect.e
    public boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // com.google.common.collect.e0
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.e
    Map<K, Collection<V>> d() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.e
    Set<K> f() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.e, com.google.common.collect.e0
    /* renamed from: k */
    public t<K, Collection<V>> asMap() {
        return (t<K, ? extends p<V>>) this.f16143e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.e
    /* renamed from: l */
    public p<Map.Entry<K, V>> e() {
        return new d(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.e
    /* renamed from: m */
    public p<V> g() {
        return new e(this);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.e0
    /* renamed from: n */
    public p<Map.Entry<K, V>> a() {
        return (p) super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.e
    /* renamed from: o */
    public v0<Map.Entry<K, V>> h() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.e
    /* renamed from: p */
    public v0<V> j() {
        return new b();
    }

    @Override // com.google.common.collect.e0
    @Deprecated
    public final boolean put(K k11, V v11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.e0
    /* renamed from: q */
    public p<V> values() {
        return (p) super.values();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.e0
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.e0
    public int size() {
        return this.f16144f;
    }
}