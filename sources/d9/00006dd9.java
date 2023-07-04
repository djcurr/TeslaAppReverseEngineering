package f8;

import c8.r;
import g8.c;

/* loaded from: classes.dex */
class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26093a = c.a.a("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c8.r a(g8.c cVar, v7.d dVar) {
        boolean z11 = false;
        String str = null;
        r.a aVar = null;
        b8.b bVar = null;
        b8.b bVar2 = null;
        b8.b bVar3 = null;
        while (cVar.p()) {
            int p02 = cVar.p0(f26093a);
            if (p02 == 0) {
                bVar = d.f(cVar, dVar, false);
            } else if (p02 == 1) {
                bVar2 = d.f(cVar, dVar, false);
            } else if (p02 == 2) {
                bVar3 = d.f(cVar, dVar, false);
            } else if (p02 == 3) {
                str = cVar.R();
            } else if (p02 == 4) {
                aVar = r.a.forId(cVar.J());
            } else if (p02 != 5) {
                cVar.u0();
            } else {
                z11 = cVar.C();
            }
        }
        return new c8.r(str, aVar, bVar, bVar2, bVar3, z11);
    }
}