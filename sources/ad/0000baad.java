package w;

import android.os.Build;
import androidx.camera.core.impl.d1;

/* loaded from: classes.dex */
public class i implements d1 {
    private static boolean a() {
        return "Google".equals(Build.MANUFACTURER) && "Pixel 2".equals(Build.MODEL);
    }

    private static boolean b() {
        return "Google".equals(Build.MANUFACTURER) && "Pixel 3".equals(Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return (a() || b()) && Build.VERSION.SDK_INT >= 26;
    }
}