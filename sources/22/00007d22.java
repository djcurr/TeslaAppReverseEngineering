package k20;

import java.util.List;

/* loaded from: classes5.dex */
public abstract class o extends k0 {
    @Override // k20.d0
    public List<y0> G0() {
        return Q0().G0();
    }

    @Override // k20.d0
    public w0 H0() {
        return Q0().H0();
    }

    @Override // k20.d0
    public boolean I0() {
        return Q0().I0();
    }

    protected abstract k0 Q0();

    @Override // k20.j1
    /* renamed from: R0 */
    public k0 M0(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return S0((k0) kotlinTypeRefiner.g(Q0()));
    }

    public abstract o S0(k0 k0Var);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return Q0().getAnnotations();
    }

    @Override // k20.d0
    public d20.h m() {
        return Q0().m();
    }
}