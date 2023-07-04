package androidx.collection;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f2711e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    private static final Object[] f2712f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    private static Object[] f2713g;

    /* renamed from: h  reason: collision with root package name */
    private static int f2714h;

    /* renamed from: i  reason: collision with root package name */
    private static Object[] f2715i;

    /* renamed from: j  reason: collision with root package name */
    private static int f2716j;

    /* renamed from: a  reason: collision with root package name */
    private int[] f2717a;

    /* renamed from: b  reason: collision with root package name */
    Object[] f2718b;

    /* renamed from: c  reason: collision with root package name */
    int f2719c;

    /* renamed from: d  reason: collision with root package name */
    private f<E, E> f2720d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends f<E, E> {
        a() {
        }

        @Override // androidx.collection.f
        protected void a() {
            b.this.clear();
        }

        @Override // androidx.collection.f
        protected Object b(int i11, int i12) {
            return b.this.f2718b[i11];
        }

        @Override // androidx.collection.f
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.f
        protected int d() {
            return b.this.f2719c;
        }

        @Override // androidx.collection.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.f
        protected void g(E e11, E e12) {
            b.this.add(e11);
        }

        @Override // androidx.collection.f
        protected void h(int i11) {
            b.this.i(i11);
        }

        @Override // androidx.collection.f
        protected E i(int i11, E e11) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void b(int i11) {
        if (i11 == 8) {
            synchronized (b.class) {
                Object[] objArr = f2715i;
                if (objArr != null) {
                    this.f2718b = objArr;
                    f2715i = (Object[]) objArr[0];
                    this.f2717a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2716j--;
                    return;
                }
            }
        } else if (i11 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f2713g;
                if (objArr2 != null) {
                    this.f2718b = objArr2;
                    f2713g = (Object[]) objArr2[0];
                    this.f2717a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2714h--;
                    return;
                }
            }
        }
        this.f2717a = new int[i11];
        this.f2718b = new Object[i11];
    }

    private static void d(int[] iArr, Object[] objArr, int i11) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f2716j < 10) {
                    objArr[0] = f2715i;
                    objArr[1] = iArr;
                    for (int i12 = i11 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f2715i = objArr;
                    f2716j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f2714h < 10) {
                    objArr[0] = f2713g;
                    objArr[1] = iArr;
                    for (int i13 = i11 - 1; i13 >= 2; i13--) {
                        objArr[i13] = null;
                    }
                    f2713g = objArr;
                    f2714h++;
                }
            }
        }
    }

    private f<E, E> e() {
        if (this.f2720d == null) {
            this.f2720d = new a();
        }
        return this.f2720d;
    }

    private int f(Object obj, int i11) {
        int i12 = this.f2719c;
        if (i12 == 0) {
            return -1;
        }
        int a11 = c.a(this.f2717a, i12, i11);
        if (a11 >= 0 && !obj.equals(this.f2718b[a11])) {
            int i13 = a11 + 1;
            while (i13 < i12 && this.f2717a[i13] == i11) {
                if (obj.equals(this.f2718b[i13])) {
                    return i13;
                }
                i13++;
            }
            for (int i14 = a11 - 1; i14 >= 0 && this.f2717a[i14] == i11; i14--) {
                if (obj.equals(this.f2718b[i14])) {
                    return i14;
                }
            }
            return ~i13;
        }
        return a11;
    }

    private int h() {
        int i11 = this.f2719c;
        if (i11 == 0) {
            return -1;
        }
        int a11 = c.a(this.f2717a, i11, 0);
        if (a11 >= 0 && this.f2718b[a11] != null) {
            int i12 = a11 + 1;
            while (i12 < i11 && this.f2717a[i12] == 0) {
                if (this.f2718b[i12] == null) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = a11 - 1; i13 >= 0 && this.f2717a[i13] == 0; i13--) {
                if (this.f2718b[i13] == null) {
                    return i13;
                }
            }
            return ~i12;
        }
        return a11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e11) {
        int i11;
        int f11;
        if (e11 == null) {
            f11 = h();
            i11 = 0;
        } else {
            int hashCode = e11.hashCode();
            i11 = hashCode;
            f11 = f(e11, hashCode);
        }
        if (f11 >= 0) {
            return false;
        }
        int i12 = ~f11;
        int i13 = this.f2719c;
        int[] iArr = this.f2717a;
        if (i13 >= iArr.length) {
            int i14 = 4;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 >= 4) {
                i14 = 8;
            }
            Object[] objArr = this.f2718b;
            b(i14);
            int[] iArr2 = this.f2717a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2718b, 0, objArr.length);
            }
            d(iArr, objArr, this.f2719c);
        }
        int i15 = this.f2719c;
        if (i12 < i15) {
            int[] iArr3 = this.f2717a;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr2 = this.f2718b;
            System.arraycopy(objArr2, i12, objArr2, i16, this.f2719c - i12);
        }
        this.f2717a[i12] = i11;
        this.f2718b[i12] = e11;
        this.f2719c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        c(this.f2719c + collection.size());
        boolean z11 = false;
        for (E e11 : collection) {
            z11 |= add(e11);
        }
        return z11;
    }

    public void c(int i11) {
        int[] iArr = this.f2717a;
        if (iArr.length < i11) {
            Object[] objArr = this.f2718b;
            b(i11);
            int i12 = this.f2719c;
            if (i12 > 0) {
                System.arraycopy(iArr, 0, this.f2717a, 0, i12);
                System.arraycopy(objArr, 0, this.f2718b, 0, this.f2719c);
            }
            d(iArr, objArr, this.f2719c);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i11 = this.f2719c;
        if (i11 != 0) {
            d(this.f2717a, this.f2718b, i11);
            this.f2717a = f2711e;
            this.f2718b = f2712f;
            this.f2719c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f2719c; i11++) {
                try {
                    if (!set.contains(j(i11))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f2717a;
        int i11 = this.f2719c;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += iArr[i13];
        }
        return i12;
    }

    public E i(int i11) {
        Object[] objArr = this.f2718b;
        E e11 = (E) objArr[i11];
        int i12 = this.f2719c;
        if (i12 <= 1) {
            d(this.f2717a, objArr, i12);
            this.f2717a = f2711e;
            this.f2718b = f2712f;
            this.f2719c = 0;
        } else {
            int[] iArr = this.f2717a;
            if (iArr.length > 8 && i12 < iArr.length / 3) {
                b(i12 > 8 ? i12 + (i12 >> 1) : 8);
                this.f2719c--;
                if (i11 > 0) {
                    System.arraycopy(iArr, 0, this.f2717a, 0, i11);
                    System.arraycopy(objArr, 0, this.f2718b, 0, i11);
                }
                int i13 = this.f2719c;
                if (i11 < i13) {
                    int i14 = i11 + 1;
                    System.arraycopy(iArr, i14, this.f2717a, i11, i13 - i11);
                    System.arraycopy(objArr, i14, this.f2718b, i11, this.f2719c - i11);
                }
            } else {
                int i15 = i12 - 1;
                this.f2719c = i15;
                if (i11 < i15) {
                    int i16 = i11 + 1;
                    System.arraycopy(iArr, i16, iArr, i11, i15 - i11);
                    Object[] objArr2 = this.f2718b;
                    System.arraycopy(objArr2, i16, objArr2, i11, this.f2719c - i11);
                }
                this.f2718b[this.f2719c] = null;
            }
        }
        return e11;
    }

    public int indexOf(Object obj) {
        return obj == null ? h() : f(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f2719c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return e().m().iterator();
    }

    public E j(int i11) {
        return (E) this.f2718b[i11];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            i(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it2 = collection.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            z11 |= remove(it2.next());
        }
        return z11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z11 = false;
        for (int i11 = this.f2719c - 1; i11 >= 0; i11--) {
            if (!collection.contains(this.f2718b[i11])) {
                i(i11);
                z11 = true;
            }
        }
        return z11;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f2719c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i11 = this.f2719c;
        Object[] objArr = new Object[i11];
        System.arraycopy(this.f2718b, 0, objArr, 0, i11);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2719c * 14);
        sb2.append(CoreConstants.CURLY_LEFT);
        for (int i11 = 0; i11 < this.f2719c; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            E j11 = j(i11);
            if (j11 != this) {
                sb2.append(j11);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    public b(int i11) {
        if (i11 == 0) {
            this.f2717a = f2711e;
            this.f2718b = f2712f;
        } else {
            b(i11);
        }
        this.f2719c = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2719c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2719c));
        }
        System.arraycopy(this.f2718b, 0, tArr, 0, this.f2719c);
        int length = tArr.length;
        int i11 = this.f2719c;
        if (length > i11) {
            tArr[i11] = null;
        }
        return tArr;
    }
}