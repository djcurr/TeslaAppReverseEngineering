package g1;

/* loaded from: classes.dex */
public final class z<K, V> extends u<K, V, V> {
    @Override // java.util.Iterator
    public V next() {
        i1.a.a(f());
        n(e() + 2);
        return (V) c()[e() - 1];
    }
}