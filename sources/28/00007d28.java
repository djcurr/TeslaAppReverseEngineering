package k20;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class q0 {

    /* loaded from: classes5.dex */
    public static final class a extends x0 {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<w0> f34312c;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends w0> list) {
            this.f34312c = list;
        }

        @Override // k20.x0
        public y0 k(w0 key) {
            kotlin.jvm.internal.s.g(key, "key");
            if (this.f34312c.contains(key)) {
                w00.e n11 = key.n();
                Objects.requireNonNull(n11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return f1.t((w00.s0) n11);
            }
            return null;
        }
    }

    private static final d0 a(List<? extends w0> list, List<? extends d0> list2, t00.h hVar) {
        d0 p11 = d1.g(new a(list)).p((d0) wz.u.b0(list2), k1.OUT_VARIANCE);
        if (p11 == null) {
            p11 = hVar.y();
        }
        kotlin.jvm.internal.s.f(p11, "typeParameters: List<Typ… ?: builtIns.defaultBound");
        return p11;
    }

    public static final d0 b(w00.s0 s0Var) {
        int t11;
        int t12;
        kotlin.jvm.internal.s.g(s0Var, "<this>");
        w00.i b11 = s0Var.b();
        kotlin.jvm.internal.s.f(b11, "this.containingDeclaration");
        if (b11 instanceof w00.f) {
            List<w00.s0> parameters = ((w00.f) b11).i().getParameters();
            kotlin.jvm.internal.s.f(parameters, "descriptor.typeConstructor.parameters");
            t12 = wz.x.t(parameters, 10);
            ArrayList arrayList = new ArrayList(t12);
            for (w00.s0 s0Var2 : parameters) {
                w0 i11 = s0Var2.i();
                kotlin.jvm.internal.s.f(i11, "it.typeConstructor");
                arrayList.add(i11);
            }
            List<d0> upperBounds = s0Var.getUpperBounds();
            kotlin.jvm.internal.s.f(upperBounds, "upperBounds");
            return a(arrayList, upperBounds, a20.a.g(s0Var));
        } else if (b11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            List<w00.s0> typeParameters = ((kotlin.reflect.jvm.internal.impl.descriptors.e) b11).getTypeParameters();
            kotlin.jvm.internal.s.f(typeParameters, "descriptor.typeParameters");
            t11 = wz.x.t(typeParameters, 10);
            ArrayList arrayList2 = new ArrayList(t11);
            for (w00.s0 s0Var3 : typeParameters) {
                w0 i12 = s0Var3.i();
                kotlin.jvm.internal.s.f(i12, "it.typeConstructor");
                arrayList2.add(i12);
            }
            List<d0> upperBounds2 = s0Var.getUpperBounds();
            kotlin.jvm.internal.s.f(upperBounds2, "upperBounds");
            return a(arrayList2, upperBounds2, a20.a.g(s0Var));
        } else {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
    }
}