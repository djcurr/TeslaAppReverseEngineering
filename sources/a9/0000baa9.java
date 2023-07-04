package w;

import android.os.Build;
import androidx.camera.core.impl.d1;

/* loaded from: classes.dex */
public class e implements d1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return "SAMSUNG".equals(Build.MANUFACTURER.toUpperCase()) && Build.MODEL.toUpperCase().startsWith("SM-A300");
    }
}