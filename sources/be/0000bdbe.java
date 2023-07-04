package wz;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class k<E> extends f<E> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f56485d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final Object[] f56486e = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    private int f56487a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f56488b;

    /* renamed from: c  reason: collision with root package name */
    private int f56489c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int i11, int i12) {
            int i13 = i11 + (i11 >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            return i13 - 2147483639 > 0 ? i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i13;
        }
    }

    public k(int i11) {
        Object[] objArr;
        if (i11 == 0) {
            objArr = f56486e;
        } else if (i11 > 0) {
            objArr = new Object[i11];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i11);
        }
        this.f56488b = objArr;
    }

    private final void e(int i11, Collection<? extends E> collection) {
        Iterator<? extends E> it2 = collection.iterator();
        int length = this.f56488b.length;
        while (i11 < length && it2.hasNext()) {
            this.f56488b[i11] = it2.next();
            i11++;
        }
        int i12 = this.f56487a;
        for (int i13 = 0; i13 < i12 && it2.hasNext(); i13++) {
            this.f56488b[i13] = it2.next();
        }
        this.f56489c = size() + collection.size();
    }

    private final void f(int i11) {
        Object[] objArr = new Object[i11];
        Object[] objArr2 = this.f56488b;
        l.k(objArr2, objArr, 0, this.f56487a, objArr2.length);
        Object[] objArr3 = this.f56488b;
        int length = objArr3.length;
        int i12 = this.f56487a;
        l.k(objArr3, objArr, length - i12, 0, i12);
        this.f56487a = 0;
        this.f56488b = objArr;
    }

    private final int h(int i11) {
        int L;
        if (i11 == 0) {
            L = p.L(this.f56488b);
            return L;
        }
        return i11 - 1;
    }

    private final void i(int i11) {
        int d11;
        if (i11 >= 0) {
            Object[] objArr = this.f56488b;
            if (i11 <= objArr.length) {
                return;
            }
            if (objArr == f56486e) {
                d11 = m00.l.d(i11, 10);
                this.f56488b = new Object[d11];
                return;
            }
            f(f56485d.a(objArr.length, i11));
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    private final int k(int i11) {
        int L;
        L = p.L(this.f56488b);
        if (i11 == L) {
            return 0;
        }
        return i11 + 1;
    }

    private final int n(int i11) {
        return i11 < 0 ? i11 + this.f56488b.length : i11;
    }

    private final int o(int i11) {
        Object[] objArr = this.f56488b;
        return i11 >= objArr.length ? i11 - objArr.length : i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        addLast(e11);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        i(size() + elements.size());
        e(o(this.f56487a + size()), elements);
        return true;
    }

    public final void addFirst(E e11) {
        i(size() + 1);
        int h11 = h(this.f56487a);
        this.f56487a = h11;
        this.f56488b[h11] = e11;
        this.f56489c = size() + 1;
    }

    public final void addLast(E e11) {
        i(size() + 1);
        this.f56488b[o(this.f56487a + size())] = e11;
        this.f56489c = size() + 1;
    }

    @Override // wz.f
    public int b() {
        return this.f56489c;
    }

    @Override // wz.f
    public E c(int i11) {
        int k11;
        int k12;
        c.f56468a.a(i11, size());
        k11 = w.k(this);
        if (i11 == k11) {
            return removeLast();
        }
        if (i11 == 0) {
            return removeFirst();
        }
        int o11 = o(this.f56487a + i11);
        E e11 = (E) this.f56488b[o11];
        if (i11 < (size() >> 1)) {
            int i12 = this.f56487a;
            if (o11 >= i12) {
                Object[] objArr = this.f56488b;
                l.k(objArr, objArr, i12 + 1, i12, o11);
            } else {
                Object[] objArr2 = this.f56488b;
                l.k(objArr2, objArr2, 1, 0, o11);
                Object[] objArr3 = this.f56488b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i13 = this.f56487a;
                l.k(objArr3, objArr3, i13 + 1, i13, objArr3.length - 1);
            }
            Object[] objArr4 = this.f56488b;
            int i14 = this.f56487a;
            objArr4[i14] = null;
            this.f56487a = k(i14);
        } else {
            int i15 = this.f56487a;
            k12 = w.k(this);
            int o12 = o(i15 + k12);
            if (o11 <= o12) {
                Object[] objArr5 = this.f56488b;
                l.k(objArr5, objArr5, o11, o11 + 1, o12 + 1);
            } else {
                Object[] objArr6 = this.f56488b;
                l.k(objArr6, objArr6, o11, o11 + 1, objArr6.length);
                Object[] objArr7 = this.f56488b;
                objArr7[objArr7.length - 1] = objArr7[0];
                l.k(objArr7, objArr7, 0, 1, o12 + 1);
            }
            this.f56488b[o12] = null;
        }
        this.f56489c = size() - 1;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int o11 = o(this.f56487a + size());
        int i11 = this.f56487a;
        if (i11 < o11) {
            o.t(this.f56488b, null, i11, o11);
        } else if (!isEmpty()) {
            Object[] objArr = this.f56488b;
            o.t(objArr, null, this.f56487a, objArr.length);
            o.t(this.f56488b, null, 0, o11);
        }
        this.f56487a = 0;
        this.f56489c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f56488b[this.f56487a];
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        c.f56468a.a(i11, size());
        return (E) this.f56488b[o(this.f56487a + i11)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i11;
        int o11 = o(this.f56487a + size());
        int i12 = this.f56487a;
        if (i12 < o11) {
            while (i12 < o11) {
                if (kotlin.jvm.internal.s.c(obj, this.f56488b[i12])) {
                    i11 = this.f56487a;
                } else {
                    i12++;
                }
            }
            return -1;
        } else if (i12 < o11) {
            return -1;
        } else {
            int length = this.f56488b.length;
            while (true) {
                if (i12 >= length) {
                    for (int i13 = 0; i13 < o11; i13++) {
                        if (kotlin.jvm.internal.s.c(obj, this.f56488b[i13])) {
                            i12 = i13 + this.f56488b.length;
                            i11 = this.f56487a;
                        }
                    }
                    return -1;
                } else if (kotlin.jvm.internal.s.c(obj, this.f56488b[i12])) {
                    i11 = this.f56487a;
                    break;
                } else {
                    i12++;
                }
            }
        }
        return i12 - i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E j() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f56488b[this.f56487a];
    }

    public final E last() {
        int k11;
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f56488b;
        int i11 = this.f56487a;
        k11 = w.k(this);
        return (E) objArr[o(i11 + k11)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int L;
        int i11;
        int o11 = o(this.f56487a + size());
        int i12 = this.f56487a;
        if (i12 < o11) {
            L = o11 - 1;
            if (i12 <= L) {
                while (!kotlin.jvm.internal.s.c(obj, this.f56488b[L])) {
                    if (L != i12) {
                        L--;
                    }
                }
                i11 = this.f56487a;
                return L - i11;
            }
            return -1;
        }
        if (i12 > o11) {
            int i13 = o11 - 1;
            while (true) {
                if (-1 < i13) {
                    if (kotlin.jvm.internal.s.c(obj, this.f56488b[i13])) {
                        L = i13 + this.f56488b.length;
                        i11 = this.f56487a;
                        break;
                    }
                    i13--;
                } else {
                    L = p.L(this.f56488b);
                    int i14 = this.f56487a;
                    if (i14 <= L) {
                        while (!kotlin.jvm.internal.s.c(obj, this.f56488b[L])) {
                            if (L != i14) {
                                L--;
                            }
                        }
                        i11 = this.f56487a;
                    }
                }
            }
        }
        return -1;
    }

    public final E m() {
        int k11;
        if (isEmpty()) {
            return null;
        }
        Object[] objArr = this.f56488b;
        int i11 = this.f56487a;
        k11 = w.k(this);
        return (E) objArr[o(i11 + k11)];
    }

    public final E p() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E q() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        int o11;
        kotlin.jvm.internal.s.g(elements, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty()) {
            if ((this.f56488b.length == 0 ? (byte) 1 : (byte) 0) == 0) {
                int o12 = o(this.f56487a + size());
                int i11 = this.f56487a;
                if (i11 < o12) {
                    o11 = i11;
                    while (i11 < o12) {
                        Object obj = this.f56488b[i11];
                        if (!elements.contains(obj)) {
                            this.f56488b[o11] = obj;
                            o11++;
                        } else {
                            z11 = true;
                        }
                        i11++;
                    }
                    o.t(this.f56488b, null, o11, o12);
                } else {
                    int length = this.f56488b.length;
                    boolean z12 = false;
                    int i12 = i11;
                    while (i11 < length) {
                        Object[] objArr = this.f56488b;
                        Object obj2 = objArr[i11];
                        objArr[i11] = null;
                        if (!elements.contains(obj2)) {
                            this.f56488b[i12] = obj2;
                            i12++;
                        } else {
                            z12 = true;
                        }
                        i11++;
                    }
                    o11 = o(i12);
                    for (int i13 = 0; i13 < o12; i13++) {
                        Object[] objArr2 = this.f56488b;
                        Object obj3 = objArr2[i13];
                        objArr2[i13] = null;
                        if (!elements.contains(obj3)) {
                            this.f56488b[o11] = obj3;
                            o11 = k(o11);
                        } else {
                            z12 = true;
                        }
                    }
                    z11 = z12;
                }
                if (z11) {
                    this.f56489c = n(o11 - this.f56487a);
                }
            }
        }
        return z11;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f56488b;
            int i11 = this.f56487a;
            E e11 = (E) objArr[i11];
            objArr[i11] = null;
            this.f56487a = k(i11);
            this.f56489c = size() - 1;
            return e11;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        int k11;
        if (!isEmpty()) {
            int i11 = this.f56487a;
            k11 = w.k(this);
            int o11 = o(i11 + k11);
            Object[] objArr = this.f56488b;
            E e11 = (E) objArr[o11];
            objArr[o11] = null;
            this.f56489c = size() - 1;
            return e11;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int o11;
        kotlin.jvm.internal.s.g(elements, "elements");
        boolean z11 = false;
        z11 = false;
        z11 = false;
        if (!isEmpty()) {
            if ((this.f56488b.length == 0 ? (byte) 1 : (byte) 0) == 0) {
                int o12 = o(this.f56487a + size());
                int i11 = this.f56487a;
                if (i11 < o12) {
                    o11 = i11;
                    while (i11 < o12) {
                        Object obj = this.f56488b[i11];
                        if (elements.contains(obj)) {
                            this.f56488b[o11] = obj;
                            o11++;
                        } else {
                            z11 = true;
                        }
                        i11++;
                    }
                    o.t(this.f56488b, null, o11, o12);
                } else {
                    int length = this.f56488b.length;
                    boolean z12 = false;
                    int i12 = i11;
                    while (i11 < length) {
                        Object[] objArr = this.f56488b;
                        Object obj2 = objArr[i11];
                        objArr[i11] = null;
                        if (elements.contains(obj2)) {
                            this.f56488b[i12] = obj2;
                            i12++;
                        } else {
                            z12 = true;
                        }
                        i11++;
                    }
                    o11 = o(i12);
                    for (int i13 = 0; i13 < o12; i13++) {
                        Object[] objArr2 = this.f56488b;
                        Object obj3 = objArr2[i13];
                        objArr2[i13] = null;
                        if (elements.contains(obj3)) {
                            this.f56488b[o11] = obj3;
                            o11 = k(o11);
                        } else {
                            z12 = true;
                        }
                    }
                    z11 = z12;
                }
                if (z11) {
                    this.f56489c = n(o11 - this.f56487a);
                }
            }
        }
        return z11;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        c.f56468a.a(i11, size());
        int o11 = o(this.f56487a + i11);
        Object[] objArr = this.f56488b;
        E e12 = (E) objArr[o11];
        objArr[o11] = e11;
        return e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.s.g(array, "array");
        if (array.length < size()) {
            array = (T[]) m.a(array, size());
        }
        int o11 = o(this.f56487a + size());
        int i11 = this.f56487a;
        if (i11 < o11) {
            o.o(this.f56488b, array, 0, i11, o11, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f56488b;
            l.k(objArr, array, 0, this.f56487a, objArr.length);
            Object[] objArr2 = this.f56488b;
            l.k(objArr2, array, objArr2.length - this.f56487a, 0, o11);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        c.f56468a.b(i11, size());
        if (i11 == size()) {
            addLast(e11);
        } else if (i11 == 0) {
            addFirst(e11);
        } else {
            i(size() + 1);
            int o11 = o(this.f56487a + i11);
            if (i11 < ((size() + 1) >> 1)) {
                int h11 = h(o11);
                int h12 = h(this.f56487a);
                int i12 = this.f56487a;
                if (h11 >= i12) {
                    Object[] objArr = this.f56488b;
                    objArr[h12] = objArr[i12];
                    l.k(objArr, objArr, i12, i12 + 1, h11 + 1);
                } else {
                    Object[] objArr2 = this.f56488b;
                    l.k(objArr2, objArr2, i12 - 1, i12, objArr2.length);
                    Object[] objArr3 = this.f56488b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    l.k(objArr3, objArr3, 0, 1, h11 + 1);
                }
                this.f56488b[h11] = e11;
                this.f56487a = h12;
            } else {
                int o12 = o(this.f56487a + size());
                if (o11 < o12) {
                    Object[] objArr4 = this.f56488b;
                    l.k(objArr4, objArr4, o11 + 1, o11, o12);
                } else {
                    Object[] objArr5 = this.f56488b;
                    l.k(objArr5, objArr5, 1, 0, o12);
                    Object[] objArr6 = this.f56488b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    l.k(objArr6, objArr6, o11 + 1, o11, objArr6.length - 1);
                }
                this.f56488b[o11] = e11;
            }
            this.f56489c = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i11, Collection<? extends E> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        c.f56468a.b(i11, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i11 == size()) {
            return addAll(elements);
        }
        i(size() + elements.size());
        int o11 = o(this.f56487a + size());
        int o12 = o(this.f56487a + i11);
        int size = elements.size();
        if (i11 < ((size() + 1) >> 1)) {
            int i12 = this.f56487a;
            int i13 = i12 - size;
            if (o12 < i12) {
                Object[] objArr = this.f56488b;
                l.k(objArr, objArr, i13, i12, objArr.length);
                if (size >= o12) {
                    Object[] objArr2 = this.f56488b;
                    l.k(objArr2, objArr2, objArr2.length - size, 0, o12);
                } else {
                    Object[] objArr3 = this.f56488b;
                    l.k(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f56488b;
                    l.k(objArr4, objArr4, 0, size, o12);
                }
            } else if (i13 >= 0) {
                Object[] objArr5 = this.f56488b;
                l.k(objArr5, objArr5, i13, i12, o12);
            } else {
                Object[] objArr6 = this.f56488b;
                i13 += objArr6.length;
                int i14 = o12 - i12;
                int length = objArr6.length - i13;
                if (length >= i14) {
                    l.k(objArr6, objArr6, i13, i12, o12);
                } else {
                    l.k(objArr6, objArr6, i13, i12, i12 + length);
                    Object[] objArr7 = this.f56488b;
                    l.k(objArr7, objArr7, 0, this.f56487a + length, o12);
                }
            }
            this.f56487a = i13;
            e(n(o12 - size), elements);
        } else {
            int i15 = o12 + size;
            if (o12 < o11) {
                int i16 = size + o11;
                Object[] objArr8 = this.f56488b;
                if (i16 <= objArr8.length) {
                    l.k(objArr8, objArr8, i15, o12, o11);
                } else if (i15 >= objArr8.length) {
                    l.k(objArr8, objArr8, i15 - objArr8.length, o12, o11);
                } else {
                    int length2 = o11 - (i16 - objArr8.length);
                    l.k(objArr8, objArr8, 0, length2, o11);
                    Object[] objArr9 = this.f56488b;
                    l.k(objArr9, objArr9, i15, o12, length2);
                }
            } else {
                Object[] objArr10 = this.f56488b;
                l.k(objArr10, objArr10, size, 0, o11);
                Object[] objArr11 = this.f56488b;
                if (i15 >= objArr11.length) {
                    l.k(objArr11, objArr11, i15 - objArr11.length, o12, objArr11.length);
                } else {
                    l.k(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f56488b;
                    l.k(objArr12, objArr12, i15, o12, objArr12.length - size);
                }
            }
            e(o12, elements);
        }
        return true;
    }

    public k() {
        this.f56488b = f56486e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}