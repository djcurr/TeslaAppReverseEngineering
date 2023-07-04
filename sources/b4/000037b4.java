package com.google.common.collect;

import com.google.common.collect.p;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* loaded from: classes3.dex */
public abstract class t<K, V> implements Map<K, V>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private transient v<Map.Entry<K, V>> f16135a;

    /* renamed from: b  reason: collision with root package name */
    private transient v<K> f16136b;

    /* renamed from: c  reason: collision with root package name */
    private transient p<V> f16137c;

    /* loaded from: classes3.dex */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        Comparator<? super V> f16138a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f16139b;

        /* renamed from: c  reason: collision with root package name */
        int f16140c;

        /* renamed from: d  reason: collision with root package name */
        boolean f16141d;

        public a() {
            this(4);
        }

        private void c(int i11) {
            int i12 = i11 * 2;
            Object[] objArr = this.f16139b;
            if (i12 > objArr.length) {
                this.f16139b = Arrays.copyOf(objArr, p.b.a(objArr.length, i12));
                this.f16141d = false;
            }
        }

        public t<K, V> a() {
            return b();
        }

        public t<K, V> b() {
            g();
            this.f16141d = true;
            return o0.n(this.f16140c, this.f16139b);
        }

        public a<K, V> d(K k11, V v11) {
            c(this.f16140c + 1);
            h.a(k11, v11);
            Object[] objArr = this.f16139b;
            int i11 = this.f16140c;
            objArr[i11 * 2] = k11;
            objArr[(i11 * 2) + 1] = v11;
            this.f16140c = i11 + 1;
            return this;
        }

        public a<K, V> e(Map.Entry<? extends K, ? extends V> entry) {
            return d(entry.getKey(), entry.getValue());
        }

        public a<K, V> f(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                c(this.f16140c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                e(entry);
            }
            return this;
        }

        void g() {
            int i11;
            if (this.f16138a != null) {
                if (this.f16141d) {
                    this.f16139b = Arrays.copyOf(this.f16139b, this.f16140c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f16140c];
                int i12 = 0;
                while (true) {
                    i11 = this.f16140c;
                    if (i12 >= i11) {
                        break;
                    }
                    int i13 = i12 * 2;
                    Object obj = this.f16139b[i13];
                    Objects.requireNonNull(obj);
                    Object obj2 = this.f16139b[i13 + 1];
                    Objects.requireNonNull(obj2);
                    entryArr[i12] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
                    i12++;
                }
                Arrays.sort(entryArr, 0, i11, l0.a(this.f16138a).g(d0.j()));
                for (int i14 = 0; i14 < this.f16140c; i14++) {
                    int i15 = i14 * 2;
                    this.f16139b[i15] = entryArr[i14].getKey();
                    this.f16139b[i15 + 1] = entryArr[i14].getValue();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i11) {
            this.f16139b = new Object[i11 * 2];
            this.f16140c = 0;
            this.f16141d = false;
        }
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> t<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.f(iterable);
        return aVar.a();
    }

    public static <K, V> t<K, V> c(Map<? extends K, ? extends V> map) {
        if ((map instanceof t) && !(map instanceof SortedMap)) {
            t<K, V> tVar = (t) map;
            if (!tVar.j()) {
                return tVar;
            }
        }
        return b(map.entrySet());
    }

    public static <K, V> t<K, V> l() {
        return (t<K, V>) o0.f16101g;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract v<Map.Entry<K, V>> e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return d0.b(this, obj);
    }

    abstract v<K> f();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v11) {
        V v12 = get(obj);
        return v12 != null ? v12 : v11;
    }

    abstract p<V> h();

    @Override // java.util.Map
    public int hashCode() {
        return s0.b(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i */
    public v<Map.Entry<K, V>> entrySet() {
        v<Map.Entry<K, V>> vVar = this.f16135a;
        if (vVar == null) {
            v<Map.Entry<K, V>> e11 = e();
            this.f16135a = e11;
            return e11;
        }
        return vVar;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    abstract boolean j();

    @Override // java.util.Map
    /* renamed from: k */
    public v<K> keySet() {
        v<K> vVar = this.f16136b;
        if (vVar == null) {
            v<K> f11 = f();
            this.f16136b = f11;
            return f11;
        }
        return vVar;
    }

    @Override // java.util.Map
    /* renamed from: m */
    public p<V> values() {
        p<V> pVar = this.f16137c;
        if (pVar == null) {
            p<V> h11 = h();
            this.f16137c = h11;
            return h11;
        }
        return pVar;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k11, V v11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return d0.i(this);
    }
}