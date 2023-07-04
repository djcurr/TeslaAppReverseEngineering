package t20;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class a<E> implements Iterable<E> {

    /* renamed from: d  reason: collision with root package name */
    private static final a<Object> f51567d = new a<>();

    /* renamed from: a  reason: collision with root package name */
    final E f51568a;

    /* renamed from: b  reason: collision with root package name */
    final a<E> f51569b;

    /* renamed from: c  reason: collision with root package name */
    private final int f51570c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t20.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1141a<E> implements Iterator<E> {

        /* renamed from: a  reason: collision with root package name */
        private a<E> f51571a;

        public C1141a(a<E> aVar) {
            this.f51571a = aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return ((a) this.f51571a).f51570c > 0;
        }

        @Override // java.util.Iterator
        public E next() {
            a<E> aVar = this.f51571a;
            E e11 = aVar.f51568a;
            this.f51571a = aVar.f51569b;
            return e11;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private a() {
        this.f51570c = 0;
        this.f51568a = null;
        this.f51569b = null;
    }

    public static <E> a<E> c() {
        return (a<E>) f51567d;
    }

    private Iterator<E> d(int i11) {
        return new C1141a(i(i11));
    }

    private a<E> f(Object obj) {
        if (this.f51570c == 0) {
            return this;
        }
        if (this.f51568a.equals(obj)) {
            return this.f51569b;
        }
        a<E> f11 = this.f51569b.f(obj);
        return f11 == this.f51569b ? this : new a<>(this.f51568a, f11);
    }

    private a<E> i(int i11) {
        if (i11 < 0 || i11 > this.f51570c) {
            throw new IndexOutOfBoundsException();
        }
        return i11 == 0 ? this : this.f51569b.i(i11 - 1);
    }

    public a<E> e(int i11) {
        return f(get(i11));
    }

    public E get(int i11) {
        if (i11 >= 0 && i11 <= this.f51570c) {
            try {
                return d(i11).next();
            } catch (NoSuchElementException unused) {
                throw new IndexOutOfBoundsException("Index: " + i11);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public a<E> h(E e11) {
        return new a<>(e11, this);
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return d(0);
    }

    public int size() {
        return this.f51570c;
    }

    private a(E e11, a<E> aVar) {
        this.f51568a = e11;
        this.f51569b = aVar;
        this.f51570c = aVar.f51570c + 1;
    }
}