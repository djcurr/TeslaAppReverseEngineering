package m1;

import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class o<K, V, E> implements Set<E>, i00.f {

    /* renamed from: a  reason: collision with root package name */
    private final t<K, V> f38221a;

    public o(t<K, V> map) {
        kotlin.jvm.internal.s.g(map, "map");
        this.f38221a = map;
    }

    public final t<K, V> b() {
        return this.f38221a;
    }

    public int c() {
        return this.f38221a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f38221a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f38221a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.s.g(array, "array");
        return (T[]) kotlin.jvm.internal.j.b(this, array);
    }
}