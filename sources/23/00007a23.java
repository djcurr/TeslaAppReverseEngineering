package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes5.dex */
class z3<E> implements Collection<E>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final Collection<E> f32736a;

    /* renamed from: b  reason: collision with root package name */
    final Object f32737b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z3(Collection<E> collection) {
        Objects.requireNonNull(collection, "Collection must not be null.");
        this.f32736a = collection;
        this.f32737b = this;
    }

    @Override // java.util.Collection
    public boolean add(E e11) {
        boolean add;
        synchronized (this.f32737b) {
            add = b().add(e11);
        }
        return add;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean addAll;
        synchronized (this.f32737b) {
            addAll = b().addAll(collection);
        }
        return addAll;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Collection<E> b() {
        return this.f32736a;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f32737b) {
            b().clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f32737b) {
            contains = b().contains(obj);
        }
        return contains;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        boolean containsAll;
        synchronized (this.f32737b) {
            containsAll = b().containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f32737b) {
            isEmpty = b().isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return b().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f32737b) {
            remove = b().remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean removeAll;
        synchronized (this.f32737b) {
            removeAll = b().removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll;
        synchronized (this.f32737b) {
            retainAll = b().retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f32737b) {
            size = b().size();
        }
        return size;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f32737b) {
            array = b().toArray();
        }
        return array;
    }

    public String toString() {
        String obj;
        synchronized (this.f32737b) {
            obj = b().toString();
        }
        return obj;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.f32737b) {
            tArr2 = (T[]) b().toArray(tArr);
        }
        return tArr2;
    }
}