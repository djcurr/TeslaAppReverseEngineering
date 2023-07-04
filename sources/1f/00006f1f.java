package g1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class j<K, V> extends wz.h<K> {

    /* renamed from: a  reason: collision with root package name */
    private final f<K, V> f27332a;

    public j(f<K, V> builder) {
        kotlin.jvm.internal.s.g(builder, "builder");
        this.f27332a = builder;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k11) {
        throw new UnsupportedOperationException();
    }

    @Override // wz.h
    public int b() {
        return this.f27332a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f27332a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f27332a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new k(this.f27332a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.f27332a.containsKey(obj)) {
            this.f27332a.remove(obj);
            return true;
        }
        return false;
    }
}