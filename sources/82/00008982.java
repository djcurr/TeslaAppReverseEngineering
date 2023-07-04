package n2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import t1.a1;
import t1.b1;

/* loaded from: classes.dex */
public final class t {
    public static final s a(s start, s stop, float f11) {
        kotlin.jvm.internal.s.g(start, "start");
        kotlin.jvm.internal.s.g(stop, "stop");
        long g11 = t1.c0.g(start.c(), stop.c(), f11);
        r2.e eVar = (r2.e) b(start.d(), stop.d(), f11);
        long c11 = c(start.f(), stop.f(), f11);
        r2.l i11 = start.i();
        if (i11 == null) {
            i11 = r2.l.f49091b.d();
        }
        r2.l i12 = stop.i();
        if (i12 == null) {
            i12 = r2.l.f49091b.d();
        }
        r2.l a11 = r2.m.a(i11, i12, f11);
        r2.j jVar = (r2.j) b(start.g(), stop.g(), f11);
        r2.k kVar = (r2.k) b(start.h(), stop.h(), f11);
        String str = (String) b(start.e(), stop.e(), f11);
        long c12 = c(start.j(), stop.j(), f11);
        w2.a b11 = start.b();
        float c13 = b11 == null ? w2.a.c(BitmapDescriptorFactory.HUE_RED) : b11.h();
        w2.a b12 = stop.b();
        float a12 = w2.b.a(c13, b12 == null ? w2.a.c(BitmapDescriptorFactory.HUE_RED) : b12.h(), f11);
        w2.g n11 = start.n();
        if (n11 == null) {
            n11 = w2.g.f55420c.a();
        }
        w2.g n12 = stop.n();
        if (n12 == null) {
            n12 = w2.g.f55420c.a();
        }
        w2.g a13 = w2.h.a(n11, n12, f11);
        t2.f fVar = (t2.f) b(start.k(), stop.k(), f11);
        long g12 = t1.c0.g(start.a(), stop.a(), f11);
        w2.e eVar2 = (w2.e) b(start.m(), stop.m(), f11);
        a1 l11 = start.l();
        if (l11 == null) {
            l11 = new a1(0L, 0L, BitmapDescriptorFactory.HUE_RED, 7, null);
        }
        a1 l12 = stop.l();
        if (l12 == null) {
            l12 = new a1(0L, 0L, BitmapDescriptorFactory.HUE_RED, 7, null);
        }
        return new s(g11, c11, a11, jVar, kVar, eVar, str, c12, w2.a.b(a12), a13, fVar, g12, eVar2, b1.a(l11, l12, f11), null);
    }

    public static final <T> T b(T t11, T t12, float f11) {
        return ((double) f11) < 0.5d ? t11 : t12;
    }

    public static final long c(long j11, long j12, float f11) {
        if (!x2.s.g(j11) && !x2.s.g(j12)) {
            return x2.s.h(j11, j12, f11);
        }
        return ((x2.r) b(x2.r.b(j11), x2.r.b(j12), f11)).k();
    }
}