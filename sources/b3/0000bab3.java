package w;

import android.os.Build;
import androidx.camera.core.impl.d1;
import java.util.Locale;

/* loaded from: classes.dex */
public class o implements d1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}