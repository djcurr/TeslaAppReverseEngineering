package h2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f<T> implements List<T>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private Object[] f28654a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    private long[] f28655b = new long[16];

    /* renamed from: c  reason: collision with root package name */
    private int f28656c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f28657d;

    /* loaded from: classes.dex */
    private final class b implements List<T>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private final int f28662a;

        /* renamed from: b  reason: collision with root package name */
        private final int f28663b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f<T> f28664c;

        public b(f this$0, int i11, int i12) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            this.f28664c = this$0;
            this.f28662a = i11;
            this.f28663b = i12;
        }

        @Override // java.util.List
        public void add(int i11, T t11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i11, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int b() {
            return this.f28663b - this.f28662a;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.s.g(elements, "elements");
            Iterator<T> it2 = elements.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i11) {
            return (T) ((f) this.f28664c).f28654a[i11 + this.f28662a];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i11 = this.f28662a;
            int i12 = this.f28663b;
            if (i11 > i12) {
                return -1;
            }
            while (true) {
                int i13 = i11 + 1;
                if (kotlin.jvm.internal.s.c(((f) this.f28664c).f28654a[i11], obj)) {
                    return i11 - this.f28662a;
                }
                if (i11 == i12) {
                    return -1;
                }
                i11 = i13;
            }
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            f<T> fVar = this.f28664c;
            int i11 = this.f28662a;
            return new a(fVar, i11, i11, this.f28663b);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i11 = this.f28663b;
            int i12 = this.f28662a;
            if (i12 > i11) {
                return -1;
            }
            while (true) {
                int i13 = i11 - 1;
                if (kotlin.jvm.internal.s.c(((f) this.f28664c).f28654a[i11], obj)) {
                    return i11 - this.f28662a;
                }
                if (i11 == i12) {
                    return -1;
                }
                i11 = i13;
            }
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            f<T> fVar = this.f28664c;
            int i11 = this.f28662a;
            return new a(fVar, i11, i11, this.f28663b);
        }

        @Override // java.util.List
        public T remove(int i11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public T set(int i11, T t11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.List
        public void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<T> subList(int i11, int i12) {
            f<T> fVar = this.f28664c;
            int i13 = this.f28662a;
            return new b(fVar, i11 + i13, i13 + i12);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return kotlin.jvm.internal.j.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.s.g(array, "array");
            return (T[]) kotlin.jvm.internal.j.b(this, array);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i11) {
            f<T> fVar = this.f28664c;
            int i12 = this.f28662a;
            return new a(fVar, i11 + i12, i12, this.f28663b);
        }
    }

    private final void h() {
        int i11 = this.f28656c;
        Object[] objArr = this.f28654a;
        if (i11 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
            this.f28654a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f28655b, length);
            kotlin.jvm.internal.s.f(copyOf2, "copyOf(this, newSize)");
            this.f28655b = copyOf2;
        }
    }

    private final long i() {
        long a11;
        int k11;
        a11 = g.a(Float.POSITIVE_INFINITY, false);
        int i11 = this.f28656c + 1;
        k11 = wz.w.k(this);
        if (i11 <= k11) {
            while (true) {
                int i12 = i11 + 1;
                long b11 = d.b(this.f28655b[i11]);
                if (d.a(b11, a11) < 0) {
                    a11 = b11;
                }
                if (d.c(a11) < BitmapDescriptorFactory.HUE_RED && d.d(a11)) {
                    return a11;
                }
                if (i11 == k11) {
                    break;
                }
                i11 = i12;
            }
        }
        return a11;
    }

    private final void p() {
        int k11;
        int i11 = this.f28656c + 1;
        k11 = wz.w.k(this);
        if (i11 <= k11) {
            while (true) {
                int i12 = i11 + 1;
                this.f28654a[i11] = null;
                if (i11 == k11) {
                    break;
                }
                i11 = i12;
            }
        }
        this.f28657d = this.f28656c + 1;
    }

    @Override // java.util.List
    public void add(int i11, T t11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        this.f28656c = size() - 1;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f28656c = -1;
        p();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        Iterator<T> it2 = elements.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int i11) {
        return (T) this.f28654a[i11];
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int k11;
        k11 = wz.w.k(this);
        if (k11 < 0) {
            return -1;
        }
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (kotlin.jvm.internal.s.c(this.f28654a[i11], obj)) {
                return i11;
            }
            if (i11 == k11) {
                return -1;
            }
            i11 = i12;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(0, 0, 0, 7, null);
    }

    public int j() {
        return this.f28657d;
    }

    public final boolean k() {
        long i11 = i();
        return d.c(i11) < BitmapDescriptorFactory.HUE_RED && d.d(i11);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int k11;
        k11 = wz.w.k(this);
        if (k11 < 0) {
            return -1;
        }
        while (true) {
            int i11 = k11 - 1;
            if (kotlin.jvm.internal.s.c(this.f28654a[k11], obj)) {
                return k11;
            }
            if (i11 < 0) {
                return -1;
            }
            k11 = i11;
        }
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new a(0, 0, 0, 7, null);
    }

    public final void m(T t11, boolean z11, h00.a<vz.b0> childHitTest) {
        kotlin.jvm.internal.s.g(childHitTest, "childHitTest");
        n(t11, -1.0f, z11, childHitTest);
    }

    public final void n(T t11, float f11, boolean z11, h00.a<vz.b0> childHitTest) {
        long a11;
        kotlin.jvm.internal.s.g(childHitTest, "childHitTest");
        int i11 = this.f28656c;
        this.f28656c = i11 + 1;
        h();
        Object[] objArr = this.f28654a;
        int i12 = this.f28656c;
        objArr[i12] = t11;
        long[] jArr = this.f28655b;
        a11 = g.a(f11, z11);
        jArr[i12] = a11;
        p();
        childHitTest.invoke();
        this.f28656c = i11;
    }

    public final boolean o(float f11, boolean z11) {
        int k11;
        long a11;
        int i11 = this.f28656c;
        k11 = wz.w.k(this);
        if (i11 == k11) {
            return true;
        }
        a11 = g.a(f11, z11);
        return d.a(i(), a11) > 0;
    }

    public final void q(T t11, float f11, boolean z11, h00.a<vz.b0> childHitTest) {
        int k11;
        int k12;
        int k13;
        int k14;
        kotlin.jvm.internal.s.g(childHitTest, "childHitTest");
        int i11 = this.f28656c;
        k11 = wz.w.k(this);
        if (i11 == k11) {
            n(t11, f11, z11, childHitTest);
            int i12 = this.f28656c + 1;
            k14 = wz.w.k(this);
            if (i12 == k14) {
                p();
                return;
            }
            return;
        }
        long i13 = i();
        int i14 = this.f28656c;
        k12 = wz.w.k(this);
        this.f28656c = k12;
        n(t11, f11, z11, childHitTest);
        int i15 = this.f28656c + 1;
        k13 = wz.w.k(this);
        if (i15 < k13 && d.a(i13, i()) > 0) {
            int i16 = this.f28656c + 1;
            int i17 = i14 + 1;
            Object[] objArr = this.f28654a;
            wz.l.k(objArr, objArr, i17, i16, size());
            long[] jArr = this.f28655b;
            wz.o.j(jArr, jArr, i17, i16, size());
            this.f28656c = ((size() + i14) - this.f28656c) - 1;
        }
        p();
        this.f28656c = i14;
    }

    @Override // java.util.List
    public T remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public T set(int i11, T t11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return j();
    }

    @Override // java.util.List
    public void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<T> subList(int i11, int i12) {
        return new b(this, i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.s.g(array, "array");
        return (T[]) kotlin.jvm.internal.j.b(this, array);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i11) {
        return new a(i11, 0, 0, 6, null);
    }

    /* loaded from: classes.dex */
    private final class a implements ListIterator<T>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private int f28658a;

        /* renamed from: b  reason: collision with root package name */
        private final int f28659b;

        /* renamed from: c  reason: collision with root package name */
        private final int f28660c;

        public a(f this$0, int i11, int i12, int i13) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            f.this = this$0;
            this.f28658a = i11;
            this.f28659b = i12;
            this.f28660c = i13;
        }

        @Override // java.util.ListIterator
        public void add(T t11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f28658a < this.f28660c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f28658a > this.f28659b;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            Object[] objArr = ((f) f.this).f28654a;
            int i11 = this.f28658a;
            this.f28658a = i11 + 1;
            return (T) objArr[i11];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f28658a - this.f28659b;
        }

        @Override // java.util.ListIterator
        public T previous() {
            Object[] objArr = ((f) f.this).f28654a;
            int i11 = this.f28658a - 1;
            this.f28658a = i11;
            return (T) objArr[i11];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.f28658a - this.f28659b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(f.this, (i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? f.this.size() : i13);
        }
    }
}