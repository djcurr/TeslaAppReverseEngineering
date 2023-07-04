package xz;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.s;
import wz.k;
import wz.l;

/* loaded from: classes5.dex */
public final class b<E> extends wz.f<E> implements List<E>, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private E[] f57763a;

    /* renamed from: b  reason: collision with root package name */
    private int f57764b;

    /* renamed from: c  reason: collision with root package name */
    private int f57765c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f57766d;

    /* renamed from: e  reason: collision with root package name */
    private final b<E> f57767e;

    /* renamed from: f  reason: collision with root package name */
    private final b<E> f57768f;

    /* loaded from: classes5.dex */
    private static final class a<E> implements ListIterator<E>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private final b<E> f57769a;

        /* renamed from: b  reason: collision with root package name */
        private int f57770b;

        /* renamed from: c  reason: collision with root package name */
        private int f57771c;

        public a(b<E> list, int i11) {
            s.g(list, "list");
            this.f57769a = list;
            this.f57770b = i11;
            this.f57771c = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e11) {
            b<E> bVar = this.f57769a;
            int i11 = this.f57770b;
            this.f57770b = i11 + 1;
            bVar.add(i11, e11);
            this.f57771c = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f57770b < ((b) this.f57769a).f57765c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f57770b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.f57770b < ((b) this.f57769a).f57765c) {
                int i11 = this.f57770b;
                this.f57770b = i11 + 1;
                this.f57771c = i11;
                return (E) ((b) this.f57769a).f57763a[((b) this.f57769a).f57764b + this.f57771c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f57770b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i11 = this.f57770b;
            if (i11 > 0) {
                int i12 = i11 - 1;
                this.f57770b = i12;
                this.f57771c = i12;
                return (E) ((b) this.f57769a).f57763a[((b) this.f57769a).f57764b + this.f57771c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f57770b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i11 = this.f57771c;
            if (i11 != -1) {
                this.f57769a.remove(i11);
                this.f57770b = this.f57771c;
                this.f57771c = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E e11) {
            int i11 = this.f57771c;
            if (i11 != -1) {
                this.f57769a.set(i11, e11);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    private b(E[] eArr, int i11, int i12, boolean z11, b<E> bVar, b<E> bVar2) {
        this.f57763a = eArr;
        this.f57764b = i11;
        this.f57765c = i12;
        this.f57766d = z11;
        this.f57767e = bVar;
        this.f57768f = bVar2;
    }

    private final void i(int i11, Collection<? extends E> collection, int i12) {
        b<E> bVar = this.f57767e;
        if (bVar != null) {
            bVar.i(i11, collection, i12);
            this.f57763a = this.f57767e.f57763a;
            this.f57765c += i12;
            return;
        }
        q(i11, i12);
        Iterator<? extends E> it2 = collection.iterator();
        for (int i13 = 0; i13 < i12; i13++) {
            this.f57763a[i11 + i13] = it2.next();
        }
    }

    private final void j(int i11, E e11) {
        b<E> bVar = this.f57767e;
        if (bVar != null) {
            bVar.j(i11, e11);
            this.f57763a = this.f57767e.f57763a;
            this.f57765c++;
            return;
        }
        q(i11, 1);
        this.f57763a[i11] = e11;
    }

    private final void m() {
        if (r()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean n(List<?> list) {
        boolean h11;
        h11 = c.h(this.f57763a, this.f57764b, this.f57765c, list);
        return h11;
    }

    private final void o(int i11) {
        if (this.f57767e != null) {
            throw new IllegalStateException();
        }
        if (i11 >= 0) {
            E[] eArr = this.f57763a;
            if (i11 > eArr.length) {
                this.f57763a = (E[]) c.e(this.f57763a, k.f56485d.a(eArr.length, i11));
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void p(int i11) {
        o(this.f57765c + i11);
    }

    private final void q(int i11, int i12) {
        p(i12);
        E[] eArr = this.f57763a;
        l.k(eArr, eArr, i11 + i12, i11, this.f57764b + this.f57765c);
        this.f57765c += i12;
    }

    private final boolean r() {
        b<E> bVar;
        return this.f57766d || ((bVar = this.f57768f) != null && bVar.f57766d);
    }

    private final E s(int i11) {
        b<E> bVar = this.f57767e;
        if (bVar != null) {
            this.f57765c--;
            return bVar.s(i11);
        }
        E[] eArr = this.f57763a;
        E e11 = eArr[i11];
        l.k(eArr, eArr, i11, i11 + 1, this.f57764b + this.f57765c);
        c.f(this.f57763a, (this.f57764b + this.f57765c) - 1);
        this.f57765c--;
        return e11;
    }

    private final void t(int i11, int i12) {
        b<E> bVar = this.f57767e;
        if (bVar != null) {
            bVar.t(i11, i12);
        } else {
            E[] eArr = this.f57763a;
            l.k(eArr, eArr, i11, i11 + i12, this.f57765c);
            E[] eArr2 = this.f57763a;
            int i13 = this.f57765c;
            c.g(eArr2, i13 - i12, i13);
        }
        this.f57765c -= i12;
    }

    private final int u(int i11, int i12, Collection<? extends E> collection, boolean z11) {
        b<E> bVar = this.f57767e;
        if (bVar != null) {
            int u11 = bVar.u(i11, i12, collection, z11);
            this.f57765c -= u11;
            return u11;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = i11 + i13;
            if (collection.contains(this.f57763a[i15]) == z11) {
                E[] eArr = this.f57763a;
                i13++;
                eArr[i14 + i11] = eArr[i15];
                i14++;
            } else {
                i13++;
            }
        }
        int i16 = i12 - i14;
        E[] eArr2 = this.f57763a;
        l.k(eArr2, eArr2, i11 + i14, i12 + i11, this.f57765c);
        E[] eArr3 = this.f57763a;
        int i17 = this.f57765c;
        c.g(eArr3, i17 - i16, i17);
        this.f57765c -= i16;
        return i16;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        m();
        j(this.f57764b + this.f57765c, e11);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        s.g(elements, "elements");
        m();
        int size = elements.size();
        i(this.f57764b + this.f57765c, elements, size);
        return size > 0;
    }

    @Override // wz.f
    public int b() {
        return this.f57765c;
    }

    @Override // wz.f
    public E c(int i11) {
        m();
        wz.c.f56468a.a(i11, this.f57765c);
        return s(this.f57764b + i11);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m();
        t(this.f57764b, this.f57765c);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && n((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        wz.c.f56468a.a(i11, this.f57765c);
        return this.f57763a[this.f57764b + i11];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11;
        i11 = c.i(this.f57763a, this.f57764b, this.f57765c);
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i11 = 0; i11 < this.f57765c; i11++) {
            if (s.c(this.f57763a[this.f57764b + i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f57765c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new a(this, 0);
    }

    public final List<E> k() {
        if (this.f57767e == null) {
            m();
            this.f57766d = true;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i11 = this.f57765c - 1; i11 >= 0; i11--) {
            if (s.c(this.f57763a[this.f57764b + i11], obj)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new a(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        m();
        return u(this.f57764b, this.f57765c, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        m();
        return u(this.f57764b, this.f57765c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        m();
        wz.c.f56468a.a(i11, this.f57765c);
        E[] eArr = this.f57763a;
        int i12 = this.f57764b;
        E e12 = eArr[i12 + i11];
        eArr[i12 + i11] = e11;
        return e12;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i11, int i12) {
        wz.c.f56468a.c(i11, i12, this.f57765c);
        E[] eArr = this.f57763a;
        int i13 = this.f57764b + i11;
        int i14 = i12 - i11;
        boolean z11 = this.f57766d;
        b<E> bVar = this.f57768f;
        return new b(eArr, i13, i14, z11, this, bVar == null ? this : bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] destination) {
        s.g(destination, "destination");
        int length = destination.length;
        int i11 = this.f57765c;
        if (length < i11) {
            E[] eArr = this.f57763a;
            int i12 = this.f57764b;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i12, i11 + i12, destination.getClass());
            s.f(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        E[] eArr2 = this.f57763a;
        int i13 = this.f57764b;
        l.k(eArr2, destination, 0, i13, i11 + i13);
        int length2 = destination.length;
        int i14 = this.f57765c;
        if (length2 > i14) {
            destination[i14] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j11;
        j11 = c.j(this.f57763a, this.f57764b, this.f57765c);
        return j11;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i11) {
        wz.c.f56468a.b(i11, this.f57765c);
        return new a(this, i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        m();
        wz.c.f56468a.b(i11, this.f57765c);
        j(this.f57764b + i11, e11);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i11, Collection<? extends E> elements) {
        s.g(elements, "elements");
        m();
        wz.c.f56468a.b(i11, this.f57765c);
        int size = elements.size();
        i(this.f57764b + i11, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        E[] eArr = this.f57763a;
        int i11 = this.f57764b;
        return l.r(eArr, i11, this.f57765c + i11);
    }

    public b() {
        this(10);
    }

    public b(int i11) {
        this(c.d(i11), 0, 0, false, null, null);
    }
}