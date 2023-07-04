package k0;

import c1.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import l0.d1;
import l0.v0;
import vz.b0;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private static final v0<t1.a0> f34185a = l0.j.i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);

    public static final v1<t1.a0> a(long j11, l0.i<t1.a0> iVar, h00.l<? super t1.a0, b0> lVar, c1.i iVar2, int i11, int i12) {
        iVar2.x(-309953786);
        if ((i12 & 2) != 0) {
            iVar = f34185a;
        }
        l0.i<t1.a0> iVar3 = iVar;
        if ((i12 & 4) != 0) {
            lVar = null;
        }
        h00.l<? super t1.a0, b0> lVar2 = lVar;
        u1.c q11 = t1.a0.q(j11);
        iVar2.x(-3686930);
        boolean O = iVar2.O(q11);
        d1<t1.a0, l0.o> y11 = iVar2.y();
        if (O || y11 == c1.i.f8486a.a()) {
            y11 = g.d(t1.a0.f51365b).invoke(t1.a0.q(j11));
            iVar2.p(y11);
        }
        iVar2.N();
        v1<t1.a0> e11 = l0.c.e(t1.a0.h(j11), (d1) y11, iVar3, null, lVar2, iVar2, (i11 & 14) | 576 | (57344 & (i11 << 6)), 8);
        iVar2.N();
        return e11;
    }
}