package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: h  reason: collision with root package name */
    f<K, V> f2709h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.collection.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0047a extends f<K, V> {
        C0047a() {
        }

        @Override // androidx.collection.f
        protected void a() {
            a.this.clear();
        }

        @Override // androidx.collection.f
        protected Object b(int i11, int i12) {
            return a.this.f2750b[(i11 << 1) + i12];
        }

        @Override // androidx.collection.f
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // androidx.collection.f
        protected int d() {
            return a.this.f2751c;
        }

        @Override // androidx.collection.f
        protected int e(Object obj) {
            return a.this.h(obj);
        }

        @Override // androidx.collection.f
        protected int f(Object obj) {
            return a.this.j(obj);
        }

        @Override // androidx.collection.f
        protected void g(K k11, V v11) {
            a.this.put(k11, v11);
        }

        @Override // androidx.collection.f
        protected void h(int i11) {
            a.this.m(i11);
        }

        @Override // androidx.collection.f
        protected V i(int i11, V v11) {
            return a.this.n(i11, v11);
        }
    }

    public a() {
    }

    private f<K, V> p() {
        if (this.f2709h == null) {
            this.f2709h = new C0047a();
        }
        return this.f2709h;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return p().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return p().m();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f2751c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean q(Collection<?> collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return p().n();
    }

    public a(int i11) {
        super(i11);
    }

    public a(g gVar) {
        super(gVar);
    }
}