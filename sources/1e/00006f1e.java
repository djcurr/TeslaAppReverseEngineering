package g1;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, i00.a {

    /* renamed from: a  reason: collision with root package name */
    private final g<K, V, Map.Entry<K, V>> f27331a;

    public i(f<K, V> builder) {
        kotlin.jvm.internal.s.g(builder, "builder");
        u[] uVarArr = new u[8];
        for (int i11 = 0; i11 < 8; i11++) {
            uVarArr[i11] = new y(this);
        }
        this.f27331a = new g<>(builder, uVarArr);
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public Map.Entry<K, V> next() {
        return this.f27331a.next();
    }

    public final void b(K k11, V v11) {
        this.f27331a.m(k11, v11);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f27331a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f27331a.remove();
    }
}