package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k20.c0;
import k20.d0;
import k20.e0;
import k20.f1;
import k20.h1;
import k20.j1;
import k20.k0;
import k20.k1;
import k20.w0;
import k20.y0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m0;

/* loaded from: classes5.dex */
public abstract class g {

    /* loaded from: classes5.dex */
    public static final class a extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35150a = new a();

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b extends kotlin.jvm.internal.o implements h00.l<m20.i, j1> {
        b(Object obj) {
            super(1, obj);
        }

        @Override // h00.l
        /* renamed from: d */
        public final j1 invoke(m20.i p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return ((g) this.receiver).a(p02);
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "prepareType";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return m0.b(g.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;";
        }
    }

    private final k0 b(k0 k0Var) {
        int t11;
        int t12;
        List i11;
        d0 type;
        int t13;
        w0 H0 = k0Var.H0();
        boolean z11 = false;
        c0 c0Var = null;
        r5 = null;
        j1 K0 = null;
        if (H0 instanceof x10.c) {
            x10.c cVar = (x10.c) H0;
            y0 projection = cVar.getProjection();
            if (!(projection.b() == k1.IN_VARIANCE)) {
                projection = null;
            }
            if (projection != null && (type = projection.getType()) != null) {
                K0 = type.K0();
            }
            j1 j1Var = K0;
            if (cVar.c() == null) {
                y0 projection2 = cVar.getProjection();
                Collection<d0> a11 = cVar.a();
                t13 = wz.x.t(a11, 10);
                ArrayList arrayList = new ArrayList(t13);
                for (d0 d0Var : a11) {
                    arrayList.add(d0Var.K0());
                }
                cVar.e(new k(projection2, arrayList, null, 4, null));
            }
            m20.b bVar = m20.b.FOR_SUBTYPING;
            k c11 = cVar.c();
            kotlin.jvm.internal.s.e(c11);
            return new j(bVar, c11, j1Var, k0Var.getAnnotations(), k0Var.I0(), false, 32, null);
        } else if (H0 instanceof y10.p) {
            Collection<d0> a12 = ((y10.p) H0).a();
            t12 = wz.x.t(a12, 10);
            ArrayList arrayList2 = new ArrayList(t12);
            for (d0 d0Var2 : a12) {
                d0 q11 = f1.q(d0Var2, k0Var.I0());
                kotlin.jvm.internal.s.f(q11, "makeNullableAsSpecified(it, type.isMarkedNullable)");
                arrayList2.add(q11);
            }
            c0 c0Var2 = new c0(arrayList2);
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = k0Var.getAnnotations();
            i11 = wz.w.i();
            return e0.j(annotations, c0Var2, i11, false, k0Var.m());
        } else if ((H0 instanceof c0) && k0Var.I0()) {
            c0 c0Var3 = (c0) H0;
            Collection<d0> a13 = c0Var3.a();
            t11 = wz.x.t(a13, 10);
            ArrayList arrayList3 = new ArrayList(t11);
            for (d0 d0Var3 : a13) {
                arrayList3.add(n20.a.q(d0Var3));
                z11 = true;
            }
            if (z11) {
                d0 d11 = c0Var3.d();
                c0Var = new c0(arrayList3).h(d11 != null ? n20.a.q(d11) : null);
            }
            if (c0Var != null) {
                c0Var3 = c0Var;
            }
            return c0Var3.c();
        } else {
            return k0Var;
        }
    }

    public j1 a(m20.i type) {
        j1 d11;
        kotlin.jvm.internal.s.g(type, "type");
        if (type instanceof d0) {
            j1 K0 = ((d0) type).K0();
            if (K0 instanceof k0) {
                d11 = b((k0) K0);
            } else if (K0 instanceof k20.x) {
                k20.x xVar = (k20.x) K0;
                k0 b11 = b(xVar.P0());
                k0 b12 = b(xVar.Q0());
                d11 = (b11 == xVar.P0() && b12 == xVar.Q0()) ? K0 : e0.d(b11, b12);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return h1.c(d11, K0, new b(this));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}