package gu;

import java.util.Map;
import vz.v;
import wz.r0;
import wz.s0;

/* loaded from: classes6.dex */
public final class c {
    public static final ot.a a(ot.c cVar) {
        ot.i f11;
        kotlin.jvm.internal.s.g(cVar, "<this>");
        ot.b c11 = cVar.c();
        if (c11 == null || (f11 = c11.f()) == null) {
            return null;
        }
        ot.j c12 = f11.c();
        if ((c12 == null ? null : c12.b()) != null) {
            ot.j c13 = f11.c();
            kotlin.jvm.internal.s.e(c13);
            ot.a b11 = c13.b();
            kotlin.jvm.internal.s.e(b11);
            return b11;
        }
        return null;
    }

    public static final Map<String, String> b(uu.h hVar) {
        Map<String, String> i11;
        ot.i f11;
        Map<String, String> l11;
        Map<String, String> i12;
        Map<String, String> f12;
        kotlin.jvm.internal.s.g(hVar, "<this>");
        ot.b c11 = hVar.A().c();
        if (c11 == null || (f11 = c11.f()) == null) {
            i11 = s0.i();
            return i11;
        }
        ot.j c12 = f11.c();
        if ((c12 == null ? null : c12.b()) != null) {
            f12 = r0.f(v.a("vehicle_id", hVar.P()));
            return f12;
        }
        ot.j c13 = f11.c();
        if ((c13 == null ? null : c13.c()) == null) {
            ot.j c14 = f11.c();
            if ((c14 == null ? null : c14.e()) == null) {
                ot.j c15 = f11.c();
                if ((c15 != null ? c15.d() : null) == null) {
                    i12 = s0.i();
                    return i12;
                }
            }
        }
        vz.p[] pVarArr = new vz.p[2];
        pVarArr[0] = v.a("id", hVar.P());
        String k11 = com.tesla.data.oapi.c.k(c11);
        if (k11 == null) {
            k11 = "";
        }
        pVarArr[1] = v.a("command", k11);
        l11 = s0.l(pVarArr);
        return l11;
    }

    public static final String c(ot.c cVar) {
        ot.i f11;
        kotlin.jvm.internal.s.g(cVar, "<this>");
        ot.b c11 = cVar.c();
        if (c11 == null || (f11 = c11.f()) == null) {
            return null;
        }
        ot.j c12 = f11.c();
        if ((c12 == null ? null : c12.b()) != null) {
            return "ADD_KEY";
        }
        ot.j c13 = f11.c();
        if ((c13 == null ? null : c13.c()) == null) {
            ot.j c14 = f11.c();
            if ((c14 == null ? null : c14.e()) == null) {
                ot.j c15 = f11.c();
                if ((c15 == null ? null : c15.d()) == null) {
                    return null;
                }
            }
        }
        return "FLEET_GENERATE_SIGNED_COMMAND";
    }

    public static final String d(ot.c cVar) {
        kotlin.jvm.internal.s.g(cVar, "<this>");
        return cVar.e();
    }
}