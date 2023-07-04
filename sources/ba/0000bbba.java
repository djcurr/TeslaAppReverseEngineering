package w00;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class t0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<i, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55327a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(i it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(it2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<i, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f55328a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(i it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(!(it2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<i, u20.h<? extends s0>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f55329a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final u20.h<s0> mo12invoke(i it2) {
            u20.h<s0> S;
            kotlin.jvm.internal.s.g(it2, "it");
            List<s0> typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.a) it2).getTypeParameters();
            kotlin.jvm.internal.s.f(typeParameters, "it as CallableDescriptor).typeParameters");
            S = wz.e0.S(typeParameters);
            return S;
        }
    }

    public static final h0 a(k20.d0 d0Var) {
        kotlin.jvm.internal.s.g(d0Var, "<this>");
        e n11 = d0Var.H0().n();
        return b(d0Var, n11 instanceof f ? (f) n11 : null, 0);
    }

    private static final h0 b(k20.d0 d0Var, f fVar, int i11) {
        if (fVar == null || k20.v.r(fVar)) {
            return null;
        }
        int size = fVar.o().size() + i11;
        if (!fVar.j()) {
            if (size != d0Var.G0().size()) {
                w10.d.E(fVar);
            }
            return new h0(fVar, d0Var.G0().subList(i11, d0Var.G0().size()), null);
        }
        List<k20.y0> subList = d0Var.G0().subList(i11, size);
        i mo223b = fVar.mo223b();
        return new h0(fVar, subList, b(d0Var, mo223b instanceof f ? (f) mo223b : null, size));
    }

    private static final w00.a c(s0 s0Var, i iVar, int i11) {
        return new w00.a(s0Var, iVar, i11);
    }

    public static final List<s0> d(f fVar) {
        u20.h G;
        u20.h q11;
        u20.h v11;
        List I;
        List<s0> list;
        i iVar;
        List<s0> y02;
        int t11;
        List<s0> y03;
        k20.w0 mo234i;
        kotlin.jvm.internal.s.g(fVar, "<this>");
        List<s0> declaredTypeParameters = fVar.o();
        kotlin.jvm.internal.s.f(declaredTypeParameters, "declaredTypeParameters");
        if (fVar.j() || (fVar.mo223b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            G = u20.p.G(a20.a.m(fVar), a.f55327a);
            q11 = u20.p.q(G, b.f55328a);
            v11 = u20.p.v(q11, c.f55329a);
            I = u20.p.I(v11);
            Iterator<i> it2 = a20.a.m(fVar).iterator();
            while (true) {
                list = null;
                if (!it2.hasNext()) {
                    iVar = null;
                    break;
                }
                iVar = it2.next();
                if (iVar instanceof w00.c) {
                    break;
                }
            }
            w00.c cVar = (w00.c) iVar;
            if (cVar != null && (mo234i = cVar.mo234i()) != null) {
                list = mo234i.getParameters();
            }
            if (list == null) {
                list = wz.w.i();
            }
            if (I.isEmpty() && list.isEmpty()) {
                List<s0> declaredTypeParameters2 = fVar.o();
                kotlin.jvm.internal.s.f(declaredTypeParameters2, "declaredTypeParameters");
                return declaredTypeParameters2;
            }
            y02 = wz.e0.y0(I, list);
            t11 = wz.x.t(y02, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (s0 it3 : y02) {
                kotlin.jvm.internal.s.f(it3, "it");
                arrayList.add(c(it3, fVar, declaredTypeParameters.size()));
            }
            y03 = wz.e0.y0(declaredTypeParameters, arrayList);
            return y03;
        }
        return declaredTypeParameters;
    }
}