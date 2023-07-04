package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.u;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f16292a;

    /* renamed from: b  reason: collision with root package name */
    private List<i1<K, V>.e> f16293b;

    /* renamed from: c  reason: collision with root package name */
    private Map<K, V> f16294c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16295d;

    /* renamed from: e  reason: collision with root package name */
    private volatile i1<K, V>.g f16296e;

    /* renamed from: f  reason: collision with root package name */
    private Map<K, V> f16297f;

    /* renamed from: g  reason: collision with root package name */
    private volatile i1<K, V>.c f16298g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* loaded from: classes3.dex */
    public class a<FieldDescriptorType> extends i1<FieldDescriptorType, Object> {
        a(int i11) {
            super(i11, null);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i1
        public void r() {
            if (!q()) {
                for (int i11 = 0; i11 < m(); i11++) {
                    Map.Entry<FieldDescriptorType, Object> l11 = l(i11);
                    if (((u.b) l11.getKey()).isRepeated()) {
                        l11.setValue(Collections.unmodifiableList((List) l11.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : o()) {
                    if (((u.b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.r();
        }
    }

    /* loaded from: classes3.dex */
    private class c extends i1<K, V>.g {
        private c() {
            super(i1.this, null);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(i1.this, null);
        }

        /* synthetic */ c(i1 i1Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private static final Iterator<Object> f16303a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f16304b = new b();

        /* loaded from: classes3.dex */
        class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* loaded from: classes3.dex */
        class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f16303a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f16304b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class e implements Map.Entry<K, V>, Comparable<i1<K, V>.e> {

        /* renamed from: a  reason: collision with root package name */
        private final K f16305a;

        /* renamed from: b  reason: collision with root package name */
        private V f16306b;

        e(i1 i1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(i1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* renamed from: c */
        public K getKey() {
            return this.f16305a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return b(this.f16305a, entry.getKey()) && b(this.f16306b, entry.getValue());
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f16306b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k11 = this.f16305a;
            int hashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f16306b;
            return hashCode ^ (v11 != null ? v11.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            i1.this.i();
            V v12 = this.f16306b;
            this.f16306b = v11;
            return v12;
        }

        public String toString() {
            return this.f16305a + "=" + this.f16306b;
        }

        e(K k11, V v11) {
            this.f16305a = k11;
            this.f16306b = v11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            i1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = i1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(i1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                i1.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i1.this.size();
        }

        /* synthetic */ g(i1 i1Var, a aVar) {
            this();
        }
    }

    /* synthetic */ i1(int i11, a aVar) {
        this(i11);
    }

    private int h(K k11) {
        int size = this.f16293b.size() - 1;
        if (size >= 0) {
            int compareTo = k11.compareTo(this.f16293b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) / 2;
            int compareTo2 = k11.compareTo(this.f16293b.get(i12).getKey());
            if (compareTo2 < 0) {
                size = i12 - 1;
            } else if (compareTo2 <= 0) {
                return i12;
            } else {
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f16295d) {
            throw new UnsupportedOperationException();
        }
    }

    private void k() {
        i();
        if (!this.f16293b.isEmpty() || (this.f16293b instanceof ArrayList)) {
            return;
        }
        this.f16293b = new ArrayList(this.f16292a);
    }

    private SortedMap<K, V> p() {
        i();
        if (this.f16294c.isEmpty() && !(this.f16294c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16294c = treeMap;
            this.f16297f = treeMap.descendingMap();
        }
        return (SortedMap) this.f16294c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends u.b<FieldDescriptorType>> i1<FieldDescriptorType, Object> s(int i11) {
        return new a(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V u(int i11) {
        i();
        V value = this.f16293b.remove(i11).getValue();
        if (!this.f16294c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it2 = p().entrySet().iterator();
            this.f16293b.add(new e(this, it2.next()));
            it2.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        if (!this.f16293b.isEmpty()) {
            this.f16293b.clear();
        }
        if (this.f16294c.isEmpty()) {
            return;
        }
        this.f16294c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.f16294c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f16296e == null) {
            this.f16296e = new g(this, null);
        }
        return this.f16296e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return super.equals(obj);
        }
        i1 i1Var = (i1) obj;
        int size = size();
        if (size != i1Var.size()) {
            return false;
        }
        int m11 = m();
        if (m11 != i1Var.m()) {
            return entrySet().equals(i1Var.entrySet());
        }
        for (int i11 = 0; i11 < m11; i11++) {
            if (!l(i11).equals(i1Var.l(i11))) {
                return false;
            }
        }
        if (m11 != size) {
            return this.f16294c.equals(i1Var.f16294c);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int h11 = h(comparable);
        if (h11 >= 0) {
            return this.f16293b.get(h11).getValue();
        }
        return this.f16294c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m11 = m();
        int i11 = 0;
        for (int i12 = 0; i12 < m11; i12++) {
            i11 += this.f16293b.get(i12).hashCode();
        }
        return n() > 0 ? i11 + this.f16294c.hashCode() : i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> j() {
        if (this.f16298g == null) {
            this.f16298g = new c(this, null);
        }
        return this.f16298g;
    }

    public Map.Entry<K, V> l(int i11) {
        return this.f16293b.get(i11);
    }

    public int m() {
        return this.f16293b.size();
    }

    public int n() {
        return this.f16294c.size();
    }

    public Iterable<Map.Entry<K, V>> o() {
        if (this.f16294c.isEmpty()) {
            return d.b();
        }
        return this.f16294c.entrySet();
    }

    public boolean q() {
        return this.f16295d;
    }

    public void r() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (this.f16295d) {
            return;
        }
        if (this.f16294c.isEmpty()) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(this.f16294c);
        }
        this.f16294c = unmodifiableMap;
        if (this.f16297f.isEmpty()) {
            unmodifiableMap2 = Collections.emptyMap();
        } else {
            unmodifiableMap2 = Collections.unmodifiableMap(this.f16297f);
        }
        this.f16297f = unmodifiableMap2;
        this.f16295d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int h11 = h(comparable);
        if (h11 >= 0) {
            return (V) u(h11);
        }
        if (this.f16294c.isEmpty()) {
            return null;
        }
        return this.f16294c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f16293b.size() + this.f16294c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: t */
    public V put(K k11, V v11) {
        i();
        int h11 = h(k11);
        if (h11 >= 0) {
            return this.f16293b.get(h11).setValue(v11);
        }
        k();
        int i11 = -(h11 + 1);
        if (i11 >= this.f16292a) {
            return p().put(k11, v11);
        }
        int size = this.f16293b.size();
        int i12 = this.f16292a;
        if (size == i12) {
            i1<K, V>.e remove = this.f16293b.remove(i12 - 1);
            p().put((K) remove.getKey(), remove.getValue());
        }
        this.f16293b.add(i11, new e(k11, v11));
        return null;
    }

    /* loaded from: classes3.dex */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f16299a;

        /* renamed from: b  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f16300b;

        private b() {
            this.f16299a = i1.this.f16293b.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f16300b == null) {
                this.f16300b = i1.this.f16297f.entrySet().iterator();
            }
            return this.f16300b;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (!a().hasNext()) {
                List list = i1.this.f16293b;
                int i11 = this.f16299a - 1;
                this.f16299a = i11;
                return (Map.Entry) list.get(i11);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i11 = this.f16299a;
            return (i11 > 0 && i11 <= i1.this.f16293b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(i1 i1Var, a aVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f16308a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f16309b;

        /* renamed from: c  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f16310c;

        private f() {
            this.f16308a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f16310c == null) {
                this.f16310c = i1.this.f16294c.entrySet().iterator();
            }
            return this.f16310c;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f16309b = true;
            int i11 = this.f16308a + 1;
            this.f16308a = i11;
            if (i11 < i1.this.f16293b.size()) {
                return (Map.Entry) i1.this.f16293b.get(this.f16308a);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16308a + 1 >= i1.this.f16293b.size()) {
                return !i1.this.f16294c.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f16309b) {
                this.f16309b = false;
                i1.this.i();
                if (this.f16308a < i1.this.f16293b.size()) {
                    i1 i1Var = i1.this;
                    int i11 = this.f16308a;
                    this.f16308a = i11 - 1;
                    i1Var.u(i11);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ f(i1 i1Var, a aVar) {
            this();
        }
    }

    private i1(int i11) {
        this.f16292a = i11;
        this.f16293b = Collections.emptyList();
        this.f16294c = Collections.emptyMap();
        this.f16297f = Collections.emptyMap();
    }
}