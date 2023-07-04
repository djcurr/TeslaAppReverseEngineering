package h0;

import android.os.Build;
import androidx.camera.core.impl.d1;

/* loaded from: classes.dex */
public class c implements d1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        String str = Build.DEVICE;
        return ("ON5XELTE".equals(str.toUpperCase()) && Build.VERSION.SDK_INT >= 26) || "A3Y17LTE".equals(str.toUpperCase());
    }

    public float a() {
        return 0.75f;
    }
}