package o;

import java.util.HashMap;
import java.util.Map;
import o.b;

/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: e  reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f41998e = new HashMap<>();

    @Override // o.b
    protected b.c<K, V> c(K k11) {
        return this.f41998e.get(k11);
    }

    public boolean contains(K k11) {
        return this.f41998e.containsKey(k11);
    }

    @Override // o.b
    public V h(K k11, V v11) {
        b.c<K, V> c11 = c(k11);
        if (c11 != null) {
            return c11.f42004b;
        }
        this.f41998e.put(k11, f(k11, v11));
        return null;
    }

    @Override // o.b
    public V i(K k11) {
        V v11 = (V) super.i(k11);
        this.f41998e.remove(k11);
        return v11;
    }

    public Map.Entry<K, V> j(K k11) {
        if (contains(k11)) {
            return this.f41998e.get(k11).f42006d;
        }
        return null;
    }
}