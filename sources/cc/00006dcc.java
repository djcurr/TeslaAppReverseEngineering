package f8;

import android.graphics.PointF;
import g8.c;

/* loaded from: classes.dex */
class f {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26067a = c.a.a("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c8.b a(g8.c cVar, v7.d dVar, int i11) {
        boolean z11 = i11 == 3;
        boolean z12 = false;
        String str = null;
        b8.m<PointF, PointF> mVar = null;
        b8.f fVar = null;
        while (cVar.p()) {
            int p02 = cVar.p0(f26067a);
            if (p02 == 0) {
                str = cVar.R();
            } else if (p02 == 1) {
                mVar = a.b(cVar, dVar);
            } else if (p02 == 2) {
                fVar = d.i(cVar, dVar);
            } else if (p02 == 3) {
                z12 = cVar.C();
            } else if (p02 != 4) {
                cVar.t0();
                cVar.u0();
            } else {
                z11 = cVar.J() == 3;
            }
        }
        return new c8.b(str, mVar, fVar, z11, z12);
    }
}