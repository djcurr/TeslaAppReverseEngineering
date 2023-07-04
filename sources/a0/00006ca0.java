package f1;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class e<E> extends b<E> {

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f25483b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f25484c;

    /* renamed from: d  reason: collision with root package name */
    private final int f25485d;

    /* renamed from: e  reason: collision with root package name */
    private final int f25486e;

    public e(Object[] root, Object[] tail, int i11, int i12) {
        int i13;
        s.g(root, "root");
        s.g(tail, "tail");
        this.f25483b = root;
        this.f25484c = tail;
        this.f25485d = i11;
        this.f25486e = i12;
        if (size() > 32) {
            int size = size() - l.d(size());
            i13 = m00.l.i(tail.length, 32);
            i1.a.a(size <= i13);
            return;
        }
        throw new IllegalArgumentException(s.p("Trie-based persistent vector should have at least 33 elements, got ", Integer.valueOf(size())).toString());
    }

    private final Object[] e(int i11) {
        if (q() <= i11) {
            return this.f25484c;
        }
        Object[] objArr = this.f25483b;
        for (int i12 = this.f25486e; i12 > 0; i12 -= 5) {
            Object[] objArr2 = objArr[l.a(i11, i12)];
            Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] h(Object[] objArr, int i11, int i12, Object obj, d dVar) {
        Object[] copyOf;
        int a11 = l.a(i12, i11);
        if (i11 == 0) {
            if (a11 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                s.f(copyOf, "copyOf(this, newSize)");
            }
            wz.l.k(objArr, copyOf, a11 + 1, a11, 31);
            dVar.b(objArr[31]);
            copyOf[a11] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        s.f(copyOf2, "copyOf(this, newSize)");
        int i13 = i11 - 5;
        Object obj2 = objArr[a11];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[a11] = h((Object[]) obj2, i13, i12, obj, dVar);
        int i14 = a11 + 1;
        while (i14 < 32) {
            int i15 = i14 + 1;
            if (copyOf2[i14] == null) {
                break;
            }
            Object obj3 = objArr[i14];
            Objects.requireNonNull(obj3, str);
            Object[] objArr2 = copyOf2;
            objArr2[i14] = h((Object[]) obj3, i13, 0, dVar.a(), dVar);
            i14 = i15;
            copyOf2 = objArr2;
            str = str;
        }
        return copyOf2;
    }

    private final e<E> i(Object[] objArr, int i11, Object obj) {
        int size = size() - q();
        Object[] copyOf = Arrays.copyOf(this.f25484c, 32);
        s.f(copyOf, "copyOf(this, newSize)");
        if (size < 32) {
            wz.l.k(this.f25484c, copyOf, i11 + 1, i11, size);
            copyOf[i11] = obj;
            return new e<>(objArr, copyOf, size() + 1, this.f25486e);
        }
        Object[] objArr2 = this.f25484c;
        Object obj2 = objArr2[31];
        wz.l.k(objArr2, copyOf, i11 + 1, i11, size - 1);
        copyOf[i11] = obj;
        return m(objArr, copyOf, l.c(obj2));
    }

    private final Object[] j(Object[] objArr, int i11, int i12, d dVar) {
        Object[] j11;
        int a11 = l.a(i12, i11);
        if (i11 == 5) {
            dVar.b(objArr[a11]);
            j11 = null;
        } else {
            Object obj = objArr[a11];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            j11 = j((Object[]) obj, i11 - 5, i12, dVar);
        }
        if (j11 == null && a11 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        s.f(copyOf, "copyOf(this, newSize)");
        copyOf[a11] = j11;
        return copyOf;
    }

    private final e1.e<E> k(Object[] objArr, int i11, int i12) {
        if (i12 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                s.f(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        d dVar = new d(null);
        Object[] j11 = j(objArr, i12, i11 - 1, dVar);
        s.e(j11);
        Object a11 = dVar.a();
        Objects.requireNonNull(a11, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a11;
        if (j11[1] == null) {
            Object obj = j11[0];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return new e((Object[]) obj, objArr2, i11, i12 - 5);
        }
        return new e(j11, objArr2, i11, i12);
    }

    private final e<E> m(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i11 = this.f25486e;
        if (size > (1 << i11)) {
            Object[] c11 = l.c(objArr);
            int i12 = this.f25486e + 5;
            return new e<>(n(c11, i12, objArr2), objArr3, size() + 1, i12);
        }
        return new e<>(n(objArr, i11, objArr2), objArr3, size() + 1, this.f25486e);
    }

    private final Object[] n(Object[] objArr, int i11, Object[] objArr2) {
        Object[] copyOf;
        int a11 = l.a(size() - 1, i11);
        if (objArr == null) {
            copyOf = null;
        } else {
            copyOf = Arrays.copyOf(objArr, 32);
            s.f(copyOf, "copyOf(this, newSize)");
        }
        if (copyOf == null) {
            copyOf = new Object[32];
        }
        if (i11 == 5) {
            copyOf[a11] = objArr2;
        } else {
            copyOf[a11] = n((Object[]) copyOf[a11], i11 - 5, objArr2);
        }
        return copyOf;
    }

    private final Object[] o(Object[] objArr, int i11, int i12, d dVar) {
        Object[] copyOf;
        int a11 = l.a(i12, i11);
        if (i11 == 0) {
            if (a11 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                s.f(copyOf, "copyOf(this, newSize)");
            }
            wz.l.k(objArr, copyOf, a11, a11 + 1, 32);
            copyOf[31] = dVar.a();
            dVar.b(objArr[a11]);
            return copyOf;
        }
        int a12 = objArr[31] == null ? l.a(q() - 1, i11) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        s.f(copyOf2, "copyOf(this, newSize)");
        int i13 = i11 - 5;
        int i14 = a11 + 1;
        if (i14 <= a12) {
            while (true) {
                int i15 = a12 - 1;
                Object obj = copyOf2[a12];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[a12] = o((Object[]) obj, i13, 0, dVar);
                if (a12 == i14) {
                    break;
                }
                a12 = i15;
            }
        }
        Object obj2 = copyOf2[a11];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[a11] = o((Object[]) obj2, i13, i12, dVar);
        return copyOf2;
    }

    private final e1.e<E> p(Object[] objArr, int i11, int i12, int i13) {
        int size = size() - i11;
        i1.a.a(i13 < size);
        if (size == 1) {
            return k(objArr, i11, i12);
        }
        Object[] copyOf = Arrays.copyOf(this.f25484c, 32);
        s.f(copyOf, "copyOf(this, newSize)");
        int i14 = size - 1;
        if (i13 < i14) {
            wz.l.k(this.f25484c, copyOf, i13, i13 + 1, size);
        }
        copyOf[i14] = null;
        return new e(objArr, copyOf, (i11 + size) - 1, i12);
    }

    private final int q() {
        return l.d(size());
    }

    private final Object[] r(Object[] objArr, int i11, int i12, Object obj) {
        int a11 = l.a(i12, i11);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        s.f(copyOf, "copyOf(this, newSize)");
        if (i11 == 0) {
            copyOf[a11] = obj;
        } else {
            Object obj2 = copyOf[a11];
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[a11] = r((Object[]) obj2, i11 - 5, i12, obj);
        }
        return copyOf;
    }

    @Override // e1.e
    public e1.e<E> J(int i11) {
        i1.d.a(i11, size());
        int q11 = q();
        if (i11 >= q11) {
            return p(this.f25483b, q11, this.f25486e, i11 - q11);
        }
        return p(o(this.f25483b, this.f25486e, i11, new d(this.f25484c[0])), q11, this.f25486e, 0);
    }

    @Override // java.util.Collection, java.util.List, e1.e
    public e1.e<E> add(E e11) {
        int size = size() - q();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.f25484c, 32);
            s.f(copyOf, "copyOf(this, newSize)");
            copyOf[size] = e11;
            return new e(this.f25483b, copyOf, size() + 1, this.f25486e);
        }
        return m(this.f25483b, this.f25484c, l.c(e11));
    }

    @Override // wz.a
    public int b() {
        return this.f25485d;
    }

    @Override // e1.e
    /* renamed from: f */
    public f<E> g() {
        return new f<>(this, this.f25483b, this.f25484c, this.f25486e);
    }

    @Override // wz.c, java.util.List
    public E get(int i11) {
        i1.d.a(i11, size());
        return (E) e(i11)[i11 & 31];
    }

    @Override // e1.e
    public e1.e<E> h1(h00.l<? super E, Boolean> predicate) {
        s.g(predicate, "predicate");
        f<E> g11 = g();
        g11.G(predicate);
        return g11.build();
    }

    @Override // wz.c, java.util.List
    public ListIterator<E> listIterator(int i11) {
        i1.d.b(i11, size());
        return new g(this.f25483b, this.f25484c, i11, size(), (this.f25486e / 5) + 1);
    }

    @Override // wz.c, java.util.List, e1.e
    public e1.e<E> set(int i11, E e11) {
        i1.d.a(i11, size());
        if (q() <= i11) {
            Object[] copyOf = Arrays.copyOf(this.f25484c, 32);
            s.f(copyOf, "copyOf(this, newSize)");
            copyOf[i11 & 31] = e11;
            return new e(this.f25483b, copyOf, size(), this.f25486e);
        }
        return new e(r(this.f25483b, this.f25486e, i11, e11), this.f25484c, size(), this.f25486e);
    }

    @Override // java.util.List, e1.e
    public e1.e<E> add(int i11, E e11) {
        i1.d.b(i11, size());
        if (i11 == size()) {
            return add((e<E>) e11);
        }
        int q11 = q();
        if (i11 >= q11) {
            return i(this.f25483b, i11 - q11, e11);
        }
        d dVar = new d(null);
        return i(h(this.f25483b, this.f25486e, i11, e11, dVar), 0, dVar.a());
    }
}