package g1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l<K, V> extends wz.e<V> {

    /* renamed from: a  reason: collision with root package name */
    private final f<K, V> f27333a;

    public l(f<K, V> builder) {
        kotlin.jvm.internal.s.g(builder, "builder");
        this.f27333a = builder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v11) {
        throw new UnsupportedOperationException();
    }

    @Override // wz.e
    public int b() {
        return this.f27333a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f27333a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f27333a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new m(this.f27333a);
    }
}