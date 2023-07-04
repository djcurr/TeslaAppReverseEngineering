package v00;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k20.k0;
import k20.x0;
import kotlin.jvm.internal.s;
import w00.s0;
import wz.e0;
import wz.x;

/* loaded from: classes5.dex */
public final class j {
    public static final x0 a(w00.c from, w00.c to2) {
        int t11;
        int t12;
        List V0;
        Map t13;
        s.g(from, "from");
        s.g(to2, "to");
        from.o().size();
        to2.o().size();
        x0.a aVar = x0.f34347b;
        List<s0> o11 = from.o();
        s.f(o11, "from.declaredTypeParameters");
        t11 = x.t(o11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (s0 s0Var : o11) {
            arrayList.add(s0Var.i());
        }
        List<s0> o12 = to2.o();
        s.f(o12, "to.declaredTypeParameters");
        t12 = x.t(o12, 10);
        ArrayList arrayList2 = new ArrayList(t12);
        for (s0 s0Var2 : o12) {
            k0 n11 = s0Var2.n();
            s.f(n11, "it.defaultType");
            arrayList2.add(n20.a.a(n11));
        }
        V0 = e0.V0(arrayList, arrayList2);
        t13 = wz.s0.t(V0);
        return x0.a.e(aVar, t13, false, 2, null);
    }
}