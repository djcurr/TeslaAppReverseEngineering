package com.google.common.collect;

import com.google.common.collect.d0;
import com.google.common.collect.e;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class c<K, V> extends com.google.common.collect.e<K, V> implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private transient Map<K, Collection<V>> f16018e;

    /* renamed from: f  reason: collision with root package name */
    private transient int f16019f;

    /* loaded from: classes3.dex */
    class a extends c<K, V>.d<V> {
        a(c cVar) {
            super();
        }

        @Override // com.google.common.collect.c.d
        V a(K k11, V v11) {
            return v11;
        }
    }

    /* loaded from: classes3.dex */
    class b extends c<K, V>.d<Map.Entry<K, V>> {
        b(c cVar) {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.c.d
        /* renamed from: b */
        public Map.Entry<K, V> a(K k11, V v11) {
            return d0.c(k11, v11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0292c extends d0.f<K, Collection<V>> {

        /* renamed from: c  reason: collision with root package name */
        final transient Map<K, Collection<V>> f16020c;

        /* renamed from: com.google.common.collect.c$c$a */
        /* loaded from: classes3.dex */
        class a extends d0.c<K, Collection<V>> {
            a() {
            }

            @Override // com.google.common.collect.d0.c
            Map<K, Collection<V>> b() {
                return C0292c.this;
            }

            @Override // com.google.common.collect.d0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return com.google.common.collect.i.b(C0292c.this.f16020c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (contains(obj)) {
                    Map.Entry entry = (Map.Entry) obj;
                    Objects.requireNonNull(entry);
                    c.this.w(entry.getKey());
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.google.common.collect.c$c$b */
        /* loaded from: classes3.dex */
        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f16023a;

            /* renamed from: b  reason: collision with root package name */
            Collection<V> f16024b;

            b() {
                this.f16023a = C0292c.this.f16020c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f16023a.next();
                this.f16024b = next.getValue();
                return C0292c.this.f(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f16023a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.u.v(this.f16024b != null, "no calls to next() since the last call to remove()");
                this.f16023a.remove();
                c.p(c.this, this.f16024b.size());
                this.f16024b.clear();
                this.f16024b = null;
            }
        }

        C0292c(Map<K, Collection<V>> map) {
            this.f16020c = map;
        }

        @Override // com.google.common.collect.d0.f
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) d0.g(this.f16020c, obj);
            if (collection == null) {
                return null;
            }
            return c.this.y(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f16020c == c.this.f16018e) {
                c.this.clear();
            } else {
                x.b(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return d0.f(this.f16020c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: e */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f16020c.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> r11 = c.this.r();
            r11.addAll(remove);
            c.p(c.this, remove.size());
            remove.clear();
            return r11;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f16020c.equals(obj);
        }

        Map.Entry<K, Collection<V>> f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return d0.c(key, c.this.y(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f16020c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return c.this.i();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f16020c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f16020c.toString();
        }
    }

    /* loaded from: classes3.dex */
    private abstract class d<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f16026a;

        /* renamed from: b  reason: collision with root package name */
        K f16027b = null;

        /* renamed from: c  reason: collision with root package name */
        Collection<V> f16028c = null;

        /* renamed from: d  reason: collision with root package name */
        Iterator<V> f16029d = x.f();

        d() {
            this.f16026a = (Iterator<Map.Entry<K, V>>) c.this.f16018e.entrySet().iterator();
        }

        abstract T a(K k11, V v11);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f16026a.hasNext() || this.f16029d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f16029d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f16026a.next();
                this.f16027b = next.getKey();
                Collection<V> value = next.getValue();
                this.f16028c = value;
                this.f16029d = value.iterator();
            }
            return a(j0.a(this.f16027b), this.f16029d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f16029d.remove();
            Collection<V> collection = this.f16028c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f16026a.remove();
            }
            c.n(c.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class e extends d0.d<K, Collection<V>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements Iterator<K> {

            /* renamed from: a  reason: collision with root package name */
            Map.Entry<K, Collection<V>> f16032a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Iterator f16033b;

            a(Iterator it2) {
                this.f16033b = it2;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f16033b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f16033b.next();
                this.f16032a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.u.v(this.f16032a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f16032a.getValue();
                this.f16033b.remove();
                c.p(c.this, value.size());
                value.clear();
                this.f16032a = null;
            }
        }

        e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            x.b(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return b().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || b().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return b().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(b().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i11;
            Collection<V> remove = b().remove(obj);
            if (remove != null) {
                i11 = remove.size();
                remove.clear();
                c.p(c.this, i11);
            } else {
                i11 = 0;
            }
            return i11 > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends c<K, V>.i implements NavigableMap<K, Collection<V>> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k11) {
            Map.Entry<K, Collection<V>> ceilingEntry = j().ceilingEntry(k11);
            if (ceilingEntry == null) {
                return null;
            }
            return f(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k11) {
            return j().ceilingKey(k11);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(j().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = j().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return f(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k11) {
            Map.Entry<K, Collection<V>> floorEntry = j().floorEntry(k11);
            if (floorEntry == null) {
                return null;
            }
            return f(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k11) {
            return j().floorKey(k11);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k11) {
            Map.Entry<K, Collection<V>> higherEntry = j().higherEntry(k11);
            if (higherEntry == null) {
                return null;
            }
            return f(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k11) {
            return j().higherKey(k11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.c.i
        /* renamed from: k */
        public NavigableSet<K> h() {
            return new g(j());
        }

        @Override // com.google.common.collect.c.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: l */
        public NavigableMap<K, Collection<V>> headMap(K k11) {
            return headMap(k11, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = j().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return f(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k11) {
            Map.Entry<K, Collection<V>> lowerEntry = j().lowerEntry(k11);
            if (lowerEntry == null) {
                return null;
            }
            return f(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k11) {
            return j().lowerKey(k11);
        }

        @Override // com.google.common.collect.c.i, com.google.common.collect.c.C0292c, java.util.AbstractMap, java.util.Map
        /* renamed from: m */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        Map.Entry<K, Collection<V>> n(Iterator<Map.Entry<K, Collection<V>>> it2) {
            if (it2.hasNext()) {
                Map.Entry<K, Collection<V>> next = it2.next();
                Collection<V> r11 = c.this.r();
                r11.addAll(next.getValue());
                it2.remove();
                return d0.c(next.getKey(), c.this.x(r11));
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.c.i
        /* renamed from: o */
        public NavigableMap<K, Collection<V>> j() {
            return (NavigableMap) super.j();
        }

        @Override // com.google.common.collect.c.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: p */
        public NavigableMap<K, Collection<V>> subMap(K k11, K k12) {
            return subMap(k11, true, k12, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return n(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return n(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.c.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: q */
        public NavigableMap<K, Collection<V>> tailMap(K k11) {
            return tailMap(k11, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k11, boolean z11) {
            return new f(j().headMap(k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k11, boolean z11, K k12, boolean z12) {
            return new f(j().subMap(k11, z11, k12, z12));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k11, boolean z11) {
            return new f(j().tailMap(k11, z11));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g extends c<K, V>.j implements NavigableSet<K> {
        g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k11) {
            return c().ceilingKey(k11);
        }

        @Override // com.google.common.collect.c.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: d */
        public NavigableSet<K> headSet(K k11) {
            return headSet(k11, false);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(c().descendingMap());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.c.j
        /* renamed from: e */
        public NavigableMap<K, Collection<V>> c() {
            return (NavigableMap) super.c();
        }

        @Override // com.google.common.collect.c.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: f */
        public NavigableSet<K> subSet(K k11, K k12) {
            return subSet(k11, true, k12, false);
        }

        @Override // java.util.NavigableSet
        public K floor(K k11) {
            return c().floorKey(k11);
        }

        @Override // com.google.common.collect.c.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: h */
        public NavigableSet<K> tailSet(K k11) {
            return tailSet(k11, true);
        }

        @Override // java.util.NavigableSet
        public K higher(K k11) {
            return c().higherKey(k11);
        }

        @Override // java.util.NavigableSet
        public K lower(K k11) {
            return c().lowerKey(k11);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) x.h(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) x.h(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k11, boolean z11) {
            return new g(c().headMap(k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k11, boolean z11, K k12, boolean z12) {
            return new g(c().subMap(k11, z11, k12, z12));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k11, boolean z11) {
            return new g(c().tailMap(k11, z11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class h extends c<K, V>.l implements RandomAccess {
        h(c cVar, K k11, List<V> list, c<K, V>.k kVar) {
            super(k11, list, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class i extends c<K, V>.C0292c implements SortedMap<K, Collection<V>> {

        /* renamed from: e  reason: collision with root package name */
        SortedSet<K> f16037e;

        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return j().firstKey();
        }

        SortedSet<K> h() {
            return new j(j());
        }

        public SortedMap<K, Collection<V>> headMap(K k11) {
            return new i(j().headMap(k11));
        }

        @Override // com.google.common.collect.c.C0292c, java.util.AbstractMap, java.util.Map
        /* renamed from: i */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f16037e;
            if (sortedSet == null) {
                SortedSet<K> h11 = h();
                this.f16037e = h11;
                return h11;
            }
            return sortedSet;
        }

        SortedMap<K, Collection<V>> j() {
            return (SortedMap) this.f16020c;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return j().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k11, K k12) {
            return new i(j().subMap(k11, k12));
        }

        public SortedMap<K, Collection<V>> tailMap(K k11) {
            return new i(j().tailMap(k11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class j extends c<K, V>.e implements SortedSet<K> {
        j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        SortedMap<K, Collection<V>> c() {
            return (SortedMap) super.b();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return c().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return c().firstKey();
        }

        public SortedSet<K> headSet(K k11) {
            return new j(c().headMap(k11));
        }

        @Override // java.util.SortedSet
        public K last() {
            return c().lastKey();
        }

        public SortedSet<K> subSet(K k11, K k12) {
            return new j(c().subMap(k11, k12));
        }

        public SortedSet<K> tailSet(K k11) {
            return new j(c().tailMap(k11));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Map<K, Collection<V>> map) {
        com.google.common.base.u.d(map.isEmpty());
        this.f16018e = map;
    }

    static /* synthetic */ int m(c cVar) {
        int i11 = cVar.f16019f;
        cVar.f16019f = i11 + 1;
        return i11;
    }

    static /* synthetic */ int n(c cVar) {
        int i11 = cVar.f16019f;
        cVar.f16019f = i11 - 1;
        return i11;
    }

    static /* synthetic */ int o(c cVar, int i11) {
        int i12 = cVar.f16019f + i11;
        cVar.f16019f = i12;
        return i12;
    }

    static /* synthetic */ int p(c cVar, int i11) {
        int i12 = cVar.f16019f - i11;
        cVar.f16019f = i12;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> v(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Object obj) {
        Collection collection = (Collection) d0.h(this.f16018e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f16019f -= size;
        }
    }

    @Override // com.google.common.collect.e, com.google.common.collect.e0
    public Collection<Map.Entry<K, V>> a() {
        return super.a();
    }

    @Override // com.google.common.collect.e0
    public void clear() {
        for (Collection<V> collection : this.f16018e.values()) {
            collection.clear();
        }
        this.f16018e.clear();
        this.f16019f = 0;
    }

    @Override // com.google.common.collect.e
    Collection<Map.Entry<K, V>> e() {
        return new e.a();
    }

    @Override // com.google.common.collect.e
    Collection<V> g() {
        return new e.b();
    }

    @Override // com.google.common.collect.e0
    public Collection<V> get(K k11) {
        Collection<V> collection = this.f16018e.get(k11);
        if (collection == null) {
            collection = s(k11);
        }
        return y(k11, collection);
    }

    @Override // com.google.common.collect.e
    Iterator<Map.Entry<K, V>> h() {
        return new b(this);
    }

    @Override // com.google.common.collect.e
    Iterator<V> j() {
        return new a(this);
    }

    @Override // com.google.common.collect.e0
    public boolean put(K k11, V v11) {
        Collection<V> collection = this.f16018e.get(k11);
        if (collection == null) {
            Collection<V> s11 = s(k11);
            if (s11.add(v11)) {
                this.f16019f++;
                this.f16018e.put(k11, s11);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v11)) {
            this.f16019f++;
            return true;
        } else {
            return false;
        }
    }

    abstract Collection<V> r();

    Collection<V> s(K k11) {
        return r();
    }

    @Override // com.google.common.collect.e0
    public int size() {
        return this.f16019f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, Collection<V>> t() {
        Map<K, Collection<V>> map = this.f16018e;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.f16018e);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) this.f16018e);
        }
        return new C0292c(this.f16018e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<K> u() {
        Map<K, Collection<V>> map = this.f16018e;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.f16018e);
        }
        if (map instanceof SortedMap) {
            return new j((SortedMap) this.f16018e);
        }
        return new e(this.f16018e);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.e0
    public Collection<V> values() {
        return super.values();
    }

    abstract <E> Collection<E> x(Collection<E> collection);

    abstract Collection<V> y(K k11, Collection<V> collection);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<V> z(K k11, List<V> list, c<K, V>.k kVar) {
        if (list instanceof RandomAccess) {
            return new h(this, k11, list, kVar);
        }
        return new l(k11, list, kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class k extends AbstractCollection<V> {

        /* renamed from: a  reason: collision with root package name */
        final K f16040a;

        /* renamed from: b  reason: collision with root package name */
        Collection<V> f16041b;

        /* renamed from: c  reason: collision with root package name */
        final c<K, V>.k f16042c;

        /* renamed from: d  reason: collision with root package name */
        final Collection<V> f16043d;

        k(K k11, Collection<V> collection, c<K, V>.k kVar) {
            this.f16040a = k11;
            this.f16041b = collection;
            this.f16042c = kVar;
            this.f16043d = kVar == null ? null : kVar.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v11) {
            f();
            boolean isEmpty = this.f16041b.isEmpty();
            boolean add = this.f16041b.add(v11);
            if (add) {
                c.m(c.this);
                if (isEmpty) {
                    b();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f16041b.addAll(collection);
            if (addAll) {
                c.o(c.this, this.f16041b.size() - size);
                if (size == 0) {
                    b();
                }
            }
            return addAll;
        }

        void b() {
            c<K, V>.k kVar = this.f16042c;
            if (kVar == null) {
                c.this.f16018e.put(this.f16040a, this.f16041b);
            } else {
                kVar.b();
            }
        }

        c<K, V>.k c() {
            return this.f16042c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f16041b.clear();
            c.p(c.this, size);
            h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            f();
            return this.f16041b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            f();
            return this.f16041b.containsAll(collection);
        }

        Collection<V> d() {
            return this.f16041b;
        }

        K e() {
            return this.f16040a;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            f();
            return this.f16041b.equals(obj);
        }

        void f() {
            Collection<V> collection;
            c<K, V>.k kVar = this.f16042c;
            if (kVar != null) {
                kVar.f();
                if (this.f16042c.d() != this.f16043d) {
                    throw new ConcurrentModificationException();
                }
            } else if (!this.f16041b.isEmpty() || (collection = (Collection) c.this.f16018e.get(this.f16040a)) == null) {
            } else {
                this.f16041b = collection;
            }
        }

        void h() {
            c<K, V>.k kVar = this.f16042c;
            if (kVar != null) {
                kVar.h();
            } else if (this.f16041b.isEmpty()) {
                c.this.f16018e.remove(this.f16040a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            f();
            return this.f16041b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            f();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            f();
            boolean remove = this.f16041b.remove(obj);
            if (remove) {
                c.n(c.this);
                h();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f16041b.removeAll(collection);
            if (removeAll) {
                c.o(c.this, this.f16041b.size() - size);
                h();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            com.google.common.base.u.o(collection);
            int size = size();
            boolean retainAll = this.f16041b.retainAll(collection);
            if (retainAll) {
                c.o(c.this, this.f16041b.size() - size);
                h();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            f();
            return this.f16041b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            f();
            return this.f16041b.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements Iterator<V> {

            /* renamed from: a  reason: collision with root package name */
            final Iterator<V> f16045a;

            /* renamed from: b  reason: collision with root package name */
            final Collection<V> f16046b;

            a() {
                Collection<V> collection = k.this.f16041b;
                this.f16046b = collection;
                this.f16045a = c.v(collection);
            }

            Iterator<V> a() {
                b();
                return this.f16045a;
            }

            void b() {
                k.this.f();
                if (k.this.f16041b != this.f16046b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f16045a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                b();
                return this.f16045a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f16045a.remove();
                c.n(c.this);
                k.this.h();
            }

            a(Iterator<V> it2) {
                this.f16046b = k.this.f16041b;
                this.f16045a = it2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class l extends c<K, V>.k implements List<V> {

        /* loaded from: classes3.dex */
        private class a extends c<K, V>.k.a implements ListIterator<V> {
            a() {
                super();
            }

            private ListIterator<V> c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(V v11) {
                boolean isEmpty = l.this.isEmpty();
                c().add(v11);
                c.m(c.this);
                if (isEmpty) {
                    l.this.b();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v11) {
                c().set(v11);
            }

            public a(int i11) {
                super(l.this.i().listIterator(i11));
            }
        }

        l(K k11, List<V> list, c<K, V>.k kVar) {
            super(k11, list, kVar);
        }

        @Override // java.util.List
        public void add(int i11, V v11) {
            f();
            boolean isEmpty = d().isEmpty();
            i().add(i11, v11);
            c.m(c.this);
            if (isEmpty) {
                b();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i11, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = i().addAll(i11, collection);
            if (addAll) {
                c.o(c.this, d().size() - size);
                if (size == 0) {
                    b();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i11) {
            f();
            return i().get(i11);
        }

        List<V> i() {
            return (List) d();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            f();
            return i().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            f();
            return i().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            f();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i11) {
            f();
            V remove = i().remove(i11);
            c.n(c.this);
            h();
            return remove;
        }

        @Override // java.util.List
        public V set(int i11, V v11) {
            f();
            return i().set(i11, v11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i11, int i12) {
            f();
            return c.this.z(e(), i().subList(i11, i12), c() == null ? this : c());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i11) {
            f();
            return new a(i11);
        }
    }
}