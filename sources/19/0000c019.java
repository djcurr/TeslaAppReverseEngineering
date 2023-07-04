package xz;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class h<E> extends wz.h<E> implements Set<E> {

    /* renamed from: a  reason: collision with root package name */
    private final d<E, ?> f57793a;

    public h(d<E, ?> backing) {
        s.g(backing, "backing");
        this.f57793a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e11) {
        return this.f57793a.i(e11) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> elements) {
        s.g(elements, "elements");
        this.f57793a.m();
        return super.addAll(elements);
    }

    @Override // wz.h
    public int b() {
        return this.f57793a.size();
    }

    public final Set<E> c() {
        this.f57793a.k();
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f57793a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f57793a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f57793a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.f57793a.D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f57793a.L(obj) >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        this.f57793a.m();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        this.f57793a.m();
        return super.retainAll(elements);
    }

    public h() {
        this(new d());
    }
}