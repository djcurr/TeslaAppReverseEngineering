package t1;

/* loaded from: classes.dex */
public interface q0 {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(q0 q0Var, q0 q0Var2, long j11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
            }
            if ((i11 & 2) != 0) {
                j11 = s1.f.f49950b.c();
            }
            q0Var.h(q0Var2, j11);
        }
    }

    void a(s1.h hVar);

    boolean b();

    void c(float f11, float f12);

    void close();

    void d(float f11, float f12, float f13, float f14, float f15, float f16);

    void e(float f11, float f12, float f13, float f14);

    void f(float f11, float f12, float f13, float f14);

    void g(int i11);

    s1.h getBounds();

    void h(q0 q0Var, long j11);

    void i(long j11);

    boolean isEmpty();

    void j(s1.j jVar);

    boolean k(q0 q0Var, q0 q0Var2, int i11);

    void l(float f11, float f12);

    void m(float f11, float f12, float f13, float f14, float f15, float f16);

    void n(float f11, float f12);

    void o(float f11, float f12);

    void reset();
}