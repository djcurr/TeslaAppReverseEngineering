package y10;

import k20.k0;

/* loaded from: classes5.dex */
public final class u extends o<Short> {
    public u(short s11) {
        super(Short.valueOf(s11));
    }

    @Override // y10.g
    /* renamed from: c */
    public k0 a(w00.x module) {
        kotlin.jvm.internal.s.g(module, "module");
        k0 T = module.l().T();
        kotlin.jvm.internal.s.f(T, "module.builtIns.shortType");
        return T;
    }

    @Override // y10.g
    public String toString() {
        return b().intValue() + ".toShort()";
    }
}