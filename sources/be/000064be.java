package d1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.s;
import wz.l;
import wz.o;
import wz.w;

/* loaded from: classes.dex */
public final class e<T> implements RandomAccess {

    /* renamed from: d */
    public static final int f23279d = 8;

    /* renamed from: a */
    private T[] f23280a;

    /* renamed from: b */
    private List<T> f23281b;

    /* renamed from: c */
    private int f23282c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a<T> implements List<T>, i00.d {

        /* renamed from: a */
        private final e<T> f23283a;

        public a(e<T> vector) {
            s.g(vector, "vector");
            this.f23283a = vector;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t11) {
            return this.f23283a.b(t11);
        }

        @Override // java.util.List
        public boolean addAll(int i11, Collection<? extends T> elements) {
            s.g(elements, "elements");
            return this.f23283a.d(i11, elements);
        }

        public int b() {
            return this.f23283a.l();
        }

        public T c(int i11) {
            return this.f23283a.s(i11);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f23283a.g();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f23283a.h(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            s.g(elements, "elements");
            return this.f23283a.i(elements);
        }

        @Override // java.util.List
        public T get(int i11) {
            return this.f23283a.k()[i11];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f23283a.m(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f23283a.n();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f23283a.p(obj);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i11) {
            return c(i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            s.g(elements, "elements");
            return this.f23283a.r(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            s.g(elements, "elements");
            return this.f23283a.t(elements);
        }

        @Override // java.util.List
        public T set(int i11, T t11) {
            return this.f23283a.u(i11, t11);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.List
        public List<T> subList(int i11, int i12) {
            return new b(this, i11, i12);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return j.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            s.g(array, "array");
            return (T[]) j.b(this, array);
        }

        @Override // java.util.List
        public void add(int i11, T t11) {
            this.f23283a.a(i11, t11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            s.g(elements, "elements");
            return this.f23283a.e(elements);
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i11) {
            return new c(this, i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f23283a.q(obj);
        }
    }

    /* loaded from: classes.dex */
    private static final class b<T> implements List<T>, i00.d {

        /* renamed from: a */
        private final List<T> f23284a;

        /* renamed from: b */
        private final int f23285b;

        /* renamed from: c */
        private int f23286c;

        public b(List<T> list, int i11, int i12) {
            s.g(list, "list");
            this.f23284a = list;
            this.f23285b = i11;
            this.f23286c = i12;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t11) {
            List<T> list = this.f23284a;
            int i11 = this.f23286c;
            this.f23286c = i11 + 1;
            list.add(i11, t11);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i11, Collection<? extends T> elements) {
            s.g(elements, "elements");
            this.f23284a.addAll(i11 + this.f23285b, elements);
            this.f23286c += elements.size();
            return elements.size() > 0;
        }

        public int b() {
            return this.f23286c - this.f23285b;
        }

        public T c(int i11) {
            this.f23286c--;
            return this.f23284a.remove(i11 + this.f23285b);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i11 = this.f23286c - 1;
            int i12 = this.f23285b;
            if (i12 <= i11) {
                while (true) {
                    int i13 = i11 - 1;
                    this.f23284a.remove(i11);
                    if (i11 == i12) {
                        break;
                    }
                    i11 = i13;
                }
            }
            this.f23286c = this.f23285b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i11 = this.f23285b;
            int i12 = this.f23286c;
            while (i11 < i12) {
                int i13 = i11 + 1;
                if (s.c(this.f23284a.get(i11), obj)) {
                    return true;
                }
                i11 = i13;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            s.g(elements, "elements");
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
            return this.f23284a.get(i11 + this.f23285b);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i11 = this.f23285b;
            int i12 = this.f23286c;
            while (i11 < i12) {
                int i13 = i11 + 1;
                if (s.c(this.f23284a.get(i11), obj)) {
                    return i11 - this.f23285b;
                }
                i11 = i13;
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f23286c == this.f23285b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i11 = this.f23286c - 1;
            int i12 = this.f23285b;
            if (i12 > i11) {
                return -1;
            }
            while (true) {
                int i13 = i11 - 1;
                if (s.c(this.f23284a.get(i11), obj)) {
                    return i11 - this.f23285b;
                }
                if (i11 == i12) {
                    return -1;
                }
                i11 = i13;
            }
        }

        @Override // java.util.List
        public ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i11) {
            return c(i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            s.g(elements, "elements");
            int i11 = this.f23286c;
            Iterator<T> it2 = elements.iterator();
            while (it2.hasNext()) {
                remove(it2.next());
            }
            return i11 != this.f23286c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            s.g(elements, "elements");
            int i11 = this.f23286c;
            int i12 = i11 - 1;
            int i13 = this.f23285b;
            if (i13 <= i12) {
                while (true) {
                    int i14 = i12 - 1;
                    if (!elements.contains(this.f23284a.get(i12))) {
                        this.f23284a.remove(i12);
                        this.f23286c--;
                    }
                    if (i12 == i13) {
                        break;
                    }
                    i12 = i14;
                }
            }
            return i11 != this.f23286c;
        }

        @Override // java.util.List
        public T set(int i11, T t11) {
            return this.f23284a.set(i11 + this.f23285b, t11);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return b();
        }

        @Override // java.util.List
        public List<T> subList(int i11, int i12) {
            return new b(this, i11, i12);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return j.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            s.g(array, "array");
            return (T[]) j.b(this, array);
        }

        @Override // java.util.List
        public void add(int i11, T t11) {
            this.f23284a.add(i11 + this.f23285b, t11);
            this.f23286c++;
        }

        @Override // java.util.List
        public ListIterator<T> listIterator(int i11) {
            return new c(this, i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i11 = this.f23285b;
            int i12 = this.f23286c;
            while (i11 < i12) {
                int i13 = i11 + 1;
                if (s.c(this.f23284a.get(i11), obj)) {
                    this.f23284a.remove(i11);
                    this.f23286c--;
                    return true;
                }
                i11 = i13;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection<? extends T> elements) {
            s.g(elements, "elements");
            this.f23284a.addAll(this.f23286c, elements);
            this.f23286c += elements.size();
            return elements.size() > 0;
        }
    }

    /* loaded from: classes.dex */
    private static final class c<T> implements ListIterator<T>, i00.a {

        /* renamed from: a */
        private final List<T> f23287a;

        /* renamed from: b */
        private int f23288b;

        public c(List<T> list, int i11) {
            s.g(list, "list");
            this.f23287a = list;
            this.f23288b = i11;
        }

        @Override // java.util.ListIterator
        public void add(T t11) {
            this.f23287a.add(this.f23288b, t11);
            this.f23288b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f23288b < this.f23287a.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f23288b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.f23287a;
            int i11 = this.f23288b;
            this.f23288b = i11 + 1;
            return list.get(i11);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f23288b;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i11 = this.f23288b - 1;
            this.f23288b = i11;
            return this.f23287a.get(i11);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f23288b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i11 = this.f23288b - 1;
            this.f23288b = i11;
            this.f23287a.remove(i11);
        }

        @Override // java.util.ListIterator
        public void set(T t11) {
            this.f23287a.set(this.f23288b, t11);
        }
    }

    public e(T[] content, int i11) {
        s.g(content, "content");
        this.f23280a = content;
        this.f23282c = i11;
    }

    public final void a(int i11, T t11) {
        j(this.f23282c + 1);
        T[] tArr = this.f23280a;
        int i12 = this.f23282c;
        if (i11 != i12) {
            l.k(tArr, tArr, i11 + 1, i11, i12);
        }
        tArr[i11] = t11;
        this.f23282c++;
    }

    public final boolean b(T t11) {
        j(this.f23282c + 1);
        T[] tArr = this.f23280a;
        int i11 = this.f23282c;
        tArr[i11] = t11;
        this.f23282c = i11 + 1;
        return true;
    }

    public final boolean c(int i11, e<T> elements) {
        s.g(elements, "elements");
        if (elements.n()) {
            return false;
        }
        j(this.f23282c + elements.f23282c);
        T[] tArr = this.f23280a;
        int i12 = this.f23282c;
        if (i11 != i12) {
            l.k(tArr, tArr, elements.f23282c + i11, i11, i12);
        }
        l.k(elements.f23280a, tArr, i11, 0, elements.f23282c);
        this.f23282c += elements.f23282c;
        return true;
    }

    public final boolean d(int i11, Collection<? extends T> elements) {
        s.g(elements, "elements");
        int i12 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        j(this.f23282c + elements.size());
        T[] tArr = this.f23280a;
        if (i11 != this.f23282c) {
            l.k(tArr, tArr, elements.size() + i11, i11, this.f23282c);
        }
        for (T t11 : elements) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                w.s();
            }
            tArr[i12 + i11] = t11;
            i12 = i13;
        }
        this.f23282c += elements.size();
        return true;
    }

    public final boolean e(Collection<? extends T> elements) {
        s.g(elements, "elements");
        return d(this.f23282c, elements);
    }

    public final List<T> f() {
        List<T> list = this.f23281b;
        if (list == null) {
            a aVar = new a(this);
            this.f23281b = aVar;
            return aVar;
        }
        return list;
    }

    public final void g() {
        T[] tArr = this.f23280a;
        int l11 = l() - 1;
        if (l11 >= 0) {
            while (true) {
                int i11 = l11 - 1;
                tArr[l11] = null;
                if (i11 < 0) {
                    break;
                }
                l11 = i11;
            }
        }
        this.f23282c = 0;
    }

    public final boolean h(T t11) {
        int l11 = l() - 1;
        if (l11 >= 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (s.c(k()[i11], t11)) {
                    return true;
                }
                if (i11 == l11) {
                    break;
                }
                i11 = i12;
            }
        }
        return false;
    }

    public final boolean i(Collection<? extends T> elements) {
        s.g(elements, "elements");
        for (T t11 : elements) {
            if (!h(t11)) {
                return false;
            }
        }
        return true;
    }

    public final void j(int i11) {
        T[] tArr = this.f23280a;
        if (tArr.length < i11) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i11, tArr.length * 2));
            s.f(tArr2, "copyOf(this, newSize)");
            this.f23280a = tArr2;
        }
    }

    public final T[] k() {
        return this.f23280a;
    }

    public final int l() {
        return this.f23282c;
    }

    public final int m(T t11) {
        int i11 = this.f23282c;
        if (i11 > 0) {
            int i12 = 0;
            T[] tArr = this.f23280a;
            while (!s.c(t11, tArr[i12])) {
                i12++;
                if (i12 >= i11) {
                    return -1;
                }
            }
            return i12;
        }
        return -1;
    }

    public final boolean n() {
        return this.f23282c == 0;
    }

    public final boolean o() {
        return this.f23282c != 0;
    }

    public final int p(T t11) {
        int i11 = this.f23282c;
        if (i11 > 0) {
            int i12 = i11 - 1;
            T[] tArr = this.f23280a;
            while (!s.c(t11, tArr[i12])) {
                i12--;
                if (i12 < 0) {
                    return -1;
                }
            }
            return i12;
        }
        return -1;
    }

    public final boolean q(T t11) {
        int m11 = m(t11);
        if (m11 >= 0) {
            s(m11);
            return true;
        }
        return false;
    }

    public final boolean r(Collection<? extends T> elements) {
        s.g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        int i11 = this.f23282c;
        for (T t11 : elements) {
            q(t11);
        }
        return i11 != this.f23282c;
    }

    public final T s(int i11) {
        T[] tArr = this.f23280a;
        T t11 = tArr[i11];
        if (i11 != l() - 1) {
            l.k(tArr, tArr, i11, i11 + 1, this.f23282c);
        }
        int i12 = this.f23282c - 1;
        this.f23282c = i12;
        tArr[i12] = null;
        return t11;
    }

    public final boolean t(Collection<? extends T> elements) {
        s.g(elements, "elements");
        int i11 = this.f23282c;
        int l11 = l() - 1;
        if (l11 >= 0) {
            while (true) {
                int i12 = l11 - 1;
                if (!elements.contains(k()[l11])) {
                    s(l11);
                }
                if (i12 < 0) {
                    break;
                }
                l11 = i12;
            }
        }
        return i11 != this.f23282c;
    }

    public final T u(int i11, T t11) {
        T[] tArr = this.f23280a;
        T t12 = tArr[i11];
        tArr[i11] = t11;
        return t12;
    }

    public final void v(Comparator<T> comparator) {
        s.g(comparator, "comparator");
        o.z(this.f23280a, comparator, 0, this.f23282c);
    }
}