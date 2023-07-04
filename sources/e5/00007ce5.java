package k20;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f34232a = new d();

    private d() {
    }

    private final boolean a(m20.o oVar, m20.j jVar, m20.j jVar2) {
        int Y;
        if (oVar.Y(jVar) == oVar.Y(jVar2) && oVar.i0(jVar) == oVar.i0(jVar2)) {
            if ((oVar.T(jVar) == null) == (oVar.T(jVar2) == null) && oVar.u(oVar.d(jVar), oVar.d(jVar2))) {
                if (!oVar.x(jVar, jVar2) && (Y = oVar.Y(jVar)) > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        m20.l J = oVar.J(jVar, i11);
                        m20.l J2 = oVar.J(jVar2, i11);
                        if (oVar.p(J) != oVar.p(J2)) {
                            return false;
                        }
                        if (!oVar.p(J) && (oVar.r(J) != oVar.r(J2) || !c(oVar, oVar.b0(J), oVar.b0(J2)))) {
                            return false;
                        }
                        if (i12 >= Y) {
                            break;
                        }
                        i11 = i12;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final boolean c(m20.o oVar, m20.i iVar, m20.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        m20.j a11 = oVar.a(iVar);
        m20.j a12 = oVar.a(iVar2);
        if (a11 != null && a12 != null) {
            return a(oVar, a11, a12);
        }
        m20.g l02 = oVar.l0(iVar);
        m20.g l03 = oVar.l0(iVar2);
        if (l02 == null || l03 == null) {
            return false;
        }
        return a(oVar, oVar.c(l02), oVar.c(l03)) && a(oVar, oVar.b(l02), oVar.b(l03));
    }

    public final boolean b(m20.o context, m20.i a11, m20.i b11) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(a11, "a");
        kotlin.jvm.internal.s.g(b11, "b");
        return c(context, a11, b11);
    }
}