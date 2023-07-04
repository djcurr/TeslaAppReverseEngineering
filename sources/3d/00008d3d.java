package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    c<K, V> f41999a;

    /* renamed from: b  reason: collision with root package name */
    private c<K, V> f42000b;

    /* renamed from: c  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f42001c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private int f42002d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // o.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f42006d;
        }

        @Override // o.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f42005c;
        }
    }

    /* renamed from: o.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0821b<K, V> extends e<K, V> {
        C0821b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // o.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f42005c;
        }

        @Override // o.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f42006d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f42003a;

        /* renamed from: b  reason: collision with root package name */
        final V f42004b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f42005c;

        /* renamed from: d  reason: collision with root package name */
        c<K, V> f42006d;

        c(K k11, V v11) {
            this.f42003a = k11;
            this.f42004b = v11;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f42003a.equals(cVar.f42003a) && this.f42004b.equals(cVar.f42004b);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f42003a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f42004b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f42003a.hashCode() ^ this.f42004b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f42003a + "=" + this.f42004b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private c<K, V> f42007a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f42008b = true;

        d() {
        }

        @Override // o.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f42007a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f42006d;
                this.f42007a = cVar3;
                this.f42008b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (this.f42008b) {
                this.f42008b = false;
                this.f42007a = b.this.f41999a;
            } else {
                c<K, V> cVar = this.f42007a;
                this.f42007a = cVar != null ? cVar.f42005c : null;
            }
            return this.f42007a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f42008b) {
                return b.this.f41999a != null;
            }
            c<K, V> cVar = this.f42007a;
            return (cVar == null || cVar.f42005c == null) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        c<K, V> f42010a;

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f42011b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f42010a = cVar2;
            this.f42011b = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f42011b;
            c<K, V> cVar2 = this.f42010a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // o.b.f
        public void a(c<K, V> cVar) {
            if (this.f42010a == cVar && cVar == this.f42011b) {
                this.f42011b = null;
                this.f42010a = null;
            }
            c<K, V> cVar2 = this.f42010a;
            if (cVar2 == cVar) {
                this.f42010a = b(cVar2);
            }
            if (this.f42011b == cVar) {
                this.f42011b = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f42011b;
            this.f42011b = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f42011b != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> b() {
        return this.f41999a;
    }

    protected c<K, V> c(K k11) {
        c<K, V> cVar = this.f41999a;
        while (cVar != null && !cVar.f42003a.equals(k11)) {
            cVar = cVar.f42005c;
        }
        return cVar;
    }

    public b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.f42001c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0821b c0821b = new C0821b(this.f42000b, this.f41999a);
        this.f42001c.put(c0821b, Boolean.FALSE);
        return c0821b;
    }

    public Map.Entry<K, V> e() {
        return this.f42000b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (size() != bVar.size()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> it2 = iterator();
            Iterator<Map.Entry<K, V>> it3 = bVar.iterator();
            while (it2.hasNext() && it3.hasNext()) {
                Map.Entry<K, V> next = it2.next();
                Map.Entry<K, V> next2 = it3.next();
                if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                    return false;
                }
            }
            return (it2.hasNext() || it3.hasNext()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c<K, V> f(K k11, V v11) {
        c<K, V> cVar = new c<>(k11, v11);
        this.f42002d++;
        c<K, V> cVar2 = this.f42000b;
        if (cVar2 == null) {
            this.f41999a = cVar;
            this.f42000b = cVar;
            return cVar;
        }
        cVar2.f42005c = cVar;
        cVar.f42006d = cVar2;
        this.f42000b = cVar;
        return cVar;
    }

    public V h(K k11, V v11) {
        c<K, V> c11 = c(k11);
        if (c11 != null) {
            return c11.f42004b;
        }
        f(k11, v11);
        return null;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it2 = iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            i11 += it2.next().hashCode();
        }
        return i11;
    }

    public V i(K k11) {
        c<K, V> c11 = c(k11);
        if (c11 == null) {
            return null;
        }
        this.f42002d--;
        if (!this.f42001c.isEmpty()) {
            for (f<K, V> fVar : this.f42001c.keySet()) {
                fVar.a(c11);
            }
        }
        c<K, V> cVar = c11.f42006d;
        if (cVar != null) {
            cVar.f42005c = c11.f42005c;
        } else {
            this.f41999a = c11.f42005c;
        }
        c<K, V> cVar2 = c11.f42005c;
        if (cVar2 != null) {
            cVar2.f42006d = cVar;
        } else {
            this.f42000b = cVar;
        }
        c11.f42005c = null;
        c11.f42006d = null;
        return c11.f42004b;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f41999a, this.f42000b);
        this.f42001c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f42002d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<Map.Entry<K, V>> it2 = iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next().toString());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}