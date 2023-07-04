package sy;

import sy.r;

/* loaded from: classes5.dex */
public final class o<T> extends hy.i<T> implements ny.f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f50827a;

    public o(T t11) {
        this.f50827a = t11;
    }

    @Override // hy.i
    protected void L(hy.k<? super T> kVar) {
        r.a aVar = new r.a(kVar, this.f50827a);
        kVar.a(aVar);
        aVar.run();
    }

    @Override // ny.f, ky.j
    public T get() {
        return this.f50827a;
    }
}