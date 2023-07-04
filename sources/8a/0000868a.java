package md;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g<K, V> extends HashMap<K, V> {
    private g(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public static <K, V> g<K, V> a(Map<? extends K, ? extends V> map) {
        return new g<>(map);
    }

    public static <K, V> Map<K, V> of(K k11, V v11) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k11, v11);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> Map<K, V> of(K k11, V v11, K k12, V v12) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(k11, v11);
        hashMap.put(k12, v12);
        return Collections.unmodifiableMap(hashMap);
    }
}