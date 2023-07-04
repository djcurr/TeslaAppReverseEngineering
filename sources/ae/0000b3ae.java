package t;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;

/* loaded from: classes.dex */
public final class w0 {
    public static CameraUnavailableException a(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int b11 = cameraAccessExceptionCompat.b();
        int i11 = 5;
        if (b11 == 1) {
            i11 = 1;
        } else if (b11 == 2) {
            i11 = 2;
        } else if (b11 == 3) {
            i11 = 3;
        } else if (b11 == 4) {
            i11 = 4;
        } else if (b11 != 5) {
            i11 = b11 != 10001 ? 0 : 6;
        }
        return new CameraUnavailableException(i11, cameraAccessExceptionCompat);
    }
}