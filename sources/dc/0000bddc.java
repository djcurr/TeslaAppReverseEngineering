package wz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class w extends v {
    public static <T> ArrayList<T> e(T... elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new j(elements, true));
    }

    public static final <T> Collection<T> f(T[] tArr) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        return new j(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int g(List<? extends T> list, T t11, int i11, int i12) {
        int a11;
        kotlin.jvm.internal.s.g(list, "<this>");
        q(list.size(), i11, i12);
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            a11 = yz.b.a(list.get(i14), t11);
            if (a11 < 0) {
                i11 = i14 + 1;
            } else if (a11 <= 0) {
                return i14;
            } else {
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static /* synthetic */ int h(List list, Comparable comparable, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = list.size();
        }
        return g(list, comparable, i11, i12);
    }

    public static <T> List<T> i() {
        return g0.f56479a;
    }

    public static m00.i j(Collection<?> collection) {
        kotlin.jvm.internal.s.g(collection, "<this>");
        return new m00.i(0, collection.size() - 1);
    }

    public static <T> int k(List<? extends T> list) {
        kotlin.jvm.internal.s.g(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> l(T... elements) {
        List<T> i11;
        List<T> e11;
        kotlin.jvm.internal.s.g(elements, "elements");
        if (elements.length > 0) {
            e11 = o.e(elements);
            return e11;
        }
        i11 = i();
        return i11;
    }

    public static <T> List<T> m(T t11) {
        List<T> i11;
        List<T> d11;
        if (t11 != null) {
            d11 = v.d(t11);
            return d11;
        }
        i11 = i();
        return i11;
    }

    public static <T> List<T> n(T... elements) {
        List<T> E;
        kotlin.jvm.internal.s.g(elements, "elements");
        E = p.E(elements);
        return E;
    }

    public static <T> List<T> o(T... elements) {
        kotlin.jvm.internal.s.g(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new j(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> p(List<? extends T> list) {
        List<T> i11;
        List<T> d11;
        kotlin.jvm.internal.s.g(list, "<this>");
        int size = list.size();
        if (size == 0) {
            i11 = i();
            return i11;
        } else if (size != 1) {
            return list;
        } else {
            d11 = v.d(list.get(0));
            return d11;
        }
    }

    private static final void q(int i11, int i12, int i13) {
        if (i12 > i13) {
            throw new IllegalArgumentException("fromIndex (" + i12 + ") is greater than toIndex (" + i13 + ").");
        } else if (i12 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i12 + ") is less than zero.");
        } else if (i13 <= i11) {
        } else {
            throw new IndexOutOfBoundsException("toIndex (" + i13 + ") is greater than size (" + i11 + ").");
        }
    }

    public static void r() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void s() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}