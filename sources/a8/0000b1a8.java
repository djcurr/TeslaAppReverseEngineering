package s2;

/* loaded from: classes.dex */
public final class b0 {
    public static final n2.a a(a0 a0Var) {
        kotlin.jvm.internal.s.g(a0Var, "<this>");
        return a0Var.e().k(a0Var.g());
    }

    public static final n2.a b(a0 a0Var, int i11) {
        kotlin.jvm.internal.s.g(a0Var, "<this>");
        return a0Var.e().subSequence(n2.y.k(a0Var.g()), Math.min(n2.y.k(a0Var.g()) + i11, a0Var.h().length()));
    }

    public static final n2.a c(a0 a0Var, int i11) {
        kotlin.jvm.internal.s.g(a0Var, "<this>");
        return a0Var.e().subSequence(Math.max(0, n2.y.l(a0Var.g()) - i11), n2.y.l(a0Var.g()));
    }
}