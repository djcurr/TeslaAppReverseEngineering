package wz;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class b0 extends a0 {
    public static <T> boolean A(Collection<? super T> collection, T[] elements) {
        List e11;
        kotlin.jvm.internal.s.g(collection, "<this>");
        kotlin.jvm.internal.s.g(elements, "elements");
        e11 = o.e(elements);
        return collection.addAll(e11);
    }

    private static final <T> boolean B(Iterable<? extends T> iterable, h00.l<? super T, Boolean> lVar, boolean z11) {
        Iterator<? extends T> it2 = iterable.iterator();
        boolean z12 = false;
        while (it2.hasNext()) {
            if (lVar.invoke((T) it2.next()).booleanValue() == z11) {
                it2.remove();
                z12 = true;
            }
        }
        return z12;
    }

    private static final <T> boolean C(List<T> list, h00.l<? super T, Boolean> lVar, boolean z11) {
        int k11;
        int i11;
        int k12;
        if (!(list instanceof RandomAccess)) {
            return B(kotlin.jvm.internal.r0.b(list), lVar, z11);
        }
        k11 = w.k(list);
        if (k11 >= 0) {
            int i12 = 0;
            i11 = 0;
            while (true) {
                T t11 = list.get(i12);
                if (lVar.invoke(t11).booleanValue() != z11) {
                    if (i11 != i12) {
                        list.set(i11, t11);
                    }
                    i11++;
                }
                if (i12 == k11) {
                    break;
                }
                i12++;
            }
        } else {
            i11 = 0;
        }
        if (i11 >= list.size()) {
            return false;
        }
        k12 = w.k(list);
        if (i11 > k12) {
            return true;
        }
        while (true) {
            list.remove(k12);
            if (k12 == i11) {
                return true;
            }
            k12--;
        }
    }

    public static <T> boolean D(Iterable<? extends T> iterable, h00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(predicate, "predicate");
        return B(iterable, predicate, true);
    }

    public static <T> boolean E(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.s.g(collection, "<this>");
        kotlin.jvm.internal.s.g(elements, "elements");
        return kotlin.jvm.internal.r0.a(collection).removeAll(r.a(elements, collection));
    }

    public static <T> boolean F(List<T> list, h00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.s.g(list, "<this>");
        kotlin.jvm.internal.s.g(predicate, "predicate");
        return C(list, predicate, true);
    }

    public static <T> T G(List<T> list) {
        kotlin.jvm.internal.s.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static <T> T H(List<T> list) {
        int k11;
        kotlin.jvm.internal.s.g(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        k11 = w.k(list);
        return list.remove(k11);
    }

    public static <T> T I(List<T> list) {
        int k11;
        kotlin.jvm.internal.s.g(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        k11 = w.k(list);
        return list.remove(k11);
    }

    public static final <T> boolean J(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.s.g(collection, "<this>");
        kotlin.jvm.internal.s.g(elements, "elements");
        return kotlin.jvm.internal.r0.a(collection).retainAll(r.a(elements, collection));
    }

    public static <T> boolean z(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.s.g(collection, "<this>");
        kotlin.jvm.internal.s.g(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        boolean z11 = false;
        Iterator<? extends T> it2 = elements.iterator();
        while (it2.hasNext()) {
            if (collection.add((T) it2.next())) {
                z11 = true;
            }
        }
        return z11;
    }
}