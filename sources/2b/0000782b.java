package io.realm;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public class i0<E> extends AbstractList<E> implements OrderedRealmCollection<E> {

    /* renamed from: a  reason: collision with root package name */
    protected Class<E> f31817a;

    /* renamed from: b  reason: collision with root package name */
    protected String f31818b;

    /* renamed from: c  reason: collision with root package name */
    public final io.realm.a f31819c = null;

    /* renamed from: d  reason: collision with root package name */
    private List<E> f31820d = new ArrayList();

    /* loaded from: classes5.dex */
    private class b implements Iterator<E> {

        /* renamed from: a  reason: collision with root package name */
        int f31821a;

        /* renamed from: b  reason: collision with root package name */
        int f31822b;

        /* renamed from: c  reason: collision with root package name */
        int f31823c;

        private b() {
            this.f31821a = 0;
            this.f31822b = -1;
            this.f31823c = ((AbstractList) i0.this).modCount;
        }

        final void a() {
            if (((AbstractList) i0.this).modCount != this.f31823c) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            i0.this.i();
            a();
            return this.f31821a != i0.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            i0.this.i();
            a();
            int i11 = this.f31821a;
            try {
                E e11 = (E) i0.this.get(i11);
                this.f31822b = i11;
                this.f31821a = i11 + 1;
                return e11;
            } catch (IndexOutOfBoundsException unused) {
                a();
                throw new NoSuchElementException("Cannot access index " + i11 + " when size is " + i0.this.size() + ". Remember to check hasNext() before using next().");
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            i0.this.i();
            if (this.f31822b >= 0) {
                a();
                try {
                    i0.this.remove(this.f31822b);
                    int i11 = this.f31822b;
                    int i12 = this.f31821a;
                    if (i11 < i12) {
                        this.f31821a = i12 - 1;
                    }
                    this.f31822b = -1;
                    this.f31823c = ((AbstractList) i0.this).modCount;
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            }
            throw new IllegalStateException("Cannot call remove() twice. Must call next() in between.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class c extends i0<E>.b implements ListIterator<E> {
        c(int i11) {
            super();
            if (i11 >= 0 && i11 <= i0.this.size()) {
                this.f31821a = i11;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Starting location must be a valid index: [0, ");
            sb2.append(i0.this.size() - 1);
            sb2.append("]. Index was ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }

        @Override // java.util.ListIterator
        public void add(E e11) {
            i0.this.f31819c.g();
            a();
            try {
                int i11 = this.f31821a;
                i0.this.add(i11, e11);
                this.f31822b = -1;
                this.f31821a = i11 + 1;
                this.f31823c = ((AbstractList) i0.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f31821a != 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f31821a;
        }

        @Override // java.util.ListIterator
        public E previous() {
            a();
            int i11 = this.f31821a - 1;
            try {
                E e11 = (E) i0.this.get(i11);
                this.f31821a = i11;
                this.f31822b = i11;
                return e11;
            } catch (IndexOutOfBoundsException unused) {
                a();
                throw new NoSuchElementException("Cannot access index less than zero. This was " + i11 + ". Remember to check hasPrevious() before using previous().");
            }
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f31821a - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e11) {
            i0.this.f31819c.g();
            if (this.f31822b >= 0) {
                a();
                try {
                    i0.this.set(this.f31822b, e11);
                    this.f31823c = ((AbstractList) i0.this).modCount;
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f31819c.g();
    }

    private boolean j() {
        return false;
    }

    private static boolean k(Class<?> cls) {
        return l0.class.isAssignableFrom(cls);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        if (!m()) {
            this.f31820d.add(i11, e11);
            ((AbstractList) this).modCount++;
            return;
        }
        i();
        throw null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!m()) {
            this.f31820d.clear();
            ((AbstractList) this).modCount++;
            return;
        }
        i();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (m()) {
            this.f31819c.g();
            if ((obj instanceof io.realm.internal.m) && ((io.realm.internal.m) obj).d().d() == io.realm.internal.f.INSTANCE) {
                return false;
            }
            return super.contains(obj);
        }
        return this.f31820d.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        if (!m()) {
            return this.f31820d.get(i11);
        }
        i();
        throw null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        if (m()) {
            return new b();
        }
        return super.iterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public boolean m() {
        return this.f31819c != null;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i11) {
        if (!m()) {
            E remove = this.f31820d.remove(i11);
            ((AbstractList) this).modCount++;
            return remove;
        }
        i();
        get(i11);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        if (m() && !this.f31819c.e0()) {
            throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        if (!m()) {
            return this.f31820d.set(i11, e11);
        }
        i();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (!m()) {
            return this.f31820d.size();
        }
        i();
        throw null;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        if (!m()) {
            sb2.append("RealmList<?>@[");
            int size = size();
            while (i11 < size) {
                E e11 = get(i11);
                if (e11 instanceof l0) {
                    sb2.append(System.identityHashCode(e11));
                } else if (e11 instanceof byte[]) {
                    sb2.append("byte[");
                    sb2.append(((byte[]) e11).length);
                    sb2.append("]");
                } else {
                    sb2.append(e11);
                }
                sb2.append(",");
                i11++;
            }
            if (size() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb2.append("]");
        } else {
            sb2.append("RealmList<");
            String str = this.f31818b;
            if (str != null) {
                sb2.append(str);
            } else if (k(this.f31817a)) {
                sb2.append(this.f31819c.L().g(this.f31817a).d());
            } else {
                Class<E> cls = this.f31817a;
                if (cls == byte[].class) {
                    sb2.append(cls.getSimpleName());
                } else {
                    sb2.append(cls.getName());
                }
            }
            sb2.append(">@[");
            if (!j()) {
                sb2.append("invalid");
            } else if (k(this.f31817a)) {
                while (i11 < size()) {
                    sb2.append(((io.realm.internal.m) get(i11)).d().d().getObjectKey());
                    sb2.append(",");
                    i11++;
                }
                if (size() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
            } else {
                while (i11 < size()) {
                    E e12 = get(i11);
                    if (e12 instanceof byte[]) {
                        sb2.append("byte[");
                        sb2.append(((byte[]) e12).length);
                        sb2.append("]");
                    } else {
                        sb2.append(e12);
                    }
                    sb2.append(",");
                    i11++;
                }
                if (size() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
            }
            sb2.append("]");
        }
        return sb2.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i11) {
        if (m()) {
            return new c(i11);
        }
        return super.listIterator(i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        if (!m()) {
            this.f31820d.add(e11);
            ((AbstractList) this).modCount++;
            return true;
        }
        i();
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (m() && !this.f31819c.e0()) {
            throw new IllegalStateException("Objects can only be removed from inside a write transaction.");
        }
        return super.remove(obj);
    }
}