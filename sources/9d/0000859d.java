package m1;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.j0;
import wz.n0;

/* loaded from: classes.dex */
final class d0<T> implements List<T>, i00.d {

    /* renamed from: a  reason: collision with root package name */
    private final r<T> f38171a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38172b;

    /* renamed from: c  reason: collision with root package name */
    private int f38173c;

    /* renamed from: d  reason: collision with root package name */
    private int f38174d;

    /* loaded from: classes.dex */
    public static final class a implements ListIterator<T>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j0 f38175a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d0<T> f38176b;

        a(j0 j0Var, d0<T> d0Var) {
            this.f38175a = j0Var;
            this.f38176b = d0Var;
        }

        public Void a(T t11) {
            s.d();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            a(obj);
            throw new KotlinNothingValueException();
        }

        public Void b() {
            s.d();
            throw new KotlinNothingValueException();
        }

        public Void c(T t11) {
            s.d();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f38175a.f34912a < this.f38176b.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f38175a.f34912a >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            int i11 = this.f38175a.f34912a + 1;
            s.e(i11, this.f38176b.size());
            this.f38175a.f34912a = i11;
            return this.f38176b.get(i11);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f38175a.f34912a + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i11 = this.f38175a.f34912a;
            s.e(i11, this.f38176b.size());
            this.f38175a.f34912a = i11 - 1;
            return this.f38176b.get(i11);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f38175a.f34912a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            b();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            c(obj);
            throw new KotlinNothingValueException();
        }
    }

    public d0(r<T> parentList, int i11, int i12) {
        kotlin.jvm.internal.s.g(parentList, "parentList");
        this.f38171a = parentList;
        this.f38172b = i11;
        this.f38173c = parentList.f();
        this.f38174d = i12 - i11;
    }

    private final void f() {
        if (this.f38171a.f() != this.f38173c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t11) {
        f();
        this.f38171a.add(this.f38172b + size(), t11);
        this.f38174d = size() + 1;
        this.f38173c = this.f38171a.f();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection<? extends T> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        f();
        boolean addAll = this.f38171a.addAll(i11 + this.f38172b, elements);
        if (addAll) {
            this.f38174d = size() + elements.size();
            this.f38173c = this.f38171a.f();
        }
        return addAll;
    }

    public final r<T> b() {
        return this.f38171a;
    }

    public int c() {
        return this.f38174d;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            f();
            r<T> rVar = this.f38171a;
            int i11 = this.f38172b;
            rVar.m(i11, size() + i11);
            this.f38174d = 0;
            this.f38173c = this.f38171a.f();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
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

    public T e(int i11) {
        f();
        T remove = this.f38171a.remove(this.f38172b + i11);
        this.f38174d = size() - 1;
        this.f38173c = b().f();
        return remove;
    }

    @Override // java.util.List
    public T get(int i11) {
        f();
        s.e(i11, size());
        return this.f38171a.get(this.f38172b + i11);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        m00.i r11;
        f();
        int i11 = this.f38172b;
        r11 = m00.l.r(i11, size() + i11);
        Iterator<Integer> it2 = r11.iterator();
        while (it2.hasNext()) {
            int a11 = ((n0) it2).a();
            if (kotlin.jvm.internal.s.c(obj, b().get(a11))) {
                return a11 - this.f38172b;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        f();
        int size = this.f38172b + size();
        while (true) {
            size--;
            if (size < this.f38172b) {
                return -1;
            }
            if (kotlin.jvm.internal.s.c(obj, this.f38171a.get(size))) {
                return size - this.f38172b;
            }
        }
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i11) {
        return e(i11);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        boolean z11;
        kotlin.jvm.internal.s.g(elements, "elements");
        while (true) {
            for (Object obj : elements) {
                z11 = remove(obj) || z11;
            }
            return z11;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        f();
        r<T> rVar = this.f38171a;
        int i11 = this.f38172b;
        int n11 = rVar.n(elements, i11, size() + i11);
        if (n11 > 0) {
            this.f38173c = this.f38171a.f();
            this.f38174d = size() - n11;
        }
        return n11 > 0;
    }

    @Override // java.util.List
    public T set(int i11, T t11) {
        s.e(i11, size());
        f();
        T t12 = this.f38171a.set(i11 + this.f38172b, t11);
        this.f38173c = this.f38171a.f();
        return t12;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.List
    public List<T> subList(int i11, int i12) {
        boolean z11 = true;
        if (!(i11 >= 0 && i11 <= i12) || i12 > size()) {
            z11 = false;
        }
        if (z11) {
            f();
            r<T> rVar = this.f38171a;
            int i13 = this.f38172b;
            return new d0(rVar, i11 + i13, i12 + i13);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
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
        f();
        j0 j0Var = new j0();
        j0Var.f34912a = i11 - 1;
        return new a(j0Var, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public void add(int i11, T t11) {
        f();
        this.f38171a.add(this.f38172b + i11, t11);
        this.f38174d = size() + 1;
        this.f38173c = this.f38171a.f();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        return addAll(size(), elements);
    }
}