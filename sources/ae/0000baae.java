package w;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class j implements f0.f {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f54793a = Arrays.asList("SM-G9300", "SM-G930R", "SM-G930A", "SM-G930V", "SM-G930T", "SM-G930U", "SM-G930P", "SM-SC02H", "SM-SCV33", "SM-G9350", "SM-G935R", "SM-G935A", "SM-G935V", "SM-G935T", "SM-G935U", "SM-G935P");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(u.d dVar) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && f54793a.contains(Build.MODEL.toUpperCase(locale)) && ((Integer) dVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}