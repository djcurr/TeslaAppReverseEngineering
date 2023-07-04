package y20;

import vz.b0;

/* loaded from: classes5.dex */
public final class u<T> implements kotlinx.coroutines.flow.f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final x20.x<T> f59065a;

    /* JADX WARN: Multi-variable type inference failed */
    public u(x20.x<? super T> xVar) {
        this.f59065a = xVar;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object emit(T t11, zz.d<? super b0> dVar) {
        Object d11;
        Object b11 = this.f59065a.b(t11, dVar);
        d11 = a00.d.d();
        return b11 == d11 ? b11 : b0.f54756a;
    }
}