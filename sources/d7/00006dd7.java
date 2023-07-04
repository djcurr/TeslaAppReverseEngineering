package f8;

import c8.q;
import g8.c;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26090a = c.a.a("nm", cg.c.f9084i, "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f26091b = c.a.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static c8.q a(g8.c cVar, v7.d dVar) {
        char c11;
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        float f11 = 0.0f;
        String str = null;
        b8.b bVar = null;
        b8.a aVar = null;
        b8.b bVar2 = null;
        q.b bVar3 = null;
        q.c cVar2 = null;
        b8.d dVar2 = null;
        while (cVar.p()) {
            switch (cVar.p0(f26090a)) {
                case 0:
                    str = cVar.R();
                    break;
                case 1:
                    aVar = d.c(cVar, dVar);
                    break;
                case 2:
                    bVar2 = d.e(cVar, dVar);
                    break;
                case 3:
                    dVar2 = d.h(cVar, dVar);
                    break;
                case 4:
                    bVar3 = q.b.values()[cVar.J() - 1];
                    break;
                case 5:
                    cVar2 = q.c.values()[cVar.J() - 1];
                    break;
                case 6:
                    f11 = (float) cVar.D();
                    break;
                case 7:
                    z11 = cVar.C();
                    break;
                case 8:
                    cVar.g();
                    while (cVar.p()) {
                        cVar.j();
                        String str2 = null;
                        b8.b bVar4 = null;
                        while (cVar.p()) {
                            int p02 = cVar.p0(f26091b);
                            if (p02 == 0) {
                                str2 = cVar.R();
                            } else if (p02 != 1) {
                                cVar.t0();
                                cVar.u0();
                            } else {
                                bVar4 = d.e(cVar, dVar);
                            }
                        }
                        cVar.m();
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c11 = 0;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                            case 1:
                                dVar.u(true);
                                arrayList.add(bVar4);
                                break;
                            case 2:
                                bVar = bVar4;
                                break;
                        }
                    }
                    cVar.l();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((b8.b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    cVar.u0();
                    break;
            }
        }
        if (dVar2 == null) {
            dVar2 = new b8.d(Collections.singletonList(new i8.a(100)));
        }
        return new c8.q(str, bVar, arrayList, aVar, dVar2, bVar2, bVar3, cVar2, f11, z11);
    }
}