package w00;

/* loaded from: classes5.dex */
public final class o {
    public static final e a(i iVar) {
        kotlin.jvm.internal.s.g(iVar, "<this>");
        i b11 = iVar.b();
        if (b11 == null || (iVar instanceof a0)) {
            return null;
        }
        if (!b(b11)) {
            return a(b11);
        }
        if (b11 instanceof e) {
            return (e) b11;
        }
        return null;
    }

    public static final boolean b(i iVar) {
        kotlin.jvm.internal.s.g(iVar, "<this>");
        return iVar.b() instanceof a0;
    }

    public static final c c(x xVar, u10.c fqName, d10.b lookupLocation) {
        d20.h S;
        e e11;
        kotlin.jvm.internal.s.g(xVar, "<this>");
        kotlin.jvm.internal.s.g(fqName, "fqName");
        kotlin.jvm.internal.s.g(lookupLocation, "lookupLocation");
        if (fqName.d()) {
            return null;
        }
        u10.c e12 = fqName.e();
        kotlin.jvm.internal.s.f(e12, "fqName.parent()");
        d20.h m11 = xVar.R(e12).m();
        u10.f g11 = fqName.g();
        kotlin.jvm.internal.s.f(g11, "fqName.shortName()");
        e e13 = m11.e(g11, lookupLocation);
        c cVar = e13 instanceof c ? (c) e13 : null;
        if (cVar == null) {
            u10.c e14 = fqName.e();
            kotlin.jvm.internal.s.f(e14, "fqName.parent()");
            c c11 = c(xVar, e14, lookupLocation);
            if (c11 == null || (S = c11.S()) == null) {
                e11 = null;
            } else {
                u10.f g12 = fqName.g();
                kotlin.jvm.internal.s.f(g12, "fqName.shortName()");
                e11 = S.e(g12, lookupLocation);
            }
            if (e11 instanceof c) {
                return (c) e11;
            }
            return null;
        }
        return cVar;
    }
}