package g1;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c<K, V> extends b<K, V> implements Map.Entry<K, V> {

    /* renamed from: c  reason: collision with root package name */
    private final i<K, V> f27311c;

    /* renamed from: d  reason: collision with root package name */
    private V f27312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i<K, V> parentIterator, K k11, V v11) {
        super(k11, v11);
        kotlin.jvm.internal.s.g(parentIterator, "parentIterator");
        this.f27311c = parentIterator;
        this.f27312d = v11;
    }

    public void a(V v11) {
        this.f27312d = v11;
    }

    @Override // g1.b, java.util.Map.Entry
    public V getValue() {
        return this.f27312d;
    }

    @Override // g1.b, java.util.Map.Entry
    public V setValue(V v11) {
        V value = getValue();
        a(v11);
        this.f27311c.b(getKey(), v11);
        return value;
    }
}