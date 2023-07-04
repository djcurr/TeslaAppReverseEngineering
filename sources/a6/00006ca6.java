package f1;

import e1.e;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.o;
import wz.p;

/* loaded from: classes.dex */
public final class j<E> extends b<E> implements e1.c<E> {

    /* renamed from: c */
    public static final a f25503c = new a(null);

    /* renamed from: d */
    private static final j f25504d = new j(new Object[0]);

    /* renamed from: b */
    private final Object[] f25505b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            return j.f25504d;
        }
    }

    public j(Object[] buffer) {
        s.g(buffer, "buffer");
        this.f25505b = buffer;
        i1.a.a(buffer.length <= 32);
    }

    private final Object[] f(int i11) {
        return new Object[i11];
    }

    @Override // e1.e
    public e1.e<E> J(int i11) {
        i1.d.a(i11, size());
        if (size() == 1) {
            return f25504d;
        }
        Object[] copyOf = Arrays.copyOf(this.f25505b, size() - 1);
        s.f(copyOf, "copyOf(this, newSize)");
        wz.l.k(this.f25505b, copyOf, i11, i11 + 1, size());
        return new j(copyOf);
    }

    @Override // java.util.Collection, java.util.List, e1.e
    public e1.e<E> add(E e11) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.f25505b, size() + 1);
            s.f(copyOf, "copyOf(this, newSize)");
            copyOf[size()] = e11;
            return new j(copyOf);
        }
        return new e(this.f25505b, l.c(e11), size() + 1, 0);
    }

    @Override // f1.b, java.util.Collection, java.util.List, e1.e
    public e1.e<E> addAll(Collection<? extends E> elements) {
        s.g(elements, "elements");
        if (size() + elements.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.f25505b, size() + elements.size());
            s.f(copyOf, "copyOf(this, newSize)");
            int size = size();
            for (E e11 : elements) {
                copyOf[size] = e11;
                size++;
            }
            return new j(copyOf);
        }
        e.a<E> g11 = g();
        g11.addAll(elements);
        return g11.build();
    }

    @Override // wz.a
    public int b() {
        return this.f25505b.length;
    }

    @Override // e1.e
    public e.a<E> g() {
        return new f(this, null, this.f25505b, 0);
    }

    @Override // wz.c, java.util.List
    public E get(int i11) {
        i1.d.a(i11, size());
        return (E) this.f25505b[i11];
    }

    @Override // e1.e
    public e1.e<E> h1(h00.l<? super E, Boolean> predicate) {
        s.g(predicate, "predicate");
        Object[] objArr = this.f25505b;
        int size = size();
        int size2 = size();
        int i11 = size;
        int i12 = 0;
        boolean z11 = false;
        while (i12 < size2) {
            int i13 = i12 + 1;
            Object obj = this.f25505b[i12];
            if (predicate.invoke(obj).booleanValue()) {
                if (z11) {
                    i12 = i13;
                } else {
                    Object[] objArr2 = this.f25505b;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    s.f(objArr, "copyOf(this, size)");
                    z11 = true;
                    i11 = i12;
                    i12 = i13;
                }
            } else if (z11) {
                i12 = i11 + 1;
                objArr[i11] = obj;
                i11 = i12;
                i12 = i13;
            } else {
                i12 = i13;
            }
        }
        if (i11 == size()) {
            return this;
        }
        if (i11 == 0) {
            return f25504d;
        }
        return new j(wz.l.r(objArr, 0, i11));
    }

    @Override // wz.c, java.util.List
    public int indexOf(Object obj) {
        int O;
        O = p.O(this.f25505b, obj);
        return O;
    }

    @Override // wz.c, java.util.List
    public int lastIndexOf(Object obj) {
        int b02;
        b02 = p.b0(this.f25505b, obj);
        return b02;
    }

    @Override // wz.c, java.util.List
    public ListIterator<E> listIterator(int i11) {
        i1.d.b(i11, size());
        return new c(this.f25505b, i11, size());
    }

    @Override // wz.c, java.util.List, e1.e
    public e1.e<E> set(int i11, E e11) {
        i1.d.a(i11, size());
        Object[] objArr = this.f25505b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        s.f(copyOf, "copyOf(this, size)");
        copyOf[i11] = e11;
        return new j(copyOf);
    }

    @Override // java.util.List, e1.e
    public e1.e<E> add(int i11, E e11) {
        i1.d.b(i11, size());
        if (i11 == size()) {
            return add((j<E>) e11);
        }
        if (size() < 32) {
            Object[] f11 = f(size() + 1);
            o.o(this.f25505b, f11, 0, 0, i11, 6, null);
            wz.l.k(this.f25505b, f11, i11 + 1, i11, size());
            f11[i11] = e11;
            return new j(f11);
        }
        Object[] objArr = this.f25505b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        s.f(copyOf, "copyOf(this, size)");
        wz.l.k(this.f25505b, copyOf, i11 + 1, i11, size() - 1);
        copyOf[i11] = e11;
        return new e(copyOf, l.c(this.f25505b[31]), size() + 1, 0);
    }
}