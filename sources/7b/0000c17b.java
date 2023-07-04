package y10;

import k20.k0;

/* loaded from: classes5.dex */
public final class r extends o<Long> {
    public r(long j11) {
        super(Long.valueOf(j11));
    }

    @Override // y10.g
    /* renamed from: c */
    public k0 a(w00.x module) {
        kotlin.jvm.internal.s.g(module, "module");
        k0 F = module.l().F();
        kotlin.jvm.internal.s.f(F, "module.builtIns.longType");
        return F;
    }

    @Override // y10.g
    public String toString() {
        return b().longValue() + ".toLong()";
    }
}