package v1;

import t1.q0;
import t1.z;

/* loaded from: classes.dex */
public interface g {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(g gVar, q0 q0Var, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            }
            if ((i12 & 2) != 0) {
                i11 = z.f51535a.b();
            }
            gVar.c(q0Var, i11);
        }

        public static /* synthetic */ void b(g gVar, float f11, float f12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
            }
            if ((i11 & 1) != 0) {
                f11 = 0.0f;
            }
            if ((i11 & 2) != 0) {
                f12 = 0.0f;
            }
            gVar.b(f11, f12);
        }
    }

    void a(float f11, float f12, float f13, float f14, int i11);

    void b(float f11, float f12);

    void c(q0 q0Var, int i11);

    void d(float[] fArr);

    void e(float f11, float f12, long j11);

    void f(float f11, long j11);

    void g(float f11, float f12, float f13, float f14);
}