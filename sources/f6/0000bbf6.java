package w10;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import k20.w0;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.types.checker.c;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import m20.t;

/* loaded from: classes5.dex */
public final class k implements kotlin.reflect.jvm.internal.impl.types.checker.c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<w0, w0> f55392a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f55393b;

    /* renamed from: c  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.types.checker.h f55394c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(Map<w0, ? extends w0> map, f.a equalityAxioms, kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        s.g(equalityAxioms, "equalityAxioms");
        s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f55392a = map;
        this.f55393b = equalityAxioms;
        this.f55394c = kotlinTypeRefiner;
    }

    private final boolean y0(w0 w0Var, w0 w0Var2) {
        if (this.f55393b.a(w0Var, w0Var2)) {
            return true;
        }
        Map<w0, w0> map = this.f55392a;
        if (map == null) {
            return false;
        }
        w0 w0Var3 = map.get(w0Var);
        w0 w0Var4 = this.f55392a.get(w0Var2);
        if (w0Var3 == null || !s.c(w0Var3, w0Var2)) {
            return w0Var4 != null && s.c(w0Var4, w0Var);
        }
        return true;
    }

    @Override // m20.o
    public boolean A(m20.i iVar) {
        return c.a.L(this, iVar);
    }

    @Override // m20.o
    public int B(m20.m mVar) {
        return c.a.o0(this, mVar);
    }

    @Override // m20.o
    public boolean C(m20.i iVar) {
        return c.a.X(this, iVar);
    }

    @Override // m20.o
    public List<m20.j> D(m20.j jVar, m20.m mVar) {
        return c.a.m(this, jVar, mVar);
    }

    @Override // m20.o
    public boolean E(m20.m mVar) {
        return c.a.W(this, mVar);
    }

    @Override // m20.o
    public boolean F(m20.m mVar) {
        return c.a.S(this, mVar);
    }

    @Override // m20.o
    public boolean G(m20.i iVar) {
        return c.a.O(this, iVar);
    }

    @Override // m20.o
    public m20.l H(m20.j jVar, int i11) {
        return c.a.p(this, jVar, i11);
    }

    @Override // m20.o
    public m20.n I(m20.s sVar) {
        return c.a.x(this, sVar);
    }

    @Override // m20.o
    public m20.l J(m20.i iVar, int i11) {
        return c.a.o(this, iVar, i11);
    }

    @Override // m20.o
    public int K(m20.k kVar) {
        return c.a.r0(this, kVar);
    }

    @Override // m20.o
    public boolean L(m20.m mVar) {
        return c.a.M(this, mVar);
    }

    @Override // m20.o
    public boolean M(m20.j jVar) {
        return c.a.Z(this, jVar);
    }

    @Override // m20.o
    public boolean N(m20.j jVar) {
        return c.a.I(this, jVar);
    }

    @Override // m20.o
    public boolean O(m20.j jVar) {
        return c.a.f0(this, jVar);
    }

    @Override // m20.o
    public Collection<m20.i> P(m20.m mVar) {
        return c.a.s0(this, mVar);
    }

    @Override // m20.o
    public m20.j Q(m20.i iVar) {
        return c.a.x0(this, iVar);
    }

    @Override // k20.e1
    public t00.i R(m20.m mVar) {
        return c.a.s(this, mVar);
    }

    @Override // m20.o
    public m20.l S(m20.k kVar, int i11) {
        return c.a.n(this, kVar, i11);
    }

    @Override // m20.o
    public m20.e T(m20.j jVar) {
        return c.a.e(this, jVar);
    }

    @Override // m20.o
    public m20.j U(m20.i iVar) {
        return c.a.i0(this, iVar);
    }

    @Override // m20.o
    public boolean V(m20.j jVar) {
        return c.a.e0(this, jVar);
    }

    @Override // m20.o
    public boolean W(m20.i iVar) {
        return c.a.V(this, iVar);
    }

    @Override // k20.e1
    public t00.i X(m20.m mVar) {
        return c.a.t(this, mVar);
    }

    @Override // m20.o
    public int Y(m20.i iVar) {
        return c.a.b(this, iVar);
    }

    @Override // m20.o
    public m20.i Z(m20.i iVar, boolean z11) {
        return c.a.y0(this, iVar, z11);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.c, m20.o
    public m20.j a(m20.i iVar) {
        return c.a.h(this, iVar);
    }

    @Override // m20.o
    public boolean a0(m20.i iVar) {
        return c.a.H(this, iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.c, m20.o
    public m20.j b(m20.g gVar) {
        return c.a.w0(this, gVar);
    }

    @Override // m20.o
    public m20.i b0(m20.l lVar) {
        return c.a.w(this, lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.c, m20.o
    public m20.j c(m20.g gVar) {
        return c.a.h0(this, gVar);
    }

    @Override // m20.o
    public m20.f c0(m20.g gVar) {
        return c.a.f(this, gVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.c, m20.o
    public m20.m d(m20.j jVar) {
        return c.a.v0(this, jVar);
    }

    @Override // m20.o
    public boolean d0(m20.d dVar) {
        return c.a.Y(this, dVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.c, m20.o
    public boolean e(m20.j jVar) {
        return c.a.b0(this, jVar);
    }

    @Override // m20.o
    public boolean e0(m20.m mVar) {
        return c.a.K(this, mVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.c, m20.o
    public m20.d f(m20.j jVar) {
        return c.a.d(this, jVar);
    }

    @Override // m20.o
    public boolean f0(m20.m mVar) {
        return c.a.G(this, mVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.c, m20.o
    public m20.j g(m20.j jVar, boolean z11) {
        return c.a.z0(this, jVar, z11);
    }

    @Override // m20.o
    public m20.k g0(m20.j jVar) {
        return c.a.c(this, jVar);
    }

    @Override // m20.o
    public t h(m20.n nVar) {
        return c.a.A(this, nVar);
    }

    @Override // m20.o
    public m20.i h0(List<? extends m20.i> list) {
        return c.a.F(this, list);
    }

    @Override // k20.e1
    public boolean i(m20.m mVar) {
        return c.a.P(this, mVar);
    }

    @Override // m20.o
    public boolean i0(m20.j jVar) {
        return c.a.U(this, jVar);
    }

    @Override // m20.o
    public m20.m j(m20.i iVar) {
        return c.a.u0(this, iVar);
    }

    @Override // k20.e1
    public boolean j0(m20.i iVar, u10.c cVar) {
        return c.a.B(this, iVar, cVar);
    }

    @Override // m20.o
    public boolean k(m20.i iVar) {
        return c.a.T(this, iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.c
    public m20.i k0(m20.j jVar, m20.j jVar2) {
        return c.a.l(this, jVar, jVar2);
    }

    @Override // m20.o
    public boolean l(m20.d dVar) {
        return c.a.a0(this, dVar);
    }

    @Override // m20.o
    public m20.g l0(m20.i iVar) {
        return c.a.g(this, iVar);
    }

    @Override // m20.o
    public boolean m(m20.i iVar) {
        return c.a.N(this, iVar);
    }

    @Override // m20.o
    public m20.c m0(m20.d dVar) {
        return c.a.t0(this, dVar);
    }

    @Override // m20.o
    public m20.l n(m20.c cVar) {
        return c.a.q0(this, cVar);
    }

    @Override // m20.o
    public m20.b n0(m20.d dVar) {
        return c.a.k(this, dVar);
    }

    @Override // m20.o
    public boolean o(m20.n nVar, m20.m mVar) {
        return c.a.D(this, nVar, mVar);
    }

    @Override // k20.e1
    public boolean o0(m20.m mVar) {
        return c.a.g0(this, mVar);
    }

    @Override // m20.o
    public boolean p(m20.l lVar) {
        return c.a.d0(this, lVar);
    }

    @Override // m20.o
    public boolean p0(m20.m mVar) {
        return c.a.R(this, mVar);
    }

    @Override // m20.o
    public m20.j q(m20.e eVar) {
        return c.a.n0(this, eVar);
    }

    @Override // m20.o
    public Collection<m20.i> q0(m20.j jVar) {
        return c.a.p0(this, jVar);
    }

    @Override // m20.o
    public t r(m20.l lVar) {
        return c.a.z(this, lVar);
    }

    @Override // m20.o
    public m20.i r0(m20.i iVar) {
        return c.a.k0(this, iVar);
    }

    @Override // m20.o
    public boolean s(m20.m mVar) {
        return c.a.J(this, mVar);
    }

    @Override // k20.e1
    public m20.i s0(m20.i iVar) {
        return c.a.l0(this, iVar);
    }

    @Override // m20.o
    public boolean t(m20.i iVar) {
        return c.a.C(this, iVar);
    }

    @Override // m20.o
    public m20.n t0(m20.m mVar) {
        return c.a.y(this, mVar);
    }

    @Override // m20.o
    public boolean u(m20.m c12, m20.m c22) {
        s.g(c12, "c1");
        s.g(c22, "c2");
        if (c12 instanceof w0) {
            if (c22 instanceof w0) {
                return c.a.a(this, c12, c22) || y0((w0) c12, (w0) c22);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // k20.e1
    public m20.i u0(m20.i iVar) {
        return c.a.v(this, iVar);
    }

    @Override // m20.o
    public boolean v(m20.j jVar) {
        return c.a.Q(this, jVar);
    }

    @Override // m20.o
    public m20.n v0(m20.m mVar, int i11) {
        return c.a.r(this, mVar, i11);
    }

    @Override // m20.o
    public m20.j w(m20.j jVar, m20.b bVar) {
        return c.a.j(this, jVar, bVar);
    }

    @Override // k20.e1
    public u10.d w0(m20.m mVar) {
        return c.a.q(this, mVar);
    }

    @Override // m20.r
    public boolean x(m20.j jVar, m20.j jVar2) {
        return c.a.E(this, jVar, jVar2);
    }

    @Override // m20.o
    public m20.i x0(m20.d dVar) {
        return c.a.j0(this, dVar);
    }

    @Override // k20.e1
    public m20.i y(m20.n nVar) {
        return c.a.u(this, nVar);
    }

    @Override // m20.o
    public m20.l z(m20.i iVar) {
        return c.a.i(this, iVar);
    }

    public k20.g z0(boolean z11, boolean z12) {
        return new kotlin.reflect.jvm.internal.impl.types.checker.a(z11, z12, true, this.f55394c, null, this, 16, null);
    }
}