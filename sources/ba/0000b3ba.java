package t0;

import s1.h;
import vz.b0;

/* loaded from: classes.dex */
public interface b {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ Object a(b bVar, h hVar, zz.d dVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    hVar = null;
                }
                return bVar.a(hVar, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
    }

    Object a(h hVar, zz.d<? super b0> dVar);
}