package gu;

import gu.a;

/* loaded from: classes6.dex */
public final class j {

    /* renamed from: a */
    public static final j f28104a = new j();

    static {
        com.tesla.logging.g.f21878b.a("MessageBuilder");
    }

    private j() {
    }

    public static /* synthetic */ a a(k kVar, qt.d dVar) {
        return e(kVar, dVar);
    }

    public static /* synthetic */ hy.q b(k kVar, Throwable th2) {
        return f(kVar, th2);
    }

    public static /* synthetic */ qt.d c(k kVar, String str, yt.f fVar) {
        return h(kVar, str, fVar);
    }

    public static final a e(k params, qt.d it2) {
        kotlin.jvm.internal.s.g(params, "$params");
        kotlin.jvm.internal.s.f(it2, "it");
        return new a.b(params, it2);
    }

    public static final hy.q f(k params, Throwable it2) {
        kotlin.jvm.internal.s.g(params, "$params");
        kotlin.jvm.internal.s.f(it2, "it");
        return hy.m.n(new a.C0535a(params, it2));
    }

    private final hy.m<qt.d> g(final k kVar, final String str, p pVar) {
        hy.m o11 = pVar.a(kVar).o(new ky.h() { // from class: gu.i
            @Override // ky.h
            public final Object apply(Object obj) {
                return j.c(k.this, str, (yt.f) obj);
            }
        });
        kotlin.jvm.internal.s.f(o11, "routableMessageBuilder.b…n\n        )\n      )\n    }");
        return o11;
    }

    public static final qt.d h(k params, String vehicleToken, yt.f routableMessage) {
        kotlin.jvm.internal.s.g(params, "$params");
        kotlin.jvm.internal.s.g(vehicleToken, "$vehicleToken");
        b bVar = b.f28094a;
        kotlin.jvm.internal.s.f(routableMessage, "routableMessage");
        return new qt.d(bVar.a(params, routableMessage, vehicleToken), null, null, null, 14, null);
    }

    public final hy.m<a> d(final k params, String vehicleToken, p routableMessageBuilder) {
        kotlin.jvm.internal.s.g(params, "params");
        kotlin.jvm.internal.s.g(vehicleToken, "vehicleToken");
        kotlin.jvm.internal.s.g(routableMessageBuilder, "routableMessageBuilder");
        hy.m<a> q11 = g(params, vehicleToken, routableMessageBuilder).o(new ky.h() { // from class: gu.g
            @Override // ky.h
            public final Object apply(Object obj) {
                return j.a(k.this, (qt.d) obj);
            }
        }).q(new ky.h() { // from class: gu.h
            @Override // ky.h
            public final Object apply(Object obj) {
                return j.b(k.this, (Throwable) obj);
            }
        });
        kotlin.jvm.internal.s.f(q11, "buildMessage(\n        pa…        )\n        )\n    }");
        return q11;
    }
}