package m10;

import e10.z;
import java.util.Set;
import k20.e1;
import wz.e0;
import wz.u;
import wz.y0;

/* loaded from: classes5.dex */
public final class r {
    public static final e a(h hVar, f fVar, boolean z11, boolean z12) {
        if (z12 && hVar == h.NOT_NULL) {
            return new e(hVar, fVar, true, z11);
        }
        return new e(hVar, fVar, false, z11);
    }

    public static final boolean b(e1 e1Var, m20.i type) {
        kotlin.jvm.internal.s.g(e1Var, "<this>");
        kotlin.jvm.internal.s.g(type, "type");
        u10.c ENHANCED_NULLABILITY_ANNOTATION = z.f24525o;
        kotlin.jvm.internal.s.f(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return e1Var.j0(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    public static final <T> T c(Set<? extends T> set, T low, T high, T t11, boolean z11) {
        Set n11;
        Set<? extends T> S0;
        kotlin.jvm.internal.s.g(set, "<this>");
        kotlin.jvm.internal.s.g(low, "low");
        kotlin.jvm.internal.s.g(high, "high");
        if (z11) {
            T t12 = set.contains(low) ? low : set.contains(high) ? high : null;
            if (kotlin.jvm.internal.s.c(t12, low) && kotlin.jvm.internal.s.c(t11, high)) {
                return null;
            }
            return t11 == null ? t12 : t11;
        }
        if (t11 != null) {
            n11 = y0.n(set, t11);
            S0 = e0.S0(n11);
            if (S0 != null) {
                set = S0;
            }
        }
        return (T) u.D0(set);
    }

    public static final h d(Set<? extends h> set, h hVar, boolean z11) {
        kotlin.jvm.internal.s.g(set, "<this>");
        h hVar2 = h.FORCE_FLEXIBILITY;
        return hVar == hVar2 ? hVar2 : (h) c(set, h.NOT_NULL, h.NULLABLE, hVar, z11);
    }
}