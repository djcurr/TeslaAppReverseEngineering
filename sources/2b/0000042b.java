package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    f<K, V>.b f2730a;

    /* renamed from: b  reason: collision with root package name */
    f<K, V>.c f2731b;

    /* renamed from: c  reason: collision with root package name */
    f<K, V>.e f2732c;

    /* loaded from: classes.dex */
    final class a<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        final int f2733a;

        /* renamed from: b  reason: collision with root package name */
        int f2734b;

        /* renamed from: c  reason: collision with root package name */
        int f2735c;

        /* renamed from: d  reason: collision with root package name */
        boolean f2736d = false;

        a(int i11) {
            this.f2733a = i11;
            this.f2734b = f.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2735c < this.f2734b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t11 = (T) f.this.b(this.f2735c, this.f2733a);
                this.f2735c++;
                this.f2736d = true;
                return t11;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f2736d) {
                int i11 = this.f2735c - 1;
                this.f2735c = i11;
                this.f2734b--;
                this.f2736d = false;
                f.this.h(i11);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d11 = f.this.d();
            for (Map.Entry<K, V> entry : collection) {
                f.this.g(entry.getKey(), entry.getValue());
            }
            return d11 != f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int e11 = f.this.e(entry.getKey());
                if (e11 < 0) {
                    return false;
                }
                return androidx.collection.c.c(f.this.b(e11, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i11 = 0;
            for (int d11 = f.this.d() - 1; d11 >= 0; d11--) {
                Object b11 = f.this.b(d11, 0);
                Object b12 = f.this.b(d11, 1);
                i11 += (b11 == null ? 0 : b11.hashCode()) ^ (b12 == null ? 0 : b12.hashCode());
            }
            return i11;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k11) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return f.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return f.j(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i11 = 0;
            for (int d11 = f.this.d() - 1; d11 >= 0; d11--) {
                Object b11 = f.this.b(d11, 0);
                i11 += b11 == null ? 0 : b11.hashCode();
            }
            return i11;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e11 = f.this.e(obj);
            if (e11 >= 0) {
                f.this.h(e11);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return f.o(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return f.p(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return f.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) f.this.r(tArr, 0);
        }
    }

    /* loaded from: classes.dex */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        int f2740a;

        /* renamed from: c  reason: collision with root package name */
        boolean f2742c = false;

        /* renamed from: b  reason: collision with root package name */
        int f2741b = -1;

        d() {
            this.f2740a = f.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f2741b++;
                this.f2742c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f2742c) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return androidx.collection.c.c(entry.getKey(), f.this.b(this.f2741b, 0)) && androidx.collection.c.c(entry.getValue(), f.this.b(this.f2741b, 1));
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f2742c) {
                return (K) f.this.b(this.f2741b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f2742c) {
                return (V) f.this.b(this.f2741b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2741b < this.f2740a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f2742c) {
                Object b11 = f.this.b(this.f2741b, 0);
                Object b12 = f.this.b(this.f2741b, 1);
                return (b11 == null ? 0 : b11.hashCode()) ^ (b12 != null ? b12.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f2742c) {
                f.this.h(this.f2741b);
                this.f2741b--;
                this.f2740a--;
                this.f2742c = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            if (this.f2742c) {
                return (V) f.this.i(this.f2741b, v11);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes.dex */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v11) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return f.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f11 = f.this.f(obj);
            if (f11 >= 0) {
                f.this.h(f11);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d11 = f.this.d();
            int i11 = 0;
            boolean z11 = false;
            while (i11 < d11) {
                if (collection.contains(f.this.b(i11, 1))) {
                    f.this.h(i11);
                    i11--;
                    d11--;
                    z11 = true;
                }
                i11++;
            }
            return z11;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d11 = f.this.d();
            int i11 = 0;
            boolean z11 = false;
            while (i11 < d11) {
                if (!collection.contains(f.this.b(i11, 1))) {
                    f.this.h(i11);
                    i11--;
                    d11--;
                    z11 = true;
                }
                i11++;
            }
            return z11;
        }

        @Override // java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return f.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) f.this.r(tArr, 1);
        }
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!map.containsKey(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            map.remove(it2.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (!collection.contains(it2.next())) {
                it2.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int i11, int i12);

    protected abstract Map<K, V> c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(K k11, V v11);

    protected abstract void h(int i11);

    protected abstract V i(int i11, V v11);

    public Set<Map.Entry<K, V>> l() {
        if (this.f2730a == null) {
            this.f2730a = new b();
        }
        return this.f2730a;
    }

    public Set<K> m() {
        if (this.f2731b == null) {
            this.f2731b = new c();
        }
        return this.f2731b;
    }

    public Collection<V> n() {
        if (this.f2732c == null) {
            this.f2732c = new e();
        }
        return this.f2732c;
    }

    public Object[] q(int i11) {
        int d11 = d();
        Object[] objArr = new Object[d11];
        for (int i12 = 0; i12 < d11; i12++) {
            objArr[i12] = b(i12, i11);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] r(T[] tArr, int i11) {
        int d11 = d();
        if (tArr.length < d11) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d11));
        }
        for (int i12 = 0; i12 < d11; i12++) {
            tArr[i12] = b(i12, i11);
        }
        if (tArr.length > d11) {
            tArr[d11] = null;
        }
        return tArr;
    }
}