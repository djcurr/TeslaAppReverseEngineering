package t;

import androidx.camera.core.impl.a0;

/* loaded from: classes.dex */
class m0 implements a0.b {

    /* renamed from: a  reason: collision with root package name */
    static final m0 f51103a = new m0();

    @Override // androidx.camera.core.impl.a0.b
    public void a(androidx.camera.core.impl.p1<?> p1Var, a0.a aVar) {
        androidx.camera.core.impl.a0 q11 = p1Var.q(null);
        androidx.camera.core.impl.d0 F = androidx.camera.core.impl.b1.F();
        int f11 = androidx.camera.core.impl.a0.a().f();
        if (q11 != null) {
            f11 = q11.f();
            aVar.a(q11.b());
            F = q11.c();
        }
        aVar.m(F);
        s.a aVar2 = new s.a(p1Var);
        aVar.n(aVar2.I(f11));
        aVar.c(y0.d(aVar2.K(l0.c())));
        aVar.e(aVar2.G());
    }
}