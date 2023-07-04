package y10;

import k20.k0;

/* loaded from: classes5.dex */
public final class l extends g<Float> {
    public l(float f11) {
        super(Float.valueOf(f11));
    }

    @Override // y10.g
    /* renamed from: c */
    public k0 a(w00.x module) {
        kotlin.jvm.internal.s.g(module, "module");
        k0 B = module.l().B();
        kotlin.jvm.internal.s.f(B, "module.builtIns.floatType");
        return B;
    }

    @Override // y10.g
    public String toString() {
        return b().floatValue() + ".toFloat()";
    }
}