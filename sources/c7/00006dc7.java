package f8;

import android.graphics.PointF;
import c8.j;
import g8.c;

/* loaded from: classes.dex */
class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26062a = c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c8.j a(g8.c cVar, v7.d dVar) {
        boolean z11 = false;
        String str = null;
        j.a aVar = null;
        b8.b bVar = null;
        b8.m<PointF, PointF> mVar = null;
        b8.b bVar2 = null;
        b8.b bVar3 = null;
        b8.b bVar4 = null;
        b8.b bVar5 = null;
        b8.b bVar6 = null;
        while (cVar.p()) {
            switch (cVar.p0(f26062a)) {
                case 0:
                    str = cVar.R();
                    break;
                case 1:
                    aVar = j.a.forValue(cVar.J());
                    break;
                case 2:
                    bVar = d.f(cVar, dVar, false);
                    break;
                case 3:
                    mVar = a.b(cVar, dVar);
                    break;
                case 4:
                    bVar2 = d.f(cVar, dVar, false);
                    break;
                case 5:
                    bVar4 = d.e(cVar, dVar);
                    break;
                case 6:
                    bVar6 = d.f(cVar, dVar, false);
                    break;
                case 7:
                    bVar3 = d.e(cVar, dVar);
                    break;
                case 8:
                    bVar5 = d.f(cVar, dVar, false);
                    break;
                case 9:
                    z11 = cVar.C();
                    break;
                default:
                    cVar.t0();
                    cVar.u0();
                    break;
            }
        }
        return new c8.j(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z11);
    }
}