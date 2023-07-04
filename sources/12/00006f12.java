package g0;

import androidx.camera.core.g0;
import androidx.camera.core.impl.a0;
import f0.c;

/* loaded from: classes.dex */
public class a {
    public boolean a() {
        c cVar = (c) f0.a.a(c.class);
        if (cVar != null) {
            return cVar.c(a0.f2255g);
        }
        return true;
    }

    public boolean b(g0 g0Var) {
        c cVar = (c) f0.a.a(c.class);
        return (cVar == null || cVar.c(a0.f2255g)) && g0Var.getFormat() == 256;
    }
}