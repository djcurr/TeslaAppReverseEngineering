package g1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class p<K, V> extends wz.i<K> implements e1.d<K> {

    /* renamed from: b  reason: collision with root package name */
    private final d<K, V> f27335b;

    public p(d<K, V> map) {
        kotlin.jvm.internal.s.g(map, "map");
        this.f27335b = map;
    }

    @Override // wz.a
    public int b() {
        return this.f27335b.size();
    }

    @Override // wz.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f27335b.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new q(this.f27335b.p());
    }
}