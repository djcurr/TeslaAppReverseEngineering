package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import k20.d0;
import k20.f1;
import k20.k1;
import k20.w0;
import k20.x0;
import k20.y0;

/* loaded from: classes5.dex */
public final class y {
    private static final d0 a(d0 d0Var) {
        return o20.b.a(d0Var).d();
    }

    private static final String b(w0 w0Var) {
        StringBuilder sb2 = new StringBuilder();
        c(kotlin.jvm.internal.s.p("type: ", w0Var), sb2);
        c(kotlin.jvm.internal.s.p("hashCode: ", Integer.valueOf(w0Var.hashCode())), sb2);
        c(kotlin.jvm.internal.s.p("javaClass: ", w0Var.getClass().getCanonicalName()), sb2);
        for (w00.i n11 = w0Var.n(); n11 != null; n11 = n11.b()) {
            c(kotlin.jvm.internal.s.p("fqName: ", kotlin.reflect.jvm.internal.impl.renderer.c.f35080b.q(n11)), sb2);
            c(kotlin.jvm.internal.s.p("javaClass: ", n11.getClass().getCanonicalName()), sb2);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    private static final StringBuilder c(String str, StringBuilder sb2) {
        kotlin.jvm.internal.s.g(str, "<this>");
        sb2.append(str);
        kotlin.jvm.internal.s.f(sb2, "append(value)");
        sb2.append('\n');
        kotlin.jvm.internal.s.f(sb2, "append('\\n')");
        return sb2;
    }

    public static final d0 d(d0 subtype, d0 supertype, w typeCheckingProcedureCallbacks) {
        w0 H0;
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.s.g(subtype, "subtype");
        kotlin.jvm.internal.s.g(supertype, "supertype");
        kotlin.jvm.internal.s.g(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new t(subtype, null));
        w0 H02 = supertype.H0();
        while (!arrayDeque.isEmpty()) {
            t tVar = (t) arrayDeque.poll();
            d0 b11 = tVar.b();
            w0 H03 = b11.H0();
            if (typeCheckingProcedureCallbacks.a(H03, H02)) {
                boolean I0 = b11.I0();
                for (t a11 = tVar.a(); a11 != null; a11 = a11.a()) {
                    d0 b12 = a11.b();
                    List<y0> G0 = b12.G0();
                    if (!(G0 instanceof Collection) || !G0.isEmpty()) {
                        for (y0 y0Var : G0) {
                            if (y0Var.b() != k1.INVARIANT) {
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
                        d0 n11 = x10.d.f(x0.f34347b.a(b12), false, 1, null).c().n(b11, k1.INVARIANT);
                        kotlin.jvm.internal.s.f(n11, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                        b11 = a(n11);
                    } else {
                        b11 = x0.f34347b.a(b12).c().n(b11, k1.INVARIANT);
                        kotlin.jvm.internal.s.f(b11, "{\n                    Ty…ARIANT)\n                }");
                    }
                    I0 = I0 || b12.I0();
                }
                if (typeCheckingProcedureCallbacks.a(b11.H0(), H02)) {
                    return f1.q(b11, I0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(H0) + ", \n\nsupertype: " + b(H02) + " \n" + typeCheckingProcedureCallbacks.a(H0, H02));
            }
            for (d0 immediateSupertype : H03.a()) {
                kotlin.jvm.internal.s.f(immediateSupertype, "immediateSupertype");
                arrayDeque.add(new t(immediateSupertype, tVar));
            }
        }
        return null;
    }
}