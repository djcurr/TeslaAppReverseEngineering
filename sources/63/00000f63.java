package c2;

import h2.k;
import h2.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import v20.o0;

/* loaded from: classes.dex */
public final class b extends h2.b<e> {
    private c2.a K;
    private e L;
    private final h O;
    private final d1.e<b> P;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends u implements h00.a<o0> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final o0 mo11invoke() {
            return (o0) b.this.k2().mo11invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0169b extends u implements h00.a<o0> {
        C0169b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final o0 mo11invoke() {
            e a22;
            d q02;
            b bVar = b.this;
            if (bVar == null || (a22 = bVar.a2()) == null || (q02 = a22.q0()) == null) {
                return null;
            }
            return q02.g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o wrapped, e nestedScrollModifier) {
        super(wrapped, nestedScrollModifier);
        s.g(wrapped, "wrapped");
        s.g(nestedScrollModifier, "nestedScrollModifier");
        c2.a aVar = this.K;
        this.O = new h(aVar == null ? c.f8730a : aVar, nestedScrollModifier.getConnection());
        this.P = new d1.e<>(new b[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h00.a<o0> k2() {
        return a2().q0().e();
    }

    private final void m2(d1.e<k> eVar) {
        int l11 = eVar.l();
        if (l11 > 0) {
            int i11 = 0;
            k[] k11 = eVar.k();
            do {
                k kVar = k11[i11];
                b Z0 = kVar.c0().Z0();
                if (Z0 != null) {
                    this.P.b(Z0);
                } else {
                    m2(kVar.j0());
                }
                i11++;
            } while (i11 < l11);
        }
    }

    private final void n2(c2.a aVar) {
        this.P.g();
        b Z0 = v1().Z0();
        if (Z0 != null) {
            this.P.b(Z0);
        } else {
            m2(n1().j0());
        }
        int i11 = 0;
        b bVar = this.P.o() ? this.P.k()[0] : null;
        d1.e<b> eVar = this.P;
        int l11 = eVar.l();
        if (l11 > 0) {
            b[] k11 = eVar.k();
            do {
                b bVar2 = k11[i11];
                bVar2.r2(aVar);
                bVar2.p2(aVar != null ? new a() : new C0169b());
                i11++;
            } while (i11 < l11);
        }
    }

    private final void o2() {
        e eVar = this.L;
        if (((eVar != null && eVar.getConnection() == a2().getConnection() && eVar.q0() == a2().q0()) ? false : true) && h()) {
            b e12 = super.e1();
            r2(e12 == null ? null : e12.O);
            h00.a<o0> k22 = e12 != null ? e12.k2() : null;
            if (k22 == null) {
                k22 = k2();
            }
            p2(k22);
            n2(this.O);
            this.L = a2();
        }
    }

    private final void p2(h00.a<? extends o0> aVar) {
        a2().q0().i(aVar);
    }

    private final void r2(c2.a aVar) {
        a2().q0().k(aVar);
        this.O.g(aVar == null ? c.f8730a : aVar);
        this.K = aVar;
    }

    @Override // h2.o
    public void J1() {
        super.J1();
        this.O.h(a2().getConnection());
        a2().q0().k(this.K);
        o2();
    }

    @Override // h2.o
    public void N0() {
        super.N0();
        o2();
    }

    @Override // h2.o
    public void Q0() {
        super.Q0();
        n2(this.K);
        this.L = null;
    }

    @Override // h2.b, h2.o
    public b Z0() {
        return this;
    }

    @Override // h2.b, h2.o
    public b e1() {
        return this;
    }

    @Override // h2.b
    /* renamed from: l2 */
    public e a2() {
        return (e) super.a2();
    }

    @Override // h2.b
    /* renamed from: q2 */
    public void f2(e value) {
        s.g(value, "value");
        this.L = (e) super.a2();
        super.f2(value);
    }
}