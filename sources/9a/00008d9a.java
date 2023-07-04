package o20;

import h00.l;
import java.util.ArrayList;
import java.util.List;
import k20.a0;
import k20.a1;
import k20.c1;
import k20.d0;
import k20.d1;
import k20.e0;
import k20.f1;
import k20.h1;
import k20.j1;
import k20.k0;
import k20.k1;
import k20.w0;
import k20.x0;
import k20.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import t00.h;
import vz.p;
import w00.s0;
import wz.x;
import x10.d;

/* loaded from: classes5.dex */
public final class b {

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42185a;

        static {
            int[] iArr = new int[k1.values().length];
            iArr[k1.INVARIANT.ordinal()] = 1;
            iArr[k1.IN_VARIANCE.ordinal()] = 2;
            iArr[k1.OUT_VARIANCE.ordinal()] = 3;
            f42185a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o20.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0833b extends u implements l<j1, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0833b f42186a = new C0833b();

        C0833b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(j1 it2) {
            s.f(it2, "it");
            return Boolean.valueOf(d.d(it2));
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends x0 {
        c() {
        }

        @Override // k20.x0
        public y0 k(w0 key) {
            s.g(key, "key");
            x10.b bVar = key instanceof x10.b ? (x10.b) key : null;
            if (bVar == null) {
                return null;
            }
            if (bVar.getProjection().a()) {
                return new a1(k1.OUT_VARIANCE, bVar.getProjection().getType());
            }
            return bVar.getProjection();
        }
    }

    public static final o20.a<d0> a(d0 type) {
        List<p> V0;
        Object e11;
        s.g(type, "type");
        if (a0.b(type)) {
            o20.a<d0> a11 = a(a0.c(type));
            o20.a<d0> a12 = a(a0.d(type));
            return new o20.a<>(h1.b(e0.d(a0.c(a11.c()), a0.d(a12.c())), type), h1.b(e0.d(a0.c(a11.d()), a0.d(a12.d())), type));
        }
        w0 H0 = type.H0();
        if (d.d(type)) {
            y0 projection = ((x10.b) H0).getProjection();
            d0 type2 = projection.getType();
            s.f(type2, "typeProjection.type");
            d0 b11 = b(type2, type);
            int i11 = a.f42185a[projection.b().ordinal()];
            if (i11 == 2) {
                k0 I = n20.a.h(type).I();
                s.f(I, "type.builtIns.nullableAnyType");
                return new o20.a<>(b11, I);
            } else if (i11 == 3) {
                k0 H = n20.a.h(type).H();
                s.f(H, "type.builtIns.nothingType");
                return new o20.a<>(b(H, type), b11);
            } else {
                throw new AssertionError(s.p("Only nontrivial projections should have been captured, not: ", projection));
            }
        } else if (!type.G0().isEmpty() && type.G0().size() == H0.getParameters().size()) {
            ArrayList<o20.c> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<y0> G0 = type.G0();
            List<s0> parameters = H0.getParameters();
            s.f(parameters, "typeConstructor.parameters");
            V0 = wz.e0.V0(G0, parameters);
            for (p pVar : V0) {
                y0 y0Var = (y0) pVar.a();
                s0 typeParameter = (s0) pVar.b();
                s.f(typeParameter, "typeParameter");
                o20.c g11 = g(y0Var, typeParameter);
                if (y0Var.a()) {
                    arrayList.add(g11);
                    arrayList2.add(g11);
                } else {
                    o20.a<o20.c> d11 = d(g11);
                    arrayList.add(d11.a());
                    arrayList2.add(d11.b());
                }
            }
            boolean z11 = true;
            if (!arrayList.isEmpty()) {
                for (o20.c cVar : arrayList) {
                    if (!cVar.d()) {
                        break;
                    }
                }
            }
            z11 = false;
            if (z11) {
                e11 = n20.a.h(type).H();
                s.f(e11, "type.builtIns.nothingType");
            } else {
                e11 = e(type, arrayList);
            }
            return new o20.a<>(e11, e(type, arrayList2));
        } else {
            return new o20.a<>(type, type);
        }
    }

    private static final d0 b(d0 d0Var, d0 d0Var2) {
        d0 r11 = f1.r(d0Var, d0Var2.I0());
        s.f(r11, "makeNullableIfNeeded(this, type.isMarkedNullable)");
        return r11;
    }

    public static final y0 c(y0 y0Var, boolean z11) {
        if (y0Var == null) {
            return null;
        }
        if (y0Var.a()) {
            return y0Var;
        }
        d0 type = y0Var.getType();
        s.f(type, "typeProjection.type");
        if (f1.c(type, C0833b.f42186a)) {
            k1 b11 = y0Var.b();
            s.f(b11, "typeProjection.projectionKind");
            if (b11 == k1.OUT_VARIANCE) {
                return new a1(b11, a(type).d());
            }
            if (z11) {
                return new a1(b11, a(type).c());
            }
            return f(y0Var);
        }
        return y0Var;
    }

    private static final o20.a<o20.c> d(o20.c cVar) {
        o20.a<d0> a11 = a(cVar.a());
        o20.a<d0> a12 = a(cVar.b());
        return new o20.a<>(new o20.c(cVar.c(), a11.b(), a12.a()), new o20.c(cVar.c(), a11.a(), a12.b()));
    }

    private static final d0 e(d0 d0Var, List<o20.c> list) {
        int t11;
        d0Var.G0().size();
        list.size();
        t11 = x.t(list, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (o20.c cVar : list) {
            arrayList.add(h(cVar));
        }
        return c1.e(d0Var, arrayList, null, null, 6, null);
    }

    private static final y0 f(y0 y0Var) {
        d1 g11 = d1.g(new c());
        s.f(g11, "create(object : TypeCons…ojection\n        }\n    })");
        return g11.t(y0Var);
    }

    private static final o20.c g(y0 y0Var, s0 s0Var) {
        int i11 = a.f42185a[d1.c(s0Var.k(), y0Var).ordinal()];
        if (i11 == 1) {
            d0 type = y0Var.getType();
            s.f(type, "type");
            d0 type2 = y0Var.getType();
            s.f(type2, "type");
            return new o20.c(s0Var, type, type2);
        } else if (i11 == 2) {
            d0 type3 = y0Var.getType();
            s.f(type3, "type");
            k0 I = a20.a.g(s0Var).I();
            s.f(I, "typeParameter.builtIns.nullableAnyType");
            return new o20.c(s0Var, type3, I);
        } else if (i11 == 3) {
            k0 H = a20.a.g(s0Var).H();
            s.f(H, "typeParameter.builtIns.nothingType");
            d0 type4 = y0Var.getType();
            s.f(type4, "type");
            return new o20.c(s0Var, H, type4);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private static final y0 h(o20.c cVar) {
        cVar.d();
        if (!s.c(cVar.a(), cVar.b())) {
            k1 k11 = cVar.c().k();
            k1 k1Var = k1.IN_VARIANCE;
            if (k11 != k1Var) {
                if (!h.l0(cVar.a()) || cVar.c().k() == k1Var) {
                    return h.n0(cVar.b()) ? new a1(i(cVar, k1Var), cVar.a()) : new a1(i(cVar, k1.OUT_VARIANCE), cVar.b());
                }
                return new a1(i(cVar, k1.OUT_VARIANCE), cVar.b());
            }
        }
        return new a1(cVar.a());
    }

    private static final k1 i(o20.c cVar, k1 k1Var) {
        return k1Var == cVar.c().k() ? k1.INVARIANT : k1Var;
    }
}