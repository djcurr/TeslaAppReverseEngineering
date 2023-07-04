package f0;

import android.os.Build;
import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.d0;
import androidx.camera.core.impl.d1;

/* loaded from: classes.dex */
public final class c implements d1 {
    private static boolean a() {
        return "HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL);
    }

    private static boolean b() {
        return "HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean d() {
        return b() || a();
    }

    public boolean c(d0.a<?> aVar) {
        return aVar != a0.f2255g;
    }
}