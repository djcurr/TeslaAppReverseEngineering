package v20;

/* loaded from: classes5.dex */
public final /* synthetic */ class j {
    public static final <T> T a(zz.g gVar, h00.p<? super o0, ? super zz.d<? super T>, ? extends Object> pVar) {
        k1 a11;
        zz.g d11;
        Thread currentThread = Thread.currentThread();
        zz.e eVar = (zz.e) gVar.get(zz.e.f61277h3);
        if (eVar == null) {
            a11 = a3.f53889a.b();
            d11 = i0.d(t1.f54002a, gVar.plus(a11));
        } else {
            k1 k1Var = null;
            k1 k1Var2 = eVar instanceof k1 ? (k1) eVar : null;
            if (k1Var2 != null && k1Var2.D1()) {
                k1Var = k1Var2;
            }
            a11 = k1Var == null ? a3.f53889a.a() : k1Var;
            d11 = i0.d(t1.f54002a, gVar);
        }
        g gVar2 = new g(d11, currentThread, a11);
        gVar2.Z0(kotlinx.coroutines.a.DEFAULT, gVar2, pVar);
        return (T) gVar2.a1();
    }

    public static /* synthetic */ Object b(zz.g gVar, h00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gVar = zz.h.f61280a;
        }
        return i.e(gVar, pVar);
    }
}