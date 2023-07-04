package g1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class h<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final f<K, V> f27330a;

    public h(f<K, V> builder) {
        kotlin.jvm.internal.s.g(builder, "builder");
        this.f27330a = builder;
    }

    @Override // wz.h
    public int b() {
        return this.f27330a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f27330a.clear();
    }

    @Override // g1.a
    public boolean e(Map.Entry<? extends K, ? extends V> element) {
        kotlin.jvm.internal.s.g(element, "element");
        V v11 = this.f27330a.get(element.getKey());
        Boolean valueOf = v11 == null ? null : Boolean.valueOf(kotlin.jvm.internal.s.c(v11, element.getValue()));
        if (valueOf == null) {
            return element.getValue() == null && this.f27330a.containsKey(element.getKey());
        }
        return valueOf.booleanValue();
    }

    @Override // g1.a
    public boolean h(Map.Entry<? extends K, ? extends V> element) {
        kotlin.jvm.internal.s.g(element, "element");
        return this.f27330a.remove(element.getKey(), element.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: i */
    public boolean add(Map.Entry<K, V> element) {
        kotlin.jvm.internal.s.g(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new i(this.f27330a);
    }
}