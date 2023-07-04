package y10;

import k20.d0;
import k20.k0;
import t00.k;

/* loaded from: classes5.dex */
public final class w extends a0<Byte> {
    public w(byte b11) {
        super(Byte.valueOf(b11));
    }

    @Override // y10.g
    public d0 a(w00.x module) {
        kotlin.jvm.internal.s.g(module, "module");
        w00.c a11 = w00.s.a(module, k.a.X);
        k0 n11 = a11 == null ? null : a11.n();
        if (n11 == null) {
            k0 j11 = k20.v.j("Unsigned type UByte not found");
            kotlin.jvm.internal.s.f(j11, "createErrorType(\"Unsigned type UByte not found\")");
            return j11;
        }
        return n11;
    }

    @Override // y10.g
    public String toString() {
        return b().intValue() + ".toUByte()";
    }
}