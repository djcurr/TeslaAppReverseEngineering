package io.realm;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public class s0<E> implements Set<E>, RealmCollection<E> {

    /* renamed from: a  reason: collision with root package name */
    protected final b<E> f31983a = new c();

    /* loaded from: classes5.dex */
    private static abstract class b<E> implements Set<E>, RealmCollection<E> {
        private b() {
        }
    }

    /* loaded from: classes5.dex */
    private static class c<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        private final Set<E> f31984a;

        c() {
            super();
            this.f31984a = new HashSet();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E e11) {
            return this.f31984a.add(e11);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            return this.f31984a.addAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.f31984a.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return this.f31984a.contains(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return this.f31984a.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f31984a.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return this.f31984a.iterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return this.f31984a.remove(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return this.f31984a.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return this.f31984a.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.f31984a.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return this.f31984a.toArray();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.f31984a.toArray(tArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(E e11) {
        return this.f31983a.add(e11);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f31983a.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f31983a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f31983a.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f31983a.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f31983a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f31983a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f31983a.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f31983a.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f31983a.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f31983a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f31983a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f31983a.toArray(tArr);
    }
}