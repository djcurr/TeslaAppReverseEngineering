package f8;

import g8.c;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26057a = c.a.a("a");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f26058b = c.a.a("fc", "sc", "sw", "t");

    public static b8.k a(g8.c cVar, v7.d dVar) {
        cVar.j();
        b8.k kVar = null;
        while (cVar.p()) {
            if (cVar.p0(f26057a) != 0) {
                cVar.t0();
                cVar.u0();
            } else {
                kVar = b(cVar, dVar);
            }
        }
        cVar.m();
        return kVar == null ? new b8.k(null, null, null, null) : kVar;
    }

    private static b8.k b(g8.c cVar, v7.d dVar) {
        cVar.j();
        b8.a aVar = null;
        b8.a aVar2 = null;
        b8.b bVar = null;
        b8.b bVar2 = null;
        while (cVar.p()) {
            int p02 = cVar.p0(f26058b);
            if (p02 == 0) {
                aVar = d.c(cVar, dVar);
            } else if (p02 == 1) {
                aVar2 = d.c(cVar, dVar);
            } else if (p02 == 2) {
                bVar = d.e(cVar, dVar);
            } else if (p02 != 3) {
                cVar.t0();
                cVar.u0();
            } else {
                bVar2 = d.e(cVar, dVar);
            }
        }
        cVar.m();
        return new b8.k(aVar, aVar2, bVar, bVar2);
    }
}