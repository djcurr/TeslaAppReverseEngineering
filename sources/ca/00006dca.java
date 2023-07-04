package f8;

import g8.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26064a = c.a.a("ef");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f26065b = c.a.a("ty", "v");

    private static c8.a a(g8.c cVar, v7.d dVar) {
        cVar.j();
        c8.a aVar = null;
        while (true) {
            boolean z11 = false;
            while (cVar.p()) {
                int p02 = cVar.p0(f26065b);
                if (p02 != 0) {
                    if (p02 != 1) {
                        cVar.t0();
                        cVar.u0();
                    } else if (z11) {
                        aVar = new c8.a(d.e(cVar, dVar));
                    } else {
                        cVar.u0();
                    }
                } else if (cVar.J() == 0) {
                    z11 = true;
                }
            }
            cVar.m();
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c8.a b(g8.c cVar, v7.d dVar) {
        c8.a aVar = null;
        while (cVar.p()) {
            if (cVar.p0(f26064a) != 0) {
                cVar.t0();
                cVar.u0();
            } else {
                cVar.g();
                while (cVar.p()) {
                    c8.a a11 = a(cVar, dVar);
                    if (a11 != null) {
                        aVar = a11;
                    }
                }
                cVar.l();
            }
        }
        return aVar;
    }
}