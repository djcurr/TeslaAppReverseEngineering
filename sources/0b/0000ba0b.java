package vf;

import android.graphics.Bitmap;
import android.os.Build;

/* loaded from: classes3.dex */
public final class b {
    public static boolean a(a aVar, qd.a<Bitmap> aVar2) {
        if (aVar == null || aVar2 == null) {
            return false;
        }
        Bitmap J = aVar2.J();
        if (Build.VERSION.SDK_INT >= 12 && aVar.b()) {
            J.setHasAlpha(true);
        }
        aVar.a(J);
        return true;
    }
}