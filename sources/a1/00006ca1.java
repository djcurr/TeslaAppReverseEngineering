package f1;

import e1.e;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import wz.o;

/* loaded from: classes.dex */
public final class f<E> extends wz.f<E> implements e.a<E> {

    /* renamed from: a  reason: collision with root package name */
    private e1.e<? extends E> f25487a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f25488b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f25489c;

    /* renamed from: d  reason: collision with root package name */
    private int f25490d;

    /* renamed from: e  reason: collision with root package name */
    private i1.e f25491e;

    /* renamed from: f  reason: collision with root package name */
    private Object[] f25492f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f25493g;

    /* renamed from: h  reason: collision with root package name */
    private int f25494h;

    /* loaded from: classes.dex */
    static final class a extends u implements h00.l<E, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Collection<E> f25495a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends E> collection) {
            super(1);
            this.f25495a = collection;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(E e11) {
            return Boolean.valueOf(this.f25495a.contains(e11));
        }
    }

    public f(e1.e<? extends E> vector, Object[] objArr, Object[] vectorTail, int i11) {
        s.g(vector, "vector");
        s.g(vectorTail, "vectorTail");
        this.f25487a = vector;
        this.f25488b = objArr;
        this.f25489c = vectorTail;
        this.f25490d = i11;
        this.f25491e = new i1.e();
        this.f25492f = this.f25488b;
        this.f25493g = this.f25489c;
        this.f25494h = this.f25487a.size();
    }

    private final void A(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i11 = this.f25490d;
        if (size > (1 << i11)) {
            this.f25492f = B(u(objArr), objArr2, this.f25490d + 5);
            this.f25493g = objArr3;
            this.f25490d += 5;
            this.f25494h = size() + 1;
        } else if (objArr == null) {
            this.f25492f = objArr2;
            this.f25493g = objArr3;
            this.f25494h = size() + 1;
        } else {
            this.f25492f = B(objArr, objArr2, i11);
            this.f25493g = objArr3;
            this.f25494h = size() + 1;
        }
    }

    private final Object[] B(Object[] objArr, Object[] objArr2, int i11) {
        int a11 = l.a(size() - 1, i11);
        Object[] r11 = r(objArr);
        if (i11 == 5) {
            r11[a11] = objArr2;
        } else {
            r11[a11] = B((Object[]) r11[a11], objArr2, i11 - 5);
        }
        return r11;
    }

    private final int C(h00.l<? super E, Boolean> lVar, Object[] objArr, int i11, int i12, d dVar, List<Object[]> list, List<Object[]> list2) {
        Object[] t11;
        if (p(objArr)) {
            list.add(objArr);
        }
        Object a11 = dVar.a();
        Objects.requireNonNull(a11, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a11;
        Object[] objArr3 = objArr2;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = i13 + 1;
            Object obj = objArr[i13];
            if (lVar.invoke(obj).booleanValue()) {
                i13 = i14;
            } else {
                if (i12 == 32) {
                    if (!list.isEmpty()) {
                        t11 = list.remove(list.size() - 1);
                    } else {
                        t11 = t();
                    }
                    objArr3 = t11;
                    i12 = 0;
                }
                objArr3[i12] = obj;
                i13 = i14;
                i12++;
            }
        }
        dVar.b(objArr3);
        if (objArr2 != dVar.a()) {
            list2.add(objArr2);
        }
        return i12;
    }

    private final int D(h00.l<? super E, Boolean> lVar, Object[] objArr, int i11, d dVar) {
        int i12 = 0;
        Object[] objArr2 = objArr;
        int i13 = i11;
        boolean z11 = false;
        while (i12 < i11) {
            int i14 = i12 + 1;
            Object obj = objArr[i12];
            if (lVar.invoke(obj).booleanValue()) {
                if (z11) {
                    i12 = i14;
                } else {
                    objArr2 = r(objArr);
                    z11 = true;
                    i13 = i12;
                    i12 = i14;
                }
            } else if (z11) {
                i12 = i13 + 1;
                objArr2[i13] = obj;
                i13 = i12;
                i12 = i14;
            } else {
                i12 = i14;
            }
        }
        dVar.b(objArr2);
        return i13;
    }

    private final boolean E(h00.l<? super E, Boolean> lVar) {
        Object[] y11;
        int P = P();
        d dVar = new d(null);
        if (this.f25492f == null) {
            return F(lVar, P, dVar) != P;
        }
        ListIterator<Object[]> q11 = q(0);
        int i11 = 32;
        while (i11 == 32 && q11.hasNext()) {
            i11 = D(lVar, q11.next(), 32, dVar);
        }
        if (i11 == 32) {
            i1.a.a(!q11.hasNext());
            int F = F(lVar, P, dVar);
            if (F == 0) {
                x(this.f25492f, size(), this.f25490d);
            }
            return F != P;
        }
        int previousIndex = q11.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i12 = i11;
        while (q11.hasNext()) {
            i12 = C(lVar, q11.next(), 32, i12, dVar, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i13 = previousIndex;
        int C = C(lVar, this.f25493g, P, i12, dVar, arrayList2, arrayList);
        Object a11 = dVar.a();
        Objects.requireNonNull(a11, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a11;
        o.t(objArr, null, C, 32);
        if (arrayList.isEmpty()) {
            y11 = this.f25492f;
            s.e(y11);
        } else {
            y11 = y(this.f25492f, i13, this.f25490d, arrayList.iterator());
        }
        int size = i13 + (arrayList.size() << 5);
        this.f25492f = K(y11, size);
        this.f25493g = objArr;
        this.f25494h = size + C;
        return true;
    }

    private final int F(h00.l<? super E, Boolean> lVar, int i11, d dVar) {
        int D = D(lVar, this.f25493g, i11, dVar);
        if (D == i11) {
            i1.a.a(dVar.a() == this.f25493g);
            return i11;
        }
        Object a11 = dVar.a();
        Objects.requireNonNull(a11, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a11;
        o.t(objArr, null, D, i11);
        this.f25493g = objArr;
        this.f25494h = size() - (i11 - D);
        return D;
    }

    private final Object[] H(Object[] objArr, int i11, int i12, d dVar) {
        int a11 = l.a(i12, i11);
        if (i11 == 0) {
            Object obj = objArr[a11];
            Object[] k11 = wz.l.k(objArr, r(objArr), a11, a11 + 1, 32);
            k11[31] = dVar.a();
            dVar.b(obj);
            return k11;
        }
        int a12 = objArr[31] == null ? l.a(L() - 1, i11) : 31;
        Object[] r11 = r(objArr);
        int i13 = i11 - 5;
        int i14 = a11 + 1;
        if (i14 <= a12) {
            while (true) {
                int i15 = a12 - 1;
                Object obj2 = r11[a12];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                r11[a12] = H((Object[]) obj2, i13, 0, dVar);
                if (a12 == i14) {
                    break;
                }
                a12 = i15;
            }
        }
        Object obj3 = r11[a11];
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        r11[a11] = H((Object[]) obj3, i13, i12, dVar);
        return r11;
    }

    private final Object I(Object[] objArr, int i11, int i12, int i13) {
        int size = size() - i11;
        i1.a.a(i13 < size);
        if (size == 1) {
            Object obj = this.f25493g[0];
            x(objArr, i11, i12);
            return obj;
        }
        Object[] objArr2 = this.f25493g;
        Object obj2 = objArr2[i13];
        Object[] k11 = wz.l.k(objArr2, r(objArr2), i13, i13 + 1, size);
        k11[size - 1] = null;
        this.f25492f = objArr;
        this.f25493g = k11;
        this.f25494h = (i11 + size) - 1;
        this.f25490d = i12;
        return obj2;
    }

    private final Object[] K(Object[] objArr, int i11) {
        if (!((i11 & 31) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i11 == 0) {
            this.f25490d = 0;
            return null;
        }
        int i12 = i11 - 1;
        while (true) {
            int i13 = this.f25490d;
            if ((i12 >> i13) == 0) {
                this.f25490d = i13 - 5;
                Object[] objArr2 = objArr[0];
                Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = objArr2;
            } else {
                return v(objArr, i12, i13);
            }
        }
    }

    private final int L() {
        if (size() <= 32) {
            return 0;
        }
        return l.d(size());
    }

    private final Object[] M(Object[] objArr, int i11, int i12, E e11, d dVar) {
        int a11 = l.a(i12, i11);
        Object[] r11 = r(objArr);
        if (i11 == 0) {
            if (r11 != objArr) {
                ((AbstractList) this).modCount++;
            }
            dVar.b(r11[a11]);
            r11[a11] = e11;
            return r11;
        }
        Object obj = r11[a11];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        r11[a11] = M((Object[]) obj, i11 - 5, i12, e11, dVar);
        return r11;
    }

    private final Object[] N(int i11, int i12, Object[][] objArr, int i13, Object[] objArr2) {
        if (this.f25492f != null) {
            ListIterator<Object[]> q11 = q(L() >> 5);
            while (q11.previousIndex() != i11) {
                Object[] previous = q11.previous();
                wz.l.k(previous, objArr2, 0, 32 - i12, 32);
                objArr2 = s(previous, i12);
                i13--;
                objArr[i13] = objArr2;
            }
            return q11.previous();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final void O(Collection<? extends E> collection, int i11, Object[] objArr, int i12, Object[][] objArr2, int i13, Object[] objArr3) {
        Object[] t11;
        if (i13 >= 1) {
            Object[] r11 = r(objArr);
            objArr2[0] = r11;
            int i14 = i11 & 31;
            int size = ((i11 + collection.size()) - 1) & 31;
            int i15 = (i12 - i14) + size;
            if (i15 < 32) {
                wz.l.k(r11, objArr3, size + 1, i14, i12);
            } else {
                int i16 = (i15 - 32) + 1;
                if (i13 == 1) {
                    t11 = r11;
                } else {
                    t11 = t();
                    i13--;
                    objArr2[i13] = t11;
                }
                int i17 = i12 - i16;
                wz.l.k(r11, objArr3, 0, i17, i12);
                wz.l.k(r11, t11, size + 1, i14, i17);
                objArr3 = t11;
            }
            Iterator<? extends E> it2 = collection.iterator();
            f(r11, i14, it2);
            for (int i18 = 1; i18 < i13; i18++) {
                objArr2[i18] = f(t(), 0, it2);
            }
            f(objArr3, 0, it2);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final int P() {
        return Q(size());
    }

    private final int Q(int i11) {
        return i11 <= 32 ? i11 : i11 - l.d(i11);
    }

    private final Object[] e(int i11) {
        if (L() <= i11) {
            return this.f25493g;
        }
        Object[] objArr = this.f25492f;
        s.e(objArr);
        for (int i12 = this.f25490d; i12 > 0; i12 -= 5) {
            Object[] objArr2 = objArr[l.a(i11, i12)];
            Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] f(Object[] objArr, int i11, Iterator<? extends Object> it2) {
        while (i11 < 32 && it2.hasNext()) {
            objArr[i11] = it2.next();
            i11++;
        }
        return objArr;
    }

    private final void m(Collection<? extends E> collection, int i11, int i12, Object[][] objArr, int i13, Object[] objArr2) {
        if (this.f25492f != null) {
            int i14 = i11 >> 5;
            Object[] N = N(i14, i12, objArr, i13, objArr2);
            int L = i13 - (((L() >> 5) - 1) - i14);
            if (L < i13) {
                objArr2 = objArr[L];
                s.e(objArr2);
            }
            O(collection, i11, N, 32, objArr, L, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final Object[] n(Object[] objArr, int i11, int i12, Object obj, d dVar) {
        int a11 = l.a(i12, i11);
        if (i11 == 0) {
            dVar.b(objArr[31]);
            Object[] k11 = wz.l.k(objArr, r(objArr), a11 + 1, a11, 31);
            k11[a11] = obj;
            return k11;
        }
        Object[] r11 = r(objArr);
        int i13 = i11 - 5;
        Object obj2 = r11[a11];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        r11[a11] = n((Object[]) obj2, i13, i12, obj, dVar);
        int i14 = a11 + 1;
        while (i14 < 32) {
            int i15 = i14 + 1;
            if (r11[i14] == null) {
                break;
            }
            Object obj3 = r11[i14];
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            r11[i14] = n((Object[]) obj3, i13, 0, dVar.a(), dVar);
            i14 = i15;
        }
        return r11;
    }

    private final void o(Object[] objArr, int i11, E e11) {
        int P = P();
        Object[] r11 = r(this.f25493g);
        if (P < 32) {
            wz.l.k(this.f25493g, r11, i11 + 1, i11, P);
            r11[i11] = e11;
            this.f25492f = objArr;
            this.f25493g = r11;
            this.f25494h = size() + 1;
            return;
        }
        Object[] objArr2 = this.f25493g;
        Object obj = objArr2[31];
        wz.l.k(objArr2, r11, i11 + 1, i11, 31);
        r11[i11] = e11;
        A(objArr, r11, u(obj));
    }

    private final boolean p(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f25491e;
    }

    private final ListIterator<Object[]> q(int i11) {
        if (this.f25492f != null) {
            int L = L() >> 5;
            i1.d.b(i11, L);
            int i12 = this.f25490d;
            if (i12 == 0) {
                Object[] objArr = this.f25492f;
                s.e(objArr);
                return new i(objArr, i11);
            }
            Object[] objArr2 = this.f25492f;
            s.e(objArr2);
            return new k(objArr2, i11, L, i12 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    private final Object[] r(Object[] objArr) {
        int i11;
        Object[] o11;
        if (objArr == null) {
            return t();
        }
        if (p(objArr)) {
            return objArr;
        }
        Object[] t11 = t();
        i11 = m00.l.i(objArr.length, 32);
        o11 = o.o(objArr, t11, 0, 0, i11, 6, null);
        return o11;
    }

    private final Object[] s(Object[] objArr, int i11) {
        if (p(objArr)) {
            return wz.l.k(objArr, objArr, i11, 0, 32 - i11);
        }
        return wz.l.k(objArr, t(), i11, 0, 32 - i11);
    }

    private final Object[] t() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f25491e;
        return objArr;
    }

    private final Object[] u(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f25491e;
        return objArr;
    }

    private final Object[] v(Object[] objArr, int i11, int i12) {
        if (i12 >= 0) {
            if (i12 == 0) {
                return objArr;
            }
            int a11 = l.a(i11, i12);
            Object obj = objArr[a11];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object v11 = v((Object[]) obj, i11, i12 - 5);
            if (a11 < 31) {
                int i13 = a11 + 1;
                if (objArr[i13] != null) {
                    if (p(objArr)) {
                        o.t(objArr, null, i13, 32);
                    }
                    objArr = wz.l.k(objArr, t(), 0, 0, i13);
                }
            }
            if (v11 != objArr[a11]) {
                Object[] r11 = r(objArr);
                r11[a11] = v11;
                return r11;
            }
            return objArr;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final Object[] w(Object[] objArr, int i11, int i12, d dVar) {
        Object[] w11;
        int a11 = l.a(i12 - 1, i11);
        if (i11 == 5) {
            dVar.b(objArr[a11]);
            w11 = null;
        } else {
            Object obj = objArr[a11];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            w11 = w((Object[]) obj, i11 - 5, i12, dVar);
        }
        if (w11 == null && a11 == 0) {
            return null;
        }
        Object[] r11 = r(objArr);
        r11[a11] = w11;
        return r11;
    }

    private final void x(Object[] objArr, int i11, int i12) {
        if (i12 == 0) {
            this.f25492f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f25493g = objArr;
            this.f25494h = i11;
            this.f25490d = i12;
            return;
        }
        d dVar = new d(null);
        s.e(objArr);
        Object[] w11 = w(objArr, i12, i11, dVar);
        s.e(w11);
        Object a11 = dVar.a();
        Objects.requireNonNull(a11, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f25493g = (Object[]) a11;
        this.f25494h = i11;
        if (w11[1] == null) {
            this.f25492f = (Object[]) w11[0];
            this.f25490d = i12 - 5;
            return;
        }
        this.f25492f = w11;
        this.f25490d = i12;
    }

    private final Object[] y(Object[] objArr, int i11, int i12, Iterator<Object[]> it2) {
        if (it2.hasNext()) {
            if (i12 >= 0) {
                if (i12 == 0) {
                    return it2.next();
                }
                Object[] r11 = r(objArr);
                int a11 = l.a(i11, i12);
                int i13 = i12 - 5;
                r11[a11] = y((Object[]) r11[a11], i11, i13, it2);
                while (true) {
                    a11++;
                    if (a11 >= 32 || !it2.hasNext()) {
                        break;
                    }
                    r11[a11] = y((Object[]) r11[a11], 0, i13, it2);
                }
                return r11;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final Object[] z(Object[] objArr, int i11, Object[][] objArr2) {
        Object[] r11;
        Iterator<Object[]> a11 = kotlin.jvm.internal.c.a(objArr2);
        int i12 = i11 >> 5;
        int i13 = this.f25490d;
        if (i12 < (1 << i13)) {
            r11 = y(objArr, i11, i13, a11);
        } else {
            r11 = r(objArr);
        }
        while (a11.hasNext()) {
            this.f25490d += 5;
            r11 = u(r11);
            int i14 = this.f25490d;
            y(r11, 1 << i14, i14, a11);
        }
        return r11;
    }

    public final boolean G(h00.l<? super E, Boolean> predicate) {
        s.g(predicate, "predicate");
        boolean E = E(predicate);
        if (E) {
            ((AbstractList) this).modCount++;
        }
        return E;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e11) {
        ((AbstractList) this).modCount++;
        int P = P();
        if (P < 32) {
            Object[] r11 = r(this.f25493g);
            r11[P] = e11;
            this.f25493g = r11;
            this.f25494h = size() + 1;
        } else {
            A(this.f25492f, this.f25493g, u(e11));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        s.g(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int P = P();
        Iterator<? extends E> it2 = elements.iterator();
        if (32 - P >= elements.size()) {
            this.f25493g = f(r(this.f25493g), P, it2);
            this.f25494h = size() + elements.size();
        } else {
            int size = ((elements.size() + P) - 1) / 32;
            Object[][] objArr = new Object[size];
            objArr[0] = f(r(this.f25493g), P, it2);
            for (int i11 = 1; i11 < size; i11++) {
                objArr[i11] = f(t(), 0, it2);
            }
            this.f25492f = z(this.f25492f, L(), objArr);
            this.f25493g = f(t(), 0, it2);
            this.f25494h = size() + elements.size();
        }
        return true;
    }

    @Override // wz.f
    public int b() {
        return this.f25494h;
    }

    @Override // e1.e.a
    public e1.e<E> build() {
        e eVar;
        if (this.f25492f == this.f25488b && this.f25493g == this.f25489c) {
            eVar = this.f25487a;
        } else {
            this.f25491e = new i1.e();
            Object[] objArr = this.f25492f;
            this.f25488b = objArr;
            Object[] objArr2 = this.f25493g;
            this.f25489c = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    eVar = l.b();
                } else {
                    Object[] copyOf = Arrays.copyOf(this.f25493g, size());
                    s.f(copyOf, "copyOf(this, newSize)");
                    eVar = new j(copyOf);
                }
            } else {
                Object[] objArr3 = this.f25492f;
                s.e(objArr3);
                eVar = new e(objArr3, this.f25493g, size(), this.f25490d);
            }
        }
        this.f25487a = eVar;
        return (e1.e<E>) eVar;
    }

    @Override // wz.f
    public E c(int i11) {
        i1.d.a(i11, size());
        ((AbstractList) this).modCount++;
        int L = L();
        if (i11 >= L) {
            return (E) I(this.f25492f, L, this.f25490d, i11 - L);
        }
        d dVar = new d(this.f25493g[0]);
        Object[] objArr = this.f25492f;
        s.e(objArr);
        I(H(objArr, this.f25490d, i11, dVar), L, this.f25490d, 0);
        return (E) dVar.a();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i11) {
        i1.d.a(i11, size());
        return (E) e(i11)[i11 & 31];
    }

    public final int h() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] i() {
        return this.f25492f;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    public final int j() {
        return this.f25490d;
    }

    public final Object[] k() {
        return this.f25493g;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        s.g(elements, "elements");
        return G(new a(elements));
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i11, E e11) {
        i1.d.a(i11, size());
        if (L() <= i11) {
            Object[] r11 = r(this.f25493g);
            if (r11 != this.f25493g) {
                ((AbstractList) this).modCount++;
            }
            int i12 = i11 & 31;
            E e12 = (E) r11[i12];
            r11[i12] = e11;
            this.f25493g = r11;
            return e12;
        }
        d dVar = new d(null);
        Object[] objArr = this.f25492f;
        s.e(objArr);
        this.f25492f = M(objArr, this.f25490d, i11, e11, dVar);
        return (E) dVar.a();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i11) {
        i1.d.b(i11, size());
        return new h(this, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int i11, E e11) {
        i1.d.b(i11, size());
        if (i11 == size()) {
            add(e11);
            return;
        }
        ((AbstractList) this).modCount++;
        int L = L();
        if (i11 >= L) {
            o(this.f25492f, i11 - L, e11);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.f25492f;
        s.e(objArr);
        o(n(objArr, this.f25490d, i11, e11, dVar), 0, dVar.a());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i11, Collection<? extends E> elements) {
        Object[] k11;
        s.g(elements, "elements");
        i1.d.b(i11, size());
        if (i11 == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i12 = (i11 >> 5) << 5;
        int size = (((size() - i12) + elements.size()) - 1) / 32;
        if (size == 0) {
            i1.a.a(i11 >= L());
            int i13 = i11 & 31;
            Object[] objArr = this.f25493g;
            Object[] k12 = wz.l.k(objArr, r(objArr), (((i11 + elements.size()) - 1) & 31) + 1, i13, P());
            f(k12, i13, elements.iterator());
            this.f25493g = k12;
            this.f25494h = size() + elements.size();
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int P = P();
        int Q = Q(size() + elements.size());
        if (i11 >= L()) {
            k11 = t();
            O(elements, i11, this.f25493g, P, objArr2, size, k11);
        } else if (Q > P) {
            int i14 = Q - P;
            k11 = s(this.f25493g, i14);
            m(elements, i11, i14, objArr2, size, k11);
        } else {
            int i15 = P - Q;
            k11 = wz.l.k(this.f25493g, t(), 0, i15, P);
            int i16 = 32 - i15;
            Object[] s11 = s(this.f25493g, i16);
            int i17 = size - 1;
            objArr2[i17] = s11;
            m(elements, i11, i16, objArr2, i17, s11);
        }
        this.f25492f = z(this.f25492f, i12, objArr2);
        this.f25493g = k11;
        this.f25494h = size() + elements.size();
        return true;
    }
}