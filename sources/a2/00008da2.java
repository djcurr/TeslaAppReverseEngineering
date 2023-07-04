package o30;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import java.util.Objects;
import org.webrtc.EglBase;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private EGLDisplay f42190a;

    /* renamed from: b  reason: collision with root package name */
    private EGLContext f42191b;

    /* renamed from: c  reason: collision with root package name */
    private EGLSurface f42192c;

    /* renamed from: d  reason: collision with root package name */
    private Surface f42193d;

    public a(Surface surface) {
        Objects.requireNonNull(surface);
        this.f42193d = surface;
        b();
    }

    private void a(String str) {
        boolean z11 = false;
        while (EGL14.eglGetError() != 12288) {
            z11 = true;
        }
        if (z11) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    private void b() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f42190a = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                this.f42190a = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(this.f42190a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                this.f42191b = EGL14.eglCreateContext(this.f42190a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                a("eglCreateContext");
                if (this.f42191b != null) {
                    this.f42192c = EGL14.eglCreateWindowSurface(this.f42190a, eGLConfigArr[0], this.f42193d, new int[]{12344}, 0);
                    a("eglCreateWindowSurface");
                    if (this.f42192c == null) {
                        throw new RuntimeException("surface was null");
                    }
                    return;
                }
                throw new RuntimeException("null context");
            }
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    public void c() {
        EGLDisplay eGLDisplay = this.f42190a;
        EGLSurface eGLSurface = this.f42192c;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f42191b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void d() {
        if (EGL14.eglGetCurrentContext().equals(this.f42191b)) {
            EGLDisplay eGLDisplay = this.f42190a;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.f42190a, this.f42192c);
        EGL14.eglDestroyContext(this.f42190a, this.f42191b);
        this.f42193d.release();
        this.f42190a = null;
        this.f42191b = null;
        this.f42192c = null;
        this.f42193d = null;
    }

    public void e(long j11) {
        EGLExt.eglPresentationTimeANDROID(this.f42190a, this.f42192c, j11);
    }

    public boolean f() {
        return EGL14.eglSwapBuffers(this.f42190a, this.f42192c);
    }
}