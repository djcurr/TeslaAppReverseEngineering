package k20;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k20.g;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a */
    public static final f f34253a = new f();

    /* renamed from: b */
    public static boolean f34254b;

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34255a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f34256b;

        static {
            int[] iArr = new int[m20.t.values().length];
            iArr[m20.t.INV.ordinal()] = 1;
            iArr[m20.t.OUT.ordinal()] = 2;
            iArr[m20.t.IN.ordinal()] = 3;
            f34255a = iArr;
            int[] iArr2 = new int[g.a.values().length];
            iArr2[g.a.CHECK_ONLY_LOWER.ordinal()] = 1;
            iArr2[g.a.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            iArr2[g.a.SKIP_LOWER.ordinal()] = 3;
            f34256b = iArr2;
        }
    }

    private f() {
    }

    private final Boolean a(g gVar, m20.j jVar, m20.j jVar2) {
        m20.o j11 = gVar.j();
        if (j11.v(jVar) || j11.v(jVar2)) {
            if (j11.v(jVar) && j11.v(jVar2)) {
                return Boolean.TRUE;
            }
            if (j11.v(jVar)) {
                if (c(j11, gVar, jVar, jVar2, false)) {
                    return Boolean.TRUE;
                }
            } else if (j11.v(jVar2) && (b(j11, jVar) || c(j11, gVar, jVar2, jVar, true))) {
                return Boolean.TRUE;
            }
            return null;
        }
        return null;
    }

    private static final boolean b(m20.o oVar, m20.j jVar) {
        boolean z11;
        boolean z12;
        m20.m d11 = oVar.d(jVar);
        if (d11 instanceof m20.h) {
            Collection<m20.i> P = oVar.P(d11);
            if (!(P instanceof Collection) || !P.isEmpty()) {
                for (m20.i iVar : P) {
                    m20.j a11 = oVar.a(iVar);
                    if (a11 != null && oVar.v(a11)) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (z11) {
                        z12 = true;
                        break;
                    }
                }
            }
            z12 = false;
            if (z12) {
                return true;
            }
        }
        return false;
    }

    private static final boolean c(m20.o oVar, g gVar, m20.j jVar, m20.j jVar2, boolean z11) {
        boolean z12;
        Collection<m20.i> q02 = oVar.q0(jVar);
        if (!(q02 instanceof Collection) || !q02.isEmpty()) {
            for (m20.i iVar : q02) {
                if (kotlin.jvm.internal.s.c(oVar.j(iVar), oVar.d(jVar2)) || (z11 && q(f34253a, gVar, jVar2, iVar, false, 8, null))) {
                    z12 = true;
                    continue;
                } else {
                    z12 = false;
                    continue;
                }
                if (z12) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x0128, code lost:
        if (r10 != false) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Boolean d(k20.g r15, m20.j r16, m20.j r17) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k20.f.d(k20.g, m20.j, m20.j):java.lang.Boolean");
    }

    private final List<m20.j> e(g gVar, m20.j jVar, m20.m mVar) {
        String l02;
        g.b r11;
        List<m20.j> i11;
        List<m20.j> d11;
        List<m20.j> i12;
        m20.o j11 = gVar.j();
        List<m20.j> D = j11.D(jVar, mVar);
        if (D == null) {
            if (!j11.s(mVar) && j11.N(jVar)) {
                i12 = wz.w.i();
                return i12;
            } else if (j11.e0(mVar)) {
                if (j11.u(j11.d(jVar), mVar)) {
                    m20.j w11 = j11.w(jVar, m20.b.FOR_SUBTYPING);
                    if (w11 != null) {
                        jVar = w11;
                    }
                    d11 = wz.v.d(jVar);
                    return d11;
                }
                i11 = wz.w.i();
                return i11;
            } else {
                D = new s20.e<>();
                gVar.k();
                ArrayDeque<m20.j> h11 = gVar.h();
                kotlin.jvm.internal.s.e(h11);
                Set<m20.j> i13 = gVar.i();
                kotlin.jvm.internal.s.e(i13);
                h11.push(jVar);
                while (!h11.isEmpty()) {
                    if (i13.size() <= 1000) {
                        m20.j current = h11.pop();
                        kotlin.jvm.internal.s.f(current, "current");
                        if (i13.add(current)) {
                            m20.j w12 = j11.w(current, m20.b.FOR_SUBTYPING);
                            if (w12 == null) {
                                w12 = current;
                            }
                            if (j11.u(j11.d(w12), mVar)) {
                                D.add(w12);
                                r11 = g.b.c.f34267a;
                            } else if (j11.Y(w12) == 0) {
                                r11 = g.b.C0636b.f34266a;
                            } else {
                                r11 = gVar.r(w12);
                            }
                            if (!(!kotlin.jvm.internal.s.c(r11, g.b.c.f34267a))) {
                                r11 = null;
                            }
                            if (r11 != null) {
                                m20.o j12 = gVar.j();
                                for (m20.i iVar : j12.P(j12.d(current))) {
                                    h11.add(r11.a(gVar, iVar));
                                }
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Too many supertypes for type: ");
                        sb2.append(jVar);
                        sb2.append(". Supertypes = ");
                        l02 = wz.e0.l0(i13, null, null, null, 0, null, null, 63, null);
                        sb2.append(l02);
                        throw new IllegalStateException(sb2.toString().toString());
                    }
                }
                gVar.e();
            }
        }
        return D;
    }

    private final List<m20.j> f(g gVar, m20.j jVar, m20.m mVar) {
        return t(gVar, e(gVar, jVar, mVar));
    }

    private final boolean g(g gVar, m20.i iVar, m20.i iVar2, boolean z11) {
        m20.o j11 = gVar.j();
        m20.i p11 = gVar.p(gVar.q(iVar));
        m20.i p12 = gVar.p(gVar.q(iVar2));
        f fVar = f34253a;
        Boolean d11 = fVar.d(gVar, j11.U(p11), j11.Q(p12));
        if (d11 == null) {
            Boolean c11 = gVar.c(p11, p12, z11);
            if (c11 == null) {
                return fVar.r(gVar, j11.U(p11), j11.Q(p12));
            }
            return c11.booleanValue();
        }
        boolean booleanValue = d11.booleanValue();
        gVar.c(p11, p12, z11);
        return booleanValue;
    }

    private final m20.n k(m20.o oVar, m20.i iVar, m20.i iVar2) {
        int Y = oVar.Y(iVar);
        if (Y > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                m20.l J = oVar.J(iVar, i11);
                boolean z11 = true;
                if (!(!oVar.p(J))) {
                    J = null;
                }
                m20.i b02 = J == null ? null : oVar.b0(J);
                if (b02 != null) {
                    if (!oVar.a0(oVar.U(b02)) || !oVar.a0(oVar.U(iVar2))) {
                        z11 = false;
                    }
                    if (kotlin.jvm.internal.s.c(b02, iVar2) || (z11 && kotlin.jvm.internal.s.c(oVar.j(b02), oVar.j(iVar2)))) {
                        break;
                    }
                    m20.n k11 = k(oVar, b02, iVar2);
                    if (k11 != null) {
                        return k11;
                    }
                }
                if (i12 >= Y) {
                    break;
                }
                i11 = i12;
            }
            return oVar.v0(oVar.j(iVar), i11);
        }
        return null;
    }

    private final boolean l(g gVar, m20.j jVar) {
        String l02;
        g.b bVar;
        m20.o j11 = gVar.j();
        m20.m d11 = j11.d(jVar);
        if (j11.s(d11)) {
            return j11.E(d11);
        }
        if (j11.E(j11.d(jVar))) {
            return true;
        }
        gVar.k();
        ArrayDeque<m20.j> h11 = gVar.h();
        kotlin.jvm.internal.s.e(h11);
        Set<m20.j> i11 = gVar.i();
        kotlin.jvm.internal.s.e(i11);
        h11.push(jVar);
        while (!h11.isEmpty()) {
            if (i11.size() <= 1000) {
                m20.j current = h11.pop();
                kotlin.jvm.internal.s.f(current, "current");
                if (i11.add(current)) {
                    if (j11.N(current)) {
                        bVar = g.b.c.f34267a;
                    } else {
                        bVar = g.b.C0636b.f34266a;
                    }
                    if (!(!kotlin.jvm.internal.s.c(bVar, g.b.c.f34267a))) {
                        bVar = null;
                    }
                    if (bVar == null) {
                        continue;
                    } else {
                        m20.o j12 = gVar.j();
                        for (m20.i iVar : j12.P(j12.d(current))) {
                            m20.j a11 = bVar.a(gVar, iVar);
                            if (j11.E(j11.d(a11))) {
                                gVar.e();
                                return true;
                            }
                            h11.add(a11);
                        }
                        continue;
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Too many supertypes for type: ");
                sb2.append(jVar);
                sb2.append(". Supertypes = ");
                l02 = wz.e0.l0(i11, null, null, null, 0, null, null, 63, null);
                sb2.append(l02);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        gVar.e();
        return false;
    }

    private final boolean m(m20.o oVar, m20.i iVar) {
        return oVar.L(oVar.j(iVar)) && !oVar.m(iVar) && !oVar.A(iVar) && kotlin.jvm.internal.s.c(oVar.d(oVar.U(iVar)), oVar.d(oVar.Q(iVar)));
    }

    private final boolean n(m20.o oVar, m20.j jVar, m20.j jVar2) {
        m20.j jVar3;
        m20.j jVar4;
        m20.e T = oVar.T(jVar);
        if (T == null || (jVar3 = oVar.q(T)) == null) {
            jVar3 = jVar;
        }
        m20.e T2 = oVar.T(jVar2);
        if (T2 == null || (jVar4 = oVar.q(T2)) == null) {
            jVar4 = jVar2;
        }
        if (oVar.d(jVar3) != oVar.d(jVar4)) {
            return false;
        }
        if (oVar.A(jVar) || !oVar.A(jVar2)) {
            return !oVar.i0(jVar) || oVar.i0(jVar2);
        }
        return false;
    }

    public static /* synthetic */ boolean q(f fVar, g gVar, m20.i iVar, m20.i iVar2, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return fVar.p(gVar, iVar, iVar2, z11);
    }

    private final boolean r(g gVar, m20.j jVar, m20.j jVar2) {
        int t11;
        boolean z11;
        int t12;
        m20.m mVar;
        m20.m mVar2;
        m20.o j11 = gVar.j();
        if (f34254b) {
            if (!j11.e(jVar) && !j11.F(j11.d(jVar))) {
                gVar.m(jVar);
            }
            if (!j11.e(jVar2)) {
                gVar.m(jVar2);
            }
        }
        boolean z12 = false;
        if (c.f34224a.d(gVar, jVar, jVar2)) {
            f fVar = f34253a;
            Boolean a11 = fVar.a(gVar, j11.U(jVar), j11.Q(jVar2));
            if (a11 == null) {
                m20.m d11 = j11.d(jVar2);
                boolean z13 = true;
                if ((j11.u(j11.d(jVar), d11) && j11.B(d11) == 0) || j11.f0(j11.d(jVar2))) {
                    return true;
                }
                List<m20.j> j12 = fVar.j(gVar, jVar, d11);
                int i11 = 10;
                t11 = wz.x.t(j12, 10);
                ArrayList<m20.j> arrayList = new ArrayList(t11);
                for (m20.j jVar3 : j12) {
                    m20.j a12 = j11.a(gVar.p(jVar3));
                    if (a12 != null) {
                        jVar3 = a12;
                    }
                    arrayList.add(jVar3);
                }
                int size = arrayList.size();
                if (size != 0) {
                    if (size != 1) {
                        m20.a aVar = new m20.a(j11.B(d11));
                        int B = j11.B(d11);
                        if (B > 0) {
                            int i12 = 0;
                            z11 = false;
                            while (true) {
                                int i13 = i12 + 1;
                                z11 = (z11 || j11.h(j11.v0(d11, i12)) != m20.t.OUT) ? z13 : z12;
                                if (z11) {
                                    mVar = d11;
                                } else {
                                    t12 = wz.x.t(arrayList, i11);
                                    List<? extends m20.i> arrayList2 = new ArrayList<>(t12);
                                    for (m20.j jVar4 : arrayList) {
                                        m20.l H = j11.H(jVar4, i12);
                                        m20.i iVar = null;
                                        if (H == null) {
                                            mVar2 = d11;
                                        } else {
                                            mVar2 = d11;
                                            if (!(j11.r(H) == m20.t.INV)) {
                                                H = null;
                                            }
                                            if (H != null) {
                                                iVar = j11.b0(H);
                                            }
                                        }
                                        m20.i iVar2 = iVar;
                                        if (iVar2 == null) {
                                            throw new IllegalStateException(("Incorrect type: " + jVar4 + ", subType: " + jVar + ", superType: " + jVar2).toString());
                                        }
                                        arrayList2.add(iVar2);
                                        d11 = mVar2;
                                    }
                                    mVar = d11;
                                    aVar.add(j11.z(j11.h0(arrayList2)));
                                }
                                if (i13 >= B) {
                                    break;
                                }
                                i12 = i13;
                                d11 = mVar;
                                z12 = false;
                                z13 = true;
                                i11 = 10;
                            }
                        } else {
                            z11 = false;
                        }
                        if (z11 || !f34253a.o(gVar, aVar, jVar2)) {
                            if (!arrayList.isEmpty()) {
                                for (m20.j jVar5 : arrayList) {
                                    if (f34253a.o(gVar, j11.g0(jVar5), jVar2)) {
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        return true;
                    }
                    return f34253a.o(gVar, j11.g0((m20.j) wz.u.b0(arrayList)), jVar2);
                }
                return f34253a.l(gVar, jVar);
            }
            boolean booleanValue = a11.booleanValue();
            g.d(gVar, jVar, jVar2, false, 4, null);
            return booleanValue;
        }
        return false;
    }

    private final boolean s(m20.o oVar, m20.i iVar, m20.i iVar2, m20.m mVar) {
        m20.n I;
        m20.j a11 = oVar.a(iVar);
        if (a11 instanceof m20.d) {
            m20.d dVar = (m20.d) a11;
            if (!oVar.d0(dVar) && oVar.p(oVar.n(oVar.m0(dVar))) && oVar.n0(dVar) == m20.b.FOR_SUBTYPING) {
                m20.m j11 = oVar.j(iVar2);
                m20.s sVar = j11 instanceof m20.s ? (m20.s) j11 : null;
                return (sVar == null || (I = oVar.I(sVar)) == null || !oVar.o(I, mVar)) ? false : true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<m20.j> t(g gVar, List<? extends m20.j> list) {
        m20.o j11 = gVar.j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            boolean z11 = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            m20.k g02 = j11.g0((m20.j) next);
            int K = j11.K(g02);
            int i11 = 0;
            while (true) {
                if (i11 >= K) {
                    break;
                }
                if (!(j11.l0(j11.b0(j11.S(g02, i11))) == null)) {
                    z11 = false;
                    break;
                }
                i11++;
            }
            if (z11) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : list;
    }

    public final m20.t h(m20.t declared, m20.t useSite) {
        kotlin.jvm.internal.s.g(declared, "declared");
        kotlin.jvm.internal.s.g(useSite, "useSite");
        m20.t tVar = m20.t.INV;
        if (declared == tVar) {
            return useSite;
        }
        if (useSite == tVar || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean i(g context, m20.i a11, m20.i b11) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(a11, "a");
        kotlin.jvm.internal.s.g(b11, "b");
        m20.o j11 = context.j();
        if (a11 == b11) {
            return true;
        }
        f fVar = f34253a;
        if (fVar.m(j11, a11) && fVar.m(j11, b11)) {
            m20.i p11 = context.p(context.q(a11));
            m20.i p12 = context.p(context.q(b11));
            m20.j U = j11.U(p11);
            if (!j11.u(j11.j(p11), j11.j(p12))) {
                return false;
            }
            if (j11.Y(U) == 0) {
                return j11.t(p11) || j11.t(p12) || j11.i0(U) == j11.i0(j11.U(p12));
            }
        }
        return q(fVar, context, a11, b11, false, 8, null) && q(fVar, context, b11, a11, false, 8, null);
    }

    public final List<m20.j> j(g context, m20.j subType, m20.m superConstructor) {
        String l02;
        g.b bVar;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(subType, "subType");
        kotlin.jvm.internal.s.g(superConstructor, "superConstructor");
        m20.o j11 = context.j();
        if (j11.N(subType)) {
            return f34253a.f(context, subType, superConstructor);
        }
        if (!j11.s(superConstructor) && !j11.p0(superConstructor)) {
            return f34253a.e(context, subType, superConstructor);
        }
        s20.e<m20.j> eVar = new s20.e();
        context.k();
        ArrayDeque<m20.j> h11 = context.h();
        kotlin.jvm.internal.s.e(h11);
        Set<m20.j> i11 = context.i();
        kotlin.jvm.internal.s.e(i11);
        h11.push(subType);
        while (!h11.isEmpty()) {
            if (i11.size() <= 1000) {
                m20.j current = h11.pop();
                kotlin.jvm.internal.s.f(current, "current");
                if (i11.add(current)) {
                    if (j11.N(current)) {
                        eVar.add(current);
                        bVar = g.b.c.f34267a;
                    } else {
                        bVar = g.b.C0636b.f34266a;
                    }
                    if (!(!kotlin.jvm.internal.s.c(bVar, g.b.c.f34267a))) {
                        bVar = null;
                    }
                    if (bVar != null) {
                        m20.o j12 = context.j();
                        for (m20.i iVar : j12.P(j12.d(current))) {
                            h11.add(bVar.a(context, iVar));
                        }
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Too many supertypes for type: ");
                sb2.append(subType);
                sb2.append(". Supertypes = ");
                l02 = wz.e0.l0(i11, null, null, null, 0, null, null, 63, null);
                sb2.append(l02);
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        context.e();
        ArrayList arrayList = new ArrayList();
        for (m20.j it2 : eVar) {
            f fVar = f34253a;
            kotlin.jvm.internal.s.f(it2, "it");
            wz.b0.z(arrayList, fVar.f(context, it2, superConstructor));
        }
        return arrayList;
    }

    public final boolean o(g gVar, m20.k capturedSubArguments, m20.j superType) {
        int i11;
        int i12;
        boolean i13;
        int i14;
        kotlin.jvm.internal.s.g(gVar, "<this>");
        kotlin.jvm.internal.s.g(capturedSubArguments, "capturedSubArguments");
        kotlin.jvm.internal.s.g(superType, "superType");
        m20.o j11 = gVar.j();
        m20.m d11 = j11.d(superType);
        int K = j11.K(capturedSubArguments);
        int B = j11.B(d11);
        if (K == B && K == j11.Y(superType)) {
            if (B > 0) {
                int i15 = 0;
                while (true) {
                    int i16 = i15 + 1;
                    m20.l J = j11.J(superType, i15);
                    if (!j11.p(J)) {
                        m20.i b02 = j11.b0(J);
                        m20.l S = j11.S(capturedSubArguments, i15);
                        j11.r(S);
                        m20.t tVar = m20.t.INV;
                        m20.i b03 = j11.b0(S);
                        f fVar = f34253a;
                        m20.t h11 = fVar.h(j11.h(j11.v0(d11, i15)), j11.r(J));
                        if (h11 == null) {
                            return gVar.n();
                        }
                        if (!(h11 == tVar && (fVar.s(j11, b03, b02, d11) || fVar.s(j11, b02, b03, d11)))) {
                            i11 = gVar.f34262a;
                            if (i11 <= 100) {
                                i12 = gVar.f34262a;
                                gVar.f34262a = i12 + 1;
                                int i17 = a.f34255a[h11.ordinal()];
                                if (i17 == 1) {
                                    i13 = fVar.i(gVar, b03, b02);
                                } else if (i17 == 2) {
                                    i13 = q(fVar, gVar, b03, b02, false, 8, null);
                                } else if (i17 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    i13 = q(fVar, gVar, b02, b03, false, 8, null);
                                }
                                i14 = gVar.f34262a;
                                gVar.f34262a = i14 - 1;
                                if (!i13) {
                                    return false;
                                }
                            } else {
                                throw new IllegalStateException(kotlin.jvm.internal.s.p("Arguments depth is too high. Some related argument: ", b03).toString());
                            }
                        }
                    }
                    if (i16 >= B) {
                        break;
                    }
                    i15 = i16;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean p(g context, m20.i subType, m20.i superType, boolean z11) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(subType, "subType");
        kotlin.jvm.internal.s.g(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (context.f(subType, superType)) {
            return g(context, subType, superType, z11);
        }
        return false;
    }
}