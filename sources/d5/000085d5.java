package m10;

import k20.d0;
import k20.e0;
import k20.f1;
import k20.h1;
import k20.j1;
import k20.k0;
import k20.x;

/* loaded from: classes5.dex */
public final class g extends k20.o implements k20.l {

    /* renamed from: b  reason: collision with root package name */
    private final k0 f38277b;

    public g(k0 delegate) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        this.f38277b = delegate;
    }

    private final k0 T0(k0 k0Var) {
        k0 O0 = k0Var.O0(false);
        return !n20.a.o(k0Var) ? O0 : new g(O0);
    }

    @Override // k20.o, k20.d0
    public boolean I0() {
        return false;
    }

    @Override // k20.l
    public d0 M(d0 replacement) {
        kotlin.jvm.internal.s.g(replacement, "replacement");
        j1 K0 = replacement.K0();
        if (n20.a.o(K0) || f1.m(K0)) {
            if (K0 instanceof k0) {
                return T0((k0) K0);
            }
            if (K0 instanceof x) {
                x xVar = (x) K0;
                return h1.e(e0.d(T0(xVar.P0()), T0(xVar.Q0())), h1.a(K0));
            }
            throw new IllegalStateException(kotlin.jvm.internal.s.p("Incorrect type: ", K0).toString());
        }
        return K0;
    }

    @Override // k20.j1
    /* renamed from: O0 */
    public k0 L0(boolean z11) {
        return z11 ? Q0().O0(true) : this;
    }

    @Override // k20.o
    protected k0 Q0() {
        return this.f38277b;
    }

    @Override // k20.k0
    /* renamed from: U0 */
    public g P0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g newAnnotations) {
        kotlin.jvm.internal.s.g(newAnnotations, "newAnnotations");
        return new g(Q0().P0(newAnnotations));
    }

    @Override // k20.o
    /* renamed from: V0 */
    public g S0(k0 delegate) {
        kotlin.jvm.internal.s.g(delegate, "delegate");
        return new g(delegate);
    }

    @Override // k20.l
    public boolean w() {
        return true;
    }
}