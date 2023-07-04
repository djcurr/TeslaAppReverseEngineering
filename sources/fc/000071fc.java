package h2;

import h2.k;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t1.o0;
import t1.p0;

/* loaded from: classes.dex */
public final class h extends o implements x2.d {
    private static final o0 F;
    private final /* synthetic */ f2.b0 E;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28667a;

        static {
            int[] iArr = new int[r1.x.values().length];
            iArr[r1.x.Active.ordinal()] = 1;
            iArr[r1.x.ActiveParent.ordinal()] = 2;
            iArr[r1.x.Captured.ordinal()] = 3;
            iArr[r1.x.DeactivatedParent.ordinal()] = 4;
            iArr[r1.x.Deactivated.ordinal()] = 5;
            iArr[r1.x.Inactive.ordinal()] = 6;
            f28667a = iArr;
        }
    }

    static {
        new a(null);
        o0 a11 = t1.i.a();
        a11.l(t1.a0.f51365b.d());
        a11.w(1.0f);
        a11.v(p0.f51496a.b());
        F = a11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k layoutNode) {
        super(layoutNode);
        kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
        this.E = layoutNode.W();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h2.o, f2.m0
    public void C0(long j11, float f11, h00.l<? super t1.g0, vz.b0> lVar) {
        super.C0(j11, f11, lVar);
        o w12 = w1();
        boolean z11 = false;
        if (w12 != null && w12.D1()) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        n1().D0();
    }

    @Override // x2.d
    public int G(float f11) {
        return this.E.G(f11);
    }

    @Override // x2.d
    public float M(long j11) {
        return this.E.M(j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // h2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void M1(t1.u r7) {
        /*
            r6 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.s.g(r7, r0)
            h2.k r0 = r6.n1()
            h2.f0 r0 = h2.n.a(r0)
            h2.k r1 = r6.n1()
            d1.e r1 = r1.i0()
            int r2 = r1.l()
            if (r2 <= 0) goto L31
            r3 = 0
            java.lang.Object[] r1 = r1.k()
        L20:
            r4 = r1[r3]
            h2.k r4 = (h2.k) r4
            boolean r5 = r4.e()
            if (r5 == 0) goto L2d
            r4.G(r7)
        L2d:
            int r3 = r3 + 1
            if (r3 < r2) goto L20
        L31:
            boolean r0 = r0.getShowLayoutBounds()
            if (r0 == 0) goto L3c
            t1.o0 r0 = h2.h.F
            r6.T0(r7, r0)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.h.M1(t1.u):void");
    }

    @Override // h2.o
    public int O0(f2.a alignmentLine) {
        kotlin.jvm.internal.s.g(alignmentLine, "alignmentLine");
        Integer num = n1().A().get(alignmentLine);
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    @Override // h2.o
    public void O1(r1.w focusState) {
        kotlin.jvm.internal.s.g(focusState, "focusState");
        int i11 = 0;
        List<s> f12 = f1(false);
        int size = f12.size();
        s sVar = null;
        Boolean bool = null;
        while (i11 < size) {
            int i12 = i11 + 1;
            s sVar2 = f12.get(i11);
            switch (b.f28667a[sVar2.k2().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    bool = Boolean.FALSE;
                    sVar = sVar2;
                    break;
                case 5:
                    if (bool != null) {
                        break;
                    } else {
                        bool = Boolean.TRUE;
                        break;
                    }
                case 6:
                    bool = Boolean.FALSE;
                    break;
            }
            i11 = i12;
        }
        r1.x k22 = sVar != null ? sVar.k2() : null;
        if (k22 == null) {
            k22 = kotlin.jvm.internal.s.c(bool, Boolean.TRUE) ? r1.x.Deactivated : r1.x.Inactive;
        }
        super.O1(k22);
    }

    @Override // f2.j
    public int S(int i11) {
        return n1().Q().f(i11);
    }

    @Override // f2.j
    public int T(int i11) {
        return n1().Q().c(i11);
    }

    @Override // h2.o
    public boolean V1() {
        return false;
    }

    @Override // h2.o
    public s W0() {
        return c1();
    }

    @Override // f2.y
    public f2.m0 X(long j11) {
        F0(j11);
        d1.e<k> j02 = n1().j0();
        int l11 = j02.l();
        if (l11 > 0) {
            int i11 = 0;
            k[] k11 = j02.k();
            do {
                k11[i11].T0(k.g.NotUsed);
                i11++;
            } while (i11 < l11);
            n1().k0(n1().V().b(n1().W(), n1().J(), j11));
            return this;
        }
        n1().k0(n1().V().b(n1().W(), n1().J(), j11));
        return this;
    }

    @Override // h2.o
    public v X0() {
        return d1();
    }

    @Override // h2.o
    public s Y0(boolean z11) {
        return null;
    }

    @Override // h2.o
    public c2.b Z0() {
        return null;
    }

    @Override // f2.j
    public int a(int i11) {
        return n1().Q().b(i11);
    }

    @Override // x2.d
    public float b0(int i11) {
        return this.E.b0(i11);
    }

    @Override // x2.d
    public float c0() {
        return this.E.c0();
    }

    @Override // h2.o
    public s c1() {
        o w12 = w1();
        if (w12 == null) {
            return null;
        }
        return w12.c1();
    }

    @Override // h2.o
    public v d1() {
        o w12 = w1();
        if (w12 == null) {
            return null;
        }
        return w12.d1();
    }

    @Override // h2.o
    public c2.b e1() {
        o w12 = w1();
        if (w12 == null) {
            return null;
        }
        return w12.e1();
    }

    @Override // x2.d
    public float getDensity() {
        return this.E.getDensity();
    }

    @Override // x2.d
    public float i0(float f11) {
        return this.E.i0(f11);
    }

    @Override // x2.d
    public int l0(long j11) {
        return this.E.l0(j11);
    }

    @Override // x2.d
    public long p0(long j11) {
        return this.E.p0(j11);
    }

    @Override // h2.o
    public f2.b0 p1() {
        return n1().W();
    }

    @Override // f2.j
    public Object t() {
        return null;
    }

    @Override // f2.j
    public int u(int i11) {
        return n1().Q().e(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094 A[EDGE_INSN: B:39:0x0094->B:37:0x0094 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // h2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y1(long r18, h2.f<d2.a0> r20, boolean r21, boolean r22) {
        /*
            r17 = this;
            r6 = r20
            java.lang.String r0 = "hitTestResult"
            kotlin.jvm.internal.s.g(r6, r0)
            boolean r0 = r17.Y1(r18)
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L17
            r9 = r17
            r10 = r18
            r12 = r22
        L15:
            r0 = r8
            goto L3f
        L17:
            if (r21 == 0) goto L38
            long r0 = r17.q1()
            r9 = r17
            r10 = r18
            float r0 = r9.R0(r10, r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L33
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L33
            r0 = r8
            goto L34
        L33:
            r0 = r7
        L34:
            if (r0 == 0) goto L3c
            r12 = r7
            goto L15
        L38:
            r9 = r17
            r10 = r18
        L3c:
            r12 = r22
            r0 = r7
        L3f:
            if (r0 == 0) goto L97
            int r13 = h2.f.c(r20)
            h2.k r0 = r17.n1()
            d1.e r0 = r0.i0()
            int r1 = r0.l()
            if (r1 <= 0) goto L94
            int r1 = r1 - r8
            java.lang.Object[] r14 = r0.k()
            r15 = r1
        L59:
            r0 = r14[r15]
            r16 = r0
            h2.k r16 = (h2.k) r16
            boolean r0 = r16.e()
            if (r0 == 0) goto L8c
            r0 = r16
            r1 = r18
            r3 = r20
            r4 = r21
            r5 = r12
            r0.m0(r1, r3, r4, r5)
            boolean r0 = r20.k()
            if (r0 != 0) goto L79
        L77:
            r0 = r8
            goto L88
        L79:
            h2.o r0 = r16.c0()
            boolean r0 = r0.V1()
            if (r0 == 0) goto L87
            r20.b()
            goto L77
        L87:
            r0 = r7
        L88:
            if (r0 != 0) goto L8c
            r0 = r8
            goto L8d
        L8c:
            r0 = r7
        L8d:
            if (r0 == 0) goto L90
            goto L94
        L90:
            int r15 = r15 + (-1)
            if (r15 >= 0) goto L59
        L94:
            h2.f.f(r6, r13)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.h.y1(long, h2.f, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[EDGE_INSN: B:37:0x008d->B:35:0x008d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // h2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z1(long r18, h2.f<l2.x> r20, boolean r21) {
        /*
            r17 = this;
            r6 = r20
            java.lang.String r0 = "hitSemanticsWrappers"
            kotlin.jvm.internal.s.g(r6, r0)
            boolean r0 = r17.Y1(r18)
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L17
            r9 = r17
            r10 = r18
            r12 = r21
        L15:
            r0 = r8
            goto L39
        L17:
            long r0 = r17.q1()
            r9 = r17
            r10 = r18
            float r0 = r9.R0(r10, r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L31
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L31
            r0 = r8
            goto L32
        L31:
            r0 = r7
        L32:
            if (r0 == 0) goto L36
            r12 = r7
            goto L15
        L36:
            r12 = r21
            r0 = r7
        L39:
            if (r0 == 0) goto L90
            int r13 = h2.f.c(r20)
            h2.k r0 = r17.n1()
            d1.e r0 = r0.i0()
            int r1 = r0.l()
            if (r1 <= 0) goto L8d
            int r1 = r1 - r8
            java.lang.Object[] r14 = r0.k()
            r15 = r1
        L53:
            r0 = r14[r15]
            r16 = r0
            h2.k r16 = (h2.k) r16
            boolean r0 = r16.e()
            if (r0 == 0) goto L85
            r4 = 1
            r0 = r16
            r1 = r18
            r3 = r20
            r5 = r12
            r0.o0(r1, r3, r4, r5)
            boolean r0 = r20.k()
            if (r0 != 0) goto L72
        L70:
            r0 = r8
            goto L81
        L72:
            h2.o r0 = r16.c0()
            boolean r0 = r0.V1()
            if (r0 == 0) goto L80
            r20.b()
            goto L70
        L80:
            r0 = r7
        L81:
            if (r0 != 0) goto L85
            r0 = r8
            goto L86
        L85:
            r0 = r7
        L86:
            if (r0 == 0) goto L89
            goto L8d
        L89:
            int r15 = r15 + (-1)
            if (r15 >= 0) goto L53
        L8d:
            h2.f.f(r6, r13)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.h.z1(long, h2.f, boolean):void");
    }
}