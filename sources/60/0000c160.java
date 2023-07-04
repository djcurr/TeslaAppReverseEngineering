package y10;

import k20.k0;

/* loaded from: classes5.dex */
public final class d extends o<Byte> {
    public d(byte b11) {
        super(Byte.valueOf(b11));
    }

    @Override // y10.g
    /* renamed from: c */
    public k0 a(w00.x module) {
        kotlin.jvm.internal.s.g(module, "module");
        k0 t11 = module.l().t();
        kotlin.jvm.internal.s.f(t11, "module.builtIns.byteType");
        return t11;
    }

    @Override // y10.g
    public String toString() {
        return b().intValue() + ".toByte()";
    }
}