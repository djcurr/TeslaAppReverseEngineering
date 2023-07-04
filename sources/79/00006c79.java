package ezvcard.util;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class g<K, V> implements Iterable<Map.Entry<K, List<V>>> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<K, List<V>> f25458a;

    /* loaded from: classes5.dex */
    class a implements Iterator<Map.Entry<K, List<V>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f25459a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ezvcard.util.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class C0494a implements Map.Entry<K, List<V>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Map.Entry f25460a;

            C0494a(a aVar, Map.Entry entry) {
                this.f25460a = entry;
            }

            @Override // java.util.Map.Entry
            /* renamed from: a */
            public List<V> getValue() {
                return Collections.unmodifiableList((List) this.f25460a.getValue());
            }

            @Override // java.util.Map.Entry
            /* renamed from: b */
            public List<V> setValue(List<V> list) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return (K) this.f25460a.getKey();
            }
        }

        a(g gVar, Iterator it2) {
            this.f25459a = it2;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, List<V>> next() {
            return new C0494a(this, (Map.Entry) this.f25459a.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25459a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public g() {
        this(new LinkedHashMap());
    }

    private static <K, V> Map<K, List<V>> c(Map<K, List<V>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        return linkedHashMap;
    }

    public V d(K k11) {
        List<V> list = this.f25458a.get(k(k11));
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    public List<V> e(K k11) {
        K k12 = k(k11);
        List<V> list = this.f25458a.get(k12);
        if (list == null) {
            list = new ArrayList<>(0);
        }
        return new b(k12, list, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f25458a.equals(((g) obj).f25458a);
        }
        return false;
    }

    public void f(K k11, V v11) {
        K k12 = k(k11);
        List<V> list = this.f25458a.get(k12);
        if (list == null) {
            list = new ArrayList<>();
            this.f25458a.put(k12, list);
        }
        list.add(v11);
    }

    public void h(K k11, Collection<V> collection) {
        if (collection.isEmpty()) {
            return;
        }
        K k12 = k(k11);
        List<V> list = this.f25458a.get(k12);
        if (list == null) {
            list = new ArrayList<>();
            this.f25458a.put(k12, list);
        }
        list.addAll(collection);
    }

    public int hashCode() {
        return this.f25458a.hashCode();
    }

    public List<V> i(K k11) {
        List<V> remove = this.f25458a.remove(k(k11));
        if (remove == null) {
            return Collections.emptyList();
        }
        List<V> unmodifiableList = Collections.unmodifiableList(new ArrayList(remove));
        remove.clear();
        return unmodifiableList;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, List<V>>> iterator() {
        return new a(this, this.f25458a.entrySet().iterator());
    }

    public List<V> j(K k11, V v11) {
        List<V> i11 = i(k11);
        if (v11 != null) {
            f(k11, v11);
        }
        return i11;
    }

    protected K k(K k11) {
        return k11;
    }

    public List<V> m() {
        ArrayList arrayList = new ArrayList();
        for (List<V> list : this.f25458a.values()) {
            arrayList.addAll(list);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int size() {
        int i11 = 0;
        for (List<V> list : this.f25458a.values()) {
            i11 += list.size();
        }
        return i11;
    }

    public String toString() {
        return this.f25458a.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class b extends AbstractCollection<V> implements List<V> {

        /* renamed from: a  reason: collision with root package name */
        final K f25461a;

        /* renamed from: b  reason: collision with root package name */
        List<V> f25462b;

        /* renamed from: c  reason: collision with root package name */
        final g<K, V>.b f25463c;

        /* renamed from: d  reason: collision with root package name */
        final List<V> f25464d;

        b(K k11, List<V> list, g<K, V>.b bVar) {
            this.f25461a = k11;
            this.f25462b = list;
            this.f25463c = bVar;
            this.f25464d = bVar == null ? null : bVar.d();
        }

        @Override // java.util.List
        public void add(int i11, V v11) {
            f();
            boolean isEmpty = d().isEmpty();
            d().add(i11, v11);
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
            boolean addAll = d().addAll(i11, collection);
            if (addAll && size == 0) {
                b();
            }
            return addAll;
        }

        void b() {
            g<K, V>.b bVar = this.f25463c;
            if (bVar == null) {
                g.this.f25458a.put(this.f25461a, this.f25462b);
            } else {
                bVar.b();
            }
        }

        g<K, V>.b c() {
            return this.f25463c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            if (size() == 0) {
                return;
            }
            this.f25462b.clear();
            h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            f();
            return this.f25462b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean containsAll(Collection<?> collection) {
            f();
            return this.f25462b.containsAll(collection);
        }

        List<V> d() {
            return this.f25462b;
        }

        K e() {
            return this.f25461a;
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            f();
            return this.f25462b.equals(obj);
        }

        void f() {
            List<V> list;
            g<K, V>.b bVar = this.f25463c;
            if (bVar != null) {
                bVar.f();
                if (this.f25463c.d() != this.f25464d) {
                    throw new ConcurrentModificationException();
                }
            } else if (!this.f25462b.isEmpty() || (list = (List) g.this.f25458a.get(this.f25461a)) == null) {
            } else {
                this.f25462b = list;
            }
        }

        @Override // java.util.List
        public V get(int i11) {
            f();
            return d().get(i11);
        }

        void h() {
            g<K, V>.b bVar = this.f25463c;
            if (bVar != null) {
                bVar.h();
            } else if (this.f25462b.isEmpty()) {
                g.this.f25458a.remove(this.f25461a);
            }
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            f();
            return this.f25462b.hashCode();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            f();
            return d().indexOf(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<V> iterator() {
            f();
            return new a();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            f();
            return d().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            f();
            return new a();
        }

        @Override // java.util.List
        public V remove(int i11) {
            f();
            V remove = d().remove(i11);
            h();
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            f();
            boolean removeAll = this.f25462b.removeAll(collection);
            if (removeAll) {
                h();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> collection) {
            f();
            boolean retainAll = this.f25462b.retainAll(collection);
            if (retainAll) {
                h();
            }
            return retainAll;
        }

        @Override // java.util.List
        public V set(int i11, V v11) {
            f();
            return d().set(i11, v11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            f();
            return this.f25462b.size();
        }

        @Override // java.util.List
        public List<V> subList(int i11, int i12) {
            f();
            return new b(e(), d().subList(i11, i12), c() == null ? this : c());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            f();
            return this.f25462b.toString();
        }

        /* loaded from: classes5.dex */
        private class a implements ListIterator<V> {

            /* renamed from: a  reason: collision with root package name */
            final ListIterator<V> f25466a;

            /* renamed from: b  reason: collision with root package name */
            final List<V> f25467b;

            a() {
                List<V> list = b.this.f25462b;
                this.f25467b = list;
                this.f25466a = list.listIterator();
            }

            ListIterator<V> a() {
                b();
                return this.f25466a;
            }

            @Override // java.util.ListIterator
            public void add(V v11) {
                boolean isEmpty = b.this.isEmpty();
                a().add(v11);
                if (isEmpty) {
                    b.this.b();
                }
            }

            void b() {
                b.this.f();
                if (b.this.f25462b != this.f25467b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f25466a.hasNext();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return a().hasPrevious();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public V next() {
                b();
                return this.f25466a.next();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return a().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return a().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return a().previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                this.f25466a.remove();
                b.this.h();
            }

            @Override // java.util.ListIterator
            public void set(V v11) {
                a().set(v11);
            }

            public a(int i11) {
                List<V> list = b.this.f25462b;
                this.f25467b = list;
                this.f25466a = list.listIterator(i11);
            }
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i11) {
            f();
            return new a(i11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            f();
            boolean remove = this.f25462b.remove(obj);
            if (remove) {
                h();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(V v11) {
            f();
            boolean isEmpty = this.f25462b.isEmpty();
            boolean add = this.f25462b.add(v11);
            if (add && isEmpty) {
                b();
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f25462b.addAll(collection);
            if (addAll && size == 0) {
                b();
            }
            return addAll;
        }
    }

    public g(g<K, V> gVar) {
        this(c(gVar.f25458a));
    }

    public g(Map<K, List<V>> map) {
        this.f25458a = map;
    }
}