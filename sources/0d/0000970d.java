package org.godotengine.godot.xr.regular;

import android.opengl.GLSurfaceView;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import org.godotengine.godot.GodotLib;
import org.godotengine.godot.utils.GLUtils;

/* loaded from: classes5.dex */
public class RegularContextFactory implements GLSurfaceView.EGLContextFactory {
    private static final int _EGL_CONTEXT_FLAGS_KHR = 12540;
    private static final int _EGL_CONTEXT_OPENGL_DEBUG_BIT_KHR = 1;
    private static final String TAG = RegularContextFactory.class.getSimpleName();
    private static int EGL_CONTEXT_CLIENT_VERSION = 12440;

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eglCreateContext;
        String global = GodotLib.getGlobal("rendering/quality/driver/driver_name");
        Boolean valueOf = Boolean.valueOf(GodotLib.getGlobal("rendering/quality/driver/upgrade_to_gles3").equals("True"));
        if (GLUtils.use_gl3 && !global.equals("GLES3")) {
            GLUtils.use_gl3 = false;
        }
        if (!GLUtils.use_gl3 && !valueOf.booleanValue()) {
            Log.w(TAG, "creating OpenGL ES 2.0 context :");
        } else if (valueOf.booleanValue()) {
            Log.w(TAG, "creating OpenGL ES 3.0 context for GLES2 driver (rendering/quality/driver/upgrade_to_gles3 is set):");
        } else {
            Log.w(TAG, "creating OpenGL ES 2.0 context :");
        }
        GLUtils.checkEglError(TAG, "Before eglCreateContext", egl10);
        EGLContext eGLContext = null;
        if (GLUtils.use_debug_opengl) {
            int i11 = EGL_CONTEXT_CLIENT_VERSION;
            int[] iArr = {i11, 2, _EGL_CONTEXT_FLAGS_KHR, 1, 12344};
            int[] iArr2 = {i11, 3, _EGL_CONTEXT_FLAGS_KHR, 1, 12344};
            EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
            if (GLUtils.use_gl3) {
                iArr = iArr2;
            }
            eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext2, iArr);
        } else {
            int i12 = EGL_CONTEXT_CLIENT_VERSION;
            int[] iArr3 = {i12, 2, 12344};
            int[] iArr4 = {i12, 3, 12344};
            if (GLUtils.use_gl3 || valueOf.booleanValue()) {
                try {
                    eGLContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr4);
                } catch (Exception unused) {
                    if (valueOf.booleanValue()) {
                        Log.w(TAG, "Failed to create GLES3 context (error thrown) as requested with rendering/quality/driver/upgrade_to_gles3 option; falling back to GLES2");
                    }
                }
                if (eGLContext == null && valueOf.booleanValue()) {
                    Log.w(TAG, "Failed to create GLES3 context as requested with rendering/quality/driver/upgrade_to_gles3 option; falling back to GLES2");
                }
            }
            eglCreateContext = (eGLContext != null || GLUtils.use_gl3) ? eGLContext : egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr3);
        }
        GLUtils.checkEglError(TAG, "After eglCreateContext", egl10);
        return eglCreateContext;
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory
    public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        egl10.eglDestroyContext(eGLDisplay, eGLContext);
    }
}