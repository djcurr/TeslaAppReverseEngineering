package m1;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z<K, V> extends y<K, V> implements Iterator<K>, i00.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t<K, V> map, Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        super(map, iterator);
        kotlin.jvm.internal.s.g(map, "map");
        kotlin.jvm.internal.s.g(iterator, "iterator");
    }

    @Override // java.util.Iterator
    public K next() {
        Map.Entry<K, V> h11 = h();
        if (h11 != null) {
            c();
            return h11.getKey();
        }
        throw new IllegalStateException();
    }
}