package androidx.compose.ui.platform;

import kotlin.NoWhenBranchMatchedException;
import t1.m0;

/* loaded from: classes.dex */
public final class m1 {
    private static final boolean a(s1.j jVar) {
        return s1.a.d(jVar.h()) + s1.a.d(jVar.i()) <= jVar.j() && s1.a.d(jVar.b()) + s1.a.d(jVar.c()) <= jVar.j() && s1.a.e(jVar.h()) + s1.a.e(jVar.b()) <= jVar.d() && s1.a.e(jVar.i()) + s1.a.e(jVar.c()) <= jVar.d();
    }

    public static final boolean b(t1.m0 outline, float f11, float f12, t1.q0 q0Var, t1.q0 q0Var2) {
        kotlin.jvm.internal.s.g(outline, "outline");
        if (outline instanceof m0.b) {
            return d(((m0.b) outline).a(), f11, f12);
        }
        if (outline instanceof m0.c) {
            return e((m0.c) outline, f11, f12, q0Var, q0Var2);
        }
        if (outline instanceof m0.a) {
            return c(((m0.a) outline).a(), f11, f12, q0Var, q0Var2);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean c(t1.q0 q0Var, float f11, float f12, t1.q0 q0Var2, t1.q0 q0Var3) {
        s1.h hVar = new s1.h(f11 - 0.005f, f12 - 0.005f, f11 + 0.005f, f12 + 0.005f);
        if (q0Var2 == null) {
            q0Var2 = t1.n.a();
        }
        q0Var2.a(hVar);
        if (q0Var3 == null) {
            q0Var3 = t1.n.a();
        }
        q0Var3.k(q0Var, q0Var2, t1.u0.f51508a.b());
        boolean isEmpty = q0Var3.isEmpty();
        q0Var3.reset();
        q0Var2.reset();
        return !isEmpty;
    }

    private static final boolean d(s1.h hVar, float f11, float f12) {
        return hVar.i() <= f11 && f11 < hVar.j() && hVar.l() <= f12 && f12 < hVar.e();
    }

    private static final boolean e(m0.c cVar, float f11, float f12, t1.q0 q0Var, t1.q0 q0Var2) {
        s1.j a11 = cVar.a();
        if (f11 < a11.e() || f11 >= a11.f() || f12 < a11.g() || f12 >= a11.a()) {
            return false;
        }
        if (!a(a11)) {
            t1.q0 a12 = q0Var2 == null ? t1.n.a() : q0Var2;
            a12.j(a11);
            return c(a12, f11, f12, q0Var, q0Var2);
        }
        float d11 = s1.a.d(a11.h()) + a11.e();
        float e11 = s1.a.e(a11.h()) + a11.g();
        float f13 = a11.f() - s1.a.d(a11.i());
        float e12 = s1.a.e(a11.i()) + a11.g();
        float f14 = a11.f() - s1.a.d(a11.c());
        float a13 = a11.a() - s1.a.e(a11.c());
        float a14 = a11.a() - s1.a.e(a11.b());
        float d12 = s1.a.d(a11.b()) + a11.e();
        if (f11 >= d11 || f12 >= e11) {
            if (f11 >= d12 || f12 <= a14) {
                if (f11 <= f13 || f12 >= e12) {
                    if (f11 <= f14 || f12 <= a13) {
                        return true;
                    }
                    return f(f11, f12, a11.c(), f14, a13);
                }
                return f(f11, f12, a11.i(), f13, e12);
            }
            return f(f11, f12, a11.b(), d12, a14);
        }
        return f(f11, f12, a11.h(), d11, e11);
    }

    private static final boolean f(float f11, float f12, long j11, float f13, float f14) {
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float d11 = s1.a.d(j11);
        float e11 = s1.a.e(j11);
        return ((f15 * f15) / (d11 * d11)) + ((f16 * f16) / (e11 * e11)) <= 1.0f;
    }
}