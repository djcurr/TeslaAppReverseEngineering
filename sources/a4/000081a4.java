package l0;

import java.util.Map;
import s1.f;
import s1.h;
import s1.l;
import x2.g;
import x2.k;
import x2.o;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    private static final s1.h f36273a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<d1<?, ?>, Float> f36274b;

    static {
        Map<d1<?, ?>, Float> l11;
        Float valueOf = Float.valueOf(0.5f);
        f36273a = new s1.h(0.5f, 0.5f, 0.5f, 0.5f);
        d1<Integer, m> c11 = f1.c(kotlin.jvm.internal.r.f34922a);
        Float valueOf2 = Float.valueOf(1.0f);
        d1<x2.g, m> g11 = f1.g(x2.g.f56937b);
        Float valueOf3 = Float.valueOf(0.1f);
        l11 = wz.s0.l(vz.v.a(c11, valueOf2), vz.v.a(f1.j(x2.o.f56954b), valueOf2), vz.v.a(f1.i(x2.k.f56947b), valueOf2), vz.v.a(f1.b(kotlin.jvm.internal.l.f34915a), Float.valueOf(0.01f)), vz.v.a(f1.e(s1.h.f49955e), valueOf), vz.v.a(f1.f(s1.l.f49969b), valueOf), vz.v.a(f1.d(s1.f.f49950b), valueOf), vz.v.a(g11, valueOf3), vz.v.a(f1.h(x2.i.f56941b), valueOf3));
        f36274b = l11;
    }

    public static final float a(g.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return x2.g.f(0.1f);
    }

    public static final int b(kotlin.jvm.internal.r rVar) {
        kotlin.jvm.internal.s.g(rVar, "<this>");
        return 1;
    }

    public static final long c(f.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return s1.g.a(0.5f, 0.5f);
    }

    public static final long d(l.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return s1.m.a(0.5f, 0.5f);
    }

    public static final long e(k.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return x2.l.a(1, 1);
    }

    public static final long f(o.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return x2.p.a(1, 1);
    }

    public static final s1.h g(h.a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return f36273a;
    }

    public static final Map<d1<?, ?>, Float> h() {
        return f36274b;
    }
}