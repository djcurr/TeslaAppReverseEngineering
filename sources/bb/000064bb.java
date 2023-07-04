package d1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import wz.l;
import wz.o;

/* loaded from: classes.dex */
public final class c<T> implements Set<T>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private int f23271a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f23272b = new Object[16];

    /* loaded from: classes.dex */
    public static final class a implements Iterator<T>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private int f23273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c<T> f23274b;

        a(c<T> cVar) {
            this.f23274b = cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23273a < this.f23274b.size();
        }

        @Override // java.util.Iterator
        public T next() {
            Object[] f11 = this.f23274b.f();
            int i11 = this.f23273a;
            this.f23273a = i11 + 1;
            T t11 = (T) f11[i11];
            Objects.requireNonNull(t11, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t11;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private final int b(Object obj) {
        int size = size() - 1;
        int a11 = c1.c.a(obj);
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            T t11 = get(i12);
            int a12 = c1.c.a(t11) - a11;
            if (a12 < 0) {
                i11 = i12 + 1;
            } else if (a12 <= 0) {
                return t11 == obj ? i12 : c(i12, obj, a11);
            } else {
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    private final int c(int i11, Object obj, int i12) {
        int i13 = i11 - 1;
        if (i13 >= 0) {
            while (true) {
                int i14 = i13 - 1;
                Object obj2 = this.f23272b[i13];
                if (obj2 != obj) {
                    if (c1.c.a(obj2) != i12 || i14 < 0) {
                        break;
                    }
                    i13 = i14;
                } else {
                    return i13;
                }
            }
        }
        int i15 = i11 + 1;
        int size = size();
        while (i15 < size) {
            int i16 = i15 + 1;
            Object obj3 = this.f23272b[i15];
            if (obj3 == obj) {
                return i15;
            }
            if (c1.c.a(obj3) != i12) {
                return -i16;
            }
            i15 = i16;
        }
        return -(size() + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T value) {
        int i11;
        s.g(value, "value");
        if (size() > 0) {
            i11 = b(value);
            if (i11 >= 0) {
                return false;
            }
        } else {
            i11 = -1;
        }
        int i12 = -(i11 + 1);
        int size = size();
        Object[] objArr = this.f23272b;
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            l.k(objArr, objArr2, i12 + 1, i12, size());
            o.o(this.f23272b, objArr2, 0, 0, i12, 6, null);
            this.f23272b = objArr2;
        } else {
            l.k(objArr, objArr, i12 + 1, i12, size());
        }
        this.f23272b[i12] = value;
        i(size() + 1);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f23272b[i11] = null;
        }
        i(0);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return obj != null && b(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = elements.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return this.f23271a;
    }

    public final Object[] f() {
        return this.f23272b;
    }

    public final T get(int i11) {
        T t11 = (T) this.f23272b[i11];
        Objects.requireNonNull(t11, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t11;
    }

    public final boolean h() {
        return size() > 0;
    }

    public void i(int i11) {
        this.f23271a = i11;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(T t11) {
        int b11;
        if (t11 != null && (b11 = b(t11)) >= 0) {
            if (b11 < size() - 1) {
                Object[] objArr = this.f23272b;
                l.k(objArr, objArr, b11, b11 + 1, size());
            }
            i(size() - 1);
            this.f23272b[size()] = null;
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        s.g(array, "array");
        return (T[]) j.b(this, array);
    }
}