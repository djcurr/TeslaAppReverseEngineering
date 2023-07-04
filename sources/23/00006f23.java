package g1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class n<K, V> extends wz.i<Map.Entry<? extends K, ? extends V>> implements e1.d<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: b  reason: collision with root package name */
    private final d<K, V> f27334b;

    public n(d<K, V> map) {
        kotlin.jvm.internal.s.g(map, "map");
        this.f27334b = map;
    }

    @Override // wz.a
    public int b() {
        return this.f27334b.size();
    }

    public boolean c(Map.Entry<? extends K, ? extends V> element) {
        kotlin.jvm.internal.s.g(element, "element");
        V v11 = this.f27334b.get(element.getKey());
        Boolean valueOf = v11 == null ? null : Boolean.valueOf(kotlin.jvm.internal.s.c(v11, element.getValue()));
        if (valueOf == null) {
            return element.getValue() == null && this.f27334b.containsKey(element.getKey());
        }
        return valueOf.booleanValue();
    }

    @Override // wz.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return c((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new o(this.f27334b.p());
    }
}