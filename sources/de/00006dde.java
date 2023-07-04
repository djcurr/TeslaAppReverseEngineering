package f8;

import android.graphics.Path;
import g8.c;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26098a = c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f26099b = c.a.a("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c8.e a(g8.c cVar, v7.d dVar) {
        b8.d dVar2 = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        c8.g gVar = null;
        b8.c cVar2 = null;
        b8.f fVar = null;
        b8.f fVar2 = null;
        boolean z11 = false;
        while (cVar.p()) {
            switch (cVar.p0(f26098a)) {
                case 0:
                    str = cVar.R();
                    break;
                case 1:
                    int i11 = -1;
                    cVar.j();
                    while (cVar.p()) {
                        int p02 = cVar.p0(f26099b);
                        if (p02 == 0) {
                            i11 = cVar.J();
                        } else if (p02 != 1) {
                            cVar.t0();
                            cVar.u0();
                        } else {
                            cVar2 = d.g(cVar, dVar, i11);
                        }
                    }
                    cVar.m();
                    break;
                case 2:
                    dVar2 = d.h(cVar, dVar);
                    break;
                case 3:
                    gVar = cVar.J() == 1 ? c8.g.LINEAR : c8.g.RADIAL;
                    break;
                case 4:
                    fVar = d.i(cVar, dVar);
                    break;
                case 5:
                    fVar2 = d.i(cVar, dVar);
                    break;
                case 6:
                    fillType = cVar.J() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z11 = cVar.C();
                    break;
                default:
                    cVar.t0();
                    cVar.u0();
                    break;
            }
        }
        return new c8.e(str, gVar, fillType, cVar2, dVar2 == null ? new b8.d(Collections.singletonList(new i8.a(100))) : dVar2, fVar, fVar2, null, null, z11);
    }
}