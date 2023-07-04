package y0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f58147a = new j();

    private j() {
    }

    public final i a(long j11, long j12, long j13, long j14, long j15, c1.i iVar, int i11, int i12) {
        iVar.x(-533071488);
        long l11 = (i12 & 1) != 0 ? h0.f58131a.a(iVar, 6).l() : j11;
        long l12 = (i12 & 2) != 0 ? t1.a0.l(h0.f58131a.a(iVar, 6).i(), 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j12;
        long n11 = (i12 & 4) != 0 ? h0.f58131a.a(iVar, 6).n() : j13;
        long l13 = (i12 & 8) != 0 ? t1.a0.l(h0.f58131a.a(iVar, 6).i(), n.f58482a.b(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j14;
        long l14 = (i12 & 16) != 0 ? t1.a0.l(l11, n.f58482a.b(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j15;
        int i13 = 0;
        Object[] objArr = {t1.a0.h(l11), t1.a0.h(l12), t1.a0.h(n11), t1.a0.h(l13), t1.a0.h(l14)};
        iVar.x(-3685570);
        boolean z11 = false;
        while (i13 < 5) {
            Object obj = objArr[i13];
            i13++;
            z11 |= iVar.O(obj);
        }
        Object y11 = iVar.y();
        if (z11 || y11 == c1.i.f8486a.a()) {
            y11 = new s(n11, t1.a0.l(n11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), l11, t1.a0.l(l11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), l13, t1.a0.l(l13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), l14, l11, l12, l13, l14, null);
            iVar.p(y11);
        }
        iVar.N();
        s sVar = (s) y11;
        iVar.N();
        return sVar;
    }
}