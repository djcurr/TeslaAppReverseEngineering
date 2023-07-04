package h2;

/* loaded from: classes.dex */
public final class r extends b<r1.d> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(o wrapped, r1.d modifier) {
        super(wrapped, modifier);
        kotlin.jvm.internal.s.g(wrapped, "wrapped");
        kotlin.jvm.internal.s.g(modifier, "modifier");
    }

    @Override // h2.o
    public void J1() {
        r1.j a22;
        super.J1();
        s Y0 = v1().Y0(false);
        r1.x xVar = null;
        if (Y0 == null) {
            Y0 = r1.l.c(n1(), null, false, 1, null);
        }
        r1.d a23 = a2();
        if (Y0 != null && (a22 = Y0.a2()) != null) {
            xVar = a22.c();
        }
        if (xVar == null) {
            xVar = r1.x.Inactive;
        }
        a23.e0(xVar);
    }

    @Override // h2.o
    public void O1(r1.w focusState) {
        kotlin.jvm.internal.s.g(focusState, "focusState");
        a2().e0(focusState);
        if (((Boolean) K1(r1.k.c())).booleanValue()) {
            super.O1(focusState);
        }
    }
}