package gf;

import android.os.Build;
import qf.t;

/* loaded from: classes3.dex */
public class g {
    public static f a(t tVar, com.facebook.imagepipeline.platform.d dVar, jf.a aVar) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21) {
            return new a(tVar.b(), aVar);
        }
        if (i11 >= 11) {
            return new e(new b(tVar.h()), dVar, aVar);
        }
        return new c();
    }
}