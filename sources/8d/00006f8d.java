package g3;

import f3.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i {
    public static o a(f3.e eVar, int i11, ArrayList<o> arrayList, o oVar) {
        int i12;
        int r12;
        if (i11 == 0) {
            i12 = eVar.f25743u0;
        } else {
            i12 = eVar.f25745v0;
        }
        if (i12 != -1 && (oVar == null || i12 != oVar.f27536b)) {
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i13);
                if (oVar2.c() == i12) {
                    if (oVar != null) {
                        oVar.g(i11, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i13++;
                }
            }
        } else if (i12 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof f3.i) && (r12 = ((f3.i) eVar).r1(i11)) != -1) {
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i14);
                    if (oVar3.c() == r12) {
                        oVar = oVar3;
                        break;
                    }
                    i14++;
                }
            }
            if (oVar == null) {
                oVar = new o(i11);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof f3.g) {
                f3.g gVar = (f3.g) eVar;
                gVar.q1().b(gVar.r1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i11 == 0) {
                eVar.f25743u0 = oVar.c();
                eVar.M.b(i11, arrayList, oVar);
                eVar.O.b(i11, arrayList, oVar);
            } else {
                eVar.f25745v0 = oVar.c();
                eVar.N.b(i11, arrayList, oVar);
                eVar.Q.b(i11, arrayList, oVar);
                eVar.P.b(i11, arrayList, oVar);
            }
            eVar.T.b(i11, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i11) {
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            o oVar = arrayList.get(i12);
            if (i11 == oVar.f27536b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0390 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(f3.f r16, g3.b.InterfaceC0524b r17) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.i.c(f3.f, g3.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}