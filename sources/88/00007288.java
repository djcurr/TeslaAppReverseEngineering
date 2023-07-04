package h30;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class k {
    public static final <K, V> Map<K, V> a(int i11) {
        return new ConcurrentHashMap(i11);
    }
}