package z2;

import z2.h;

/* loaded from: classes.dex */
public interface a0 {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(a0 a0Var, h.c cVar, float f11, float f12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
            }
            if ((i11 & 2) != 0) {
                f11 = x2.g.f(0);
            }
            if ((i11 & 4) != 0) {
                f12 = x2.g.f(0);
            }
            a0Var.a(cVar, f11, f12);
        }
    }

    void a(h.c cVar, float f11, float f12);
}