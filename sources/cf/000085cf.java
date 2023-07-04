package m10;

import java.util.ArrayList;
import java.util.List;
import k20.a0;
import k20.d0;
import k20.e0;
import k20.f0;
import k20.f1;
import k20.h1;
import k20.j0;
import k20.j1;
import k20.k0;
import k20.k1;
import k20.n0;
import k20.w0;
import k20.y0;
import kotlin.NoWhenBranchMatchedException;
import wz.w;
import wz.x;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final h10.d f38266a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final d0 f38267a;

        /* renamed from: b  reason: collision with root package name */
        private final int f38268b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f38269c;

        public a(d0 type, int i11, boolean z11) {
            kotlin.jvm.internal.s.g(type, "type");
            this.f38267a = type;
            this.f38268b = i11;
            this.f38269c = z11;
        }

        public final int a() {
            return this.f38268b;
        }

        public d0 b() {
            return this.f38267a;
        }

        public final d0 c() {
            d0 b11 = b();
            if (d()) {
                return b11;
            }
            return null;
        }

        public final boolean d() {
            return this.f38269c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b extends a {

        /* renamed from: d  reason: collision with root package name */
        private final k0 f38270d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k0 type, int i11, boolean z11) {
            super(type, i11, z11);
            kotlin.jvm.internal.s.g(type, "type");
            this.f38270d = type;
        }

        @Override // m10.d.a
        /* renamed from: e */
        public k0 b() {
            return this.f38270d;
        }
    }

    public d(h10.d javaResolverSettings) {
        kotlin.jvm.internal.s.g(javaResolverSettings, "javaResolverSettings");
        this.f38266a = javaResolverSettings;
    }

    private final d0 a(d0 d0Var, d0 d0Var2) {
        d0 a11 = h1.a(d0Var2);
        d0 a12 = h1.a(d0Var);
        if (a12 == null) {
            if (a11 == null) {
                return null;
            }
            a12 = a11;
        }
        return a11 == null ? a12 : e0.d(a0.c(a12), a0.d(a11));
    }

    private final b c(k0 k0Var, h00.l<? super Integer, e> lVar, int i11, p pVar, boolean z11, boolean z12) {
        c e11;
        int t11;
        boolean z13;
        ArrayList arrayList;
        y0 e12;
        c h11;
        List n11;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d11;
        h00.l<? super Integer, e> lVar2 = lVar;
        if (q.a(pVar) || !k0Var.G0().isEmpty()) {
            w00.e n12 = k0Var.H0().n();
            if (n12 == null) {
                return new b(k0Var, 1, false);
            }
            e mo12invoke = lVar2.mo12invoke(Integer.valueOf(i11));
            e11 = t.e(n12, mo12invoke, pVar);
            w00.e eVar = (w00.e) e11.a();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b11 = e11.b();
            w0 mo234i = eVar.mo234i();
            kotlin.jvm.internal.s.f(mo234i, "enhancedClassifier.typeConstructor");
            int i12 = i11 + 1;
            boolean z14 = b11 != null;
            if (z12 && z11) {
                i12 += k0Var.G0().size();
                boolean z15 = z14;
                arrayList = k0Var.G0();
                z13 = z15;
            } else {
                List<y0> G0 = k0Var.G0();
                t11 = x.t(G0, 10);
                ArrayList arrayList2 = new ArrayList(t11);
                int i13 = 0;
                for (Object obj : G0) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        w.s();
                    }
                    y0 y0Var = (y0) obj;
                    if (y0Var.a()) {
                        int i15 = i12 + 1;
                        if (lVar2.mo12invoke(Integer.valueOf(i12)).c() == h.NOT_NULL && !z11) {
                            d0 p11 = n20.a.p(y0Var.getType().K0());
                            k1 b12 = y0Var.b();
                            kotlin.jvm.internal.s.f(b12, "arg.projectionKind");
                            e12 = n20.a.e(p11, b12, mo234i.getParameters().get(i13));
                        } else {
                            e12 = f1.t(eVar.mo234i().getParameters().get(i13));
                            kotlin.jvm.internal.s.f(e12, "{\n                      …x])\n                    }");
                        }
                        i12 = i15;
                    } else {
                        a e13 = e(y0Var.getType().K0(), lVar2, i12, z12);
                        z14 = z14 || e13.d();
                        i12 += e13.a();
                        d0 b13 = e13.b();
                        k1 b14 = y0Var.b();
                        kotlin.jvm.internal.s.f(b14, "arg.projectionKind");
                        e12 = n20.a.e(b13, b14, mo234i.getParameters().get(i13));
                    }
                    arrayList2.add(e12);
                    lVar2 = lVar;
                    i13 = i14;
                }
                z13 = z14;
                arrayList = arrayList2;
            }
            h11 = t.h(k0Var, mo12invoke, pVar);
            boolean booleanValue = ((Boolean) h11.a()).booleanValue();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b15 = h11.b();
            int i16 = i12 - i11;
            if (!(z13 || b15 != null)) {
                return new b(k0Var, i16, false);
            }
            boolean z16 = false;
            n11 = w.n(k0Var.mo140getAnnotations(), b11, b15);
            d11 = t.d(n11);
            k0 i17 = e0.i(d11, mo234i, arrayList, booleanValue, null, 16, null);
            j1 j1Var = i17;
            if (mo12invoke.d()) {
                j1Var = f(i17);
            }
            if (b15 != null && mo12invoke.e()) {
                z16 = true;
            }
            if (z16) {
                j1Var = h1.e(k0Var, j1Var);
            }
            return new b((k0) j1Var, i16, true);
        }
        return new b(k0Var, 1, false);
    }

    static /* synthetic */ b d(d dVar, k0 k0Var, h00.l lVar, int i11, p pVar, boolean z11, boolean z12, int i12, Object obj) {
        return dVar.c(k0Var, lVar, i11, pVar, (i12 & 8) != 0 ? false : z11, (i12 & 16) != 0 ? false : z12);
    }

    private final a e(j1 j1Var, h00.l<? super Integer, e> lVar, int i11, boolean z11) {
        j1 j1Var2 = j1Var;
        boolean z12 = false;
        if (f0.a(j1Var)) {
            return new a(j1Var2, 1, false);
        }
        if (j1Var2 instanceof k20.x) {
            boolean z13 = j1Var2 instanceof j0;
            k20.x xVar = (k20.x) j1Var2;
            b c11 = c(xVar.P0(), lVar, i11, p.FLEXIBLE_LOWER, z13, z11);
            b c12 = c(xVar.Q0(), lVar, i11, p.FLEXIBLE_UPPER, z13, z11);
            c11.a();
            c12.a();
            if (c11.d() || c12.d()) {
                z12 = true;
            }
            d0 a11 = a(c11.b(), c12.b());
            if (z12) {
                j1Var2 = h1.e(j1Var2 instanceof j10.f ? new j10.f(c11.b(), c12.b()) : e0.d(c11.b(), c12.b()), a11);
            }
            return new a(j1Var2, c11.a(), z12);
        } else if (j1Var2 instanceof k0) {
            return d(this, (k0) j1Var2, lVar, i11, p.INFLEXIBLE, false, z11, 8, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final k0 f(k0 k0Var) {
        if (this.f38266a.a()) {
            return n0.h(k0Var, true);
        }
        return new g(k0Var);
    }

    public final d0 b(d0 d0Var, h00.l<? super Integer, e> qualifiers, boolean z11) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        kotlin.jvm.internal.s.g(qualifiers, "qualifiers");
        return e(d0Var.K0(), qualifiers, 0, z11).c();
    }
}