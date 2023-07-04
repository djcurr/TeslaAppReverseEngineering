package w0;

import java.util.List;
import n2.a;
import r2.d;

/* loaded from: classes.dex */
public final class u0 {
    public static final boolean a(n2.w canReuse, n2.a text, n2.a0 style, List<a.b<n2.p>> placeholders, int i11, boolean z11, int i12, x2.d density, x2.q layoutDirection, d.a resourceLoader, long j11) {
        kotlin.jvm.internal.s.g(canReuse, "$this$canReuse");
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(style, "style");
        kotlin.jvm.internal.s.g(placeholders, "placeholders");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.s.g(resourceLoader, "resourceLoader");
        n2.v k11 = canReuse.k();
        if (kotlin.jvm.internal.s.c(k11.l(), text) && b(k11.k(), style) && kotlin.jvm.internal.s.c(k11.h(), placeholders) && k11.f() == i11 && k11.j() == z11 && w2.k.d(k11.g(), i12) && kotlin.jvm.internal.s.c(k11.d(), density) && k11.e() == layoutDirection && kotlin.jvm.internal.s.c(k11.i(), resourceLoader) && x2.b.p(j11) == x2.b.p(k11.c())) {
            return !(z11 || w2.k.d(i12, w2.k.f55428a.b())) || x2.b.n(j11) == x2.b.n(k11.c());
        }
        return false;
    }

    public static final boolean b(n2.a0 a0Var, n2.a0 other) {
        kotlin.jvm.internal.s.g(a0Var, "<this>");
        kotlin.jvm.internal.s.g(other, "other");
        return a0Var == other || (x2.r.e(a0Var.i(), other.i()) && kotlin.jvm.internal.s.c(a0Var.l(), other.l()) && kotlin.jvm.internal.s.c(a0Var.j(), other.j()) && kotlin.jvm.internal.s.c(a0Var.k(), other.k()) && kotlin.jvm.internal.s.c(a0Var.g(), other.g()) && kotlin.jvm.internal.s.c(a0Var.h(), other.h()) && x2.r.e(a0Var.m(), other.m()) && kotlin.jvm.internal.s.c(a0Var.e(), other.e()) && kotlin.jvm.internal.s.c(a0Var.t(), other.t()) && kotlin.jvm.internal.s.c(a0Var.o(), other.o()) && t1.a0.n(a0Var.d(), other.d()) && kotlin.jvm.internal.s.c(a0Var.q(), other.q()) && kotlin.jvm.internal.s.c(a0Var.s(), other.s()) && x2.r.e(a0Var.n(), other.n()) && kotlin.jvm.internal.s.c(a0Var.u(), other.u()));
    }
}