package g1;

import java.util.Map;

/* loaded from: classes.dex */
public final class y<K, V> extends u<K, V, Map.Entry<K, V>> {

    /* renamed from: d  reason: collision with root package name */
    private final i<K, V> f27348d;

    public y(i<K, V> parentIterator) {
        kotlin.jvm.internal.s.g(parentIterator, "parentIterator");
        this.f27348d = parentIterator;
    }

    @Override // java.util.Iterator
    /* renamed from: o */
    public Map.Entry<K, V> next() {
        i1.a.a(f());
        n(e() + 2);
        return new c(this.f27348d, c()[e() - 2], c()[e() - 1]);
    }
}