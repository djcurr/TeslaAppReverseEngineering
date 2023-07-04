package f8;

import c8.i;
import g8.c;

/* loaded from: classes.dex */
class y {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26119a = c.a.a("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c8.i a(g8.c cVar) {
        String str = null;
        boolean z11 = false;
        i.a aVar = null;
        while (cVar.p()) {
            int p02 = cVar.p0(f26119a);
            if (p02 == 0) {
                str = cVar.R();
            } else if (p02 == 1) {
                aVar = i.a.forId(cVar.J());
            } else if (p02 != 2) {
                cVar.t0();
                cVar.u0();
            } else {
                z11 = cVar.C();
            }
        }
        return new c8.i(str, aVar, z11);
    }
}