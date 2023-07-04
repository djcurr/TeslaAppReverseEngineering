package zc;

import bc.l;
import hc.n;
import java.util.Set;

/* loaded from: classes.dex */
public class g extends n {
    public g(cc.e eVar, cc.b bVar) {
        super(eVar, bVar);
    }

    @Override // hc.n, yb.b
    public boolean l(int i11, Set<Integer> set, int i12, bc.i iVar, int i13, int i14) {
        if (i13 == 700) {
            new ed.c().f(iVar.c(i11, i14), this.f7623d);
            return true;
        } else if (i13 == 34377) {
            new f().c(new l(iVar.c(i11, i14)), i14, this.f7623d);
            return true;
        } else if (i13 != 34675) {
            return super.l(i11, set, i12, iVar, i13, i14);
        } else {
            new lc.c().c(new bc.a(iVar.c(i11, i14)), this.f7623d);
            return true;
        }
    }
}