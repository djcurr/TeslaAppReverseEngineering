package v20;

/* loaded from: classes5.dex */
public final class j3 {
    public static final Object a(zz.d<? super vz.b0> dVar) {
        zz.d c11;
        Object d11;
        Object d12;
        Object d13;
        zz.g context = dVar.getContext();
        d2.m(context);
        c11 = a00.c.c(dVar);
        kotlinx.coroutines.internal.i iVar = c11 instanceof kotlinx.coroutines.internal.i ? (kotlinx.coroutines.internal.i) c11 : null;
        if (iVar == null) {
            d11 = vz.b0.f54756a;
        } else {
            if (iVar.f35463d.P0(context)) {
                iVar.k(context, vz.b0.f54756a);
            } else {
                i3 i3Var = new i3();
                zz.g plus = context.plus(i3Var);
                vz.b0 b0Var = vz.b0.f54756a;
                iVar.k(plus, b0Var);
                if (i3Var.f53956a) {
                    d11 = kotlinx.coroutines.internal.j.d(iVar) ? a00.d.d() : b0Var;
                }
            }
            d11 = a00.d.d();
        }
        d12 = a00.d.d();
        if (d11 == d12) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        d13 = a00.d.d();
        return d11 == d13 ? d11 : vz.b0.f54756a;
    }
}