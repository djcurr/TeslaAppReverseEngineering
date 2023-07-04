package e10;

import e10.g0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n10.j;
import w00.v0;
import w10.e;

/* loaded from: classes5.dex */
public final class s implements w10.e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24486a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            if (eVar.h().size() != 1) {
                return false;
            }
            w00.i mo223b = eVar.mo223b();
            w00.c cVar = mo223b instanceof w00.c ? (w00.c) mo223b : null;
            if (cVar == null) {
                return false;
            }
            List<v0> h11 = eVar.h();
            kotlin.jvm.internal.s.f(h11, "f.valueParameters");
            w00.e n11 = ((v0) wz.u.C0(h11)).getType().H0().n();
            w00.c cVar2 = n11 instanceof w00.c ? (w00.c) n11 : null;
            if (cVar2 == null) {
                return false;
            }
            return t00.h.p0(cVar) && kotlin.jvm.internal.s.c(a20.a.i(cVar), a20.a.i(cVar2));
        }

        private final n10.j c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, v0 v0Var) {
            if (!n10.t.e(eVar) && !b(eVar)) {
                k20.d0 type = v0Var.getType();
                kotlin.jvm.internal.s.f(type, "valueParameterDescriptor.type");
                return n10.t.g(type);
            }
            k20.d0 type2 = v0Var.getType();
            kotlin.jvm.internal.s.f(type2, "valueParameterDescriptor.type");
            return n10.t.g(n20.a.q(type2));
        }

        public final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.a superDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a subDescriptor) {
            List<vz.p> V0;
            kotlin.jvm.internal.s.g(superDescriptor, "superDescriptor");
            kotlin.jvm.internal.s.g(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof g10.e) && (superDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                g10.e eVar = (g10.e) subDescriptor;
                eVar.h().size();
                kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = (kotlin.reflect.jvm.internal.impl.descriptors.e) superDescriptor;
                eVar2.h().size();
                List<v0> h11 = eVar.d0().h();
                kotlin.jvm.internal.s.f(h11, "subDescriptor.original.valueParameters");
                List<v0> h12 = eVar2.a().h();
                kotlin.jvm.internal.s.f(h12, "superDescriptor.original.valueParameters");
                V0 = wz.e0.V0(h11, h12);
                for (vz.p pVar : V0) {
                    v0 subParameter = (v0) pVar.a();
                    v0 superParameter = (v0) pVar.b();
                    kotlin.jvm.internal.s.f(subParameter, "subParameter");
                    boolean z11 = c((kotlin.reflect.jvm.internal.impl.descriptors.e) subDescriptor, subParameter) instanceof j.d;
                    kotlin.jvm.internal.s.f(superParameter, "superParameter");
                    if (z11 != (c(eVar2, superParameter) instanceof j.d)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, w00.c cVar) {
        if ((aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) && (aVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && !t00.h.e0(aVar2)) {
            f fVar = f.f24442m;
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) aVar2;
            u10.f name = eVar.getName();
            kotlin.jvm.internal.s.f(name, "subDescriptor.name");
            if (!fVar.l(name)) {
                g0.a aVar3 = g0.f24453a;
                u10.f name2 = eVar.getName();
                kotlin.jvm.internal.s.f(name2, "subDescriptor.name");
                if (!aVar3.k(name2)) {
                    return false;
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.b e11 = f0.e((kotlin.reflect.jvm.internal.impl.descriptors.b) aVar);
            boolean x02 = eVar.x0();
            boolean z11 = aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e;
            kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = z11 ? (kotlin.reflect.jvm.internal.impl.descriptors.e) aVar : null;
            if ((!(eVar2 != null && x02 == eVar2.x0())) && (e11 == null || !eVar.x0())) {
                return true;
            }
            if ((cVar instanceof g10.c) && eVar.n0() == null && e11 != null && !f0.f(cVar, e11)) {
                if ((e11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) && z11 && f.k((kotlin.reflect.jvm.internal.impl.descriptors.e) e11) != null) {
                    String c11 = n10.t.c(eVar, false, false, 2, null);
                    kotlin.reflect.jvm.internal.impl.descriptors.e a11 = ((kotlin.reflect.jvm.internal.impl.descriptors.e) aVar).a();
                    kotlin.jvm.internal.s.f(a11, "superDescriptor.original");
                    if (kotlin.jvm.internal.s.c(c11, n10.t.c(a11, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // w10.e
    public e.b a(kotlin.reflect.jvm.internal.impl.descriptors.a superDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a subDescriptor, w00.c cVar) {
        kotlin.jvm.internal.s.g(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.s.g(subDescriptor, "subDescriptor");
        if (c(superDescriptor, subDescriptor, cVar)) {
            return e.b.INCOMPATIBLE;
        }
        if (f24486a.a(superDescriptor, subDescriptor)) {
            return e.b.INCOMPATIBLE;
        }
        return e.b.UNKNOWN;
    }

    @Override // w10.e
    public e.a b() {
        return e.a.CONFLICTS_ONLY;
    }
}