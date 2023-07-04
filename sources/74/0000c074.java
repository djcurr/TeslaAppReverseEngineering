package y0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class g0 {
    private static final float a(long j11, long j12, long j13) {
        float f11 = 0.4f;
        float f12 = 0.2f;
        float f13 = 0.4f;
        for (int i11 = 0; i11 < 7; i11++) {
            float c11 = (c(j11, f11, j12, j13) / 4.5f) - 1.0f;
            if (BitmapDescriptorFactory.HUE_RED <= c11 && c11 <= 0.01f) {
                break;
            }
            if (c11 < BitmapDescriptorFactory.HUE_RED) {
                f13 = f11;
            } else {
                f12 = f11;
            }
            f11 = (f13 + f12) / 2.0f;
        }
        return f11;
    }

    public static final float b(long j11, long j12) {
        float h11 = t1.c0.h(j11) + 0.05f;
        float h12 = t1.c0.h(j12) + 0.05f;
        return Math.max(h11, h12) / Math.min(h11, h12);
    }

    private static final float c(long j11, float f11, long j12, long j13) {
        long e11 = t1.c0.e(t1.a0.l(j11, f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j13);
        return b(t1.c0.e(j12, e11), e11);
    }

    public static final long d(long j11, long j12, long j13) {
        float a11;
        float c11 = c(j11, 0.4f, j12, j13);
        float c12 = c(j11, 0.2f, j12, j13);
        if (c11 >= 4.5f) {
            a11 = 0.4f;
        } else {
            a11 = c12 < 4.5f ? 0.2f : a(j11, j12, j13);
        }
        return t1.a0.l(j11, a11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
    }

    public static final x0.x e(l colors, c1.i iVar, int i11) {
        kotlin.jvm.internal.s.g(colors, "colors");
        iVar.x(35572393);
        long j11 = colors.j();
        long c11 = colors.c();
        iVar.x(35572910);
        long a11 = m.a(colors, c11);
        if (!(a11 != t1.a0.f51365b.f())) {
            a11 = ((t1.a0) iVar.A(p.a())).v();
        }
        iVar.N();
        long l11 = t1.a0.l(a11, n.f58482a.d(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        t1.a0 h11 = t1.a0.h(j11);
        t1.a0 h12 = t1.a0.h(c11);
        t1.a0 h13 = t1.a0.h(l11);
        iVar.x(-3686095);
        boolean O = iVar.O(h11) | iVar.O(h12) | iVar.O(h13);
        Object y11 = iVar.y();
        if (O || y11 == c1.i.f8486a.a()) {
            y11 = new x0.x(colors.j(), d(j11, l11, c11), null);
            iVar.p(y11);
        }
        iVar.N();
        x0.x xVar = (x0.x) y11;
        iVar.N();
        return xVar;
    }
}