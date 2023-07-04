package d2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class n {
    public static final boolean a(u uVar) {
        kotlin.jvm.internal.s.g(uVar, "<this>");
        return (uVar.e().a() || uVar.k() || !uVar.i()) ? false : true;
    }

    public static final boolean b(u uVar) {
        kotlin.jvm.internal.s.g(uVar, "<this>");
        return !uVar.k() && uVar.i();
    }

    public static final boolean c(u uVar) {
        kotlin.jvm.internal.s.g(uVar, "<this>");
        return (uVar.e().a() || !uVar.k() || uVar.i()) ? false : true;
    }

    public static final boolean d(u uVar) {
        kotlin.jvm.internal.s.g(uVar, "<this>");
        return uVar.k() && !uVar.i();
    }

    public static final void e(u uVar) {
        kotlin.jvm.internal.s.g(uVar, "<this>");
        f(uVar);
        g(uVar);
    }

    public static final void f(u uVar) {
        kotlin.jvm.internal.s.g(uVar, "<this>");
        if (uVar.i() != uVar.k()) {
            uVar.e().c(true);
        }
    }

    public static final void g(u uVar) {
        kotlin.jvm.internal.s.g(uVar, "<this>");
        if (s1.f.j(j(uVar), s1.f.f49950b.c())) {
            return;
        }
        uVar.e().d(true);
    }

    public static final boolean h(u isOutOfBounds, long j11) {
        kotlin.jvm.internal.s.g(isOutOfBounds, "$this$isOutOfBounds");
        long h11 = isOutOfBounds.h();
        float l11 = s1.f.l(h11);
        float m11 = s1.f.m(h11);
        return l11 < BitmapDescriptorFactory.HUE_RED || l11 > ((float) x2.o.g(j11)) || m11 < BitmapDescriptorFactory.HUE_RED || m11 > ((float) x2.o.f(j11));
    }

    public static final boolean i(u isOutOfBounds, long j11, long j12) {
        kotlin.jvm.internal.s.g(isOutOfBounds, "$this$isOutOfBounds");
        if (!e0.g(isOutOfBounds.m(), e0.f23301a.d())) {
            return h(isOutOfBounds, j11);
        }
        long h11 = isOutOfBounds.h();
        float l11 = s1.f.l(h11);
        float m11 = s1.f.m(h11);
        return l11 < (-s1.l.i(j12)) || l11 > ((float) x2.o.g(j11)) + s1.l.i(j12) || m11 < (-s1.l.g(j12)) || m11 > ((float) x2.o.f(j11)) + s1.l.g(j12);
    }

    public static final long j(u uVar) {
        kotlin.jvm.internal.s.g(uVar, "<this>");
        return m(uVar, false);
    }

    public static final boolean k(u uVar) {
        kotlin.jvm.internal.s.g(uVar, "<this>");
        return uVar.e().b();
    }

    public static final long l(u uVar) {
        kotlin.jvm.internal.s.g(uVar, "<this>");
        return m(uVar, true);
    }

    private static final long m(u uVar, boolean z11) {
        long p11 = s1.f.p(uVar.h(), uVar.j());
        return (z11 || !uVar.e().b()) ? p11 : s1.f.f49950b.c();
    }

    public static final boolean n(u uVar) {
        kotlin.jvm.internal.s.g(uVar, "<this>");
        return !s1.f.j(m(uVar, true), s1.f.f49950b.c());
    }
}