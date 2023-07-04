package f8;

import android.graphics.PointF;
import g8.c;

/* loaded from: classes.dex */
class d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26063a = c.a.a("nm", "p", "s", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c8.k a(g8.c cVar, v7.d dVar) {
        String str = null;
        b8.m<PointF, PointF> mVar = null;
        b8.f fVar = null;
        b8.b bVar = null;
        boolean z11 = false;
        while (cVar.p()) {
            int p02 = cVar.p0(f26063a);
            if (p02 == 0) {
                str = cVar.R();
            } else if (p02 == 1) {
                mVar = a.b(cVar, dVar);
            } else if (p02 == 2) {
                fVar = d.i(cVar, dVar);
            } else if (p02 == 3) {
                bVar = d.e(cVar, dVar);
            } else if (p02 != 4) {
                cVar.u0();
            } else {
                z11 = cVar.C();
            }
        }
        return new c8.k(str, mVar, fVar, bVar, z11);
    }
}