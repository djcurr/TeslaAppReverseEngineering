package r10;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import p10.n;
import p10.q;
import p10.r;
import p10.u;
import wz.x;

/* loaded from: classes5.dex */
public final class f {
    public static final q a(q qVar, g typeTable) {
        s.g(qVar, "<this>");
        s.g(typeTable, "typeTable");
        if (qVar.e0()) {
            return qVar.M();
        }
        if (qVar.f0()) {
            return typeTable.a(qVar.N());
        }
        return null;
    }

    public static final q b(r rVar, g typeTable) {
        s.g(rVar, "<this>");
        s.g(typeTable, "typeTable");
        if (rVar.Y()) {
            q expandedType = rVar.O();
            s.f(expandedType, "expandedType");
            return expandedType;
        } else if (rVar.Z()) {
            return typeTable.a(rVar.P());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
        }
    }

    public static final q c(q qVar, g typeTable) {
        s.g(qVar, "<this>");
        s.g(typeTable, "typeTable");
        if (qVar.j0()) {
            return qVar.W();
        }
        if (qVar.k0()) {
            return typeTable.a(qVar.X());
        }
        return null;
    }

    public static final boolean d(p10.i iVar) {
        s.g(iVar, "<this>");
        return iVar.i0() || iVar.j0();
    }

    public static final boolean e(n nVar) {
        s.g(nVar, "<this>");
        return nVar.f0() || nVar.g0();
    }

    public static final q f(p10.c cVar, g typeTable) {
        s.g(cVar, "<this>");
        s.g(typeTable, "typeTable");
        if (cVar.O0()) {
            return cVar.q0();
        }
        if (cVar.P0()) {
            return typeTable.a(cVar.r0());
        }
        return null;
    }

    public static final q g(q qVar, g typeTable) {
        s.g(qVar, "<this>");
        s.g(typeTable, "typeTable");
        if (qVar.m0()) {
            return qVar.Z();
        }
        if (qVar.n0()) {
            return typeTable.a(qVar.a0());
        }
        return null;
    }

    public static final q h(p10.i iVar, g typeTable) {
        s.g(iVar, "<this>");
        s.g(typeTable, "typeTable");
        if (iVar.i0()) {
            return iVar.S();
        }
        if (iVar.j0()) {
            return typeTable.a(iVar.T());
        }
        return null;
    }

    public static final q i(n nVar, g typeTable) {
        s.g(nVar, "<this>");
        s.g(typeTable, "typeTable");
        if (nVar.f0()) {
            return nVar.R();
        }
        if (nVar.g0()) {
            return typeTable.a(nVar.S());
        }
        return null;
    }

    public static final q j(p10.i iVar, g typeTable) {
        s.g(iVar, "<this>");
        s.g(typeTable, "typeTable");
        if (iVar.k0()) {
            q returnType = iVar.U();
            s.f(returnType, "returnType");
            return returnType;
        } else if (iVar.l0()) {
            return typeTable.a(iVar.V());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
        }
    }

    public static final q k(n nVar, g typeTable) {
        s.g(nVar, "<this>");
        s.g(typeTable, "typeTable");
        if (nVar.h0()) {
            q returnType = nVar.T();
            s.f(returnType, "returnType");
            return returnType;
        } else if (nVar.i0()) {
            return typeTable.a(nVar.U());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
        }
    }

    public static final List<q> l(p10.c cVar, g typeTable) {
        int t11;
        s.g(cVar, "<this>");
        s.g(typeTable, "typeTable");
        List<q> A0 = cVar.A0();
        if (!(!A0.isEmpty())) {
            A0 = null;
        }
        if (A0 == null) {
            List<Integer> supertypeIdList = cVar.z0();
            s.f(supertypeIdList, "supertypeIdList");
            t11 = x.t(supertypeIdList, 10);
            A0 = new ArrayList<>(t11);
            for (Integer it2 : supertypeIdList) {
                s.f(it2, "it");
                A0.add(typeTable.a(it2.intValue()));
            }
        }
        return A0;
    }

    public static final q m(q.b bVar, g typeTable) {
        s.g(bVar, "<this>");
        s.g(typeTable, "typeTable");
        if (bVar.v()) {
            return bVar.s();
        }
        if (bVar.w()) {
            return typeTable.a(bVar.t());
        }
        return null;
    }

    public static final q n(u uVar, g typeTable) {
        s.g(uVar, "<this>");
        s.g(typeTable, "typeTable");
        if (uVar.N()) {
            q type = uVar.H();
            s.f(type, "type");
            return type;
        } else if (uVar.O()) {
            return typeTable.a(uVar.I());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
        }
    }

    public static final q o(r rVar, g typeTable) {
        s.g(rVar, "<this>");
        s.g(typeTable, "typeTable");
        if (rVar.c0()) {
            q underlyingType = rVar.V();
            s.f(underlyingType, "underlyingType");
            return underlyingType;
        } else if (rVar.d0()) {
            return typeTable.a(rVar.W());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
        }
    }

    public static final List<q> p(p10.s sVar, g typeTable) {
        int t11;
        s.g(sVar, "<this>");
        s.g(typeTable, "typeTable");
        List<q> N = sVar.N();
        if (!(!N.isEmpty())) {
            N = null;
        }
        if (N == null) {
            List<Integer> upperBoundIdList = sVar.M();
            s.f(upperBoundIdList, "upperBoundIdList");
            t11 = x.t(upperBoundIdList, 10);
            N = new ArrayList<>(t11);
            for (Integer it2 : upperBoundIdList) {
                s.f(it2, "it");
                N.add(typeTable.a(it2.intValue()));
            }
        }
        return N;
    }

    public static final q q(u uVar, g typeTable) {
        s.g(uVar, "<this>");
        s.g(typeTable, "typeTable");
        if (uVar.P()) {
            return uVar.J();
        }
        if (uVar.Q()) {
            return typeTable.a(uVar.K());
        }
        return null;
    }
}