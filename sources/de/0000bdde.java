package wz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class x extends w {
    public static <T> int t(Iterable<? extends T> iterable, int i11) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i11;
    }

    public static final <T> Integer u(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    public static <T> List<T> v(Iterable<? extends Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable<? extends T> iterable2 : iterable) {
            b0.z(arrayList, iterable2);
        }
        return arrayList;
    }

    public static <T, R> vz.p<List<T>, List<R>> w(Iterable<? extends vz.p<? extends T, ? extends R>> iterable) {
        int t11;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        t11 = t(iterable, 10);
        ArrayList arrayList = new ArrayList(t11);
        ArrayList arrayList2 = new ArrayList(t11);
        for (vz.p<? extends T, ? extends R> pVar : iterable) {
            arrayList.add(pVar.c());
            arrayList2.add(pVar.d());
        }
        return vz.v.a(arrayList, arrayList2);
    }
}