package wz;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class s0 extends r0 {
    public static <K, V> Map<K, V> i() {
        return h0.f56480a;
    }

    public static <K, V> V j(Map<K, ? extends V> map, K k11) {
        kotlin.jvm.internal.s.g(map, "<this>");
        return (V) q0.a(map, k11);
    }

    public static <K, V> HashMap<K, V> k(Pair<? extends K, ? extends V>... pairs) {
        int e11;
        kotlin.jvm.internal.s.g(pairs, "pairs");
        e11 = r0.e(pairs.length);
        HashMap<K, V> hashMap = new HashMap<>(e11);
        s(hashMap, pairs);
        return hashMap;
    }

    public static <K, V> Map<K, V> l(Pair<? extends K, ? extends V>... pairs) {
        Map<K, V> i11;
        int e11;
        kotlin.jvm.internal.s.g(pairs, "pairs");
        if (pairs.length > 0) {
            e11 = r0.e(pairs.length);
            return x(pairs, new LinkedHashMap(e11));
        }
        i11 = i();
        return i11;
    }

    public static <K, V> Map<K, V> m(Map<? extends K, ? extends V> map, K k11) {
        Map y11;
        kotlin.jvm.internal.s.g(map, "<this>");
        y11 = y(map);
        y11.remove(k11);
        return o(y11);
    }

    public static <K, V> Map<K, V> n(Pair<? extends K, ? extends V>... pairs) {
        int e11;
        kotlin.jvm.internal.s.g(pairs, "pairs");
        e11 = r0.e(pairs.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e11);
        s(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> o(Map<K, ? extends V> map) {
        Map<K, V> i11;
        kotlin.jvm.internal.s.g(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : r0.g(map);
        }
        i11 = i();
        return i11;
    }

    public static <K, V> Map<K, V> p(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.s.g(map, "<this>");
        kotlin.jvm.internal.s.g(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> q(Map<? extends K, ? extends V> map, vz.p<? extends K, ? extends V> pair) {
        Map<K, V> f11;
        kotlin.jvm.internal.s.g(map, "<this>");
        kotlin.jvm.internal.s.g(pair, "pair");
        if (map.isEmpty()) {
            f11 = r0.f(pair);
            return f11;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.d());
        return linkedHashMap;
    }

    public static final <K, V> void r(Map<? super K, ? super V> map, Iterable<? extends vz.p<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.s.g(map, "<this>");
        kotlin.jvm.internal.s.g(pairs, "pairs");
        for (vz.p<? extends K, ? extends V> pVar : pairs) {
            map.put((K) pVar.a(), (V) pVar.b());
        }
    }

    public static final <K, V> void s(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.s.g(map, "<this>");
        kotlin.jvm.internal.s.g(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put((Object) pair.a(), (Object) pair.b());
        }
    }

    public static <K, V> Map<K, V> t(Iterable<? extends vz.p<? extends K, ? extends V>> iterable) {
        Map<K, V> i11;
        Map<K, V> f11;
        int e11;
        kotlin.jvm.internal.s.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                i11 = i();
                return i11;
            } else if (size != 1) {
                e11 = r0.e(collection.size());
                return u(iterable, new LinkedHashMap(e11));
            } else {
                f11 = r0.f(iterable instanceof List ? (vz.p<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
                return f11;
            }
        }
        return o(u(iterable, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M u(Iterable<? extends vz.p<? extends K, ? extends V>> iterable, M destination) {
        kotlin.jvm.internal.s.g(iterable, "<this>");
        kotlin.jvm.internal.s.g(destination, "destination");
        r(destination, iterable);
        return destination;
    }

    public static <K, V> Map<K, V> v(Map<? extends K, ? extends V> map) {
        Map<K, V> i11;
        Map<K, V> y11;
        kotlin.jvm.internal.s.g(map, "<this>");
        int size = map.size();
        if (size == 0) {
            i11 = i();
            return i11;
        } else if (size != 1) {
            y11 = y(map);
            return y11;
        } else {
            return r0.g(map);
        }
    }

    public static <K, V> Map<K, V> w(Pair<? extends K, ? extends V>[] pairArr) {
        Map<K, V> i11;
        Map<K, V> f11;
        int e11;
        kotlin.jvm.internal.s.g(pairArr, "<this>");
        int length = pairArr.length;
        if (length == 0) {
            i11 = i();
            return i11;
        } else if (length != 1) {
            e11 = r0.e(pairArr.length);
            return x(pairArr, new LinkedHashMap(e11));
        } else {
            f11 = r0.f(pairArr[0]);
            return f11;
        }
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M x(Pair<? extends K, ? extends V>[] pairArr, M destination) {
        kotlin.jvm.internal.s.g(pairArr, "<this>");
        kotlin.jvm.internal.s.g(destination, "destination");
        s(destination, pairArr);
        return destination;
    }

    public static <K, V> Map<K, V> y(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.s.g(map, "<this>");
        return new LinkedHashMap(map);
    }
}