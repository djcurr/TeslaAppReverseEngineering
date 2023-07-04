package bb;

/* loaded from: classes.dex */
public final class b<K, V> extends androidx.collection.a<K, V> {

    /* renamed from: i  reason: collision with root package name */
    private int f7568i;

    @Override // androidx.collection.g, java.util.Map
    public void clear() {
        this.f7568i = 0;
        super.clear();
    }

    @Override // androidx.collection.g, java.util.Map
    public int hashCode() {
        if (this.f7568i == 0) {
            this.f7568i = super.hashCode();
        }
        return this.f7568i;
    }

    @Override // androidx.collection.g
    public void l(androidx.collection.g<? extends K, ? extends V> gVar) {
        this.f7568i = 0;
        super.l(gVar);
    }

    @Override // androidx.collection.g
    public V m(int i11) {
        this.f7568i = 0;
        return (V) super.m(i11);
    }

    @Override // androidx.collection.g
    public V n(int i11, V v11) {
        this.f7568i = 0;
        return (V) super.n(i11, v11);
    }

    @Override // androidx.collection.g, java.util.Map
    public V put(K k11, V v11) {
        this.f7568i = 0;
        return (V) super.put(k11, v11);
    }
}