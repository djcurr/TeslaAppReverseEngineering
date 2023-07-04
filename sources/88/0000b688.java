package u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k extends m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Context context) {
        super(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k h(Context context) {
        return new k(context);
    }

    private boolean i(Throwable th2) {
        return Build.VERSION.SDK_INT == 28 && j(th2);
    }

    private static boolean j(Throwable th2) {
        StackTraceElement[] stackTrace;
        if (!th2.getClass().equals(RuntimeException.class) || (stackTrace = th2.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    private void k(Throwable th2) {
        throw new CameraAccessExceptionCompat(10001, th2);
    }

    @Override // u.m, u.j.b
    public void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f52806a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // u.m, u.j.b
    public CameraCharacteristics b(String str) {
        try {
            return super.b(str);
        } catch (RuntimeException e11) {
            if (i(e11)) {
                k(e11);
            }
            throw e11;
        }
    }

    @Override // u.m, u.j.b
    public void c(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f52806a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.c(e11);
        } catch (IllegalArgumentException e12) {
            throw e12;
        } catch (SecurityException e13) {
        } catch (RuntimeException e14) {
            if (i(e14)) {
                k(e14);
            }
            throw e14;
        }
    }

    @Override // u.m, u.j.b
    public void e(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f52806a.unregisterAvailabilityCallback(availabilityCallback);
    }
}