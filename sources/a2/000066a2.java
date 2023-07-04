package e10;

import java.util.List;
import java.util.Map;
import java.util.Set;
import wz.r0;
import wz.s0;
import wz.x0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final u10.c f24419a = new u10.c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b  reason: collision with root package name */
    private static final u10.c f24420b = new u10.c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c  reason: collision with root package name */
    private static final u10.c f24421c = new u10.c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d  reason: collision with root package name */
    private static final u10.c f24422d = new u10.c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e  reason: collision with root package name */
    private static final List<a> f24423e;

    /* renamed from: f  reason: collision with root package name */
    private static final Map<u10.c, q> f24424f;

    /* renamed from: g  reason: collision with root package name */
    private static final Map<u10.c, q> f24425g;

    /* renamed from: h  reason: collision with root package name */
    private static final Set<u10.c> f24426h;

    static {
        List<a> l11;
        Map<u10.c, q> f11;
        List d11;
        List d12;
        Map l12;
        Map<u10.c, q> p11;
        Set<u10.c> i11;
        a aVar = a.VALUE_PARAMETER;
        l11 = wz.w.l(a.FIELD, a.METHOD_RETURN_TYPE, aVar, a.TYPE_PARAMETER_BOUNDS, a.TYPE_USE);
        f24423e = l11;
        u10.c i12 = a0.i();
        m10.h hVar = m10.h.NOT_NULL;
        f11 = r0.f(vz.v.a(i12, new q(new m10.i(hVar, false, 2, null), l11, false, false)));
        f24424f = f11;
        u10.c cVar = new u10.c("javax.annotation.ParametersAreNullableByDefault");
        m10.i iVar = new m10.i(m10.h.NULLABLE, false, 2, null);
        d11 = wz.v.d(aVar);
        u10.c cVar2 = new u10.c("javax.annotation.ParametersAreNonnullByDefault");
        m10.i iVar2 = new m10.i(hVar, false, 2, null);
        d12 = wz.v.d(aVar);
        l12 = s0.l(vz.v.a(cVar, new q(iVar, d11, false, false, 12, null)), vz.v.a(cVar2, new q(iVar2, d12, false, false, 12, null)));
        p11 = s0.p(l12, f11);
        f24425g = p11;
        i11 = x0.i(a0.f(), a0.e());
        f24426h = i11;
    }

    public static final Map<u10.c, q> a() {
        return f24425g;
    }

    public static final Set<u10.c> b() {
        return f24426h;
    }

    public static final Map<u10.c, q> c() {
        return f24424f;
    }

    public static final u10.c d() {
        return f24422d;
    }

    public static final u10.c e() {
        return f24421c;
    }

    public static final u10.c f() {
        return f24420b;
    }

    public static final u10.c g() {
        return f24419a;
    }
}