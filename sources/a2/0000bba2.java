package w00;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import p20.g;
import w00.y0;

/* loaded from: classes5.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public static final q f55305a;

    /* renamed from: b  reason: collision with root package name */
    public static final q f55306b;

    /* renamed from: c  reason: collision with root package name */
    public static final q f55307c;

    /* renamed from: d  reason: collision with root package name */
    public static final q f55308d;

    /* renamed from: e  reason: collision with root package name */
    public static final q f55309e;

    /* renamed from: f  reason: collision with root package name */
    public static final q f55310f;

    /* renamed from: g  reason: collision with root package name */
    public static final q f55311g;

    /* renamed from: h  reason: collision with root package name */
    public static final q f55312h;

    /* renamed from: i  reason: collision with root package name */
    public static final q f55313i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<q> f55314j;

    /* renamed from: k  reason: collision with root package name */
    private static final Map<q, Integer> f55315k;

    /* renamed from: l  reason: collision with root package name */
    public static final q f55316l;

    /* renamed from: m  reason: collision with root package name */
    private static final e20.d f55317m;

    /* renamed from: n  reason: collision with root package name */
    public static final e20.d f55318n;
    @Deprecated

    /* renamed from: o  reason: collision with root package name */
    public static final e20.d f55319o;

    /* renamed from: p  reason: collision with root package name */
    private static final p20.g f55320p;

    /* renamed from: q  reason: collision with root package name */
    private static final Map<z0, q> f55321q;

    /* loaded from: classes5.dex */
    static class a implements e20.d {
        a() {
        }

        @Override // e20.d
        public k20.d0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* loaded from: classes5.dex */
    static class b implements e20.d {
        b() {
        }

        @Override // e20.d
        public k20.d0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* loaded from: classes5.dex */
    static class c implements e20.d {
        c() {
        }

        @Override // e20.d
        public k20.d0 getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* loaded from: classes5.dex */
    static class d extends n {
        d(z0 z0Var) {
            super(z0Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "what";
            } else if (i11 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i11 == 1 || i11 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(w00.i iVar) {
            if (iVar == null) {
                g(0);
            }
            return w10.d.j(iVar) != o0.f55304a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [w00.i, w00.m] */
        /* JADX WARN: Type inference failed for: r5v1, types: [w00.i] */
        /* JADX WARN: Type inference failed for: r5v2, types: [w00.i] */
        /* JADX WARN: Type inference failed for: r5v4, types: [w00.i] */
        @Override // w00.q
        public boolean e(e20.d dVar, m mVar, w00.i iVar) {
            if (mVar == 0) {
                g(1);
            }
            if (iVar == null) {
                g(2);
            }
            if (w10.d.J(mVar) && h(iVar)) {
                return p.f(mVar, iVar);
            }
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                w00.f b11 = ((kotlin.reflect.jvm.internal.impl.descriptors.d) mVar).b();
                if (w10.d.G(b11) && w10.d.J(b11) && (iVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) && w10.d.J(iVar.b()) && p.f(mVar, iVar)) {
                    return true;
                }
            }
            while (mVar != 0) {
                mVar = mVar.b();
                if (mVar instanceof w00.c) {
                    if (!w10.d.x(mVar)) {
                        break;
                    }
                }
                if (mVar instanceof a0) {
                    break;
                }
            }
            if (mVar == 0) {
                return false;
            }
            while (iVar != null) {
                if (mVar == iVar) {
                    return true;
                }
                if (iVar instanceof a0) {
                    return (mVar instanceof a0) && mVar.e().equals(((a0) iVar).e()) && w10.d.b(iVar, mVar);
                }
                iVar = iVar.b();
            }
            return false;
        }
    }

    /* loaded from: classes5.dex */
    static class e extends n {
        e(z0 z0Var) {
            super(z0Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // w00.q
        public boolean e(e20.d dVar, m mVar, w00.i iVar) {
            w00.i q11;
            if (mVar == null) {
                g(0);
            }
            if (iVar == null) {
                g(1);
            }
            if (p.f55305a.e(dVar, mVar, iVar)) {
                if (dVar == p.f55318n) {
                    return true;
                }
                if (dVar != p.f55317m && (q11 = w10.d.q(mVar, w00.c.class)) != null && (dVar instanceof e20.f)) {
                    return ((e20.f) dVar).q().a().equals(q11.a());
                }
            }
            return false;
        }
    }

    /* loaded from: classes5.dex */
    static class f extends n {
        f(z0 z0Var) {
            super(z0Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 == 1) {
                objArr[0] = "from";
            } else if (i11 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i11 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i11 == 2 || i11 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private boolean h(e20.d dVar, m mVar, w00.c cVar) {
            if (mVar == null) {
                g(2);
            }
            if (cVar == null) {
                g(3);
            }
            if (dVar == p.f55319o) {
                return false;
            }
            if (!(mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) || (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) || dVar == p.f55318n) {
                return true;
            }
            if (dVar == p.f55317m || dVar == null) {
                return false;
            }
            k20.d0 a11 = dVar instanceof e20.e ? ((e20.e) dVar).a() : dVar.getType();
            return w10.d.I(a11, cVar) || k20.t.a(a11);
        }

        @Override // w00.q
        public boolean e(e20.d dVar, m mVar, w00.i iVar) {
            w00.c cVar;
            if (mVar == null) {
                g(0);
            }
            if (iVar == null) {
                g(1);
            }
            w00.c cVar2 = (w00.c) w10.d.q(mVar, w00.c.class);
            w00.c cVar3 = (w00.c) w10.d.r(iVar, w00.c.class, false);
            if (cVar3 == null) {
                return false;
            }
            if (cVar2 == null || !w10.d.x(cVar2) || (cVar = (w00.c) w10.d.q(cVar2, w00.c.class)) == null || !w10.d.H(cVar3, cVar)) {
                m M = w10.d.M(mVar);
                w00.c cVar4 = (w00.c) w10.d.q(M, w00.c.class);
                if (cVar4 == null) {
                    return false;
                }
                if (w10.d.H(cVar3, cVar4) && h(dVar, M, cVar3)) {
                    return true;
                }
                return e(dVar, mVar, cVar3.b());
            }
            return true;
        }
    }

    /* loaded from: classes5.dex */
    static class g extends n {
        g(z0 z0Var) {
            super(z0Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // w00.q
        public boolean e(e20.d dVar, m mVar, w00.i iVar) {
            if (mVar == null) {
                g(0);
            }
            if (iVar == null) {
                g(1);
            }
            if (w10.d.g(iVar).y(w10.d.g(mVar))) {
                return p.f55320p.a(mVar, iVar);
            }
            return false;
        }
    }

    /* loaded from: classes5.dex */
    static class h extends n {
        h(z0 z0Var) {
            super(z0Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // w00.q
        public boolean e(e20.d dVar, m mVar, w00.i iVar) {
            if (mVar == null) {
                g(0);
            }
            if (iVar == null) {
                g(1);
            }
            return true;
        }
    }

    /* loaded from: classes5.dex */
    static class i extends n {
        i(z0 z0Var) {
            super(z0Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // w00.q
        public boolean e(e20.d dVar, m mVar, w00.i iVar) {
            if (mVar == null) {
                g(0);
            }
            if (iVar == null) {
                g(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* loaded from: classes5.dex */
    static class j extends n {
        j(z0 z0Var) {
            super(z0Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // w00.q
        public boolean e(e20.d dVar, m mVar, w00.i iVar) {
            if (mVar == null) {
                g(0);
            }
            if (iVar == null) {
                g(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* loaded from: classes5.dex */
    static class k extends n {
        k(z0 z0Var) {
            super(z0Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // w00.q
        public boolean e(e20.d dVar, m mVar, w00.i iVar) {
            if (mVar == null) {
                g(0);
            }
            if (iVar == null) {
                g(1);
            }
            return false;
        }
    }

    /* loaded from: classes5.dex */
    static class l extends n {
        l(z0 z0Var) {
            super(z0Var);
        }

        private static /* synthetic */ void g(int i11) {
            Object[] objArr = new Object[3];
            if (i11 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // w00.q
        public boolean e(e20.d dVar, m mVar, w00.i iVar) {
            if (mVar == null) {
                g(0);
            }
            if (iVar == null) {
                g(1);
            }
            return false;
        }
    }

    static {
        Set i11;
        d dVar = new d(y0.e.f55337c);
        f55305a = dVar;
        e eVar = new e(y0.f.f55338c);
        f55306b = eVar;
        f fVar = new f(y0.g.f55339c);
        f55307c = fVar;
        g gVar = new g(y0.b.f55334c);
        f55308d = gVar;
        h hVar = new h(y0.h.f55340c);
        f55309e = hVar;
        i iVar = new i(y0.d.f55336c);
        f55310f = iVar;
        j jVar = new j(y0.a.f55333c);
        f55311g = jVar;
        k kVar = new k(y0.c.f55335c);
        f55312h = kVar;
        l lVar = new l(y0.i.f55341c);
        f55313i = lVar;
        i11 = wz.x0.i(dVar, eVar, gVar, iVar);
        f55314j = Collections.unmodifiableSet(i11);
        HashMap e11 = s20.a.e(4);
        e11.put(eVar, 0);
        e11.put(dVar, 0);
        e11.put(gVar, 1);
        e11.put(fVar, 1);
        e11.put(hVar, 2);
        f55315k = Collections.unmodifiableMap(e11);
        f55316l = hVar;
        f55317m = new a();
        f55318n = new b();
        f55319o = new c();
        Iterator it2 = ServiceLoader.load(p20.g.class, p20.g.class.getClassLoader()).iterator();
        f55320p = it2.hasNext() ? (p20.g) it2.next() : g.a.f45914a;
        f55321q = new HashMap();
        i(dVar);
        i(eVar);
        i(fVar);
        i(gVar);
        i(hVar);
        i(iVar);
        i(jVar);
        i(kVar);
        i(lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w00.p.a(int):void");
    }

    public static Integer d(q qVar, q qVar2) {
        if (qVar == null) {
            a(12);
        }
        if (qVar2 == null) {
            a(13);
        }
        Integer a11 = qVar.a(qVar2);
        if (a11 != null) {
            return a11;
        }
        Integer a12 = qVar2.a(qVar);
        if (a12 != null) {
            return Integer.valueOf(-a12.intValue());
        }
        return null;
    }

    public static m e(e20.d dVar, m mVar, w00.i iVar) {
        m e11;
        if (mVar == null) {
            a(8);
        }
        if (iVar == null) {
            a(9);
        }
        for (m mVar2 = (m) mVar.a(); mVar2 != null && mVar2.getVisibility() != f55310f; mVar2 = (m) w10.d.q(mVar2, m.class)) {
            if (!mVar2.getVisibility().e(dVar, mVar2, iVar)) {
                return mVar2;
            }
        }
        if (!(mVar instanceof y00.i0) || (e11 = e(dVar, ((y00.i0) mVar).Q(), iVar)) == null) {
            return null;
        }
        return e11;
    }

    public static boolean f(w00.i iVar, w00.i iVar2) {
        if (iVar == null) {
            a(6);
        }
        if (iVar2 == null) {
            a(7);
        }
        o0 j11 = w10.d.j(iVar2);
        if (j11 != o0.f55304a) {
            return j11.equals(w10.d.j(iVar));
        }
        return false;
    }

    public static boolean g(q qVar) {
        if (qVar == null) {
            a(14);
        }
        return qVar == f55305a || qVar == f55306b;
    }

    public static boolean h(m mVar, w00.i iVar) {
        if (mVar == null) {
            a(2);
        }
        if (iVar == null) {
            a(3);
        }
        return e(f55318n, mVar, iVar) == null;
    }

    private static void i(q qVar) {
        f55321q.put(qVar.b(), qVar);
    }

    public static q j(z0 z0Var) {
        if (z0Var == null) {
            a(15);
        }
        q qVar = f55321q.get(z0Var);
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + z0Var);
    }
}