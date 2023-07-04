package h2;

import ch.qos.logback.core.CoreConstants;
import f2.m0;
import h2.k;

/* loaded from: classes.dex */
public final class d0 extends f2.m0 implements f2.y {

    /* renamed from: e  reason: collision with root package name */
    private final k f28626e;

    /* renamed from: f  reason: collision with root package name */
    private o f28627f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f28628g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f28629h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f28630i;

    /* renamed from: j  reason: collision with root package name */
    private long f28631j;

    /* renamed from: k  reason: collision with root package name */
    private h00.l<? super t1.g0, vz.b0> f28632k;

    /* renamed from: l  reason: collision with root package name */
    private float f28633l;

    /* renamed from: m  reason: collision with root package name */
    private Object f28634m;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28635a;

        static {
            int[] iArr = new int[k.e.values().length];
            iArr[k.e.Measuring.ordinal()] = 1;
            iArr[k.e.LayingOut.ordinal()] = 2;
            f28635a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f28637b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f28638c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.l<t1.g0, vz.b0> f28639d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(long j11, float f11, h00.l<? super t1.g0, vz.b0> lVar) {
            super(0);
            this.f28637b = j11;
            this.f28638c = f11;
            this.f28639d = lVar;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            d0.this.L0(this.f28637b, this.f28638c, this.f28639d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f28641b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11) {
            super(0);
            this.f28641b = j11;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            d0.this.J0().X(this.f28641b);
        }
    }

    public d0(k layoutNode, o outerWrapper) {
        kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
        kotlin.jvm.internal.s.g(outerWrapper, "outerWrapper");
        this.f28626e = layoutNode;
        this.f28627f = outerWrapper;
        this.f28631j = x2.k.f56947b.a();
    }

    private final void K0() {
        this.f28626e.N0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0(long j11, float f11, h00.l<? super t1.g0, vz.b0> lVar) {
        m0.a.C0504a c0504a = m0.a.f25586a;
        if (lVar == null) {
            c0504a.k(J0(), j11, f11);
        } else {
            c0504a.w(J0(), j11, f11, lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f2.m0
    public void C0(long j11, float f11, h00.l<? super t1.g0, vz.b0> lVar) {
        this.f28631j = j11;
        this.f28633l = f11;
        this.f28632k = lVar;
        o w12 = this.f28627f.w1();
        if (w12 != null && w12.D1()) {
            L0(j11, f11, lVar);
            return;
        }
        this.f28629h = true;
        this.f28626e.H().p(false);
        n.a(this.f28626e).getSnapshotObserver().b(this.f28626e, new b(j11, f11, lVar));
    }

    public final boolean H0() {
        return this.f28630i;
    }

    public final x2.b I0() {
        if (this.f28628g) {
            return x2.b.b(A0());
        }
        return null;
    }

    public final o J0() {
        return this.f28627f;
    }

    public final void M0() {
        this.f28634m = this.f28627f.t();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N0(long r9) {
        /*
            r8 = this;
            h2.k r0 = r8.f28626e
            h2.f0 r0 = h2.n.a(r0)
            h2.k r1 = r8.f28626e
            h2.k r1 = r1.e0()
            h2.k r2 = r8.f28626e
            boolean r3 = r2.I()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L21
            if (r1 == 0) goto L1f
            boolean r1 = r1.I()
            if (r1 == 0) goto L1f
            goto L21
        L1f:
            r1 = r5
            goto L22
        L21:
            r1 = r4
        L22:
            r2.Q0(r1)
            h2.k r1 = r8.f28626e
            h2.k$e r1 = r1.R()
            h2.k$e r2 = h2.k.e.NeedsRemeasure
            if (r1 == r2) goto L40
            long r1 = r8.A0()
            boolean r1 = x2.b.g(r1, r9)
            if (r1 != 0) goto L3a
            goto L40
        L3a:
            h2.k r9 = r8.f28626e
            r0.k(r9)
            return r5
        L40:
            h2.k r1 = r8.f28626e
            h2.l r1 = r1.H()
            r1.q(r5)
            h2.k r1 = r8.f28626e
            d1.e r1 = r1.j0()
            int r2 = r1.l()
            if (r2 <= 0) goto L68
            java.lang.Object[] r1 = r1.k()
            r3 = r5
        L5a:
            r6 = r1[r3]
            h2.k r6 = (h2.k) r6
            h2.l r6 = r6.H()
            r6.s(r5)
            int r3 = r3 + r4
            if (r3 < r2) goto L5a
        L68:
            r8.f28628g = r4
            h2.k r1 = r8.f28626e
            h2.k$e r2 = h2.k.e.Measuring
            r1.S0(r2)
            r8.F0(r9)
            h2.o r1 = r8.f28627f
            long r6 = r1.e()
            h2.h0 r0 = r0.getSnapshotObserver()
            h2.k r1 = r8.f28626e
            h2.d0$c r3 = new h2.d0$c
            r3.<init>(r9)
            r0.d(r1, r3)
            h2.k r9 = r8.f28626e
            h2.k$e r9 = r9.R()
            if (r9 != r2) goto L97
            h2.k r9 = r8.f28626e
            h2.k$e r10 = h2.k.e.NeedsRelayout
            r9.S0(r10)
        L97:
            h2.o r9 = r8.f28627f
            long r9 = r9.e()
            boolean r9 = x2.o.e(r9, r6)
            if (r9 == 0) goto Lbd
            h2.o r9 = r8.f28627f
            int r9 = r9.B0()
            int r10 = r8.B0()
            if (r9 != r10) goto Lbd
            h2.o r9 = r8.f28627f
            int r9 = r9.w0()
            int r10 = r8.w0()
            if (r9 == r10) goto Lbc
            goto Lbd
        Lbc:
            r4 = r5
        Lbd:
            h2.o r9 = r8.f28627f
            int r9 = r9.B0()
            h2.o r10 = r8.f28627f
            int r10 = r10.w0()
            long r9 = x2.p.a(r9, r10)
            r8.E0(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.d0.N0(long):boolean");
    }

    public final void O0() {
        if (this.f28629h) {
            C0(this.f28631j, this.f28633l, this.f28632k);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void P0(o oVar) {
        kotlin.jvm.internal.s.g(oVar, "<set-?>");
        this.f28627f = oVar;
    }

    @Override // f2.j
    public int S(int i11) {
        K0();
        return this.f28627f.S(i11);
    }

    @Override // f2.j
    public int T(int i11) {
        K0();
        return this.f28627f.T(i11);
    }

    @Override // f2.y
    public f2.m0 X(long j11) {
        k.g gVar;
        k e02 = this.f28626e.e0();
        if (e02 != null) {
            if (this.f28626e.Y() == k.g.NotUsed || this.f28626e.I()) {
                k kVar = this.f28626e;
                int i11 = a.f28635a[e02.R().ordinal()];
                if (i11 == 1) {
                    gVar = k.g.InMeasureBlock;
                } else if (i11 == 2) {
                    gVar = k.g.InLayoutBlock;
                } else {
                    throw new IllegalStateException(kotlin.jvm.internal.s.p("Measurable could be only measured from the parent's measure or layout block.Parents state is ", e02.R()));
                }
                kVar.T0(gVar);
            } else {
                throw new IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + this.f28626e.Y() + ". Parent state " + e02.R() + CoreConstants.DOT).toString());
            }
        } else {
            this.f28626e.T0(k.g.NotUsed);
        }
        N0(j11);
        return this;
    }

    @Override // f2.c0
    public int Z(f2.a alignmentLine) {
        kotlin.jvm.internal.s.g(alignmentLine, "alignmentLine");
        k e02 = this.f28626e.e0();
        if ((e02 == null ? null : e02.R()) == k.e.Measuring) {
            this.f28626e.H().s(true);
        } else {
            k e03 = this.f28626e.e0();
            if ((e03 != null ? e03.R() : null) == k.e.LayingOut) {
                this.f28626e.H().r(true);
            }
        }
        this.f28630i = true;
        int Z = this.f28627f.Z(alignmentLine);
        this.f28630i = false;
        return Z;
    }

    @Override // f2.j
    public int a(int i11) {
        K0();
        return this.f28627f.a(i11);
    }

    @Override // f2.j
    public Object t() {
        return this.f28634m;
    }

    @Override // f2.j
    public int u(int i11) {
        K0();
        return this.f28627f.u(i11);
    }

    @Override // f2.m0
    public int z0() {
        return this.f28627f.z0();
    }
}