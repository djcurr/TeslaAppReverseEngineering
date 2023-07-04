package f10;

import e10.z;
import java.util.Map;
import kotlin.jvm.internal.s;
import t00.k;
import vz.v;
import wz.s0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f25521a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final u10.f f25522b;

    /* renamed from: c  reason: collision with root package name */
    private static final u10.f f25523c;

    /* renamed from: d  reason: collision with root package name */
    private static final u10.f f25524d;

    /* renamed from: e  reason: collision with root package name */
    private static final Map<u10.c, u10.c> f25525e;

    /* renamed from: f  reason: collision with root package name */
    private static final Map<u10.c, u10.c> f25526f;

    static {
        Map<u10.c, u10.c> l11;
        Map<u10.c, u10.c> l12;
        u10.f f11 = u10.f.f("message");
        s.f(f11, "identifier(\"message\")");
        f25522b = f11;
        u10.f f12 = u10.f.f("allowedTargets");
        s.f(f12, "identifier(\"allowedTargets\")");
        f25523c = f12;
        u10.f f13 = u10.f.f("value");
        s.f(f13, "identifier(\"value\")");
        f25524d = f13;
        u10.c cVar = k.a.f51350t;
        u10.c cVar2 = z.f24513c;
        u10.c cVar3 = k.a.f51353w;
        u10.c cVar4 = z.f24514d;
        u10.c cVar5 = k.a.f51354x;
        u10.c cVar6 = z.f24517g;
        u10.c cVar7 = k.a.f51355y;
        u10.c cVar8 = z.f24516f;
        l11 = s0.l(v.a(cVar, cVar2), v.a(cVar3, cVar4), v.a(cVar5, cVar6), v.a(cVar7, cVar8));
        f25525e = l11;
        l12 = s0.l(v.a(cVar2, cVar), v.a(cVar4, cVar3), v.a(z.f24515e, k.a.f51344n), v.a(cVar6, cVar5), v.a(cVar8, cVar7));
        f25526f = l12;
    }

    private c() {
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.c f(c cVar, l10.a aVar, h10.h hVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return cVar.e(aVar, hVar, z11);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(u10.c kotlinName, l10.d annotationOwner, h10.h c11) {
        l10.a l11;
        s.g(kotlinName, "kotlinName");
        s.g(annotationOwner, "annotationOwner");
        s.g(c11, "c");
        if (s.c(kotlinName, k.a.f51344n)) {
            u10.c DEPRECATED_ANNOTATION = z.f24515e;
            s.f(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            l10.a l12 = annotationOwner.l(DEPRECATED_ANNOTATION);
            if (l12 != null || annotationOwner.C()) {
                return new e(l12, c11);
            }
        }
        u10.c cVar = f25525e.get(kotlinName);
        if (cVar == null || (l11 = annotationOwner.l(cVar)) == null) {
            return null;
        }
        return f(f25521a, l11, c11, false, 4, null);
    }

    public final u10.f b() {
        return f25522b;
    }

    public final u10.f c() {
        return f25524d;
    }

    public final u10.f d() {
        return f25523c;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e(l10.a annotation, h10.h c11, boolean z11) {
        s.g(annotation, "annotation");
        s.g(c11, "c");
        u10.b j11 = annotation.j();
        if (s.c(j11, u10.b.m(z.f24513c))) {
            return new i(annotation, c11);
        }
        if (s.c(j11, u10.b.m(z.f24514d))) {
            return new h(annotation, c11);
        }
        if (s.c(j11, u10.b.m(z.f24517g))) {
            return new b(c11, annotation, k.a.f51354x);
        }
        if (s.c(j11, u10.b.m(z.f24516f))) {
            return new b(c11, annotation, k.a.f51355y);
        }
        if (s.c(j11, u10.b.m(z.f24515e))) {
            return null;
        }
        return new i10.e(c11, annotation, z11);
    }
}