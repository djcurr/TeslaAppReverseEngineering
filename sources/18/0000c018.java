package xz;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class g<V> extends wz.e<V> {

    /* renamed from: a  reason: collision with root package name */
    private final d<?, V> f57792a;

    public g(d<?, V> backing) {
        s.g(backing, "backing");
        this.f57792a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection<? extends V> elements) {
        s.g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // wz.e
    public int b() {
        return this.f57792a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f57792a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f57792a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f57792a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.f57792a.O();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f57792a.N(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        this.f57792a.m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        this.f57792a.m();
        return super.retainAll(elements);
    }
}