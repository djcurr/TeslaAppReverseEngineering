package n10;

import java.util.Collection;
import java.util.List;
import k20.e1;
import v00.c;

/* loaded from: classes5.dex */
public final class z {
    public static final <T> T a(k<T> kVar, T possiblyPrimitiveType, boolean z11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(possiblyPrimitiveType, "possiblyPrimitiveType");
        return z11 ? kVar.b(possiblyPrimitiveType) : possiblyPrimitiveType;
    }

    public static final <T> T b(e1 e1Var, m20.i type, k<T> typeFactory, y mode) {
        kotlin.jvm.internal.s.g(e1Var, "<this>");
        kotlin.jvm.internal.s.g(type, "type");
        kotlin.jvm.internal.s.g(typeFactory, "typeFactory");
        kotlin.jvm.internal.s.g(mode, "mode");
        m20.m j11 = e1Var.j(type);
        if (e1Var.s(j11)) {
            t00.i X = e1Var.X(j11);
            boolean z11 = true;
            if (X != null) {
                T c11 = typeFactory.c(X);
                if (!e1Var.C(type) && !m10.r.b(e1Var, type)) {
                    z11 = false;
                }
                return (T) a(typeFactory, c11, z11);
            }
            t00.i R = e1Var.R(j11);
            if (R != null) {
                return typeFactory.a(kotlin.jvm.internal.s.p("[", b20.e.get(R).getDesc()));
            }
            if (e1Var.o0(j11)) {
                u10.d w02 = e1Var.w0(j11);
                u10.b o11 = w02 == null ? null : v00.c.f53787a.o(w02);
                if (o11 != null) {
                    if (!mode.a()) {
                        List<c.a> j12 = v00.c.f53787a.j();
                        if (!(j12 instanceof Collection) || !j12.isEmpty()) {
                            for (c.a aVar : j12) {
                                if (kotlin.jvm.internal.s.c(aVar.d(), o11)) {
                                    break;
                                }
                            }
                        }
                        z11 = false;
                        if (z11) {
                            return null;
                        }
                    }
                    String f11 = b20.d.b(o11).f();
                    kotlin.jvm.internal.s.f(f11, "byClassId(classId).internalName");
                    return typeFactory.e(f11);
                }
            }
            return null;
        }
        return null;
    }
}