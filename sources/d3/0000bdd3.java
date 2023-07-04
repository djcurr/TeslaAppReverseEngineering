package wz;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class r0 extends q0 {
    public static <K, V> Map<K, V> b(Map<K, V> builder) {
        kotlin.jvm.internal.s.g(builder, "builder");
        return ((xz.d) builder).k();
    }

    public static <K, V> Map<K, V> c() {
        return new xz.d();
    }

    public static <K, V> Map<K, V> d(int i11) {
        return new xz.d(i11);
    }

    public static int e(int i11) {
        if (i11 < 0) {
            return i11;
        }
        if (i11 < 3) {
            return i11 + 1;
        }
        if (i11 < 1073741824) {
            return (int) ((i11 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map<K, V> f(vz.p<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.s.g(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.c(), pair.d());
        kotlin.jvm.internal.s.f(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V> Map<K, V> g(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.s.g(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.s.f(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static <K, V> SortedMap<K, V> h(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        kotlin.jvm.internal.s.g(map, "<this>");
        kotlin.jvm.internal.s.g(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}