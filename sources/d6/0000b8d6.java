package v20;

import zz.e;

/* loaded from: classes5.dex */
public final /* synthetic */ class k {
    public static final <T> v0<T> a(o0 o0Var, zz.g gVar, kotlinx.coroutines.a aVar, h00.p<? super o0, ? super zz.d<? super T>, ? extends Object> pVar) {
        w0 w0Var;
        zz.g d11 = i0.d(o0Var, gVar);
        if (aVar.isLazy()) {
            w0Var = new j2(d11, pVar);
        } else {
            w0Var = new w0(d11, true);
        }
        ((a) w0Var).Z0(aVar, w0Var, pVar);
        return w0Var;
    }

    public static /* synthetic */ v0 b(o0 o0Var, zz.g gVar, kotlinx.coroutines.a aVar, h00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = zz.h.f61280a;
        }
        if ((i11 & 2) != 0) {
            aVar = kotlinx.coroutines.a.DEFAULT;
        }
        return i.a(o0Var, gVar, aVar, pVar);
    }

    public static final a2 c(o0 o0Var, zz.g gVar, kotlinx.coroutines.a aVar, h00.p<? super o0, ? super zz.d<? super vz.b0>, ? extends Object> pVar) {
        a v2Var;
        zz.g d11 = i0.d(o0Var, gVar);
        if (aVar.isLazy()) {
            v2Var = new k2(d11, pVar);
        } else {
            v2Var = new v2(d11, true);
        }
        v2Var.Z0(aVar, v2Var, pVar);
        return v2Var;
    }

    public static /* synthetic */ a2 d(o0 o0Var, zz.g gVar, kotlinx.coroutines.a aVar, h00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = zz.h.f61280a;
        }
        if ((i11 & 2) != 0) {
            aVar = kotlinx.coroutines.a.DEFAULT;
        }
        return i.c(o0Var, gVar, aVar, pVar);
    }

    public static final <T> Object e(zz.g gVar, h00.p<? super o0, ? super zz.d<? super T>, ? extends Object> pVar, zz.d<? super T> dVar) {
        Object b12;
        Object d11;
        zz.g context = dVar.getContext();
        zz.g e11 = i0.e(context, gVar);
        d2.m(e11);
        if (e11 == context) {
            kotlinx.coroutines.internal.d0 d0Var = new kotlinx.coroutines.internal.d0(e11, dVar);
            b12 = z20.b.d(d0Var, d0Var, pVar);
        } else {
            e.b bVar = zz.e.f61277h3;
            if (kotlin.jvm.internal.s.c(e11.get(bVar), context.get(bVar))) {
                g3 g3Var = new g3(e11, dVar);
                Object c11 = kotlinx.coroutines.internal.j0.c(e11, null);
                try {
                    Object d12 = z20.b.d(g3Var, g3Var, pVar);
                    kotlinx.coroutines.internal.j0.a(e11, c11);
                    b12 = d12;
                } catch (Throwable th2) {
                    kotlinx.coroutines.internal.j0.a(e11, c11);
                    throw th2;
                }
            } else {
                a1 a1Var = new a1(e11, dVar);
                z20.a.e(pVar, a1Var, a1Var, null, 4, null);
                b12 = a1Var.b1();
            }
        }
        d11 = a00.d.d();
        if (b12 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return b12;
    }
}