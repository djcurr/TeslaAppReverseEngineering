package o30;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes5.dex */
public class d implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    private EGL10 f42208a;

    /* renamed from: b  reason: collision with root package name */
    private EGLDisplay f42209b;

    /* renamed from: c  reason: collision with root package name */
    private EGLContext f42210c;

    /* renamed from: d  reason: collision with root package name */
    private EGLSurface f42211d;

    /* renamed from: e  reason: collision with root package name */
    private SurfaceTexture f42212e;

    /* renamed from: f  reason: collision with root package name */
    private Surface f42213f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f42214g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f42215h;

    /* renamed from: i  reason: collision with root package name */
    private f f42216i;

    /* renamed from: j  reason: collision with root package name */
    private int f42217j;

    /* renamed from: k  reason: collision with root package name */
    private int f42218k;

    /* renamed from: l  reason: collision with root package name */
    private int f42219l;

    /* renamed from: m  reason: collision with root package name */
    private ByteBuffer f42220m;

    public d(int i11, int i12, int i13) {
        this.f42209b = null;
        this.f42210c = null;
        this.f42211d = null;
        this.f42214g = new Object();
        this.f42219l = 0;
        if (i11 > 0 && i12 > 0) {
            this.f42217j = i11;
            this.f42218k = i12;
            this.f42219l = i13;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i11 * i12 * 4);
            this.f42220m = allocateDirect;
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            d(i11, i12);
            g();
            i();
            return;
        }
        throw new IllegalArgumentException();
    }

    private void b(String str) {
        if (this.f42208a.eglGetError() != 12288) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    private void d(int i11, int i12) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f42208a = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f42209b = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (!this.f42208a.eglInitialize(eglGetDisplay, null)) {
                this.f42209b = null;
                throw new RuntimeException("unable to initialize EGL10");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (this.f42208a.eglChooseConfig(this.f42209b, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12339, 1, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
                this.f42210c = this.f42208a.eglCreateContext(this.f42209b, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                b("eglCreateContext");
                if (this.f42210c != null) {
                    this.f42211d = this.f42208a.eglCreatePbufferSurface(this.f42209b, eGLConfigArr[0], new int[]{12375, i11, 12374, i12, 12344});
                    b("eglCreatePbufferSurface");
                    if (this.f42211d == null) {
                        throw new RuntimeException("surface was null");
                    }
                    return;
                }
                throw new RuntimeException("null context");
            }
            throw new RuntimeException("unable to find RGB888+pbuffer EGL config");
        }
        throw new RuntimeException("unable to get EGL10 display");
    }

    private void i() {
        f fVar = new f(this.f42219l);
        this.f42216i = fVar;
        fVar.f();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f42216i.d());
        this.f42212e = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f42213f = new Surface(this.f42212e);
    }

    public void a() {
        synchronized (this.f42214g) {
            while (!this.f42215h) {
                try {
                    this.f42214g.wait(5000L);
                    if (!this.f42215h) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f42215h = false;
        }
        this.f42216i.a("before updateTexImage");
        this.f42212e.updateTexImage();
    }

    public void c(boolean z11) {
        this.f42216i.c(this.f42212e, z11);
    }

    public ByteBuffer e() {
        this.f42220m.rewind();
        GLES20.glReadPixels(0, 0, this.f42217j, this.f42218k, 6408, 5121, this.f42220m);
        return this.f42220m;
    }

    public Surface f() {
        return this.f42213f;
    }

    public void g() {
        if (this.f42208a != null) {
            b("before makeCurrent");
            EGL10 egl10 = this.f42208a;
            EGLDisplay eGLDisplay = this.f42209b;
            EGLSurface eGLSurface = this.f42211d;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f42210c)) {
                throw new RuntimeException("eglMakeCurrent failed");
            }
            return;
        }
        throw new RuntimeException("not configured for makeCurrent");
    }

    public void h() {
        EGL10 egl10 = this.f42208a;
        if (egl10 != null) {
            if (egl10.eglGetCurrentContext().equals(this.f42210c)) {
                EGL10 egl102 = this.f42208a;
                EGLDisplay eGLDisplay = this.f42209b;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            this.f42208a.eglDestroySurface(this.f42209b, this.f42211d);
            this.f42208a.eglDestroyContext(this.f42209b, this.f42210c);
        }
        this.f42213f.release();
        this.f42209b = null;
        this.f42210c = null;
        this.f42211d = null;
        this.f42208a = null;
        this.f42216i = null;
        this.f42213f = null;
        this.f42212e = null;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f42214g) {
            if (!this.f42215h) {
                this.f42215h = true;
                this.f42214g.notifyAll();
            } else {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
        }
    }

    public d() {
        this.f42209b = null;
        this.f42210c = null;
        this.f42211d = null;
        this.f42214g = new Object();
        this.f42219l = 0;
        i();
    }
}