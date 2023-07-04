package f8;

import c8.q;
import g8.c;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26100a = c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f26101b = c.a.a("p", "k");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f26102c = c.a.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c8.f a(g8.c cVar, v7.d dVar) {
        b8.c cVar2;
        ArrayList arrayList = new ArrayList();
        float f11 = 0.0f;
        String str = null;
        c8.g gVar = null;
        b8.c cVar3 = null;
        b8.f fVar = null;
        b8.f fVar2 = null;
        b8.b bVar = null;
        q.b bVar2 = null;
        q.c cVar4 = null;
        b8.b bVar3 = null;
        boolean z11 = false;
        b8.d dVar2 = null;
        while (cVar.p()) {
            switch (cVar.p0(f26100a)) {
                case 0:
                    str = cVar.R();
                    break;
                case 1:
                    int i11 = -1;
                    cVar.j();
                    while (cVar.p()) {
                        int p02 = cVar.p0(f26101b);
                        if (p02 != 0) {
                            cVar2 = cVar3;
                            if (p02 != 1) {
                                cVar.t0();
                                cVar.u0();
                            } else {
                                cVar3 = d.g(cVar, dVar, i11);
                            }
                        } else {
                            cVar2 = cVar3;
                            i11 = cVar.J();
                        }
                        cVar3 = cVar2;
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
                    bVar = d.e(cVar, dVar);
                    break;
                case 7:
                    bVar2 = q.b.values()[cVar.J() - 1];
                    break;
                case 8:
                    cVar4 = q.c.values()[cVar.J() - 1];
                    break;
                case 9:
                    f11 = (float) cVar.D();
                    break;
                case 10:
                    z11 = cVar.C();
                    break;
                case 11:
                    cVar.g();
                    while (cVar.p()) {
                        cVar.j();
                        String str2 = null;
                        b8.b bVar4 = null;
                        while (cVar.p()) {
                            int p03 = cVar.p0(f26102c);
                            if (p03 != 0) {
                                b8.b bVar5 = bVar3;
                                if (p03 != 1) {
                                    cVar.t0();
                                    cVar.u0();
                                } else {
                                    bVar4 = d.e(cVar, dVar);
                                }
                                bVar3 = bVar5;
                            } else {
                                str2 = cVar.R();
                            }
                        }
                        b8.b bVar6 = bVar3;
                        cVar.m();
                        if (str2.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                dVar.u(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar6;
                        }
                    }
                    b8.b bVar7 = bVar3;
                    cVar.l();
                    if (arrayList.size() == 1) {
                        arrayList.add((b8.b) arrayList.get(0));
                    }
                    bVar3 = bVar7;
                    break;
                default:
                    cVar.t0();
                    cVar.u0();
                    break;
            }
        }
        if (dVar2 == null) {
            dVar2 = new b8.d(Collections.singletonList(new i8.a(100)));
        }
        return new c8.f(str, gVar, cVar3, dVar2, fVar, fVar2, bVar, bVar2, cVar4, f11, arrayList, bVar3, z11);
    }
}