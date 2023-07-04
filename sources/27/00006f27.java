package g1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class r<K, V> extends wz.a<V> implements e1.b<V> {

    /* renamed from: a  reason: collision with root package name */
    private final d<K, V> f27336a;

    public r(d<K, V> map) {
        kotlin.jvm.internal.s.g(map, "map");
        this.f27336a = map;
    }

    @Override // wz.a
    public int b() {
        return this.f27336a.size();
    }

    @Override // wz.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f27336a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new s(this.f27336a.p());
    }
}