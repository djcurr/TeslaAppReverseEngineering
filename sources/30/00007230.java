package h2;

import c1.s1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t1.o0;
import t1.p0;

/* loaded from: classes.dex */
public final class w extends b<f2.v> {
    private static final o0 L;
    private c1.o0<f2.v> K;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        o0 a11 = t1.i.a();
        a11.l(t1.a0.f51365b.b());
        a11.w(1.0f);
        a11.v(p0.f51496a.b());
        L = a11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(o wrapped, f2.v modifier) {
        super(wrapped, modifier);
        kotlin.jvm.internal.s.g(wrapped, "wrapped");
        kotlin.jvm.internal.s.g(modifier, "modifier");
    }

    private final f2.v j2() {
        c1.o0<f2.v> o0Var = this.K;
        if (o0Var == null) {
            o0Var = s1.d(a2(), null, 2, null);
        }
        this.K = o0Var;
        return o0Var.getValue();
    }

    @Override // h2.o
    public void J1() {
        super.J1();
        c1.o0<f2.v> o0Var = this.K;
        if (o0Var == null) {
            return;
        }
        o0Var.setValue(a2());
    }

    @Override // h2.b, h2.o
    public void M1(t1.u canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        v1().S0(canvas);
        if (n.a(n1()).getShowLayoutBounds()) {
            T0(canvas, L);
        }
    }

    @Override // h2.b, h2.o
    public int O0(f2.a alignmentLine) {
        int h11;
        kotlin.jvm.internal.s.g(alignmentLine, "alignmentLine");
        if (o1().c().containsKey(alignmentLine)) {
            Integer num = o1().c().get(alignmentLine);
            if (num == null) {
                return Integer.MIN_VALUE;
            }
            return num.intValue();
        }
        int Z = v1().Z(alignmentLine);
        if (Z == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        T1(true);
        C0(r1(), x1(), m1());
        T1(false);
        if (alignmentLine instanceof f2.i) {
            h11 = x2.k.i(v1().r1());
        } else {
            h11 = x2.k.h(v1().r1());
        }
        return Z + h11;
    }

    @Override // h2.b, f2.j
    public int S(int i11) {
        return j2().t(p1(), v1(), i11);
    }

    @Override // h2.b, f2.j
    public int T(int i11) {
        return j2().h0(p1(), v1(), i11);
    }

    @Override // h2.b, f2.y
    public f2.m0 X(long j11) {
        long y02;
        F0(j11);
        S1(a2().Z(p1(), v1(), j11));
        e0 l12 = l1();
        if (l12 != null) {
            y02 = y0();
            l12.c(y02);
        }
        return this;
    }

    @Override // h2.b, f2.j
    public int a(int i11) {
        return j2().L(p1(), v1(), i11);
    }

    @Override // h2.b, f2.j
    public int u(int i11) {
        return j2().S(p1(), v1(), i11);
    }
}