package t;

import androidx.camera.core.impl.g1;

/* loaded from: classes.dex */
final class q0 implements g1.d {

    /* renamed from: a  reason: collision with root package name */
    static final q0 f51149a = new q0();

    @Override // androidx.camera.core.impl.g1.d
    public void a(androidx.camera.core.impl.p1<?> p1Var, g1.b bVar) {
        androidx.camera.core.impl.g1 m11 = p1Var.m(null);
        androidx.camera.core.impl.d0 F = androidx.camera.core.impl.b1.F();
        int j11 = androidx.camera.core.impl.g1.a().j();
        if (m11 != null) {
            j11 = m11.j();
            bVar.a(m11.b());
            bVar.c(m11.g());
            bVar.b(m11.e());
            F = m11.d();
        }
        bVar.p(F);
        s.a aVar = new s.a(p1Var);
        bVar.q(aVar.I(j11));
        bVar.e(aVar.J(u0.b()));
        bVar.j(aVar.L(t0.b()));
        bVar.d(y0.d(aVar.K(l0.c())));
        androidx.camera.core.impl.x0 I = androidx.camera.core.impl.x0.I();
        I.p(s.a.f49768x, aVar.F(s.c.e()));
        bVar.g(I);
        bVar.g(aVar.G());
    }
}