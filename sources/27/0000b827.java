package uu;

import com.adyen.checkout.components.model.payments.request.Address;
import com.tesla.TeslaV4.BuildConfig;
import kotlin.jvm.internal.s;
import zu.j;

/* loaded from: classes6.dex */
public final class c {
    public static final String a(ot.c cVar) {
        s.g(cVar, "<this>");
        return ot.c.f44007i.encodeByteString(cVar).a();
    }

    public static final String b(ot.c cVar) {
        String a11;
        s.g(cVar, "<this>");
        ot.b c11 = cVar.c();
        return (c11 == null || (a11 = com.tesla.data.oapi.c.a(c11)) == null) ? Address.ADDRESS_NULL_PLACEHOLDER : a11;
    }

    public static final yt.b c(ot.c cVar) {
        s.g(cVar, "<this>");
        ot.b c11 = cVar.c();
        yt.b a11 = c11 == null ? null : com.tesla.data.oapi.d.a(c11);
        if (a11 != null) {
            return a11;
        }
        throw new IllegalStateException("Command action property missing");
    }

    public static final okio.i d(ot.c cVar) {
        s.g(cVar, "<this>");
        ot.b c11 = cVar.c();
        if (c11 == null || c11.f() == null) {
            return null;
        }
        return j.g(BuildConfig.FLEET_PUBLIC_KEY);
    }

    public static final boolean e(h hVar) {
        ot.c A;
        ot.b c11;
        if (hVar == null || (A = hVar.A()) == null || (c11 = A.c()) == null) {
            return false;
        }
        return com.tesla.data.oapi.c.v(c11);
    }
}