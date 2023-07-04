package g1;

/* loaded from: classes.dex */
public final class w<K, V> extends u<K, V, K> {
    @Override // java.util.Iterator
    public K next() {
        i1.a.a(f());
        n(e() + 2);
        return (K) c()[e() - 2];
    }
}