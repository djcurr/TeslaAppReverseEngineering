package f8;

import android.graphics.Path;
import g8.c;
import java.util.Collections;

/* loaded from: classes.dex */
class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26073a = c.a.a("nm", cg.c.f9084i, "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c8.n a(g8.c cVar, v7.d dVar) {
        b8.d dVar2 = null;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 1;
        String str = null;
        b8.a aVar = null;
        while (cVar.p()) {
            int p02 = cVar.p0(f26073a);
            if (p02 == 0) {
                str = cVar.R();
            } else if (p02 == 1) {
                aVar = d.c(cVar, dVar);
            } else if (p02 == 2) {
                dVar2 = d.h(cVar, dVar);
            } else if (p02 == 3) {
                z11 = cVar.C();
            } else if (p02 == 4) {
                i11 = cVar.J();
            } else if (p02 != 5) {
                cVar.t0();
                cVar.u0();
            } else {
                z12 = cVar.C();
            }
        }
        return new c8.n(str, z11, i11 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar2 == null ? new b8.d(Collections.singletonList(new i8.a(100))) : dVar2, z12);
    }
}