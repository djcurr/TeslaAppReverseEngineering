package f8;

import g8.c;

/* loaded from: classes.dex */
class j0 {

    /* renamed from: a  reason: collision with root package name */
    static c.a f26082a = c.a.a("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c8.p a(g8.c cVar, v7.d dVar) {
        int i11 = 0;
        String str = null;
        b8.h hVar = null;
        boolean z11 = false;
        while (cVar.p()) {
            int p02 = cVar.p0(f26082a);
            if (p02 == 0) {
                str = cVar.R();
            } else if (p02 == 1) {
                i11 = cVar.J();
            } else if (p02 == 2) {
                hVar = d.k(cVar, dVar);
            } else if (p02 != 3) {
                cVar.u0();
            } else {
                z11 = cVar.C();
            }
        }
        return new c8.p(str, i11, hVar, z11);
    }
}