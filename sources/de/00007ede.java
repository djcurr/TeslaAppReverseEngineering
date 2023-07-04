package kotlin.reflect.jvm.internal.impl.protobuf;

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
import kotlin.reflect.jvm.internal.impl.protobuf.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class t<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f35055a;

    /* renamed from: b  reason: collision with root package name */
    private List<t<K, V>.c> f35056b;

    /* renamed from: c  reason: collision with root package name */
    private Map<K, V> f35057c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f35058d;

    /* renamed from: e  reason: collision with root package name */
    private volatile t<K, V>.e f35059e;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* loaded from: classes5.dex */
    static class a<FieldDescriptorType> extends t<FieldDescriptorType, Object> {
        a(int i11) {
            super(i11, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.t
        public void o() {
            if (!n()) {
                for (int i11 = 0; i11 < k(); i11++) {
                    Map.Entry<FieldDescriptorType, Object> j11 = j(i11);
                    if (((g.b) j11.getKey()).isRepeated()) {
                        j11.setValue(Collections.unmodifiableList((List) j11.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : l()) {
                    if (((g.b) entry.getKey()).isRepeated()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.o();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.q((g.b) obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final Iterator<Object> f35060a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f35061b = new C0653b();

        /* loaded from: classes5.dex */
        static class a implements Iterator<Object> {
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

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static class C0653b implements Iterable<Object> {
            C0653b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f35060a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f35061b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class c implements Comparable<t<K, V>.c>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final K f35062a;

        /* renamed from: b  reason: collision with root package name */
        private V f35063b;

        c(t tVar, Map.Entry<K, V> entry) {
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
        public int compareTo(t<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* renamed from: c */
        public K getKey() {
            return this.f35062a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return b(this.f35062a, entry.getKey()) && b(this.f35063b, entry.getValue());
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f35063b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k11 = this.f35062a;
            int hashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f35063b;
            return hashCode ^ (v11 != null ? v11.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            t.this.h();
            V v12 = this.f35063b;
            this.f35063b = v11;
            return v12;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f35062a);
            String valueOf2 = String.valueOf(this.f35063b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append("=");
            sb2.append(valueOf2);
            return sb2.toString();
        }

        c(K k11, V v11) {
            this.f35062a = k11;
            this.f35063b = v11;
        }
    }

    /* loaded from: classes5.dex */
    private class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: b */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            t.this.q(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            t.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = t.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(t.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                t.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return t.this.size();
        }

        /* synthetic */ e(t tVar, a aVar) {
            this();
        }
    }

    /* synthetic */ t(int i11, a aVar) {
        this(i11);
    }

    private int f(K k11) {
        int size = this.f35056b.size() - 1;
        if (size >= 0) {
            int compareTo = k11.compareTo(this.f35056b.get(size).getKey());
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
            int compareTo2 = k11.compareTo(this.f35056b.get(i12).getKey());
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
    public void h() {
        if (this.f35058d) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        h();
        if (!this.f35056b.isEmpty() || (this.f35056b instanceof ArrayList)) {
            return;
        }
        this.f35056b = new ArrayList(this.f35055a);
    }

    private SortedMap<K, V> m() {
        h();
        if (this.f35057c.isEmpty() && !(this.f35057c instanceof TreeMap)) {
            this.f35057c = new TreeMap();
        }
        return (SortedMap) this.f35057c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends g.b<FieldDescriptorType>> t<FieldDescriptorType, Object> p(int i11) {
        return new a(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V r(int i11) {
        h();
        V value = this.f35056b.remove(i11).getValue();
        if (!this.f35057c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it2 = m().entrySet().iterator();
            this.f35056b.add(new c(this, it2.next()));
            it2.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f35056b.isEmpty()) {
            this.f35056b.clear();
        }
        if (this.f35057c.isEmpty()) {
            return;
        }
        this.f35057c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f35057c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f35059e == null) {
            this.f35059e = new e(this, null);
        }
        return this.f35059e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f11 = f(comparable);
        if (f11 >= 0) {
            return this.f35056b.get(f11).getValue();
        }
        return this.f35057c.get(comparable);
    }

    public Map.Entry<K, V> j(int i11) {
        return this.f35056b.get(i11);
    }

    public int k() {
        return this.f35056b.size();
    }

    public Iterable<Map.Entry<K, V>> l() {
        return this.f35057c.isEmpty() ? b.b() : this.f35057c.entrySet();
    }

    public boolean n() {
        return this.f35058d;
    }

    public void o() {
        if (this.f35058d) {
            return;
        }
        this.f35057c = this.f35057c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f35057c);
        this.f35058d = true;
    }

    public V q(K k11, V v11) {
        h();
        int f11 = f(k11);
        if (f11 >= 0) {
            return this.f35056b.get(f11).setValue(v11);
        }
        i();
        int i11 = -(f11 + 1);
        if (i11 >= this.f35055a) {
            return m().put(k11, v11);
        }
        int size = this.f35056b.size();
        int i12 = this.f35055a;
        if (size == i12) {
            t<K, V>.c remove = this.f35056b.remove(i12 - 1);
            m().put((K) remove.getKey(), remove.getValue());
        }
        this.f35056b.add(i11, new c(k11, v11));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int f11 = f(comparable);
        if (f11 >= 0) {
            return (V) r(f11);
        }
        if (this.f35057c.isEmpty()) {
            return null;
        }
        return this.f35057c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f35056b.size() + this.f35057c.size();
    }

    /* loaded from: classes5.dex */
    private class d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private int f35065a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f35066b;

        /* renamed from: c  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f35067c;

        private d() {
            this.f35065a = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f35067c == null) {
                this.f35067c = t.this.f35057c.entrySet().iterator();
            }
            return this.f35067c;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f35066b = true;
            int i11 = this.f35065a + 1;
            this.f35065a = i11;
            if (i11 < t.this.f35056b.size()) {
                return (Map.Entry) t.this.f35056b.get(this.f35065a);
            }
            return a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f35065a + 1 < t.this.f35056b.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f35066b) {
                this.f35066b = false;
                t.this.h();
                if (this.f35065a < t.this.f35056b.size()) {
                    t tVar = t.this;
                    int i11 = this.f35065a;
                    this.f35065a = i11 - 1;
                    tVar.r(i11);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ d(t tVar, a aVar) {
            this();
        }
    }

    private t(int i11) {
        this.f35055a = i11;
        this.f35056b = Collections.emptyList();
        this.f35057c = Collections.emptyMap();
    }
}