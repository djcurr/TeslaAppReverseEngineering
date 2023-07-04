package w10;

import k20.d0;
import k20.d1;
import k20.k0;
import k20.k1;
import kotlin.jvm.internal.s;
import w00.i0;
import w00.j0;
import w00.t;
import w00.w0;

/* loaded from: classes5.dex */
public final class f {
    static {
        new u10.c("kotlin.jvm.JvmInline");
    }

    public static final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        s.g(aVar, "<this>");
        if (aVar instanceof j0) {
            i0 correspondingProperty = ((j0) aVar).U();
            s.f(correspondingProperty, "correspondingProperty");
            if (d(correspondingProperty)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(w00.i iVar) {
        s.g(iVar, "<this>");
        if (iVar instanceof w00.c) {
            w00.c cVar = (w00.c) iVar;
            if (cVar.isInline() || cVar.f0()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(d0 d0Var) {
        s.g(d0Var, "<this>");
        w00.e n11 = d0Var.H0().n();
        if (n11 == null) {
            return false;
        }
        return b(n11);
    }

    public static final boolean d(w0 w0Var) {
        t<k0> t11;
        s.g(w0Var, "<this>");
        if (w0Var.N() == null) {
            w00.i b11 = w0Var.b();
            u10.f fVar = null;
            w00.c cVar = b11 instanceof w00.c ? (w00.c) b11 : null;
            if (cVar != null && (t11 = cVar.t()) != null) {
                fVar = t11.a();
            }
            if (s.c(fVar, w0Var.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final d0 e(d0 d0Var) {
        s.g(d0Var, "<this>");
        d0 f11 = f(d0Var);
        if (f11 == null) {
            return null;
        }
        return d1.f(d0Var).p(f11, k1.INVARIANT);
    }

    public static final d0 f(d0 d0Var) {
        t<k0> t11;
        s.g(d0Var, "<this>");
        w00.e n11 = d0Var.H0().n();
        if (!(n11 instanceof w00.c)) {
            n11 = null;
        }
        w00.c cVar = (w00.c) n11;
        if (cVar == null || (t11 = cVar.t()) == null) {
            return null;
        }
        return t11.b();
    }
}