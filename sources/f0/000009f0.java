package androidx.work.impl.utils.futures;

/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    private c() {
    }

    public static <V> c<V> t() {
        return new c<>();
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean p(V v11) {
        return super.p(v11);
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean q(Throwable th2) {
        return super.q(th2);
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean r(com.google.common.util.concurrent.c<? extends V> cVar) {
        return super.r(cVar);
    }
}