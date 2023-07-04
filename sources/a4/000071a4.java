package h0;

import android.os.Build;
import androidx.camera.core.impl.d1;

/* loaded from: classes.dex */
public class d implements d1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return "SAMSUNG".equals(Build.MANUFACTURER.toUpperCase()) && "F2Q".equals(Build.DEVICE.toUpperCase());
    }
}