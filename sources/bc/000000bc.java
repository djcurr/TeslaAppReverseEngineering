package ak;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;

/* loaded from: classes3.dex */
public final class i {
    public static void a() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                return;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            o.c("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
        }
    }

    public static boolean b(Context context) {
        String eglQueryString;
        int i11 = k0.f477a;
        if (i11 < 24) {
            return false;
        }
        if (i11 >= 26 || !("samsung".equals(k0.f479c) || "XT1650".equals(k0.f480d))) {
            return (i11 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean c() {
        String eglQueryString;
        return k0.f477a >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }
}