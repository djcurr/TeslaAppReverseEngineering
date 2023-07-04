package g1;

import e1.f;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class f<K, V> extends wz.g<K, V> implements f.a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private d<K, V> f27320a;

    /* renamed from: b  reason: collision with root package name */
    private i1.e f27321b;

    /* renamed from: c  reason: collision with root package name */
    private t<K, V> f27322c;

    /* renamed from: d  reason: collision with root package name */
    private V f27323d;

    /* renamed from: e  reason: collision with root package name */
    private int f27324e;

    /* renamed from: f  reason: collision with root package name */
    private int f27325f;

    public f(d<K, V> map) {
        kotlin.jvm.internal.s.g(map, "map");
        this.f27320a = map;
        this.f27321b = new i1.e();
        this.f27322c = this.f27320a.p();
        this.f27325f = this.f27320a.size();
    }

    @Override // wz.g
    public Set<Map.Entry<K, V>> a() {
        return new h(this);
    }

    @Override // wz.g
    public Set<K> b() {
        return new j(this);
    }

    @Override // wz.g
    public int c() {
        return this.f27325f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f27322c = t.f27337e.a();
        n(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f27322c.k(obj == null ? 0 : obj.hashCode(), obj, 0);
    }

    @Override // wz.g
    public Collection<V> e() {
        return new l(this);
    }

    @Override // e1.f.a
    /* renamed from: f */
    public d<K, V> build() {
        d<K, V> dVar;
        if (this.f27322c == this.f27320a.p()) {
            dVar = this.f27320a;
        } else {
            this.f27321b = new i1.e();
            dVar = new d<>(this.f27322c, size());
        }
        this.f27320a = dVar;
        return dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return this.f27322c.o(obj == null ? 0 : obj.hashCode(), obj, 0);
    }

    public final int h() {
        return this.f27324e;
    }

    public final t<K, V> i() {
        return this.f27322c;
    }

    public final i1.e j() {
        return this.f27321b;
    }

    public final void k(int i11) {
        this.f27324e = i11;
    }

    public final void m(V v11) {
        this.f27323d = v11;
    }

    public void n(int i11) {
        this.f27325f = i11;
        this.f27324e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k11, V v11) {
        this.f27323d = null;
        this.f27322c = this.f27322c.D(k11 == null ? 0 : k11.hashCode(), k11, v11, 0, this);
        return this.f27323d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        kotlin.jvm.internal.s.g(from, "from");
        d<K, V> dVar = from instanceof d ? (d) from : null;
        if (dVar == null) {
            f fVar = from instanceof f ? (f) from : null;
            dVar = fVar == null ? null : fVar.build();
        }
        if (dVar != null) {
            i1.b bVar = new i1.b(0, 1, null);
            int size = size();
            this.f27322c = this.f27322c.E(dVar.p(), 0, bVar, this);
            int size2 = (dVar.size() + size) - bVar.a();
            if (size != size2) {
                n(size2);
                return;
            }
            return;
        }
        super.putAll(from);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        this.f27323d = null;
        t G = this.f27322c.G(obj == null ? 0 : obj.hashCode(), obj, 0, this);
        if (G == null) {
            G = t.f27337e.a();
        }
        this.f27322c = G;
        return this.f27323d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        t H = this.f27322c.H(obj == null ? 0 : obj.hashCode(), obj, obj2, 0, this);
        if (H == null) {
            H = t.f27337e.a();
        }
        this.f27322c = H;
        return size != size();
    }
}