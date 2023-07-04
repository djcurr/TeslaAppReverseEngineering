package y10;

import k20.d0;
import k20.k0;
import t00.k;

/* loaded from: classes5.dex */
public final class y extends a0<Long> {
    public y(long j11) {
        super(Long.valueOf(j11));
    }

    @Override // y10.g
    public d0 a(w00.x module) {
        kotlin.jvm.internal.s.g(module, "module");
        w00.c a11 = w00.s.a(module, k.a.f51323a0);
        k0 n11 = a11 == null ? null : a11.n();
        if (n11 == null) {
            k0 j11 = k20.v.j("Unsigned type ULong not found");
            kotlin.jvm.internal.s.f(j11, "createErrorType(\"Unsigned type ULong not found\")");
            return j11;
        }
        return n11;
    }

    @Override // y10.g
    public String toString() {
        return b().longValue() + ".toULong()";
    }
}