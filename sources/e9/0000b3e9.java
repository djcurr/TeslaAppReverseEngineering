package t00;

import java.util.ArrayList;
import java.util.List;
import k20.d0;
import k20.k1;
import k20.v;
import k20.w0;
import k20.y0;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import w00.n0;
import w00.p;
import w00.q;
import w00.s0;
import w00.x;
import wz.e0;
import y00.k0;
import y00.y;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final y f51357a;

    /* renamed from: b  reason: collision with root package name */
    private static final y f51358b;

    static {
        List<s0> d11;
        List<s0> d12;
        x q11 = v.q();
        s.f(q11, "getErrorModule()");
        y00.m mVar = new y00.m(q11, k.f51310e);
        kotlin.reflect.jvm.internal.impl.descriptors.c cVar = kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE;
        u10.f g11 = k.f51311f.g();
        n0 n0Var = n0.f55303a;
        j20.n nVar = j20.f.f33124e;
        y yVar = new y(mVar, cVar, false, false, g11, n0Var, nVar);
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT;
        yVar.I0(fVar);
        q qVar = p.f55309e;
        yVar.K0(qVar);
        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b11 = aVar.b();
        k1 k1Var = k1.IN_VARIANCE;
        d11 = wz.v.d(k0.N0(yVar, b11, false, k1Var, u10.f.f("T"), 0, nVar));
        yVar.J0(d11);
        yVar.G0();
        f51357a = yVar;
        x q12 = v.q();
        s.f(q12, "getErrorModule()");
        y yVar2 = new y(new y00.m(q12, k.f51309d), cVar, false, false, k.f51312g.g(), n0Var, nVar);
        yVar2.I0(fVar);
        yVar2.K0(qVar);
        d12 = wz.v.d(k0.N0(yVar2, aVar.b(), false, k1Var, u10.f.f("T"), 0, nVar));
        yVar2.J0(d12);
        yVar2.G0();
        f51358b = yVar2;
    }

    public static final boolean a(u10.c cVar, boolean z11) {
        if (z11) {
            return s.c(cVar, k.f51312g);
        }
        return s.c(cVar, k.f51311f);
    }

    public static final k20.k0 b(d0 suspendFunType, boolean z11) {
        int t11;
        w0 mo234i;
        List d11;
        List z02;
        s.g(suspendFunType, "suspendFunType");
        g.o(suspendFunType);
        h h11 = n20.a.h(suspendFunType);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations = suspendFunType.mo140getAnnotations();
        d0 h12 = g.h(suspendFunType);
        List<y0> j11 = g.j(suspendFunType);
        t11 = wz.x.t(j11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (y0 y0Var : j11) {
            arrayList.add(y0Var.getType());
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b11 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b();
        if (z11) {
            mo234i = f51358b.mo234i();
        } else {
            mo234i = f51357a.mo234i();
        }
        w0 w0Var = mo234i;
        s.f(w0Var, "if (isReleaseCoroutines)…ERIMENTAL.typeConstructor");
        d11 = wz.v.d(n20.a.a(g.i(suspendFunType)));
        z02 = e0.z0(arrayList, k20.e0.i(b11, w0Var, d11, false, null, 16, null));
        k20.k0 I = n20.a.h(suspendFunType).I();
        s.f(I, "suspendFunType.builtIns.nullableAnyType");
        return g.b(h11, mo140getAnnotations, h12, z02, null, I, false, 64, null).O0(suspendFunType.I0());
    }
}