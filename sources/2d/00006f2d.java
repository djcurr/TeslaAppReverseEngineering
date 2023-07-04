package g1;

import java.util.Map;

/* loaded from: classes.dex */
public final class v<K, V> extends u<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    /* renamed from: o */
    public Map.Entry<K, V> next() {
        i1.a.a(f());
        n(e() + 2);
        return new b(c()[e() - 2], c()[e() - 1]);
    }
}