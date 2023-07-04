package g10;

import i10.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k20.d0;
import kotlin.jvm.internal.s;
import vz.p;
import w00.n0;
import w00.v0;
import wz.e0;
import wz.x;
import y00.l0;

/* loaded from: classes5.dex */
public final class h {
    public static final List<v0> a(Collection<i> newValueParametersTypes, Collection<? extends v0> oldValueParameters, kotlin.reflect.jvm.internal.impl.descriptors.a newOwner) {
        List<p> V0;
        int t11;
        s.g(newValueParametersTypes, "newValueParametersTypes");
        s.g(oldValueParameters, "oldValueParameters");
        s.g(newOwner, "newOwner");
        newValueParametersTypes.size();
        oldValueParameters.size();
        V0 = e0.V0(newValueParametersTypes, oldValueParameters);
        t11 = x.t(V0, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (p pVar : V0) {
            i iVar = (i) pVar.a();
            v0 v0Var = (v0) pVar.b();
            int index = v0Var.getIndex();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations = v0Var.mo140getAnnotations();
            u10.f name = v0Var.getName();
            s.f(name, "oldParameter.name");
            d0 b11 = iVar.b();
            boolean a11 = iVar.a();
            boolean m02 = v0Var.m0();
            boolean k02 = v0Var.k0();
            d0 k11 = v0Var.q0() != null ? a20.a.l(newOwner).l().k(iVar.b()) : null;
            n0 f11 = v0Var.f();
            s.f(f11, "oldParameter.source");
            arrayList.add(new l0(newOwner, null, index, mo140getAnnotations, name, b11, a11, m02, k02, k11, f11));
        }
        return arrayList;
    }

    public static final k b(w00.c cVar) {
        s.g(cVar, "<this>");
        w00.c p11 = a20.a.p(cVar);
        if (p11 == null) {
            return null;
        }
        d20.h mo138h0 = p11.mo138h0();
        k kVar = mo138h0 instanceof k ? (k) mo138h0 : null;
        return kVar == null ? b(p11) : kVar;
    }
}