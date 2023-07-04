package k20;

import java.util.HashSet;

/* loaded from: classes5.dex */
public final class w {
    public static final m20.i a(e1 e1Var, m20.i inlineClassType) {
        kotlin.jvm.internal.s.g(e1Var, "<this>");
        kotlin.jvm.internal.s.g(inlineClassType, "inlineClassType");
        return b(e1Var, inlineClassType, new HashSet());
    }

    private static final m20.i b(e1 e1Var, m20.i iVar, HashSet<m20.m> hashSet) {
        m20.i b11;
        m20.m j11 = e1Var.j(iVar);
        if (hashSet.add(j11)) {
            m20.n t02 = e1Var.t0(j11);
            if (t02 != null) {
                b11 = b(e1Var, e1Var.y(t02), hashSet);
                if (b11 == null) {
                    return null;
                }
                if (!e1Var.C(b11) && e1Var.k(iVar)) {
                    return e1Var.s0(b11);
                }
            } else if (!e1Var.i(j11)) {
                return iVar;
            } else {
                m20.i u02 = e1Var.u0(iVar);
                if (u02 == null || (b11 = b(e1Var, u02, hashSet)) == null) {
                    return null;
                }
                if (e1Var.C(iVar)) {
                    return e1Var.C(b11) ? iVar : ((b11 instanceof m20.j) && e1Var.M((m20.j) b11)) ? iVar : e1Var.s0(b11);
                }
            }
            return b11;
        }
        return null;
    }
}