package y0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public static final u0 f58666a = new u0();

    private u0() {
    }

    public final t0 a(long j11, long j12, long j13, c1.i iVar, int i11, int i12) {
        iVar.x(-1165740135);
        long l11 = (i12 & 1) != 0 ? h0.f58131a.a(iVar, 6).l() : j11;
        long l12 = (i12 & 2) != 0 ? t1.a0.l(h0.f58131a.a(iVar, 6).i(), 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j12;
        long l13 = (i12 & 4) != 0 ? t1.a0.l(h0.f58131a.a(iVar, 6).i(), n.f58482a.b(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j13;
        t1.a0 h11 = t1.a0.h(l11);
        t1.a0 h12 = t1.a0.h(l12);
        t1.a0 h13 = t1.a0.h(l13);
        iVar.x(-3686095);
        boolean O = iVar.O(h11) | iVar.O(h12) | iVar.O(h13);
        Object y11 = iVar.y();
        if (O || y11 == c1.i.f8486a.a()) {
            y11 = new u(l11, l12, l13, null);
            iVar.p(y11);
        }
        iVar.N();
        u uVar = (u) y11;
        iVar.N();
        return uVar;
    }
}