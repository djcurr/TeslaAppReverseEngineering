package f8;

import android.graphics.PointF;
import g8.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26055a = c.a.a("k", "x", "y");

    public static b8.e a(g8.c cVar, v7.d dVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.e0() == c.b.BEGIN_ARRAY) {
            cVar.g();
            while (cVar.p()) {
                arrayList.add(z.a(cVar, dVar));
            }
            cVar.l();
            u.b(arrayList);
        } else {
            arrayList.add(new i8.a(s.e(cVar, h8.h.e())));
        }
        return new b8.e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b8.m<PointF, PointF> b(g8.c cVar, v7.d dVar) {
        cVar.j();
        b8.e eVar = null;
        b8.b bVar = null;
        boolean z11 = false;
        b8.b bVar2 = null;
        while (cVar.e0() != c.b.END_OBJECT) {
            int p02 = cVar.p0(f26055a);
            if (p02 == 0) {
                eVar = a(cVar, dVar);
            } else if (p02 != 1) {
                if (p02 != 2) {
                    cVar.t0();
                    cVar.u0();
                } else if (cVar.e0() == c.b.STRING) {
                    cVar.u0();
                    z11 = true;
                } else {
                    bVar = d.e(cVar, dVar);
                }
            } else if (cVar.e0() == c.b.STRING) {
                cVar.u0();
                z11 = true;
            } else {
                bVar2 = d.e(cVar, dVar);
            }
        }
        cVar.m();
        if (z11) {
            dVar.a("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new b8.i(bVar2, bVar);
    }
}