package s20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import wz.u;
import wz.v;
import wz.w;

/* loaded from: classes5.dex */
public final class a {
    public static final <T> void a(Collection<T> collection, T t11) {
        s.g(collection, "<this>");
        if (t11 != null) {
            collection.add(t11);
        }
    }

    private static final int b(int i11) {
        if (i11 < 3) {
            return 3;
        }
        return i11 + (i11 / 3) + 1;
    }

    public static final <T> List<T> c(ArrayList<T> arrayList) {
        List<T> i11;
        List<T> d11;
        s.g(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            i11 = w.i();
            return i11;
        } else if (size != 1) {
            arrayList.trimToSize();
            return arrayList;
        } else {
            d11 = v.d(u.b0(arrayList));
            return d11;
        }
    }

    public static final <K> Map<K, Integer> d(Iterable<? extends K> iterable) {
        s.g(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = 0;
        for (K k11 : iterable) {
            linkedHashMap.put(k11, Integer.valueOf(i11));
            i11++;
        }
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> e(int i11) {
        return new HashMap<>(b(i11));
    }

    public static final <E> HashSet<E> f(int i11) {
        return new HashSet<>(b(i11));
    }

    public static final <E> LinkedHashSet<E> g(int i11) {
        return new LinkedHashSet<>(b(i11));
    }
}