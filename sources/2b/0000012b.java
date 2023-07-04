package am;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class b0<E> implements List<E>, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private final List<E> f710a;

    private b0(List<E> list) {
        this.f710a = Collections.unmodifiableList(list);
    }

    public static <E> b0<E> b(List<E> list) {
        return new b0<>(list);
    }

    public static <E> b0<E> c(E... eArr) {
        return new b0<>(Arrays.asList(eArr));
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e11) {
        return this.f710a.add(e11);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f710a.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f710a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f710a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f710a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f710a.equals(obj);
    }

    @Override // java.util.List
    public E get(int i11) {
        return this.f710a.get(i11);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f710a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f710a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f710a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f710a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f710a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f710a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f710a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f710a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f710a.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i11, E e11) {
        return this.f710a.set(i11, e11);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f710a.size();
    }

    @Override // java.util.List
    public List<E> subList(int i11, int i12) {
        return this.f710a.subList(i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f710a.toArray();
    }

    @Override // java.util.List
    public void add(int i11, E e11) {
        this.f710a.add(i11, e11);
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection<? extends E> collection) {
        return this.f710a.addAll(i11, collection);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i11) {
        return this.f710a.listIterator(i11);
    }

    @Override // java.util.List
    public E remove(int i11) {
        return this.f710a.remove(i11);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f710a.toArray(tArr);
    }
}