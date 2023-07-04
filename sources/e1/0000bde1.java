package wz;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class y0 extends x0 {
    public static <T> Set<T> k(Set<? extends T> set, Iterable<? extends T> elements) {
        Set<T> S0;
        kotlin.jvm.internal.s.g(set, "<this>");
        kotlin.jvm.internal.s.g(elements, "elements");
        Collection<?> a11 = r.a(elements, set);
        if (a11.isEmpty()) {
            S0 = e0.S0(set);
            return S0;
        } else if (a11 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (T t11 : set) {
                if (!a11.contains(t11)) {
                    linkedHashSet.add(t11);
                }
            }
            return linkedHashSet;
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
            linkedHashSet2.removeAll(a11);
            return linkedHashSet2;
        }
    }

    public static <T> Set<T> l(Set<? extends T> set, T t11) {
        int e11;
        kotlin.jvm.internal.s.g(set, "<this>");
        e11 = r0.e(set.size());
        LinkedHashSet linkedHashSet = new LinkedHashSet(e11);
        boolean z11 = false;
        for (T t12 : set) {
            boolean z12 = true;
            if (!z11 && kotlin.jvm.internal.s.c(t12, t11)) {
                z11 = true;
                z12 = false;
            }
            if (z12) {
                linkedHashSet.add(t12);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> m(Set<? extends T> set, Iterable<? extends T> elements) {
        int size;
        int e11;
        kotlin.jvm.internal.s.g(set, "<this>");
        kotlin.jvm.internal.s.g(elements, "elements");
        Integer u11 = x.u(elements);
        if (u11 != null) {
            size = set.size() + u11.intValue();
        } else {
            size = set.size() * 2;
        }
        e11 = r0.e(size);
        LinkedHashSet linkedHashSet = new LinkedHashSet(e11);
        linkedHashSet.addAll(set);
        b0.z(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static <T> Set<T> n(Set<? extends T> set, T t11) {
        int e11;
        kotlin.jvm.internal.s.g(set, "<this>");
        e11 = r0.e(set.size() + 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet(e11);
        linkedHashSet.addAll(set);
        linkedHashSet.add(t11);
        return linkedHashSet;
    }
}