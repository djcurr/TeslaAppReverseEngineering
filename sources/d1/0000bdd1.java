package wz;

import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
class q0 {
    public static final <K, V> V a(Map<K, ? extends V> map, K k11) {
        kotlin.jvm.internal.s.g(map, "<this>");
        if (map instanceof o0) {
            return (V) ((o0) map).d(k11);
        }
        V v11 = map.get(k11);
        if (v11 != null || map.containsKey(k11)) {
            return v11;
        }
        throw new NoSuchElementException("Key " + k11 + " is missing in the map.");
    }
}