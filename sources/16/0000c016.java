package xz;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final d<K, V> f57790a;

    public e(d<K, V> backing) {
        s.g(backing, "backing");
        this.f57790a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Map.Entry<K, V>> elements) {
        s.g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // wz.h
    public int b() {
        return this.f57790a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f57790a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        return this.f57790a.o(elements);
    }

    @Override // xz.a
    public boolean e(Map.Entry<? extends K, ? extends V> element) {
        s.g(element, "element");
        return this.f57790a.p(element);
    }

    @Override // xz.a
    public boolean f(Map.Entry element) {
        s.g(element, "element");
        return this.f57790a.I(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: h */
    public boolean add(Map.Entry<K, V> element) {
        s.g(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f57790a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f57790a.t();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        this.f57790a.m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        this.f57790a.m();
        return super.retainAll(elements);
    }
}