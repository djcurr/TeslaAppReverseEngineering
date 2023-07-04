package org.godotengine.godot.xr.ovr;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes5.dex */
public class OvrWindowSurfaceFactory implements GLSurfaceView.EGLWindowSurfaceFactory {
    private static final int[] SURFACE_ATTRIBS = {12375, 16, 12374, 16, 12344};

    @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
    public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        return egl10.eglCreatePbufferSurface(eGLDisplay, eGLConfig, SURFACE_ATTRIBS);
    }

    @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
    public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        egl10.eglDestroySurface(eGLDisplay, eGLSurface);
    }
}