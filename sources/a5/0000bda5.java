package wz;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class c<E> extends wz.a<E> implements List<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f56468a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i11, int i12) {
            if (i11 < 0 || i11 >= i12) {
                throw new IndexOutOfBoundsException("index: " + i11 + ", size: " + i12);
            }
        }

        public final void b(int i11, int i12) {
            if (i11 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("index: " + i11 + ", size: " + i12);
            }
        }

        public final void c(int i11, int i12, int i13) {
            if (i11 < 0 || i12 > i13) {
                throw new IndexOutOfBoundsException("fromIndex: " + i11 + ", toIndex: " + i12 + ", size: " + i13);
            } else if (i11 <= i12) {
            } else {
                throw new IllegalArgumentException("fromIndex: " + i11 + " > toIndex: " + i12);
            }
        }

        public final boolean d(Collection<?> c11, Collection<?> other) {
            kotlin.jvm.internal.s.g(c11, "c");
            kotlin.jvm.internal.s.g(other, "other");
            if (c11.size() != other.size()) {
                return false;
            }
            Iterator<?> it2 = other.iterator();
            Iterator<?> it3 = c11.iterator();
            while (it3.hasNext()) {
                if (!kotlin.jvm.internal.s.c(it3.next(), it2.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int e(Collection<?> c11) {
            kotlin.jvm.internal.s.g(c11, "c");
            Iterator<?> it2 = c11.iterator();
            int i11 = 1;
            while (it2.hasNext()) {
                Object next = it2.next();
                i11 = (i11 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class b implements Iterator<E>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private int f56469a;

        public b() {
        }

        protected final int a() {
            return this.f56469a;
        }

        protected final void b(int i11) {
            this.f56469a = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f56469a < c.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (hasNext()) {
                c<E> cVar = c.this;
                int i11 = this.f56469a;
                this.f56469a = i11 + 1;
                return cVar.get(i11);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: wz.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private class C1285c extends c<E>.b implements ListIterator<E> {
        public C1285c(int i11) {
            super();
            c.f56468a.b(i11, c.this.size());
            b(i11);
        }

        @Override // java.util.ListIterator
        public void add(E e11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (hasPrevious()) {
                c<E> cVar = c.this;
                b(a() - 1);
                return cVar.get(a());
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* loaded from: classes5.dex */
    private static final class d<E> extends c<E> implements RandomAccess {

        /* renamed from: b  reason: collision with root package name */
        private final c<E> f56472b;

        /* renamed from: c  reason: collision with root package name */
        private final int f56473c;

        /* renamed from: d  reason: collision with root package name */
        private int f56474d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(c<? extends E> list, int i11, int i12) {
            kotlin.jvm.internal.s.g(list, "list");
            this.f56472b = list;
            this.f56473c = i11;
            c.f56468a.c(i11, i12, list.size());
            this.f56474d = i12 - i11;
        }

        @Override // wz.a
        public int b() {
            return this.f56474d;
        }

        @Override // wz.c, java.util.List
        public E get(int i11) {
            c.f56468a.a(i11, this.f56474d);
            return this.f56472b.get(this.f56473c + i11);
        }
    }

    @Override // java.util.List
    public void add(int i11, E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f56468a.d(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i11);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f56468a.e(this);
    }

    public int indexOf(E e11) {
        int i11 = 0;
        for (E e12 : this) {
            if (kotlin.jvm.internal.s.c(e12, e11)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e11) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.s.c(listIterator.previous(), e11)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C1285c(0);
    }

    @Override // java.util.List
    public E remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i11, E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i11, int i12) {
        return new d(this, i11, i12);
    }

    public ListIterator<E> listIterator(int i11) {
        return new C1285c(i11);
    }
}