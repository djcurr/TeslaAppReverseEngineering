package h30;

import e30.j;
import e30.k;

/* loaded from: classes5.dex */
public final class k0 {
    public static final e30.f a(e30.f fVar, i30.c module) {
        e30.f a11;
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(module, "module");
        if (!kotlin.jvm.internal.s.c(fVar.getKind(), j.a.f24588a)) {
            return fVar.isInline() ? a(fVar.g(0), module) : fVar;
        }
        e30.f b11 = e30.b.b(module, fVar);
        return (b11 == null || (a11 = a(b11, module)) == null) ? fVar : a11;
    }

    public static final kotlinx.serialization.json.internal.a b(kotlinx.serialization.json.a aVar, e30.f desc) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        kotlin.jvm.internal.s.g(desc, "desc");
        e30.j kind = desc.getKind();
        if (kind instanceof e30.d) {
            return kotlinx.serialization.json.internal.a.POLY_OBJ;
        }
        if (kotlin.jvm.internal.s.c(kind, k.b.f24591a)) {
            return kotlinx.serialization.json.internal.a.LIST;
        }
        if (kotlin.jvm.internal.s.c(kind, k.c.f24592a)) {
            e30.f a11 = a(desc.g(0), aVar.a());
            e30.j kind2 = a11.getKind();
            if (!(kind2 instanceof e30.e) && !kotlin.jvm.internal.s.c(kind2, j.b.f24589a)) {
                if (aVar.e().b()) {
                    return kotlinx.serialization.json.internal.a.LIST;
                }
                throw o.d(a11);
            }
            return kotlinx.serialization.json.internal.a.MAP;
        }
        return kotlinx.serialization.json.internal.a.OBJ;
    }
}