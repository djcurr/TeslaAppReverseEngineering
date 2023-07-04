package t20;

/* loaded from: classes5.dex */
final class d<V> {

    /* renamed from: b  reason: collision with root package name */
    private static final d<Object> f51581b = new d<>(c.f51575f);

    /* renamed from: a  reason: collision with root package name */
    private final c<V> f51582a;

    private d(c<V> cVar) {
        this.f51582a = cVar;
    }

    public static <V> d<V> a() {
        return (d<V>) f51581b;
    }

    private d<V> d(c<V> cVar) {
        return cVar == this.f51582a ? this : new d<>(cVar);
    }

    public V b(int i11) {
        return this.f51582a.a(i11);
    }

    public d<V> c(int i11, V v11) {
        return d(this.f51582a.b(i11, v11));
    }
}