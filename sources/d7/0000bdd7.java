package wz;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class t0 extends s0 {
    public static <K, V> u20.h<Map.Entry<K, V>> z(Map<? extends K, ? extends V> map) {
        u20.h<Map.Entry<K, V>> S;
        kotlin.jvm.internal.s.g(map, "<this>");
        S = e0.S(map.entrySet());
        return S;
    }
}