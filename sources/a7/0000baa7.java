package w;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
class c implements f0.f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(u.d dVar) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-N920") && ((Integer) dVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}