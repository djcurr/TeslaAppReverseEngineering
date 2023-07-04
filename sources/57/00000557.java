package androidx.concurrent.futures;

/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    private c() {
    }

    public static <V> c<V> s() {
        return new c<>();
    }

    @Override // androidx.concurrent.futures.a
    public boolean p(V v11) {
        return super.p(v11);
    }

    @Override // androidx.concurrent.futures.a
    public boolean q(Throwable th2) {
        return super.q(th2);
    }
}