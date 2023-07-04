package org.godotengine.godot.utils;

import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* loaded from: classes5.dex */
public class GLUtils {
    public static final boolean DEBUG = false;
    private static final String TAG = "GLUtils";
    public static boolean use_32 = false;
    public static boolean use_debug_opengl = false;
    public static boolean use_gl3 = false;
    private static final String[] ATTRIBUTES_NAMES = {"EGL_BUFFER_SIZE", "EGL_ALPHA_SIZE", "EGL_BLUE_SIZE", "EGL_GREEN_SIZE", "EGL_RED_SIZE", "EGL_DEPTH_SIZE", "EGL_STENCIL_SIZE", "EGL_CONFIG_CAVEAT", "EGL_CONFIG_ID", "EGL_LEVEL", "EGL_MAX_PBUFFER_HEIGHT", "EGL_MAX_PBUFFER_PIXELS", "EGL_MAX_PBUFFER_WIDTH", "EGL_NATIVE_RENDERABLE", "EGL_NATIVE_VISUAL_ID", "EGL_NATIVE_VISUAL_TYPE", "EGL_PRESERVED_RESOURCES", "EGL_SAMPLES", "EGL_SAMPLE_BUFFERS", "EGL_SURFACE_TYPE", "EGL_TRANSPARENT_TYPE", "EGL_TRANSPARENT_RED_VALUE", "EGL_TRANSPARENT_GREEN_VALUE", "EGL_TRANSPARENT_BLUE_VALUE", "EGL_BIND_TO_TEXTURE_RGB", "EGL_BIND_TO_TEXTURE_RGBA", "EGL_MIN_SWAP_INTERVAL", "EGL_MAX_SWAP_INTERVAL", "EGL_LUMINANCE_SIZE", "EGL_ALPHA_MASK_SIZE", "EGL_COLOR_BUFFER_TYPE", "EGL_RENDERABLE_TYPE", "EGL_CONFORMANT"};
    private static final int[] ATTRIBUTES = {12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354};

    private GLUtils() {
    }

    public static void checkEglError(String str, String str2, EGL10 egl10) {
        while (true) {
            int eglGetError = egl10.eglGetError();
            if (eglGetError == 12288) {
                return;
            }
            Log.e(str, String.format("%s: EGL error: 0x%x", str2, Integer.valueOf(eglGetError)));
        }
    }

    private static void printConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        int[] iArr = new int[1];
        int i11 = 0;
        while (true) {
            int[] iArr2 = ATTRIBUTES;
            if (i11 >= iArr2.length) {
                return;
            }
            int i12 = iArr2[i11];
            String str = ATTRIBUTES_NAMES[i11];
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i12, iArr)) {
                Log.i(TAG, String.format("  %s: %d\n", str, Integer.valueOf(iArr[0])));
            } else {
                do {
                } while (egl10.eglGetError() != 12288);
            }
            i11++;
        }
    }

    public static void printConfigs(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        int length = eGLConfigArr.length;
        Log.v(TAG, String.format("%d configurations", Integer.valueOf(length)));
        for (int i11 = 0; i11 < length; i11++) {
            Log.v(TAG, String.format("Configuration %d:\n", Integer.valueOf(i11)));
            printConfig(egl10, eGLDisplay, eGLConfigArr[i11]);
        }
    }
}