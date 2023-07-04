package w;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.impl.d1;

/* loaded from: classes.dex */
public class b implements d1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(u.d dVar) {
        Integer num = (Integer) dVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2 && Build.VERSION.SDK_INT == 21;
    }

    public int a() {
        return 2;
    }
}