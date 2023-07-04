package t1;

/* loaded from: classes.dex */
public interface u {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(u uVar, q0 q0Var, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            }
            if ((i12 & 2) != 0) {
                i11 = z.f51535a.b();
            }
            uVar.c(q0Var, i11);
        }

        public static /* synthetic */ void b(u uVar, float f11, float f12, float f13, float f14, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            }
            if ((i12 & 16) != 0) {
                i11 = z.f51535a.b();
            }
            uVar.a(f11, f12, f13, f14, i11);
        }

        public static void c(u uVar, s1.h rect, int i11) {
            kotlin.jvm.internal.s.g(uVar, "this");
            kotlin.jvm.internal.s.g(rect, "rect");
            uVar.a(rect.i(), rect.l(), rect.j(), rect.e(), i11);
        }

        public static /* synthetic */ void d(u uVar, s1.h hVar, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
            }
            if ((i12 & 2) != 0) {
                i11 = z.f51535a.b();
            }
            uVar.g(hVar, i11);
        }

        public static void e(u uVar, s1.h rect, o0 paint) {
            kotlin.jvm.internal.s.g(uVar, "this");
            kotlin.jvm.internal.s.g(rect, "rect");
            kotlin.jvm.internal.s.g(paint, "paint");
            uVar.d(rect.i(), rect.l(), rect.j(), rect.e(), paint);
        }
    }

    void a(float f11, float f12, float f13, float f14, int i11);

    void b(float f11, float f12);

    void c(q0 q0Var, int i11);

    void d(float f11, float f12, float f13, float f14, o0 o0Var);

    void e(float f11, float f12);

    void f(float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, o0 o0Var);

    void g(s1.h hVar, int i11);

    void h();

    void i();

    void j(long j11, long j12, o0 o0Var);

    void k(float f11);

    void l(h0 h0Var, long j11, long j12, long j13, long j14, o0 o0Var);

    void m();

    void n();

    void o(long j11, float f11, o0 o0Var);

    void p(s1.h hVar, o0 o0Var);

    void q(float[] fArr);

    void r(float f11, float f12, float f13, float f14, float f15, float f16, o0 o0Var);

    void s(h0 h0Var, long j11, o0 o0Var);

    void t(q0 q0Var, o0 o0Var);

    void u(s1.h hVar, o0 o0Var);
}