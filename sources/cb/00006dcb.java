package f8;

import g8.c;

/* loaded from: classes.dex */
class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26066a = c.a.a("nm", cg.c.f9084i, "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c8.l a(g8.c cVar, v7.d dVar) {
        boolean z11 = false;
        String str = null;
        b8.b bVar = null;
        b8.b bVar2 = null;
        b8.l lVar = null;
        while (cVar.p()) {
            int p02 = cVar.p0(f26066a);
            if (p02 == 0) {
                str = cVar.R();
            } else if (p02 == 1) {
                bVar = d.f(cVar, dVar, false);
            } else if (p02 == 2) {
                bVar2 = d.f(cVar, dVar, false);
            } else if (p02 == 3) {
                lVar = c.g(cVar, dVar);
            } else if (p02 != 4) {
                cVar.u0();
            } else {
                z11 = cVar.C();
            }
        }
        return new c8.l(str, bVar, bVar2, lVar, z11);
    }
}