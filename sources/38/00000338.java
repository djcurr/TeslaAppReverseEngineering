package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class CameraValidator {

    /* loaded from: classes.dex */
    public static class CameraIdListIncorrectException extends Exception {
        public CameraIdListIncorrectException(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public static void a(Context context, v vVar, z.e eVar) {
        Integer d11;
        if (eVar != null) {
            try {
                d11 = eVar.d();
                if (d11 == null) {
                    androidx.camera.core.n0.m("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e11) {
                androidx.camera.core.n0.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e11);
                return;
            }
        } else {
            d11 = null;
        }
        androidx.camera.core.n0.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + d11);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (eVar == null || d11.intValue() == 1)) {
                z.e.f59945c.e(vVar.d());
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (eVar == null || d11.intValue() == 0) {
                    z.e.f59944b.e(vVar.d());
                }
            }
        } catch (IllegalArgumentException e12) {
            androidx.camera.core.n0.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + vVar.d());
            throw new CameraIdListIncorrectException("Expected camera missing from device.", e12);
        }
    }
}