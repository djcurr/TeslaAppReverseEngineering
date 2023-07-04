package k20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes5.dex */
public class f1 {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f34257a = v.p("DONT_CARE");

    /* renamed from: b  reason: collision with root package name */
    public static final k0 f34258b = v.j("Cannot be inferred");

    /* renamed from: c  reason: collision with root package name */
    public static final k0 f34259c = new a("NO_EXPECTED_TYPE");

    /* renamed from: d  reason: collision with root package name */
    public static final k0 f34260d = new a("UNIT_EXPECTED_TYPE");

    /* loaded from: classes5.dex */
    public static class a extends o {

        /* renamed from: b  reason: collision with root package name */
        private final String f34261b;

        public a(String str) {
            this.f34261b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void T0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAnnotations"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAnnotations"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: k20.f1.a.T0(int):void");
        }

        @Override // k20.j1
        /* renamed from: O0 */
        public k0 L0(boolean z11) {
            throw new IllegalStateException(this.f34261b);
        }

        @Override // k20.j1
        /* renamed from: P0 */
        public k0 N0(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
            if (gVar == null) {
                T0(0);
            }
            throw new IllegalStateException(this.f34261b);
        }

        @Override // k20.o
        protected k0 Q0() {
            throw new IllegalStateException(this.f34261b);
        }

        @Override // k20.o
        public o S0(k0 k0Var) {
            if (k0Var == null) {
                T0(2);
            }
            throw new IllegalStateException(this.f34261b);
        }

        @Override // k20.o
        /* renamed from: U0 */
        public a R0(kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
            if (hVar == null) {
                T0(3);
            }
            return this;
        }

        @Override // k20.k0
        public String toString() {
            String str = this.f34261b;
            if (str == null) {
                T0(1);
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k20.f1.a(int):void");
    }

    public static boolean b(d0 d0Var) {
        if (d0Var == null) {
            a(28);
        }
        if (d0Var.I0()) {
            return true;
        }
        return a0.b(d0Var) && b(a0.a(d0Var).Q0());
    }

    public static boolean c(d0 d0Var, h00.l<j1, Boolean> lVar) {
        if (lVar == null) {
            a(43);
        }
        return d(d0Var, lVar, null, null);
    }

    private static boolean d(d0 d0Var, h00.l<j1, Boolean> lVar, h00.l<d0, Boolean> lVar2, s20.f<d0> fVar) {
        if (lVar == null) {
            a(46);
        }
        if (d0Var == null) {
            return false;
        }
        j1 K0 = d0Var.K0();
        if (w(d0Var)) {
            return lVar.invoke(K0).booleanValue();
        }
        if (fVar == null || !fVar.contains(d0Var)) {
            if (lVar.invoke(K0).booleanValue()) {
                return true;
            }
            if (lVar2 == null || !lVar2.invoke(K0).booleanValue()) {
                if (fVar == null) {
                    fVar = s20.f.b();
                }
                fVar.add(d0Var);
                x xVar = K0 instanceof x ? (x) K0 : null;
                if (xVar == null || !(d(xVar.P0(), lVar, lVar2, fVar) || d(xVar.Q0(), lVar, lVar2, fVar))) {
                    if ((K0 instanceof m) && d(((m) K0).T0(), lVar, lVar2, fVar)) {
                        return true;
                    }
                    w0 H0 = d0Var.H0();
                    if (H0 instanceof c0) {
                        for (d0 d0Var2 : ((c0) H0).a()) {
                            if (d(d0Var2, lVar, lVar2, fVar)) {
                                return true;
                            }
                        }
                        return false;
                    }
                    for (y0 y0Var : d0Var.G0()) {
                        if (!y0Var.a() && d(y0Var.getType(), lVar, lVar2, fVar)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean e(d0 d0Var, h00.l<j1, Boolean> lVar, h00.l<d0, Boolean> lVar2) {
        if (lVar == null) {
            a(44);
        }
        if (lVar2 == null) {
            a(45);
        }
        return d(d0Var, lVar, lVar2, null);
    }

    public static d0 f(d0 d0Var, d0 d0Var2, d1 d1Var) {
        if (d0Var == null) {
            a(20);
        }
        if (d0Var2 == null) {
            a(21);
        }
        if (d1Var == null) {
            a(22);
        }
        d0 p11 = d1Var.p(d0Var2, k1.INVARIANT);
        if (p11 != null) {
            return r(p11, d0Var.I0());
        }
        return null;
    }

    public static w00.c g(d0 d0Var) {
        if (d0Var == null) {
            a(30);
        }
        w00.e n11 = d0Var.H0().n();
        if (n11 instanceof w00.c) {
            return (w00.c) n11;
        }
        return null;
    }

    public static List<y0> h(List<w00.s0> list) {
        List<y0> O0;
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (w00.s0 s0Var : list) {
            arrayList.add(new a1(s0Var.n()));
        }
        O0 = wz.e0.O0(arrayList);
        if (O0 == null) {
            a(17);
        }
        return O0;
    }

    public static List<d0> i(d0 d0Var) {
        if (d0Var == null) {
            a(18);
        }
        d1 f11 = d1.f(d0Var);
        Collection<d0> a11 = d0Var.H0().a();
        ArrayList arrayList = new ArrayList(a11.size());
        for (d0 d0Var2 : a11) {
            d0 f12 = f(d0Var, d0Var2, f11);
            if (f12 != null) {
                arrayList.add(f12);
            }
        }
        return arrayList;
    }

    public static w00.s0 j(d0 d0Var) {
        if (d0Var == null) {
            a(64);
        }
        if (d0Var.H0().n() instanceof w00.s0) {
            return (w00.s0) d0Var.H0().n();
        }
        return null;
    }

    public static boolean k(d0 d0Var) {
        if (d0Var == null) {
            a(29);
        }
        if (d0Var.H0().n() instanceof w00.c) {
            return false;
        }
        for (d0 d0Var2 : i(d0Var)) {
            if (m(d0Var2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(d0 d0Var) {
        return d0Var != null && d0Var.H0() == f34257a.H0();
    }

    public static boolean m(d0 d0Var) {
        if (d0Var == null) {
            a(27);
        }
        if (d0Var.I0()) {
            return true;
        }
        if (a0.b(d0Var) && m(a0.a(d0Var).Q0())) {
            return true;
        }
        if (n0.c(d0Var)) {
            return false;
        }
        if (n(d0Var)) {
            return k(d0Var);
        }
        if (d0Var instanceof e) {
            w00.s0 a11 = ((kotlin.reflect.jvm.internal.impl.types.checker.o) ((e) d0Var).Q0()).a();
            return a11 == null || k(a11.n());
        }
        w0 H0 = d0Var.H0();
        if (H0 instanceof c0) {
            for (d0 d0Var2 : H0.a()) {
                if (m(d0Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean n(d0 d0Var) {
        if (d0Var == null) {
            a(61);
        }
        return j(d0Var) != null || (d0Var.H0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.o);
    }

    public static d0 o(d0 d0Var) {
        if (d0Var == null) {
            a(2);
        }
        return q(d0Var, false);
    }

    public static d0 p(d0 d0Var) {
        if (d0Var == null) {
            a(1);
        }
        return q(d0Var, true);
    }

    public static d0 q(d0 d0Var, boolean z11) {
        if (d0Var == null) {
            a(3);
        }
        j1 L0 = d0Var.K0().L0(z11);
        if (L0 == null) {
            a(4);
        }
        return L0;
    }

    public static d0 r(d0 d0Var, boolean z11) {
        if (d0Var == null) {
            a(8);
        }
        if (z11) {
            return p(d0Var);
        }
        if (d0Var == null) {
            a(9);
        }
        return d0Var;
    }

    public static k0 s(k0 k0Var, boolean z11) {
        if (k0Var == null) {
            a(5);
        }
        if (!z11) {
            if (k0Var == null) {
                a(7);
            }
            return k0Var;
        }
        k0 O0 = k0Var.O0(true);
        if (O0 == null) {
            a(6);
        }
        return O0;
    }

    public static y0 t(w00.s0 s0Var) {
        if (s0Var == null) {
            a(47);
        }
        return new p0(s0Var);
    }

    public static k0 u(w0 w0Var, d20.h hVar, h00.l<kotlin.reflect.jvm.internal.impl.types.checker.h, k0> lVar) {
        if (w0Var == null) {
            a(12);
        }
        if (hVar == null) {
            a(13);
        }
        if (lVar == null) {
            a(14);
        }
        k0 k11 = e0.k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), w0Var, h(w0Var.getParameters()), false, hVar, lVar);
        if (k11 == null) {
            a(15);
        }
        return k11;
    }

    public static k0 v(w00.e eVar, d20.h hVar, h00.l<kotlin.reflect.jvm.internal.impl.types.checker.h, k0> lVar) {
        if (v.r(eVar)) {
            k0 j11 = v.j("Unsubstituted type for " + eVar);
            if (j11 == null) {
                a(11);
            }
            return j11;
        }
        return u(eVar.i(), hVar, lVar);
    }

    public static boolean w(d0 d0Var) {
        if (d0Var == null) {
            a(0);
        }
        return d0Var == f34259c || d0Var == f34260d;
    }
}