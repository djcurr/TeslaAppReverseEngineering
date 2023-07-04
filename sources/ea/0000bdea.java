package x;

import androidx.camera.core.impl.p0;
import w.l;
import w.n;

/* loaded from: classes.dex */
public class g {
    public int a(p0 p0Var, String str, u.d dVar) {
        n nVar = (n) w.f.a(n.class);
        if (nVar == null || !nVar.b(p0Var)) {
            l lVar = (l) w.f.a(l.class);
            if (lVar != null) {
                return lVar.a();
            }
            w.b bVar = (w.b) w.d.a(str, dVar).b(w.b.class);
            if (bVar != null) {
                return bVar.a();
            }
            return 3;
        }
        return 1;
    }
}