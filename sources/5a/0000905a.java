package on;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<Comparable> f42811h = new a();

    /* renamed from: a  reason: collision with root package name */
    Comparator<? super K> f42812a;

    /* renamed from: b  reason: collision with root package name */
    e<K, V> f42813b;

    /* renamed from: c  reason: collision with root package name */
    int f42814c;

    /* renamed from: d  reason: collision with root package name */
    int f42815d;

    /* renamed from: e  reason: collision with root package name */
    final e<K, V> f42816e;

    /* renamed from: f  reason: collision with root package name */
    private h<K, V>.b f42817f;

    /* renamed from: g  reason: collision with root package name */
    private h<K, V>.c f42818g;

    /* loaded from: classes2.dex */
    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes2.dex */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes2.dex */
        class a extends h<K, V>.d<Map.Entry<K, V>> {
            a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> c11;
            if ((obj instanceof Map.Entry) && (c11 = h.this.c((Map.Entry) obj)) != null) {
                h.this.h(c11, true);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f42814c;
        }
    }

    /* loaded from: classes2.dex */
    final class c extends AbstractSet<K> {

        /* loaded from: classes2.dex */
        class a extends h<K, V>.d<K> {
            a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f42830f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h.this.i(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f42814c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        e<K, V> f42821a;

        /* renamed from: b  reason: collision with root package name */
        e<K, V> f42822b = null;

        /* renamed from: c  reason: collision with root package name */
        int f42823c;

        d() {
            this.f42821a = h.this.f42816e.f42828d;
            this.f42823c = h.this.f42815d;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f42821a;
            h hVar = h.this;
            if (eVar != hVar.f42816e) {
                if (hVar.f42815d == this.f42823c) {
                    this.f42821a = eVar.f42828d;
                    this.f42822b = eVar;
                    return eVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f42821a != h.this.f42816e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f42822b;
            if (eVar != null) {
                h.this.h(eVar, true);
                this.f42822b = null;
                this.f42823c = h.this.f42815d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public h() {
        this(f42811h);
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void f(e<K, V> eVar, boolean z11) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f42826b;
            e<K, V> eVar3 = eVar.f42827c;
            int i11 = eVar2 != null ? eVar2.f42832h : 0;
            int i12 = eVar3 != null ? eVar3.f42832h : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                e<K, V> eVar4 = eVar3.f42826b;
                e<K, V> eVar5 = eVar3.f42827c;
                int i14 = (eVar4 != null ? eVar4.f42832h : 0) - (eVar5 != null ? eVar5.f42832h : 0);
                if (i14 != -1 && (i14 != 0 || z11)) {
                    l(eVar3);
                    k(eVar);
                } else {
                    k(eVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 2) {
                e<K, V> eVar6 = eVar2.f42826b;
                e<K, V> eVar7 = eVar2.f42827c;
                int i15 = (eVar6 != null ? eVar6.f42832h : 0) - (eVar7 != null ? eVar7.f42832h : 0);
                if (i15 != 1 && (i15 != 0 || z11)) {
                    k(eVar2);
                    l(eVar);
                } else {
                    l(eVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f42832h = i11 + 1;
                if (z11) {
                    return;
                }
            } else {
                eVar.f42832h = Math.max(i11, i12) + 1;
                if (!z11) {
                    return;
                }
            }
            eVar = eVar.f42825a;
        }
    }

    private void j(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f42825a;
        eVar.f42825a = null;
        if (eVar2 != null) {
            eVar2.f42825a = eVar3;
        }
        if (eVar3 != null) {
            if (eVar3.f42826b == eVar) {
                eVar3.f42826b = eVar2;
                return;
            } else {
                eVar3.f42827c = eVar2;
                return;
            }
        }
        this.f42813b = eVar2;
    }

    private void k(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f42826b;
        e<K, V> eVar3 = eVar.f42827c;
        e<K, V> eVar4 = eVar3.f42826b;
        e<K, V> eVar5 = eVar3.f42827c;
        eVar.f42827c = eVar4;
        if (eVar4 != null) {
            eVar4.f42825a = eVar;
        }
        j(eVar, eVar3);
        eVar3.f42826b = eVar;
        eVar.f42825a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f42832h : 0, eVar4 != null ? eVar4.f42832h : 0) + 1;
        eVar.f42832h = max;
        eVar3.f42832h = Math.max(max, eVar5 != null ? eVar5.f42832h : 0) + 1;
    }

    private void l(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f42826b;
        e<K, V> eVar3 = eVar.f42827c;
        e<K, V> eVar4 = eVar2.f42826b;
        e<K, V> eVar5 = eVar2.f42827c;
        eVar.f42826b = eVar5;
        if (eVar5 != null) {
            eVar5.f42825a = eVar;
        }
        j(eVar, eVar2);
        eVar2.f42827c = eVar;
        eVar.f42825a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f42832h : 0, eVar5 != null ? eVar5.f42832h : 0) + 1;
        eVar.f42832h = max;
        eVar2.f42832h = Math.max(max, eVar4 != null ? eVar4.f42832h : 0) + 1;
    }

    e<K, V> b(K k11, boolean z11) {
        int i11;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f42812a;
        e<K, V> eVar2 = this.f42813b;
        if (eVar2 != null) {
            Comparable comparable = comparator == f42811h ? (Comparable) k11 : null;
            while (true) {
                if (comparable != null) {
                    i11 = comparable.compareTo(eVar2.f42830f);
                } else {
                    i11 = comparator.compare(k11, (K) eVar2.f42830f);
                }
                if (i11 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i11 < 0 ? eVar2.f42826b : eVar2.f42827c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i11 = 0;
        }
        if (z11) {
            e<K, V> eVar4 = this.f42816e;
            if (eVar2 == null) {
                if (comparator == f42811h && !(k11 instanceof Comparable)) {
                    throw new ClassCastException(k11.getClass().getName() + " is not Comparable");
                }
                eVar = new e<>(eVar2, k11, eVar4, eVar4.f42829e);
                this.f42813b = eVar;
            } else {
                eVar = new e<>(eVar2, k11, eVar4, eVar4.f42829e);
                if (i11 < 0) {
                    eVar2.f42826b = eVar;
                } else {
                    eVar2.f42827c = eVar;
                }
                f(eVar2, true);
            }
            this.f42814c++;
            this.f42815d++;
            return eVar;
        }
        return null;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> e11 = e(entry.getKey());
        if (e11 != null && a(e11.f42831g, entry.getValue())) {
            return e11;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f42813b = null;
        this.f42814c = 0;
        this.f42815d++;
        e<K, V> eVar = this.f42816e;
        eVar.f42829e = eVar;
        eVar.f42828d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return e(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> e(Object obj) {
        if (obj != 0) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.b bVar = this.f42817f;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.f42817f = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> e11 = e(obj);
        if (e11 != null) {
            return e11.f42831g;
        }
        return null;
    }

    void h(e<K, V> eVar, boolean z11) {
        int i11;
        if (z11) {
            e<K, V> eVar2 = eVar.f42829e;
            eVar2.f42828d = eVar.f42828d;
            eVar.f42828d.f42829e = eVar2;
        }
        e<K, V> eVar3 = eVar.f42826b;
        e<K, V> eVar4 = eVar.f42827c;
        e<K, V> eVar5 = eVar.f42825a;
        int i12 = 0;
        if (eVar3 != null && eVar4 != null) {
            e<K, V> b11 = eVar3.f42832h > eVar4.f42832h ? eVar3.b() : eVar4.a();
            h(b11, false);
            e<K, V> eVar6 = eVar.f42826b;
            if (eVar6 != null) {
                i11 = eVar6.f42832h;
                b11.f42826b = eVar6;
                eVar6.f42825a = b11;
                eVar.f42826b = null;
            } else {
                i11 = 0;
            }
            e<K, V> eVar7 = eVar.f42827c;
            if (eVar7 != null) {
                i12 = eVar7.f42832h;
                b11.f42827c = eVar7;
                eVar7.f42825a = b11;
                eVar.f42827c = null;
            }
            b11.f42832h = Math.max(i11, i12) + 1;
            j(eVar, b11);
            return;
        }
        if (eVar3 != null) {
            j(eVar, eVar3);
            eVar.f42826b = null;
        } else if (eVar4 != null) {
            j(eVar, eVar4);
            eVar.f42827c = null;
        } else {
            j(eVar, null);
        }
        f(eVar5, false);
        this.f42814c--;
        this.f42815d++;
    }

    e<K, V> i(Object obj) {
        e<K, V> e11 = e(obj);
        if (e11 != null) {
            h(e11, true);
        }
        return e11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        h<K, V>.c cVar = this.f42818g;
        if (cVar != null) {
            return cVar;
        }
        h<K, V>.c cVar2 = new c();
        this.f42818g = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k11, V v11) {
        Objects.requireNonNull(k11, "key == null");
        e<K, V> b11 = b(k11, true);
        V v12 = b11.f42831g;
        b11.f42831g = v11;
        return v12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> i11 = i(obj);
        if (i11 != null) {
            return i11.f42831g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f42814c;
    }

    public h(Comparator<? super K> comparator) {
        this.f42814c = 0;
        this.f42815d = 0;
        this.f42816e = new e<>();
        this.f42812a = comparator == null ? f42811h : comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        e<K, V> f42825a;

        /* renamed from: b  reason: collision with root package name */
        e<K, V> f42826b;

        /* renamed from: c  reason: collision with root package name */
        e<K, V> f42827c;

        /* renamed from: d  reason: collision with root package name */
        e<K, V> f42828d;

        /* renamed from: e  reason: collision with root package name */
        e<K, V> f42829e;

        /* renamed from: f  reason: collision with root package name */
        final K f42830f;

        /* renamed from: g  reason: collision with root package name */
        V f42831g;

        /* renamed from: h  reason: collision with root package name */
        int f42832h;

        e() {
            this.f42830f = null;
            this.f42829e = this;
            this.f42828d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f42826b; eVar2 != null; eVar2 = eVar2.f42826b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f42827c; eVar2 != null; eVar2 = eVar2.f42827c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k11 = this.f42830f;
                if (k11 == null) {
                    if (entry.getKey() != null) {
                        return false;
                    }
                } else if (!k11.equals(entry.getKey())) {
                    return false;
                }
                V v11 = this.f42831g;
                if (v11 == null) {
                    if (entry.getValue() != null) {
                        return false;
                    }
                } else if (!v11.equals(entry.getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f42830f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f42831g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k11 = this.f42830f;
            int hashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f42831g;
            return hashCode ^ (v11 != null ? v11.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            V v12 = this.f42831g;
            this.f42831g = v11;
            return v12;
        }

        public String toString() {
            return this.f42830f + "=" + this.f42831g;
        }

        e(e<K, V> eVar, K k11, e<K, V> eVar2, e<K, V> eVar3) {
            this.f42825a = eVar;
            this.f42830f = k11;
            this.f42832h = 1;
            this.f42828d = eVar2;
            this.f42829e = eVar3;
            eVar3.f42828d = this;
            eVar2.f42829e = this;
        }
    }
}