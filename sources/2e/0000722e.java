package h2;

/* loaded from: classes.dex */
public final class u extends b<r1.t> {
    private r1.s K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(o wrapped, r1.t modifier) {
        super(wrapped, modifier);
        kotlin.jvm.internal.s.g(wrapped, "wrapped");
        kotlin.jvm.internal.s.g(modifier, "modifier");
    }

    private final void k2(r1.s sVar) {
        d1.e<u> b11;
        d1.e<u> b12;
        r1.s sVar2 = this.K;
        if (sVar2 != null && (b12 = sVar2.b()) != null) {
            b12.q(this);
        }
        this.K = sVar;
        if (sVar == null || (b11 = sVar.b()) == null) {
            return;
        }
        b11.b(this);
    }

    @Override // h2.o
    public void J1() {
        super.J1();
        k2(a2().v());
    }

    @Override // h2.o
    public void N0() {
        super.N0();
        k2(a2().v());
    }

    @Override // h2.o
    public void Q0() {
        k2(null);
        super.Q0();
    }

    public final s j2() {
        s Y0 = Y0(false);
        return Y0 == null ? r1.l.c(n1(), null, false, 1, null) : Y0;
    }
}