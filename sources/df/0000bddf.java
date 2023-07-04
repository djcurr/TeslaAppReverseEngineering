package wz;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class x0 extends w0 {
    public static <T> Set<T> d() {
        return i0.f56482a;
    }

    public static <T> HashSet<T> e(T... elements) {
        int e11;
        kotlin.jvm.internal.s.g(elements, "elements");
        e11 = r0.e(elements.length);
        return (HashSet) p.l0(elements, new HashSet(e11));
    }

    public static <T> LinkedHashSet<T> f(T... elements) {
        int e11;
        kotlin.jvm.internal.s.g(elements, "elements");
        e11 = r0.e(elements.length);
        return (LinkedHashSet) p.l0(elements, new LinkedHashSet(e11));
    }

    public static <T> Set<T> g(T... elements) {
        int e11;
        kotlin.jvm.internal.s.g(elements, "elements");
        e11 = r0.e(elements.length);
        return (Set) p.l0(elements, new LinkedHashSet(e11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Set<T> h(Set<? extends T> set) {
        Set<T> d11;
        Set<T> c11;
        kotlin.jvm.internal.s.g(set, "<this>");
        int size = set.size();
        if (size == 0) {
            d11 = d();
            return d11;
        } else if (size != 1) {
            return set;
        } else {
            c11 = w0.c(set.iterator().next());
            return c11;
        }
    }

    public static <T> Set<T> i(T... elements) {
        Set<T> d11;
        Set<T> E0;
        kotlin.jvm.internal.s.g(elements, "elements");
        if (elements.length > 0) {
            E0 = p.E0(elements);
            return E0;
        }
        d11 = d();
        return d11;
    }

    public static <T> Set<T> j(T t11) {
        Set<T> d11;
        Set<T> c11;
        if (t11 != null) {
            c11 = w0.c(t11);
            return c11;
        }
        d11 = d();
        return d11;
    }
}