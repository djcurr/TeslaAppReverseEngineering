package v20;

/* loaded from: classes5.dex */
final class y<T> extends h2 implements x<T>, kotlinx.coroutines.selects.c<T> {
    public y(a2 a2Var) {
        super(true);
        h0(a2Var);
    }

    @Override // v20.h2
    public boolean Z() {
        return true;
    }

    @Override // v20.x
    public boolean complete(T t11) {
        return q0(t11);
    }

    @Override // v20.x
    public boolean g(Throwable th2) {
        return q0(new c0(th2, false, 2, null));
    }

    @Override // kotlinx.coroutines.selects.c
    public <R> void n(kotlinx.coroutines.selects.d<? super R> dVar, h00.p<? super T, ? super zz.d<? super R>, ? extends Object> pVar) {
        I0(dVar, pVar);
    }

    @Override // v20.v0
    public Object u0(zz.d<? super T> dVar) {
        return A(dVar);
    }
}