package rz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class a {
    public static <T> List<T> a(List<T> list) {
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public static <K, V> Map<K, V> b(Map<K, V> map) {
        if (map != null) {
            return new ConcurrentHashMap(map);
        }
        return null;
    }

    public static <K, V> Map<K, V> c(Map<K, V> map) {
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    public static int d(Iterable<?> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        int i11 = 0;
        Iterator<?> it2 = iterable.iterator();
        while (it2.hasNext()) {
            it2.next();
            i11++;
        }
        return i11;
    }
}