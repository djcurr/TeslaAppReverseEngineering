package l2;

import h2.f0;
import vz.b0;

/* loaded from: classes.dex */
public final class x extends h2.b<m> {

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<Boolean, b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f36512b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h2.f<x> f36513c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, h2.f<x> fVar) {
            super(1);
            this.f36512b = j11;
            this.f36513c = fVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return b0.f54756a;
        }

        public final void invoke(boolean z11) {
            x.this.v1().z1(x.this.v1().g1(this.f36512b), this.f36513c, z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(h2.o wrapped, m semanticsModifier) {
        super(wrapped, semanticsModifier);
        kotlin.jvm.internal.s.g(wrapped, "wrapped");
        kotlin.jvm.internal.s.g(semanticsModifier, "semanticsModifier");
    }

    private final boolean k2() {
        return l.a(a2().r0(), j.f36419a.h()) != null;
    }

    @Override // h2.o
    public void J1() {
        super.J1();
        f0 d02 = n1().d0();
        if (d02 == null) {
            return;
        }
        d02.o();
    }

    @Override // h2.o
    public void Q0() {
        super.Q0();
        f0 d02 = n1().d0();
        if (d02 == null) {
            return;
        }
        d02.o();
    }

    public final k j2() {
        x xVar;
        h2.o v12 = v1();
        while (true) {
            if (v12 == null) {
                xVar = null;
                break;
            } else if (v12 instanceof x) {
                xVar = (x) v12;
                break;
            } else {
                v12 = v12.v1();
            }
        }
        if (xVar != null && !a2().r0().k()) {
            k f11 = a2().r0().f();
            f11.c(xVar.j2());
            return f11;
        }
        return a2().r0();
    }

    public final s1.h l2() {
        if (!h()) {
            return s1.h.f49955e.a();
        }
        if (!k2()) {
            return f2.p.b(this);
        }
        f2.o d11 = f2.p.d(this);
        s1.d t12 = t1();
        long P0 = P0(q1());
        t12.i(-s1.l.i(P0));
        t12.k(-s1.l.g(P0));
        t12.j(z0() + s1.l.i(P0));
        t12.h(x0() + s1.l.g(P0));
        h2.o oVar = this;
        while (oVar != d11) {
            oVar.P1(t12, false, true);
            if (t12.f()) {
                return s1.h.f49955e.a();
            }
            oVar = oVar.w1();
            kotlin.jvm.internal.s.e(oVar);
        }
        return s1.e.a(t12);
    }

    public String toString() {
        return super.toString() + " id: " + a2().getId() + " config: " + a2().r0();
    }

    @Override // h2.b, h2.o
    public void z1(long j11, h2.f<x> hitSemanticsWrappers, boolean z11) {
        kotlin.jvm.internal.s.g(hitSemanticsWrappers, "hitSemanticsWrappers");
        c2(j11, hitSemanticsWrappers, false, true, z11, this, new a(j11, hitSemanticsWrappers));
    }
}