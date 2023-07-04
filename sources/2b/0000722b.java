package h2;

/* loaded from: classes.dex */
public final class s extends b<r1.j> {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28769a;

        static {
            int[] iArr = new int[r1.x.values().length];
            iArr[r1.x.Active.ordinal()] = 1;
            iArr[r1.x.Captured.ordinal()] = 2;
            iArr[r1.x.ActiveParent.ordinal()] = 3;
            iArr[r1.x.DeactivatedParent.ordinal()] = 4;
            iArr[r1.x.Deactivated.ordinal()] = 5;
            iArr[r1.x.Inactive.ordinal()] = 6;
            f28769a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o wrapped, r1.j modifier) {
        super(wrapped, modifier);
        kotlin.jvm.internal.s.g(wrapped, "wrapped");
        kotlin.jvm.internal.s.g(modifier, "modifier");
    }

    @Override // h2.b, h2.o
    public void G1() {
        super.G1();
        a2().g(this);
    }

    @Override // h2.o
    public void J1() {
        super.J1();
        m2(k2());
    }

    @Override // h2.o
    public void N0() {
        super.N0();
        m2(k2());
    }

    @Override // h2.o
    public void N1(r1.m focusOrder) {
        kotlin.jvm.internal.s.g(focusOrder, "focusOrder");
    }

    @Override // h2.o
    public void O1(r1.w focusState) {
        kotlin.jvm.internal.s.g(focusState, "focusState");
    }

    @Override // h2.o
    public void Q0() {
        r1.g focusManager;
        r1.x xVar;
        r1.x k22 = k2();
        int[] iArr = a.f28769a;
        int i11 = iArr[k22.ordinal()];
        if (i11 == 1 || i11 == 2) {
            f0 d02 = n1().d0();
            if (d02 != null && (focusManager = d02.getFocusManager()) != null) {
                focusManager.b(true);
            }
        } else {
            if (i11 == 3 || i11 == 4) {
                s Y0 = v1().Y0(false);
                if (Y0 == null) {
                    Y0 = r1.l.c(n1(), null, false, 1, null);
                }
                s a12 = a1();
                if (a12 != null) {
                    a12.a2().j(Y0);
                    if (Y0 != null) {
                        m2(Y0.k2());
                    } else {
                        int i12 = iArr[a12.k2().ordinal()];
                        if (i12 == 3) {
                            xVar = r1.x.Inactive;
                        } else if (i12 != 4) {
                            xVar = a12.k2();
                        } else {
                            xVar = r1.x.Deactivated;
                        }
                        a12.n2(xVar);
                    }
                }
            } else if (i11 == 5) {
                s Y02 = v1().Y0(false);
                if (Y02 == null) {
                    Y02 = r1.l.c(n1(), null, false, 1, null);
                }
                r1.x k23 = Y02 != null ? Y02.k2() : null;
                if (k23 == null) {
                    k23 = r1.x.Inactive;
                }
                m2(k23);
            }
        }
        super.Q0();
    }

    @Override // h2.b, h2.o
    public s Y0(boolean z11) {
        return (a2().c().isDeactivated() && z11) ? super.Y0(z11) : this;
    }

    @Override // h2.b, h2.o
    public s c1() {
        return this;
    }

    public final s1.h j2() {
        return f2.p.d(this).h0(this, false);
    }

    public final r1.x k2() {
        return a2().c();
    }

    public final s l2() {
        return a2().d();
    }

    public final void m2(r1.w focusState) {
        o w12;
        kotlin.jvm.internal.s.g(focusState, "focusState");
        if (h() && a2().e() && (w12 = w1()) != null) {
            w12.O1(focusState);
        }
    }

    public final void n2(r1.x value) {
        kotlin.jvm.internal.s.g(value, "value");
        a2().i(value);
        m2(value);
    }

    public final void o2(s sVar) {
        a2().j(sVar);
    }
}