package xz;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f<E> extends wz.h<E> {

    /* renamed from: a  reason: collision with root package name */
    private final d<E, ?> f57791a;

    public f(d<E, ?> backing) {
        s.g(backing, "backing");
        this.f57791a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        s.g(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // wz.h
    public int b() {
        return this.f57791a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f57791a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f57791a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f57791a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f57791a.D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f57791a.L(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        this.f57791a.m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        this.f57791a.m();
        return super.retainAll(elements);
    }
}