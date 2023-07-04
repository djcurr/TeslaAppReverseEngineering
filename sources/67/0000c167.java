package y10;

import k20.k0;

/* loaded from: classes5.dex */
public final class i extends g<Double> {
    public i(double d11) {
        super(Double.valueOf(d11));
    }

    @Override // y10.g
    /* renamed from: c */
    public k0 a(w00.x module) {
        kotlin.jvm.internal.s.g(module, "module");
        k0 z11 = module.l().z();
        kotlin.jvm.internal.s.f(z11, "module.builtIns.doubleType");
        return z11;
    }

    @Override // y10.g
    public String toString() {
        return b().doubleValue() + ".toDouble()";
    }
}