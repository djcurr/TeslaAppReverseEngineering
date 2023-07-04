package p0;

import o1.a;

/* loaded from: classes.dex */
public interface c0 {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ o1.f a(c0 c0Var, o1.f fVar, float f11, boolean z11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    z11 = true;
                }
                return c0Var.a(fVar, f11, z11);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
    }

    o1.f a(o1.f fVar, float f11, boolean z11);

    o1.f b(o1.f fVar, a.c cVar);
}