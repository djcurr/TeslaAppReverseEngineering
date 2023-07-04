package f3;

import f3.e;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f25760a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(f fVar, a3.d dVar, e eVar) {
        eVar.f25736r = -1;
        eVar.f25738s = -1;
        e.b bVar = fVar.X[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.X[0] == e.b.MATCH_PARENT) {
            int i11 = eVar.M.f25697g;
            int W = fVar.W() - eVar.O.f25697g;
            d dVar2 = eVar.M;
            dVar2.f25699i = dVar.q(dVar2);
            d dVar3 = eVar.O;
            dVar3.f25699i = dVar.q(dVar3);
            dVar.f(eVar.M.f25699i, i11);
            dVar.f(eVar.O.f25699i, W);
            eVar.f25736r = 2;
            eVar.N0(i11, W);
        }
        if (fVar.X[1] == bVar2 || eVar.X[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i12 = eVar.N.f25697g;
        int v11 = fVar.v() - eVar.P.f25697g;
        d dVar4 = eVar.N;
        dVar4.f25699i = dVar.q(dVar4);
        d dVar5 = eVar.P;
        dVar5.f25699i = dVar.q(dVar5);
        dVar.f(eVar.N.f25699i, i12);
        dVar.f(eVar.P.f25699i, v11);
        if (eVar.f25713f0 > 0 || eVar.V() == 8) {
            d dVar6 = eVar.Q;
            dVar6.f25699i = dVar.q(dVar6);
            dVar.f(eVar.Q.f25699i, eVar.f25713f0 + i12);
        }
        eVar.f25738s = 2;
        eVar.e1(i12, v11);
    }

    public static final boolean b(int i11, int i12) {
        return (i11 & i12) == i12;
    }
}