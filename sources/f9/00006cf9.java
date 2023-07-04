package f2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.o;

/* loaded from: classes.dex */
public final class p {
    public static final s1.h a(o oVar) {
        kotlin.jvm.internal.s.g(oVar, "<this>");
        o Y = oVar.Y();
        s1.h a11 = Y != null ? o.a.a(Y, oVar, false, 2, null) : null;
        return a11 == null ? new s1.h(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, x2.o.g(oVar.e()), x2.o.f(oVar.e())) : a11;
    }

    public static final s1.h b(o oVar) {
        kotlin.jvm.internal.s.g(oVar, "<this>");
        return o.a.a(d(oVar), oVar, false, 2, null);
    }

    public static final s1.h c(o oVar) {
        float e11;
        float e12;
        float c11;
        float c12;
        kotlin.jvm.internal.s.g(oVar, "<this>");
        o d11 = d(oVar);
        s1.h b11 = b(oVar);
        long v11 = d11.v(s1.g.a(b11.i(), b11.l()));
        long v12 = d11.v(s1.g.a(b11.j(), b11.l()));
        long v13 = d11.v(s1.g.a(b11.j(), b11.e()));
        long v14 = d11.v(s1.g.a(b11.i(), b11.e()));
        e11 = yz.c.e(s1.f.l(v11), s1.f.l(v12), s1.f.l(v14), s1.f.l(v13));
        e12 = yz.c.e(s1.f.m(v11), s1.f.m(v12), s1.f.m(v14), s1.f.m(v13));
        c11 = yz.c.c(s1.f.l(v11), s1.f.l(v12), s1.f.l(v14), s1.f.l(v13));
        c12 = yz.c.c(s1.f.m(v11), s1.f.m(v12), s1.f.m(v14), s1.f.m(v13));
        return new s1.h(e11, e12, c11, c12);
    }

    public static final o d(o oVar) {
        o oVar2;
        kotlin.jvm.internal.s.g(oVar, "<this>");
        o Y = oVar.Y();
        while (true) {
            o oVar3 = Y;
            oVar2 = oVar;
            oVar = oVar3;
            if (oVar == null) {
                break;
            }
            Y = oVar.Y();
        }
        h2.o oVar4 = oVar2 instanceof h2.o ? (h2.o) oVar2 : null;
        if (oVar4 == null) {
            return oVar2;
        }
        h2.o w12 = oVar4.w1();
        while (true) {
            h2.o oVar5 = w12;
            h2.o oVar6 = oVar4;
            oVar4 = oVar5;
            if (oVar4 == null) {
                return oVar6;
            }
            w12 = oVar4.w1();
        }
    }

    public static final long e(o oVar) {
        kotlin.jvm.internal.s.g(oVar, "<this>");
        return oVar.q0(s1.f.f49950b.c());
    }

    public static final long f(o oVar) {
        kotlin.jvm.internal.s.g(oVar, "<this>");
        return oVar.v(s1.f.f49950b.c());
    }
}