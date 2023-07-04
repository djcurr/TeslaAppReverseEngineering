package f8;

import g8.c;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26076a = c.a.a("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c8.o a(g8.c cVar, v7.d dVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z11 = false;
        while (cVar.p()) {
            int p02 = cVar.p0(f26076a);
            if (p02 == 0) {
                str = cVar.R();
            } else if (p02 == 1) {
                z11 = cVar.C();
            } else if (p02 != 2) {
                cVar.u0();
            } else {
                cVar.g();
                while (cVar.p()) {
                    c8.c a11 = h.a(cVar, dVar);
                    if (a11 != null) {
                        arrayList.add(a11);
                    }
                }
                cVar.l();
            }
        }
        return new c8.o(str, arrayList, z11);
    }
}