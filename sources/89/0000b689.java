package u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Context context) {
        super(context);
    }

    @Override // u.k, u.m, u.j.b
    public CameraCharacteristics b(String str) {
        try {
            return this.f52806a.getCameraCharacteristics(str);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.c(e11);
        }
    }

    @Override // u.k, u.m, u.j.b
    public void c(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f52806a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.c(e11);
        }
    }
}